package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class u7v implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b7v b;

    public /* synthetic */ u7v(b7v b7vVar, int i) {
        this.a = i;
        this.b = b7vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                np3 np3Var = (np3) obj;
                np3Var.getClass();
                return np3Var.b(new u7v(this.b, 1));
            default:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                opfVar.a();
                t7v t7vVar = (t7v) this.b.b.invoke();
                if (t7vVar instanceof s7v) {
                    nsh nshVar = opfVar.a.b;
                    long B = nshVar.B();
                    nshVar.s().r();
                    try {
                        xzi xziVar = (xzi) nshVar.b;
                        nsh nshVar2 = (nsh) xziVar.a;
                        xziVar.e0(112.0f, a4g.y(nshVar2.B()));
                        xziVar.f0(1.41f, 1.41f, a4g.y(nshVar2.B()));
                        jpa.A0(opfVar, ((s7v) t7vVar).a, 0L, 0L, 0.0f, null, null, 5, 62);
                    } finally {
                        vz1.A(nshVar, B);
                    }
                } else if (!Intrinsics.d(t7vVar, r7v.a)) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
        }
    }
}
