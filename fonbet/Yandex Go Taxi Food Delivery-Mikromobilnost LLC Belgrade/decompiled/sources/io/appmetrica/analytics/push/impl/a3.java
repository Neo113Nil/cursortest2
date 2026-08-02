package io.appmetrica.analytics.push.impl;

import defpackage.bms;
import defpackage.cms;
import defpackage.wls;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.notification.NotificationCustomizer;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;

/* loaded from: classes4.dex */
public final /* synthetic */ class a3 implements NotificationCustomizer {
    public final /* synthetic */ int a;
    public final /* synthetic */ cms b;
    public final /* synthetic */ NotificationValueProvider c;

    public /* synthetic */ a3(cms cmsVar, NotificationValueProvider notificationValueProvider, int i) {
        this.a = i;
        this.b = cmsVar;
        this.c = notificationValueProvider;
    }

    @Override // io.appmetrica.analytics.push.notification.NotificationCustomizer
    public final void invoke(androidx.core.app.v vVar, PushMessage pushMessage) {
        switch (this.a) {
            case 0:
                C1078u0.a((wls) this.b, this.c, vVar, pushMessage);
                break;
            case 1:
                C1078u0.b((wls) this.b, this.c, vVar, pushMessage);
                break;
            default:
                C1078u0.a((bms) this.b, this.c, vVar, pushMessage);
                break;
        }
    }
}
