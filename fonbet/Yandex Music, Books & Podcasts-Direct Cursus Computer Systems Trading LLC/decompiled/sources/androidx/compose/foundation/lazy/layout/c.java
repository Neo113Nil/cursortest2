package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.ak0;
import defpackage.aqi;
import defpackage.cnr;
import defpackage.di0;
import defpackage.euf;
import defpackage.fuf;
import defpackage.gld;
import defpackage.gq5;
import defpackage.hoo;
import defpackage.hq5;
import defpackage.nnd;
import defpackage.oq5;
import defpackage.pyc;
import defpackage.qtf;
import defpackage.stf;
import defpackage.tmm;
import defpackage.u2x;
import defpackage.uif;
import defpackage.uv2;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c extends uif implements pyc {
    public final /* synthetic */ euf r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ Function2 t;
    public final /* synthetic */ aqi u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(euf eufVar, yci yciVar, Function2 function2, aqi aqiVar) {
        super(3);
        this.r = eufVar;
        this.s = yciVar;
        this.t = function2;
        this.u = aqiVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        yci f;
        hoo hooVar = (hoo) obj;
        ((Number) obj3).intValue();
        oq5 oq5Var = (oq5) ((hq5) obj2);
        Object K = oq5Var.K();
        Object obj4 = gq5.a;
        if (K == obj4) {
            K = new stf(hooVar, new uv2(this.u, 3));
            oq5Var.k0(K);
        }
        stf stfVar = (stf) K;
        Object K2 = oq5Var.K();
        if (K2 == obj4) {
            K2 = new cnr(new nnd(stfVar));
            oq5Var.k0(K2);
        }
        cnr cnrVar = (cnr) K2;
        euf eufVar = this.r;
        if (eufVar != null) {
            oq5Var.Z(204281539);
            oq5Var.Z(6591363);
            Object obj5 = tmm.a;
            if (obj5 != null) {
                oq5Var.Z(1213893039);
                oq5Var.p(false);
            } else {
                oq5Var.Z(1213931944);
                View view = (View) oq5Var.j(AndroidCompositionLocals_androidKt.f);
                boolean f2 = oq5Var.f(view);
                Object K3 = oq5Var.K();
                if (f2 || K3 == obj4) {
                    K3 = new di0(view);
                    oq5Var.k0(K3);
                }
                obj5 = (di0) K3;
                oq5Var.p(false);
            }
            Object obj6 = obj5;
            oq5Var.p(false);
            Object[] objArr = {eufVar, stfVar, cnrVar, obj6};
            boolean f3 = oq5Var.f(eufVar) | oq5Var.h(stfVar) | oq5Var.h(cnrVar) | oq5Var.h(obj6);
            Object K4 = oq5Var.K();
            if (f3 || K4 == obj4) {
                Object ak0Var = new ak0(eufVar, stfVar, cnrVar, obj6, 18);
                oq5Var.k0(ak0Var);
                K4 = ak0Var;
            }
            gld.l(objArr, (Function1) K4, oq5Var);
            oq5Var.p(false);
        } else {
            oq5Var.Z(204710145);
            oq5Var.p(false);
        }
        int i = fuf.b;
        yci yciVar = this.s;
        if (eufVar != null && (f = yciVar.f(new TraversablePrefetchStateModifierElement(eufVar))) != null) {
            yciVar = f;
        }
        boolean f4 = oq5Var.f(stfVar);
        Object obj7 = this.t;
        boolean f5 = f4 | oq5Var.f(obj7);
        Object K5 = oq5Var.K();
        if (f5 || K5 == obj4) {
            K5 = new qtf(1, stfVar, obj7);
            oq5Var.k0(K5);
        }
        u2x.q(cnrVar, yciVar, (Function2) K5, oq5Var, 8);
        return Unit.a;
    }
}
