package q1;

import B2.x;
import android.os.Build;
import android.os.StrictMode;
import com.bumptech.glide.manager.n;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c implements Closeable {

    /* renamed from: B, reason: collision with root package name */
    public BufferedWriter f39898B;

    /* renamed from: D, reason: collision with root package name */
    public int f39900D;

    /* renamed from: n, reason: collision with root package name */
    public final File f39904n;

    /* renamed from: u, reason: collision with root package name */
    public final File f39905u;

    /* renamed from: v, reason: collision with root package name */
    public final File f39906v;

    /* renamed from: w, reason: collision with root package name */
    public final File f39907w;

    /* renamed from: y, reason: collision with root package name */
    public final long f39909y;

    /* renamed from: A, reason: collision with root package name */
    public long f39897A = 0;

    /* renamed from: C, reason: collision with root package name */
    public final LinkedHashMap f39899C = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: E, reason: collision with root package name */
    public long f39901E = 0;

    /* renamed from: F, reason: collision with root package name */
    public final ThreadPoolExecutor f39902F = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC4872a());

    /* renamed from: G, reason: collision with root package name */
    public final x f39903G = new x(1, this);

    /* renamed from: x, reason: collision with root package name */
    public final int f39908x = 1;

    /* renamed from: z, reason: collision with root package name */
    public final int f39910z = 1;

    public c(File file, long j9) {
        this.f39904n = file;
        this.f39905u = new File(file, "journal");
        this.f39906v = new File(file, "journal.tmp");
        this.f39907w = new File(file, "journal.bkp");
        this.f39909y = j9;
    }

    public static c A(File file, long j9) {
        if (j9 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                F(file2, file3, false);
            }
        }
        c cVar = new c(file, j9);
        if (cVar.f39905u.exists()) {
            try {
                cVar.C();
                cVar.B();
                return cVar;
            } catch (IOException e6) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e6.getMessage() + ", removing");
                cVar.close();
                e.a(cVar.f39904n);
            }
        }
        file.mkdirs();
        c cVar2 = new c(file, j9);
        cVar2.E();
        return cVar2;
    }

    public static void F(File file, File file2, boolean z8) {
        if (z8) {
            g(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void a(c cVar, n nVar, boolean z8) {
        synchronized (cVar) {
            b bVar = (b) nVar.f23618u;
            if (bVar.f39895f != nVar) {
                throw new IllegalStateException();
            }
            if (z8 && !bVar.f39894e) {
                for (int i = 0; i < cVar.f39910z; i++) {
                    if (!((boolean[]) nVar.f23619v)[i]) {
                        nVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!bVar.f39893d[i].exists()) {
                        nVar.a();
                        return;
                    }
                }
            }
            for (int i4 = 0; i4 < cVar.f39910z; i4++) {
                File file = bVar.f39893d[i4];
                if (!z8) {
                    g(file);
                } else if (file.exists()) {
                    File file2 = bVar.f39892c[i4];
                    file.renameTo(file2);
                    long j9 = bVar.f39891b[i4];
                    long length = file2.length();
                    bVar.f39891b[i4] = length;
                    cVar.f39897A = (cVar.f39897A - j9) + length;
                }
            }
            cVar.f39900D++;
            bVar.f39895f = null;
            if (bVar.f39894e || z8) {
                bVar.f39894e = true;
                cVar.f39898B.append((CharSequence) "CLEAN");
                cVar.f39898B.append(' ');
                cVar.f39898B.append((CharSequence) bVar.f39890a);
                cVar.f39898B.append((CharSequence) bVar.a());
                cVar.f39898B.append('\n');
                if (z8) {
                    cVar.f39901E++;
                }
            } else {
                cVar.f39899C.remove(bVar.f39890a);
                cVar.f39898B.append((CharSequence) "REMOVE");
                cVar.f39898B.append(' ');
                cVar.f39898B.append((CharSequence) bVar.f39890a);
                cVar.f39898B.append('\n');
            }
            j(cVar.f39898B);
            if (cVar.f39897A > cVar.f39909y || cVar.z()) {
                cVar.f39902F.submit(cVar.f39903G);
            }
        }
    }

    public static void b(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void g(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void j(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void B() {
        g(this.f39906v);
        Iterator it = this.f39899C.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            n nVar = bVar.f39895f;
            int i = this.f39910z;
            int i4 = 0;
            if (nVar == null) {
                while (i4 < i) {
                    this.f39897A += bVar.f39891b[i4];
                    i4++;
                }
            } else {
                bVar.f39895f = null;
                while (i4 < i) {
                    g(bVar.f39892c[i4]);
                    g(bVar.f39893d[i4]);
                    i4++;
                }
                it.remove();
            }
        }
    }

    public final void C() {
        File file = this.f39905u;
        d dVar = new d(new FileInputStream(file), e.f39916a);
        try {
            String b9 = dVar.b();
            String b10 = dVar.b();
            String b11 = dVar.b();
            String b12 = dVar.b();
            String b13 = dVar.b();
            if (!"libcore.io.DiskLruCache".equals(b9) || !"1".equals(b10) || !Integer.toString(this.f39908x).equals(b11) || !Integer.toString(this.f39910z).equals(b12) || !"".equals(b13)) {
                throw new IOException("unexpected journal header: [" + b9 + ", " + b10 + ", " + b12 + ", " + b13 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    D(dVar.b());
                    i++;
                } catch (EOFException unused) {
                    this.f39900D = i - this.f39899C.size();
                    if (dVar.f39915x == -1) {
                        E();
                    } else {
                        this.f39898B = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), e.f39916a));
                    }
                    try {
                        dVar.close();
                        return;
                    } catch (RuntimeException e6) {
                        throw e6;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                dVar.close();
            } catch (RuntimeException e9) {
                throw e9;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void D(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f39899C;
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        b bVar = (b) linkedHashMap.get(substring);
        if (bVar == null) {
            bVar = new b(this, substring);
            linkedHashMap.put(substring, bVar);
        }
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f39895f = new n(this, bVar);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] split = str.substring(indexOf2 + 1).split(" ");
        bVar.f39894e = true;
        bVar.f39895f = null;
        if (split.length != bVar.f39896g.f39910z) {
            throw new IOException("unexpected journal line: " + Arrays.toString(split));
        }
        for (int i4 = 0; i4 < split.length; i4++) {
            try {
                bVar.f39891b[i4] = Long.parseLong(split[i4]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
        }
    }

    public final synchronized void E() {
        try {
            BufferedWriter bufferedWriter = this.f39898B;
            if (bufferedWriter != null) {
                b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f39906v), e.f39916a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f39908x));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f39910z));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (b bVar : this.f39899C.values()) {
                    if (bVar.f39895f != null) {
                        bufferedWriter2.write("DIRTY " + bVar.f39890a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + bVar.f39890a + bVar.a() + '\n');
                    }
                }
                b(bufferedWriter2);
                if (this.f39905u.exists()) {
                    F(this.f39905u, this.f39907w, true);
                }
                F(this.f39906v, this.f39905u, false);
                this.f39907w.delete();
                this.f39898B = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f39905u, true), e.f39916a));
            } catch (Throwable th) {
                b(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void G() {
        while (this.f39897A > this.f39909y) {
            String str = (String) ((Map.Entry) this.f39899C.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f39898B == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    b bVar = (b) this.f39899C.get(str);
                    if (bVar != null && bVar.f39895f == null) {
                        for (int i = 0; i < this.f39910z; i++) {
                            File file = bVar.f39892c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j9 = this.f39897A;
                            long[] jArr = bVar.f39891b;
                            this.f39897A = j9 - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f39900D++;
                        this.f39898B.append((CharSequence) "REMOVE");
                        this.f39898B.append(' ');
                        this.f39898B.append((CharSequence) str);
                        this.f39898B.append('\n');
                        this.f39899C.remove(str);
                        if (z()) {
                            this.f39902F.submit(this.f39903G);
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f39898B == null) {
                return;
            }
            Iterator it = new ArrayList(this.f39899C.values()).iterator();
            while (it.hasNext()) {
                n nVar = ((b) it.next()).f39895f;
                if (nVar != null) {
                    nVar.a();
                }
            }
            G();
            b(this.f39898B);
            this.f39898B = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final n i(String str) {
        synchronized (this) {
            try {
                if (this.f39898B == null) {
                    throw new IllegalStateException("cache is closed");
                }
                b bVar = (b) this.f39899C.get(str);
                if (bVar == null) {
                    bVar = new b(this, str);
                    this.f39899C.put(str, bVar);
                } else if (bVar.f39895f != null) {
                    return null;
                }
                n nVar = new n(this, bVar);
                bVar.f39895f = nVar;
                this.f39898B.append((CharSequence) "DIRTY");
                this.f39898B.append(' ');
                this.f39898B.append((CharSequence) str);
                this.f39898B.append('\n');
                j(this.f39898B);
                return nVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized h8.d k(String str) {
        if (this.f39898B == null) {
            throw new IllegalStateException("cache is closed");
        }
        b bVar = (b) this.f39899C.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.f39894e) {
            return null;
        }
        for (File file : bVar.f39892c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f39900D++;
        this.f39898B.append((CharSequence) "READ");
        this.f39898B.append(' ');
        this.f39898B.append((CharSequence) str);
        this.f39898B.append('\n');
        if (z()) {
            this.f39902F.submit(this.f39903G);
        }
        return new h8.d(5, bVar.f39892c);
    }

    public final boolean z() {
        int i = this.f39900D;
        return i >= 2000 && i >= this.f39899C.size();
    }
}
