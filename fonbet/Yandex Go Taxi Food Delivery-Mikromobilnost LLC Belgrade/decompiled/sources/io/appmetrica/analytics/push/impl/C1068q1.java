package io.appmetrica.analytics.push.impl;

import defpackage.wls;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.notification.NotificationCustomizer;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.push.impl.q1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1068q1 implements NotificationCustomizer {
    public final /* synthetic */ wls a;
    public final /* synthetic */ NotificationValueProvider b;

    public C1068q1(wls wlsVar, NotificationValueProvider notificationValueProvider) {
        this.a = wlsVar;
        this.b = notificationValueProvider;
    }

    @Override // io.appmetrica.analytics.push.notification.NotificationCustomizer
    public final void invoke(androidx.core.app.v vVar, PushMessage pushMessage) {
        wls wlsVar = this.a;
        List list = (List) this.b.get(pushMessage);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                wlsVar.invoke(vVar, it.next());
            }
        }
    }
}
