package io.appmetrica.analytics.push.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.settings.PushFilter;

/* loaded from: classes9.dex */
public final class S1 implements PushFilter {
    public final X1 a;

    public S1(X1 x1) {
        this.a = x1;
    }

    @Override // io.appmetrica.analytics.push.settings.PushFilter
    public final PushFilter.FilterResult filter(PushMessage pushMessage) {
        String notificationId = pushMessage.getNotificationId();
        if (TextUtils.isEmpty(notificationId)) {
            return PushFilter.FilterResult.silence("PushId is empty", null);
        }
        if (!this.a.b().contains(notificationId)) {
            return PushFilter.FilterResult.show();
        }
        return PushFilter.FilterResult.silence("Duplicate pushId", "Push with the same push id [" + notificationId + "] has already been received");
    }
}
