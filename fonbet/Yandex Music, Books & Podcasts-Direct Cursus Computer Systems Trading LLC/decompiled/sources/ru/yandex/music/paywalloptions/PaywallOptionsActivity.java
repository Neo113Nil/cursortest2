package ru.yandex.music.paywalloptions;

import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import defpackage.ad6;
import defpackage.bdt;
import defpackage.byb;
import defpackage.cxb;
import defpackage.ern;
import defpackage.hag;
import defpackage.hoe;
import defpackage.hpj;
import defpackage.klx;
import defpackage.l18;
import defpackage.lik;
import defpackage.mvj;
import defpackage.np2;
import defpackage.ou0;
import defpackage.qdc;
import defpackage.ssg;
import defpackage.su4;
import defpackage.swf;
import defpackage.vik;
import defpackage.w99;
import defpackage.yu0;
import kotlin.Pair;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class PaywallOptionsActivity extends np2 {
    public static final /* synthetic */ int v = 0;

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        hoe.a(this, true, new hpj(24));
        ad6 ad6Var = (ad6) getIntent().getParcelableExtra("optionsPaywallActivity:args.paywallOption");
        if (ad6Var == null) {
            ssg.a(6, null, "Arguments in intent are null", null);
            finish();
            return;
        }
        lik likVar = (lik) getIntent().getParcelableExtra("optionsPaywallActivity:args.navigationSourceInfo");
        if (likVar == null) {
            Assertions.throwOrSkip$default(new FailedAssertionException("invalid PaywallOptionsActivity start param - PaywallNavigationSourceInfo"), null, 2, null);
            likVar = new lik(vik.f, null, null);
        }
        String stringExtra = getIntent().getStringExtra("optionsPaywallActivity:args.campaignId");
        if (bundle == null) {
            y supportFragmentManager = getSupportFragmentManager();
            a l = su4.l(supportFragmentManager, supportFragmentManager);
            String R = ad6Var.R();
            R.getClass();
            l18 l18Var = l18.b;
            bdt I = hag.I(byb.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            w99 w99Var = (w99) ((byb) qdcVar.C(I)).c(ern.a(w99.class));
            String str2 = swf.H().a;
            String str3 = swf.G().a;
            JsonObject d = w99Var.a().d(R);
            if (d != null) {
                JsonElement v2 = d.v(str2);
                if (v2 == null || (str = cxb.I(v2)) == null) {
                    JsonElement v3 = d.v(str3);
                    str = v3 != null ? cxb.I(v3) : null;
                    if (str == null) {
                        JsonElement v4 = d.v("ru");
                        if (v4 != null) {
                            str = cxb.I(v4);
                        }
                    }
                }
                mvj mvjVar = new mvj();
                mvjVar.setArguments(cxb.K(new Pair("paywallScreenFragment:args.option", ad6Var), new Pair("paywallScreenFragment:args.navigationSourceInfo", likVar), new Pair("paywallScreenFragment:args.screenId", str), new Pair("paywallScreenFragment:args.campaignId", stringExtra)));
                l.e(R.id.fragment_container_view, mvjVar, null);
                l.j();
            }
            str = null;
            mvj mvjVar2 = new mvj();
            mvjVar2.setArguments(cxb.K(new Pair("paywallScreenFragment:args.option", ad6Var), new Pair("paywallScreenFragment:args.navigationSourceInfo", likVar), new Pair("paywallScreenFragment:args.screenId", str), new Pair("paywallScreenFragment:args.campaignId", stringExtra)));
            l.e(R.id.fragment_container_view, mvjVar2, null);
            l.j();
        }
    }

    @Override // defpackage.np2
    public final int q() {
        return R.layout.container_activity;
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        klx klxVar = ou0.a;
        return yu0.a[0] == 1 ? R.style.AppTheme_Transparent_EdgeToEdge : R.style.AppTheme_Transparent_Dark_EdgeToEdge;
    }
}
