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
    final com.anythink.basead.exoplayer.m f7472b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f7473c;

    /* renamed from: d, reason: collision with root package name */
    boolean f7474d;

    /* renamed from: e, reason: collision with root package name */
    boolean f7475e;

    /* renamed from: f, reason: collision with root package name */
    boolean f7476f;

    /* renamed from: g, reason: collision with root package name */
    byte[] f7477g;

    /* renamed from: h, reason: collision with root package name */
    int f7478h;

    /* renamed from: j, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.k f7479j;

    /* renamed from: k, reason: collision with root package name */
    private final h.a f7480k;

    /* renamed from: l, reason: collision with root package name */
    private final int f7481l;

    /* renamed from: m, reason: collision with root package name */
    private final t.a f7482m;

    /* renamed from: n, reason: collision with root package name */
    private final af f7483n;

    /* renamed from: p, reason: collision with root package name */
    private final long f7485p;

    /* renamed from: q, reason: collision with root package name */
    private int f7486q;

    /* renamed from: o, reason: collision with root package name */
    private final ArrayList<a> f7484o = new ArrayList<>();

    /* renamed from: a, reason: collision with root package name */
    final com.anythink.basead.exoplayer.j.t f7471a = new com.anythink.basead.exoplayer.j.t("Loader:SingleSampleMediaPeriod");

    public final class a implements y {

        /* renamed from: b, reason: collision with root package name */
        private static final int f7487b = 0;

        /* renamed from: c, reason: collision with root package name */
        private static final int f7488c = 1;

        /* renamed from: d, reason: collision with root package name */
        private static final int f7489d = 2;

        /* renamed from: e, reason: collision with root package name */
        private int f7491e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f7492f;

        private a() {
        }

        private void d() {
            if (this.f7492f) {
                return;
            }
            ac.this.f7482m.a(com.anythink.basead.exoplayer.k.o.d(ac.this.f7472b.f8665h), ac.this.f7472b, 0, (Object) null, 0L);
            this.f7492f = true;
        }

        public final void a() {
            if (this.f7491e == 2) {
                this.f7491e = 1;
            }
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final boolean b() {
            return ac.this.f7475e;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final void c() {
            ac acVar = ac.this;
            if (acVar.f7473c) {
                return;
            }
            acVar.f7471a.c();
        }

        public /* synthetic */ a(ac acVar, byte b9) {
            this();
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(com.anythink.basead.exoplayer.n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z3) {
            int i = this.f7491e;
            if (i == 2) {
                eVar.b(4);
                return -4;
            }
            if (!z3 && i != 0) {
                ac acVar = ac.this;
                if (!acVar.f7475e) {
                    return -3;
                }
                if (acVar.f7476f) {
                    eVar.f6743f = 0L;
                    eVar.b(1);
                    eVar.d(ac.this.f7478h);
                    ByteBuffer byteBuffer = eVar.f6742e;
                    ac acVar2 = ac.this;
                    byteBuffer.put(acVar2.f7477g, 0, acVar2.f7478h);
                    d();
                } else {
                    eVar.b(4);
                }
                this.f7491e = 2;
                return -4;
            }
            nVar.f8683a = ac.this.f7472b;
            this.f7491e = 1;
            return -5;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(long j6) {
            if (j6 <= 0 || this.f7491e == 2) {
                return 0;
            }
            this.f7491e = 2;
            d();
            return 1;
        }
    }

    public static final class b implements t.c {

        /* renamed from: a, reason: collision with root package name */
        public final com.anythink.basead.exoplayer.j.k f7493a;

        /* renamed from: b, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.j.h f7494b;

        /* renamed from: c, reason: collision with root package name */
        private int f7495c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f7496d;

        public b(com.anythink.basead.exoplayer.j.k kVar, com.anythink.basead.exoplayer.j.h hVar) {
            this.f7493a = kVar;
            this.f7494b = hVar;
        }

        @Override // com.anythink.basead.exoplayer.j.t.c
        public final void a() {
        }

        @Override // com.anythink.basead.exoplayer.j.t.c
        public final void b() {
            int i = 0;
            this.f7495c = 0;
            try {
                this.f7494b.a(this.f7493a);
                while (i != -1) {
                    int i6 = this.f7495c + i;
                    this.f7495c = i6;
                    byte[] bArr = this.f7496d;
                    if (bArr == null) {
                        this.f7496d = new byte[ac.i];
                    } else if (i6 == bArr.length) {
                        this.f7496d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    com.anythink.basead.exoplayer.j.h hVar = this.f7494b;
                    byte[] bArr2 = this.f7496d;
                    int i9 = this.f7495c;
                    i = hVar.a(bArr2, i9, bArr2.length - i9);
                }
                com.anythink.basead.exoplayer.k.af.a(this.f7494b);
            } catch (Throwable th) {
                com.anythink.basead.exoplayer.k.af.a(this.f7494b);
                throw th;
            }
        }
    }

    public ac(com.anythink.basead.exoplayer.j.k kVar, h.a aVar, com.anythink.basead.exoplayer.m mVar, long j6, int i6, t.a aVar2, boolean z3) {
        this.f7479j = kVar;
        this.f7480k = aVar;
        this.f7472b = mVar;
        this.f7485p = j6;
        this.f7481l = i6;
        this.f7482m = aVar2;
        this.f7473c = z3;
        this.f7483n = new af(new ae(mVar));
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
        return this.f7483n;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final boolean c(long j6) {
        if (this.f7475e || this.f7471a.a()) {
            return false;
        }
        this.f7482m.a(this.f7479j, 1, -1, this.f7472b, 0, null, 0L, this.f7485p, this.f7471a.a(new b(this.f7479j, this.f7480k.a()), this, this.f7481l));
        return true;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long d() {
        return this.f7475e ? Long.MIN_VALUE : 0L;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long e() {
        return (this.f7475e || this.f7471a.a()) ? Long.MIN_VALUE : 0L;
    }

    public final void f() {
        this.f7471a.a((t.d) null);
        this.f7482m.b();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a() {
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long b(long j6) {
        for (int i6 = 0; i6 < this.f7484o.size(); i6++) {
            this.f7484o.get(i6).a();
        }
        return j6;
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(long j6, boolean z3) {
    }

    private void b(b bVar, long j6, long j9) {
        this.f7482m.b(bVar.f7493a, 1, -1, null, 0, null, 0L, this.f7485p, j6, j9, bVar.f7495c);
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* bridge */ /* synthetic */ int a(b bVar, long j6, long j9, IOException iOException) {
        b bVar2 = bVar;
        int i6 = this.f7486q + 1;
        this.f7486q = i6;
        boolean z3 = this.f7473c && i6 >= this.f7481l;
        this.f7482m.a(bVar2.f7493a, 1, -1, this.f7472b, 0, null, 0L, this.f7485p, j6, j9, bVar2.f7495c, iOException, z3);
        if (!z3) {
            return 0;
        }
        this.f7475e = true;
        return 2;
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long c() {
        if (this.f7474d) {
            return com.anythink.basead.exoplayer.b.f6382b;
        }
        this.f7482m.c();
        this.f7474d = true;
        return com.anythink.basead.exoplayer.b.f6382b;
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ void a(b bVar, long j6, long j9) {
        b bVar2 = bVar;
        this.f7482m.a(bVar2.f7493a, 1, -1, this.f7472b, 0, null, 0L, this.f7485p, j6, j9, bVar2.f7495c);
        this.f7478h = bVar2.f7495c;
        this.f7477g = bVar2.f7496d;
        this.f7475e = true;
        this.f7476f = true;
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ void a(b bVar, long j6, long j9, boolean z3) {
        this.f7482m.b(bVar.f7493a, 1, -1, null, 0, null, 0L, this.f7485p, j6, j9, r1.f7495c);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(r.a aVar, long j6) {
        aVar.a((r) this);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(com.anythink.basead.exoplayer.i.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j6) {
        byte b9 = 0;
        for (int i6 = 0; i6 < fVarArr.length; i6++) {
            y yVar = yVarArr[i6];
            if (yVar != null && (fVarArr[i6] == null || !zArr[i6])) {
                this.f7484o.remove(yVar);
                yVarArr[i6] = null;
            }
            if (yVarArr[i6] == null && fVarArr[i6] != null) {
                a aVar = new a(this, b9);
                this.f7484o.add(aVar);
                yVarArr[i6] = aVar;
                zArr2[i6] = true;
            }
        }
        return j6;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(b bVar, long j6, long j9) {
        this.f7482m.a(bVar.f7493a, 1, -1, this.f7472b, 0, null, 0L, this.f7485p, j6, j9, bVar.f7495c);
        this.f7478h = bVar.f7495c;
        this.f7477g = bVar.f7496d;
        this.f7475e = true;
        this.f7476f = true;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private int a2(b bVar, long j6, long j9, IOException iOException) {
        int i6 = this.f7486q + 1;
        this.f7486q = i6;
        boolean z3 = this.f7473c && i6 >= this.f7481l;
        this.f7482m.a(bVar.f7493a, 1, -1, this.f7472b, 0, null, 0L, this.f7485p, j6, j9, bVar.f7495c, iOException, z3);
        if (!z3) {
            return 0;
        }
        this.f7475e = true;
        return 2;
    }
}
