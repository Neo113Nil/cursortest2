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
    public BufferedWriter f39988B;

    /* renamed from: D, reason: collision with root package name */
    public int f39990D;

    /* renamed from: n, reason: collision with root package name */
    public final File f39994n;

    /* renamed from: u, reason: collision with root package name */
    public final File f39995u;

    /* renamed from: v, reason: collision with root package name */
    public final File f39996v;

    /* renamed from: w, reason: collision with root package name */
    public final File f39997w;

    /* renamed from: y, reason: collision with root package name */
    public final long f39999y;

    /* renamed from: A, reason: collision with root package name */
    public long f39987A = 0;

    /* renamed from: C, reason: collision with root package name */
    public final LinkedHashMap f39989C = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: E, reason: collision with root package name */
    public long f39991E = 0;

    /* renamed from: F, reason: collision with root package name */
    public final ThreadPoolExecutor f39992F = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC4867a());

    /* renamed from: G, reason: collision with root package name */
    public final w f39993G = new w(1, this);

    /* renamed from: x, reason: collision with root package name */
    public final int f39998x = 1;

    /* renamed from: z, reason: collision with root package name */
    public final int f40000z = 1;

    public c(File file, long j6) {
        this.f39994n = file;
        this.f39995u = new File(file, "journal");
        this.f39996v = new File(file, "journal.tmp");
        this.f39997w = new File(file, "journal.bkp");
        this.f39999y = j6;
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
        if (cVar.f39995u.exists()) {
            try {
                cVar.C();
                cVar.B();
                return cVar;
            } catch (IOException e9) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e9.getMessage() + ", removing");
                cVar.close();
                e.a(cVar.f39994n);
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
            if (bVar.f39985f != oVar) {
                throw new IllegalStateException();
            }
            if (z3 && !bVar.f39984e) {
                for (int i = 0; i < cVar.f40000z; i++) {
                    if (!((boolean[]) oVar.f23465v)[i]) {
                        oVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!bVar.f39983d[i].exists()) {
                        oVar.a();
                        return;
                    }
                }
            }
            for (int i6 = 0; i6 < cVar.f40000z; i6++) {
                File file = bVar.f39983d[i6];
                if (!z3) {
                    i(file);
                } else if (file.exists()) {
                    File file2 = bVar.f39982c[i6];
                    file.renameTo(file2);
                    long j6 = bVar.f39981b[i6];
                    long length = file2.length();
                    bVar.f39981b[i6] = length;
                    cVar.f39987A = (cVar.f39987A - j6) + length;
                }
            }
            cVar.f39990D++;
            bVar.f39985f = null;
            if (bVar.f39984e || z3) {
                bVar.f39984e = true;
                cVar.f39988B.append((CharSequence) "CLEAN");
                cVar.f39988B.append(' ');
                cVar.f39988B.append((CharSequence) bVar.f39980a);
                cVar.f39988B.append((CharSequence) bVar.a());
                cVar.f39988B.append('\n');
                if (z3) {
                    cVar.f39991E++;
                }
            } else {
                cVar.f39989C.remove(bVar.f39980a);
                cVar.f39988B.append((CharSequence) "REMOVE");
                cVar.f39988B.append(' ');
                cVar.f39988B.append((CharSequence) bVar.f39980a);
                cVar.f39988B.append('\n');
            }
            k(cVar.f39988B);
            if (cVar.f39987A > cVar.f39999y || cVar.z()) {
                cVar.f39992F.submit(cVar.f39993G);
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
        i(this.f39996v);
        Iterator it = this.f39989C.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            o oVar = bVar.f39985f;
            int i = this.f40000z;
            int i6 = 0;
            if (oVar == null) {
                while (i6 < i) {
                    this.f39987A += bVar.f39981b[i6];
                    i6++;
                }
            } else {
                bVar.f39985f = null;
                while (i6 < i) {
                    i(bVar.f39982c[i6]);
                    i(bVar.f39983d[i6]);
                    i6++;
                }
                it.remove();
            }
        }
    }

    public final void C() {
        File file = this.f39995u;
        d dVar = new d(new FileInputStream(file), e.f40006a);
        try {
            String b9 = dVar.b();
            String b10 = dVar.b();
            String b11 = dVar.b();
            String b12 = dVar.b();
            String b13 = dVar.b();
            if (!"libcore.io.DiskLruCache".equals(b9) || !"1".equals(b10) || !Integer.toString(this.f39998x).equals(b11) || !Integer.toString(this.f40000z).equals(b12) || !"".equals(b13)) {
                throw new IOException("unexpected journal header: [" + b9 + ", " + b10 + ", " + b12 + ", " + b13 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    D(dVar.b());
                    i++;
                } catch (EOFException unused) {
                    this.f39990D = i - this.f39989C.size();
                    if (dVar.f40005x == -1) {
                        E();
                    } else {
                        this.f39988B = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), e.f40006a));
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
        LinkedHashMap linkedHashMap = this.f39989C;
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
                bVar.f39985f = new o(this, bVar);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] split = str.substring(indexOf2 + 1).split(" ");
        bVar.f39984e = true;
        bVar.f39985f = null;
        if (split.length != bVar.f39986g.f40000z) {
            throw new IOException("unexpected journal line: " + Arrays.toString(split));
        }
        for (int i6 = 0; i6 < split.length; i6++) {
            try {
                bVar.f39981b[i6] = Long.parseLong(split[i6]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
        }
    }

    public final synchronized void E() {
        try {
            BufferedWriter bufferedWriter = this.f39988B;
            if (bufferedWriter != null) {
                b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f39996v), e.f40006a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f39998x));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f40000z));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (b bVar : this.f39989C.values()) {
                    if (bVar.f39985f != null) {
                        bufferedWriter2.write("DIRTY " + bVar.f39980a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + bVar.f39980a + bVar.a() + '\n');
                    }
                }
                b(bufferedWriter2);
                if (this.f39995u.exists()) {
                    F(this.f39995u, this.f39997w, true);
                }
                F(this.f39996v, this.f39995u, false);
                this.f39997w.delete();
                this.f39988B = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f39995u, true), e.f40006a));
            } catch (Throwable th) {
                b(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void G() {
        while (this.f39987A > this.f39999y) {
            String str = (String) ((Map.Entry) this.f39989C.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f39988B == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    b bVar = (b) this.f39989C.get(str);
                    if (bVar != null && bVar.f39985f == null) {
                        for (int i = 0; i < this.f40000z; i++) {
                            File file = bVar.f39982c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j6 = this.f39987A;
                            long[] jArr = bVar.f39981b;
                            this.f39987A = j6 - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f39990D++;
                        this.f39988B.append((CharSequence) "REMOVE");
                        this.f39988B.append(' ');
                        this.f39988B.append((CharSequence) str);
                        this.f39988B.append('\n');
                        this.f39989C.remove(str);
                        if (z()) {
                            this.f39992F.submit(this.f39993G);
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
            if (this.f39988B == null) {
                return;
            }
            Iterator it = new ArrayList(this.f39989C.values()).iterator();
            while (it.hasNext()) {
                o oVar = ((b) it.next()).f39985f;
                if (oVar != null) {
                    oVar.a();
                }
            }
            G();
            b(this.f39988B);
            this.f39988B = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final o j(String str) {
        synchronized (this) {
            try {
                if (this.f39988B == null) {
                    throw new IllegalStateException("cache is closed");
                }
                b bVar = (b) this.f39989C.get(str);
                if (bVar == null) {
                    bVar = new b(this, str);
                    this.f39989C.put(str, bVar);
                } else if (bVar.f39985f != null) {
                    return null;
                }
                o oVar = new o(this, bVar);
                bVar.f39985f = oVar;
                this.f39988B.append((CharSequence) "DIRTY");
                this.f39988B.append(' ');
                this.f39988B.append((CharSequence) str);
                this.f39988B.append('\n');
                k(this.f39988B);
                return oVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized F1.a l(String str) {
        if (this.f39988B == null) {
            throw new IllegalStateException("cache is closed");
        }
        b bVar = (b) this.f39989C.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.f39984e) {
            return null;
        }
        for (File file : bVar.f39982c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f39990D++;
        this.f39988B.append((CharSequence) "READ");
        this.f39988B.append(' ');
        this.f39988B.append((CharSequence) str);
        this.f39988B.append('\n');
        if (z()) {
            this.f39992F.submit(this.f39993G);
        }
        return new F1.a(27, bVar.f39982c);
    }

    public final boolean z() {
        int i = this.f39990D;
        return i >= 2000 && i >= this.f39989C.size();
    }
}
