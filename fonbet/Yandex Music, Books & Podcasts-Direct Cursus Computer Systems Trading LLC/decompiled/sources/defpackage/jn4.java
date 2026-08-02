package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.e;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class jn4 extends uif implements pyc {
    public final /* synthetic */ boolean r;
    public final /* synthetic */ String s;
    public final /* synthetic */ meo t;
    public final /* synthetic */ Function0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn4(boolean z, String str, meo meoVar, Function0 function0) {
        super(3);
        this.r = z;
        this.s = str;
        this.t = meoVar;
        this.u = function0;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        uoi uoiVar;
        ((Number) obj3).intValue();
        oq5 oq5Var = (oq5) ((hq5) obj2);
        oq5Var.Z(-756081143);
        yie yieVar = (yie) oq5Var.j(e.a);
        if (yieVar instanceof cje) {
            oq5Var.Z(617653824);
            oq5Var.p(false);
            uoiVar = null;
        } else {
            oq5Var.Z(617786442);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = vz1.h(oq5Var);
            }
            uoiVar = (uoi) K;
            oq5Var.p(false);
        }
        uoi uoiVar2 = uoiVar;
        yci c = a.c(vci.a, uoiVar2, yieVar, this.r, this.s, this.t, this.u);
        oq5Var.p(false);
        return c;
    }
}
