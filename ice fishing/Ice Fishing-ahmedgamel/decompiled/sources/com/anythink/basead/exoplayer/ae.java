package com.anythink.basead.exoplayer;

import android.util.Pair;
import com.anythink.basead.exoplayer.h.a.a;

/* loaded from: classes.dex */
public abstract class ae {

    /* renamed from: a, reason: collision with root package name */
    public static final ae f7127a = new ae() { // from class: com.anythink.basead.exoplayer.ae.1
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
        public final b a(int i, b bVar, boolean z6, long j6) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final a a(int i, a aVar, boolean z6) {
            throw new IndexOutOfBoundsException();
        }
    };

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Object f7128a;

        /* renamed from: b, reason: collision with root package name */
        public Object f7129b;

        /* renamed from: c, reason: collision with root package name */
        public int f7130c;

        /* renamed from: d, reason: collision with root package name */
        public long f7131d;

        /* renamed from: e, reason: collision with root package name */
        private long f7132e;

        /* renamed from: f, reason: collision with root package name */
        private com.anythink.basead.exoplayer.h.a.a f7133f;

        private long e() {
            return com.anythink.basead.exoplayer.b.a(this.f7131d);
        }

        private long f() {
            return this.f7131d;
        }

        public final a a(Object obj, Object obj2, long j6, long j9) {
            return a(obj, obj2, 0, j6, j9, com.anythink.basead.exoplayer.h.a.a.f8195f);
        }

        public final long b() {
            return this.f7132e;
        }

        public final int c() {
            return this.f7133f.f8196g;
        }

        public final int d(int i) {
            return this.f7133f.i[i].f8200a;
        }

        public final a a(Object obj, Object obj2, int i, long j6, long j9, com.anythink.basead.exoplayer.h.a.a aVar) {
            this.f7128a = obj;
            this.f7129b = obj2;
            this.f7130c = i;
            this.f7131d = j6;
            this.f7132e = j9;
            this.f7133f = aVar;
            return this;
        }

        public final int b(int i) {
            return this.f7133f.i[i].a(-1);
        }

        public final boolean c(int i) {
            return !this.f7133f.i[i].a();
        }

        public final long d() {
            return this.f7133f.f8198j;
        }

        public final long c(int i, int i4) {
            a.C0026a c0026a = this.f7133f.i[i];
            return c0026a.f8200a != -1 ? c0026a.f8203d[i4] : com.anythink.basead.exoplayer.b.f7168b;
        }

        public final int b(long j6) {
            com.anythink.basead.exoplayer.h.a.a aVar = this.f7133f;
            int i = 0;
            while (true) {
                long[] jArr = aVar.f8197h;
                if (i >= jArr.length) {
                    break;
                }
                long j9 = jArr[i];
                if (j9 == Long.MIN_VALUE || (j6 < j9 && aVar.i[i].a())) {
                    break;
                }
                i++;
            }
            if (i < aVar.f8197h.length) {
                return i;
            }
            return -1;
        }

        public final long a() {
            return com.anythink.basead.exoplayer.b.a(this.f7132e);
        }

        public final boolean b(int i, int i4) {
            a.C0026a c0026a = this.f7133f.i[i];
            return (c0026a.f8200a == -1 || c0026a.f8202c[i4] == 0) ? false : true;
        }

        public final long a(int i) {
            return this.f7133f.f8197h[i];
        }

        public final int a(int i, int i4) {
            return this.f7133f.i[i].a(i4);
        }

