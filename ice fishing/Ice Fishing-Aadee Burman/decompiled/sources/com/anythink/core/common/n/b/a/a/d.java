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
    static final String f14889a = "journal";

    /* renamed from: b, reason: collision with root package name */
    static final String f14890b = "journal.tmp";

    /* renamed from: c, reason: collision with root package name */
    static final String f14891c = "journal.bkp";

    /* renamed from: d, reason: collision with root package name */
    static final String f14892d = "libcore.io.DiskLruCache";

    /* renamed from: e, reason: collision with root package name */
    static final String f14893e = "1";

    /* renamed from: f, reason: collision with root package name */
    static final long f14894f = -1;

    /* renamed from: g, reason: collision with root package name */
    static final Pattern f14895g = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: s, reason: collision with root package name */
    static final /* synthetic */ boolean f14896s = true;

    /* renamed from: t, reason: collision with root package name */
    private static final String f14897t = "CLEAN";

    /* renamed from: u, reason: collision with root package name */
    private static final String f14898u = "DIRTY";

    /* renamed from: v, reason: collision with root package name */
    private static final String f14899v = "REMOVE";

    /* renamed from: w, reason: collision with root package name */
    private static final String f14900w = "READ";

    /* renamed from: B, reason: collision with root package name */
    private long f14902B;

    /* renamed from: E, reason: collision with root package name */
    private final Executor f14905E;

    /* renamed from: h, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.f.a f14907h;
    final File i;

    /* renamed from: k, reason: collision with root package name */
    com.anythink.core.common.n.c.d f14909k;

    /* renamed from: m, reason: collision with root package name */
    int f14911m;

    /* renamed from: n, reason: collision with root package name */
    boolean f14912n;

    /* renamed from: o, reason: collision with root package name */
    boolean f14913o;

    /* renamed from: p, reason: collision with root package name */
    boolean f14914p;

    /* renamed from: q, reason: collision with root package name */
    boolean f14915q;

    /* renamed from: r, reason: collision with root package name */
    boolean f14916r;

    /* renamed from: x, reason: collision with root package name */
    private final File f14917x;

    /* renamed from: y, reason: collision with root package name */
    private final File f14918y;

    /* renamed from: z, reason: collision with root package name */
    private final File f14919z;

    /* renamed from: C, reason: collision with root package name */
    private long f14903C = 0;

    /* renamed from: l, reason: collision with root package name */
    final LinkedHashMap<String, b> f14910l = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: D, reason: collision with root package name */
    private long f14904D = 0;

    /* renamed from: F, reason: collision with root package name */
    private final Runnable f14906F = new Runnable() { // from class: com.anythink.core.common.n.b.a.a.d.1
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (d.this) {
                d dVar = d.this;
                if ((!dVar.f14913o) || dVar.f14914p) {
                    return;
                }
                try {
                    dVar.h();
                } catch (IOException unused) {
                    d.this.f14915q = true;
                }
                try {
                    if (d.this.f()) {
                        d.this.b();
                        d.this.f14911m = 0;
                    }
                } catch (IOException unused2) {
                    d dVar2 = d.this;
                    dVar2.f14916r = true;
                    dVar2.f14909k = n.a(n.a());
                }
            }
        }
    };

    /* renamed from: A, reason: collision with root package name */
    private final int f14901A = 201105;

    /* renamed from: j, reason: collision with root package name */
    final int f14908j = 2;

    public final class c implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        private final String f14941b;

        /* renamed from: c, reason: collision with root package name */
        private final long f14942c;

        /* renamed from: d, reason: collision with root package name */
        private final w[] f14943d;

        /* renamed from: e, reason: collision with root package name */
        private final long[] f14944e;

        public c(String str, long j6, w[] wVarArr, long[] jArr) {
            this.f14941b = str;
            this.f14942c = j6;
            this.f14943d = wVarArr;
            this.f14944e = jArr;
        }

        private String b() {
            return this.f14941b;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (w wVar : this.f14943d) {
                com.anythink.core.common.n.b.a.c.a(wVar);
            }
        }

        private long b(int i) {
            return this.f14944e[i];
        }

        public final a a() {
            return d.this.a(this.f14941b, this.f14942c);
        }

        public final w a(int i) {
            return this.f14943d[i];
        }
    }

    private d(com.anythink.core.common.n.b.a.f.a aVar, File file, long j6, Executor executor) {
        this.f14907h = aVar;
        this.i = file;
        this.f14917x = new File(file, f14889a);
        this.f14918y = new File(file, f14890b);
        this.f14919z = new File(file, f14891c);
        this.f14902B = j6;
        this.f14905E = executor;
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
            if (indexOf == 6 && str.startsWith(f14899v)) {
                this.f14910l.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        b bVar = this.f14910l.get(substring);
        if (bVar == null) {
            bVar = new b(substring);
            this.f14910l.put(substring, bVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith(f14897t)) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            bVar.f14936e = true;
            bVar.f14937f = null;
            bVar.a(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith(f14898u)) {
            bVar.f14937f = new a(bVar);
        } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith(f14900w)) {
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
        com.anythink.core.common.n.c.e a9 = n.a(this.f14907h.a(this.f14917x));
        try {
            String w6 = a9.w();
            String w9 = a9.w();
            String w10 = a9.w();
            String w11 = a9.w();
            String w12 = a9.w();
            if (!f14892d.equals(w6) || !"1".equals(w9) || !Integer.toString(this.f14901A).equals(w10) || !Integer.toString(this.f14908j).equals(w11) || !"".equals(w12)) {
                throw new IOException("unexpected journal header: [" + w6 + ", " + w9 + ", " + w11 + ", " + w12 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    String w13 = a9.w();
                    int indexOf = w13.indexOf(32);
                    if (indexOf == -1) {
                        throw new IOException("unexpected journal line: ".concat(w13));
                    }
                    int i6 = indexOf + 1;
                    int indexOf2 = w13.indexOf(32, i6);
                    if (indexOf2 == -1) {
                        substring = w13.substring(i6);
                        if (indexOf == 6 && w13.startsWith(f14899v)) {
                            this.f14910l.remove(substring);
                            i++;
                        }
                    } else {
                        substring = w13.substring(i6, indexOf2);
                    }
                    b bVar = this.f14910l.get(substring);
                    if (bVar == null) {
                        bVar = new b(substring);
                        this.f14910l.put(substring, bVar);
                    }
                    if (indexOf2 != -1 && indexOf == 5 && w13.startsWith(f14897t)) {
                        String[] split = w13.substring(indexOf2 + 1).split(" ");
                        bVar.f14936e = true;
                        bVar.f14937f = null;
                        bVar.a(split);
                    } else if (indexOf2 == -1 && indexOf == 5 && w13.startsWith(f14898u)) {
                        bVar.f14937f = new a(bVar);
                    } else if (indexOf2 != -1 || indexOf != 4 || !w13.startsWith(f14900w)) {
                        break;
                    }
                    i++;
                } catch (EOFException unused) {
                    this.f14911m = i - this.f14910l.size();
                    if (a9.g()) {
                        this.f14909k = m();
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
        return n.a(new e(this.f14907h.c(this.f14917x)) { // from class: com.anythink.core.common.n.b.a.a.d.2

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ boolean f14921a = true;

            @Override // com.anythink.core.common.n.b.a.a.e
            public final void b() {
                if (!f14921a && !Thread.holdsLock(d.this)) {
                    throw new AssertionError();
                }
                d.this.f14912n = true;
            }
        });
    }

    private void n() {
        this.f14907h.d(this.f14918y);
        Iterator<b> it = this.f14910l.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i = 0;
            if (next.f14937f == null) {
                while (i < this.f14908j) {
                    this.f14903C += next.f14933b[i];
                    i++;
                }
            } else {
                next.f14937f = null;
                while (i < this.f14908j) {
                    this.f14907h.d(next.f14934c[i]);
                    this.f14907h.d(next.f14935d[i]);
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
            if (!f14896s && !Thread.holdsLock(this)) {
                throw new AssertionError();
            }
            if (this.f14913o) {
                return;
            }
            if (this.f14907h.e(this.f14919z)) {
                if (this.f14907h.e(this.f14917x)) {
                    this.f14907h.d(this.f14919z);
                } else {
                    this.f14907h.a(this.f14919z, this.f14917x);
                }
            }
            if (this.f14907h.e(this.f14917x)) {
                try {
                    l();
                    n();
                    this.f14913o = true;
                    return;
                } catch (IOException e9) {
                    com.anythink.core.common.n.b.a.g.c.e().a(5, "DiskLruCache " + this.i + " is corrupt: " + e9.getMessage() + ", removing", e9);
                    try {
                        i();
                        this.f14914p = false;
                    } catch (Throwable th) {
                        this.f14914p = false;
                        throw th;
                    }
                }
            }
            b();
            this.f14913o = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            com.anythink.core.common.n.c.d dVar = this.f14909k;
            if (dVar != null) {
                dVar.close();
            }
            com.anythink.core.common.n.c.d a9 = n.a(this.f14907h.b(this.f14918y));
            try {
                a9.b(f14892d).l(10);
                a9.b("1").l(10);
                a9.o(this.f14901A).l(10);
                a9.o(this.f14908j).l(10);
                a9.l(10);
                for (b bVar : this.f14910l.values()) {
                    if (bVar.f14937f != null) {
                        a9.b(f14898u).l(32);
                        a9.b(bVar.f14932a);
                        a9.l(10);
                    } else {
                        a9.b(f14897t).l(32);
                        a9.b(bVar.f14932a);
                        bVar.a(a9);
                        a9.l(10);
                    }
                }
                a9.close();
                if (this.f14907h.e(this.f14917x)) {
                    this.f14907h.a(this.f14917x, this.f14919z);
                }
                this.f14907h.a(this.f14918y, this.f14917x);
                this.f14907h.d(this.f14919z);
                this.f14909k = m();
                this.f14912n = false;
                this.f14916r = false;
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
            if (this.f14913o && !this.f14914p) {
                for (b bVar : (b[]) this.f14910l.values().toArray(new b[this.f14910l.size()])) {
                    a aVar = bVar.f14937f;
                    if (aVar != null) {
                        aVar.c();
                    }
                }
                h();
                this.f14909k.close();
                this.f14909k = null;
                this.f14914p = true;
                return;
            }
            this.f14914p = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long e() {
        a();
        return this.f14903C;
    }

    public final boolean f() {
        int i = this.f14911m;
        return i >= 2000 && i >= this.f14910l.size();
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f14913o) {
            o();
            h();
            this.f14909k.flush();
        }
    }

    public final synchronized boolean g() {
        return this.f14914p;
    }

    public final void h() {
        while (this.f14903C > this.f14902B) {
            a(this.f14910l.values().iterator().next());
        }
        this.f14915q = false;
    }

    public final void i() {
        close();
        this.f14907h.g(this.i);
    }

    public final synchronized void j() {
        try {
            a();
            for (b bVar : (b[]) this.f14910l.values().toArray(new b[this.f14910l.size()])) {
                a(bVar);
            }
            this.f14915q = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Iterator<c> k() {
        a();
        return new Iterator<c>() { // from class: com.anythink.core.common.n.b.a.a.d.3

            /* renamed from: a, reason: collision with root package name */
            final Iterator<b> f14923a;

            /* renamed from: b, reason: collision with root package name */
            c f14924b;

            /* renamed from: c, reason: collision with root package name */
            c f14925c;

            {
                this.f14923a = new ArrayList(d.this.f14910l.values()).iterator();
            }

            private c a() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                c cVar = this.f14924b;
                this.f14925c = cVar;
                this.f14924b = null;
                return cVar;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                c a9;
                if (this.f14924b != null) {
                    return true;
                }
                synchronized (d.this) {
                    try {
                        if (d.this.f14914p) {
                            return false;
                        }
                        while (this.f14923a.hasNext()) {
                            b next = this.f14923a.next();
                            if (next.f14936e && (a9 = next.a()) != null) {
                                this.f14924b = a9;
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
                c cVar = this.f14924b;
                this.f14925c = cVar;
                this.f14924b = null;
                return cVar;
            }

            @Override // java.util.Iterator
            public final void remove() {
                c cVar = this.f14925c;
                if (cVar == null) {
                    throw new IllegalStateException("remove() before next()");
                }
                try {
                    d.this.c(cVar.f14941b);
                } catch (IOException unused) {
                } finally {
                    this.f14925c = null;
                }
            }
        };
    }

    public final synchronized boolean c(String str) {
        a();
        o();
        e(str);
        b bVar = this.f14910l.get(str);
        if (bVar == null) {
            return false;
        }
        a(bVar);
        if (this.f14903C <= this.f14902B) {
            this.f14915q = false;
        }
        return true;
    }

    private static void e(String str) {
        if (!f14895g.matcher(str).matches()) {
            throw new IllegalArgumentException(y.o("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        final b f14927a;

        /* renamed from: b, reason: collision with root package name */
        final boolean[] f14928b;

        /* renamed from: d, reason: collision with root package name */
        private boolean f14930d;

        public a(b bVar) {
            this.f14927a = bVar;
            this.f14928b = bVar.f14936e ? null : new boolean[d.this.f14908j];
        }

        private w b(int i) {
            synchronized (d.this) {
                if (this.f14930d) {
                    throw new IllegalStateException();
                }
                b bVar = this.f14927a;
                if (!bVar.f14936e || bVar.f14937f != this) {
                    return null;
                }
                try {
                    return d.this.f14907h.a(bVar.f14934c[i]);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        private void d() {
            synchronized (d.this) {
                if (!this.f14930d && this.f14927a.f14937f == this) {
                    try {
                        d.this.a(this, false);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public final void a() {
            if (this.f14927a.f14937f != this) {
                return;
            }
            int i = 0;
            while (true) {
                d dVar = d.this;
                if (i >= dVar.f14908j) {
                    this.f14927a.f14937f = null;
                    return;
                } else {
                    try {
                        dVar.f14907h.d(this.f14927a.f14935d[i]);
                    } catch (IOException unused) {
                    }
                    i++;
                }
            }
        }

        public final void c() {
            synchronized (d.this) {
                try {
                    if (this.f14930d) {
                        throw new IllegalStateException();
                    }
                    if (this.f14927a.f14937f == this) {
                        d.this.a(this, false);
                    }
                    this.f14930d = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final v a(int i) {
            synchronized (d.this) {
                try {
                    if (!this.f14930d) {
                        b bVar = this.f14927a;
                        if (bVar.f14937f != this) {
                            return n.a();
                        }
                        if (!bVar.f14936e) {
                            this.f14928b[i] = true;
                        }
                        try {
                            return new e(d.this.f14907h.b(bVar.f14935d[i])) { // from class: com.anythink.core.common.n.b.a.a.d.a.1
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
                    if (!this.f14930d) {
                        if (this.f14927a.f14937f == this) {
                            d.this.a(this, true);
                        }
                        this.f14930d = true;
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
        final String f14932a;

        /* renamed from: b, reason: collision with root package name */
        final long[] f14933b;

        /* renamed from: c, reason: collision with root package name */
        final File[] f14934c;

        /* renamed from: d, reason: collision with root package name */
        final File[] f14935d;

        /* renamed from: e, reason: collision with root package name */
        boolean f14936e;

        /* renamed from: f, reason: collision with root package name */
        a f14937f;

        /* renamed from: g, reason: collision with root package name */
        long f14938g;

        public b(String str) {
            this.f14932a = str;
            int i = d.this.f14908j;
            this.f14933b = new long[i];
            this.f14934c = new File[i];
            this.f14935d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i6 = 0; i6 < d.this.f14908j; i6++) {
                sb.append(i6);
                this.f14934c[i6] = new File(d.this.i, sb.toString());
                sb.append(".tmp");
                this.f14935d[i6] = new File(d.this.i, sb.toString());
                sb.setLength(length);
            }
        }

        private static IOException b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void a(String[] strArr) {
            if (strArr.length != d.this.f14908j) {
                throw b(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f14933b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw b(strArr);
                }
            }
        }

        public final void a(com.anythink.core.common.n.c.d dVar) {
            for (long j6 : this.f14933b) {
                dVar.l(32).o(j6);
            }
        }

        public final c a() {
            w wVar;
            if (Thread.holdsLock(d.this)) {
                w[] wVarArr = new w[d.this.f14908j];
                long[] jArr = (long[]) this.f14933b.clone();
                int i = 0;
                int i6 = 0;
                while (true) {
                    try {
                        d dVar = d.this;
                        if (i6 < dVar.f14908j) {
                            wVarArr[i6] = dVar.f14907h.a(this.f14934c[i6]);
                            i6++;
                        } else {
                            return dVar.new c(this.f14932a, this.f14938g, wVarArr, jArr);
                        }
                    } catch (FileNotFoundException unused) {
                        while (true) {
                            d dVar2 = d.this;
                            if (i < dVar2.f14908j && (wVar = wVarArr[i]) != null) {
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
        return this.f14902B;
    }

    public static d a(com.anythink.core.common.n.b.a.f.a aVar, File file, long j6) {
        if (j6 > 0) {
            return new d(aVar, file, j6, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.anythink.core.common.n.b.a.c.a(aa.f15462a + " DiskLruCache", true)));
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final synchronized c a(String str) {
        a();
        o();
        e(str);
        b bVar = this.f14910l.get(str);
        if (bVar != null && bVar.f14936e) {
            c a9 = bVar.a();
            if (a9 == null) {
                return null;
            }
            this.f14911m++;
            this.f14909k.b(f14900w).l(32).b(str).l(10);
            if (f()) {
                this.f14905E.execute(this.f14906F);
            }
            return a9;
        }
        return null;
    }

    public final a b(String str) {
        return a(str, f14894f);
    }

    public final synchronized a a(String str, long j6) {
        a();
        o();
        e(str);
        b bVar = this.f14910l.get(str);
        if (j6 != f14894f && (bVar == null || bVar.f14938g != j6)) {
            return null;
        }
        if (bVar != null && bVar.f14937f != null) {
            return null;
        }
        if (!this.f14915q && !this.f14916r) {
            this.f14909k.b(f14898u).l(32).b(str).l(10);
            this.f14909k.flush();
            if (this.f14912n) {
                return null;
            }
            if (bVar == null) {
                bVar = new b(str);
                this.f14910l.put(str, bVar);
            }
            a aVar = new a(bVar);
            bVar.f14937f = aVar;
            return aVar;
        }
        this.f14905E.execute(this.f14906F);
        return null;
    }

    private synchronized void a(long j6) {
        this.f14902B = j6;
        if (this.f14913o) {
            this.f14905E.execute(this.f14906F);
        }
    }

    public final synchronized void a(a aVar, boolean z3) {
        b bVar = aVar.f14927a;
        if (bVar.f14937f == aVar) {
            if (z3 && !bVar.f14936e) {
                for (int i = 0; i < this.f14908j; i++) {
                    if (aVar.f14928b[i]) {
                        if (!this.f14907h.e(bVar.f14935d[i])) {
                            aVar.c();
                            return;
                        }
                    } else {
                        aVar.c();
                        throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
                    }
                }
            }
            for (int i6 = 0; i6 < this.f14908j; i6++) {
                File file = bVar.f14935d[i6];
                if (z3) {
                    if (this.f14907h.e(file)) {
                        File file2 = bVar.f14934c[i6];
                        this.f14907h.a(file, file2);
                        long j6 = bVar.f14933b[i6];
                        long f3 = this.f14907h.f(file2);
                        bVar.f14933b[i6] = f3;
                        this.f14903C = (this.f14903C - j6) + f3;
                    }
                } else {
                    this.f14907h.d(file);
                }
            }
            this.f14911m++;
            bVar.f14937f = null;
            if (bVar.f14936e | z3) {
                bVar.f14936e = true;
                this.f14909k.b(f14897t).l(32);
                this.f14909k.b(bVar.f14932a);
                bVar.a(this.f14909k);
                this.f14909k.l(10);
                if (z3) {
                    long j9 = this.f14904D;
                    this.f14904D = 1 + j9;
                    bVar.f14938g = j9;
                }
            } else {
                this.f14910l.remove(bVar.f14932a);
                this.f14909k.b(f14899v).l(32);
                this.f14909k.b(bVar.f14932a);
                this.f14909k.l(10);
            }
            this.f14909k.flush();
            if (this.f14903C > this.f14902B || f()) {
                this.f14905E.execute(this.f14906F);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final boolean a(b bVar) {
        a aVar = bVar.f14937f;
        if (aVar != null) {
            aVar.a();
        }
        for (int i = 0; i < this.f14908j; i++) {
            this.f14907h.d(bVar.f14934c[i]);
            long j6 = this.f14903C;
            long[] jArr = bVar.f14933b;
            this.f14903C = j6 - jArr[i];
            jArr[i] = 0;
        }
        this.f14911m++;
        this.f14909k.b(f14899v).l(32).b(bVar.f14932a).l(10);
        this.f14910l.remove(bVar.f14932a);
        if (f()) {
            this.f14905E.execute(this.f14906F);
        }
        return true;
    }
}
