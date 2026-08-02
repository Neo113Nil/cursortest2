package io.appmetrica.analytics.push.impl;

import defpackage.wls;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.notification.NotificationCustomizer;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;

/* renamed from: io.appmetrica.analytics.push.impl.n1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1059n1 implements NotificationCustomizer {
    public final /* synthetic */ wls a;
    public final /* synthetic */ NotificationValueProvider b;

    public C1059n1(wls wlsVar, NotificationValueProvider notificationValueProvider) {
        this.a = wlsVar;
        this.b = notificationValueProvider;
    }

    @Override // io.appmetrica.analytics.push.notification.NotificationCustomizer
    public final void invoke(androidx.core.app.v vVar, PushMessage pushMessage) {
        wls wlsVar = this.a;
        Object obj = this.b.get(pushMessage);
        if (obj != null) {
        }
    }
}
