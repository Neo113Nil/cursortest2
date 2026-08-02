package defpackage;

import android.net.Uri;
import com.connectsdk.etc.helper.HttpMessage;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class qoj extends lq2 implements k6e {
    public final ds3 e;
    public final j6e f;
    public final String g;
    public final cp3 h;
    public final j6e i;
    public nb7 j;
    public l3o k;
    public InputStream l;
    public boolean m;
    public long n;
    public long o;

    static {
        ynh.a("media3.datasource.okhttp");
    }

    public qoj(ds3 ds3Var, String str, cp3 cp3Var, j6e j6eVar) {
        super(true);
        ds3Var.getClass();
        this.e = ds3Var;
        this.g = str;
        this.h = cp3Var;
        this.i = j6eVar;
        this.f = new j6e(0);
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        u7e u7eVar;
        long j;
        b0o b0oVar;
        hb7 hb7Var;
        g0o g0oVar;
        this.j = nb7Var;
        this.o = 0L;
        this.n = 0L;
        f(nb7Var);
        long j2 = nb7Var.f;
        int i = nb7Var.c;
        long j3 = nb7Var.g;
        String uri = nb7Var.a.toString();
        uri.getClass();
        try {
            s7e s7eVar = new s7e();
            s7eVar.h(null, uri);
            u7eVar = s7eVar.e();
        } catch (IllegalArgumentException unused) {
            u7eVar = null;
        }
        if (u7eVar == null) {
            throw new g6e("Malformed URL", nb7Var, 1004, 1);
        }
        b0o b0oVar2 = new b0o();
        b0oVar2.a = u7eVar;
        cp3 cp3Var = this.h;
        if (cp3Var != null) {
            b0oVar2.c(cp3Var);
        }
        HashMap hashMap = new HashMap();
        j6e j6eVar = this.i;
        if (j6eVar != null) {
            hashMap.putAll(j6eVar.g());
        }
        hashMap.putAll(this.f.g());
        hashMap.putAll(nb7Var.e);
        for (Map.Entry entry : hashMap.entrySet()) {
            b0oVar2.d((String) entry.getKey(), (String) entry.getValue());
        }
        String a = z7e.a(j2, j3);
        if (a != null) {
            b0oVar2.a("Range", a);
        }
        String str = this.g;
        if (str != null) {
            b0oVar2.a(HttpMessage.USER_AGENT, str);
        }
        if (!nb7Var.c(1)) {
            b0oVar2.a("Accept-Encoding", "identity");
        }
        byte[] bArr = nb7Var.d;
        if (bArr != null) {
            int length = bArr.length;
            j = 0;
            b0oVar = b0oVar2;
            cvt.c(bArr.length, 0, length);
            g0oVar = new g0o(null, length, bArr);
            hb7Var = null;
        } else {
            j = 0;
            b0oVar = b0oVar2;
            if (i == 2) {
                byte[] bArr2 = dvt.c;
                bArr2.getClass();
                int length2 = bArr2.length;
                cvt.c(bArr2.length, 0, length2);
                hb7Var = null;
                g0oVar = new g0o(null, length2, bArr2);
            } else {
                hb7Var = null;
                g0oVar = null;
            }
        }
        b0o b0oVar3 = b0oVar;
        b0oVar3.e(nb7.b(i), g0oVar);
        es3 b = this.e.b(b0oVar3.b());
        try {
            xop xopVar = new xop();
            b.z(new oz1(2, xopVar));
            try {
                l3o l3oVar = (l3o) xopVar.get();
                this.k = l3oVar;
                o3o o3oVar = l3oVar.g;
                o3oVar.getClass();
                this.l = o3oVar.z().E0();
                int i2 = l3oVar.d;
                if (!l3oVar.b()) {
                    if (i2 == 416 && j2 == z7e.b(l3oVar.f.a("Content-Range"))) {
                        this.m = true;
                        g(nb7Var);
                        return j3 != -1 ? j3 : j;
                    }
                    try {
                        InputStream inputStream = this.l;
                        inputStream.getClass();
                        zm3.b(inputStream);
                    } catch (IOException unused2) {
                        int i3 = dvt.a;
                    }
                    TreeMap o = l3oVar.f.o();
                    i();
                    throw new i6e(i2, i2 == 416 ? new hb7(2008) : hb7Var, o, nb7Var);
                }
                o3oVar.o();
                long j4 = (i2 != 200 || j2 == j) ? j : j2;
                if (j3 != -1) {
                    this.n = j3;
                } else {
                    long g = o3oVar.g();
                    this.n = g != -1 ? g - j4 : -1L;
                }
                this.m = true;
                g(nb7Var);
                try {
                    j(j4, nb7Var);
                    return this.n;
                } catch (g6e e) {
                    i();
                    throw e;
                }
            } catch (InterruptedException unused3) {
                b.cancel();
                throw new InterruptedIOException();
            } catch (ExecutionException e2) {
                throw new IOException(e2);
            }
        } catch (IOException e3) {
            throw g6e.a(e3, nb7Var, 1);
        }
    }

    @Override // defpackage.db7
    public final Map b() {
        l3o l3oVar = this.k;
        return l3oVar == null ? Collections.EMPTY_MAP : l3oVar.f.o();
    }

    @Override // defpackage.db7
    public final void close() {
        if (this.m) {
            this.m = false;
            d();
            i();
        }
        this.k = null;
        this.j = null;
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        l3o l3oVar = this.k;
        if (l3oVar != null) {
            return Uri.parse(l3oVar.a.a.i);
        }
        nb7 nb7Var = this.j;
        if (nb7Var != null) {
            return nb7Var.a;
        }
        return null;
    }

    public final void i() {
        l3o l3oVar = this.k;
        if (l3oVar != null) {
            o3o o3oVar = l3oVar.g;
            o3oVar.getClass();
            o3oVar.close();
        }
        this.l = null;
    }

    public final void j(long j, nb7 nb7Var) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            try {
                int min = (int) Math.min(j, 4096);
                InputStream inputStream = this.l;
                int i = dvt.a;
                int read = inputStream.read(bArr, 0, min);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (read == -1) {
                    throw new g6e(nb7Var, 2008, 1);
                }
                j -= read;
                c(read);
            } catch (IOException e) {
                if (!(e instanceof g6e)) {
                    throw new g6e(nb7Var, 2000, 1);
                }
                throw ((g6e) e);
            }
        }
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.n;
            if (j != -1) {
                long j2 = j - this.o;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.l;
            int i3 = dvt.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.o += read;
                c(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            nb7 nb7Var = this.j;
            int i4 = dvt.a;
            throw g6e.a(e, nb7Var, 2);
        }
    }
}
