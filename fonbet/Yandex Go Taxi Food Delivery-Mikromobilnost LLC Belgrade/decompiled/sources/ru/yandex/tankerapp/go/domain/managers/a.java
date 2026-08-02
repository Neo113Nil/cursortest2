package ru.yandex.tankerapp.go.domain.managers;

import com.yandex.go.cartech.dynamic.domain.d;
import defpackage.afo;
import defpackage.ca20;
import defpackage.da20;
import defpackage.ea20;
import defpackage.esa0;
import defpackage.jqr;
import defpackage.pzt0;
import defpackage.ssr;
import defpackage.tje;
import defpackage.tsr;
import defpackage.tt5;
import defpackage.use;
import defpackage.x920;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class a implements tsr, ca20 {
    public final d a;
    public final use b;
    public ea20 c;
    public afo w;
    public esa0 x;
    public pzt0 y;

    public a(d dVar, use useVar) {
        this.a = dVar;
        this.b = useVar;
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        tt5 tt5Var = ssrVar.c;
        this.c = new ea20(tt5Var, "tanker_auth_manager");
        this.w = new afo(tt5Var, "tanker_auth_manager/on_auth_changed");
        ea20 ea20Var = this.c;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(this);
        esa0 esa0Var = new esa0();
        this.x = esa0Var;
        afo afoVar = this.w;
        if (afoVar == null) {
            afoVar = null;
        }
        afoVar.a(esa0Var);
        pzt0 pzt0Var = this.y;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        d dVar = this.a;
        this.y = e.H(this.b.a, new jqr(new com.yandex.go.cartech.dynamic.domain.c(dVar.d.f, dVar), new AuthManager$subscribeOnAccountStateChanges$1(this, null), 3));
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        pzt0 pzt0Var = this.y;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        ea20 ea20Var = this.c;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(null);
        afo afoVar = this.w;
        if (afoVar == null) {
            afoVar = null;
        }
        afoVar.a(null);
        this.x = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        Object obj = x920Var.b;
        String str = x920Var.a;
        if (str != null) {
            int hashCode = str.hashCode();
            use useVar = this.b;
            switch (hashCode) {
                case -1074241167:
                    if (str.equals("tanker_auth_manager/need_authorize")) {
                        tje.N(useVar.a, null, null, new AuthManager$requestAuth$1(this, da20Var, null), 3);
                        break;
                    }
                    break;
                case -457288915:
                    if (str.equals("tanker_auth_manager/get_current_account")) {
                        tje.N(useVar.a, null, null, new AuthManager$getCurrentAccount$1(this, da20Var, null), 3);
                        break;
                    }
                    break;
                case -27007419:
                    if (str.equals("tanker_auth_manager/get_authorized_url")) {
                        tje.N(useVar.a, null, null, new AuthManager$getAuthorizedUrl$1(this, obj, da20Var, null), 3);
                        break;
                    }
                    break;
                case 1664289848:
                    if (str.equals("tanker_auth_manager/request_token")) {
                        tje.N(useVar.a, null, null, new AuthManager$requestToken$1(this, obj, da20Var, null), 3);
                        break;
                    }
                    break;
            }
        }
    }
}
