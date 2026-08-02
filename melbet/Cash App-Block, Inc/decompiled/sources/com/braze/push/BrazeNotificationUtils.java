package com.braze.push;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import bo.app.b$$ExternalSyntheticLambda0;
import bo.app.j1$$ExternalSyntheticLambda7;
import bo.app.jg$$ExternalSyntheticLambda1;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.IBrazeNotificationFactory;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.Channel;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.support.JsonUtils;
import com.braze.support.PermissionUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import com.braze.ui.support.UriUtils;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import okhttp3.internal.Tags;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001jB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u000f\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\n*\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0016J'\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001f\u0010\u001eJ5\u0010%\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b)\u0010(J)\u0010,\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b,\u0010\u001eJ\u0017\u0010.\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b4\u00103J\u001f\u00105\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b5\u00103J)\u00106\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00101\u001a\u0002002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b6\u00107J)\u00108\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00101\u001a\u0002002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b8\u00107J\u001f\u0010:\u001a\u00020\"2\u0006\u00109\u001a\u00020*2\u0006\u00101\u001a\u000200H\u0007¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b<\u00103J\u001f\u0010=\u001a\u00020\n2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b?\u00103J\u001f\u0010@\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b@\u00103J\u001f\u0010A\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bA\u00103J\u001f\u0010B\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bB\u00103J\u001f\u0010C\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bC\u00103J\u001f\u0010D\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bD\u00103J\u001f\u0010E\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bE\u00103J\u0017\u0010G\u001a\u00020\n2\u0006\u0010F\u001a\u00020\"H\u0007¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\bI\u0010\u0013J\u001f\u0010J\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bN\u00103J\u001f\u0010O\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\bO\u0010\u0013J\u0017\u0010P\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bP\u0010/J\u001f\u0010Q\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\bQ\u0010\u0013J#\u0010U\u001a\u0004\u0018\u00010T2\u0006\u0010S\u001a\u00020R2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bU\u0010VJ)\u0010Y\u001a\u00020X2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bY\u0010ZJ5\u0010]\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020[2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b]\u0010^J)\u0010]\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010_\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b]\u0010`R\u0014\u0010a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0011\u0010f\u001a\u00020c8G¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0015\u0010i\u001a\u0006\u0012\u0002\b\u00030 8G¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006k"}, d2 = {"Lcom/braze/push/BrazeNotificationUtils;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "extras", "", "deepLink", "", "useWebView", "", "routeUserWithNotificationOpenedIntent$android_sdk_ui_release", "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/String;Z)V", "routeUserWithNotificationOpenedIntent", "Landroid/content/Intent;", "intent", "handleNotificationOpened", "(Landroid/content/Context;Landroid/content/Intent;)V", "handleNotificationDeleted", "isBrazePushMessage", "(Landroid/content/Intent;)Z", "isNotificationMessage", "notificationExtras", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "sendPushMessageReceivedBroadcast", "(Landroid/content/Context;Landroid/os/Bundle;Lcom/braze/models/push/BrazeNotificationPayload;)V", "refreshFeatureFlagsIfAppropriate", "(Lcom/braze/models/push/BrazeNotificationPayload;)Z", "refreshBannersIfAppropriate", "Ljava/lang/Class;", "thisClass", "", "notificationId", "durationInMillis", "setNotificationDurationAlarm", "(Landroid/content/Context;Ljava/lang/Class;II)V", "getNotificationId", "(Lcom/braze/models/push/BrazeNotificationPayload;)I", "getNotificationPriority", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "wakeScreenIfAppropriate", "(Landroid/content/Context;Lcom/braze/configuration/BrazeConfigurationProvider;Landroid/os/Bundle;)Z", "prefetchBitmapsIfNewlyReceivedStoryPush", "(Lcom/braze/models/push/BrazeNotificationPayload;)V", "Landroidx/core/app/NotificationCompat$Builder;", "notificationBuilder", "setTitleIfPresent", "(Landroidx/core/app/NotificationCompat$Builder;Lcom/braze/models/push/BrazeNotificationPayload;)V", "setContentIfPresent", "setTickerIfPresent", "setContentIntentIfPresent", "(Landroid/content/Context;Landroidx/core/app/NotificationCompat$Builder;Landroid/os/Bundle;)V", "setDeleteIntent", "appConfigurationProvider", "setSmallIcon", "(Lcom/braze/configuration/BrazeConfigurationProvider;Landroidx/core/app/NotificationCompat$Builder;)I", "setSetShowWhen", "setLargeIconIfPresentAndSupported", "(Landroidx/core/app/NotificationCompat$Builder;Lcom/braze/models/push/BrazeNotificationPayload;)Z", "setSoundIfPresentAndSupported", "setSummaryTextIfPresentAndSupported", "setPriorityIfPresentAndSupported", "setAccentColorIfPresentAndSupported", "setCategoryIfPresentAndSupported", "setVisibilityIfPresentAndSupported", "setPublicVersionIfPresentAndSupported", "visibility", "isValidNotificationVisibility", "(I)Z", "handleCancelNotificationAction", "cancelNotification", "(Landroid/content/Context;I)V", "getOrCreateNotificationChannelId", "(Lcom/braze/models/push/BrazeNotificationPayload;)Ljava/lang/String;", "setNotificationBadgeNumberIfPresent", "handlePushStoryPageClicked", "handleContentCardsSerializedCardIfPresent", "sendNotificationOpenedBroadcast", "Landroid/app/NotificationManager;", "notificationManager", "Landroid/app/NotificationChannel;", "getValidNotificationChannel", "(Landroid/app/NotificationManager;Landroid/os/Bundle;)Landroid/app/NotificationChannel;", "action", "Landroid/app/PendingIntent;", "getPushActionPendingIntent", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/app/PendingIntent;", "Lcom/braze/push/BrazeNotificationUtils$BrazeNotificationBroadcastType;", "broadcastType", "sendPushActionIntent", "(Landroid/content/Context;Lcom/braze/push/BrazeNotificationUtils$BrazeNotificationBroadcastType;Landroid/os/Bundle;Lcom/braze/models/push/BrazeNotificationPayload;)V", "pushIntent", "(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V", "TAG", "Ljava/lang/String;", "Lcom/braze/IBrazeNotificationFactory;", "getActiveNotificationFactory", "()Lcom/braze/IBrazeNotificationFactory;", "activeNotificationFactory", "getNotificationReceiverClass", "()Ljava/lang/Class;", "notificationReceiverClass", "BrazeNotificationBroadcastType", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BrazeNotificationUtils {
    public static final BrazeNotificationUtils INSTANCE = new BrazeNotificationUtils();
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) BrazeNotificationUtils.class);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/braze/push/BrazeNotificationUtils$BrazeNotificationBroadcastType;", "", "brazePushEventType", "Lcom/braze/enums/BrazePushEventType;", "<init>", "(Ljava/lang/String;ILcom/braze/enums/BrazePushEventType;)V", "getBrazePushEventType", "()Lcom/braze/enums/BrazePushEventType;", "OPENED", "RECEIVED", "DELETED", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BrazeNotificationBroadcastType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BrazeNotificationBroadcastType[] $VALUES;
        private final BrazePushEventType brazePushEventType;
        public static final BrazeNotificationBroadcastType OPENED = new BrazeNotificationBroadcastType("OPENED", 0, BrazePushEventType.NOTIFICATION_OPENED);
        public static final BrazeNotificationBroadcastType RECEIVED = new BrazeNotificationBroadcastType("RECEIVED", 1, BrazePushEventType.NOTIFICATION_RECEIVED);
        public static final BrazeNotificationBroadcastType DELETED = new BrazeNotificationBroadcastType("DELETED", 2, BrazePushEventType.NOTIFICATION_DELETED);

        private static final /* synthetic */ BrazeNotificationBroadcastType[] $values() {
            return new BrazeNotificationBroadcastType[]{OPENED, RECEIVED, DELETED};
        }

        static {
            BrazeNotificationBroadcastType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
        }

        private BrazeNotificationBroadcastType(String str, int i, BrazePushEventType brazePushEventType) {
            this.brazePushEventType = brazePushEventType;
        }

        public static BrazeNotificationBroadcastType valueOf(String str) {
            return (BrazeNotificationBroadcastType) Enum.valueOf(BrazeNotificationBroadcastType.class, str);
        }

        public static BrazeNotificationBroadcastType[] values() {
            return (BrazeNotificationBroadcastType[]) $VALUES.clone();
        }

        public final BrazePushEventType getBrazePushEventType() {
            return this.brazePushEventType;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrazeNotificationBroadcastType.values().length];
            try {
                iArr[BrazeNotificationBroadcastType.OPENED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrazeNotificationBroadcastType.RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrazeNotificationBroadcastType.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BrazeNotificationUtils() {
    }

    public static final void cancelNotification(Context context, int notificationId) {
        context.getClass();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(notificationId, 11), 7, (Object) null);
            Intent intent = new Intent("com.braze.action.CANCEL_NOTIFICATION").setClass(context, getNotificationReceiverClass());
            intent.getClass();
            intent.setPackage(context.getPackageName());
            intent.putExtra("nid", notificationId);
            IntentUtils.addComponentAndSendBroadcast(context, intent);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(12), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cancelNotification$lambda$0(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Cancelling notification action with id: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cancelNotification$lambda$1() {
        return "Exception occurred attempting to cancel notification.";
    }

    public static final IBrazeNotificationFactory getActiveNotificationFactory() {
        IBrazeNotificationFactory customBrazeNotificationFactory = Braze.INSTANCE.getCustomBrazeNotificationFactory();
        return customBrazeNotificationFactory == null ? BrazeNotificationFactory.INSTANCE.getInstance() : customBrazeNotificationFactory;
    }

    public static final int getNotificationId(BrazeNotificationPayload payload) {
        payload.getClass();
        Integer customNotificationId = payload.getCustomNotificationId();
        if (customNotificationId != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda14(0, customNotificationId), 7, (Object) null);
            return customNotificationId.intValue();
        }
        String titleText = payload.getTitleText();
        if (titleText == null) {
            titleText = "";
        }
        String contentText = payload.getContentText();
        if (contentText != null) {
            titleText = ((Object) titleText) + contentText;
        }
        int hashCode = titleText.hashCode();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(hashCode, 9), 7, (Object) null);
        return hashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNotificationId$lambda$0(Integer num) {
        return "Using notification id provided in the message's extras bundle: " + num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNotificationId$lambda$3(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Message without notification id provided in the extras bundle received. Using a hash of the message: ");
    }

    public static final int getNotificationPriority(BrazeNotificationPayload payload) {
        payload.getClass();
        Integer notificationPriorityInt = payload.getNotificationPriorityInt();
        Integer notificationPriorityInt2 = payload.getNotificationPriorityInt();
        if (notificationPriorityInt2 == null) {
            return 0;
        }
        int intValue = notificationPriorityInt2.intValue();
        if (-2 <= intValue && intValue < 3) {
            return intValue;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda14(2, notificationPriorityInt), 6, (Object) null);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNotificationPriority$lambda$0$0(Integer num) {
        return "Received invalid notification priority " + num;
    }

    public static final Class<?> getNotificationReceiverClass() {
        return Constants.isAmazonDevice() ? BrazeAmazonDeviceMessagingReceiver.class : BrazePushReceiver.class;
    }

    public static final String getOrCreateNotificationChannelId(BrazeNotificationPayload payload) {
        payload.getClass();
        String notificationChannelId = payload.getNotificationChannelId();
        Context context = payload.getContext();
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        Object systemService = context != null ? context.getSystemService("notification") : null;
        systemService.getClass();
        NotificationManager notificationManager = (NotificationManager) systemService;
        int i = 14;
        if (notificationChannelId != null) {
            if (notificationManager.getNotificationChannel(notificationChannelId) != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(notificationChannelId, i), 7, (Object) null);
                return notificationChannelId;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(notificationChannelId, 15), 7, (Object) null);
        }
        if (notificationManager.getNotificationChannel("com_appboy_default_notification_channel") == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(i), 7, (Object) null);
            NotificationChannel notificationChannel = new NotificationChannel("com_appboy_default_notification_channel", configurationProvider != null ? configurationProvider.getDefaultNotificationChannelName() : null, 3);
            notificationChannel.setDescription(configurationProvider != null ? configurationProvider.getDefaultNotificationChannelDescription() : null);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return "com_appboy_default_notification_channel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getOrCreateNotificationChannelId$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Found notification channel in extras with id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getOrCreateNotificationChannelId$lambda$1(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Notification channel from extras is invalid. No channel found with id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getOrCreateNotificationChannelId$lambda$2() {
        return "Braze default notification channel does not exist on device. Creating default channel.";
    }

    private final PendingIntent getPushActionPendingIntent(Context context, String action, Bundle notificationExtras) {
        Intent intent = new Intent(action).setClass(context, NotificationTrampolineActivity.class);
        intent.getClass();
        if (notificationExtras != null) {
            intent.putExtras(notificationExtras);
        }
        PendingIntent activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, 1073741824 | IntentUtils.getImmutablePendingIntentFlags());
        activity.getClass();
        return activity;
    }

    public static final NotificationChannel getValidNotificationChannel(NotificationManager notificationManager, Bundle notificationExtras) {
        notificationManager.getClass();
        if (notificationExtras == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(15), 7, (Object) null);
            return null;
        }
        String string2 = notificationExtras.getString("ab_nc", null);
        if (string2 != null && !StringsKt.isBlank(string2)) {
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(string2);
            if (notificationChannel != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(string2, 11), 7, (Object) null);
                return notificationChannel;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(string2, 12), 7, (Object) null);
        }
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel("com_appboy_default_notification_channel");
        if (notificationChannel2 != null) {
            return notificationChannel2;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(16), 7, (Object) null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$0() {
        return "Notification extras bundle was null. Could not find a valid notification channel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$1(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Found notification channel in extras with id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$2(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Notification channel from extras is invalid, no channel found with id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$3() {
        return "Braze default notification channel does not exist on device.";
    }

    public static final void handleCancelNotificationAction(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        try {
            if (intent.hasExtra("nid")) {
                int intExtra = intent.getIntExtra("nid", -1);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(intExtra, 12), 7, (Object) null);
                Object systemService = context.getSystemService("notification");
                systemService.getClass();
                ((NotificationManager) systemService).cancel("appboy_notification", intExtra);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(15), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCancelNotificationAction$lambda$0(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Cancelling notification action with id: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCancelNotificationAction$lambda$1() {
        return "Exception occurred handling cancel notification intent.";
    }

    public static final void handleContentCardsSerializedCardIfPresent(BrazeNotificationPayload payload) {
        payload.getClass();
        String contentCardSyncData = payload.getContentCardSyncData();
        String contentCardSyncUserId = payload.getContentCardSyncUserId();
        Context context = payload.getContext();
        if (contentCardSyncData == null || context == null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new j1$$ExternalSyntheticLambda7(contentCardSyncUserId, contentCardSyncData, 26), 7, (Object) null);
        BrazeInternal.addSerializedContentCardToStorage(context, contentCardSyncData, contentCardSyncUserId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleContentCardsSerializedCardIfPresent$lambda$0(String str, String str2) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Push contains associated Content Cards card. User id: ", str, " Card data: ", str2);
    }

    public static final void handleNotificationDeleted(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(14), 7, (Object) null);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                sendPushActionIntent$default(brazeNotificationUtils, context, BrazeNotificationBroadcastType.DELETED, extras, null, 8, null);
                return;
            }
            brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.DELETED, extras, new BrazeNotificationPayload(extras, null, context, null, 10, null));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(22), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationDeleted$lambda$0() {
        return "Sending notification deleted broadcast";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationDeleted$lambda$1() {
        return "Exception occurred attempting to handle notification delete intent.";
    }

    public static final void handleNotificationOpened(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        try {
            Braze.INSTANCE.getInstance(context).logPushNotificationOpened(intent);
            sendNotificationOpenedBroadcast(context, intent);
            if (BrazeInternal.INSTANCE.getConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                routeUserWithNotificationOpenedIntent(context, intent);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(0), 6, (Object) null);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(11), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationOpened$lambda$0() {
        return "Not handling deep links automatically, skipping deep link handling";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationOpened$lambda$1() {
        return "Exception occurred attempting to handle notification opened intent.";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:3:0x0009, B:6:0x0032, B:7:0x003a, B:10:0x0043, B:13:0x004a, B:15:0x0059, B:18:0x0060, B:19:0x0069, B:21:0x0072, B:24:0x0076, B:26:0x0066), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[Catch: Exception -> 0x0036, TRY_LEAVE, TryCatch #0 {Exception -> 0x0036, blocks: (B:3:0x0009, B:6:0x0032, B:7:0x003a, B:10:0x0043, B:13:0x004a, B:15:0x0059, B:18:0x0060, B:19:0x0069, B:21:0x0072, B:24:0x0076, B:26:0x0066), top: B:2:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void handlePushStoryPageClicked(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        int i = 0;
        try {
            Braze.INSTANCE.getInstance(context).logPushStoryPageClicked(intent.getStringExtra("braze_campaign_id"), intent.getStringExtra("braze_story_page_id"));
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            int intExtra = intent.getIntExtra("nid", 0);
            if (configurationProvider.getDoesPushStoryDismissOnClick() && intExtra != 0) {
                cancelNotification(context, intExtra);
            }
            String stringExtra = intent.getStringExtra("braze_action_uri");
            if (stringExtra != null && !StringsKt.isBlank(stringExtra)) {
                intent.putExtra("uri", intent.getStringExtra("braze_action_uri"));
                String stringExtra2 = intent.getStringExtra("braze_action_use_webview");
                if (stringExtra2 != null && !StringsKt.isBlank(stringExtra2)) {
                    intent.putExtra("ab_use_webview", stringExtra2);
                }
                sendNotificationOpenedBroadcast(context, intent);
                if (configurationProvider.getDoesHandlePushDeepLinksAutomatically()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(stringExtra, i), 6, (Object) null);
                    return;
                } else {
                    routeUserWithNotificationOpenedIntent(context, intent);
                    return;
                }
            }
            intent.removeExtra("uri");
            sendNotificationOpenedBroadcast(context, intent);
            if (configurationProvider.getDoesHandlePushDeepLinksAutomatically()) {
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(i), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handlePushStoryPageClicked$lambda$0(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Not handling deep links automatically, skipping deep link handling for '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handlePushStoryPageClicked$lambda$1() {
        return "Caught exception while handling story click.";
    }

    public static final boolean isBrazePushMessage(Intent intent) {
        intent.getClass();
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        return "true".equalsIgnoreCase(extras.getString("_ab"));
    }

    public static final boolean isNotificationMessage(Intent intent) {
        intent.getClass();
        Bundle extras = intent.getExtras();
        return extras != null && extras.containsKey("t") && extras.containsKey("a");
    }

    public static final boolean isValidNotificationVisibility(int visibility) {
        return visibility == -1 || visibility == 0 || visibility == 1;
    }

    public static final void prefetchBitmapsIfNewlyReceivedStoryPush(BrazeNotificationPayload payload) {
        payload.getClass();
        Context context = payload.getContext();
        if (context != null && payload.getIsPushStory() && payload.getIsNewlyReceivedPushStory()) {
            List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = payload.getPushStoryPages();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = pushStoryPages.iterator();
            while (it.hasNext()) {
                String bitmapUrl = ((BrazeNotificationPayload.PushStoryPage) it.next()).getBitmapUrl();
                if (bitmapUrl != null) {
                    arrayList.add(bitmapUrl);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(str, 13), 6, (Object) null);
                Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, payload.getBrazeExtras(), str, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
            }
            payload.setNewlyReceivedPushStory(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prefetchBitmapsIfNewlyReceivedStoryPush$lambda$1$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Pre-fetching bitmap at URL: ", str);
    }

    public static final boolean refreshBannersIfAppropriate(BrazeNotificationPayload payload) {
        payload.getClass();
        Context context = payload.getContext();
        if (!payload.getShouldRefreshBanners() || context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(10), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(9), 7, (Object) null);
        BrazeInternal.refreshBanners(context);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshBannersIfAppropriate$lambda$0() {
        return "Banners refresh key was true. Refreshing Banners.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshBannersIfAppropriate$lambda$1() {
        return "Banners refresh key not included in push payload or false. Not refreshing banners.";
    }

    public static final boolean refreshFeatureFlagsIfAppropriate(BrazeNotificationPayload payload) {
        payload.getClass();
        Context context = payload.getContext();
        if (!payload.getShouldRefreshFeatureFlags() || context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(8), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(7), 7, (Object) null);
        BrazeInternal.refreshFeatureFlags(context);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlagsIfAppropriate$lambda$0() {
        return "Feature flag refresh key was true. Refreshing feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlagsIfAppropriate$lambda$1() {
        return "Feature flag refresh key not included in push payload or false. Not refreshing feature flags.";
    }

    public static final void routeUserWithNotificationOpenedIntent(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(13), 7, (Object) null);
        Bundle bundleExtra = intent.getBundleExtra("extra");
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        bundleExtra.putString("cid", intent.getStringExtra("cid"));
        bundleExtra.putString("source", "Appboy");
        brazeNotificationUtils.routeUserWithNotificationOpenedIntent$android_sdk_ui_release(context, bundleExtra, intent.getStringExtra("uri"), "true".equalsIgnoreCase(intent.getStringExtra("ab_use_webview")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$0() {
        return "routeUserWithNotificationOpenedIntent called with Intent";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$2(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Delayed initialization is enabled. Deep link:", str, " will not be handled.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$3(Intent intent) {
        return "Push notification had no deep link. Opening main activity:" + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$4(String str, boolean z) {
        return "Found a deep link:" + str + ". Use webview set to:" + z;
    }

    public static final void sendNotificationOpenedBroadcast(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(6), 7, (Object) null);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            sendPushActionIntent$default(brazeNotificationUtils, context, BrazeNotificationBroadcastType.OPENED, extras, null, 8, null);
            return;
        }
        brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.OPENED, extras, new BrazeNotificationPayload(extras, null, context, null, 10, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendNotificationOpenedBroadcast$lambda$0() {
        return "Sending notification opened broadcast";
    }

    private final void sendPushActionIntent(Context context, BrazeNotificationBroadcastType broadcastType, Bundle notificationExtras, BrazeNotificationPayload payload) {
        Intent intent;
        int i = WhenMappings.$EnumSwitchMapping$0[broadcastType.ordinal()];
        if (i == 1) {
            intent = new Intent("com.braze.push.intent.NOTIFICATION_OPENED").setPackage(context.getPackageName());
            intent.getClass();
        } else if (i == 2) {
            intent = new Intent("com.braze.push.intent.NOTIFICATION_RECEIVED").setPackage(context.getPackageName());
            intent.getClass();
        } else if (i != 3) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        } else {
            intent = new Intent("com.braze.push.intent.NOTIFICATION_DELETED").setPackage(context.getPackageName());
            intent.getClass();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda19(broadcastType, 0), 6, (Object) null);
        sendPushActionIntent(context, intent, notificationExtras);
        if (payload != null) {
            BrazeInternal.INSTANCE.publishBrazePushAction(context, broadcastType.getBrazePushEventType(), payload);
        }
    }

    public static /* synthetic */ void sendPushActionIntent$default(BrazeNotificationUtils brazeNotificationUtils, Context context, BrazeNotificationBroadcastType brazeNotificationBroadcastType, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload, int i, Object obj) {
        if ((i & 8) != 0) {
            brazeNotificationPayload = null;
        }
        brazeNotificationUtils.sendPushActionIntent(context, brazeNotificationBroadcastType, bundle, brazeNotificationPayload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendPushActionIntent$lambda$0(BrazeNotificationBroadcastType brazeNotificationBroadcastType) {
        return "Sending Braze broadcast receiver intent for " + brazeNotificationBroadcastType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendPushActionIntent$lambda$1(Intent intent) {
        return "Sending push action intent: " + intent;
    }

    public static final void sendPushMessageReceivedBroadcast(Context context, Bundle notificationExtras, BrazeNotificationPayload payload) {
        context.getClass();
        notificationExtras.getClass();
        payload.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(11), 7, (Object) null);
        brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.RECEIVED, notificationExtras, payload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendPushMessageReceivedBroadcast$lambda$0() {
        return "Sending push message received broadcast";
    }

    public static final void setAccentColorIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        payload.getClass();
        Integer accentColor = payload.getAccentColor();
        if (accentColor != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(3), 7, (Object) null);
            notificationBuilder.mColor = accentColor.intValue();
            return;
        }
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        if (configurationProvider != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(4), 7, (Object) null);
            notificationBuilder.mColor = configurationProvider.getDefaultNotificationAccentColor();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setAccentColorIfPresentAndSupported$lambda$0() {
        return "Using accent color for notification from extras bundle";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setAccentColorIfPresentAndSupported$lambda$1$0() {
        return "Using default accent color for notification";
    }

    public static final void setCategoryIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        payload.getClass();
        String notificationCategory = payload.getNotificationCategory();
        if (notificationCategory == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(27), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(26), 7, (Object) null);
            notificationBuilder.mCategory = notificationCategory;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCategoryIfPresentAndSupported$lambda$0() {
        return "Setting category for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCategoryIfPresentAndSupported$lambda$1() {
        return "Category not present in notification extras. Not setting category for notification.";
    }

    public static final void setContentIfPresent(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        notificationBuilder.getClass();
        payload.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(18), 7, (Object) null);
        String contentText = payload.getContentText();
        if (contentText == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return;
        }
        notificationBuilder.setContentText(HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setContentIfPresent$lambda$0() {
        return "Setting content for notification";
    }

    public static final void setContentIntentIfPresent(Context context, NotificationCompat.Builder notificationBuilder, Bundle notificationExtras) {
        context.getClass();
        notificationBuilder.getClass();
        try {
            notificationBuilder.mContentIntent = INSTANCE.getPushActionPendingIntent(context, "com.braze.action.BRAZE_PUSH_CLICKED", notificationExtras);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(5), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setContentIntentIfPresent$lambda$0() {
        return "Error setting content intent.";
    }

    public static final void setDeleteIntent(Context context, NotificationCompat.Builder notificationBuilder, Bundle notificationExtras) {
        context.getClass();
        notificationBuilder.getClass();
        try {
            Intent intent = new Intent("com.braze.action.BRAZE_PUSH_DELETED").setClass(context, getNotificationReceiverClass());
            intent.getClass();
            if (notificationExtras != null) {
                intent.putExtras(notificationExtras);
            }
            notificationBuilder.mNotification.deleteIntent = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(17), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDeleteIntent$lambda$0() {
        return "Error setting delete intent.";
    }

    public static final boolean setLargeIconIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        BrazeLogger brazeLogger;
        BrazeNotificationUtils brazeNotificationUtils;
        String largeIcon;
        IconCompat iconCompat;
        notificationBuilder.getClass();
        payload.getClass();
        if (payload.getIsPushStory()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(7), 7, (Object) null);
            return false;
        }
        Context context = payload.getContext();
        if (context == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return false;
        }
        try {
            brazeLogger = BrazeLogger.INSTANCE;
            brazeNotificationUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(8), 7, (Object) null);
            largeIcon = payload.getLargeIcon();
            iconCompat = null;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(12), 4, (Object) null);
        }
        if (largeIcon != null) {
            Bitmap pushBitmapFromUrl = Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, null, largeIcon, BrazeViewBounds.NOTIFICATION_LARGE_ICON);
            if (pushBitmapFromUrl != null) {
                iconCompat = new IconCompat(1);
                iconCompat.mObj1 = pushBitmapFromUrl;
            }
            notificationBuilder.mLargeIcon = iconCompat;
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(9), 7, (Object) null);
        int largeNotificationIconResourceId = configurationProvider.getLargeNotificationIconResourceId();
        if (largeNotificationIconResourceId == 0) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(10), 7, (Object) null);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(13), 7, (Object) null);
            return false;
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), largeNotificationIconResourceId);
        if (decodeResource != null) {
            iconCompat = new IconCompat(1);
            iconCompat.mObj1 = decodeResource;
        }
        notificationBuilder.mLargeIcon = iconCompat;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$0() {
        return "Large icon not supported in story push.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$1() {
        return "Setting large icon for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$3() {
        return "Large icon bitmap url not present in extras. Attempting to use resource id instead.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$4() {
        return "Large icon resource id not present for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$5() {
        return "Error setting large notification icon";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$6() {
        return "Large icon not set for notification";
    }

    public static final void setNotificationBadgeNumberIfPresent(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        payload.getClass();
        Integer notificationBadgeNumber = payload.getNotificationBadgeNumber();
        if (notificationBadgeNumber != null) {
            notificationBuilder.mNumber = notificationBadgeNumber.intValue();
        }
    }

    public static final void setNotificationDurationAlarm(Context context, Class<?> thisClass, int notificationId, int durationInMillis) {
        context.getClass();
        Intent intent = new Intent(context, thisClass);
        intent.setAction("com.braze.action.CANCEL_NOTIFICATION");
        intent.putExtra("nid", notificationId);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 134217728 | IntentUtils.getImmutablePendingIntentFlags());
        Object systemService = context.getSystemService("alarm");
        systemService.getClass();
        AlarmManager alarmManager = (AlarmManager) systemService;
        if (durationInMillis >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(durationInMillis, 10), 7, (Object) null);
            alarmManager.set(3, SystemClock.elapsedRealtime() + durationInMillis, broadcast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setNotificationDurationAlarm$lambda$0(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Setting Notification duration alarm for ", " ms");
    }

    public static final void setPriorityIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        payload.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(25), 7, (Object) null);
        notificationBuilder.mPriority = getNotificationPriority(payload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPriorityIfPresentAndSupported$lambda$0() {
        return "Setting priority for notification";
    }

    public static final void setPublicVersionIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        payload.getClass();
        Context context = payload.getContext();
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        if (context == null || payload.getPublicNotificationExtras() == null || configurationProvider == null) {
            return;
        }
        String orCreateNotificationChannelId = getOrCreateNotificationChannelId(payload);
        Bundle parseJsonObjectIntoBundle = JsonUtils.parseJsonObjectIntoBundle(payload.getPublicNotificationExtras());
        if (parseJsonObjectIntoBundle.isEmpty()) {
            return;
        }
        BrazeNotificationPayload brazeNotificationPayload = new BrazeNotificationPayload(parseJsonObjectIntoBundle, null, context, configurationProvider, 2, null);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, orCreateNotificationChannelId);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda42(brazeNotificationPayload, 0), 7, (Object) null);
        setContentIfPresent(builder, brazeNotificationPayload);
        setTitleIfPresent(builder, brazeNotificationPayload);
        setSummaryTextIfPresentAndSupported(builder, brazeNotificationPayload);
        setSmallIcon(configurationProvider, builder);
        setAccentColorIfPresentAndSupported(builder, brazeNotificationPayload);
        notificationBuilder.mPublicVersion = builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPublicVersionIfPresentAndSupported$lambda$0(BrazeNotificationPayload brazeNotificationPayload) {
        return "Setting public version of notification with payload: " + brazeNotificationPayload;
    }

    public static final void setSetShowWhen(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        payload.getClass();
        if (payload.getIsPushStory()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(21), 7, (Object) null);
            notificationBuilder.mShowWhen = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSetShowWhen$lambda$0() {
        return "Set show when not supported in story push.";
    }

    public static final int setSmallIcon(BrazeConfigurationProvider appConfigurationProvider, NotificationCompat.Builder notificationBuilder) {
        appConfigurationProvider.getClass();
        notificationBuilder.getClass();
        int smallNotificationIconResourceId = appConfigurationProvider.getSmallNotificationIconResourceId();
        if (smallNotificationIconResourceId == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(19), 7, (Object) null);
            smallNotificationIconResourceId = appConfigurationProvider.getApplicationIconResourceId();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(20), 7, (Object) null);
        }
        notificationBuilder.mNotification.icon = smallNotificationIconResourceId;
        return smallNotificationIconResourceId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSmallIcon$lambda$0() {
        return "Small notification icon resource was not found. Will use the app icon when displaying notifications.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSmallIcon$lambda$1() {
        return "Setting small icon for notification via resource id";
    }

    public static final void setSoundIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        Notification notification = notificationBuilder.mNotification;
        payload.getClass();
        String notificationSound = payload.getNotificationSound();
        if (notificationSound == null) {
            return;
        }
        if (notificationSound.equals("d")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(23), 7, (Object) null);
            notification.defaults = 1;
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(24), 7, (Object) null);
            notification.sound = Uri.parse(notificationSound);
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSoundIfPresentAndSupported$lambda$0() {
        return "Setting default sound for notification.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSoundIfPresentAndSupported$lambda$1() {
        return "Setting sound for notification via uri.";
    }

    public static final void setSummaryTextIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        payload.getClass();
        String summaryText = payload.getSummaryText();
        if (summaryText == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(2), 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(1), 7, (Object) null);
        notificationBuilder.getClass();
        notificationBuilder.mSubText = NotificationCompat.Builder.limitCharSequenceLength(summaryText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSummaryTextIfPresentAndSupported$lambda$0() {
        return "Setting summary text for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSummaryTextIfPresentAndSupported$lambda$1() {
        return "Summary text not present. Not setting summary text for notification.";
    }

    public static final void setTickerIfPresent(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        payload.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(29), 7, (Object) null);
        String titleText = payload.getTitleText();
        if (titleText == null) {
            return;
        }
        notificationBuilder.setTicker(titleText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setTickerIfPresent$lambda$0() {
        return "Setting ticker for notification";
    }

    public static final void setTitleIfPresent(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        notificationBuilder.getClass();
        payload.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(6), 7, (Object) null);
        String titleText = payload.getTitleText();
        if (titleText == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return;
        }
        notificationBuilder.setContentTitle(HtmlUtils.getHtmlSpannedTextIfEnabled(titleText, configurationProvider));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setTitleIfPresent$lambda$0() {
        return "Setting title for notification";
    }

    public static final void setVisibilityIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        payload.getClass();
        Integer notificationVisibility = payload.getNotificationVisibility();
        if (notificationVisibility != null) {
            if (!isValidNotificationVisibility(notificationVisibility.intValue())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda14(1, notificationVisibility), 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(28), 7, (Object) null);
                notificationBuilder.mVisibility = notificationVisibility.intValue();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setVisibilityIfPresentAndSupported$lambda$0() {
        return "Setting visibility for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setVisibilityIfPresentAndSupported$lambda$1(Integer num) {
        return "Received invalid notification visibility " + num;
    }

    public static final boolean wakeScreenIfAppropriate(BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        payload.getClass();
        Context context = payload.getContext();
        if (context != null && (configurationProvider = payload.getConfigurationProvider()) != null) {
            Bundle notificationExtras = payload.getNotificationExtras();
            if (PermissionUtils.hasPermission(context, "android.permission.WAKE_LOCK") && configurationProvider.isPushWakeScreenForNotificationEnabled()) {
                int i = 4;
                try {
                    Object systemService = context.getSystemService("uimode");
                    systemService.getClass();
                    if (((UiModeManager) systemService).getCurrentModeType() == 4) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(16), 7, (Object) null);
                        return false;
                    }
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(17), 4, (Object) null);
                }
                Object systemService2 = context.getSystemService("notification");
                systemService2.getClass();
                NotificationChannel validNotificationChannel = getValidNotificationChannel((NotificationManager) systemService2, notificationExtras);
                if (validNotificationChannel == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(i), 7, (Object) null);
                    return false;
                }
                int i2 = 5;
                if (validNotificationChannel.getImportance() == 1) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda19(validNotificationChannel, i2), 7, (Object) null);
                    return false;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(i2), 7, (Object) null);
                Object systemService3 = context.getSystemService("power");
                systemService3.getClass();
                PowerManager.WakeLock newWakeLock = ((PowerManager) systemService3).newWakeLock(268435482, TAG);
                newWakeLock.acquire();
                newWakeLock.release();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$0() {
        return "Not waking this TV UI mode device";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$1() {
        return "Failed to check for TV status during screen wake. Continuing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$2() {
        return "Not waking screen on Android O+ device, could not find notification channel.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$3(NotificationChannel notificationChannel) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(notificationChannel.getImportance(), "Not acquiring wake-lock for Android O+ notification with importance: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$4() {
        return "Waking screen for notification";
    }

    public final void routeUserWithNotificationOpenedIntent$android_sdk_ui_release(Context context, Bundle extras, String deepLink, boolean useWebView) {
        context.getClass();
        extras.getClass();
        Braze.Companion companion = Braze.INSTANCE;
        if (companion.isDelayedInitializationEnabled() || deepLink == null || StringsKt.isBlank(deepLink)) {
            Intent mainActivityIntent = UriUtils.getMainActivityIntent(context, extras);
            context.startActivity(mainActivityIntent);
            if (companion.isDelayedInitializationEnabled()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(deepLink, 10), 7, (Object) null);
                return;
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda28(0, mainActivityIntent), 7, (Object) null);
                return;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(deepLink, useWebView, 5), 7, (Object) null);
        extras.putString("uri", deepLink);
        extras.putBoolean("ab_use_webview", useWebView);
        BrazeDeeplinkHandler.Companion companion2 = BrazeDeeplinkHandler.INSTANCE;
        UriAction createUriActionFromUrlString = companion2.getInstance().createUriActionFromUrlString(deepLink, extras, useWebView, Channel.PUSH);
        if (createUriActionFromUrlString != null) {
            companion2.getInstance().gotoUri(context, createUriActionFromUrlString);
        }
    }

    private final void sendPushActionIntent(Context context, Intent pushIntent, Bundle notificationExtras) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda28(1, pushIntent), 6, (Object) null);
        if (notificationExtras != null) {
            pushIntent.putExtras(notificationExtras);
        }
        IntentUtils.addComponentAndSendBroadcast(context, pushIntent);
    }

    public static final boolean wakeScreenIfAppropriate(Context context, BrazeConfigurationProvider configurationProvider, Bundle notificationExtras) {
        context.getClass();
        configurationProvider.getClass();
        return wakeScreenIfAppropriate(new BrazeNotificationPayload(notificationExtras, null, context, configurationProvider, 2, null));
    }
}
