package com.anythink.core.common.n.b.a.a;

import D.y;
import com.anythink.core.common.n.b.aa;
import com.anythink.core.common.n.c.n;
import com.anythink.core.common.n.c.v;
import com.anythink.core.common.n.c.w;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class d implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name */
    static final String f15047a = "journal";

    /* renamed from: b, reason: collision with root package name */
    static final String f15048b = "journal.tmp";

    /* renamed from: c, reason: collision with root package name */
    static final String f15049c = "journal.bkp";

    /* renamed from: d, reason: collision with root package name */
    static final String f15050d = "libcore.io.DiskLruCache";

    /* renamed from: e, reason: collision with root package name */
    static final String f15051e = "1";

    /* renamed from: f, reason: collision with root package name */
    static final long f15052f = -1;

    /* renamed from: g, reason: collision with root package name */
    static final Pattern f15053g = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: s, reason: collision with root package name */
    static final /* synthetic */ boolean f15054s = true;

    /* renamed from: t, reason: collision with root package name */
    private static final String f15055t = "CLEAN";

    /* renamed from: u, reason: collision with root package name */
    private static final String f15056u = "DIRTY";

    /* renamed from: v, reason: collision with root package name */
    private static final String f15057v = "REMOVE";

    /* renamed from: w, reason: collision with root package name */
    private static final String f15058w = "READ";

    /* renamed from: B, reason: collision with root package name */
    private long f15060B;

    /* renamed from: E, reason: collision with root package name */
    private final Executor f15063E;

    /* renamed from: h, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.f.a f15065h;
    final File i;

    /* renamed from: k, reason: collision with root package name */
    com.anythink.core.common.n.c.d f15067k;

    /* renamed from: m, reason: collision with root package name */
    int f15069m;

    /* renamed from: n, reason: collision with root package name */
    boolean f15070n;

    /* renamed from: o, reason: collision with root package name */
    boolean f15071o;

    /* renamed from: p, reason: collision with root package name */
    boolean f15072p;

    /* renamed from: q, reason: collision with root package name */
    boolean f15073q;

    /* renamed from: r, reason: collision with root package name */
    boolean f15074r;

    /* renamed from: x, reason: collision with root package name */
    private final File f15075x;

    /* renamed from: y, reason: collision with root package name */
    private final File f15076y;

    /* renamed from: z, reason: collision with root package name */
    private final File f15077z;

    /* renamed from: C, reason: collision with root package name */
    private long f15061C = 0;

    /* renamed from: l, reason: collision with root package name */
    final LinkedHashMap<String, b> f15068l = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: D, reason: collision with root package name */
    private long f15062D = 0;

    /* renamed from: F, reason: collision with root package name */
    private final Runnable f15064F = new Runnable() { // from class: com.anythink.core.common.n.b.a.a.d.1
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (d.this) {
                d dVar = d.this;
                if ((!dVar.f15071o) || dVar.f15072p) {
                    return;
                }
                try {
                    dVar.h();
                } catch (IOException unused) {
                    d.this.f15073q = true;
                }
                try {
                    if (d.this.f()) {
                        d.this.b();
                        d.this.f15069m = 0;
                    }
                } catch (IOException unused2) {
                    d dVar2 = d.this;
                    dVar2.f15074r = true;
                    dVar2.f15067k = n.a(n.a());
                }
            }
        }
    };

    /* renamed from: A, reason: collision with root package name */
    private final int f15059A = 201105;

    /* renamed from: j, reason: collision with root package name */
    final int f15066j = 2;

    public final class c implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        private final String f15099b;

        /* renamed from: c, reason: collision with root package name */
        private final long f15100c;

        /* renamed from: d, reason: collision with root package name */
        private final w[] f15101d;

        /* renamed from: e, reason: collision with root package name */
        private final long[] f15102e;

        public c(String str, long j9, w[] wVarArr, long[] jArr) {
            this.f15099b = str;
            this.f15100c = j9;
            this.f15101d = wVarArr;
            this.f15102e = jArr;
        }

        private String b() {
            return this.f15099b;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (w wVar : this.f15101d) {
                com.anythink.core.common.n.b.a.c.a(wVar);
            }
        }

        private long b(int i) {
            return this.f15102e[i];
        }

        public final a a() {
            return d.this.a(this.f15099b, this.f15100c);
        }

        public final w a(int i) {
            return this.f15101d[i];
        }
    }

    private d(com.anythink.core.common.n.b.a.f.a aVar, File file, long j9, Executor executor) {
        this.f15065h = aVar;
        this.i = file;
        this.f15075x = new File(file, f15047a);
        this.f15076y = new File(file, f15048b);
        this.f15077z = new File(file, f15049c);
        this.f15060B = j9;
        this.f15063E = executor;
    }

    private void d(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith(f15057v)) {
                this.f15068l.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        b bVar = this.f15068l.get(substring);
        if (bVar == null) {
            bVar = new b(substring);
            this.f15068l.put(substring, bVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith(f15055t)) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            bVar.f15094e = true;
            bVar.f15095f = null;
            bVar.a(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith(f15056u)) {
            bVar.f15095f = new a(bVar);
        } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith(f15058w)) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00eb, code lost:
    
        throw new java.io.IOException("unexpected journal line: ".concat(r2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void l() {
        String substring;
        com.anythink.core.common.n.c.e a9 = n.a(this.f15065h.a(this.f15075x));
        try {
            String w9 = a9.w();
            String w10 = a9.w();
            String w11 = a9.w();
            String w12 = a9.w();
            String w13 = a9.w();
            if (!f15050d.equals(w9) || !"1".equals(w10) || !Integer.toString(this.f15059A).equals(w11) || !Integer.toString(this.f15066j).equals(w12) || !"".equals(w13)) {
                throw new IOException("unexpected journal header: [" + w9 + ", " + w10 + ", " + w12 + ", " + w13 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    String w14 = a9.w();
                    int indexOf = w14.indexOf(32);
                    if (indexOf == -1) {
                        throw new IOException("unexpected journal line: ".concat(w14));
                    }
                    int i4 = indexOf + 1;
                    int indexOf2 = w14.indexOf(32, i4);
                    if (indexOf2 == -1) {
                        substring = w14.substring(i4);
                        if (indexOf == 6 && w14.startsWith(f15057v)) {
                            this.f15068l.remove(substring);
                            i++;
                        }
                    } else {
                        substring = w14.substring(i4, indexOf2);
                    }
                    b bVar = this.f15068l.get(substring);
                    if (bVar == null) {
                        bVar = new b(substring);
                        this.f15068l.put(substring, bVar);
                    }
                    if (indexOf2 != -1 && indexOf == 5 && w14.startsWith(f15055t)) {
                        String[] split = w14.substring(indexOf2 + 1).split(" ");
                        bVar.f15094e = true;
                        bVar.f15095f = null;
                        bVar.a(split);
                    } else if (indexOf2 == -1 && indexOf == 5 && w14.startsWith(f15056u)) {
                        bVar.f15095f = new a(bVar);
                    } else if (indexOf2 != -1 || indexOf != 4 || !w14.startsWith(f15058w)) {
                        break;
                    }
                    i++;
                } catch (EOFException unused) {
                    this.f15069m = i - this.f15068l.size();
                    if (a9.g()) {
                        this.f15067k = m();
                    } else {
                        b();
                    }
                    a9.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                a9.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private com.anythink.core.common.n.c.d m() {
        return n.a(new e(this.f15065h.c(this.f15075x)) { // from class: com.anythink.core.common.n.b.a.a.d.2

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ boolean f15079a = true;

            @Override // com.anythink.core.common.n.b.a.a.e
            public final void b() {
                if (!f15079a && !Thread.holdsLock(d.this)) {
                    throw new AssertionError();
                }
                d.this.f15070n = true;
            }
        });
    }

    private void n() {
        this.f15065h.d(this.f15076y);
        Iterator<b> it = this.f15068l.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i = 0;
            if (next.f15095f == null) {
                while (i < this.f15066j) {
                    this.f15061C += next.f15091b[i];
                    i++;
                }
            } else {
                next.f15095f = null;
                while (i < this.f15066j) {
                    this.f15065h.d(next.f15092c[i]);
                    this.f15065h.d(next.f15093d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    private synchronized void o() {
        if (g()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void a() {
        try {
            if (!f15054s && !Thread.holdsLock(this)) {
                throw new AssertionError();
            }
            if (this.f15071o) {
                return;
            }
            if (this.f15065h.e(this.f15077z)) {
                if (this.f15065h.e(this.f15075x)) {
                    this.f15065h.d(this.f15077z);
                } else {
                    this.f15065h.a(this.f15077z, this.f15075x);
                }
            }
            if (this.f15065h.e(this.f15075x)) {
                try {
                    l();
                    n();
                    this.f15071o = true;
                    return;
                } catch (IOException e6) {
                    com.anythink.core.common.n.b.a.g.c.e().a(5, "DiskLruCache " + this.i + " is corrupt: " + e6.getMessage() + ", removing", e6);
                    try {
                        i();
                        this.f15072p = false;
                    } catch (Throwable th) {
                        this.f15072p = false;
                        throw th;
                    }
                }
            }
            b();
            this.f15071o = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            com.anythink.core.common.n.c.d dVar = this.f15067k;
            if (dVar != null) {
                dVar.close();
            }
            com.anythink.core.common.n.c.d a9 = n.a(this.f15065h.b(this.f15076y));
            try {
                a9.b(f15050d).l(10);
                a9.b("1").l(10);
                a9.o(this.f15059A).l(10);
                a9.o(this.f15066j).l(10);
                a9.l(10);
                for (b bVar : this.f15068l.values()) {
                    if (bVar.f15095f != null) {
                        a9.b(f15056u).l(32);
                        a9.b(bVar.f15090a);
                        a9.l(10);
                    } else {
                        a9.b(f15055t).l(32);
                        a9.b(bVar.f15090a);
                        bVar.a(a9);
                        a9.l(10);
                    }
                }
                a9.close();
                if (this.f15065h.e(this.f15075x)) {
                    this.f15065h.a(this.f15075x, this.f15077z);
                }
                this.f15065h.a(this.f15076y, this.f15075x);
                this.f15065h.d(this.f15077z);
                this.f15067k = m();
                this.f15070n = false;
                this.f15074r = false;
            } finally {
                try {
                    a9.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final File c() {
        return this.i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f15071o && !this.f15072p) {
                for (b bVar : (b[]) this.f15068l.values().toArray(new b[this.f15068l.size()])) {
                    a aVar = bVar.f15095f;
                    if (aVar != null) {
                        aVar.c();
                    }
                }
                h();
                this.f15067k.close();
                this.f15067k = null;
                this.f15072p = true;
                return;
            }
            this.f15072p = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long e() {
        a();
        return this.f15061C;
    }

    public final boolean f() {
        int i = this.f15069m;
        return i >= 2000 && i >= this.f15068l.size();
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f15071o) {
            o();
            h();
            this.f15067k.flush();
        }
    }

    public final synchronized boolean g() {
        return this.f15072p;
    }

    public final void h() {
        while (this.f15061C > this.f15060B) {
            a(this.f15068l.values().iterator().next());
        }
        this.f15073q = false;
    }

    public final void i() {
        close();
        this.f15065h.g(this.i);
    }

    public final synchronized void j() {
        try {
            a();
            for (b bVar : (b[]) this.f15068l.values().toArray(new b[this.f15068l.size()])) {
                a(bVar);
            }
            this.f15073q = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Iterator<c> k() {
        a();
        return new Iterator<c>() { // from class: com.anythink.core.common.n.b.a.a.d.3

            /* renamed from: a, reason: collision with root package name */
            final Iterator<b> f15081a;

            /* renamed from: b, reason: collision with root package name */
            c f15082b;

            /* renamed from: c, reason: collision with root package name */
            c f15083c;

            {
                this.f15081a = new ArrayList(d.this.f15068l.values()).iterator();
            }

            private c a() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                c cVar = this.f15082b;
                this.f15083c = cVar;
                this.f15082b = null;
                return cVar;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                c a9;
                if (this.f15082b != null) {
                    return true;
                }
                synchronized (d.this) {
                    try {
                        if (d.this.f15072p) {
                            return false;
                        }
                        while (this.f15081a.hasNext()) {
                            b next = this.f15081a.next();
                            if (next.f15094e && (a9 = next.a()) != null) {
                                this.f15082b = a9;
                                return true;
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // java.util.Iterator
            public final /* synthetic */ c next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                c cVar = this.f15082b;
                this.f15083c = cVar;
                this.f15082b = null;
                return cVar;
            }

            @Override // java.util.Iterator
            public final void remove() {
                c cVar = this.f15083c;
                if (cVar == null) {
                    throw new IllegalStateException("remove() before next()");
                }
                try {
                    d.this.c(cVar.f15099b);
                } catch (IOException unused) {
                } finally {
                    this.f15083c = null;
                }
            }
        };
    }

    public final synchronized boolean c(String str) {
        a();
        o();
        e(str);
        b bVar = this.f15068l.get(str);
        if (bVar == null) {
            return false;
        }
        a(bVar);
        if (this.f15061C <= this.f15060B) {
            this.f15073q = false;
        }
        return true;
    }

    private static void e(String str) {
        if (!f15053g.matcher(str).matches()) {
            throw new IllegalArgumentException(y.k("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        final b f15085a;

        /* renamed from: b, reason: collision with root package name */
        final boolean[] f15086b;

        /* renamed from: d, reason: collision with root package name */
        private boolean f15088d;

        public a(b bVar) {
            this.f15085a = bVar;
            this.f15086b = bVar.f15094e ? null : new boolean[d.this.f15066j];
        }

        private w b(int i) {
            synchronized (d.this) {
                if (this.f15088d) {
                    throw new IllegalStateException();
                }
                b bVar = this.f15085a;
                if (!bVar.f15094e || bVar.f15095f != this) {
                    return null;
                }
                try {
                    return d.this.f15065h.a(bVar.f15092c[i]);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        private void d() {
            synchronized (d.this) {
                if (!this.f15088d && this.f15085a.f15095f == this) {
                    try {
                        d.this.a(this, false);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public final void a() {
            if (this.f15085a.f15095f != this) {
                return;
            }
            int i = 0;
            while (true) {
                d dVar = d.this;
                if (i >= dVar.f15066j) {
                    this.f15085a.f15095f = null;
                    return;
                } else {
                    try {
                        dVar.f15065h.d(this.f15085a.f15093d[i]);
                    } catch (IOException unused) {
                    }
                    i++;
                }
            }
        }

        public final void c() {
            synchronized (d.this) {
                try {
                    if (this.f15088d) {
                        throw new IllegalStateException();
                    }
                    if (this.f15085a.f15095f == this) {
                        d.this.a(this, false);
                    }
                    this.f15088d = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final v a(int i) {
            synchronized (d.this) {
                try {
                    if (!this.f15088d) {
                        b bVar = this.f15085a;
                        if (bVar.f15095f != this) {
                            return n.a();
                        }
                        if (!bVar.f15094e) {
                            this.f15086b[i] = true;
                        }
                        try {
                            return new e(d.this.f15065h.b(bVar.f15093d[i])) { // from class: com.anythink.core.common.n.b.a.a.d.a.1
                                @Override // com.anythink.core.common.n.b.a.a.e
                                public final void b() {
                                    synchronized (d.this) {
                                        a.this.a();
                                    }
                                }
                            };
                        } catch (FileNotFoundException unused) {
                            return n.a();
                        }
                    }
                    throw new IllegalStateException();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            synchronized (d.this) {
                try {
                    if (!this.f15088d) {
                        if (this.f15085a.f15095f == this) {
                            d.this.a(this, true);
                        }
                        this.f15088d = true;
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final class b {

        /* renamed from: a, reason: collision with root package name */
        final String f15090a;

        /* renamed from: b, reason: collision with root package name */
        final long[] f15091b;

        /* renamed from: c, reason: collision with root package name */
        final File[] f15092c;

        /* renamed from: d, reason: collision with root package name */
        final File[] f15093d;

        /* renamed from: e, reason: collision with root package name */
        boolean f15094e;

        /* renamed from: f, reason: collision with root package name */
        a f15095f;

        /* renamed from: g, reason: collision with root package name */
        long f15096g;

        public b(String str) {
            this.f15090a = str;
            int i = d.this.f15066j;
            this.f15091b = new long[i];
            this.f15092c = new File[i];
            this.f15093d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i4 = 0; i4 < d.this.f15066j; i4++) {
                sb.append(i4);
                this.f15092c[i4] = new File(d.this.i, sb.toString());
                sb.append(".tmp");
                this.f15093d[i4] = new File(d.this.i, sb.toString());
                sb.setLength(length);
            }
        }

        private static IOException b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void a(String[] strArr) {
            if (strArr.length != d.this.f15066j) {
                throw b(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f15091b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw b(strArr);
                }
            }
        }

        public final void a(com.anythink.core.common.n.c.d dVar) {
            for (long j9 : this.f15091b) {
                dVar.l(32).o(j9);
            }
        }

        public final c a() {
            w wVar;
            if (Thread.holdsLock(d.this)) {
                w[] wVarArr = new w[d.this.f15066j];
                long[] jArr = (long[]) this.f15091b.clone();
                int i = 0;
                int i4 = 0;
                while (true) {
                    try {
                        d dVar = d.this;
                        if (i4 < dVar.f15066j) {
                            wVarArr[i4] = dVar.f15065h.a(this.f15092c[i4]);
                            i4++;
                        } else {
                            return dVar.new c(this.f15090a, this.f15096g, wVarArr, jArr);
                        }
                    } catch (FileNotFoundException unused) {
                        while (true) {
                            d dVar2 = d.this;
                            if (i < dVar2.f15066j && (wVar = wVarArr[i]) != null) {
                                com.anythink.core.common.n.b.a.c.a(wVar);
                                i++;
                            } else {
                                try {
                                    dVar2.a(this);
                                    return null;
                                } catch (IOException unused2) {
                                    return null;
                                }
                            }
                        }
                    }
                }
            } else {
                throw new AssertionError();
            }
        }
    }

    public final synchronized long d() {
        return this.f15060B;
    }

    public static d a(com.anythink.core.common.n.b.a.f.a aVar, File file, long j9) {
        if (j9 > 0) {
            return new d(aVar, file, j9, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.anythink.core.common.n.b.a.c.a(aa.f15620a + " DiskLruCache", true)));
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final synchronized c a(String str) {
        a();
        o();
        e(str);
        b bVar = this.f15068l.get(str);
        if (bVar != null && bVar.f15094e) {
            c a9 = bVar.a();
            if (a9 == null) {
                return null;
            }
            this.f15069m++;
            this.f15067k.b(f15058w).l(32).b(str).l(10);
            if (f()) {
                this.f15063E.execute(this.f15064F);
            }
            return a9;
        }
        return null;
    }

    public final a b(String str) {
        return a(str, f15052f);
    }

    public final synchronized a a(String str, long j9) {
        a();
        o();
        e(str);
        b bVar = this.f15068l.get(str);
        if (j9 != f15052f && (bVar == null || bVar.f15096g != j9)) {
            return null;
        }
        if (bVar != null && bVar.f15095f != null) {
            return null;
        }
        if (!this.f15073q && !this.f15074r) {
            this.f15067k.b(f15056u).l(32).b(str).l(10);
            this.f15067k.flush();
            if (this.f15070n) {
                return null;
            }
            if (bVar == null) {
                bVar = new b(str);
                this.f15068l.put(str, bVar);
            }
            a aVar = new a(bVar);
            bVar.f15095f = aVar;
            return aVar;
        }
        this.f15063E.execute(this.f15064F);
        return null;
    }

    private synchronized void a(long j9) {
        this.f15060B = j9;
        if (this.f15071o) {
            this.f15063E.execute(this.f15064F);
        }
    }

    public final synchronized void a(a aVar, boolean z8) {
        b bVar = aVar.f15085a;
        if (bVar.f15095f == aVar) {
            if (z8 && !bVar.f15094e) {
                for (int i = 0; i < this.f15066j; i++) {
                    if (aVar.f15086b[i]) {
                        if (!this.f15065h.e(bVar.f15093d[i])) {
                            aVar.c();
                            return;
                        }
                    } else {
                        aVar.c();
                        throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
                    }
                }
            }
            for (int i4 = 0; i4 < this.f15066j; i4++) {
                File file = bVar.f15093d[i4];
                if (z8) {
                    if (this.f15065h.e(file)) {
                        File file2 = bVar.f15092c[i4];
                        this.f15065h.a(file, file2);
                        long j9 = bVar.f15091b[i4];
                        long f6 = this.f15065h.f(file2);
                        bVar.f15091b[i4] = f6;
                        this.f15061C = (this.f15061C - j9) + f6;
                    }
                } else {
                    this.f15065h.d(file);
                }
            }
            this.f15069m++;
            bVar.f15095f = null;
            if (bVar.f15094e | z8) {
                bVar.f15094e = true;
                this.f15067k.b(f15055t).l(32);
                this.f15067k.b(bVar.f15090a);
                bVar.a(this.f15067k);
                this.f15067k.l(10);
                if (z8) {
                    long j10 = this.f15062D;
                    this.f15062D = 1 + j10;
                    bVar.f15096g = j10;
                }
            } else {
                this.f15068l.remove(bVar.f15090a);
                this.f15067k.b(f15057v).l(32);
                this.f15067k.b(bVar.f15090a);
                this.f15067k.l(10);
            }
            this.f15067k.flush();
            if (this.f15061C > this.f15060B || f()) {
                this.f15063E.execute(this.f15064F);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final boolean a(b bVar) {
        a aVar = bVar.f15095f;
        if (aVar != null) {
            aVar.a();
        }
        for (int i = 0; i < this.f15066j; i++) {
            this.f15065h.d(bVar.f15092c[i]);
            long j9 = this.f15061C;
            long[] jArr = bVar.f15091b;
            this.f15061C = j9 - jArr[i];
            jArr[i] = 0;
        }
        this.f15069m++;
        this.f15067k.b(f15057v).l(32).b(bVar.f15090a).l(10);
        this.f15068l.remove(bVar.f15090a);
        if (f()) {
            this.f15063E.execute(this.f15064F);
        }
        return true;
    }
}
