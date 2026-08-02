package defpackage;

import android.text.SpannableStringBuilder;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralCode;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralOverrides;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final class ymf0 extends ad5 {
    public final tmf0 A;
    public final zuj0 B;
    public final k7x0 C;
    public final xdf D;
    public final c E;
    public final r0 F;
    public final h270 G;
    public final nni0 x;
    public final k3c y;
    public final vjr0 z;

    public ymf0(nni0 nni0Var, k3c k3cVar, vjr0 vjr0Var, tmf0 tmf0Var, zuj0 zuj0Var, k7x0 k7x0Var, xdf xdfVar, c cVar) {
        super(inf0.class);
        this.x = nni0Var;
        this.y = k3cVar;
        this.z = vjr0Var;
        this.A = tmf0Var;
        this.B = zuj0Var;
        this.C = k7x0Var;
        this.D = xdfVar;
        this.E = cVar;
        this.F = bvf0.c(m0z.a);
        this.G = new h270();
    }

    public final void Kg() {
        jst.e.j(new IllegalStateException("invalid referral code"));
        inf0 inf0Var = (inf0) Dg();
        int i = kyh0.referral_share_no_promocode;
        avj0 avj0Var = (avj0) this.B;
        inf0Var.showDialog(new udj(avj0Var.h(i), avj0Var.h(kyh0.common_got_it), new oxe0(10, this), 53));
    }

    public final void Lg(ReferralCode referralCode) {
        String h;
        String g;
        if (referralCode == ReferralCode.n) {
            return;
        }
        String str = referralCode.a;
        ReferralOverrides referralOverrides = referralCode.h;
        if (str == null || str.length() == 0) {
            Kg();
            return;
        }
        FormattedText formattedText = referralCode.k;
        if (formattedText == null) {
            Kg();
            return;
        }
        ReferralOverrides.ReferralScreen referralScreen = referralOverrides.a;
        ReferralOverrides.ReferralScreen referralScreen2 = referralOverrides.a;
        zuj0 zuj0Var = this.B;
        if (referralScreen == null || (h = referralScreen.b) == null) {
            h = ((avj0) zuj0Var).h(kyh0.promocode_send);
        }
        String str2 = h;
        if (str2.length() == 0) {
            Kg();
            return;
        }
        if (referralScreen2 == null || (g = referralScreen2.a) == null) {
            g = ((avj0) zuj0Var).g(dwh0.referral_rides, kyh0.referral_rides_plural_fallback, referralCode.b);
        }
        String str3 = g;
        if (str3.length() == 0) {
            Kg();
            return;
        }
        String str4 = referralCode.j;
        this.G.a(new xmf0(0, this, referralCode));
        SpannableStringBuilder f = c.f(this.E, formattedText, false, null, 14);
        String a = (str4 == null || str4.length() == 0) ? "" : ((m7x0) this.C).a(str4);
        List list = referralCode.l;
        if (list == null) {
            list = EmptyList.a;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        String str5 = referralScreen2 != null ? referralScreen2.f : null;
        if (str5 == null) {
            str5 = "";
        }
        z3v0 z3v0Var = new z3v0(f, a, str, list, new xoe(upperCase, str5, ((avj0) zuj0Var).h(kyh0.promocode_copy)), referralCode.f, referralCode.d, referralCode.i, referralCode.b, str2, str3);
        r0 r0Var = this.F;
        r0Var.getClass();
        r0Var.m(null, z3v0Var);
    }
}
