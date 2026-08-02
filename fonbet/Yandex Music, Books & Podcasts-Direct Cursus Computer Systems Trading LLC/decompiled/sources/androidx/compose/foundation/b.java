package androidx.compose.foundation;

import defpackage.gq5;
import defpackage.hq5;
import defpackage.meo;
import defpackage.oq5;
import defpackage.pyc;
import defpackage.uif;
import defpackage.uoi;
import defpackage.vci;
import defpackage.vz1;
import defpackage.yci;
import defpackage.yie;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class b extends uif implements pyc {
    public final /* synthetic */ yie r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ String t;
    public final /* synthetic */ meo u;
    public final /* synthetic */ Function0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yie yieVar, boolean z, String str, meo meoVar, Function0 function0) {
        super(3);
        this.r = yieVar;
        this.s = z;
        this.t = str;
        this.u = meoVar;
        this.v = function0;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        oq5 oq5Var = (oq5) ((hq5) obj2);
        oq5Var.Z(-1525724089);
        Object K = oq5Var.K();
        if (K == gq5.a) {
            K = vz1.h(oq5Var);
        }
        uoi uoiVar = (uoi) K;
        yci f = e.a(vci.a, uoiVar, this.r).f(new ClickableElement(uoiVar, null, this.s, this.t, this.u, this.v));
        oq5Var.p(false);
        return f;
    }
}
