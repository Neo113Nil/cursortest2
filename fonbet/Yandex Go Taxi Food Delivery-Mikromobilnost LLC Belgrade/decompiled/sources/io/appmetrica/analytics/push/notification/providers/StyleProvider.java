package io.appmetrica.analytics.push.notification.providers;

import android.graphics.Bitmap;
import android.text.Html;
import android.text.Spanned;
import androidx.core.app.t;
import androidx.core.app.v;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;

/* loaded from: classes4.dex */
public class StyleProvider implements NotificationValueProvider<t.g> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.appmetrica.analytics.push.notification.NotificationValueProvider
    public t.g get(PushMessage pushMessage) {
        PushNotification notification = pushMessage.getNotification();
        if (notification == null) {
            return null;
        }
        Bitmap largeBitmap = notification.getLargeBitmap();
        if (largeBitmap != null) {
            t.a aVar = new t.a();
            aVar.e(largeBitmap);
            return aVar;
        }
        String contentText = notification.getContentText();
        Spanned fromHtml = contentText != null ? Html.fromHtml(contentText) : null;
        t.b bVar = new t.b();
        bVar.e = v.d(fromHtml);
        return bVar;
    }
}
