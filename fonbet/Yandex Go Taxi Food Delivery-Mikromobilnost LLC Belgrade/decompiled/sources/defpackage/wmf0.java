package defpackage;

import com.yandex.go.promocodes.referral.api.net.dto.ReferralCode;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralOverrides;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralService;
import java.util.List;
import kotlin.text.Regex;

/* loaded from: classes13.dex */
public final class wmf0 extends ad5 {
    public final tmf0 A;
    public final zuj0 B;
    public final k7x0 C;
    public final xdf D;
    public final oz01 E;
    public final ity F;
    public final hbp0 G;
    public ReferralCode H;
    public boolean I;
    public umf0 J;
    public final nni0 x;
    public final k3c y;
    public final vjr0 z;

    public wmf0(nni0 nni0Var, k3c k3cVar, vjr0 vjr0Var, tmf0 tmf0Var, zuj0 zuj0Var, k7x0 k7x0Var, xdf xdfVar, oz01 oz01Var, ity ityVar) {
        super(hnf0.class);
        this.x = nni0Var;
        this.y = k3cVar;
        this.z = vjr0Var;
        this.A = tmf0Var;
        this.B = zuj0Var;
        this.C = k7x0Var;
        this.D = xdfVar;
        this.E = oz01Var;
        this.F = ityVar;
        this.G = new hbp0(new czo0(14), wmf0.class.getSimpleName(), null);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.G.b();
    }

    public final void Kg(ReferralCode referralCode) {
        String str;
        String str2;
        String str3;
        if (referralCode == ReferralCode.n) {
            return;
        }
        String str4 = referralCode.a;
        int i = referralCode.b;
        ReferralService referralService = referralCode.i;
        zuj0 zuj0Var = this.B;
        if (str4 == null || str4.length() == 0) {
            g8e.C("no referral code", jst.e);
            umf0 umf0Var = this.J;
            if (umf0Var != null) {
                ((v5c0) umf0Var).L(new udj(this.E.a(kyh0.referral_share_no_promocode), ((avj0) zuj0Var).h(kyh0.common_got_it), new oxe0(9, this), 53));
            }
            ((hnf0) Dg()).setButtonGroupVisibility(false);
            return;
        }
        if (!this.I) {
            List list = tmf0.c;
            this.A.c(referralService, i, false);
            this.I = true;
        }
        ((hnf0) Dg()).setLoadingVisibility(false);
        ((hnf0) Dg()).setButtonGroupVisibility(true);
        ief iefVar = referralCode.f;
        ReferralOverrides referralOverrides = referralCode.h;
        String e = kub1.e(this.D, iefVar, referralCode.c);
        str = "";
        if (e.length() == 0) {
            ((hnf0) Dg()).setTitleText("");
            ((hnf0) Dg()).setBodyText("");
        } else {
            List l = new Regex("[\r\n]+").l(0, e);
            if (l.isEmpty()) {
                str2 = "";
            } else {
                String str5 = (String) l.get(0);
                str2 = l.size() > 1 ? new Regex("[\r\n]+").k(cvu0.v(e, str5, "", false), "") : "";
                str = str5;
            }
            ((hnf0) Dg()).setTitleText(str);
            ((hnf0) Dg()).setBodyText(str2);
        }
        if (referralService == ReferralService.GROCERY) {
            ((hnf0) Dg()).setConsiderOnlyTextForBottomViewsVisibility(true);
            ((hnf0) Dg()).overrideRidesLeftColor("FFFFFF");
            ((hnf0) Dg()).overrideFirstButtonColors("FFFFFF", "21201f");
            ((hnf0) Dg()).overrideSendButtonColors("FFFFFF", "21201f");
        } else {
            ((hnf0) Dg()).setConsiderOnlyTextForBottomViewsVisibility(false);
            ((hnf0) Dg()).overrideRidesLeftColor(null);
            ((hnf0) Dg()).overrideFirstButtonColors(null, null);
            ((hnf0) Dg()).overrideSendButtonColors(null, null);
        }
        hnf0 hnf0Var = (hnf0) Dg();
        ReferralOverrides.ReferralScreen referralScreen = referralOverrides.a;
        hnf0Var.setBackgroundImage((referralScreen == null || (str3 = referralScreen.c) == null) ? null : ((m7x0) this.C).a(str3), f1h0.balloons);
        ((hnf0) Dg()).overrideBackgroundColor(referralScreen != null ? referralScreen.d : null);
        ((hnf0) Dg()).overridePromocodeColor(referralScreen != null ? referralScreen.e : null);
        String str6 = referralCode.a;
        if (str6 != null) {
            ((hnf0) Dg()).setPromoCodeText(str6);
        }
        avj0 avj0Var = (avj0) zuj0Var;
        ((hnf0) Dg()).setFirstButtonState(true, avj0Var.h(kyh0.promocode_copy));
        String str7 = referralScreen != null ? referralScreen.b : null;
        if (str7 == null) {
            str7 = avj0Var.h(kyh0.promocode_send);
        }
        ((hnf0) Dg()).setSendButtonText(str7);
        String str8 = referralScreen != null ? referralScreen.a : null;
        if (str8 != null) {
            ((hnf0) Dg()).setRidesLeftText(str8);
        } else if (i > 0) {
            ((hnf0) Dg()).setRidesLeftText(avj0Var.g(dwh0.referral_rides, kyh0.referral_rides_plural_fallback, i));
        } else {
            ((hnf0) Dg()).setRidesLeftText(null);
        }
        this.H = referralCode;
    }

    public final void n5() {
        ReferralCode referralCode = this.H;
        if (referralCode != null) {
            int i = referralCode.b;
            ReferralService referralService = referralCode.i;
            List list = tmf0.c;
            tmf0 tmf0Var = this.A;
            tmf0Var.a("cancel", referralService, i, false);
            tmf0Var.b("cancel", referralService, i, false);
        }
        umf0 umf0Var = this.J;
        if (umf0Var != null) {
            ((da0) ((v5c0) umf0Var).b).r(new qu(9));
        }
    }
}
