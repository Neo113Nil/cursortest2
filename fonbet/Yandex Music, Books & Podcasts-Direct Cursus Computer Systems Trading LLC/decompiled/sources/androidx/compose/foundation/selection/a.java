package androidx.compose.foundation.selection;

import androidx.compose.foundation.e;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.meo;
import defpackage.oq5;
import defpackage.pyc;
import defpackage.syc;
import defpackage.uif;
import defpackage.uoi;
import defpackage.vci;
import defpackage.vz1;
import defpackage.yci;
import defpackage.yie;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class a extends uif implements pyc {
    public final /* synthetic */ int r;
    public final /* synthetic */ yie s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ meo v;
    public final /* synthetic */ syc w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(yie yieVar, boolean z, boolean z2, meo meoVar, syc sycVar, int i) {
        super(3);
        this.r = i;
        this.s = yieVar;
        this.t = z;
        this.u = z2;
        this.v = meoVar;
        this.w = sycVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.r) {
            case 0:
                ((Number) obj3).intValue();
                oq5 oq5Var = (oq5) ((hq5) obj2);
                oq5Var.Z(-1525724089);
                Object K = oq5Var.K();
                if (K == gq5.a) {
                    K = vz1.h(oq5Var);
                }
                uoi uoiVar = (uoi) K;
                yci f = e.a(vci.a, uoiVar, this.s).f(new SelectableElement(this.t, uoiVar, null, this.u, this.v, (Function0) this.w));
                oq5Var.p(false);
                return f;
            default:
                ((Number) obj3).intValue();
                oq5 oq5Var2 = (oq5) ((hq5) obj2);
                oq5Var2.Z(-1525724089);
                Object K2 = oq5Var2.K();
                if (K2 == gq5.a) {
                    K2 = vz1.h(oq5Var2);
                }
                uoi uoiVar2 = (uoi) K2;
                yci f2 = e.a(vci.a, uoiVar2, this.s).f(new ToggleableElement(this.t, uoiVar2, null, this.u, this.v, (Function1) this.w));
                oq5Var2.p(false);
                return f2;
        }
    }
}
