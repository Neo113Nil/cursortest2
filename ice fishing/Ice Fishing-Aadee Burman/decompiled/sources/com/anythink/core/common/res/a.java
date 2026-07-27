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
    static final String f16090a = "journal";

    /* renamed from: b, reason: collision with root package name */
    static final String f16091b = "journal.tmp";

    /* renamed from: c, reason: collision with root package name */
    static final String f16092c = "libcore.io.DiskLruCache";

    /* renamed from: d, reason: collision with root package name */
    static final String f16093d = "1";

    /* renamed from: e, reason: collision with root package name */
    static final long f16094e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static final String f16095f = "CLEAN";

    /* renamed from: g, reason: collision with root package name */
    private static final String f16096g = "DIRTY";

    /* renamed from: h, reason: collision with root package name */
    private static final String f16097h = "REMOVE";
    private static final String i = "READ";

    /* renamed from: j, reason: collision with root package name */
    private static final Charset f16098j = Charset.forName("UTF-8");

    /* renamed from: k, reason: collision with root package name */
    private static final int f16099k = 8192;

    /* renamed from: l, reason: collision with root package name */
    private final File f16100l;

    /* renamed from: m, reason: collision with root package name */
    private final File f16101m;

    /* renamed from: n, reason: collision with root package name */
    private final File f16102n;

    /* renamed from: p, reason: collision with root package name */
    private final long f16104p;

    /* renamed from: s, reason: collision with root package name */
    private Writer f16107s;

    /* renamed from: u, reason: collision with root package name */
    private int f16109u;

    /* renamed from: r, reason: collision with root package name */
    private long f16106r = 0;

    /* renamed from: t, reason: collision with root package name */
    private final LinkedHashMap<String, b> f16108t = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: v, reason: collision with root package name */
    private long f16110v = 0;

    /* renamed from: w, reason: collision with root package name */
    private final ExecutorService f16111w = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: x, reason: collision with root package name */
    private final Callable<Void> f16112x = new Callable<Void>() { // from class: com.anythink.core.common.res.a.1
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                try {
                    if (a.this.f16107s == null) {
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
    private final int f16103o = 1;

    /* renamed from: q, reason: collision with root package name */
    private final int f16105q = 1;

    /* renamed from: com.anythink.core.common.res.a$a, reason: collision with other inner class name */
    public final class C0092a {

        /* renamed from: b, reason: collision with root package name */
        private final b f16120b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f16121c;

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
            public final void write(byte[] bArr, int i, int i6) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i6);
                } catch (IOException unused) {
                    C0092a.b(C0092a.this);
                }
            }
        }

        public /* synthetic */ C0092a(a aVar, b bVar, byte b9) {
            this(bVar);
        }

        public static /* synthetic */ boolean b(C0092a c0092a) {
            c0092a.f16121c = true;
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
            this.f16120b = bVar;
        }

        private InputStream b(int i) {
            synchronized (a.this) {
                try {
                    if (this.f16120b.f16149e != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f16120b.f16148d) {
                        return null;
                    }
                    return new FileInputStream(this.f16120b.a(i));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final OutputStream a(int i) {
            C0094a c0094a;
            synchronized (a.this) {
                try {
                    if (this.f16120b.f16149e != this) {
                        throw new IllegalStateException();
                    }
                    c0094a = new C0094a(this, new FileOutputStream(this.f16120b.b(i)), (byte) 0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c0094a;
        }

        private void a(int i, String str) {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(a(i), a.f16098j);
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
            if (this.f16121c) {
                a.this.a(this, false);
                a.this.c(this.f16120b.f16146b);
            } else {
                a.this.a(this, true);
            }
        }
    }

    public final class b {

        /* renamed from: b, reason: collision with root package name */
        private final String f16146b;

        /* renamed from: c, reason: collision with root package name */
        private final long[] f16147c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f16148d;

        /* renamed from: e, reason: collision with root package name */
        private C0092a f16149e;

        /* renamed from: f, reason: collision with root package name */
        private long f16150f;

        public /* synthetic */ b(a aVar, String str, byte b9) {
            this(str);
        }

        private b(String str) {
            this.f16146b = str;
            this.f16147c = new long[a.this.f16105q];
        }

        private static IOException b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public static /* synthetic */ boolean a(b bVar) {
            bVar.f16148d = true;
            return true;
        }

        public final File b(int i) {
            return new File(a.this.f16100l, this.f16146b + j.f12378z + i + ".tmp");
        }

        public final String a() {
            StringBuilder sb = new StringBuilder();
            for (long j6 : this.f16147c) {
                sb.append(' ');
                sb.append(j6);
            }
            return sb.toString();
        }

        private void a(String[] strArr) {
            if (strArr.length == a.this.f16105q) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f16147c[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw b(strArr);
                    }
                }
                return;
            }
            throw b(strArr);
        }

        public final File a(int i) {
            return new File(a.this.f16100l, this.f16146b + j.f12378z + i);
        }

        public static /* synthetic */ void a(b bVar, String[] strArr) {
            if (strArr.length == a.this.f16105q) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        bVar.f16147c[i] = Long.parseLong(strArr[i]);
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
        private final String f16152b;

        /* renamed from: c, reason: collision with root package name */
        private final long f16153c;

        /* renamed from: d, reason: collision with root package name */
        private final InputStream[] f16154d;

        public /* synthetic */ c(a aVar, String str, long j6, InputStream[] inputStreamArr, byte b9) {
            this(str, j6, inputStreamArr);
        }

        private C0092a b() {
            return a.this.a(this.f16152b, this.f16153c);
        }

        public final InputStream a() {
            return this.f16154d[0];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.f16154d) {
                a.a((Closeable) inputStream);
            }
        }

        private c(String str, long j6, InputStream[] inputStreamArr) {
            this.f16152b = str;
            this.f16153c = j6;
            this.f16154d = inputStreamArr;
        }

        private String a(int i) {
            return a.a(this.f16154d[i]);
        }
    }

    private a(File file, long j6) {
        this.f16100l = file;
        this.f16101m = new File(file, f16090a);
        this.f16102n = new File(file, f16091b);
        this.f16104p = j6;
    }

    public static /* synthetic */ int e(a aVar) {
        aVar.f16109u = 0;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        int i6 = this.f16109u;
        return i6 >= 2000 && i6 >= this.f16108t.size();
    }

    private boolean i() {
        return this.f16107s == null;
    }

    private void j() {
        if (this.f16107s == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private synchronized void k() {
        j();
        l();
        this.f16107s.flush();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        while (this.f16106r > this.f16104p) {
            c(this.f16108t.entrySet().iterator().next().getKey());
        }
    }

    private void m() {
        close();
        a(this.f16100l);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f16107s == null) {
                return;
            }
            Iterator it = new ArrayList(this.f16108t.values()).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar.f16149e != null) {
                    bVar.f16149e.b();
                }
            }
            l();
            this.f16107s.close();
            this.f16107s = null;
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
                    int i6 = length - 1;
                    if (sb.charAt(i6) == '\r') {
                        sb.setLength(i6);
                    }
                }
                return sb.toString();
            }
            sb.append((char) read);
        }
    }

    private void c() {
        b(this.f16102n);
        Iterator<b> it = this.f16108t.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i6 = 0;
            if (next.f16149e == null) {
                while (i6 < this.f16105q) {
                    this.f16106r += next.f16147c[i6];
                    i6++;
                }
            } else {
                next.f16149e = null;
                while (i6 < this.f16105q) {
                    b(next.a(i6));
                    b(next.b(i6));
                    i6++;
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
        if (split[0].equals(f16097h) && split.length == 2) {
            this.f16108t.remove(str2);
            return;
        }
        b bVar = this.f16108t.get(str2);
        if (bVar == null) {
            bVar = new b(this, str2, b9);
            this.f16108t.put(str2, bVar);
        }
        if (!split[0].equals(f16095f) || split.length != this.f16105q + 2) {
            if (split[0].equals(f16096g) && split.length == 2) {
                bVar.f16149e = new C0092a(this, bVar, b9);
                return;
            } else {
                if (!split[0].equals(i) || split.length != 2) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        b.a(bVar);
        bVar.f16149e = null;
        int length = split.length;
        int length2 = split.length;
        if (2 > length) {
            throw new IllegalArgumentException();
        }
        if (2 > length2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i6 = length - 2;
        int min = Math.min(i6, length2 - 2);
        Object[] objArr = (Object[]) Array.newInstance(split.getClass().getComponentType(), i6);
        System.arraycopy(split, 2, objArr, 0, min);
        b.a(bVar, (String[]) objArr);
    }

    private File e() {
        return this.f16100l;
    }

    private long f() {
        return this.f16104p;
    }

    private synchronized long g() {
        return this.f16106r;
    }

    private static void e(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            throw new IllegalArgumentException(y.o("keys must not contain spaces or newlines: \"", str, "\""));
        }
    }

    private static <T> T[] a(T[] tArr, int i6) {
        int length = tArr.length;
        if (2 > i6) {
            throw new IllegalArgumentException();
        }
        if (2 <= length) {
            int i9 = i6 - 2;
            int min = Math.min(i9, length - 2);
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i9));
            System.arraycopy(tArr, 2, tArr2, 0, min);
            return tArr2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    private void b() {
        String b9;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f16101m), f16099k);
        try {
            String b10 = b(bufferedInputStream);
            String b11 = b(bufferedInputStream);
            String b12 = b(bufferedInputStream);
            String b13 = b(bufferedInputStream);
            String b14 = b(bufferedInputStream);
            if (!f16092c.equals(b10) || !"1".equals(b11) || !Integer.toString(this.f16103o).equals(b12) || !Integer.toString(this.f16105q).equals(b13) || !"".equals(b14)) {
                throw new IOException("unexpected journal header: [" + b10 + ", " + b11 + ", " + b13 + ", " + b14 + "]");
            }
            while (true) {
                try {
                    b9 = b(bufferedInputStream);
                    String[] split = b9.split(" ");
                    if (split.length >= 2) {
                        String str = split[1];
                        byte b15 = 0;
                        if (split[0].equals(f16097h) && split.length == 2) {
                            this.f16108t.remove(str);
                        } else {
                            b bVar = this.f16108t.get(str);
                            if (bVar == null) {
                                bVar = new b(this, str, b15);
                                this.f16108t.put(str, bVar);
                            }
                            if (split[0].equals(f16095f) && split.length == this.f16105q + 2) {
                                b.a(bVar);
                                bVar.f16149e = null;
                                int length = split.length;
                                int length2 = split.length;
                                if (2 > length) {
                                    throw new IllegalArgumentException();
                                }
                                if (2 <= length2) {
                                    int i6 = length - 2;
                                    int min = Math.min(i6, length2 - 2);
                                    Object[] objArr = (Object[]) Array.newInstance(split.getClass().getComponentType(), i6);
                                    System.arraycopy(split, 2, objArr, 0, min);
                                    b.a(bVar, (String[]) objArr);
                                } else {
                                    throw new ArrayIndexOutOfBoundsException();
                                }
                            } else if (split[0].equals(f16096g) && split.length == 2) {
                                bVar.f16149e = new C0092a(this, bVar, b15);
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
            b bVar = this.f16108t.get(str);
            if (bVar != null && bVar.f16149e == null) {
                for (int i6 = 0; i6 < this.f16105q; i6++) {
                    File a9 = bVar.a(i6);
                    if (a9.delete()) {
                        this.f16106r -= bVar.f16147c[i6];
                        bVar.f16147c[i6] = 0;
                    } else {
                        throw new IOException("failed to delete ".concat(String.valueOf(a9)));
                    }
                }
                this.f16109u++;
                this.f16107s.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f16108t.remove(str);
                if (h()) {
                    this.f16111w.submit(this.f16112x);
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
            Writer writer = this.f16107s;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f16102n), f16099k);
            bufferedWriter.write(f16092c);
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f16103o));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f16105q));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (b bVar : this.f16108t.values()) {
                if (bVar.f16149e != null) {
                    bufferedWriter.write("DIRTY " + bVar.f16146b + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + bVar.f16146b + bVar.a() + '\n');
                }
            }
            bufferedWriter.close();
            this.f16102n.renameTo(this.f16101m);
            this.f16107s = new BufferedWriter(new FileWriter(this.f16101m, true), f16099k);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static a a(File file, long j6) {
        if (j6 > 0) {
            a aVar = new a(file, j6);
            if (aVar.f16101m.exists()) {
                try {
                    aVar.b();
                    aVar.c();
                    aVar.f16107s = new BufferedWriter(new FileWriter(aVar.f16101m, true), f16099k);
                    return aVar;
                } catch (IOException unused) {
                    aVar.close();
                    a(aVar.f16100l);
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
        return a((Reader) new InputStreamReader(inputStream, f16098j));
    }

    public final synchronized c a(String str) {
        Throwable th;
        try {
            try {
                j();
                e(str);
                b bVar = this.f16108t.get(str);
                if (bVar == null) {
                    return null;
                }
                if (!bVar.f16148d) {
                    return null;
                }
                InputStream[] inputStreamArr = new InputStream[this.f16105q];
                for (int i6 = 0; i6 < this.f16105q; i6++) {
                    try {
                        try {
                            inputStreamArr[i6] = new FileInputStream(bVar.a(i6));
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
                this.f16109u++;
                this.f16107s.append((CharSequence) ("READ " + str + '\n'));
                if (h()) {
                    this.f16111w.submit(this.f16112x);
                }
                this.f16107s.flush();
                return new c(this, str, bVar.f16150f, inputStreamArr, (byte) 0);
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
        return a(str, f16094e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized C0092a a(String str, long j6) {
        j();
        e(str);
        b bVar = this.f16108t.get(str);
        if (j6 != f16094e && (bVar == null || bVar.f16150f != j6)) {
            return null;
        }
        byte b9 = 0;
        if (bVar != null) {
            if (bVar.f16149e != null) {
                return null;
            }
        } else {
            bVar = new b(this, str, b9);
            this.f16108t.put(str, bVar);
        }
        C0092a c0092a = new C0092a(this, bVar, b9);
        bVar.f16149e = c0092a;
        this.f16107s.write("DIRTY " + str + '\n');
        this.f16107s.flush();
        return c0092a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(C0092a c0092a, boolean z3) {
        try {
            b bVar = c0092a.f16120b;
            if (bVar.f16149e == c0092a) {
                if (z3 && !bVar.f16148d) {
                    for (int i6 = 0; i6 < this.f16105q; i6++) {
                        if (!bVar.b(i6).exists()) {
                            c0092a.b();
                            throw new IllegalStateException("edit didn't create file ".concat(String.valueOf(i6)));
                        }
                    }
                }
                for (int i9 = 0; i9 < this.f16105q; i9++) {
                    File b9 = bVar.b(i9);
                    if (z3) {
                        if (b9.exists()) {
                            File a9 = bVar.a(i9);
                            b9.renameTo(a9);
                            long j6 = bVar.f16147c[i9];
                            long length = a9.length();
                            bVar.f16147c[i9] = length;
                            this.f16106r = (this.f16106r - j6) + length;
                        }
                    } else {
                        b(b9);
                    }
                }
                this.f16109u++;
                bVar.f16149e = null;
                if (!(bVar.f16148d | z3)) {
                    this.f16108t.remove(bVar.f16146b);
                    this.f16107s.write("REMOVE " + bVar.f16146b + '\n');
                } else {
                    b.a(bVar);
                    this.f16107s.write("CLEAN " + bVar.f16146b + bVar.a() + '\n');
                    if (z3) {
                        long j9 = this.f16110v;
                        this.f16110v = 1 + j9;
                        bVar.f16150f = j9;
                    }
                }
                this.f16107s.flush();
                if (this.f16106r > this.f16104p || h()) {
                    this.f16111w.submit(this.f16112x);
                }
            } else {
                throw new IllegalStateException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ String a(InputStream inputStream) {
        return a((Reader) new InputStreamReader(inputStream, f16098j));
    }
}
