package com.anythink.basead.exoplayer;

import android.util.Pair;
import com.anythink.basead.exoplayer.h.a.a;

/* loaded from: classes.dex */
public abstract class ae {

    /* renamed from: a, reason: collision with root package name */
    public static final ae f6341a = new ae() { // from class: com.anythink.basead.exoplayer.ae.1
        @Override // com.anythink.basead.exoplayer.ae
        public final int a(Object obj) {
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int b() {
            return 0;
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int c() {
            return 0;
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final b a(int i, b bVar, boolean z3, long j6) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final a a(int i, a aVar, boolean z3) {
            throw new IndexOutOfBoundsException();
        }
    };

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Object f6342a;

        /* renamed from: b, reason: collision with root package name */
        public Object f6343b;

        /* renamed from: c, reason: collision with root package name */
        public int f6344c;

        /* renamed from: d, reason: collision with root package name */
        public long f6345d;

        /* renamed from: e, reason: collision with root package name */
        private long f6346e;

        /* renamed from: f, reason: collision with root package name */
        private com.anythink.basead.exoplayer.h.a.a f6347f;

        private long e() {
            return com.anythink.basead.exoplayer.b.a(this.f6345d);
        }

        private long f() {
            return this.f6345d;
        }

        public final a a(Object obj, Object obj2, long j6, long j9) {
            return a(obj, obj2, 0, j6, j9, com.anythink.basead.exoplayer.h.a.a.f7409f);
        }

        public final long b() {
            return this.f6346e;
        }

        public final int c() {
            return this.f6347f.f7410g;
        }

        public final int d(int i) {
            return this.f6347f.i[i].f7414a;
        }

        public final a a(Object obj, Object obj2, int i, long j6, long j9, com.anythink.basead.exoplayer.h.a.a aVar) {
            this.f6342a = obj;
            this.f6343b = obj2;
            this.f6344c = i;
            this.f6345d = j6;
            this.f6346e = j9;
            this.f6347f = aVar;
            return this;
        }

        public final int b(int i) {
            return this.f6347f.i[i].a(-1);
        }

        public final boolean c(int i) {
            return !this.f6347f.i[i].a();
        }

        public final long d() {
            return this.f6347f.f7412j;
        }

        public final long c(int i, int i6) {
            a.C0026a c0026a = this.f6347f.i[i];
            return c0026a.f7414a != -1 ? c0026a.f7417d[i6] : com.anythink.basead.exoplayer.b.f6382b;
        }

        public final int b(long j6) {
            com.anythink.basead.exoplayer.h.a.a aVar = this.f6347f;
            int i = 0;
            while (true) {
                long[] jArr = aVar.f7411h;
                if (i >= jArr.length) {
                    break;
                }
                long j9 = jArr[i];
                if (j9 == Long.MIN_VALUE || (j6 < j9 && aVar.i[i].a())) {
                    break;
                }
                i++;
            }
            if (i < aVar.f7411h.length) {
                return i;
            }
            return -1;
        }

        public final long a() {
            return com.anythink.basead.exoplayer.b.a(this.f6346e);
        }

        public final boolean b(int i, int i6) {
            a.C0026a c0026a = this.f6347f.i[i];
            return (c0026a.f7414a == -1 || c0026a.f7416c[i6] == 0) ? false : true;
        }

        public final long a(int i) {
            return this.f6347f.f7411h[i];
        }

        public final int a(int i, int i6) {
            return this.f6347f.i[i].a(i6);
        }

        public final int a(long j6) {
            com.anythink.basead.exoplayer.h.a.a aVar = this.f6347f;
            int length = aVar.f7411h.length - 1;
            while (length >= 0) {
                long j9 = aVar.f7411h[length];
                if (j9 != Long.MIN_VALUE && j9 <= j6) {
                    break;
                }
                length--;
            }
            if (length < 0 || !aVar.i[length].a()) {
                return -1;
            }
            return length;
        }
    }

    public abstract int a(Object obj);

    public abstract a a(int i, a aVar, boolean z3);

    public abstract b a(int i, b bVar, boolean z3, long j6);

    public final boolean a() {
        return b() == 0;
    }

    public abstract int b();

    public int b(int i, int i6, boolean z3) {
        if (i6 == 0) {
            if (i == b(z3)) {
                return -1;
            }
            return i - 1;
        }
        if (i6 == 1) {
            return i;
        }
        if (i6 == 2) {
            return i == b(z3) ? a(z3) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract int c();

    public int a(int i, int i6, boolean z3) {
        if (i6 == 0) {
            if (i == a(z3)) {
                return -1;
            }
            return i + 1;
        }
        if (i6 == 1) {
            return i;
        }
        if (i6 == 2) {
            return i == a(z3) ? b(z3) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int b(boolean z3) {
        return a() ? -1 : 0;
    }

    public int a(boolean z3) {
        if (a()) {
            return -1;
        }
        return b() - 1;
    }

    public final boolean b(int i, a aVar, b bVar, int i6, boolean z3) {
        return a(i, aVar, bVar, i6, z3) == -1;
    }

    private b a(int i, b bVar) {
        return a(i, bVar, false);
    }

    public final b a(int i, b bVar, boolean z3) {
        return a(i, bVar, z3, 0L);
    }

    public final Pair<Integer, Long> a(b bVar, a aVar, int i, long j6) {
        return a(bVar, aVar, i, j6, 0L);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Object f6348a;

        /* renamed from: b, reason: collision with root package name */
        public long f6349b;

        /* renamed from: c, reason: collision with root package name */
        public long f6350c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f6351d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f6352e;

        /* renamed from: f, reason: collision with root package name */
        public int f6353f;

        /* renamed from: g, reason: collision with root package name */
        public int f6354g;

        /* renamed from: h, reason: collision with root package name */
        public long f6355h;
        public long i;

        /* renamed from: j, reason: collision with root package name */
        public long f6356j;

        private long b() {
            return this.f6355h;
        }

        private long c() {
            return com.anythink.basead.exoplayer.b.a(this.i);
        }

        private long d() {
            return this.i;
        }

        private long e() {
            return com.anythink.basead.exoplayer.b.a(this.f6356j);
        }

        private long f() {
            return this.f6356j;
        }

        public final b a(Object obj, long j6, long j9, boolean z3, boolean z6, long j10, long j11, long j12) {
            this.f6348a = obj;
            this.f6349b = j6;
            this.f6350c = j9;
            this.f6351d = z3;
            this.f6352e = z6;
            this.f6355h = j10;
            this.i = j11;
            this.f6353f = 0;
            this.f6354g = 0;
            this.f6356j = j12;
            return this;
        }

        private long a() {
            return com.anythink.basead.exoplayer.b.a(this.f6355h);
        }
    }

    public final Pair<Integer, Long> a(b bVar, a aVar, int i, long j6, long j9) {
        com.anythink.basead.exoplayer.k.a.a(i, b());
        a(i, bVar, false, j9);
        if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
            j6 = bVar.f6355h;
            if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
                return null;
            }
        }
        int i6 = bVar.f6353f;
        long j10 = bVar.f6356j + j6;
        long j11 = a(i6, aVar, false).f6345d;
        while (j11 != com.anythink.basead.exoplayer.b.f6382b && j10 >= j11 && i6 < bVar.f6354g) {
            j10 -= j11;
            i6++;
            j11 = a(i6, aVar, false).f6345d;
        }
        return Pair.create(Integer.valueOf(i6), Long.valueOf(j10));
    }

    private a a(int i, a aVar) {
        return a(i, aVar, false);
    }

    public final int a(int i, a aVar, b bVar, int i6, boolean z3) {
        int i9 = a(i, aVar, false).f6344c;
        if (a(i9, bVar, false).f6354g != i) {
            return i + 1;
        }
        int a9 = a(i9, i6, z3);
        if (a9 == -1) {
            return -1;
        }
        return a(a9, bVar, false).f6353f;
    }
}
