package com.braze.push;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.braze.IBrazeNotificationFactory;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/braze/push/BrazeNotificationFactory;", "Lcom/braze/IBrazeNotificationFactory;", "<init>", "()V", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "Landroid/app/Notification;", "createNotification", "(Lcom/braze/models/push/BrazeNotificationPayload;)Landroid/app/Notification;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public class BrazeNotificationFactory implements IBrazeNotificationFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final BrazeNotificationFactory internalInstance = new BrazeNotificationFactory();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createNotification$lambda$0() {
        return "Notification could not be built. Returning null as created notification";
    }

    @Override // com.braze.IBrazeNotificationFactory
    public Notification createNotification(BrazeNotificationPayload payload) {
        payload.getClass();
        NotificationCompat.Builder populateNotificationBuilder = INSTANCE.populateNotificationBuilder(payload);
        if (populateNotificationBuilder != null) {
            return populateNotificationBuilder.build();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(0), 6, (Object) null);
        return null;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/braze/push/BrazeNotificationFactory$Companion;", "", "<init>", "()V", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "Landroidx/core/app/NotificationCompat$Builder;", "populateNotificationBuilder", "(Lcom/braze/models/push/BrazeNotificationPayload;)Landroidx/core/app/NotificationCompat$Builder;", "Lcom/braze/push/BrazeNotificationFactory;", "getInstance", "()Lcom/braze/push/BrazeNotificationFactory;", "getInstance$annotations", "instance", "internalInstance", "Lcom/braze/push/BrazeNotificationFactory;", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populateNotificationBuilder$lambda$0(BrazeNotificationPayload brazeNotificationPayload) {
            return "Using BrazeNotificationPayload: " + brazeNotificationPayload;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populateNotificationBuilder$lambda$1() {
            return "BrazeNotificationPayload has null context. Not creating notification";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populateNotificationBuilder$lambda$2() {
            return "BrazeNotificationPayload has null app configuration provider. Not creating notification";
        }

        public final BrazeNotificationFactory getInstance() {
            return BrazeNotificationFactory.internalInstance;
        }

        public final NotificationCompat.Builder populateNotificationBuilder(BrazeNotificationPayload payload) {
            payload.getClass();
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda42(payload, 1), 6, (Object) null);
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(12), 7, (Object) null);
                return null;
            }
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(13), 7, (Object) null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            BrazeNotificationUtils.prefetchBitmapsIfNewlyReceivedStoryPush(payload);
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, BrazeNotificationUtils.getOrCreateNotificationChannelId(payload));
            builder.setFlag(16, true);
            BrazeNotificationUtils.setTitleIfPresent(builder, payload);
            BrazeNotificationUtils.setContentIfPresent(builder, payload);
            BrazeNotificationUtils.setTickerIfPresent(builder, payload);
            BrazeNotificationUtils.setSetShowWhen(builder, payload);
            BrazeNotificationUtils.setContentIntentIfPresent(context, builder, notificationExtras);
            BrazeNotificationUtils.setDeleteIntent(context, builder, notificationExtras);
            BrazeNotificationUtils.setSmallIcon(configurationProvider, builder);
            BrazeNotificationUtils.setLargeIconIfPresentAndSupported(builder, payload);
            BrazeNotificationUtils.setSoundIfPresentAndSupported(builder, payload);
            BrazeNotificationUtils.setSummaryTextIfPresentAndSupported(builder, payload);
            BrazeNotificationUtils.setPriorityIfPresentAndSupported(builder, payload);
            BrazeNotificationStyleFactory.INSTANCE.setStyleIfSupported(builder, payload);
            BrazeNotificationActionUtils.addNotificationActions(builder, payload);
            BrazeNotificationUtils.setAccentColorIfPresentAndSupported(builder, payload);
            BrazeNotificationUtils.setCategoryIfPresentAndSupported(builder, payload);
            BrazeNotificationUtils.setVisibilityIfPresentAndSupported(builder, payload);
            BrazeNotificationUtils.setPublicVersionIfPresentAndSupported(builder, payload);
            BrazeNotificationUtils.setNotificationBadgeNumberIfPresent(builder, payload);
            return builder;
        }

        private Companion() {
        }
    }
}
