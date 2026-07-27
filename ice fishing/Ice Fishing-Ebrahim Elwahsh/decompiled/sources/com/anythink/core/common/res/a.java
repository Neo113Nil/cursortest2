package com.anythink.core.common.res;

import D.y;
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
    static final String f16248a = "journal";

    /* renamed from: b, reason: collision with root package name */
    static final String f16249b = "journal.tmp";

    /* renamed from: c, reason: collision with root package name */
    static final String f16250c = "libcore.io.DiskLruCache";

    /* renamed from: d, reason: collision with root package name */
    static final String f16251d = "1";

    /* renamed from: e, reason: collision with root package name */
    static final long f16252e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static final String f16253f = "CLEAN";

    /* renamed from: g, reason: collision with root package name */
    private static final String f16254g = "DIRTY";

    /* renamed from: h, reason: collision with root package name */
    private static final String f16255h = "REMOVE";
    private static final String i = "READ";

    /* renamed from: j, reason: collision with root package name */
    private static final Charset f16256j = Charset.forName("UTF-8");

    /* renamed from: k, reason: collision with root package name */
    private static final int f16257k = 8192;

    /* renamed from: l, reason: collision with root package name */
    private final File f16258l;

    /* renamed from: m, reason: collision with root package name */
    private final File f16259m;

    /* renamed from: n, reason: collision with root package name */
    private final File f16260n;

    /* renamed from: p, reason: collision with root package name */
    private final long f16262p;

    /* renamed from: s, reason: collision with root package name */
    private Writer f16265s;

    /* renamed from: u, reason: collision with root package name */
    private int f16267u;

    /* renamed from: r, reason: collision with root package name */
    private long f16264r = 0;

    /* renamed from: t, reason: collision with root package name */
    private final LinkedHashMap<String, b> f16266t = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: v, reason: collision with root package name */
    private long f16268v = 0;

    /* renamed from: w, reason: collision with root package name */
    private final ExecutorService f16269w = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: x, reason: collision with root package name */
    private final Callable<Void> f16270x = new Callable<Void>() { // from class: com.anythink.core.common.res.a.1
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                try {
                    if (a.this.f16265s == null) {
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
    private final int f16261o = 1;

    /* renamed from: q, reason: collision with root package name */
    private final int f16263q = 1;

    /* renamed from: com.anythink.core.common.res.a$a, reason: collision with other inner class name */
    public final class C0091a {

        /* renamed from: b, reason: collision with root package name */
        private final b f16278b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f16279c;

        /* renamed from: com.anythink.core.common.res.a$a$a, reason: collision with other inner class name */
        public class C0093a extends FilterOutputStream {
            public /* synthetic */ C0093a(C0091a c0091a, OutputStream outputStream, byte b9) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0091a.b(C0091a.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0091a.b(C0091a.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    C0091a.b(C0091a.this);
                }
            }

            private C0093a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i, int i4) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i4);
                } catch (IOException unused) {
                    C0091a.b(C0091a.this);
                }
            }
        }

        public /* synthetic */ C0091a(a aVar, b bVar, byte b9) {
            this(bVar);
        }

        public static /* synthetic */ boolean b(C0091a c0091a) {
            c0091a.f16279c = true;
            return true;
        }

        private String c(int i) {
            InputStream b9 = b(i);
            if (b9 != null) {
                return a.a(b9);
            }
            return null;
        }

        private C0091a(b bVar) {
            this.f16278b = bVar;
        }

        private InputStream b(int i) {
            synchronized (a.this) {
                try {
                    if (this.f16278b.f16307e != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f16278b.f16306d) {
                        return null;
                    }
                    return new FileInputStream(this.f16278b.a(i));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final OutputStream a(int i) {
            C0093a c0093a;
            synchronized (a.this) {
                try {
                    if (this.f16278b.f16307e != this) {
                        throw new IllegalStateException();
                    }
                    c0093a = new C0093a(this, new FileOutputStream(this.f16278b.b(i)), (byte) 0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c0093a;
        }

        private void a(int i, String str) {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(a(i), a.f16256j);
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
            if (this.f16279c) {
                a.this.a(this, false);
                a.this.c(this.f16278b.f16304b);
            } else {
                a.this.a(this, true);
            }
        }
    }

    public final class b {

        /* renamed from: b, reason: collision with root package name */
        private final String f16304b;

        /* renamed from: c, reason: collision with root package name */
        private final long[] f16305c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f16306d;

        /* renamed from: e, reason: collision with root package name */
        private C0091a f16307e;

        /* renamed from: f, reason: collision with root package name */
        private long f16308f;

        public /* synthetic */ b(a aVar, String str, byte b9) {
            this(str);
        }

        private b(String str) {
            this.f16304b = str;
            this.f16305c = new long[a.this.f16263q];
        }

        private static IOException b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public static /* synthetic */ boolean a(b bVar) {
            bVar.f16306d = true;
            return true;
        }

        public final File b(int i) {
            return new File(a.this.f16258l, this.f16304b + j.f12535z + i + ".tmp");
        }

        public final String a() {
            StringBuilder sb = new StringBuilder();
            for (long j9 : this.f16305c) {
                sb.append(' ');
                sb.append(j9);
            }
            return sb.toString();
        }

        private void a(String[] strArr) {
            if (strArr.length == a.this.f16263q) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f16305c[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw b(strArr);
                    }
                }
                return;
            }
            throw b(strArr);
        }

        public final File a(int i) {
            return new File(a.this.f16258l, this.f16304b + j.f12535z + i);
        }

        public static /* synthetic */ void a(b bVar, String[] strArr) {
            if (strArr.length == a.this.f16263q) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        bVar.f16305c[i] = Long.parseLong(strArr[i]);
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
        private final String f16310b;

        /* renamed from: c, reason: collision with root package name */
        private final long f16311c;

        /* renamed from: d, reason: collision with root package name */
        private final InputStream[] f16312d;

        public /* synthetic */ c(a aVar, String str, long j9, InputStream[] inputStreamArr, byte b9) {
            this(str, j9, inputStreamArr);
        }

        private C0091a b() {
            return a.this.a(this.f16310b, this.f16311c);
        }

        public final InputStream a() {
            return this.f16312d[0];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.f16312d) {
                a.a((Closeable) inputStream);
            }
        }

        private c(String str, long j9, InputStream[] inputStreamArr) {
            this.f16310b = str;
            this.f16311c = j9;
            this.f16312d = inputStreamArr;
        }

        private String a(int i) {
            return a.a(this.f16312d[i]);
        }
    }

    private a(File file, long j9) {
        this.f16258l = file;
        this.f16259m = new File(file, f16248a);
        this.f16260n = new File(file, f16249b);
        this.f16262p = j9;
    }

    public static /* synthetic */ int e(a aVar) {
        aVar.f16267u = 0;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        int i4 = this.f16267u;
        return i4 >= 2000 && i4 >= this.f16266t.size();
    }

    private boolean i() {
        return this.f16265s == null;
    }

    private void j() {
        if (this.f16265s == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private synchronized void k() {
        j();
        l();
        this.f16265s.flush();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        while (this.f16264r > this.f16262p) {
            c(this.f16266t.entrySet().iterator().next().getKey());
        }
    }

    private void m() {
        close();
        a(this.f16258l);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f16265s == null) {
                return;
            }
            Iterator it = new ArrayList(this.f16266t.values()).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar.f16307e != null) {
                    bVar.f16307e.b();
                }
            }
            l();
            this.f16265s.close();
            this.f16265s = null;
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
        b(this.f16260n);
        Iterator<b> it = this.f16266t.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i4 = 0;
            if (next.f16307e == null) {
                while (i4 < this.f16263q) {
                    this.f16264r += next.f16305c[i4];
                    i4++;
                }
            } else {
                next.f16307e = null;
                while (i4 < this.f16263q) {
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
        if (split[0].equals(f16255h) && split.length == 2) {
            this.f16266t.remove(str2);
            return;
        }
        b bVar = this.f16266t.get(str2);
        if (bVar == null) {
            bVar = new b(this, str2, b9);
            this.f16266t.put(str2, bVar);
        }
        if (!split[0].equals(f16253f) || split.length != this.f16263q + 2) {
            if (split[0].equals(f16254g) && split.length == 2) {
                bVar.f16307e = new C0091a(this, bVar, b9);
                return;
            } else {
                if (!split[0].equals(i) || split.length != 2) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        b.a(bVar);
        bVar.f16307e = null;
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
        return this.f16258l;
    }

    private long f() {
        return this.f16262p;
    }

    private synchronized long g() {
        return this.f16264r;
    }

    private static void e(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            throw new IllegalArgumentException(y.k("keys must not contain spaces or newlines: \"", str, "\""));
        }
    }

    private static <T> T[] a(T[] tArr, int i4) {
        int length = tArr.length;
        if (2 > i4) {
            throw new IllegalArgumentException();
        }
        if (2 <= length) {
            int i9 = i4 - 2;
            int min = Math.min(i9, length - 2);
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i9));
            System.arraycopy(tArr, 2, tArr2, 0, min);
            return tArr2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    private void b() {
        String b9;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f16259m), f16257k);
        try {
            String b10 = b(bufferedInputStream);
            String b11 = b(bufferedInputStream);
            String b12 = b(bufferedInputStream);
            String b13 = b(bufferedInputStream);
            String b14 = b(bufferedInputStream);
            if (!f16250c.equals(b10) || !"1".equals(b11) || !Integer.toString(this.f16261o).equals(b12) || !Integer.toString(this.f16263q).equals(b13) || !"".equals(b14)) {
                throw new IOException("unexpected journal header: [" + b10 + ", " + b11 + ", " + b13 + ", " + b14 + "]");
            }
            while (true) {
                try {
                    b9 = b(bufferedInputStream);
                    String[] split = b9.split(" ");
                    if (split.length >= 2) {
                        String str = split[1];
                        byte b15 = 0;
                        if (split[0].equals(f16255h) && split.length == 2) {
                            this.f16266t.remove(str);
                        } else {
                            b bVar = this.f16266t.get(str);
                            if (bVar == null) {
                                bVar = new b(this, str, b15);
                                this.f16266t.put(str, bVar);
                            }
                            if (split[0].equals(f16253f) && split.length == this.f16263q + 2) {
                                b.a(bVar);
                                bVar.f16307e = null;
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
                            } else if (split[0].equals(f16254g) && split.length == 2) {
                                bVar.f16307e = new C0091a(this, bVar, b15);
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
            b bVar = this.f16266t.get(str);
            if (bVar != null && bVar.f16307e == null) {
                for (int i4 = 0; i4 < this.f16263q; i4++) {
                    File a9 = bVar.a(i4);
                    if (a9.delete()) {
                        this.f16264r -= bVar.f16305c[i4];
                        bVar.f16305c[i4] = 0;
                    } else {
                        throw new IOException("failed to delete ".concat(String.valueOf(a9)));
                    }
                }
                this.f16267u++;
                this.f16265s.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f16266t.remove(str);
                if (h()) {
                    this.f16269w.submit(this.f16270x);
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
            } catch (RuntimeException e6) {
                throw e6;
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
            Writer writer = this.f16265s;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f16260n), f16257k);
            bufferedWriter.write(f16250c);
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f16261o));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f16263q));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (b bVar : this.f16266t.values()) {
                if (bVar.f16307e != null) {
                    bufferedWriter.write("DIRTY " + bVar.f16304b + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + bVar.f16304b + bVar.a() + '\n');
                }
            }
            bufferedWriter.close();
            this.f16260n.renameTo(this.f16259m);
            this.f16265s = new BufferedWriter(new FileWriter(this.f16259m, true), f16257k);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static a a(File file, long j9) {
        if (j9 > 0) {
            a aVar = new a(file, j9);
            if (aVar.f16259m.exists()) {
                try {
                    aVar.b();
                    aVar.c();
                    aVar.f16265s = new BufferedWriter(new FileWriter(aVar.f16259m, true), f16257k);
                    return aVar;
                } catch (IOException unused) {
                    aVar.close();
                    a(aVar.f16258l);
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, j9);
            aVar2.d();
            return aVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private static String c(InputStream inputStream) {
        return a((Reader) new InputStreamReader(inputStream, f16256j));
    }

    public final synchronized c a(String str) {
        Throwable th;
        try {
            try {
                j();
                e(str);
                b bVar = this.f16266t.get(str);
                if (bVar == null) {
                    return null;
                }
                if (!bVar.f16306d) {
                    return null;
                }
                InputStream[] inputStreamArr = new InputStream[this.f16263q];
                for (int i4 = 0; i4 < this.f16263q; i4++) {
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
                this.f16267u++;
                this.f16265s.append((CharSequence) ("READ " + str + '\n'));
                if (h()) {
                    this.f16269w.submit(this.f16270x);
                }
                this.f16265s.flush();
                return new c(this, str, bVar.f16308f, inputStreamArr, (byte) 0);
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

    public final C0091a b(String str) {
        return a(str, f16252e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized C0091a a(String str, long j9) {
        j();
        e(str);
        b bVar = this.f16266t.get(str);
        if (j9 != f16252e && (bVar == null || bVar.f16308f != j9)) {
            return null;
        }
        byte b9 = 0;
        if (bVar != null) {
            if (bVar.f16307e != null) {
                return null;
            }
        } else {
            bVar = new b(this, str, b9);
            this.f16266t.put(str, bVar);
        }
        C0091a c0091a = new C0091a(this, bVar, b9);
        bVar.f16307e = c0091a;
        this.f16265s.write("DIRTY " + str + '\n');
        this.f16265s.flush();
        return c0091a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(C0091a c0091a, boolean z8) {
        try {
            b bVar = c0091a.f16278b;
            if (bVar.f16307e == c0091a) {
                if (z8 && !bVar.f16306d) {
                    for (int i4 = 0; i4 < this.f16263q; i4++) {
                        if (!bVar.b(i4).exists()) {
                            c0091a.b();
                            throw new IllegalStateException("edit didn't create file ".concat(String.valueOf(i4)));
                        }
                    }
                }
                for (int i9 = 0; i9 < this.f16263q; i9++) {
                    File b9 = bVar.b(i9);
                    if (z8) {
                        if (b9.exists()) {
                            File a9 = bVar.a(i9);
                            b9.renameTo(a9);
                            long j9 = bVar.f16305c[i9];
                            long length = a9.length();
                            bVar.f16305c[i9] = length;
                            this.f16264r = (this.f16264r - j9) + length;
                        }
                    } else {
                        b(b9);
                    }
                }
                this.f16267u++;
                bVar.f16307e = null;
                if (!(bVar.f16306d | z8)) {
                    this.f16266t.remove(bVar.f16304b);
                    this.f16265s.write("REMOVE " + bVar.f16304b + '\n');
                } else {
                    b.a(bVar);
                    this.f16265s.write("CLEAN " + bVar.f16304b + bVar.a() + '\n');
                    if (z8) {
                        long j10 = this.f16268v;
                        this.f16268v = 1 + j10;
                        bVar.f16308f = j10;
                    }
                }
                this.f16265s.flush();
                if (this.f16264r > this.f16262p || h()) {
                    this.f16269w.submit(this.f16270x);
                }
            } else {
                throw new IllegalStateException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ String a(InputStream inputStream) {
        return a((Reader) new InputStreamReader(inputStream, f16256j));
    }
}
