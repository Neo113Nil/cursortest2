package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.e;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class kn4 extends uif implements pyc {
    public final /* synthetic */ boolean r;
    public final /* synthetic */ String s;
    public final /* synthetic */ meo t;
    public final /* synthetic */ String u;
    public final /* synthetic */ Function0 v;
    public final /* synthetic */ Function0 w;
    public final /* synthetic */ Function0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn4(boolean z, String str, meo meoVar, String str2, Function0 function0, Function0 function02, Function0 function03) {
        super(3);
        this.r = z;
        this.s = str;
        this.t = meoVar;
        this.u = str2;
        this.v = function0;
        this.w = function02;
        this.x = function03;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        uoi uoiVar;
        ((Number) obj3).intValue();
        oq5 oq5Var = (oq5) ((hq5) obj2);
        oq5Var.Z(-1534186401);
        yie yieVar = (yie) oq5Var.j(e.a);
        if (yieVar instanceof cje) {
            oq5Var.Z(-1726068379);
            oq5Var.p(false);
            uoiVar = null;
        } else {
            oq5Var.Z(-1725935761);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = vz1.h(oq5Var);
            }
            uoiVar = (uoi) K;
            oq5Var.p(false);
        }
        uoi uoiVar2 = uoiVar;
        yci g = a.g(vci.a, uoiVar2, yieVar, this.r, this.s, this.t, this.u, this.v, this.w, this.x);
        oq5Var.p(false);
        return g;
    }
}
