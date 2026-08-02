package defpackage;

import androidx.compose.ui.input.key.a;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ebs extends uif implements pyc {
    public final /* synthetic */ axf r;
    public final /* synthetic */ qbs s;
    public final /* synthetic */ ybs t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ mnj w;
    public final /* synthetic */ mit x;
    public final /* synthetic */ Function1 y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebs(axf axfVar, qbs qbsVar, ybs ybsVar, boolean z, boolean z2, mnj mnjVar, mit mitVar, Function1 function1, int i) {
        super(3);
        this.r = axfVar;
        this.s = qbsVar;
        this.t = ybsVar;
        this.u = z;
        this.v = z2;
        this.w = mnjVar;
        this.x = mitVar;
        this.y = function1;
        this.z = i;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        oq5 oq5Var = (oq5) ((hq5) obj2);
        oq5Var.Z(851809892);
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = new pds();
            oq5Var.k0(K);
        }
        pds pdsVar = (pds) K;
        Object K2 = oq5Var.K();
        if (K2 == kjnVar) {
            K2 = new ae7();
            oq5Var.k0(K2);
        }
        Function1 function1 = this.y;
        int i = this.z;
        dbs dbsVar = new dbs(this.r, this.s, this.t, this.u, this.v, pdsVar, this.w, this.x, (ae7) K2, function1, i);
        boolean h = oq5Var.h(dbsVar);
        Object K3 = oq5Var.K();
        if (h || K3 == kjnVar) {
            lgq lgqVar = new lgq(1, dbsVar, dbs.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 12);
            oq5Var.k0(lgqVar);
            K3 = lgqVar;
        }
        yci a = a.a(vci.a, (Function1) ((h9f) K3));
        oq5Var.p(false);
        return a;
    }
}
