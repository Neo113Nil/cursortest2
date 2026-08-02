package com.yandex.passport.internal.ui.challenge.vpn;

import android.os.Bundle;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.b1b;
import defpackage.dt0;
import defpackage.hq0;
import defpackage.in5;
import defpackage.rvr;
import defpackage.wn5;
import defpackage.wyf;
import defpackage.x97;
import defpackage.zyr;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/challenge/vpn/VpnChallengeActivity;", "Lhq0;", "<init>", "()V", "com/yandex/plus/pay/ui/core/b", "vh", "passport_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class VpnChallengeActivity extends hq0 {
    public static volatile boolean a;

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        rvr rvrVar = rvr.v;
        b1b.a(this, new zyr(-1, -1, 1, rvrVar), new zyr(-1, -1, 1, rvrVar));
        super.onCreate(bundle);
        a = true;
        String stringExtra = getIntent().getStringExtra("vpn.challenge.url");
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "open with initialUrl " + stringExtra, 8);
        }
        if (stringExtra == null || StringsKt.U(stringExtra)) {
            finish();
        } else {
            in5.a(this, new wn5(new a(stringExtra, this, 0), 72917944, true));
        }
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        a = false;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public final void onResume() {
        super.onResume();
        x97.y(wyf.F(getLifecycle()), null, null, new dt0(2, 24, null), 3);
    }
}
