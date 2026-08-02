package ru.yandex.tankerapp.go.domain.managers;

import defpackage.afo;
import defpackage.ca20;
import defpackage.da20;
import defpackage.ea20;
import defpackage.esa0;
import defpackage.jqr;
import defpackage.pzt0;
import defpackage.ssr;
import defpackage.tsr;
import defpackage.tt5;
import defpackage.use;
import defpackage.x920;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class c implements tsr, ca20 {
    public final com.yandex.go.cartech.dynamic.domain.a a;
    public final use b;
    public esa0 c;
    public pzt0 w;
    public afo x;
    public ea20 y;

    public c(com.yandex.go.cartech.dynamic.domain.a aVar, use useVar) {
        this.a = aVar;
        this.b = useVar;
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        tt5 tt5Var = ssrVar.c;
        ea20 ea20Var = new ea20(tt5Var, "сt_mob_network_manager");
        this.y = ea20Var;
        ea20Var.b(this);
        this.x = new afo(tt5Var, "сt_mob_network_manager/mob_updates_event_channel");
        esa0 esa0Var = new esa0();
        this.c = esa0Var;
        afo afoVar = this.x;
        if (afoVar == null) {
            afoVar = null;
        }
        afoVar.a(esa0Var);
        this.w = e.H(this.b.a, new jqr(this.a.a(), new MobNetworkManager$subscribeToMobUpdates$1(this, null), 3));
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ea20 ea20Var = this.y;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(null);
        pzt0 pzt0Var = this.w;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        afo afoVar = this.x;
        if (afoVar == null) {
            afoVar = null;
        }
        afoVar.a(null);
        this.c = null;
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
    }
}
