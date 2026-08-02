package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.h.r;
import com.anythink.basead.exoplayer.h.t;
import com.anythink.basead.exoplayer.j.h;
import com.anythink.basead.exoplayer.j.t;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
final class ac implements r, t.a<b> {
    private static final int i = 1024;

    /* renamed from: b, reason: collision with root package name */
    final com.anythink.basead.exoplayer.m f8258b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f8259c;

    /* renamed from: d, reason: collision with root package name */
    boolean f8260d;

    /* renamed from: e, reason: collision with root package name */
    boolean f8261e;

    /* renamed from: f, reason: collision with root package name */
    boolean f8262f;

    /* renamed from: g, reason: collision with root package name */
    byte[] f8263g;

    /* renamed from: h, reason: collision with root package name */
    int f8264h;

    /* renamed from: j, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.k f8265j;

    /* renamed from: k, reason: collision with root package name */
    private final h.a f8266k;

    /* renamed from: l, reason: collision with root package name */
    private final int f8267l;

    /* renamed from: m, reason: collision with root package name */
    private final t.a f8268m;

    /* renamed from: n, reason: collision with root package name */
    private final af f8269n;

    /* renamed from: p, reason: collision with root package name */
    private final long f8271p;

    /* renamed from: q, reason: collision with root package name */
    private int f8272q;

    /* renamed from: o, reason: collision with root package name */
    private final ArrayList<a> f8270o = new ArrayList<>();

    /* renamed from: a, reason: collision with root package name */
    final com.anythink.basead.exoplayer.j.t f8257a = new com.anythink.basead.exoplayer.j.t("Loader:SingleSampleMediaPeriod");

    public final class a implements y {

        /* renamed from: b, reason: collision with root package name */
        private static final int f8273b = 0;

        /* renamed from: c, reason: collision with root package name */
        private static final int f8274c = 1;

        /* renamed from: d, reason: collision with root package name */
        private static final int f8275d = 2;

        /* renamed from: e, reason: collision with root package name */
        private int f8277e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f8278f;

        private a() {
        }

        private void d() {
            if (this.f8278f) {
                return;
            }
            ac.this.f8268m.a(com.anythink.basead.exoplayer.k.o.d(ac.this.f8258b.f9451h), ac.this.f8258b, 0, (Object) null, 0L);
            this.f8278f = true;
        }

