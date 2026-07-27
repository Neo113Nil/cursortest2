package com.anythink.basead.exoplayer.j.a;

import android.util.SparseArray;
import com.anythink.basead.exoplayer.j.a.a;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.x;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8077a = "cached_content_index.exi";

    /* renamed from: b, reason: collision with root package name */
    private static final int f8078b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final int f8079c = 1;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, g> f8080d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseArray<String> f8081e;

    /* renamed from: f, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.b f8082f;

    /* renamed from: g, reason: collision with root package name */
    private final Cipher f8083g;

    /* renamed from: h, reason: collision with root package name */
    private final SecretKeySpec f8084h;
    private final boolean i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8085j;

    /* renamed from: k, reason: collision with root package name */
    private x f8086k;

    private h(File file) {
        this(file, null);
    }

    private boolean f() {
        BufferedInputStream bufferedInputStream;
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(this.f8082f.c());
            dataInputStream = new DataInputStream(bufferedInputStream);
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            int readInt = dataInputStream.readInt();
            if (readInt >= 0 && readInt <= 2) {
                if ((dataInputStream.readInt() & 1) != 0) {
                    if (this.f8083g == null) {
                        af.a((Closeable) dataInputStream);
                        return false;
                    }
                    byte[] bArr = new byte[16];
                    dataInputStream.readFully(bArr);
                    try {
                        this.f8083g.init(2, this.f8084h, new IvParameterSpec(bArr));
                        dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f8083g));
                    } catch (InvalidAlgorithmParameterException e9) {
                        e = e9;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e10) {
                        e = e10;
                        throw new IllegalStateException(e);
                    }
                } else if (this.i) {
                    this.f8085j = true;
                }
                int readInt2 = dataInputStream.readInt();
                int i = 0;
                for (int i6 = 0; i6 < readInt2; i6++) {
                    g a9 = g.a(readInt, dataInputStream);
                    a(a9);
                    i += a9.a(readInt);
                }
                int readInt3 = dataInputStream.readInt();
                boolean z3 = dataInputStream.read() == -1;
                if (readInt3 == i && z3) {
                    af.a((Closeable) dataInputStream);
                    return true;
                }
                af.a((Closeable) dataInputStream);
                return false;
            }
            af.a((Closeable) dataInputStream);
            return false;
        } catch (IOException unused2) {
            dataInputStream2 = dataInputStream;
            if (dataInputStream2 != null) {
                af.a((Closeable) dataInputStream2);
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            dataInputStream2 = dataInputStream;
            if (dataInputStream2 != null) {
                af.a((Closeable) dataInputStream2);
            }
            throw th;
        }
    }

    private void g() {
        DataOutputStream dataOutputStream;
        Closeable closeable = null;
        try {
            try {
                OutputStream b9 = this.f8082f.b();
                x xVar = this.f8086k;
                if (xVar == null) {
                    this.f8086k = new x(b9);
                } else {
                    xVar.a(b9);
                }
                dataOutputStream = new DataOutputStream(this.f8086k);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e9) {
            e = e9;
        }
        try {
            dataOutputStream.writeInt(2);
            int i = 0;
            dataOutputStream.writeInt(this.i ? 1 : 0);
            if (this.i) {
                byte[] bArr = new byte[16];
                new Random().nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    this.f8083g.init(1, this.f8084h, new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(this.f8086k, this.f8083g));
                } catch (InvalidAlgorithmParameterException e10) {
                    e = e10;
                    throw new IllegalStateException(e);
                } catch (InvalidKeyException e11) {
                    e = e11;
                    throw new IllegalStateException(e);
                }
            }
            dataOutputStream.writeInt(this.f8080d.size());
            for (g gVar : this.f8080d.values()) {
                gVar.a(dataOutputStream);
                i += gVar.a(2);
            }
            dataOutputStream.writeInt(i);
            this.f8082f.a(dataOutputStream);
            af.a((Closeable) null);
        } catch (IOException e12) {
            e = e12;
            throw new a.C0034a(e);
        } catch (Throwable th2) {
            th = th2;
            closeable = dataOutputStream;
            af.a(closeable);
            throw th;
        }
    }

    private static Cipher h() {
        if (af.f8346a == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    public final void a() {
        com.anythink.basead.exoplayer.k.a.b(!this.f8085j);
        if (f()) {
            return;
        }
        this.f8082f.a();
        this.f8080d.clear();
        this.f8081e.clear();
    }

    public final void b() {
        DataOutputStream dataOutputStream;
        if (this.f8085j) {
            Closeable closeable = null;
            try {
                try {
                    OutputStream b9 = this.f8082f.b();
                    x xVar = this.f8086k;
                    if (xVar == null) {
                        this.f8086k = new x(b9);
                    } else {
                        xVar.a(b9);
                    }
                    dataOutputStream = new DataOutputStream(this.f8086k);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e9) {
                e = e9;
            }
            try {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.i ? 1 : 0);
                if (this.i) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.f8083g.init(1, this.f8084h, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(this.f8086k, this.f8083g));
                    } catch (InvalidAlgorithmParameterException e10) {
                        e = e10;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e11) {
                        e = e11;
                        throw new IllegalStateException(e);
                    }
                }
                dataOutputStream.writeInt(this.f8080d.size());
                int i = 0;
                for (g gVar : this.f8080d.values()) {
                    gVar.a(dataOutputStream);
                    i += gVar.a(2);
                }
                dataOutputStream.writeInt(i);
                this.f8082f.a(dataOutputStream);
                af.a((Closeable) null);
                this.f8085j = false;
            } catch (IOException e12) {
                e = e12;
                throw new a.C0034a(e);
            } catch (Throwable th2) {
                th = th2;
                closeable = dataOutputStream;
                af.a(closeable);
                throw th;
            }
        }
    }

    public final Collection<g> c() {
        return this.f8080d.values();
    }

    public final void d(String str) {
        g gVar = this.f8080d.get(str);
        if (gVar == null || !gVar.d() || gVar.b()) {
            return;
        }
        this.f8080d.remove(str);
        this.f8081e.remove(gVar.f8072a);
        this.f8085j = true;
    }

    public final Set<String> e() {
        return this.f8080d.keySet();
    }

    private h(File file, byte[] bArr) {
        this(file, bArr, bArr != null);
    }

    public final int c(String str) {
        return a(str).f8072a;
    }

    public final i e(String str) {
        g b9 = b(str);
        return b9 != null ? b9.a() : l.f8093b;
    }

    public h(File file, byte[] bArr, boolean z3) {
        this.i = z3;
        if (bArr != null) {
            com.anythink.basead.exoplayer.k.a.a(bArr.length == 16);
            try {
                this.f8083g = h();
                this.f8084h = new SecretKeySpec(bArr, "AES");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e9) {
                throw new IllegalStateException(e9);
            }
        } else {
            com.anythink.basead.exoplayer.k.a.b(!z3);
            this.f8083g = null;
            this.f8084h = null;
        }
        this.f8080d = new HashMap<>();
        this.f8081e = new SparseArray<>();
        this.f8082f = new com.anythink.basead.exoplayer.k.b(new File(file, f8077a));
    }

    public final g a(String str) {
        g gVar = this.f8080d.get(str);
        if (gVar != null) {
            return gVar;
        }
        SparseArray<String> sparseArray = this.f8081e;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        g gVar2 = new g(keyAt, str);
        a(gVar2);
        this.f8085j = true;
        return gVar2;
    }

    public final void d() {
        int size = this.f8080d.size();
        String[] strArr = new String[size];
        this.f8080d.keySet().toArray(strArr);
        for (int i = 0; i < size; i++) {
            d(strArr[i]);
        }
    }

    public final String a(int i) {
        return this.f8081e.get(i);
    }

    public final void a(String str, k kVar) {
        if (a(str).a(kVar)) {
            this.f8085j = true;
        }
    }

    private void a(g gVar) {
        this.f8080d.put(gVar.f8073b, gVar);
        this.f8081e.put(gVar.f8072a, gVar.f8073b);
    }

    private static int a(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt >= 0) {
            return keyAt;
        }
        while (i < size && i == sparseArray.keyAt(i)) {
            i++;
        }
        return i;
    }

    private g f(String str) {
        SparseArray<String> sparseArray = this.f8081e;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        g gVar = new g(keyAt, str);
        a(gVar);
        this.f8085j = true;
        return gVar;
    }

    public final g b(String str) {
        return this.f8080d.get(str);
    }
}
