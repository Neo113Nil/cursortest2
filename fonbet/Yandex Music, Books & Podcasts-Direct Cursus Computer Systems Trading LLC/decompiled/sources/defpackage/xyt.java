package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class xyt extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ yyt s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xyt(yyt yytVar, int i) {
        super(1);
        this.r = i;
        this.s = yytVar;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                yyt yytVar = this.s;
                yytVar.d = true;
                yytVar.f.invoke();
                return Unit.a;
            default:
                jpa jpaVar = (jpa) obj;
                yyt yytVar2 = this.s;
                nqd nqdVar = yytVar2.b;
                float f = yytVar2.k;
                float f2 = yytVar2.l;
                nsh q0 = jpaVar.q0();
                long B = q0.B();
                q0.s().r();
                try {
                    ((xzi) q0.b).f0(f, f2, 0L);
                    nqdVar.a(jpaVar);
                    vz1.A(q0, B);
                    return Unit.a;
                } catch (Throwable th) {
                    vz1.A(q0, B);
                    throw th;
                }
        }
    }
}
