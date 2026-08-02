package defpackage;

import android.content.Context;
import com.yandex.go.chargers.misc.web.ChargersWebViewModalView;
import com.yandex.go.navigation.modals.coroutines.a;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class zya extends a {
    public final w030 F;
    public final yvf0 G;
    public final gza H;

    public zya(w030 w030Var, yvf0 yvf0Var, gza gzaVar) {
        super(null);
        this.F = w030Var;
        this.G = yvf0Var;
        this.H = gzaVar;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        eza ezaVar = (eza) obj;
        gly0 gly0Var = ezaVar.b;
        aza azaVar = ezaVar.a;
        od9 od9Var = new od9(17, this);
        yya yyaVar = new yya(0, gly0Var);
        sk7 sk7Var = this.H.a;
        return new ChargersWebViewModalView((Context) ((xvf0) sk7Var.b).get(), (zm41) ((rxf) sk7Var.c).get(), (fza) ((dx9) sk7Var.w).get(), azaVar, od9Var, yyaVar);
    }
}
