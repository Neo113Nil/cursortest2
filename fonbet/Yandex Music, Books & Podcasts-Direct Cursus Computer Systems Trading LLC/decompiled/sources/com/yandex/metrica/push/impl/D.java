package com.yandex.metrica.push.impl;

import com.yandex.metrica.push.core.model.NotificationActionInfoInternal;
import java.util.HashMap;

/* loaded from: classes3.dex */
class D extends HashMap<String, Object> {
    final /* synthetic */ NotificationActionInfoInternal a;

    public D(E e, NotificationActionInfoInternal notificationActionInfoInternal) {
        this.a = notificationActionInfoInternal;
        put("actionId", notificationActionInfoInternal.actionId);
        put("pushId", notificationActionInfoInternal.pushId);
    }
}
