package com.braze.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeDateFormat;
import com.braze.enums.BrazeViewBounds;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.R$id;
import com.braze.ui.R$layout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/braze/push/BrazeNotificationStyleFactory;", "", "Companion", "NoOpSentinelStyle", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BrazeNotificationStyleFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/braze/push/BrazeNotificationStyleFactory$NoOpSentinelStyle;", "Landroidx/core/app/NotificationCompat$Style;", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoOpSentinelStyle extends NotificationCompat.Style {
    }

    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\"\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u0005H\u0002J \u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010*\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/braze/push/BrazeNotificationStyleFactory$Companion;", "", "<init>", "()V", "BIG_PICTURE_STYLE_IMAGE_HEIGHT", "", "STORY_SET_GRAVITY", "", "STORY_SET_VISIBILITY", "setStyleIfSupported", "", "notificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "payload", "Lcom/braze/models/push/BrazeNotificationPayload;", "getNotificationStyle", "Landroidx/core/app/NotificationCompat$Style;", "getBigTextNotificationStyle", "Landroidx/core/app/NotificationCompat$BigTextStyle;", "getStoryStyle", "Landroidx/core/app/NotificationCompat$DecoratedCustomViewStyle;", "getInlineImageStyle", "getBigPictureNotificationStyle", "Landroidx/core/app/NotificationCompat$BigPictureStyle;", "getConversationalPushStyle", "Landroidx/core/app/NotificationCompat$MessagingStyle;", "createStoryPageClickedPendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "pushStoryPage", "Lcom/braze/models/push/BrazeNotificationPayload$PushStoryPage;", "createStoryTraversedPendingIntent", "notificationExtras", "Landroid/os/Bundle;", "pageIndex", "populatePushStoryPage", "", "view", "Landroid/widget/RemoteViews;", "setBigPictureSummaryAndTitle", "bigPictureNotificationStyle", "isRemoteViewNotificationAvailableSpaceConstrained", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final PendingIntent createStoryPageClickedPendingIntent(Context context, BrazeNotificationPayload payload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            Intent intent = new Intent("com.braze.action.BRAZE_STORY_CLICKED").setClass(context, NotificationTrampolineActivity.class);
            intent.getClass();
            intent.setFlags(intent.getFlags() | BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_PUSH_STORY_PAGE_CLICK));
            intent.putExtras(payload.getNotificationExtras());
            intent.putExtra("braze_action_uri", pushStoryPage.getDeeplink());
            intent.putExtra("braze_action_use_webview", pushStoryPage.getUseWebview());
            intent.putExtra("braze_story_page_id", pushStoryPage.getStoryPageId());
            intent.putExtra("braze_campaign_id", pushStoryPage.getCampaignId());
            intent.putExtra("nid", BrazeNotificationUtils.getNotificationId(payload));
            PendingIntent activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags());
            activity.getClass();
            return activity;
        }

        private final PendingIntent createStoryTraversedPendingIntent(Context context, Bundle notificationExtras, int pageIndex) {
            Intent intent = new Intent("com.braze.action.STORY_TRAVERSE").setClass(context, BrazeNotificationUtils.getNotificationReceiverClass());
            intent.getClass();
            if (notificationExtras != null) {
                notificationExtras.putInt("braze_story_index", pageIndex);
                intent.putExtras(notificationExtras);
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, 1073741824 | IntentUtils.getImmutablePendingIntentFlags());
            broadcast.getClass();
            return broadcast;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getBigPictureNotificationStyle$lambda$0(String str) {
            return Recorder$$ExternalSyntheticOutline2.m("Failed to download image bitmap for big picture notification style. Url: ", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getBigPictureNotificationStyle$lambda$1() {
            return "Failed to scale image bitmap, using original.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getBigPictureNotificationStyle$lambda$2() {
            return "Failed to create Big Picture Style.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConversationalPushStyle$lambda$0() {
            return "Reply person does not exist in mapping. Not rendering a style";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConversationalPushStyle$lambda$1(BrazeNotificationPayload.ConversationMessage conversationMessage) {
            return "Message person does not exist in mapping. Not rendering a style. " + conversationMessage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConversationalPushStyle$lambda$2() {
            return "Failed to create conversation push style. Returning null.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInlineImageStyle$lambda$0() {
            return "Inline Image Push cannot render without a context";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInlineImageStyle$lambda$1() {
            return "Inline Image Push image url invalid";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInlineImageStyle$lambda$2() {
            return "Inline Image Push failed to get image bitmap";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInlineImageStyle$lambda$4() {
            return "Inline Image Push application info was null";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$0() {
            return "Rendering push notification with DecoratedCustomViewStyle (Story)";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$1() {
            return "Rendering conversational push";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$2() {
            return "Rendering push notification with custom inline image style";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$3() {
            return "Rendering push notification with BigPictureStyle";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$4() {
            return "Rendering push notification with BigTextStyle";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getStoryStyle$lambda$0() {
            return "Push story page cannot render without a context";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getStoryStyle$lambda$1() {
            return "Push story page was not populated correctly. Not using DecoratedCustomViewStyle.";
        }

        private final boolean isRemoteViewNotificationAvailableSpaceConstrained(Context context) {
            return Build.VERSION.SDK_INT >= 31 && context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 31;
        }

        private final boolean populatePushStoryPage(RemoteViews view, BrazeNotificationPayload payload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(22), 7, (Object) null);
                return false;
            }
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(23), 7, (Object) null);
                return false;
            }
            String bitmapUrl = pushStoryPage.getBitmapUrl();
            if (bitmapUrl == null || StringsKt.isBlank(bitmapUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(25), 7, (Object) null);
                return false;
            }
            Bitmap pushBitmapFromUrl = Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, payload.getNotificationExtras(), bitmapUrl, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
            if (pushBitmapFromUrl == null) {
                return false;
            }
            view.setImageViewBitmap(R$id.com_braze_story_image_view, pushBitmapFromUrl);
            String title = pushStoryPage.getTitle();
            if (title == null || StringsKt.isBlank(title)) {
                view.setInt(R$id.com_braze_story_text_view_container, "setVisibility", 8);
            } else {
                view.setTextViewText(R$id.com_braze_story_text_view, HtmlUtils.getHtmlSpannedTextIfEnabled(title, configurationProvider));
                view.setInt(R$id.com_braze_story_text_view_container, "setGravity", pushStoryPage.getTitleGravity());
            }
            String subtitle = pushStoryPage.getSubtitle();
            if (subtitle == null || StringsKt.isBlank(subtitle)) {
                view.setInt(R$id.com_braze_story_text_view_small_container, "setVisibility", 8);
            } else {
                view.setTextViewText(R$id.com_braze_story_text_view_small, HtmlUtils.getHtmlSpannedTextIfEnabled(subtitle, configurationProvider));
                view.setInt(R$id.com_braze_story_text_view_small_container, "setGravity", pushStoryPage.getSubtitleGravity());
            }
            view.setOnClickPendingIntent(R$id.com_braze_story_relative_layout, createStoryPageClickedPendingIntent(context, payload, pushStoryPage));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populatePushStoryPage$lambda$0() {
            return "Push story page cannot render without a context";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populatePushStoryPage$lambda$1() {
            return "Push story page cannot render without a configuration provider";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populatePushStoryPage$lambda$2() {
            return "Push story page image url invalid";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setStyleIfSupported$lambda$0() {
            return "Setting style for notification";
        }

        public final NotificationCompat.BigPictureStyle getBigPictureNotificationStyle(BrazeNotificationPayload payload) {
            String bigImageUrl;
            Companion companion;
            IconCompat iconCompat;
            payload.getClass();
            Context context = payload.getContext();
            if (context == null || (bigImageUrl = payload.getBigImageUrl()) == null || StringsKt.isBlank(bigImageUrl)) {
                return null;
            }
            Bitmap pushBitmapFromUrl = Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, payload.getNotificationExtras(), bigImageUrl, BrazeViewBounds.NOTIFICATION_EXPANDED_IMAGE);
            if (pushBitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(bigImageUrl, 9), 7, (Object) null);
                return null;
            }
            try {
                int i = 1;
                if (pushBitmapFromUrl.getWidth() > pushBitmapFromUrl.getHeight()) {
                    int pixelsFromDensityAndDp = BrazeImageUtils.getPixelsFromDensityAndDp(BrazeImageUtils.getDensityDpi(context), 192);
                    int i2 = pixelsFromDensityAndDp * 2;
                    int displayWidthPixels = BrazeImageUtils.getDisplayWidthPixels(context);
                    if (i2 > displayWidthPixels) {
                        i2 = displayWidthPixels;
                    }
                    try {
                        pushBitmapFromUrl = Bitmap.createScaledBitmap(pushBitmapFromUrl, i2, pixelsFromDensityAndDp, true);
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(i), 4, (Object) null);
                    }
                }
                NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
                if (pushBitmapFromUrl == null) {
                    iconCompat = null;
                } else {
                    iconCompat = new IconCompat(1);
                    iconCompat.mObj1 = pushBitmapFromUrl;
                }
                bigPictureStyle.mPictureIcon = iconCompat;
                companion = this;
                try {
                    companion.setBigPictureSummaryAndTitle(bigPictureStyle, payload);
                    return bigPictureStyle;
                } catch (Exception e2) {
                    e = e2;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) companion, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(2), 4, (Object) null);
                    return null;
                }
            } catch (Exception e3) {
                e = e3;
                companion = this;
            }
        }

        public final NotificationCompat.BigTextStyle getBigTextNotificationStyle(BrazeNotificationPayload payload) {
            CharSequence htmlSpannedTextIfEnabled;
            payload.getClass();
            NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider != null) {
                String contentText = payload.getContentText();
                if (contentText != null && (htmlSpannedTextIfEnabled = HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider)) != null) {
                    bigTextStyle.bigText(htmlSpannedTextIfEnabled);
                }
                String bigSummaryText = payload.getBigSummaryText();
                if (bigSummaryText != null) {
                    bigTextStyle.setSummaryText$1(HtmlUtils.getHtmlSpannedTextIfEnabled(bigSummaryText, configurationProvider));
                }
                String bigTitleText = payload.getBigTitleText();
                if (bigTitleText != null) {
                    bigTextStyle.setBigContentTitle$1(HtmlUtils.getHtmlSpannedTextIfEnabled(bigTitleText, configurationProvider));
                }
            }
            return bigTextStyle;
        }

        public final NotificationCompat.MessagingStyle getConversationalPushStyle(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
            notificationBuilder.getClass();
            payload.getClass();
            try {
                Map<String, BrazeNotificationPayload.ConversationPerson> conversationPersonMap = payload.getConversationPersonMap();
                BrazeNotificationPayload.ConversationPerson conversationPerson = conversationPersonMap.get(payload.getConversationReplyPersonId());
                if (conversationPerson == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(3), 7, (Object) null);
                    return null;
                }
                NotificationCompat.MessagingStyle messagingStyle = new NotificationCompat.MessagingStyle(conversationPerson.getPerson());
                Iterator<BrazeNotificationPayload.ConversationMessage> it = payload.getConversationMessages().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        messagingStyle.mIsGroupConversation = Boolean.valueOf(conversationPersonMap.size() > 1);
                        notificationBuilder.mShortcutId = payload.getConversationShortcutId();
                        return messagingStyle;
                    }
                    BrazeNotificationPayload.ConversationMessage next = it.next();
                    BrazeNotificationPayload.ConversationPerson conversationPerson2 = conversationPersonMap.get(next.getPersonId());
                    if (conversationPerson2 == null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda19(next, 4), 7, (Object) null);
                        return null;
                    }
                    NotificationCompat.MessagingStyle.Message message = new NotificationCompat.MessagingStyle.Message(next.getMessage(), next.getTimestamp(), conversationPerson2.getPerson());
                    ArrayList arrayList = messagingStyle.mMessages;
                    arrayList.add(message);
                    if (arrayList.size() > 25) {
                        arrayList.remove(0);
                    }
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(15), 4, (Object) null);
                return null;
            }
        }

        public final NotificationCompat.Style getInlineImageStyle(BrazeNotificationPayload payload, NotificationCompat.Builder notificationBuilder) {
            payload.getClass();
            notificationBuilder.getClass();
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(16), 7, (Object) null);
                return null;
            }
            String bigImageUrl = payload.getBigImageUrl();
            if (bigImageUrl == null || StringsKt.isBlank(bigImageUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(17), 7, (Object) null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            Bitmap pushBitmapFromUrl = Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, notificationExtras, bigImageUrl, BrazeViewBounds.NOTIFICATION_INLINE_PUSH_IMAGE);
            if (pushBitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(18), 7, (Object) null);
                return null;
            }
            boolean isRemoteViewNotificationAvailableSpaceConstrained = isRemoteViewNotificationAvailableSpaceConstrained(context);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), isRemoteViewNotificationAvailableSpaceConstrained ? R$layout.com_braze_push_inline_image_constrained : R$layout.com_braze_notification_inline_image);
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            Icon createWithResource = Icon.createWithResource(context, configurationProvider.getSmallNotificationIconResourceId());
            createWithResource.getClass();
            Integer accentColor = payload.getAccentColor();
            if (accentColor != null) {
                createWithResource.setTint(accentColor.intValue());
            }
            remoteViews.setImageViewIcon(R$id.com_braze_inline_image_push_app_icon, createWithResource);
            PackageManager packageManager = context.getPackageManager();
            try {
                ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(0L)) : packageManager.getApplicationInfo(context.getPackageName(), 0);
                applicationInfo.getClass();
                CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
                applicationLabel.getClass();
                remoteViews.setTextViewText(R$id.com_braze_inline_image_push_app_name_text, HtmlUtils.getHtmlSpannedTextIfEnabled((String) applicationLabel, configurationProvider));
                remoteViews.setTextViewText(R$id.com_braze_inline_image_push_time_text, DateTimeUtils.formatDateNow(BrazeDateFormat.CLOCK_12_HOUR));
                String string2 = notificationExtras.getString("t");
                if (string2 != null) {
                    remoteViews.setTextViewText(R$id.com_braze_inline_image_push_title_text, HtmlUtils.getHtmlSpannedTextIfEnabled(string2, configurationProvider));
                }
                String string3 = notificationExtras.getString("a");
                if (string3 != null) {
                    remoteViews.setTextViewText(R$id.com_braze_inline_image_push_content_text, HtmlUtils.getHtmlSpannedTextIfEnabled(string3, configurationProvider));
                }
                notificationBuilder.mContentView = remoteViews;
                if (!isRemoteViewNotificationAvailableSpaceConstrained) {
                    remoteViews.setImageViewBitmap(R$id.com_braze_inline_image_push_side_image, pushBitmapFromUrl);
                    return new NoOpSentinelStyle();
                }
                IconCompat iconCompat = new IconCompat(1);
                iconCompat.mObj1 = pushBitmapFromUrl;
                notificationBuilder.mLargeIcon = iconCompat;
                return new NotificationCompat.DecoratedCustomViewStyle();
            } catch (PackageManager.NameNotFoundException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(19), 4, (Object) null);
                return null;
            }
        }

        public final NotificationCompat.Style getNotificationStyle(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
            NotificationCompat.Style style;
            notificationBuilder.getClass();
            payload.getClass();
            if (payload.getIsPushStory() && payload.getContext() != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(24), 7, (Object) null);
                style = getStoryStyle(notificationBuilder, payload);
            } else if (payload.getIsConversationalPush()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(26), 7, (Object) null);
                style = getConversationalPushStyle(notificationBuilder, payload);
            } else if (payload.getBigImageUrl() == null) {
                style = null;
            } else if (payload.getIsInlineImagePush()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(27), 7, (Object) null);
                style = getInlineImageStyle(payload, notificationBuilder);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(28), 7, (Object) null);
                style = getBigPictureNotificationStyle(payload);
            }
            if (style != null) {
                return style;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(29), 7, (Object) null);
            return getBigTextNotificationStyle(payload);
        }

        public final NotificationCompat.DecoratedCustomViewStyle getStoryStyle(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
            notificationBuilder.getClass();
            payload.getClass();
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(20), 7, (Object) null);
                return null;
            }
            List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = payload.getPushStoryPages();
            int pushStoryPageIndex = payload.getPushStoryPageIndex();
            BrazeNotificationPayload.PushStoryPage pushStoryPage = pushStoryPages.get(pushStoryPageIndex);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R$layout.com_braze_push_story_one_image);
            if (!populatePushStoryPage(remoteViews, payload, pushStoryPage)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(21), 6, (Object) null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            NotificationCompat.DecoratedCustomViewStyle decoratedCustomViewStyle = new NotificationCompat.DecoratedCustomViewStyle();
            int size = pushStoryPages.size();
            remoteViews.setOnClickPendingIntent(R$id.com_braze_story_button_previous, createStoryTraversedPendingIntent(context, notificationExtras, ((pushStoryPageIndex - 1) + size) % size));
            remoteViews.setOnClickPendingIntent(R$id.com_braze_story_button_next, createStoryTraversedPendingIntent(context, notificationExtras, (pushStoryPageIndex + 1) % size));
            notificationBuilder.mBigContentView = remoteViews;
            notificationBuilder.setFlag(8, true);
            return decoratedCustomViewStyle;
        }

        public final void setBigPictureSummaryAndTitle(NotificationCompat.BigPictureStyle bigPictureNotificationStyle, BrazeNotificationPayload payload) {
            String contentText;
            bigPictureNotificationStyle.getClass();
            payload.getClass();
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                return;
            }
            String bigSummaryText = payload.getBigSummaryText();
            String bigTitleText = payload.getBigTitleText();
            String summaryText = payload.getSummaryText();
            if (bigSummaryText != null) {
                bigPictureNotificationStyle.setSummaryText(HtmlUtils.getHtmlSpannedTextIfEnabled(bigSummaryText, configurationProvider));
            }
            if (bigTitleText != null) {
                bigPictureNotificationStyle.setBigContentTitle(HtmlUtils.getHtmlSpannedTextIfEnabled(bigTitleText, configurationProvider));
            }
            if (summaryText == null && bigSummaryText == null && (contentText = payload.getContentText()) != null) {
                bigPictureNotificationStyle.setSummaryText(HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider));
            }
        }

        public final void setStyleIfSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
            notificationBuilder.getClass();
            payload.getClass();
            NotificationCompat.Style notificationStyle = getNotificationStyle(notificationBuilder, payload);
            if (notificationStyle instanceof NoOpSentinelStyle) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(14), 7, (Object) null);
            notificationBuilder.setStyle(notificationStyle);
        }

        private Companion() {
        }
    }
}
