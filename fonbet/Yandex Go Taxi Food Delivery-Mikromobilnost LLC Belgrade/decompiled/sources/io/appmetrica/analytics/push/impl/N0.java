package io.appmetrica.analytics.push.impl;

import android.content.Context;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.settings.PushNotificationFactory;

/* loaded from: classes4.dex */
public final class N0 implements InterfaceC1026e2 {
    public final C1073s1 a;

    public N0(C1073s1 c1073s1) {
        this.a = c1073s1;
    }

    @Override // io.appmetrica.analytics.push.impl.InterfaceC1026e2
    public final void a(Context context, PushMessage pushMessage) {
        C1073s1 c1073s1 = this.a;
        PushNotificationFactory pushNotificationFactory = AbstractC1010a2.b;
        c1073s1.getClass();
        C1073s1.a(context, pushNotificationFactory, pushMessage);
    }
}
