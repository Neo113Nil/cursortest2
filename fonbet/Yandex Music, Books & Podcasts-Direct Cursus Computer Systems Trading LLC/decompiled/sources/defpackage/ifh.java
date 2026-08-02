package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ifh extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ jfh s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ifh(jfh jfhVar, int i) {
        super(0);
        this.r = i;
        this.s = jfhVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        jsk placementScope;
        switch (this.r) {
            case 0:
                jfh jfhVar = this.s;
                qpf qpfVar = jfhVar.f;
                qpfVar.i = 0;
                eqi y = qpfVar.a.y();
                Object[] objArr = y.a;
                int i = y.c;
                for (int i2 = 0; i2 < i; i2++) {
                    jfh jfhVar2 = ((mpf) objArr[i2]).G.p;
                    jfhVar2.h = jfhVar2.i;
                    jfhVar2.i = Integer.MAX_VALUE;
                    jfhVar2.u = false;
                    if (jfhVar2.l == kpf.b) {
                        jfhVar2.l = kpf.c;
                    }
                }
                mpf mpfVar = qpfVar.a;
                mpf mpfVar2 = qpfVar.a;
                eqi y2 = mpfVar.y();
                Object[] objArr2 = y2.a;
                int i3 = y2.c;
                for (int i4 = 0; i4 < i3; i4++) {
                    ((mpf) objArr2[i4]).G.p.y.d = false;
                }
                jfhVar.D().K0().d();
                eqi y3 = mpfVar2.y();
                Object[] objArr3 = y3.a;
                int i5 = y3.c;
                for (int i6 = 0; i6 < i5; i6++) {
                    mpf mpfVar3 = (mpf) objArr3[i6];
                    qpf qpfVar2 = mpfVar3.G;
                    if (qpfVar2.p.h != mpfVar3.v()) {
                        mpfVar2.M();
                        mpfVar2.B();
                        if (mpfVar3.v() == Integer.MAX_VALUE) {
                            if (qpfVar2.c) {
                                zwg zwgVar = qpfVar2.q;
                                zwgVar.getClass();
                                zwgVar.C0(false);
                            }
                            qpfVar2.p.G0();
                        }
                    }
                }
                eqi y4 = mpfVar2.y();
                Object[] objArr4 = y4.a;
                int i7 = y4.c;
                for (int i8 = 0; i8 < i7; i8++) {
                    npf npfVar = ((mpf) objArr4[i8]).G.p.y;
                    npfVar.e = npfVar.d;
                }
                break;
            case 1:
                jfh jfhVar3 = this.s;
                jfhVar3.f.a().M(jfhVar3.C);
                break;
            default:
                jfh jfhVar4 = this.s;
                qpf qpfVar3 = jfhVar4.f;
                f8j f8jVar = qpfVar3.a().n;
                if (f8jVar == null || (placementScope = f8jVar.i) == null) {
                    placementScope = ppf.a(qpfVar3.a).getPlacementScope();
                }
                Function1 function1 = jfhVar4.H;
                xod xodVar = jfhVar4.I;
                if (xodVar != null) {
                    f8j a = qpfVar3.a();
                    long j = jfhVar4.J;
                    float f = jfhVar4.K;
                    placementScope.getClass();
                    jsk.a(placementScope, a);
                    a.p0(wpe.d(j, a.e), f, xodVar);
                } else if (function1 == null) {
                    f8j a2 = qpfVar3.a();
                    long j2 = jfhVar4.J;
                    float f2 = jfhVar4.K;
                    placementScope.getClass();
                    jsk.a(placementScope, a2);
                    a2.r0(wpe.d(j2, a2.e), f2, null);
                } else {
                    f8j a3 = qpfVar3.a();
                    long j3 = jfhVar4.J;
                    float f3 = jfhVar4.K;
                    placementScope.getClass();
                    jsk.a(placementScope, a3);
                    a3.r0(wpe.d(j3, a3.e), f3, function1);
                }
                break;
        }
        return Unit.a;
    }
}
