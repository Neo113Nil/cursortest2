package ru.yandex.music.payment.tariffpaywall;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import defpackage.aaw;
import defpackage.avf;
import defpackage.bdt;
import defpackage.btf;
import defpackage.byb;
import defpackage.cxb;
import defpackage.d5s;
import defpackage.h7s;
import defpackage.hag;
import defpackage.hoe;
import defpackage.jyr;
import defpackage.klx;
import defpackage.l18;
import defpackage.lik;
import defpackage.lwc;
import defpackage.n9m;
import defpackage.np2;
import defpackage.ou0;
import defpackage.qdc;
import defpackage.su4;
import defpackage.v7s;
import defpackage.w6s;
import defpackage.w8m;
import defpackage.wj3;
import defpackage.yu0;
import defpackage.yxc;
import kotlin.Pair;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class TariffPaywallActivity extends np2 {
    public static final /* synthetic */ int z = 0;
    public final jyr v;
    public final jyr w;
    public final jyr x;
    public final jyr y;

    public TariffPaywallActivity() {
        bdt I = hag.I(lwc.class);
        l18 l18Var = l18.b;
        this.v = l18Var.b(I, true);
        this.w = l18Var.b(hag.I(w8m.class), true);
        this.x = btf.b(new w6s(this, 0));
        this.y = btf.b(new w6s(this, 1));
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        supportFragmentManager.B = new wj3(8, this);
        hoe.a(this, true, new d5s(9));
        ((lwc) this.v.getValue()).f.set(true);
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.getClass();
        aaw.q(this, intent);
        if (bundle == null) {
            boolean booleanExtra = getIntent().getBooleanExtra("force_plus_paywall", false);
            l18 l18Var = l18.b;
            bdt I = hag.I(byb.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            if (!((n9m) ((byb) qdcVar.C(I)).b(n9m.class)).h() && !booleanExtra) {
                y(avf.K(), getIntent().getStringExtra("promo_code"));
                return;
            }
            y supportFragmentManager2 = getSupportFragmentManager();
            a l = su4.l(supportFragmentManager2, supportFragmentManager2);
            l.f(R.id.content_frame, (Class) this.x.getValue(), null);
            l.j();
        }
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        klx klxVar = ou0.a;
        return yu0.a[0] == 1 ? R.style.AppTheme_EdgeToEdge_TransparentStatusBar_SystemNavigationBar : R.style.AppTheme_Dark_EdgeToEdge_TransparentStatusBar_SystemNavigationBar;
    }

    public final void y(String str, String str2) {
        y supportFragmentManager = getSupportFragmentManager();
        a l = su4.l(supportFragmentManager, supportFragmentManager);
        v7s v7sVar = new v7s(str, (lik) this.y.getValue(), str2);
        h7s h7sVar = new h7s();
        h7sVar.setArguments(cxb.K(new Pair("fullscreenGallery:args", v7sVar)));
        l.e(R.id.content_frame, h7sVar, null);
        l.k(true, true);
    }

    @Override // defpackage.np2
    public final void w(yxc yxcVar) {
    }
}
