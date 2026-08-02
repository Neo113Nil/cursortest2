package io.appmetrica.analytics.push.notification.providers;

import android.text.Html;
import android.text.Spanned;
import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;

/* loaded from: classes4.dex */
public class TickerProvider implements NotificationValueProvider<Spanned> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.appmetrica.analytics.push.notification.NotificationValueProvider
    public Spanned get(PushMessage pushMessage) {
        PushNotification notification = pushMessage.getNotification();
        String ticker = notification != null ? notification.getTicker() : null;
        if (CoreUtils.isEmpty(ticker)) {
            return null;
        }
        return Html.fromHtml(ticker);
    }
}
