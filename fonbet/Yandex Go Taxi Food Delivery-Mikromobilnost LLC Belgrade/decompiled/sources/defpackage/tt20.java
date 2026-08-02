package defpackage;

import android.content.Context;
import com.yandex.plus.core.config.Environment;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.tarifficator.mobile.internal.b;
import defpackage.uhx;
import defpackage.vlp;
import defpackage.wn40;
import defpackage.wt20;
import defpackage.xt20;
import java.util.Map;
import kotlin.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class tt20 implements mpd0 {
    public final String a;
    public final i3y b;

    public tt20(gbd0 gbd0Var, kaa0 kaa0Var, yci0 yci0Var, final wn40 wn40Var) {
        StringBuilder sb = new StringBuilder("|");
        String str = (String) wn40Var.a;
        sb.append(str.hashCode());
        sb.append("|-1355077428|");
        PlusSdkBrandType plusSdkBrandType = (PlusSdkBrandType) wn40Var.b;
        sb.append(plusSdkBrandType.name().hashCode());
        sb.append('|');
        String str2 = (String) wn40Var.d;
        sb.append(str2.hashCode());
        String sb2 = sb.toString();
        this.a = sb2;
        i3y a = a.a(new sls() { // from class: com.yandex.plus.pay.ui.tarifficator.mobile.internal.a
            @Override // defpackage.sls
            public final Object invoke() {
                return new vlp(new MobilePlusTarifficatorUI$flagsHolder$2$1(xt20.a, wt20.class, "DEFAULT", "getDEFAULT()Lcom/yandex/plus/pay/ui/tarifficator/mobile/internal/featureflags/MobilePlusTarifficatorUIFlags;", 0), new uhx(17, wn40.this));
            }
        });
        snd0 snd0Var = new snd0(new m0p(str, (String) wn40Var.c, str2, (Context) wn40Var.e, plusSdkBrandType, (Environment) wn40Var.f, (com.yandex.plus.domain.auth.impl.a) wn40Var.g, gbd0Var, (p5z) wn40Var.h, (lzs) wn40Var.p, (x75) wn40Var.q, (mdd0) wn40Var.i, (ped0) wn40Var.j, (com.yandex.plus.experiments.impl.providers.a) wn40Var.k, new tnd0((vlp) a.getValue()), (tyq0) wn40Var.l, (xyj) wn40Var.m, (b5d0) wn40Var.n, (yo40) wn40Var.o, (com.yandex.plus.pay.ui.core.internal.common.a) wn40Var.r, kaa0Var, (hzk) wn40Var.u, (ht11) wn40Var.t, (com.yandex.plus.core.benchmark.a) wn40Var.s, (eu90) wn40Var.v, (fu90) wn40Var.w, (v7d0) wn40Var.x, (add0) wn40Var.y, yci0Var));
        this.b = a.a(new m020(8, this));
        ((Map) rnd0.c.b.getValue()).put(sb2, snd0Var);
    }

    public final Object a(PlusPayCompositeOffers.Offer offer, PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams, wnd0 wnd0Var, ContinuationImpl continuationImpl) {
        return ((b) this.b.getValue()).a(offer, plusPayPaymentAnalyticsParams, wnd0Var, continuationImpl);
    }
}
