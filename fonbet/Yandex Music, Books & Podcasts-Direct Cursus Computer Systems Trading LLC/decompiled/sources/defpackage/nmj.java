package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class nmj {
    public final efo a;

    public nmj(efo efoVar) {
        this.a = efoVar;
    }

    public final jmj a(dmj dmjVar, tmb tmbVar, int i, hq5 hq5Var, int i2) {
        dmjVar.getClass();
        tmbVar.getClass();
        int i3 = (i2 & 14) | 560;
        int i4 = i2 << 3;
        return b(dmjVar, null, tmbVar, i, hq5Var, i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344));
    }

    public final jmj b(dmj dmjVar, Activity activity, tmb tmbVar, int i, hq5 hq5Var, int i2) {
        Activity activity2;
        emj o6cVar;
        dmjVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-1190900134);
        if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
            imj imjVar = new imj();
            oq5Var.p(false);
            return imjVar;
        }
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
        }
        mm6 mm6Var = ((fs5) K).a;
        if (activity == null) {
            oq5Var.Z(-1993715086);
            Activity R = vq2.R((Context) oq5Var.j(AndroidCompositionLocals_androidKt.b));
            oq5Var.p(false);
            activity2 = R;
        } else {
            oq5Var.Z(-1993716109);
            oq5Var.p(false);
            activity2 = activity;
        }
        boolean z = true;
        boolean z2 = (((57344 & i2) ^ 24576) > 16384 && oq5Var.h(this)) || (i2 & 24576) == 16384;
        Object K2 = oq5Var.K();
        if (z2 || K2 == kjnVar) {
            K2 = new s8i(9, this);
            oq5Var.k0(K2);
        }
        Function1 function1 = (Function1) K2;
        oq5Var.a0(419377738);
        kfu a = rpg.a(oq5Var);
        if (a == null) {
            xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            return null;
        }
        bfu R2 = ngg.R(ern.a(pmj.class), a, null, k5r.g(pmj.class, new p97(1), function1), a instanceof ssd ? ((ssd) a).getDefaultViewModelCreationExtras() : gs6.b, oq5Var);
        oq5Var.p(false);
        pmj pmjVar = (pmj) R2;
        boolean f = oq5Var.f(activity2);
        if ((((i2 & 896) ^ 384) <= 256 || !oq5Var.f(tmbVar)) && (i2 & 384) != 256) {
            z = false;
        }
        boolean f2 = f | z | oq5Var.f(pmjVar) | oq5Var.f(mm6Var);
        Object K3 = oq5Var.K();
        if (f2 || K3 == kjnVar) {
            if (activity2 != null) {
                o6cVar = new awc(activity2);
            } else {
                Assertions.throwOrSkip("OfflineSwitcherUiLogicComponent", new FailedAssertionException("can't extract activity for actions"));
                o6cVar = new o6c(29);
            }
            lmj lmjVar = new lmj(mm6Var, i, tmbVar, pmjVar, o6cVar, new kef(1, dmjVar, dmj.class, "onRefresh", "onRefresh(Z)V", 0, 22));
            oq5Var.k0(lmjVar);
            K3 = lmjVar;
        }
        lmj lmjVar2 = (lmj) K3;
        oq5Var.p(false);
        return lmjVar2;
    }
}
