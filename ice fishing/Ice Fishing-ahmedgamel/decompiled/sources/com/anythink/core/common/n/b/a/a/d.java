package com.anythink.core.common.n.b.a.a;

import D.x;
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
    static final String f15676a = "journal";

    /* renamed from: b, reason: collision with root package name */
    static final String f15677b = "journal.tmp";

    /* renamed from: c, reason: collision with root package name */
    static final String f15678c = "journal.bkp";

    /* renamed from: d, reason: collision with root package name */
    static final String f15679d = "libcore.io.DiskLruCache";

    /* renamed from: e, reason: collision with root package name */
    static final String f15680e = "1";

    /* renamed from: f, reason: collision with root package name */
    static final long f15681f = -1;

    /* renamed from: g, reason: collision with root package name */
    static final Pattern f15682g = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: s, reason: collision with root package name */
    static final /* synthetic */ boolean f15683s = true;

    /* renamed from: t, reason: collision with root package name */
    private static final String f15684t = "CLEAN";

    /* renamed from: u, reason: collision with root package name */
    private static final String f15685u = "DIRTY";

    /* renamed from: v, reason: collision with root package name */
    private static final String f15686v = "REMOVE";

    /* renamed from: w, reason: collision with root package name */
    private static final String f15687w = "READ";

    /* renamed from: B, reason: collision with root package name */
    private long f15689B;

    /* renamed from: E, reason: collision with root package name */
    private final Executor f15692E;

    /* renamed from: h, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.f.a f15694h;
    final File i;

    /* renamed from: k, reason: collision with root package name */
    com.anythink.core.common.n.c.d f15696k;

    /* renamed from: m, reason: collision with root package name */
    int f15698m;

    /* renamed from: n, reason: collision with root package name */
    boolean f15699n;

    /* renamed from: o, reason: collision with root package name */
    boolean f15700o;

    /* renamed from: p, reason: collision with root package name */
    boolean f15701p;

    /* renamed from: q, reason: collision with root package name */
    boolean f15702q;

    /* renamed from: r, reason: collision with root package name */
    boolean f15703r;

    /* renamed from: x, reason: collision with root package name */
    private final File f15704x;

    /* renamed from: y, reason: collision with root package name */
    private final File f15705y;

    /* renamed from: z, reason: collision with root package name */
    private final File f15706z;

    /* renamed from: C, reason: collision with root package name */
    private long f15690C = 0;

    /* renamed from: l, reason: collision with root package name */
    final LinkedHashMap<String, b> f15697l = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: D, reason: collision with root package name */
    private long f15691D = 0;

    /* renamed from: F, reason: collision with root package name */
    private final Runnable f15693F = new Runnable() { // from class: com.anythink.core.common.n.b.a.a.d.1
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (d.this) {
                d dVar = d.this;
                if ((!dVar.f15700o) || dVar.f15701p) {
                    return;
                }
                try {
                    dVar.h();
                } catch (IOException unused) {
                    d.this.f15702q = true;
                }
                try {
                    if (d.this.f()) {
                        d.this.b();
                        d.this.f15698m = 0;
                    }
                } catch (IOException unused2) {
                    d dVar2 = d.this;
                    dVar2.f15703r = true;
                    dVar2.f15696k = n.a(n.a());
                }
            }
        }
    };

    /* renamed from: A, reason: collision with root package name */
    private final int f15688A = 201105;

    /* renamed from: j, reason: collision with root package name */
    final int f15695j = 2;

    public final class c implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        private final String f15728b;

        /* renamed from: c, reason: collision with root package name */
        private final long f15729c;

        /* renamed from: d, reason: collision with root package name */
        private final w[] f15730d;

        /* renamed from: e, reason: collision with root package name */
        private final long[] f15731e;

        public c(String str, long j6, w[] wVarArr, long[] jArr) {
            this.f15728b = str;
            this.f15729c = j6;
            this.f15730d = wVarArr;
            this.f15731e = jArr;
        }

        private String b() {
            return this.f15728b;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (w wVar : this.f15730d) {
                com.anythink.core.common.n.b.a.c.a(wVar);
            }
        }

        private long b(int i) {
            return this.f15731e[i];
        }

        public final a a() {
            return d.this.a(this.f15728b, this.f15729c);
        }

        public final w a(int i) {
            return this.f15730d[i];
        }
    }

    private d(com.anythink.core.common.n.b.a.f.a aVar, File file, long j6, Executor executor) {
        this.f15694h = aVar;
        this.i = file;
        this.f15704x = new File(file, f15676a);
        this.f15705y = new File(file, f15677b);
        this.f15706z = new File(file, f15678c);
        this.f15689B = j6;
        this.f15692E = executor;
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
            if (indexOf == 6 && str.startsWith(f15686v)) {
                this.f15697l.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        b bVar = this.f15697l.get(substring);
        if (bVar == null) {
            bVar = new b(substring);
            this.f15697l.put(substring, bVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith(f15684t)) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            bVar.f15723e = true;
            bVar.f15724f = null;
            bVar.a(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith(f15685u)) {
            bVar.f15724f = new a(bVar);
        } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith(f15687w)) {
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
        com.anythink.core.common.n.c.e a9 = n.a(this.f15694h.a(this.f15704x));
        try {
            String w3 = a9.w();
            String w6 = a9.w();
            String w9 = a9.w();
            String w10 = a9.w();
            String w11 = a9.w();
            if (!f15679d.equals(w3) || !"1".equals(w6) || !Integer.toString(this.f15688A).equals(w9) || !Integer.toString(this.f15695j).equals(w10) || !"".equals(w11)) {
                throw new IOException("unexpected journal header: [" + w3 + ", " + w6 + ", " + w10 + ", " + w11 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    String w12 = a9.w();
                    int indexOf = w12.indexOf(32);
                    if (indexOf == -1) {
                        throw new IOException("unexpected journal line: ".concat(w12));
                    }
                    int i4 = indexOf + 1;
                    int indexOf2 = w12.indexOf(32, i4);
                    if (indexOf2 == -1) {
                        substring = w12.substring(i4);
                        if (indexOf == 6 && w12.startsWith(f15686v)) {
                            this.f15697l.remove(substring);
                            i++;
                        }
                    } else {
                        substring = w12.substring(i4, indexOf2);
                    }
                    b bVar = this.f15697l.get(substring);
                    if (bVar == null) {
                        bVar = new b(substring);
                        this.f15697l.put(substring, bVar);
                    }
                    if (indexOf2 != -1 && indexOf == 5 && w12.startsWith(f15684t)) {
                        String[] split = w12.substring(indexOf2 + 1).split(" ");
                        bVar.f15723e = true;
                        bVar.f15724f = null;
                        bVar.a(split);
                    } else if (indexOf2 == -1 && indexOf == 5 && w12.startsWith(f15685u)) {
                        bVar.f15724f = new a(bVar);
                    } else if (indexOf2 != -1 || indexOf != 4 || !w12.startsWith(f15687w)) {
                        break;
                    }
                    i++;
                } catch (EOFException unused) {
                    this.f15698m = i - this.f15697l.size();
                    if (a9.g()) {
                        this.f15696k = m();
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
        return n.a(new e(this.f15694h.c(this.f15704x)) { // from class: com.anythink.core.common.n.b.a.a.d.2

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ boolean f15708a = true;

            @Override // com.anythink.core.common.n.b.a.a.e
            public final void b() {
                if (!f15708a && !Thread.holdsLock(d.this)) {
                    throw new AssertionError();
                }
                d.this.f15699n = true;
            }
        });
    }

    private void n() {
        this.f15694h.d(this.f15705y);
        Iterator<b> it = this.f15697l.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i = 0;
            if (next.f15724f == null) {
                while (i < this.f15695j) {
                    this.f15690C += next.f15720b[i];
                    i++;
                }
            } else {
                next.f15724f = null;
                while (i < this.f15695j) {
                    this.f15694h.d(next.f15721c[i]);
                    this.f15694h.d(next.f15722d[i]);
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
            if (!f15683s && !Thread.holdsLock(this)) {
                throw new AssertionError();
            }
            if (this.f15700o) {
                return;
            }
            if (this.f15694h.e(this.f15706z)) {
                if (this.f15694h.e(this.f15704x)) {
                    this.f15694h.d(this.f15706z);
                } else {
                    this.f15694h.a(this.f15706z, this.f15704x);
                }
            }
            if (this.f15694h.e(this.f15704x)) {
                try {
                    l();
                    n();
                    this.f15700o = true;
                    return;
                } catch (IOException e9) {
                    com.anythink.core.common.n.b.a.g.c.e().a(5, "DiskLruCache " + this.i + " is corrupt: " + e9.getMessage() + ", removing", e9);
                    try {
                        i();
                        this.f15701p = false;
                    } catch (Throwable th) {
                        this.f15701p = false;
                        throw th;
                    }
                }
            }
            b();
            this.f15700o = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            com.anythink.core.common.n.c.d dVar = this.f15696k;
            if (dVar != null) {
                dVar.close();
            }
            com.anythink.core.common.n.c.d a9 = n.a(this.f15694h.b(this.f15705y));
            try {
                a9.b(f15679d).l(10);
                a9.b("1").l(10);
                a9.o(this.f15688A).l(10);
                a9.o(this.f15695j).l(10);
                a9.l(10);
                for (b bVar : this.f15697l.values()) {
                    if (bVar.f15724f != null) {
                        a9.b(f15685u).l(32);
                        a9.b(bVar.f15719a);
                        a9.l(10);
                    } else {
                        a9.b(f15684t).l(32);
                        a9.b(bVar.f15719a);
                        bVar.a(a9);
                        a9.l(10);
                    }
                }
                a9.close();
                if (this.f15694h.e(this.f15704x)) {
                    this.f15694h.a(this.f15704x, this.f15706z);
                }
                this.f15694h.a(this.f15705y, this.f15704x);
                this.f15694h.d(this.f15706z);
                this.f15696k = m();
                this.f15699n = false;
                this.f15703r = false;
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
            if (this.f15700o && !this.f15701p) {
                for (b bVar : (b[]) this.f15697l.values().toArray(new b[this.f15697l.size()])) {
                    a aVar = bVar.f15724f;
                    if (aVar != null) {
                        aVar.c();
                    }
                }
                h();
                this.f15696k.close();
                this.f15696k = null;
                this.f15701p = true;
                return;
            }
            this.f15701p = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long e() {
        a();
        return this.f15690C;
    }

    public final boolean f() {
        int i = this.f15698m;
        return i >= 2000 && i >= this.f15697l.size();
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f15700o) {
            o();
            h();
            this.f15696k.flush();
        }
    }

    public final synchronized boolean g() {
        return this.f15701p;
    }

    public final void h() {
        while (this.f15690C > this.f15689B) {
            a(this.f15697l.values().iterator().next());
        }
        this.f15702q = false;
    }

    public final void i() {
        close();
        this.f15694h.g(this.i);
    }

    public final synchronized void j() {
        try {
            a();
            for (b bVar : (b[]) this.f15697l.values().toArray(new b[this.f15697l.size()])) {
                a(bVar);
            }
            this.f15702q = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Iterator<c> k() {
        a();
        return new Iterator<c>() { // from class: com.anythink.core.common.n.b.a.a.d.3

            /* renamed from: a, reason: collision with root package name */
            final Iterator<b> f15710a;

            /* renamed from: b, reason: collision with root package name */
            c f15711b;

            /* renamed from: c, reason: collision with root package name */
            c f15712c;

            {
                this.f15710a = new ArrayList(d.this.f15697l.values()).iterator();
            }

            private c a() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                c cVar = this.f15711b;
                this.f15712c = cVar;
                this.f15711b = null;
                return cVar;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                c a9;
                if (this.f15711b != null) {
                    return true;
                }
                synchronized (d.this) {
                    try {
                        if (d.this.f15701p) {
                            return false;
                        }
                        while (this.f15710a.hasNext()) {
                            b next = this.f15710a.next();
                            if (next.f15723e && (a9 = next.a()) != null) {
                                this.f15711b = a9;
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
                c cVar = this.f15711b;
                this.f15712c = cVar;
                this.f15711b = null;
                return cVar;
            }

            @Override // java.util.Iterator
            public final void remove() {
                c cVar = this.f15712c;
                if (cVar == null) {
                    throw new IllegalStateException("remove() before next()");
                }
                try {
                    d.this.c(cVar.f15728b);
                } catch (IOException unused) {
                } finally {
                    this.f15712c = null;
                }
            }
        };
    }

    public final synchronized boolean c(String str) {
        a();
        o();
        e(str);
        b bVar = this.f15697l.get(str);
        if (bVar == null) {
            return false;
        }
        a(bVar);
        if (this.f15690C <= this.f15689B) {
            this.f15702q = false;
        }
        return true;
    }

    private static void e(String str) {
        if (!f15682g.matcher(str).matches()) {
            throw new IllegalArgumentException(x.l("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        final b f15714a;

        /* renamed from: b, reason: collision with root package name */
        final boolean[] f15715b;

        /* renamed from: d, reason: collision with root package name */
        private boolean f15717d;

        public a(b bVar) {
            this.f15714a = bVar;
            this.f15715b = bVar.f15723e ? null : new boolean[d.this.f15695j];
        }

        private w b(int i) {
            synchronized (d.this) {
                if (this.f15717d) {
                    throw new IllegalStateException();
                }
                b bVar = this.f15714a;
                if (!bVar.f15723e || bVar.f15724f != this) {
                    return null;
                }
                try {
                    return d.this.f15694h.a(bVar.f15721c[i]);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        private void d() {
            synchronized (d.this) {
                if (!this.f15717d && this.f15714a.f15724f == this) {
                    try {
                        d.this.a(this, false);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public final void a() {
            if (this.f15714a.f15724f != this) {
                return;
            }
            int i = 0;
            while (true) {
                d dVar = d.this;
                if (i >= dVar.f15695j) {
                    this.f15714a.f15724f = null;
                    return;
                } else {
                    try {
                        dVar.f15694h.d(this.f15714a.f15722d[i]);
                    } catch (IOException unused) {
                    }
                    i++;
                }
            }
        }

        public final void c() {
            synchronized (d.this) {
                try {
                    if (this.f15717d) {
                        throw new IllegalStateException();
                    }
                    if (this.f15714a.f15724f == this) {
                        d.this.a(this, false);
                    }
                    this.f15717d = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final v a(int i) {
            synchronized (d.this) {
                try {
                    if (!this.f15717d) {
                        b bVar = this.f15714a;
                        if (bVar.f15724f != this) {
                            return n.a();
                        }
                        if (!bVar.f15723e) {
                            this.f15715b[i] = true;
                        }
                        try {
                            return new e(d.this.f15694h.b(bVar.f15722d[i])) { // from class: com.anythink.core.common.n.b.a.a.d.a.1
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
                    if (!this.f15717d) {
                        if (this.f15714a.f15724f == this) {
                            d.this.a(this, true);
                        }
                        this.f15717d = true;
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
        final String f15719a;

        /* renamed from: b, reason: collision with root package name */
        final long[] f15720b;

        /* renamed from: c, reason: collision with root package name */
        final File[] f15721c;

        /* renamed from: d, reason: collision with root package name */
        final File[] f15722d;

        /* renamed from: e, reason: collision with root package name */
        boolean f15723e;

        /* renamed from: f, reason: collision with root package name */
        a f15724f;

        /* renamed from: g, reason: collision with root package name */
        long f15725g;

        public b(String str) {
            this.f15719a = str;
            int i = d.this.f15695j;
            this.f15720b = new long[i];
            this.f15721c = new File[i];
            this.f15722d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i4 = 0; i4 < d.this.f15695j; i4++) {
                sb.append(i4);
                this.f15721c[i4] = new File(d.this.i, sb.toString());
                sb.append(".tmp");
                this.f15722d[i4] = new File(d.this.i, sb.toString());
                sb.setLength(length);
            }
        }

        private static IOException b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void a(String[] strArr) {
            if (strArr.length != d.this.f15695j) {
                throw b(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f15720b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw b(strArr);
                }
            }
        }

        public final void a(com.anythink.core.common.n.c.d dVar) {
            for (long j6 : this.f15720b) {
                dVar.l(32).o(j6);
            }
        }

        public final c a() {
            w wVar;
            if (Thread.holdsLock(d.this)) {
                w[] wVarArr = new w[d.this.f15695j];
                long[] jArr = (long[]) this.f15720b.clone();
                int i = 0;
                int i4 = 0;
                while (true) {
                    try {
                        d dVar = d.this;
                        if (i4 < dVar.f15695j) {
                            wVarArr[i4] = dVar.f15694h.a(this.f15721c[i4]);
                            i4++;
                        } else {
                            return dVar.new c(this.f15719a, this.f15725g, wVarArr, jArr);
                        }
                    } catch (FileNotFoundException unused) {
                        while (true) {
                            d dVar2 = d.this;
                            if (i < dVar2.f15695j && (wVar = wVarArr[i]) != null) {
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
        return this.f15689B;
    }

    public static d a(com.anythink.core.common.n.b.a.f.a aVar, File file, long j6) {
        if (j6 > 0) {
            return new d(aVar, file, j6, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.anythink.core.common.n.b.a.c.a(aa.f16249a + " DiskLruCache", true)));
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final synchronized c a(String str) {
        a();
        o();
        e(str);
        b bVar = this.f15697l.get(str);
        if (bVar != null && bVar.f15723e) {
            c a9 = bVar.a();
            if (a9 == null) {
                return null;
            }
            this.f15698m++;
            this.f15696k.b(f15687w).l(32).b(str).l(10);
            if (f()) {
                this.f15692E.execute(this.f15693F);
            }
            return a9;
        }
        return null;
    }

    public final a b(String str) {
        return a(str, f15681f);
    }

    public final synchronized a a(String str, long j6) {
        a();
        o();
        e(str);
        b bVar = this.f15697l.get(str);
        if (j6 != f15681f && (bVar == null || bVar.f15725g != j6)) {
            return null;
        }
        if (bVar != null && bVar.f15724f != null) {
            return null;
        }
        if (!this.f15702q && !this.f15703r) {
            this.f15696k.b(f15685u).l(32).b(str).l(10);
            this.f15696k.flush();
            if (this.f15699n) {
                return null;
            }
            if (bVar == null) {
                bVar = new b(str);
                this.f15697l.put(str, bVar);
            }
            a aVar = new a(bVar);
            bVar.f15724f = aVar;
            return aVar;
        }
        this.f15692E.execute(this.f15693F);
        return null;
    }

    private synchronized void a(long j6) {
        this.f15689B = j6;
        if (this.f15700o) {
            this.f15692E.execute(this.f15693F);
        }
    }

    public final synchronized void a(a aVar, boolean z6) {
        b bVar = aVar.f15714a;
        if (bVar.f15724f == aVar) {
            if (z6 && !bVar.f15723e) {
                for (int i = 0; i < this.f15695j; i++) {
                    if (aVar.f15715b[i]) {
                        if (!this.f15694h.e(bVar.f15722d[i])) {
                            aVar.c();
                            return;
                        }
                    } else {
                        aVar.c();
                        throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
                    }
                }
            }
            for (int i4 = 0; i4 < this.f15695j; i4++) {
                File file = bVar.f15722d[i4];
                if (z6) {
                    if (this.f15694h.e(file)) {
                        File file2 = bVar.f15721c[i4];
                        this.f15694h.a(file, file2);
                        long j6 = bVar.f15720b[i4];
                        long f2 = this.f15694h.f(file2);
                        bVar.f15720b[i4] = f2;
                        this.f15690C = (this.f15690C - j6) + f2;
                    }
                } else {
                    this.f15694h.d(file);
                }
            }
            this.f15698m++;
            bVar.f15724f = null;
            if (bVar.f15723e | z6) {
                bVar.f15723e = true;
                this.f15696k.b(f15684t).l(32);
                this.f15696k.b(bVar.f15719a);
                bVar.a(this.f15696k);
                this.f15696k.l(10);
                if (z6) {
                    long j9 = this.f15691D;
                    this.f15691D = 1 + j9;
                    bVar.f15725g = j9;
                }
            } else {
                this.f15697l.remove(bVar.f15719a);
                this.f15696k.b(f15686v).l(32);
                this.f15696k.b(bVar.f15719a);
                this.f15696k.l(10);
            }
            this.f15696k.flush();
            if (this.f15690C > this.f15689B || f()) {
                this.f15692E.execute(this.f15693F);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final boolean a(b bVar) {
        a aVar = bVar.f15724f;
        if (aVar != null) {
            aVar.a();
        }
        for (int i = 0; i < this.f15695j; i++) {
            this.f15694h.d(bVar.f15721c[i]);
            long j6 = this.f15690C;
            long[] jArr = bVar.f15720b;
            this.f15690C = j6 - jArr[i];
            jArr[i] = 0;
        }
        this.f15698m++;
        this.f15696k.b(f15686v).l(32).b(bVar.f15719a).l(10);
        this.f15697l.remove(bVar.f15719a);
        if (f()) {
            this.f15692E.execute(this.f15693F);
        }
        return true;
    }
}
