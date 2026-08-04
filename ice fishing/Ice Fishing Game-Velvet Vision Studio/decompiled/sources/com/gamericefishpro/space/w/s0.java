package com.gamericefishpro.space.w;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends com.gamericefishpro.space.g1.b {
    public static final k K = new k(0.0f);
    public static final k L = new k(1.0f);
    public final com.gamericefishpro.space.t0.b1 A;
    public com.gamericefishpro.space.pi.h B;
    public final com.gamericefishpro.space.xi.c C;
    public final h0 D;
    public long E;
    public final com.gamericefishpro.space.t.d0 F;
    public l0 G;
    public final k0 H;
    public float I;
    public final k0 J;
    public final com.gamericefishpro.space.t0.f1 e;
    public final com.gamericefishpro.space.t0.f1 i;
    public Object v;
    public l1 w;
    public long y;
    public final com.gamericefishpro.space.a3.b z;

    /* JADX WARN: Type inference failed for: r3v6, types: [com.gamericefishpro.space.w.k0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.gamericefishpro.space.w.k0] */
    public s0(com.gamericefishpro.space.f5.k kVar) {
        super(4);
        this.e = com.gamericefishpro.space.t0.i.v(kVar);
        this.i = com.gamericefishpro.space.t0.i.v(kVar);
        this.v = kVar;
        this.z = new com.gamericefishpro.space.a3.b(20, this);
        this.A = new com.gamericefishpro.space.t0.b1(0.0f);
        this.C = new com.gamericefishpro.space.xi.c();
        this.D = new h0();
        this.E = Long.MIN_VALUE;
        this.F = new com.gamericefishpro.space.t.d0();
        final int i = 0;
        this.H = new Function1(this) { // from class: com.gamericefishpro.space.w.k0
            public final /* synthetic */ s0 e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Long l = (Long) obj;
                switch (i) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        this.e.E = l.longValue();
                        break;
                    default:
                        long jLongValue = l.longValue();
                        s0 s0Var = this.e;
                        long j = jLongValue - s0Var.E;
                        s0Var.E = jLongValue;
                        long jB = com.gamericefishpro.space.gi.c.b(j / ((double) s0Var.I));
                        com.gamericefishpro.space.t.d0 d0Var = s0Var.F;
                        if (d0Var.i()) {
                            Object[] objArr = d0Var.a;
                            int i2 = d0Var.b;
                            int i3 = 0;
                            for (int i4 = 0; i4 < i2; i4++) {
                                l0 l0Var = (l0) objArr[i4];
                                s0.y(l0Var, jB);
                                l0Var.c = true;
                            }
                            l1 l1Var = s0Var.w;
                            if (l1Var != null) {
                                l1Var.o();
                            }
                            int i5 = d0Var.b;
                            Object[] objArr2 = d0Var.a;
                            IntRange intRangeF = com.gamericefishpro.space.ji.f.f(0, i5);
                            int i6 = intRangeF.d;
                            int i7 = intRangeF.e;
                            if (i6 <= i7) {
                                while (true) {
                                    objArr2[i6 - i3] = objArr2[i6];
                                    if (((l0) objArr2[i6]).c) {
                                        i3++;
                                    }
                                    if (i6 != i7) {
                                        i6++;
                                    }
                                }
                            }
                            com.gamericefishpro.space.ph.u.i(i5 - i3, i5, null, objArr2);
                            d0Var.b -= i3;
                        }
                        l0 l0Var2 = s0Var.G;
                        if (l0Var2 != null) {
                            l0Var2.g = s0Var.y;
                            s0.y(l0Var2, jB);
                            s0Var.B(l0Var2.d);
                            if (l0Var2.d == 1.0f) {
                                s0Var.G = null;
                            }
                            s0Var.A();
                        }
                        break;
                }
                return Unit.a;
            }
        };
        final int i2 = 1;
        this.J = new Function1(this) { // from class: com.gamericefishpro.space.w.k0
            public final /* synthetic */ s0 e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Long l = (Long) obj;
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        this.e.E = l.longValue();
                        break;
                    default:
                        long jLongValue = l.longValue();
                        s0 s0Var = this.e;
                        long j = jLongValue - s0Var.E;
                        s0Var.E = jLongValue;
                        long jB = com.gamericefishpro.space.gi.c.b(j / ((double) s0Var.I));
                        com.gamericefishpro.space.t.d0 d0Var = s0Var.F;
                        if (d0Var.i()) {
                            Object[] objArr = d0Var.a;
                            int i3 = d0Var.b;
                            int i4 = 0;
                            for (int i5 = 0; i5 < i3; i5++) {
                                l0 l0Var = (l0) objArr[i5];
                                s0.y(l0Var, jB);
                                l0Var.c = true;
                            }
                            l1 l1Var = s0Var.w;
                            if (l1Var != null) {
                                l1Var.o();
                            }
                            int i6 = d0Var.b;
                            Object[] objArr2 = d0Var.a;
                            IntRange intRangeF = com.gamericefishpro.space.ji.f.f(0, i6);
                            int i7 = intRangeF.d;
                            int i8 = intRangeF.e;
                            if (i7 <= i8) {
                                while (true) {
                                    objArr2[i7 - i4] = objArr2[i7];
                                    if (((l0) objArr2[i7]).c) {
                                        i4++;
                                    }
                                    if (i7 != i8) {
                                        i7++;
                                    }
                                }
                            }
                            com.gamericefishpro.space.ph.u.i(i6 - i4, i6, null, objArr2);
                            d0Var.b -= i4;
                        }
                        l0 l0Var2 = s0Var.G;
                        if (l0Var2 != null) {
                            l0Var2.g = s0Var.y;
                            s0.y(l0Var2, jB);
                            s0Var.B(l0Var2.d);
                            if (l0Var2.d == 1.0f) {
                                s0Var.G = null;
                            }
                            s0Var.A();
                        }
                        break;
                }
                return Unit.a;
            }
        };
    }

    public static final void s(s0 s0Var) {
        l1 l1Var = s0Var.w;
        com.gamericefishpro.space.t0.b1 b1Var = s0Var.A;
        if (l1Var == null) {
            return;
        }
        l0 l0Var = s0Var.G;
        if (l0Var == null) {
            if (s0Var.y <= 0 || b1Var.g() == 1.0f || Intrinsics.a(s0Var.i.getValue(), s0Var.e.getValue())) {
                l0Var = null;
            } else {
                l0Var = new l0();
                l0Var.d = b1Var.g();
                long j = s0Var.y;
                l0Var.g = j;
                l0Var.h = com.gamericefishpro.space.gi.c.b((1.0d - ((double) b1Var.g())) * j);
                l0Var.e.e(0, b1Var.g());
            }
        }
        if (l0Var != null) {
            l0Var.g = s0Var.y;
            s0Var.F.a(l0Var);
            l1Var.m(l0Var);
        }
        s0Var.G = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object t(s0 s0Var, com.gamericefishpro.space.vh.c cVar) {
        n0 n0Var;
        com.gamericefishpro.space.t.d0 d0Var = s0Var.F;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i = n0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                n0Var.i = i - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(s0Var, cVar);
            }
        } else {
            n0Var = new n0(s0Var, cVar);
        }
        Object obj = n0Var.d;
        Object obj2 = com.gamericefishpro.space.uh.a.d;
        int i2 = n0Var.i;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            if (d0Var.h() && s0Var.G == null) {
                return Unit.a;
            }
            if (c.k(n0Var.getContext()) == 0.0f) {
                s0Var.x();
                s0Var.E = Long.MIN_VALUE;
                return Unit.a;
            }
            if (s0Var.E == Long.MIN_VALUE) {
                k0 k0Var = s0Var.H;
                n0Var.i = 1;
                if (com.gamericefishpro.space.t0.i.s(n0Var.getContext()).E(k0Var, n0Var) != obj2) {
                }
            }
            return obj2;
        }
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.gamericefishpro.space.wa.b.P(obj);
        do {
            if (!d0Var.i() && s0Var.G == null) {
                s0Var.E = Long.MIN_VALUE;
                return Unit.a;
            }
            n0Var.i = 2;
        } while (s0Var.w(n0Var) != obj2);
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object u(s0 s0Var, com.gamericefishpro.space.vh.c cVar) {
        q0 frame;
        Object value;
        Object obj;
        com.gamericefishpro.space.xi.c cVar2 = s0Var.C;
        if (cVar instanceof q0) {
            frame = (q0) cVar;
            int i = frame.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                frame.v = i - Integer.MIN_VALUE;
            } else {
                frame = new q0(s0Var, cVar);
            }
        } else {
            frame = new q0(s0Var, cVar);
        }
        Object obj2 = frame.e;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = frame.v;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj2);
            value = s0Var.e.getValue();
            frame.d = value;
            frame.v = 1;
            if (cVar2.c(frame) != aVar) {
            }
            return aVar;
        }
        if (i2 == 1) {
            Object obj3 = frame.d;
            com.gamericefishpro.space.wa.b.P(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = frame.d;
            com.gamericefishpro.space.wa.b.P(obj2);
        }
        if (Intrinsics.a(obj2, obj)) {
            return Unit.a;
        }
        s0Var.E = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        frame.d = value;
        frame.v = 2;
        com.gamericefishpro.space.pi.h hVar = new com.gamericefishpro.space.pi.h(1, com.gamericefishpro.space.uh.f.b(frame));
        hVar.s();
        s0Var.B = hVar;
        cVar2.b(null);
        Object objR = hVar.r();
        if (objR == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (objR != aVar) {
            obj = value;
            obj2 = objR;
            if (Intrinsics.a(obj2, obj)) {
                return Unit.a;
            }
            s0Var.E = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x008d, please report this as an issue */
    public static final Object v(s0 s0Var, com.gamericefishpro.space.vh.c cVar) {
        r0 frame;
        Object value;
        Object obj;
        com.gamericefishpro.space.xi.c cVar2 = s0Var.C;
        if (cVar instanceof r0) {
            frame = (r0) cVar;
            int i = frame.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                frame.v = i - Integer.MIN_VALUE;
            } else {
                frame = new r0(s0Var, cVar);
            }
        } else {
            frame = new r0(s0Var, cVar);
        }
        Object obj2 = frame.e;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = frame.v;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj2);
            value = s0Var.e.getValue();
            frame.d = value;
            frame.v = 1;
            if (cVar2.c(frame) != aVar) {
            }
            return aVar;
        }
        if (i2 == 1) {
            Object obj3 = frame.d;
            com.gamericefishpro.space.wa.b.P(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = frame.d;
            com.gamericefishpro.space.wa.b.P(obj2);
        }
        if (!Intrinsics.a(obj2, obj)) {
            s0Var.E = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return Unit.a;
        if (!Intrinsics.a(value, s0Var.v)) {
            frame.d = value;
            frame.v = 2;
            com.gamericefishpro.space.pi.h hVar = new com.gamericefishpro.space.pi.h(1, com.gamericefishpro.space.uh.f.b(frame));
            hVar.s();
            s0Var.B = hVar;
            cVar2.b(null);
            Object objR = hVar.r();
            if (objR == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objR != aVar) {
                obj = value;
                obj2 = objR;
                if (!Intrinsics.a(obj2, obj)) {
                    s0Var.E = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return aVar;
        }
        cVar2.b(null);
        return Unit.a;
    }

    public static void y(l0 l0Var, long j) {
        long j2 = l0Var.a;
        k kVar = l0Var.e;
        long j3 = j2 + j;
        l0Var.a = j3;
        long j4 = l0Var.h;
        if (j3 >= j4) {
            l0Var.d = 1.0f;
            return;
        }
        s1 s1Var = l0Var.b;
        if (s1Var == null) {
            float f = j3 / j4;
            l0Var.d = (f * 1.0f) + ((1 - f) * kVar.a(0));
            return;
        }
        k kVar2 = l0Var.f;
        if (kVar2 == null) {
            kVar2 = K;
        }
        l0Var.d = com.gamericefishpro.space.ji.f.b(((k) s1Var.r(j3, kVar, L, kVar2)).a(0), 0.0f, 1.0f);
    }

    public final void A() {
        l1 l1Var = this.w;
        if (l1Var == null) {
            return;
        }
        l1Var.l(com.gamericefishpro.space.gi.c.b(((double) this.A.g()) * ((Number) l1Var.l.getValue()).longValue()));
    }

    public final void B(float f) {
        this.A.h(f);
    }

    @Override // com.gamericefishpro.space.g1.b
    public final Object k() {
        return this.i.getValue();
    }

    @Override // com.gamericefishpro.space.g1.b
    public final void o(Object obj) {
        this.i.setValue(obj);
    }

    @Override // com.gamericefishpro.space.g1.b
    public final void p(l1 l1Var) {
        l1 l1Var2 = this.w;
        if (l1Var2 != null && !l1Var.equals(l1Var2)) {
            i0.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.w + ", new instance: " + l1Var);
        }
        this.w = l1Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
    @Override // com.gamericefishpro.space.g1.b
    public final void q() {
        this.w = null;
        ((com.gamericefishpro.space.f1.y) n1.b.getValue()).a(this);
    }

    public final Object w(com.gamericefishpro.space.vh.c cVar) {
        float fK = c.k(cVar.getContext());
        if (fK <= 0.0f) {
            x();
            return Unit.a;
        }
        this.I = fK;
        Object objE = com.gamericefishpro.space.t0.i.s(cVar.getContext()).E(this.J, cVar);
        return objE == com.gamericefishpro.space.uh.a.d ? objE : Unit.a;
    }

    public final void x() {
        l1 l1Var = this.w;
        if (l1Var != null) {
            l1Var.c();
        }
        this.F.d();
        if (this.G != null) {
            this.G = null;
            B(1.0f);
            A();
        }
    }

    public final Object z(float f, Object obj, com.gamericefishpro.space.vh.i iVar) {
        if (0.0f > f || f > 1.0f) {
            i0.a("Expecting fraction between 0 and 1. Got " + f);
        }
        l1 l1Var = this.w;
        if (l1Var == null) {
            return Unit.a;
        }
        Object objA = h0.a(this.D, new p0(obj, this.e.getValue(), this, l1Var, f, null), iVar);
        return objA == com.gamericefishpro.space.uh.a.d ? objA : Unit.a;
    }
}
