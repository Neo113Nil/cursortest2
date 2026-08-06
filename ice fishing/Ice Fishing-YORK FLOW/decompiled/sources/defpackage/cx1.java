package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class cx1 extends defpackage.mi1 implements defpackage.c20 {
    public int GE9mJIPrb8gP;
    public /* synthetic */ java.lang.Object Ns0WNyEWdPsk;
    public final /* synthetic */ int e6mdH7fiFuta = 0;
    public final /* synthetic */ java.lang.Object fNwYGHIYeJcR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx1(defpackage.m31 m31Var, android.view.View view, defpackage.kl klVar) {
        super(2, klVar);
        this.Ns0WNyEWdPsk = m31Var;
        this.fNwYGHIYeJcR = view;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        switch (i) {
            case 0:
                return ((defpackage.cx1) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.sm) obj)).s0TASMVLSWD5(gs1Var);
            default:
                return ((defpackage.cx1) XntWc4eZSQ8j((defpackage.kl) obj2, obj)).s0TASMVLSWD5(gs1Var);
        }
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        java.lang.Object obj2 = this.fNwYGHIYeJcR;
        switch (i) {
            case 0:
                return new defpackage.cx1((defpackage.m31) this.Ns0WNyEWdPsk, (android.view.View) obj2, klVar);
            default:
                defpackage.cx1 cx1Var = new defpackage.cx1((defpackage.ux) obj2, klVar);
                cx1Var.Ns0WNyEWdPsk = obj;
                return cx1Var;
        }
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        java.lang.Object obj2 = this.fNwYGHIYeJcR;
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        defpackage.kl klVar = null;
        switch (i) {
            case 0:
                defpackage.m31 m31Var = (defpackage.m31) this.Ns0WNyEWdPsk;
                android.view.View view = (android.view.View) obj2;
                int i2 = this.GE9mJIPrb8gP;
                try {
                    if (i2 == 0) {
                        defpackage.b80.KrtOTfE6jiS2(obj);
                        this.GE9mJIPrb8gP = 1;
                        java.lang.Object gUjdnLbkVAaA = defpackage.nn.gUjdnLbkVAaA(m31Var.w7APNrr0aGRc, new defpackage.j31(2, klVar, 0), this);
                        if (gUjdnLbkVAaA != tmVar) {
                            gUjdnLbkVAaA = gs1Var;
                        }
                        if (gUjdnLbkVAaA == tmVar) {
                            return tmVar;
                        }
                    } else {
                        if (i2 != 1) {
                            defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        defpackage.b80.KrtOTfE6jiS2(obj);
                    }
                    if (defpackage.jx1.ZpBGe2uQfcn8(view) != m31Var) {
                        return gs1Var;
                    }
                    view.setTag(com.ice.fishing.wolberta.R.id.androidx_compose_ui_view_composition_context, null);
                    return gs1Var;
                } finally {
                    if (defpackage.jx1.ZpBGe2uQfcn8(view) == m31Var) {
                        view.setTag(com.ice.fishing.wolberta.R.id.androidx_compose_ui_view_composition_context, null);
                    }
                }
            default:
                int i3 = this.GE9mJIPrb8gP;
                if (i3 == 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    java.lang.Object obj3 = this.Ns0WNyEWdPsk;
                    this.GE9mJIPrb8gP = 1;
                    return ((defpackage.ux) obj2).fNwYGHIYeJcR(obj3, this) == tmVar ? tmVar : gs1Var;
                }
                if (i3 == 1) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    return gs1Var;
                }
                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx1(defpackage.ux uxVar, defpackage.kl klVar) {
        super(2, klVar);
        this.fNwYGHIYeJcR = uxVar;
    }
}
