package q1;

import C2.w;
import android.os.Build;
import android.os.StrictMode;
import com.bumptech.glide.manager.o;
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
    public BufferedWriter f39991B;

    /* renamed from: D, reason: collision with root package name */
    public int f39993D;

    /* renamed from: n, reason: collision with root package name */
    public final File f39997n;

    /* renamed from: u, reason: collision with root package name */
    public final File f39998u;

    /* renamed from: v, reason: collision with root package name */
    public final File f39999v;

    /* renamed from: w, reason: collision with root package name */
    public final File f40000w;

    /* renamed from: y, reason: collision with root package name */
    public final long f40002y;

    /* renamed from: A, reason: collision with root package name */
    public long f39990A = 0;

    /* renamed from: C, reason: collision with root package name */
    public final LinkedHashMap f39992C = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: E, reason: collision with root package name */
    public long f39994E = 0;

    /* renamed from: F, reason: collision with root package name */
    public final ThreadPoolExecutor f39995F = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC4867a());

    /* renamed from: G, reason: collision with root package name */
    public final w f39996G = new w(1, this);

    /* renamed from: x, reason: collision with root package name */
    public final int f40001x = 1;

    /* renamed from: z, reason: collision with root package name */
    public final int f40003z = 1;

    public c(File file, long j6) {
        this.f39997n = file;
        this.f39998u = new File(file, "journal");
        this.f39999v = new File(file, "journal.tmp");
        this.f40000w = new File(file, "journal.bkp");
        this.f40002y = j6;
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
        if (cVar.f39998u.exists()) {
            try {
                cVar.C();
                cVar.B();
                return cVar;
            } catch (IOException e9) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e9.getMessage() + ", removing");
                cVar.close();
                e.a(cVar.f39997n);
            }
        }
        file.mkdirs();
        c cVar2 = new c(file, j6);
        cVar2.E();
        return cVar2;
    }

    public static void F(File file, File file2, boolean z3) {
        if (z3) {
            i(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void a(c cVar, o oVar, boolean z3) {
        synchronized (cVar) {
            b bVar = (b) oVar.f23464u;
            if (bVar.f39988f != oVar) {
                throw new IllegalStateException();
            }
            if (z3 && !bVar.f39987e) {
                for (int i = 0; i < cVar.f40003z; i++) {
                    if (!((boolean[]) oVar.f23465v)[i]) {
                        oVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!bVar.f39986d[i].exists()) {
                        oVar.a();
                        return;
                    }
                }
            }
            for (int i6 = 0; i6 < cVar.f40003z; i6++) {
                File file = bVar.f39986d[i6];
                if (!z3) {
                    i(file);
                } else if (file.exists()) {
                    File file2 = bVar.f39985c[i6];
                    file.renameTo(file2);
                    long j6 = bVar.f39984b[i6];
                    long length = file2.length();
                    bVar.f39984b[i6] = length;
                    cVar.f39990A = (cVar.f39990A - j6) + length;
                }
            }
            cVar.f39993D++;
            bVar.f39988f = null;
            if (bVar.f39987e || z3) {
                bVar.f39987e = true;
                cVar.f39991B.append((CharSequence) "CLEAN");
                cVar.f39991B.append(' ');
                cVar.f39991B.append((CharSequence) bVar.f39983a);
                cVar.f39991B.append((CharSequence) bVar.a());
                cVar.f39991B.append('\n');
                if (z3) {
                    cVar.f39994E++;
                }
            } else {
                cVar.f39992C.remove(bVar.f39983a);
                cVar.f39991B.append((CharSequence) "REMOVE");
                cVar.f39991B.append(' ');
                cVar.f39991B.append((CharSequence) bVar.f39983a);
                cVar.f39991B.append('\n');
            }
            k(cVar.f39991B);
            if (cVar.f39990A > cVar.f40002y || cVar.z()) {
                cVar.f39995F.submit(cVar.f39996G);
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
        i(this.f39999v);
        Iterator it = this.f39992C.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            o oVar = bVar.f39988f;
            int i = this.f40003z;
            int i6 = 0;
            if (oVar == null) {
                while (i6 < i) {
                    this.f39990A += bVar.f39984b[i6];
                    i6++;
                }
            } else {
                bVar.f39988f = null;
                while (i6 < i) {
                    i(bVar.f39985c[i6]);
                    i(bVar.f39986d[i6]);
                    i6++;
                }
                it.remove();
            }
        }
    }

    public final void C() {
        File file = this.f39998u;
        d dVar = new d(new FileInputStream(file), e.f40009a);
        try {
            String b9 = dVar.b();
            String b10 = dVar.b();
            String b11 = dVar.b();
            String b12 = dVar.b();
            String b13 = dVar.b();
            if (!"libcore.io.DiskLruCache".equals(b9) || !"1".equals(b10) || !Integer.toString(this.f40001x).equals(b11) || !Integer.toString(this.f40003z).equals(b12) || !"".equals(b13)) {
                throw new IOException("unexpected journal header: [" + b9 + ", " + b10 + ", " + b12 + ", " + b13 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    D(dVar.b());
                    i++;
                } catch (EOFException unused) {
                    this.f39993D = i - this.f39992C.size();
                    if (dVar.f40008x == -1) {
                        E();
                    } else {
                        this.f39991B = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), e.f40009a));
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
        LinkedHashMap linkedHashMap = this.f39992C;
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
                bVar.f39988f = new o(this, bVar);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] split = str.substring(indexOf2 + 1).split(" ");
        bVar.f39987e = true;
        bVar.f39988f = null;
        if (split.length != bVar.f39989g.f40003z) {
            throw new IOException("unexpected journal line: " + Arrays.toString(split));
        }
        for (int i6 = 0; i6 < split.length; i6++) {
            try {
                bVar.f39984b[i6] = Long.parseLong(split[i6]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
        }
    }

    public final synchronized void E() {
        try {
            BufferedWriter bufferedWriter = this.f39991B;
            if (bufferedWriter != null) {
                b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f39999v), e.f40009a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f40001x));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f40003z));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (b bVar : this.f39992C.values()) {
                    if (bVar.f39988f != null) {
                        bufferedWriter2.write("DIRTY " + bVar.f39983a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + bVar.f39983a + bVar.a() + '\n');
                    }
                }
                b(bufferedWriter2);
                if (this.f39998u.exists()) {
                    F(this.f39998u, this.f40000w, true);
                }
                F(this.f39999v, this.f39998u, false);
                this.f40000w.delete();
                this.f39991B = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f39998u, true), e.f40009a));
            } catch (Throwable th) {
                b(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void G() {
        while (this.f39990A > this.f40002y) {
            String str = (String) ((Map.Entry) this.f39992C.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f39991B == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    b bVar = (b) this.f39992C.get(str);
                    if (bVar != null && bVar.f39988f == null) {
                        for (int i = 0; i < this.f40003z; i++) {
                            File file = bVar.f39985c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j6 = this.f39990A;
                            long[] jArr = bVar.f39984b;
                            this.f39990A = j6 - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f39993D++;
                        this.f39991B.append((CharSequence) "REMOVE");
                        this.f39991B.append(' ');
                        this.f39991B.append((CharSequence) str);
                        this.f39991B.append('\n');
                        this.f39992C.remove(str);
                        if (z()) {
                            this.f39995F.submit(this.f39996G);
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
            if (this.f39991B == null) {
                return;
            }
            Iterator it = new ArrayList(this.f39992C.values()).iterator();
            while (it.hasNext()) {
                o oVar = ((b) it.next()).f39988f;
                if (oVar != null) {
                    oVar.a();
                }
            }
            G();
            b(this.f39991B);
            this.f39991B = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final o j(String str) {
        synchronized (this) {
            try {
                if (this.f39991B == null) {
                    throw new IllegalStateException("cache is closed");
                }
                b bVar = (b) this.f39992C.get(str);
                if (bVar == null) {
                    bVar = new b(this, str);
                    this.f39992C.put(str, bVar);
                } else if (bVar.f39988f != null) {
                    return null;
                }
                o oVar = new o(this, bVar);
                bVar.f39988f = oVar;
                this.f39991B.append((CharSequence) "DIRTY");
                this.f39991B.append(' ');
                this.f39991B.append((CharSequence) str);
                this.f39991B.append('\n');
                k(this.f39991B);
                return oVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized F1.a l(String str) {
        if (this.f39991B == null) {
            throw new IllegalStateException("cache is closed");
        }
        b bVar = (b) this.f39992C.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.f39987e) {
            return null;
        }
        for (File file : bVar.f39985c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f39993D++;
        this.f39991B.append((CharSequence) "READ");
        this.f39991B.append(' ');
        this.f39991B.append((CharSequence) str);
        this.f39991B.append('\n');
        if (z()) {
            this.f39995F.submit(this.f39996G);
        }
        return new F1.a(27, bVar.f39985c);
    }

    public final boolean z() {
        int i = this.f39993D;
        return i >= 2000 && i >= this.f39992C.size();
    }
}
