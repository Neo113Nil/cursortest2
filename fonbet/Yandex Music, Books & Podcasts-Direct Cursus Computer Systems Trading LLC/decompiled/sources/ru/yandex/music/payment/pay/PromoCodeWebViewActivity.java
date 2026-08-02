package ru.yandex.music.payment.pay;

import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import defpackage.cxm;
import defpackage.exm;
import defpackage.gkm;
import defpackage.hag;
import defpackage.hoe;
import defpackage.klx;
import defpackage.l18;
import defpackage.np2;
import defpackage.ou0;
import defpackage.sek;
import defpackage.su4;
import defpackage.uvg;
import defpackage.vek;
import defpackage.xgr;
import defpackage.yu0;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class PromoCodeWebViewActivity extends np2 {
    public static final /* synthetic */ int w = 0;
    public final sek v = (sek) l18.b.c(hag.I(sek.class));

    @Override // defpackage.np2
    public final boolean n() {
        return true;
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        p();
        super.onCreate(bundle);
        hoe.a(this, false, new gkm(7));
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(cxm.a);
        setContentView(frameLayout);
        if (bundle == null) {
            y supportFragmentManager = getSupportFragmentManager();
            a l = su4.l(supportFragmentManager, supportFragmentManager);
            int id = frameLayout.getId();
            Bundle extras = getIntent().getExtras();
            String string = extras != null ? extras.getString("url") : null;
            Bundle extras2 = getIntent().getExtras();
            String string2 = extras2 != null ? extras2.getString("promo_code") : null;
            exm exmVar = new exm();
            Bundle bundle2 = new Bundle();
            bundle2.putString("url", string);
            bundle2.putString("promo_code", string2);
            exmVar.setArguments(bundle2);
            l.d(id, exmVar, null, 1);
            l.j();
        }
        getSupportFragmentManager().f0("show_promo_code", this, new uvg(29, this));
    }

    @Override // defpackage.np2, defpackage.gnb, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onStart() {
        super.onStart();
        vek vekVar = (vek) this.v;
        vekVar.getClass();
        vek.b(vekVar, xgr.m, null, 6);
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        klx klxVar = ou0.a;
        return yu0.a[0] == 1 ? R.style.AppTheme_EdgeToEdge : R.style.AppTheme_Dark_EdgeToEdge;
    }
}
