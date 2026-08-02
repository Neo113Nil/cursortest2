package s1;

import E2.v;
import android.os.Build;
import android.os.StrictMode;
import com.bumptech.glide.manager.n;
import h.C4543G;
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
    public BufferedWriter f40290B;

    /* renamed from: D, reason: collision with root package name */
    public int f40292D;

    /* renamed from: n, reason: collision with root package name */
    public final File f40296n;

    /* renamed from: u, reason: collision with root package name */
    public final File f40297u;

    /* renamed from: v, reason: collision with root package name */
    public final File f40298v;

    /* renamed from: w, reason: collision with root package name */
    public final File f40299w;

    /* renamed from: y, reason: collision with root package name */
    public final long f40301y;

    /* renamed from: A, reason: collision with root package name */
    public long f40289A = 0;

    /* renamed from: C, reason: collision with root package name */
    public final LinkedHashMap f40291C = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: E, reason: collision with root package name */
    public long f40293E = 0;

    /* renamed from: F, reason: collision with root package name */
    public final ThreadPoolExecutor f40294F = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC4916a());

    /* renamed from: G, reason: collision with root package name */
    public final v f40295G = new v(1, this);

    /* renamed from: x, reason: collision with root package name */
    public final int f40300x = 1;

    /* renamed from: z, reason: collision with root package name */
    public final int f40302z = 1;

    public c(File file, long j6) {
        this.f40296n = file;
        this.f40297u = new File(file, "journal");
        this.f40298v = new File(file, "journal.tmp");
        this.f40299w = new File(file, "journal.bkp");
        this.f40301y = j6;
    }

    public static c A(File file, long j6) {
        if (j6 <= 0) {
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
        c cVar = new c(file, j6);
        if (cVar.f40297u.exists()) {
            try {
                cVar.C();
                cVar.B();
                return cVar;
            } catch (IOException e9) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e9.getMessage() + ", removing");
                cVar.close();
                e.a(cVar.f40296n);
            }
        }
        file.mkdirs();
        c cVar2 = new c(file, j6);
        cVar2.E();
        return cVar2;
    }

    public static void F(File file, File file2, boolean z6) {
        if (z6) {
            i(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void a(c cVar, n nVar, boolean z6) {
        synchronized (cVar) {
            b bVar = (b) nVar.f24249u;
            if (bVar.f40287f != nVar) {
                throw new IllegalStateException();
            }
            if (z6 && !bVar.f40286e) {
                for (int i = 0; i < cVar.f40302z; i++) {
                    if (!((boolean[]) nVar.f24250v)[i]) {
                        nVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!bVar.f40285d[i].exists()) {
                        nVar.a();
                        return;
                    }
                }
            }
            for (int i4 = 0; i4 < cVar.f40302z; i4++) {
                File file = bVar.f40285d[i4];
                if (!z6) {
                    i(file);
                } else if (file.exists()) {
                    File file2 = bVar.f40284c[i4];
                    file.renameTo(file2);
                    long j6 = bVar.f40283b[i4];
                    long length = file2.length();
                    bVar.f40283b[i4] = length;
                    cVar.f40289A = (cVar.f40289A - j6) + length;
                }
            }
            cVar.f40292D++;
            bVar.f40287f = null;
            if (bVar.f40286e || z6) {
                bVar.f40286e = true;
                cVar.f40290B.append((CharSequence) "CLEAN");
                cVar.f40290B.append(' ');
                cVar.f40290B.append((CharSequence) bVar.f40282a);
                cVar.f40290B.append((CharSequence) bVar.a());
                cVar.f40290B.append('\n');
                if (z6) {
                    cVar.f40293E++;
                }
            } else {
                cVar.f40291C.remove(bVar.f40282a);
                cVar.f40290B.append((CharSequence) "REMOVE");
                cVar.f40290B.append(' ');
                cVar.f40290B.append((CharSequence) bVar.f40282a);
                cVar.f40290B.append('\n');
            }
            k(cVar.f40290B);
            if (cVar.f40289A > cVar.f40301y || cVar.z()) {
                cVar.f40294F.submit(cVar.f40295G);
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

    public static void i(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void k(BufferedWriter bufferedWriter) {
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
        i(this.f40298v);
        Iterator it = this.f40291C.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            n nVar = bVar.f40287f;
            int i = this.f40302z;
            int i4 = 0;
            if (nVar == null) {
                while (i4 < i) {
                    this.f40289A += bVar.f40283b[i4];
                    i4++;
                }
            } else {
                bVar.f40287f = null;
                while (i4 < i) {
                    i(bVar.f40284c[i4]);
                    i(bVar.f40285d[i4]);
                    i4++;
                }
                it.remove();
            }
        }
    }

    public final void C() {
        File file = this.f40297u;
        d dVar = new d(new FileInputStream(file), e.f40308a);
        try {
            String b9 = dVar.b();
            String b10 = dVar.b();
            String b11 = dVar.b();
            String b12 = dVar.b();
            String b13 = dVar.b();
            if (!"libcore.io.DiskLruCache".equals(b9) || !"1".equals(b10) || !Integer.toString(this.f40300x).equals(b11) || !Integer.toString(this.f40302z).equals(b12) || !"".equals(b13)) {
                throw new IOException("unexpected journal header: [" + b9 + ", " + b10 + ", " + b12 + ", " + b13 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    D(dVar.b());
                    i++;
                } catch (EOFException unused) {
                    this.f40292D = i - this.f40291C.size();
                    if (dVar.f40307x == -1) {
                        E();
                    } else {
                        this.f40290B = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), e.f40308a));
                    }
                    try {
                        dVar.close();
                        return;
                    } catch (RuntimeException e9) {
                        throw e9;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                dVar.close();
            } catch (RuntimeException e10) {
                throw e10;
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
        LinkedHashMap linkedHashMap = this.f40291C;
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
                bVar.f40287f = new n(this, bVar);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] split = str.substring(indexOf2 + 1).split(" ");
        bVar.f40286e = true;
        bVar.f40287f = null;
        if (split.length != bVar.f40288g.f40302z) {
            throw new IOException("unexpected journal line: " + Arrays.toString(split));
        }
        for (int i4 = 0; i4 < split.length; i4++) {
            try {
                bVar.f40283b[i4] = Long.parseLong(split[i4]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
        }
    }

    public final synchronized void E() {
        try {
            BufferedWriter bufferedWriter = this.f40290B;
            if (bufferedWriter != null) {
                b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f40298v), e.f40308a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f40300x));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f40302z));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (b bVar : this.f40291C.values()) {
                    if (bVar.f40287f != null) {
                        bufferedWriter2.write("DIRTY " + bVar.f40282a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + bVar.f40282a + bVar.a() + '\n');
                    }
                }
                b(bufferedWriter2);
                if (this.f40297u.exists()) {
                    F(this.f40297u, this.f40299w, true);
                }
                F(this.f40298v, this.f40297u, false);
                this.f40299w.delete();
                this.f40290B = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f40297u, true), e.f40308a));
            } catch (Throwable th) {
                b(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void G() {
        while (this.f40289A > this.f40301y) {
            String str = (String) ((Map.Entry) this.f40291C.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f40290B == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    b bVar = (b) this.f40291C.get(str);
                    if (bVar != null && bVar.f40287f == null) {
                        for (int i = 0; i < this.f40302z; i++) {
                            File file = bVar.f40284c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j6 = this.f40289A;
                            long[] jArr = bVar.f40283b;
                            this.f40289A = j6 - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f40292D++;
                        this.f40290B.append((CharSequence) "REMOVE");
                        this.f40290B.append(' ');
                        this.f40290B.append((CharSequence) str);
                        this.f40290B.append('\n');
                        this.f40291C.remove(str);
                        if (z()) {
                            this.f40294F.submit(this.f40295G);
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
            if (this.f40290B == null) {
                return;
            }
            Iterator it = new ArrayList(this.f40291C.values()).iterator();
            while (it.hasNext()) {
                n nVar = ((b) it.next()).f40287f;
                if (nVar != null) {
                    nVar.a();
                }
            }
            G();
            b(this.f40290B);
            this.f40290B = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final n j(String str) {
        synchronized (this) {
            try {
                if (this.f40290B == null) {
                    throw new IllegalStateException("cache is closed");
                }
                b bVar = (b) this.f40291C.get(str);
                if (bVar == null) {
                    bVar = new b(this, str);
                    this.f40291C.put(str, bVar);
                } else if (bVar.f40287f != null) {
                    return null;
                }
                n nVar = new n(this, bVar);
                bVar.f40287f = nVar;
                this.f40290B.append((CharSequence) "DIRTY");
                this.f40290B.append(' ');
                this.f40290B.append((CharSequence) str);
                this.f40290B.append('\n');
                k(this.f40290B);
                return nVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized C4543G l(String str) {
        if (this.f40290B == null) {
            throw new IllegalStateException("cache is closed");
        }
        b bVar = (b) this.f40291C.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.f40286e) {
            return null;
        }
        for (File file : bVar.f40284c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f40292D++;
        this.f40290B.append((CharSequence) "READ");
        this.f40290B.append(' ');
        this.f40290B.append((CharSequence) str);
        this.f40290B.append('\n');
        if (z()) {
            this.f40294F.submit(this.f40295G);
        }
        return new C4543G(bVar.f40284c);
    }

    public final boolean z() {
        int i = this.f40292D;
        return i >= 2000 && i >= this.f40291C.size();
    }
}
