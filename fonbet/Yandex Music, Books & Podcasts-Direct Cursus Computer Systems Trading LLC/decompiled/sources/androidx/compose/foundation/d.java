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
public final class d extends uif implements pyc {
    public final /* synthetic */ yie r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ String t;
    public final /* synthetic */ meo u;
    public final /* synthetic */ Function0 v;
    public final /* synthetic */ String w;
    public final /* synthetic */ Function0 x;
    public final /* synthetic */ Function0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yie yieVar, boolean z, String str, meo meoVar, Function0 function0, String str2, Function0 function02, Function0 function03) {
        super(3);
        this.r = yieVar;
        this.s = z;
        this.t = str;
        this.u = meoVar;
        this.v = function0;
        this.w = str2;
        this.x = function02;
        this.y = function03;
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
        yci f = e.a(vci.a, uoiVar, this.r).f(new CombinedClickableElement(null, uoiVar, this.u, this.t, this.w, this.v, this.x, this.y, this.s));
        oq5Var.p(false);
        return f;
    }
}
