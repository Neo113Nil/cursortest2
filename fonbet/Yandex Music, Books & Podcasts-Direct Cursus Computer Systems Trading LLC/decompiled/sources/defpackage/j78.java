package defpackage;

import android.os.Build;
import android.os.StrictMode;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
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
public final class j78 implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final long f;
    public BufferedWriter i;
    public int k;
    public long h = 0;
    public final LinkedHashMap j = new LinkedHashMap(0, 0.75f, true);
    public long l = 0;
    public final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a78());
    public final z68 n = new z68(0, this);
    public final int e = 1;
    public final int g = 1;

    public j78(File file, long j) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.f = j;
    }

    public static j78 I(File file, long j) {
        if (j <= 0) {
            xq0.x("maxSize <= 0");
            return null;
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                S(file2, file3, false);
            }
        }
        j78 j78Var = new j78(file, j);
        if (j78Var.b.exists()) {
            try {
                j78Var.P();
                j78Var.N();
                return j78Var;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                j78Var.close();
                wut.a(j78Var.a);
            }
        }
        file.mkdirs();
        j78 j78Var2 = new j78(file, j);
        j78Var2.R();
        return j78Var2;
    }

    public static void S(File file, File file2, boolean z) {
        if (z) {
            g(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void a(j78 j78Var, z0j z0jVar, boolean z) {
        synchronized (j78Var) {
            c78 c78Var = (c78) z0jVar.c;
            if (c78Var.f != z0jVar) {
                throw new IllegalStateException();
            }
            if (z && !c78Var.e) {
                for (int i = 0; i < j78Var.g; i++) {
                    if (!((boolean[]) z0jVar.d)[i]) {
                        z0jVar.l();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!c78Var.d[i].exists()) {
                        z0jVar.l();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < j78Var.g; i2++) {
                File file = c78Var.d[i2];
                if (!z) {
                    g(file);
                } else if (file.exists()) {
                    File file2 = c78Var.c[i2];
                    file.renameTo(file2);
                    long j = c78Var.b[i2];
                    long length = file2.length();
                    c78Var.b[i2] = length;
                    j78Var.h = (j78Var.h - j) + length;
                }
            }
            j78Var.k++;
            c78Var.f = null;
            if (c78Var.e || z) {
                c78Var.e = true;
                j78Var.i.append((CharSequence) "CLEAN");
                j78Var.i.append(' ');
                j78Var.i.append((CharSequence) c78Var.a);
                j78Var.i.append((CharSequence) c78Var.a());
                j78Var.i.append('\n');
                if (z) {
                    j78Var.l++;
                }
            } else {
                j78Var.j.remove(c78Var.a);
                j78Var.i.append((CharSequence) "REMOVE");
                j78Var.i.append(' ');
                j78Var.i.append((CharSequence) c78Var.a);
                j78Var.i.append('\n');
            }
            z(j78Var.i);
            if (j78Var.h > j78Var.f || j78Var.H()) {
                j78Var.m.submit(j78Var.n);
            }
        }
    }

    public static void b(BufferedWriter bufferedWriter) {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
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

    public static void z(BufferedWriter bufferedWriter) {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final synchronized efo D(String str) {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
        c78 c78Var = (c78) this.j.get(str);
        if (c78Var == null) {
            return null;
        }
        if (!c78Var.e) {
            return null;
        }
        for (File file : c78Var.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.k++;
        this.i.append((CharSequence) "READ");
        this.i.append(' ');
        this.i.append((CharSequence) str);
        this.i.append('\n');
        if (H()) {
            this.m.submit(this.n);
        }
        return new efo(24, c78Var.c);
    }

    public final boolean H() {
        int i = this.k;
        return i >= 2000 && i >= this.j.size();
    }

    public final void N() {
        g(this.c);
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            c78 c78Var = (c78) it.next();
            z0j z0jVar = c78Var.f;
            int i = this.g;
            int i2 = 0;
            if (z0jVar == null) {
                while (i2 < i) {
                    this.h += c78Var.b[i2];
                    i2++;
                }
            } else {
                c78Var.f = null;
                while (i2 < i) {
                    g(c78Var.c[i2]);
                    g(c78Var.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void P() {
        File file = this.b;
        bkr bkrVar = new bkr(new FileInputStream(file), wut.a);
        try {
            String a = bkrVar.a();
            String a2 = bkrVar.a();
            String a3 = bkrVar.a();
            String a4 = bkrVar.a();
            String a5 = bkrVar.a();
            if (!"libcore.io.DiskLruCache".equals(a) || !"1".equals(a2) || !Integer.toString(this.e).equals(a3) || !Integer.toString(this.g).equals(a4) || !"".equals(a5)) {
                throw new IOException("unexpected journal header: [" + a + ", " + a2 + ", " + a4 + ", " + a5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    Q(bkrVar.a());
                    i++;
                } catch (EOFException unused) {
                    this.k = i - this.j.size();
                    if (bkrVar.e == -1) {
                        R();
                    } else {
                        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), wut.a));
                    }
                    try {
                        bkrVar.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                bkrVar.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void Q(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            kac.f("unexpected journal line: ".concat(str));
            return;
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.j;
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        c78 c78Var = (c78) linkedHashMap.get(substring);
        if (c78Var == null) {
            c78Var = new c78(this, substring);
            linkedHashMap.put(substring, c78Var);
        }
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c78Var.f = new z0j(this, c78Var);
                return;
            } else {
                if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                kac.f("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] split = str.substring(indexOf2 + 1).split(StringUtil.SPACE);
        c78Var.e = true;
        c78Var.f = null;
        if (split.length != c78Var.g.g) {
            xla.h(Arrays.toString(split), "unexpected journal line: ");
            return;
        }
        for (int i2 = 0; i2 < split.length; i2++) {
            try {
                c78Var.b[i2] = Long.parseLong(split[i2]);
            } catch (NumberFormatException unused) {
                xla.h(Arrays.toString(split), "unexpected journal line: ");
                return;
            }
        }
    }

    public final synchronized void R() {
        try {
            BufferedWriter bufferedWriter = this.i;
            if (bufferedWriter != null) {
                b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), wut.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write(StringUtil.LF);
                bufferedWriter2.write("1");
                bufferedWriter2.write(StringUtil.LF);
                bufferedWriter2.write(Integer.toString(this.e));
                bufferedWriter2.write(StringUtil.LF);
                bufferedWriter2.write(Integer.toString(this.g));
                bufferedWriter2.write(StringUtil.LF);
                bufferedWriter2.write(StringUtil.LF);
                for (c78 c78Var : this.j.values()) {
                    if (c78Var.f != null) {
                        bufferedWriter2.write("DIRTY " + c78Var.a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c78Var.a + c78Var.a() + '\n');
                    }
                }
                b(bufferedWriter2);
                if (this.b.exists()) {
                    S(this.b, this.d, true);
                }
                S(this.c, this.b, false);
                this.d.delete();
                this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), wut.a));
            } catch (Throwable th) {
                b(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void X() {
        while (this.h > this.f) {
            String str = (String) ((Map.Entry) this.j.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.i == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    c78 c78Var = (c78) this.j.get(str);
                    if (c78Var != null && c78Var.f == null) {
                        for (int i = 0; i < this.g; i++) {
                            File file = c78Var.c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.h;
                            long[] jArr = c78Var.b;
                            this.h = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.k++;
                        this.i.append((CharSequence) "REMOVE");
                        this.i.append(' ');
                        this.i.append((CharSequence) str);
                        this.i.append('\n');
                        this.j.remove(str);
                        if (H()) {
                            this.m.submit(this.n);
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
            if (this.i == null) {
                return;
            }
            Iterator it = new ArrayList(this.j.values()).iterator();
            while (it.hasNext()) {
                z0j z0jVar = ((c78) it.next()).f;
                if (z0jVar != null) {
                    z0jVar.l();
                }
            }
            X();
            b(this.i);
            this.i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final z0j o(String str) {
        synchronized (this) {
            try {
                if (this.i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                c78 c78Var = (c78) this.j.get(str);
                if (c78Var == null) {
                    c78Var = new c78(this, str);
                    this.j.put(str, c78Var);
                } else if (c78Var.f != null) {
                    return null;
                }
                z0j z0jVar = new z0j(this, c78Var);
                c78Var.f = z0jVar;
                this.i.append((CharSequence) "DIRTY");
                this.i.append(' ');
                this.i.append((CharSequence) str);
                this.i.append('\n');
                z(this.i);
                return z0jVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
