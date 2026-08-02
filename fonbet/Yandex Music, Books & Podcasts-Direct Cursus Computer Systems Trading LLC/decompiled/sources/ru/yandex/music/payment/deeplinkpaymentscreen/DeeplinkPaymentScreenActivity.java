package ru.yandex.music.payment.deeplinkpaymentscreen;

import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import defpackage.cxb;
import defpackage.np2;
import defpackage.rh7;
import defpackage.su4;
import defpackage.vh7;
import kotlin.Pair;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class DeeplinkPaymentScreenActivity extends np2 {
    public static final /* synthetic */ int v = 0;

    @Override // defpackage.np2
    public final boolean n() {
        return true;
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            y supportFragmentManager = getSupportFragmentManager();
            a l = su4.l(supportFragmentManager, supportFragmentManager);
            rh7 rh7Var = new rh7(getIntent().getStringExtra("extra.campaign_id"));
            vh7 vh7Var = new vh7();
            vh7Var.setArguments(cxb.K(new Pair("paymentScreen:args", rh7Var)));
            l.e(R.id.fragment_container_view, vh7Var, null);
            l.j();
        }
    }

    @Override // defpackage.np2
    public final int q() {
        return R.layout.container_activity;
    }
}
