package io.appmetrica.analytics.push.notification.providers;

import android.app.PendingIntent;
import android.content.Context;
import io.appmetrica.analytics.push.impl.r;
import io.appmetrica.analytics.push.intent.NotificationActionType;
import io.appmetrica.analytics.push.internal.IntentHelper;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;

/* loaded from: classes4.dex */
public class DeleteIntentProvider implements NotificationValueProvider<PendingIntent> {
    private final Context a;

    public DeleteIntentProvider(Context context) {
        this.a = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.appmetrica.analytics.push.notification.NotificationValueProvider
    public PendingIntent get(PushMessage pushMessage) {
        boolean z = r.a(this.a).f.a().trackingDismissAction;
        return IntentHelper.createWrappedAction(this.a, IntentHelper.createNotificationActionInfo(NotificationActionType.CLEAR, pushMessage, null), z);
    }
}
