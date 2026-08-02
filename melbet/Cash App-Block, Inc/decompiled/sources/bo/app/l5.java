package bo.app;

import com.braze.support.BrazeLogger;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class l5 {
    public static final Pattern o = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final String p = BrazeLogger.getBrazeLogTag((Class<?>) l5.class);
    public static final h5 q = new h5();
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public BufferedWriter i;
    public int k;
    public long h = 0;
    public final LinkedHashMap j = new LinkedHashMap(0, 0.75f, true);
    public long l = 0;
    public final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final g5 n = new g5(this);
    public final int e = 1;
    public final int g = 1;
    public final long f = 52428800;

    public l5(File file) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
    }

    public final synchronized void a(j5 j5Var, boolean z) {
        int i;
        d7 d7Var = j5Var.a;
        if (d7Var.d != j5Var) {
            throw new IllegalStateException();
        }
        if (z && !d7Var.c) {
            for (int i2 = 0; i2 < this.g; i2++) {
                if (!j5Var.b[i2]) {
                    j5Var.d.a(j5Var, false);
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                }
                if (!d7Var.a(i2).exists()) {
                    j5Var.d.a(j5Var, false);
                    return;
                }
            }
        }
        for (int i3 = 0; i3 < this.g; i3++) {
            File a = d7Var.a(i3);
            if (z) {
                if (a.exists()) {
                    File file = new File(d7Var.f, d7Var.a + "." + i3);
                    a.renameTo(file);
                    long j = d7Var.b[i3];
                    long length = file.length();
                    d7Var.b[i3] = length;
                    this.h = (this.h - j) + length;
                }
            } else if (a.exists() && !a.delete()) {
                throw new IOException();
            }
        }
        this.k++;
        d7Var.d = null;
        if (d7Var.c || z) {
            d7Var.c = true;
            BufferedWriter bufferedWriter = this.i;
            StringBuilder sb = new StringBuilder("CLEAN ");
            sb.append(d7Var.a);
            StringBuilder sb2 = new StringBuilder();
            for (long j2 : d7Var.b) {
                sb2.append(' ');
                sb2.append(j2);
            }
            sb.append(sb2.toString());
            sb.append('\n');
            bufferedWriter.write(sb.toString());
            if (z) {
                this.l++;
            }
        } else {
            this.j.remove(d7Var.a);
            this.i.write("REMOVE " + d7Var.a + '\n');
        }
        this.i.flush();
        if (this.h > this.f || ((i = this.k) >= 2000 && i >= this.j.size())) {
            this.m.submit(this.n);
        }
    }

    public final synchronized k5 b(String str) {
        InputStream inputStream;
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
        if (!o.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
        d7 d7Var = (d7) this.j.get(str);
        if (d7Var == null) {
            return null;
        }
        if (!d7Var.c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.g];
        for (int i = 0; i < this.g; i++) {
            try {
                inputStreamArr[i] = new FileInputStream(new File(d7Var.f, d7Var.a + "." + i));
            } catch (FileNotFoundException unused) {
                for (int i2 = 0; i2 < this.g && (inputStream = inputStreamArr[i2]) != null; i2++) {
                    Charset charset = bh.a;
                    try {
                        inputStream.close();
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                    }
                }
                return null;
            }
        }
        this.k++;
        this.i.append((CharSequence) ("READ " + str + '\n'));
        int i3 = this.k;
        if (i3 >= 2000 && i3 >= this.j.size()) {
            this.m.submit(this.n);
        }
        return new k5(inputStreamArr);
    }

    public final void c() {
        lf lfVar = new lf(new FileInputStream(this.b), bh.a);
        try {
            String a = lfVar.a();
            String a2 = lfVar.a();
            String a3 = lfVar.a();
            String a4 = lfVar.a();
            String a5 = lfVar.a();
            if (!"libcore.io.DiskLruCache".equals(a) || !"1".equals(a2) || !Integer.toString(this.e).equals(a3) || !Integer.toString(this.g).equals(a4) || !"".equals(a5)) {
                throw new IOException("unexpected journal header: [" + a + ", " + a2 + ", " + a4 + ", " + a5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    c(lfVar.a());
                    i++;
                } catch (EOFException unused) {
                    this.k = i - this.j.size();
                    if (lfVar.e == -1) {
                        d();
                    } else {
                        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), bh.a));
                    }
                    try {
                        lfVar.close();
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
                lfVar.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final synchronized void d() {
        try {
            BufferedWriter bufferedWriter = this.i;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), bh.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (d7 d7Var : this.j.values()) {
                    if (d7Var.d != null) {
                        bufferedWriter2.write("DIRTY " + d7Var.a + '\n');
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("CLEAN ");
                        sb.append(d7Var.a);
                        StringBuilder sb2 = new StringBuilder();
                        for (long j : d7Var.b) {
                            sb2.append(' ');
                            sb2.append(j);
                        }
                        sb.append(sb2.toString());
                        sb.append('\n');
                        bufferedWriter2.write(sb.toString());
                    }
                }
                bufferedWriter2.close();
                if (this.b.exists()) {
                    File file = this.b;
                    File file2 = this.d;
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (!this.c.renameTo(this.b)) {
                    throw new IOException();
                }
                this.d.delete();
                this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), bh.a));
            } finally {
                try {
                    bufferedWriter2.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            d7 d7Var = (d7) this.j.get(substring);
            if (d7Var == null) {
                d7Var = new d7(substring, this.g, this.a);
                this.j.put(substring, d7Var);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                d7Var.c = true;
                d7Var.d = null;
                if (split.length == d7Var.e) {
                    for (int i2 = 0; i2 < split.length; i2++) {
                        try {
                            d7Var.b[i2] = Long.parseLong(split[i2]);
                        } catch (NumberFormatException unused) {
                            a$$ExternalSyntheticBUOutline0.m$4(Arrays.toString(split), "unexpected journal line: ");
                            return;
                        }
                    }
                    return;
                }
                a$$ExternalSyntheticBUOutline0.m$4(Arrays.toString(split), "unexpected journal line: ");
                return;
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                d7Var.d = new j5(this, d7Var);
                return;
            } else {
                if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                a$$ExternalSyntheticBUOutline0.m$4("unexpected journal line: ".concat(str));
                return;
            }
        }
        a$$ExternalSyntheticBUOutline0.m$4("unexpected journal line: ".concat(str));
    }

    public final void b() {
        File file = this.c;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            d7 d7Var = (d7) it.next();
            int i = 0;
            if (d7Var.d == null) {
                while (i < this.g) {
                    this.h += d7Var.b[i];
                    i++;
                }
            } else {
                d7Var.d = null;
                while (i < this.g) {
                    File file2 = new File(d7Var.f, d7Var.a + "." + i);
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    File a = d7Var.a(i);
                    if (a.exists() && !a.delete()) {
                        throw new IOException();
                    }
                    i++;
                }
                it.remove();
            }
        }
    }

    public final synchronized void d(String str) {
        try {
            if (this.i != null) {
                if (o.matcher(str).matches()) {
                    d7 d7Var = (d7) this.j.get(str);
                    if (d7Var != null && d7Var.d == null) {
                        for (int i = 0; i < this.g; i++) {
                            File file = new File(d7Var.f, d7Var.a + "." + i);
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.h;
                            long[] jArr = d7Var.b;
                            this.h = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.k++;
                        this.i.append((CharSequence) ("REMOVE " + str + '\n'));
                        this.j.remove(str);
                        int i2 = this.k;
                        if (i2 >= 2000 && i2 >= this.j.size()) {
                            this.m.submit(this.n);
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            throw new IllegalStateException("cache is closed");
        } finally {
        }
    }

    public final j5 a(String str) {
        synchronized (this) {
            try {
                if (this.i != null) {
                    if (o.matcher(str).matches()) {
                        d7 d7Var = (d7) this.j.get(str);
                        if (d7Var == null) {
                            d7Var = new d7(str, this.g, this.a);
                            this.j.put(str, d7Var);
                        } else if (d7Var.d != null) {
                            return null;
                        }
                        j5 j5Var = new j5(this, d7Var);
                        d7Var.d = j5Var;
                        this.i.write("DIRTY " + str + '\n');
                        this.i.flush();
                        return j5Var;
                    }
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void a() {
        try {
            if (this.i == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.j.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                j5 j5Var = ((d7) obj).d;
                if (j5Var != null) {
                    j5Var.d.a(j5Var, false);
                }
            }
            while (this.h > this.f) {
                d((String) ((Map.Entry) this.j.entrySet().iterator().next()).getKey());
            }
            this.i.close();
            this.i = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
