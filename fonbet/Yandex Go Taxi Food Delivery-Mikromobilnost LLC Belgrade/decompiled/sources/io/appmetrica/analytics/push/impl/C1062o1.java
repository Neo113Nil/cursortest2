package io.appmetrica.analytics.push.impl;

import defpackage.zls;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.notification.NotificationCustomizer;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;
import java.util.List;

/* renamed from: io.appmetrica.analytics.push.impl.o1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1062o1 implements NotificationCustomizer {
    public final /* synthetic */ zls a;
    public final /* synthetic */ NotificationValueProvider b;

    public C1062o1(zls zlsVar, NotificationValueProvider notificationValueProvider) {
        this.a = zlsVar;
        this.b = notificationValueProvider;
    }

    @Override // io.appmetrica.analytics.push.notification.NotificationCustomizer
    public final void invoke(androidx.core.app.v vVar, PushMessage pushMessage) {
        zls zlsVar = this.a;
        List list = (List) this.b.get(pushMessage);
        if (list != null) {
        }
    }
}
