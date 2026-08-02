package io.appmetrica.analytics.push.impl;

import defpackage.bms;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.notification.NotificationCustomizer;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;
import java.util.List;

/* renamed from: io.appmetrica.analytics.push.impl.p1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1065p1 implements NotificationCustomizer {
    public final /* synthetic */ bms a;
    public final /* synthetic */ NotificationValueProvider b;

    public C1065p1(bms bmsVar, NotificationValueProvider notificationValueProvider) {
        this.a = bmsVar;
        this.b = notificationValueProvider;
    }

    @Override // io.appmetrica.analytics.push.notification.NotificationCustomizer
    public final void invoke(androidx.core.app.v vVar, PushMessage pushMessage) {
        bms bmsVar = this.a;
        List list = (List) this.b.get(pushMessage);
        if (list != null) {
        }
    }
}
