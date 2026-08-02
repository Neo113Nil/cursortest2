package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv0w;", "Ljnb;", "<init>", "()V", "wizard-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class v0w extends jnb {
    public final jyr j = l18.b.b(hag.I(w0w.class), true);
    public final cvo k = new cvo(wjb.WizardScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
    public final suc l = new suc(this, new ruc("WizardScreen", true));
    public final ybf m = new ybf(ern.a(l1w.class), new cfv(3, this), new cfv(4, new u0w(this, 0)));

    public final void A(wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1546441073);
        int i2 = 16;
        int i3 = (oq5Var.h(this) ? 32 : 16) | i;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            qs5 qs5Var = e3w.a;
            boolean B = B();
            tmb x = x();
            heh hehVar = heh.a;
            dyv dyvVar = new dyv();
            w2w w2wVar = new w2w(new pwv(), new awv(), new a2w(), new ixv(), new jzv(), new tzv(), new q2w(), new fsv(), new vrv());
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new cp5(22);
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new fp5(i2);
                oq5Var.k0(K2);
            }
            Function2 function2 = (Function2) K2;
            wn5 C = ild.C(-219298275, new tt5(4, x), oq5Var);
            huv huvVar = new huv(2131231250, 2131230966);
            h0w h0wVar = new h0w(Integer.valueOf(R.raw.flash_wizard));
            function0.getClass();
            function2.getClass();
            wn5 wn5Var2 = n7w.e;
            wn5 wn5Var3 = n7w.f;
            c3w c3wVar = new c3w(new qwv(nu0.c(), nu0.j()), new bwv(nu0.j(), nu0.i(), nu0.i()), new b2w(nu0.j(), nu0.j(), nu0.j(), nu0.j(), nu0.j()), new jxv(nu0.j()), new kzv(nu0.e()), new uzv(nu0.c()), new dtv(nu0.j(), nu0.i()), new dsv(nu0.i(), nu0.d()), new esv(nu0.j(), nu0.d()), new r2w(nu0.d(), nu0.j(), nu0.j()));
            agr agrVar = eq0.a;
            etn.l(qs5Var.a(new d3w(w2wVar, dyvVar, C, huvVar, h0wVar, new guv(u7g.E(R.dimen.elevation_toolbar, oq5Var), 8), new cuv(new ttv(((dq0) oq5Var.j(agrVar)).d.a), new twv(((dq0) oq5Var.j(agrVar)).a.h, kg5.r(R.color.icon_like_day, oq5Var), new d85(((dq0) oq5Var.j(agrVar)).c.c)), new y2w(kg5.r(R.color.text_primary_day, oq5Var))), c3wVar, B, wn5Var2, wn5Var3, function0, function2)), ild.C(-20008497, new lqr(wn5Var, 17), oq5Var), oq5Var, 56);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u0v(this, wn5Var, i, 16);
        }
    }

    public final boolean B() {
        return requireArguments().getBoolean("show_onboarding");
    }

    public final void D(int i) {
        Context requireContext = requireContext();
        requireContext.getClass();
        y5g.n0(requireContext, i, 0);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ox6.B(((l1w) this.m.getValue()).M(), wyf.F(getLifecycle()), new lot(20, this));
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
        composeView.setContent(new wn5(new t0w(this, 0), -1658429800, true));
        return composeView;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.l.b();
    }

    @Override // defpackage.jnb
    /* renamed from: z, reason: from getter */
    public final cvo getJ() {
        return this.k;
    }
}
