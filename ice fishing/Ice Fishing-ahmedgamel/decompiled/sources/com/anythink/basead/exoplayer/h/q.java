package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.h.aa;
import com.anythink.basead.exoplayer.h.s;

/* loaded from: classes.dex */
public final class q extends f<Void> {

    /* renamed from: a, reason: collision with root package name */
    private final s f7760a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7761b;

    /* renamed from: c, reason: collision with root package name */
    private int f7762c;

    public static final class a extends p {
        public a(com.anythink.basead.exoplayer.ae aeVar) {
            super(aeVar);
        }

        @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
        public final int a(int i, int i6, boolean z3) {
            int a9 = this.f7759b.a(i, i6, z3);
            return a9 == -1 ? b(z3) : a9;
        }

        @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
        public final int b(int i, int i6, boolean z3) {
            int b9 = this.f7759b.b(i, i6, z3);
            return b9 == -1 ? a(z3) : b9;
        }
    }

    public static final class b extends com.anythink.basead.exoplayer.h.a {

        /* renamed from: b, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.ae f7763b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7764c;

        /* renamed from: d, reason: collision with root package name */
        private final int f7765d;

        /* renamed from: e, reason: collision with root package name */
        private final int f7766e;

        public b(com.anythink.basead.exoplayer.ae aeVar, int i) {
            super(false, new aa.b(i));
            this.f7763b = aeVar;
            int c9 = aeVar.c();
            this.f7764c = c9;
            this.f7765d = aeVar.b();
            this.f7766e = i;
            if (c9 > 0) {
                com.anythink.basead.exoplayer.k.a.b(i <= Integer.MAX_VALUE / c9, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int a(int i) {
            return i / this.f7764c;
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int b() {
            return this.f7765d * this.f7766e;
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int c() {
            return this.f7764c * this.f7766e;
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int d(int i) {
            return i * this.f7764c;
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int e(int i) {
            return i * this.f7765d;
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final Object f(int i) {
            return Integer.valueOf(i);
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int b(int i) {
            return i / this.f7765d;
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final com.anythink.basead.exoplayer.ae c(int i) {
            return this.f7763b;
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int b(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }
    }

    private q(s sVar) {
        this(sVar, (byte) 0);
    }

    private void b(com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        this.f7762c = aeVar.c();
        a(this.f7761b != Integer.MAX_VALUE ? new b(aeVar, this.f7761b) : new a(aeVar), obj);
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z3) {
        super.a(hVar, z3);
        a((q) null, this.f7760a);
    }

    private q(s sVar, byte b9) {
        com.anythink.basead.exoplayer.k.a.a(true);
        this.f7760a = sVar;
        this.f7761b = Integer.MAX_VALUE;
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        if (this.f7761b != Integer.MAX_VALUE) {
            return this.f7760a.a(aVar.a(aVar.f7767a % this.f7762c), bVar);
        }
        return this.f7760a.a(aVar, bVar);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        this.f7760a.a(rVar);
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a() {
        super.a();
        this.f7762c = 0;
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* synthetic */ void a(Void r12, s sVar, com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        com.anythink.basead.exoplayer.ae aVar;
        this.f7762c = aeVar.c();
        if (this.f7761b != Integer.MAX_VALUE) {
            aVar = new b(aeVar, this.f7761b);
        } else {
            aVar = new a(aeVar);
        }
        a(aVar, obj);
    }
}
