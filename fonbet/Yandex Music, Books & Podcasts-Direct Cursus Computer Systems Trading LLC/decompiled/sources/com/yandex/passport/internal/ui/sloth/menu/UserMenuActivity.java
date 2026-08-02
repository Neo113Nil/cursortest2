package com.yandex.passport.internal.ui.sloth.menu;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.sloth.authsdk.h0;
import com.yandex.passport.internal.ui.sloth.menu.host.UserIdCommunicationService;
import com.yandex.passport.sloth.ui.j2;
import defpackage.b1b;
import defpackage.ern;
import defpackage.hq0;
import defpackage.ldg;
import defpackage.qs;
import defpackage.r1w;
import defpackage.wyf;
import defpackage.x97;
import defpackage.ybf;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class UserMenuActivity extends hq0 {
    public static final /* synthetic */ int d = 0;
    public PassportProcessGlobalComponent a;
    public e b;
    public final ybf c = new ybf(ern.a(t.class), new d(this, 1), new d(this, 0), new d(this, 2));

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        b1b.b(this);
        Continuation continuation = null;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onCreate(savedInstanceState=" + bundle + ')', 8);
        }
        this.a = com.yandex.passport.internal.di.a.a();
        super.onCreate(bundle);
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.a;
        if (passportProcessGlobalComponent == null) {
            Intrinsics.j("globalComponent");
            throw null;
        }
        e createUserMenuActivityComponent = passportProcessGlobalComponent.createUserMenuActivityComponent(new f(this));
        this.b = createUserMenuActivityComponent;
        if (createUserMenuActivityComponent == null) {
            Intrinsics.j("component");
            throw null;
        }
        setContentView(createUserMenuActivityComponent.getUiController().a.e());
        e eVar = this.b;
        if (eVar == null) {
            Intrinsics.j("component");
            throw null;
        }
        p uiController = eVar.getUiController();
        h0 h0Var = new h0(3, this);
        uiController.getClass();
        j2 j2Var = uiController.a.e;
        ((LinearLayout) j2Var.e()).setVisibility(0);
        Button button = j2Var.i;
        button.setVisibility(8);
        button.setText(((com.yandex.passport.internal.ui.sloth.g) uiController.b).a(com.yandex.passport.sloth.ui.string.a.d));
        ldg.B(button, new qs(h0Var, continuation, 21));
        x97.y(wyf.F(getLifecycle()), null, null, new r1w(this, continuation, 29), 3);
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        e eVar = this.b;
        if (eVar == null) {
            Intrinsics.j("component");
            throw null;
        }
        l userMenuRequestsProcessor = eVar.getUserMenuRequestsProcessor();
        userMenuRequestsProcessor.getClass();
        int i = UserIdCommunicationService.c;
        Context context = userMenuRequestsProcessor.d;
        com.yandex.passport.internal.provider.communication.a aVar = (com.yandex.passport.internal.provider.communication.a) userMenuRequestsProcessor.c;
        context.getClass();
        context.unbindService(aVar);
        super.onDestroy();
    }
}