        public final void a() {
            if (this.f8277e == 2) {
                this.f8277e = 1;
            }
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final boolean b() {
            return ac.this.f8261e;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final void c() {
            ac acVar = ac.this;
            if (acVar.f8259c) {
                return;
            }
            acVar.f8257a.c();
        }

        public /* synthetic */ a(ac acVar, byte b9) {
            this();
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(com.anythink.basead.exoplayer.n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z6) {
            int i = this.f8277e;
            if (i == 2) {
                eVar.b(4);
                return -4;
            }
            if (!z6 && i != 0) {
                ac acVar = ac.this;
                if (!acVar.f8261e) {
                    return -3;
                }
                if (acVar.f8262f) {
                    eVar.f7529f = 0L;
                    eVar.b(1);
                    eVar.d(ac.this.f8264h);
                    ByteBuffer byteBuffer = eVar.f7528e;
                    ac acVar2 = ac.this;
                    byteBuffer.put(acVar2.f8263g, 0, acVar2.f8264h);
                    d();
                } else {
                    eVar.b(4);
                }
                this.f8277e = 2;
                return -4;
            }
            nVar.f9469a = ac.this.f8258b;
            this.f8277e = 1;
            return -5;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(long j6) {
            if (j6 <= 0 || this.f8277e == 2) {
                return 0;
            }
            this.f8277e = 2;
            d();
            return 1;
        }
    }

    public static final class b implements t.c {

        /* renamed from: a, reason: collision with root package name */
        public final com.anythink.basead.exoplayer.j.k f8279a;

        /* renamed from: b, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.j.h f8280b;

        /* renamed from: c, reason: collision with root package name */
        private int f8281c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f8282d;

        public b(com.anythink.basead.exoplayer.j.k kVar, com.anythink.basead.exoplayer.j.h hVar) {
            this.f8279a = kVar;
            this.f8280b = hVar;
        }

        @Override // com.anythink.basead.exoplayer.j.t.c
        public final void a() {
        }

        @Override // com.anythink.basead.exoplayer.j.t.c
        public final void b() {
            int i = 0;
            this.f8281c = 0;
            try {
                this.f8280b.a(this.f8279a);
                while (i != -1) {
                    int i4 = this.f8281c + i;
                    this.f8281c = i4;
                    byte[] bArr = this.f8282d;
                    if (bArr == null) {
                        this.f8282d = new byte[ac.i];
                    } else if (i4 == bArr.length) {
                        this.f8282d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    com.anythink.basead.exoplayer.j.h hVar = this.f8280b;
                    byte[] bArr2 = this.f8282d;
                    int i6 = this.f8281c;
                    i = hVar.a(bArr2, i6, bArr2.length - i6);
                }
                com.anythink.basead.exoplayer.k.af.a(this.f8280b);
            } catch (Throwable th) {
                com.anythink.basead.exoplayer.k.af.a(this.f8280b);
                throw th;
            }
        }
    }

    public ac(com.anythink.basead.exoplayer.j.k kVar, h.a aVar, com.anythink.basead.exoplayer.m mVar, long j6, int i4, t.a aVar2, boolean z6) {
        this.f8265j = kVar;
        this.f8266k = aVar;
        this.f8258b = mVar;
        this.f8271p = j6;
        this.f8267l = i4;
        this.f8268m = aVar2;
        this.f8259c = z6;
        this.f8269n = new af(new ae(mVar));
        aVar2.a();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(long j6, com.anythink.basead.exoplayer.ac acVar) {
        return j6;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final void a_(long j6) {
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final af b() {
        return this.f8269n;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final boolean c(long j6) {
        if (this.f8261e || this.f8257a.a()) {
            return false;
        }
        this.f8268m.a(this.f8265j, 1, -1, this.f8258b, 0, null, 0L, this.f8271p, this.f8257a.a(new b(this.f8265j, this.f8266k.a()), this, this.f8267l));
        return true;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long d() {
        return this.f8261e ? Long.MIN_VALUE : 0L;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long e() {
        return (this.f8261e || this.f8257a.a()) ? Long.MIN_VALUE : 0L;
    }

    public final void f() {
        this.f8257a.a((t.d) null);
        this.f8268m.b();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a() {
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long b(long j6) {
        for (int i4 = 0; i4 < this.f8270o.size(); i4++) {
            this.f8270o.get(i4).a();
        }
        return j6;
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(long j6, boolean z6) {
    }

    private void b(b bVar, long j6, long j9) {
        this.f8268m.b(bVar.f8279a, 1, -1, null, 0, null, 0L, this.f8271p, j6, j9, bVar.f8281c);
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* bridge */ /* synthetic */ int a(b bVar, long j6, long j9, IOException iOException) {
        b bVar2 = bVar;
        int i4 = this.f8272q + 1;
        this.f8272q = i4;
        boolean z6 = this.f8259c && i4 >= this.f8267l;
        this.f8268m.a(bVar2.f8279a, 1, -1, this.f8258b, 0, null, 0L, this.f8271p, j6, j9, bVar2.f8281c, iOException, z6);
        if (!z6) {
            return 0;
        }
        this.f8261e = true;
        return 2;
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long c() {
        if (this.f8260d) {
            return com.anythink.basead.exoplayer.b.f7168b;
        }
        this.f8268m.c();
        this.f8260d = true;
        return com.anythink.basead.exoplayer.b.f7168b;
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ void a(b bVar, long j6, long j9) {
        b bVar2 = bVar;
        this.f8268m.a(bVar2.f8279a, 1, -1, this.f8258b, 0, null, 0L, this.f8271p, j6, j9, bVar2.f8281c);
        this.f8264h = bVar2.f8281c;
        this.f8263g = bVar2.f8282d;
        this.f8261e = true;
        this.f8262f = true;
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ void a(b bVar, long j6, long j9, boolean z6) {
        this.f8268m.b(bVar.f8279a, 1, -1, null, 0, null, 0L, this.f8271p, j6, j9, r1.f8281c);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(r.a aVar, long j6) {
        aVar.a((r) this);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(com.anythink.basead.exoplayer.i.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j6) {
        byte b9 = 0;
        for (int i4 = 0; i4 < fVarArr.length; i4++) {
            y yVar = yVarArr[i4];
            if (yVar != null && (fVarArr[i4] == null || !zArr[i4])) {
                this.f8270o.remove(yVar);
                yVarArr[i4] = null;
            }
            if (yVarArr[i4] == null && fVarArr[i4] != null) {
                a aVar = new a(this, b9);
                this.f8270o.add(aVar);
                yVarArr[i4] = aVar;
                zArr2[i4] = true;
            }
        }
        return j6;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(b bVar, long j6, long j9) {
        this.f8268m.a(bVar.f8279a, 1, -1, this.f8258b, 0, null, 0L, this.f8271p, j6, j9, bVar.f8281c);
        this.f8264h = bVar.f8281c;
        this.f8263g = bVar.f8282d;
        this.f8261e = true;
        this.f8262f = true;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private int a2(b bVar, long j6, long j9, IOException iOException) {
        int i4 = this.f8272q + 1;
        this.f8272q = i4;
        boolean z6 = this.f8259c && i4 >= this.f8267l;
        this.f8268m.a(bVar.f8279a, 1, -1, this.f8258b, 0, null, 0L, this.f8271p, j6, j9, bVar.f8281c, iOException, z6);
        if (!z6) {
            return 0;
        }
        this.f8261e = true;
        return 2;
    }
}
