package bo.app;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import com.braze.enums.Month;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.push.BrazeNotificationUtils;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import com.braze.support.PermissionUtils;
import com.braze.support.ValidationUtils;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView;
import com.squareup.cash.arcade.components.timeline.TimelineState;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final /* synthetic */ class jg$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;

    public /* synthetic */ jg$$ExternalSyntheticLambda1(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String month$lambda$1$0;
        String _set_durationInMilliseconds_$lambda$0;
        String _set_durationInMilliseconds_$lambda$1;
        String notificationId$lambda$3;
        String notificationDurationAlarm$lambda$0;
        String cancelNotification$lambda$0;
        String handleCancelNotificationAction$lambda$0;
        String handlePushNotificationPayload$lambda$1;
        String _set_logLevel_$lambda$0;
        String wouldPushPermissionPromptDisplay$lambda$2;
        String wouldPushPermissionPromptDisplay$lambda$4;
        String isValidLogPurchaseInput$lambda$5;
        String isValidLogPurchaseInput$lambda$6;
        String onViewAttachedToWindow$lambda$0;
        String onViewDetachedFromWindow$lambda$0;
        String open$lambda$1;
        String addInAppMessageViewToViewGroup$lambda$1;
        String _get_messageWebView_$lambda$2;
        String str;
        int i = this.$r8$classId;
        int i2 = this.f$0;
        switch (i) {
            case 0:
                return jg.a(i2);
            case 1:
                return new LazyListState(i2, 0);
            case 2:
                return new LazyGridState(i2, 0);
            case 3:
                return g8.a(i2);
            case 4:
                return y1.a(i2);
            case 5:
                return y1.b(i2);
            case 6:
                month$lambda$1$0 = Month.Companion.getMonth$lambda$1$0(i2);
                return month$lambda$1$0;
            case 7:
                _set_durationInMilliseconds_$lambda$0 = InAppMessageBase._set_durationInMilliseconds_$lambda$0(i2);
                return _set_durationInMilliseconds_$lambda$0;
            case 8:
                _set_durationInMilliseconds_$lambda$1 = InAppMessageBase._set_durationInMilliseconds_$lambda$1(i2);
                return _set_durationInMilliseconds_$lambda$1;
            case 9:
                notificationId$lambda$3 = BrazeNotificationUtils.getNotificationId$lambda$3(i2);
                return notificationId$lambda$3;
            case 10:
                notificationDurationAlarm$lambda$0 = BrazeNotificationUtils.setNotificationDurationAlarm$lambda$0(i2);
                return notificationDurationAlarm$lambda$0;
            case 11:
                cancelNotification$lambda$0 = BrazeNotificationUtils.cancelNotification$lambda$0(i2);
                return cancelNotification$lambda$0;
            case 12:
                handleCancelNotificationAction$lambda$0 = BrazeNotificationUtils.handleCancelNotificationAction$lambda$0(i2);
                return handleCancelNotificationAction$lambda$0;
            case 13:
                handlePushNotificationPayload$lambda$1 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$1(i2);
                return handlePushNotificationPayload$lambda$1;
            case 14:
                _set_logLevel_$lambda$0 = BrazeLogger._set_logLevel_$lambda$0(i2);
                return _set_logLevel_$lambda$0;
            case 15:
                wouldPushPermissionPromptDisplay$lambda$2 = PermissionUtils.wouldPushPermissionPromptDisplay$lambda$2(i2);
                return wouldPushPermissionPromptDisplay$lambda$2;
            case 16:
                wouldPushPermissionPromptDisplay$lambda$4 = PermissionUtils.wouldPushPermissionPromptDisplay$lambda$4(i2);
                return wouldPushPermissionPromptDisplay$lambda$4;
            case 17:
                isValidLogPurchaseInput$lambda$5 = ValidationUtils.isValidLogPurchaseInput$lambda$5(i2);
                return isValidLogPurchaseInput$lambda$5;
            case 18:
                isValidLogPurchaseInput$lambda$6 = ValidationUtils.isValidLogPurchaseInput$lambda$6(i2);
                return isValidLogPurchaseInput$lambda$6;
            case 19:
                return com.braze.support.g.a(i2);
            case 20:
                onViewAttachedToWindow$lambda$0 = ContentCardAdapter.onViewAttachedToWindow$lambda$0(i2);
                return onViewAttachedToWindow$lambda$0;
            case 21:
                onViewDetachedFromWindow$lambda$0 = ContentCardAdapter.onViewDetachedFromWindow$lambda$0(i2);
                return onViewDetachedFromWindow$lambda$0;
            case 22:
                open$lambda$1 = DefaultInAppMessageViewWrapper.open$lambda$1(i2);
                return open$lambda$1;
            case 23:
                addInAppMessageViewToViewGroup$lambda$1 = DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$1(i2);
                return addInAppMessageViewToViewGroup$lambda$1;
            case 24:
                _get_messageWebView_$lambda$2 = InAppMessageHtmlBaseView._get_messageWebView_$lambda$2(i2);
                return _get_messageWebView_$lambda$2;
            case 25:
                str = InAppMessageImmersiveBaseView.setupDirectionalNavigation$lambda$1(i2);
                return str;
            case 26:
                return new TimelineState(CollectionsKt__CollectionsJVMKt.listOf(new TimelineState.CollapseRange(null, new IntRange(i2, Integer.MAX_VALUE, 1))));
            case 27:
                return new ParcelableSnapshotMutableIntState(i2);
            default:
                return Integer.valueOf(i2);
        }
    }
}
