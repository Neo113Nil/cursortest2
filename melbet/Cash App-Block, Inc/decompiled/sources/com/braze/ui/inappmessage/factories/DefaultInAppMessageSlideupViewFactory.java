package com.braze.ui.inappmessage.factories;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.braze.Braze;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$layout;
import com.braze.ui.inappmessage.IInAppMessageViewFactory;
import com.braze.ui.inappmessage.views.InAppMessageBaseView;
import com.braze.ui.inappmessage.views.InAppMessageFullView$$ExternalSyntheticLambda1;
import com.braze.ui.inappmessage.views.InAppMessageSlideupView;
import com.braze.ui.support.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/braze/ui/inappmessage/factories/DefaultInAppMessageSlideupViewFactory;", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "<init>", "()V", "createInAppMessageView", "Lcom/braze/ui/inappmessage/views/InAppMessageSlideupView;", "activity", "Landroid/app/Activity;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public class DefaultInAppMessageSlideupViewFactory implements IInAppMessageViewFactory {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String createInAppMessageView$lambda$0() {
        return "The device is not currently in touch mode. This message requires user touch interaction to display properly.";
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewFactory
    public InAppMessageSlideupView createInAppMessageView(Activity activity, IInAppMessage inAppMessage) {
        activity.getClass();
        inAppMessage.getClass();
        View inflate = activity.getLayoutInflater().inflate(R$layout.com_braze_inappmessage_slideup, (ViewGroup) null);
        inflate.getClass();
        InAppMessageSlideupView inAppMessageSlideupView = (InAppMessageSlideupView) inflate;
        if (ViewUtils.isDeviceNotInTouchMode(inAppMessageSlideupView)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(7), 6, (Object) null);
            return null;
        }
        InAppMessageSlideup inAppMessageSlideup = (InAppMessageSlideup) inAppMessage;
        Context applicationContext = activity.getApplicationContext();
        inAppMessageSlideupView.applyInAppMessageParameters(inAppMessage);
        String appropriateImageUrl = InAppMessageBaseView.INSTANCE.getAppropriateImageUrl(inAppMessageSlideup);
        if (appropriateImageUrl != null && appropriateImageUrl.length() != 0) {
            Braze.Companion companion = Braze.INSTANCE;
            applicationContext.getClass();
            IBrazeImageLoader imageLoader = companion.getInstance(applicationContext).getImageLoader();
            ImageView messageImageView = inAppMessageSlideupView.getMessageImageView();
            if (messageImageView != null) {
                imageLoader.renderUrlIntoInAppMessageView(applicationContext, inAppMessage, appropriateImageUrl, messageImageView, BrazeViewBounds.IN_APP_MESSAGE_SLIDEUP);
            }
        }
        inAppMessageSlideupView.setMessageBackgroundColor(inAppMessageSlideup.getBackgroundColor());
        String message = inAppMessageSlideup.getMessage();
        if (message != null) {
            inAppMessageSlideupView.setMessage(message);
        }
        inAppMessageSlideupView.setMessageTextColor(inAppMessageSlideup.getMessageTextColor());
        inAppMessageSlideupView.setMessageTextAlign(inAppMessageSlideup.getMessageTextAlign());
        String icon = inAppMessageSlideup.getIcon();
        if (icon != null) {
            inAppMessageSlideupView.setMessageIcon(icon, inAppMessageSlideup.getIconColor(), inAppMessageSlideup.getIconBackgroundColor());
        }
        inAppMessageSlideupView.setMessageChevron(inAppMessageSlideup.getChevronColor(), inAppMessageSlideup.getInternalClickAction());
        inAppMessageSlideupView.resetMessageMargins(inAppMessageSlideup.getImageDownloadSuccessful());
        return inAppMessageSlideupView;
    }
}
