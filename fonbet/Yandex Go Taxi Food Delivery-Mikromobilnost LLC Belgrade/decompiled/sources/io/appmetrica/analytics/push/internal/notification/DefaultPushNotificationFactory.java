package io.appmetrica.analytics.push.internal.notification;

import android.app.Notification;
import android.content.Context;
import androidx.core.app.v;
import defpackage.cms;
import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.impl.AbstractC1070r1;
import io.appmetrica.analytics.push.impl.C1078u0;
import io.appmetrica.analytics.push.impl.Y1;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.notification.NotificationCustomizer;
import io.appmetrica.analytics.push.notification.NotificationCustomizersHolder;
import io.appmetrica.analytics.push.settings.PushNotificationFactory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lio/appmetrica/analytics/push/internal/notification/DefaultPushNotificationFactory;", "Lio/appmetrica/analytics/push/settings/PushNotificationFactory;", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/push/model/PushMessage;", "pushMessage", "Landroid/app/Notification;", "buildNotification", "<init>", "()V", "push_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class DefaultPushNotificationFactory implements PushNotificationFactory {
    @Override // io.appmetrica.analytics.push.settings.PushNotificationFactory
    public Notification buildNotification(Context context, PushMessage pushMessage) {
        PushNotification notification = pushMessage.getNotification();
        String contentTitle = notification != null ? notification.getContentTitle() : null;
        PushNotification notification2 = pushMessage.getNotification();
        String contentText = notification2 != null ? notification2.getContentText() : null;
        if (!CoreUtils.isNotEmpty(contentTitle) && !CoreUtils.isNotEmpty(contentText)) {
            String notificationId = pushMessage.getNotificationId();
            PublicLogger.INSTANCE.info("Push filtered out. PushMessage does not contain content title and content text", new Object[0]);
            if (CoreUtils.isNotEmpty(notificationId)) {
                Y1.b.onNotificationIgnored(notificationId, "Push data format is invalid", "Not all required fields were set", pushMessage.getPayload(), pushMessage.getTransport());
            }
            return null;
        }
        v vVar = new v(context, null);
        C1078u0 c1078u0 = new C1078u0(context);
        NotificationCustomizersHolder notificationCustomizersHolder = AbstractC1070r1.a;
        NotificationCustomizer beforeCustomizer = notificationCustomizersHolder.getBeforeCustomizer();
        Map<cms, NotificationCustomizer> customizers = notificationCustomizersHolder.getCustomizers();
        NotificationCustomizer afterCustomizer = notificationCustomizersHolder.getAfterCustomizer();
        if (beforeCustomizer != null || !customizers.isEmpty() || afterCustomizer != null) {
            TrackersHub.getInstance().reportEvent("DefaultPushNotificationFactory.buildNotification", b.i(new Pair("pushId", pushMessage.getNotificationId()), new Pair("useBeforeCustomizer", Boolean.valueOf(beforeCustomizer != null)), new Pair("useCustomizers", Integer.valueOf(customizers.size())), new Pair("useAfterCustomizer", Boolean.valueOf(afterCustomizer != null))));
        }
        LinkedHashMap n = b.n(b.t(c1078u0.a), notificationCustomizersHolder.getCustomizers());
        NotificationCustomizer beforeCustomizer2 = notificationCustomizersHolder.getBeforeCustomizer();
        if (beforeCustomizer2 != null) {
            beforeCustomizer2.invoke(vVar, pushMessage);
        }
        Iterator it = n.entrySet().iterator();
        while (it.hasNext()) {
            ((NotificationCustomizer) ((Map.Entry) it.next()).getValue()).invoke(vVar, pushMessage);
        }
        NotificationCustomizer afterCustomizer2 = notificationCustomizersHolder.getAfterCustomizer();
        if (afterCustomizer2 != null) {
            afterCustomizer2.invoke(vVar, pushMessage);
        }
        return vVar.b();
    }
}