        public final int a(long j6) {
            com.anythink.basead.exoplayer.h.a.a aVar = this.f7133f;
            int length = aVar.f8197h.length - 1;
            while (length >= 0) {
                long j9 = aVar.f8197h[length];
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

    public abstract a a(int i, a aVar, boolean z6);

    public abstract b a(int i, b bVar, boolean z6, long j6);

    public final boolean a() {
        return b() == 0;
    }

    public abstract int b();

    public int b(int i, int i4, boolean z6) {
        if (i4 == 0) {
            if (i == b(z6)) {
                return -1;
            }
            return i - 1;
        }
        if (i4 == 1) {
            return i;
        }
        if (i4 == 2) {
            return i == b(z6) ? a(z6) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract int c();

    public int a(int i, int i4, boolean z6) {
        if (i4 == 0) {
            if (i == a(z6)) {
                return -1;
            }
            return i + 1;
        }
        if (i4 == 1) {
            return i;
        }
        if (i4 == 2) {
            return i == a(z6) ? b(z6) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int b(boolean z6) {
        return a() ? -1 : 0;
    }

    public int a(boolean z6) {
        if (a()) {
            return -1;
        }
        return b() - 1;
    }

    public final boolean b(int i, a aVar, b bVar, int i4, boolean z6) {
        return a(i, aVar, bVar, i4, z6) == -1;
    }

    private b a(int i, b bVar) {
        return a(i, bVar, false);
    }

    public final b a(int i, b bVar, boolean z6) {
        return a(i, bVar, z6, 0L);
    }

    public final Pair<Integer, Long> a(b bVar, a aVar, int i, long j6) {
        return a(bVar, aVar, i, j6, 0L);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Object f7134a;

        /* renamed from: b, reason: collision with root package name */
        public long f7135b;

        /* renamed from: c, reason: collision with root package name */
        public long f7136c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f7137d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f7138e;

        /* renamed from: f, reason: collision with root package name */
        public int f7139f;

        /* renamed from: g, reason: collision with root package name */
        public int f7140g;

        /* renamed from: h, reason: collision with root package name */
        public long f7141h;
        public long i;

        /* renamed from: j, reason: collision with root package name */
        public long f7142j;

        private long b() {
            return this.f7141h;
        }

        private long c() {
            return com.anythink.basead.exoplayer.b.a(this.i);
        }

        private long d() {
            return this.i;
        }

        private long e() {
            return com.anythink.basead.exoplayer.b.a(this.f7142j);
        }

        private long f() {
            return this.f7142j;
        }

        public final b a(Object obj, long j6, long j9, boolean z6, boolean z9, long j10, long j11, long j12) {
            this.f7134a = obj;
            this.f7135b = j6;
            this.f7136c = j9;
            this.f7137d = z6;
            this.f7138e = z9;
            this.f7141h = j10;
            this.i = j11;
            this.f7139f = 0;
            this.f7140g = 0;
            this.f7142j = j12;
            return this;
        }

        private long a() {
            return com.anythink.basead.exoplayer.b.a(this.f7141h);
        }
    }

    public final Pair<Integer, Long> a(b bVar, a aVar, int i, long j6, long j9) {
        com.anythink.basead.exoplayer.k.a.a(i, b());
        a(i, bVar, false, j9);
        if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
            j6 = bVar.f7141h;
            if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
                return null;
            }
        }
        int i4 = bVar.f7139f;
        long j10 = bVar.f7142j + j6;
        long j11 = a(i4, aVar, false).f7131d;
        while (j11 != com.anythink.basead.exoplayer.b.f7168b && j10 >= j11 && i4 < bVar.f7140g) {
            j10 -= j11;
            i4++;
            j11 = a(i4, aVar, false).f7131d;
        }
        return Pair.create(Integer.valueOf(i4), Long.valueOf(j10));
    }

    private a a(int i, a aVar) {
        return a(i, aVar, false);
    }

    public final int a(int i, a aVar, b bVar, int i4, boolean z6) {
        int i6 = a(i, aVar, false).f7130c;
        if (a(i6, bVar, false).f7140g != i) {
            return i + 1;
        }
        int a9 = a(i6, i4, z6);
        if (a9 == -1) {
            return -1;
        }
        return a(a9, bVar, false).f7139f;
    }
}
