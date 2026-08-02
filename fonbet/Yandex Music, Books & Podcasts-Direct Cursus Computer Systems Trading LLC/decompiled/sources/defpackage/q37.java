package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q37 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ t37 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q37(t37 t37Var, int i) {
        super(0);
        this.r = i;
        this.s = t37Var;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                sbp sbpVar = this.s.g;
                if (sbpVar != null) {
                    return sbpVar.a();
                }
                Intrinsics.j("callbacks");
                throw null;
            case 1:
                if (this.s.g != null) {
                    return new k1o();
                }
                Intrinsics.j("callbacks");
                throw null;
            case 2:
                t37 t37Var = this.s;
                hpo hpoVar = t37Var.x().s;
                hpoVar.b.invoke();
                hpoVar.a = false;
                sbp sbpVar2 = t37Var.g;
                if (sbpVar2 == null) {
                    Intrinsics.j("callbacks");
                    throw null;
                }
                sbpVar2.l();
                g47 x = t37Var.x();
                rar rarVar = x.D;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                ((fjs) x.v.getValue()).b();
                x.D = null;
                return Unit.a;
            case 3:
                return this.s;
            default:
                p37 p37Var = this.s.m;
                if (p37Var != null) {
                    return p37Var;
                }
                Intrinsics.j("viewModelFactory");
                throw null;
        }
    }
}
