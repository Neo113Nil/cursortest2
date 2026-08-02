package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.h.aa;
import com.anythink.basead.exoplayer.h.s;

/* loaded from: classes.dex */
public final class q extends f<Void> {

    /* renamed from: a, reason: collision with root package name */
    private final s f8546a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8547b;

    /* renamed from: c, reason: collision with root package name */
    private int f8548c;

    public static final class a extends p {
        public a(com.anythink.basead.exoplayer.ae aeVar) {
            super(aeVar);
        }

        @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
        public final int a(int i, int i4, boolean z6) {
            int a9 = this.f8545b.a(i, i4, z6);
            return a9 == -1 ? b(z6) : a9;
        }

        @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
        public final int b(int i, int i4, boolean z6) {
            int b9 = this.f8545b.b(i, i4, z6);
            return b9 == -1 ? a(z6) : b9;
        }
    }

    public static final class b extends com.anythink.basead.exoplayer.h.a {

        /* renamed from: b, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.ae f8549b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8550c;

        /* renamed from: d, reason: collision with root package name */
        private final int f8551d;

        /* renamed from: e, reason: collision with root package name */
        private final int f8552e;

        public b(com.anythink.basead.exoplayer.ae aeVar, int i) {
            super(false, new aa.b(i));
            this.f8549b = aeVar;
            int c9 = aeVar.c();
            this.f8550c = c9;
            this.f8551d = aeVar.b();
            this.f8552e = i;
            if (c9 > 0) {
                com.anythink.basead.exoplayer.k.a.b(i <= Integer.MAX_VALUE / c9, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int a(int i) {
            return i / this.f8550c;
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int b() {
            return this.f8551d * this.f8552e;
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int c() {
            return this.f8550c * this.f8552e;
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int d(int i) {
            return i * this.f8550c;
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int e(int i) {
            return i * this.f8551d;
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final Object f(int i) {
            return Integer.valueOf(i);
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int b(int i) {
            return i / this.f8551d;
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final com.anythink.basead.exoplayer.ae c(int i) {
            return this.f8549b;
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
        this.f8548c = aeVar.c();
        a(this.f8547b != Integer.MAX_VALUE ? new b(aeVar, this.f8547b) : new a(aeVar), obj);
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z6) {
        super.a(hVar, z6);
        a((q) null, this.f8546a);
    }

    private q(s sVar, byte b9) {
        com.anythink.basead.exoplayer.k.a.a(true);
        this.f8546a = sVar;
        this.f8547b = Integer.MAX_VALUE;
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        if (this.f8547b != Integer.MAX_VALUE) {
            return this.f8546a.a(aVar.a(aVar.f8553a % this.f8548c), bVar);
        }
        return this.f8546a.a(aVar, bVar);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        this.f8546a.a(rVar);
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a() {
        super.a();
        this.f8548c = 0;
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* synthetic */ void a(Void r1, s sVar, com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        com.anythink.basead.exoplayer.ae aVar;
        this.f8548c = aeVar.c();
        if (this.f8547b != Integer.MAX_VALUE) {
            aVar = new b(aeVar, this.f8547b);
        } else {
            aVar = new a(aeVar);
        }
        a(aVar, obj);
    }
}
