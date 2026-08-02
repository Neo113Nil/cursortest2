package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ol6 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ long s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol6(long j, o0k o0kVar) {
        super(1);
        this.r = 3;
        this.s = j;
        this.t = o0kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        long j = this.s;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                jpa jpaVar = (jpa) obj;
                axf axfVar = (axf) obj2;
                if (((Boolean) axfVar.s.getValue()).booleanValue() || ((Boolean) axfVar.t.getValue()).booleanValue()) {
                    jpa.B(jpaVar, this.s, 0L, 0L, 0.0f, null, 0, 126);
                }
                return Unit.a;
            case 1:
                ltf ltfVar = (ltf) obj2;
                long c = wpe.c(((wpe) ((fk0) obj).e()).a, j);
                int i2 = ltf.t;
                ltfVar.g(c);
                ltfVar.c.invoke();
                return Unit.a;
            case 2:
                jpa jpaVar2 = (jpa) obj;
                jpaVar2.getClass();
                jpa.x0(jpaVar2, (nh0) obj2, this.s, 0.0f, new amr(3.0f, 0.0f, 1, 1, 18), 52);
                return Unit.a;
            default:
                opf opfVar = (opf) obj;
                float d = nmq.d(j);
                if (d > 0.0f) {
                    float n0 = opfVar.n0(lyj.a);
                    ou3 ou3Var = opfVar.a;
                    float n02 = opfVar.n0(((o0k) obj2).b(opfVar.getLayoutDirection())) - n0;
                    float f = 2;
                    float f2 = (n0 * f) + d + n02;
                    xof layoutDirection = opfVar.getLayoutDirection();
                    int[] iArr = kyj.a;
                    float d2 = iArr[layoutDirection.ordinal()] == 1 ? nmq.d(ou3Var.e()) - f2 : n02 < 0.0f ? 0.0f : n02;
                    if (iArr[opfVar.getLayoutDirection().ordinal()] == 1) {
                        f2 = nmq.d(ou3Var.e()) - (n02 >= 0.0f ? n02 : 0.0f);
                    }
                    float f3 = f2;
                    float b = nmq.b(j);
                    float f4 = (-b) / f;
                    float f5 = b / f;
                    nsh nshVar = ou3Var.b;
                    long B = nshVar.B();
                    nshVar.s().r();
                    try {
                        ((xzi) nshVar.b).W(d2, f4, f3, f5, 0);
                        opfVar.a();
                    } finally {
                        vz1.A(nshVar, B);
                    }
                } else {
                    opfVar.a();
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ol6(Object obj, long j, int i) {
        super(1);
        this.r = i;
        this.t = obj;
        this.s = j;
    }
}
