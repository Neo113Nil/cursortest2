package com.yandex.payment.sdk.ui;

import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.eno;
import defpackage.gi;
import defpackage.jj4;
import defpackage.jud;
import defpackage.l83;
import defpackage.m6r;
import defpackage.op2;
import defpackage.vh;
import defpackage.wyf;
import defpackage.x97;
import defpackage.zh;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class SplashActivity extends op2 {
    public static final /* synthetic */ int l = 0;
    public final eno i = new eno(new jud(2, 28, null));
    public final zh j = registerForActivityResult(new vh(10), new gi(11, this));
    public final l83 k = new l83(19, this);

    @Override // defpackage.op2
    public final BroadcastReceiver n() {
        return this.k;
    }

    @Override // defpackage.op2, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Continuation continuation = null;
        View inflate = getLayoutInflater().inflate(R.layout.paymentsdk_splash_activity, (ViewGroup) null, false);
        if (inflate == null) {
            jj4.j("rootView");
            return;
        }
        setContentView((FrameLayout) inflate);
        if (bundle == null) {
            x97.y(wyf.F(getLifecycle()), null, null, new m6r(this, continuation, 1), 3);
        }
    }
}
