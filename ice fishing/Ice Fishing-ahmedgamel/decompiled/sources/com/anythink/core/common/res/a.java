package com.anythink.core.common.res;

import D.x;
import com.anythink.core.common.d.j;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    static final String f16877a = "journal";

    /* renamed from: b, reason: collision with root package name */
    static final String f16878b = "journal.tmp";

    /* renamed from: c, reason: collision with root package name */
    static final String f16879c = "libcore.io.DiskLruCache";

    /* renamed from: d, reason: collision with root package name */
    static final String f16880d = "1";

    /* renamed from: e, reason: collision with root package name */
    static final long f16881e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static final String f16882f = "CLEAN";

    /* renamed from: g, reason: collision with root package name */
    private static final String f16883g = "DIRTY";

    /* renamed from: h, reason: collision with root package name */
    private static final String f16884h = "REMOVE";
    private static final String i = "READ";

    /* renamed from: j, reason: collision with root package name */
    private static final Charset f16885j = Charset.forName("UTF-8");

    /* renamed from: k, reason: collision with root package name */
    private static final int f16886k = 8192;

    /* renamed from: l, reason: collision with root package name */
    private final File f16887l;

    /* renamed from: m, reason: collision with root package name */
    private final File f16888m;

    /* renamed from: n, reason: collision with root package name */
    private final File f16889n;

    /* renamed from: p, reason: collision with root package name */
    private final long f16891p;

    /* renamed from: s, reason: collision with root package name */
    private Writer f16894s;

    /* renamed from: u, reason: collision with root package name */
    private int f16896u;

    /* renamed from: r, reason: collision with root package name */
    private long f16893r = 0;

    /* renamed from: t, reason: collision with root package name */
    private final LinkedHashMap<String, b> f16895t = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: v, reason: collision with root package name */
    private long f16897v = 0;

    /* renamed from: w, reason: collision with root package name */
    private final ExecutorService f16898w = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: x, reason: collision with root package name */
    private final Callable<Void> f16899x = new Callable<Void>() { // from class: com.anythink.core.common.res.a.1
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                try {
                    if (a.this.f16894s == null) {
                        return null;
                    }
                    a.this.l();
                    if (a.this.h()) {
                        a.this.d();
                        a.e(a.this);
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f16890o = 1;

    /* renamed from: q, reason: collision with root package name */
    private final int f16892q = 1;

    /* renamed from: com.anythink.core.common.res.a$a, reason: collision with other inner class name */
    public final class C0092a {

        /* renamed from: b, reason: collision with root package name */
        private final b f16907b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f16908c;

        /* renamed from: com.anythink.core.common.res.a$a$a, reason: collision with other inner class name */
        public class C0094a extends FilterOutputStream {
            public /* synthetic */ C0094a(C0092a c0092a, OutputStream outputStream, byte b9) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0092a.b(C0092a.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0092a.b(C0092a.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    C0092a.b(C0092a.this);
                }
            }

            private C0094a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i, int i4) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i4);
                } catch (IOException unused) {
                    C0092a.b(C0092a.this);
                }
            }
        }

        public /* synthetic */ C0092a(a aVar, b bVar, byte b9) {
            this(bVar);
        }

        public static /* synthetic */ boolean b(C0092a c0092a) {
            c0092a.f16908c = true;
            return true;
        }

        private String c(int i) {
            InputStream b9 = b(i);
            if (b9 != null) {
                return a.a(b9);
            }
            return null;
        }

        private C0092a(b bVar) {
            this.f16907b = bVar;
        }

        private InputStream b(int i) {
            synchronized (a.this) {
                try {
                    if (this.f16907b.f16936e != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f16907b.f16935d) {
                        return null;
                    }
                    return new FileInputStream(this.f16907b.a(i));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final OutputStream a(int i) {
            C0094a c0094a;
            synchronized (a.this) {
                try {
                    if (this.f16907b.f16936e != this) {
                        throw new IllegalStateException();
                    }
                    c0094a = new C0094a(this, new FileOutputStream(this.f16907b.b(i)), (byte) 0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c0094a;
        }

        private void a(int i, String str) {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(a(i), a.f16885j);
                try {
                    outputStreamWriter2.write(str);
                    a.a(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    a.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public final void b() {
            a.this.a(this, false);
        }

        public final void a() {
            if (this.f16908c) {
                a.this.a(this, false);
                a.this.c(this.f16907b.f16933b);
            } else {
                a.this.a(this, true);
            }
        }
    }

    public final class b {

        /* renamed from: b, reason: collision with root package name */
        private final String f16933b;

        /* renamed from: c, reason: collision with root package name */
        private final long[] f16934c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f16935d;

        /* renamed from: e, reason: collision with root package name */
        private C0092a f16936e;

        /* renamed from: f, reason: collision with root package name */
        private long f16937f;

        public /* synthetic */ b(a aVar, String str, byte b9) {
            this(str);
        }

        private b(String str) {
            this.f16933b = str;
            this.f16934c = new long[a.this.f16892q];
        }

        private static IOException b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public static /* synthetic */ boolean a(b bVar) {
            bVar.f16935d = true;
            return true;
        }

        public final File b(int i) {
            return new File(a.this.f16887l, this.f16933b + j.f13164z + i + ".tmp");
        }

        public final String a() {
            StringBuilder sb = new StringBuilder();
            for (long j6 : this.f16934c) {
                sb.append(' ');
                sb.append(j6);
            }
            return sb.toString();
        }

        private void a(String[] strArr) {
            if (strArr.length == a.this.f16892q) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f16934c[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw b(strArr);
                    }
                }
                return;
            }
            throw b(strArr);
        }

        public final File a(int i) {
            return new File(a.this.f16887l, this.f16933b + j.f13164z + i);
        }

        public static /* synthetic */ void a(b bVar, String[] strArr) {
            if (strArr.length == a.this.f16892q) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        bVar.f16934c[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw b(strArr);
                    }
                }
                return;
            }
            throw b(strArr);
        }
    }

    public final class c implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        private final String f16939b;

        /* renamed from: c, reason: collision with root package name */
        private final long f16940c;

        /* renamed from: d, reason: collision with root package name */
        private final InputStream[] f16941d;

        public /* synthetic */ c(a aVar, String str, long j6, InputStream[] inputStreamArr, byte b9) {
            this(str, j6, inputStreamArr);
        }

        private C0092a b() {
            return a.this.a(this.f16939b, this.f16940c);
        }

        public final InputStream a() {
            return this.f16941d[0];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.f16941d) {
                a.a((Closeable) inputStream);
            }
        }

        private c(String str, long j6, InputStream[] inputStreamArr) {
            this.f16939b = str;
            this.f16940c = j6;
            this.f16941d = inputStreamArr;
        }

        private String a(int i) {
            return a.a(this.f16941d[i]);
        }
    }

    private a(File file, long j6) {
        this.f16887l = file;
        this.f16888m = new File(file, f16877a);
        this.f16889n = new File(file, f16878b);
        this.f16891p = j6;
    }

    public static /* synthetic */ int e(a aVar) {
        aVar.f16896u = 0;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        int i4 = this.f16896u;
        return i4 >= 2000 && i4 >= this.f16895t.size();
    }

    private boolean i() {
        return this.f16894s == null;
    }

    private void j() {
        if (this.f16894s == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private synchronized void k() {
        j();
        l();
        this.f16894s.flush();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        while (this.f16893r > this.f16891p) {
            c(this.f16895t.entrySet().iterator().next().getKey());
        }
    }

    private void m() {
        close();
        a(this.f16887l);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f16894s == null) {
                return;
            }
            Iterator it = new ArrayList(this.f16895t.values()).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar.f16936e != null) {
                    bVar.f16936e.b();
                }
            }
            l();
            this.f16894s.close();
            this.f16894s = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static String b(InputStream inputStream) {
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            }
            if (read == 10) {
                int length = sb.length();
                if (length > 0) {
                    int i4 = length - 1;
                    if (sb.charAt(i4) == '\r') {
                        sb.setLength(i4);
                    }
                }
                return sb.toString();
            }
            sb.append((char) read);
        }
    }

    private void c() {
        b(this.f16889n);
        Iterator<b> it = this.f16895t.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i4 = 0;
            if (next.f16936e == null) {
                while (i4 < this.f16892q) {
                    this.f16893r += next.f16934c[i4];
                    i4++;
                }
            } else {
                next.f16936e = null;
                while (i4 < this.f16892q) {
                    b(next.a(i4));
                    b(next.b(i4));
                    i4++;
                }
                it.remove();
            }
        }
    }

    private void d(String str) {
        String[] split = str.split(" ");
        if (split.length < 2) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        String str2 = split[1];
        byte b9 = 0;
        if (split[0].equals(f16884h) && split.length == 2) {
            this.f16895t.remove(str2);
            return;
        }
        b bVar = this.f16895t.get(str2);
        if (bVar == null) {
            bVar = new b(this, str2, b9);
            this.f16895t.put(str2, bVar);
        }
        if (!split[0].equals(f16882f) || split.length != this.f16892q + 2) {
            if (split[0].equals(f16883g) && split.length == 2) {
                bVar.f16936e = new C0092a(this, bVar, b9);
                return;
            } else {
                if (!split[0].equals(i) || split.length != 2) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        b.a(bVar);
        bVar.f16936e = null;
        int length = split.length;
        int length2 = split.length;
        if (2 > length) {
            throw new IllegalArgumentException();
        }
        if (2 > length2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = length - 2;
        int min = Math.min(i4, length2 - 2);
        Object[] objArr = (Object[]) Array.newInstance(split.getClass().getComponentType(), i4);
        System.arraycopy(split, 2, objArr, 0, min);
        b.a(bVar, (String[]) objArr);
    }

    private File e() {
        return this.f16887l;
    }

    private long f() {
        return this.f16891p;
    }

    private synchronized long g() {
        return this.f16893r;
    }

    private static void e(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            throw new IllegalArgumentException(x.l("keys must not contain spaces or newlines: \"", str, "\""));
        }
    }

    private static <T> T[] a(T[] tArr, int i4) {
        int length = tArr.length;
        if (2 > i4) {
            throw new IllegalArgumentException();
        }
        if (2 <= length) {
            int i6 = i4 - 2;
            int min = Math.min(i6, length - 2);
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i6));
            System.arraycopy(tArr, 2, tArr2, 0, min);
            return tArr2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    private void b() {
        String b9;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f16888m), f16886k);
        try {
            String b10 = b(bufferedInputStream);
            String b11 = b(bufferedInputStream);
            String b12 = b(bufferedInputStream);
            String b13 = b(bufferedInputStream);
            String b14 = b(bufferedInputStream);
            if (!f16879c.equals(b10) || !"1".equals(b11) || !Integer.toString(this.f16890o).equals(b12) || !Integer.toString(this.f16892q).equals(b13) || !"".equals(b14)) {
                throw new IOException("unexpected journal header: [" + b10 + ", " + b11 + ", " + b13 + ", " + b14 + "]");
            }
            while (true) {
                try {
                    b9 = b(bufferedInputStream);
                    String[] split = b9.split(" ");
                    if (split.length >= 2) {
                        String str = split[1];
                        byte b15 = 0;
                        if (split[0].equals(f16884h) && split.length == 2) {
                            this.f16895t.remove(str);
                        } else {
                            b bVar = this.f16895t.get(str);
                            if (bVar == null) {
                                bVar = new b(this, str, b15);
                                this.f16895t.put(str, bVar);
                            }
                            if (split[0].equals(f16882f) && split.length == this.f16892q + 2) {
                                b.a(bVar);
                                bVar.f16936e = null;
                                int length = split.length;
                                int length2 = split.length;
                                if (2 > length) {
                                    throw new IllegalArgumentException();
                                }
                                if (2 <= length2) {
                                    int i4 = length - 2;
                                    int min = Math.min(i4, length2 - 2);
                                    Object[] objArr = (Object[]) Array.newInstance(split.getClass().getComponentType(), i4);
                                    System.arraycopy(split, 2, objArr, 0, min);
                                    b.a(bVar, (String[]) objArr);
                                } else {
                                    throw new ArrayIndexOutOfBoundsException();
                                }
                            } else if (split[0].equals(f16883g) && split.length == 2) {
                                bVar.f16936e = new C0092a(this, bVar, b15);
                            } else if (!split[0].equals(i) || split.length != 2) {
                                break;
                            }
                        }
                    } else {
                        throw new IOException("unexpected journal line: ".concat(b9));
                    }
                } catch (EOFException unused) {
                    a((Closeable) bufferedInputStream);
                    return;
                }
            }
            throw new IOException("unexpected journal line: ".concat(b9));
        } catch (Throwable th) {
            a((Closeable) bufferedInputStream);
            throw th;
        }
    }

    private static String a(Reader reader) {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int read = reader.read(cArr);
                if (read != -1) {
                    stringWriter.write(cArr, 0, read);
                } else {
                    String stringWriter2 = stringWriter.toString();
                    reader.close();
                    return stringWriter2;
                }
            }
        } catch (Throwable th) {
            reader.close();
            throw th;
        }
    }

    public final synchronized boolean c(String str) {
        try {
            j();
            e(str);
            b bVar = this.f16895t.get(str);
            if (bVar != null && bVar.f16936e == null) {
                for (int i4 = 0; i4 < this.f16892q; i4++) {
                    File a9 = bVar.a(i4);
                    if (a9.delete()) {
                        this.f16893r -= bVar.f16934c[i4];
                        bVar.f16934c[i4] = 0;
                    } else {
                        throw new IOException("failed to delete ".concat(String.valueOf(a9)));
                    }
                }
                this.f16896u++;
                this.f16894s.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f16895t.remove(str);
                if (h()) {
                    this.f16898w.submit(this.f16899x);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e9) {
                throw e9;
            } catch (Exception unused) {
            }
        }
    }

    private static void a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
                }
            }
            return;
        }
        throw new IllegalArgumentException("not a directory: ".concat(String.valueOf(file)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        try {
            Writer writer = this.f16894s;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f16889n), f16886k);
            bufferedWriter.write(f16879c);
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f16890o));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f16892q));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (b bVar : this.f16895t.values()) {
                if (bVar.f16936e != null) {
                    bufferedWriter.write("DIRTY " + bVar.f16933b + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + bVar.f16933b + bVar.a() + '\n');
                }
            }
            bufferedWriter.close();
            this.f16889n.renameTo(this.f16888m);
            this.f16894s = new BufferedWriter(new FileWriter(this.f16888m, true), f16886k);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static a a(File file, long j6) {
        if (j6 > 0) {
            a aVar = new a(file, j6);
            if (aVar.f16888m.exists()) {
                try {
                    aVar.b();
                    aVar.c();
                    aVar.f16894s = new BufferedWriter(new FileWriter(aVar.f16888m, true), f16886k);
                    return aVar;
                } catch (IOException unused) {
                    aVar.close();
                    a(aVar.f16887l);
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, j6);
            aVar2.d();
            return aVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private static String c(InputStream inputStream) {
        return a((Reader) new InputStreamReader(inputStream, f16885j));
    }

    public final synchronized c a(String str) {
        Throwable th;
        try {
            try {
                j();
                e(str);
                b bVar = this.f16895t.get(str);
                if (bVar == null) {
                    return null;
                }
                if (!bVar.f16935d) {
                    return null;
                }
                InputStream[] inputStreamArr = new InputStream[this.f16892q];
                for (int i4 = 0; i4 < this.f16892q; i4++) {
                    try {
                        try {
                            inputStreamArr[i4] = new FileInputStream(bVar.a(i4));
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
                this.f16896u++;
                this.f16894s.append((CharSequence) ("READ " + str + '\n'));
                if (h()) {
                    this.f16898w.submit(this.f16899x);
                }
                this.f16894s.flush();
                return new c(this, str, bVar.f16937f, inputStreamArr, (byte) 0);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    private static void b(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final C0092a b(String str) {
        return a(str, f16881e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized C0092a a(String str, long j6) {
        j();
        e(str);
        b bVar = this.f16895t.get(str);
        if (j6 != f16881e && (bVar == null || bVar.f16937f != j6)) {
            return null;
        }
        byte b9 = 0;
        if (bVar != null) {
            if (bVar.f16936e != null) {
                return null;
            }
        } else {
            bVar = new b(this, str, b9);
            this.f16895t.put(str, bVar);
        }
        C0092a c0092a = new C0092a(this, bVar, b9);
        bVar.f16936e = c0092a;
        this.f16894s.write("DIRTY " + str + '\n');
        this.f16894s.flush();
        return c0092a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(C0092a c0092a, boolean z6) {
        try {
            b bVar = c0092a.f16907b;
            if (bVar.f16936e == c0092a) {
                if (z6 && !bVar.f16935d) {
                    for (int i4 = 0; i4 < this.f16892q; i4++) {
                        if (!bVar.b(i4).exists()) {
                            c0092a.b();
                            throw new IllegalStateException("edit didn't create file ".concat(String.valueOf(i4)));
                        }
                    }
                }
                for (int i6 = 0; i6 < this.f16892q; i6++) {
                    File b9 = bVar.b(i6);
                    if (z6) {
                        if (b9.exists()) {
                            File a9 = bVar.a(i6);
                            b9.renameTo(a9);
                            long j6 = bVar.f16934c[i6];
                            long length = a9.length();
                            bVar.f16934c[i6] = length;
                            this.f16893r = (this.f16893r - j6) + length;
                        }
                    } else {
                        b(b9);
                    }
                }
                this.f16896u++;
                bVar.f16936e = null;
                if (!(bVar.f16935d | z6)) {
                    this.f16895t.remove(bVar.f16933b);
                    this.f16894s.write("REMOVE " + bVar.f16933b + '\n');
                } else {
                    b.a(bVar);
                    this.f16894s.write("CLEAN " + bVar.f16933b + bVar.a() + '\n');
                    if (z6) {
                        long j9 = this.f16897v;
                        this.f16897v = 1 + j9;
                        bVar.f16937f = j9;
                    }
                }
                this.f16894s.flush();
                if (this.f16893r > this.f16891p || h()) {
                    this.f16898w.submit(this.f16899x);
                }
            } else {
                throw new IllegalStateException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ String a(InputStream inputStream) {
        return a((Reader) new InputStreamReader(inputStream, f16885j));
    }
}
