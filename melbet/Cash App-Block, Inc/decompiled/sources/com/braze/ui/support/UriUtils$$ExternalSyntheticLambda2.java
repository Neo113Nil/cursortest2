package com.braze.ui.support;

import androidx.compose.runtime.Updater;
import com.braze.ui.JavascriptInterfaceBase;
import com.braze.ui.UserJavascriptInterfaceBase;
import com.braze.ui.actions.UriAction;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer;
import com.braze.ui.inappmessage.views.InAppMessageBaseView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class UriUtils$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ UriUtils$$ExternalSyntheticLambda2(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String isActivityRegisteredInManifest$lambda$0;
        String parseProperties$lambda$0;
        String logPurchaseWithJSON$lambda$0;
        String logPurchaseWithJSON$lambda$1;
        String emailNotificationSubscriptionType$lambda$0;
        String dateOfBirth$lambda$2;
        String customLocationAttribute$lambda$0;
        String customLocationAttribute$lambda$1;
        String incrementCustomUserAttribute$lambda$0;
        String gender$lambda$0;
        String customUserAttributeArray$lambda$0;
        String pushNotificationSubscriptionType$lambda$0;
        String dateOfBirth$lambda$0;
        String dateOfBirth$lambda$1;
        String intentArrayWithConfiguredBackStack$lambda$1;
        String intentArrayWithConfiguredBackStack$lambda$3;
        String webViewActivityIntent$lambda$0;
        String brazeActionVersionAndJson$lambda$1;
        String execute$lambda$2;
        String onOtherUrlAction$lambda$1;
        String onOtherUrlAction$lambda$2;
        String onOtherUrlAction$lambda$3;
        String prepareInAppMessageWithBitmapDownload$lambda$3;
        String handleLocalImage$lambda$0;
        String handleLocalImage$lambda$1;
        String prepareInAppMessageWithZippedAssetHtml$lambda$0;
        String prepareInAppMessageWithZippedAssetHtml$lambda$3;
        String appropriateImageUrl$lambda$0;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                isActivityRegisteredInManifest$lambda$0 = UriUtils.isActivityRegisteredInManifest$lambda$0(str);
                return isActivityRegisteredInManifest$lambda$0;
            case 1:
                parseProperties$lambda$0 = JavascriptInterfaceBase.parseProperties$lambda$0(str);
                return parseProperties$lambda$0;
            case 2:
                logPurchaseWithJSON$lambda$0 = JavascriptInterfaceBase.logPurchaseWithJSON$lambda$0(str);
                return logPurchaseWithJSON$lambda$0;
            case 3:
                logPurchaseWithJSON$lambda$1 = JavascriptInterfaceBase.logPurchaseWithJSON$lambda$1(str);
                return logPurchaseWithJSON$lambda$1;
            case 4:
                emailNotificationSubscriptionType$lambda$0 = UserJavascriptInterfaceBase.setEmailNotificationSubscriptionType$lambda$0(str);
                return emailNotificationSubscriptionType$lambda$0;
            case 5:
                dateOfBirth$lambda$2 = UserJavascriptInterfaceBase.setDateOfBirth$lambda$2(str);
                return dateOfBirth$lambda$2;
            case 6:
                customLocationAttribute$lambda$0 = UserJavascriptInterfaceBase.setCustomLocationAttribute$lambda$0(str);
                return customLocationAttribute$lambda$0;
            case 7:
                customLocationAttribute$lambda$1 = UserJavascriptInterfaceBase.setCustomLocationAttribute$lambda$1(str);
                return customLocationAttribute$lambda$1;
            case 8:
                incrementCustomUserAttribute$lambda$0 = UserJavascriptInterfaceBase.incrementCustomUserAttribute$lambda$0(str);
                return incrementCustomUserAttribute$lambda$0;
            case 9:
                gender$lambda$0 = UserJavascriptInterfaceBase.setGender$lambda$0(str);
                return gender$lambda$0;
            case 10:
                customUserAttributeArray$lambda$0 = UserJavascriptInterfaceBase.setCustomUserAttributeArray$lambda$0(str);
                return customUserAttributeArray$lambda$0;
            case 11:
                pushNotificationSubscriptionType$lambda$0 = UserJavascriptInterfaceBase.setPushNotificationSubscriptionType$lambda$0(str);
                return pushNotificationSubscriptionType$lambda$0;
            case 12:
                dateOfBirth$lambda$0 = UserJavascriptInterfaceBase.setDateOfBirth$lambda$0(str);
                return dateOfBirth$lambda$0;
            case 13:
                dateOfBirth$lambda$1 = UserJavascriptInterfaceBase.setDateOfBirth$lambda$1(str);
                return dateOfBirth$lambda$1;
            case 14:
                intentArrayWithConfiguredBackStack$lambda$1 = UriAction.getIntentArrayWithConfiguredBackStack$lambda$1(str);
                return intentArrayWithConfiguredBackStack$lambda$1;
            case 15:
                intentArrayWithConfiguredBackStack$lambda$3 = UriAction.getIntentArrayWithConfiguredBackStack$lambda$3(str);
                return intentArrayWithConfiguredBackStack$lambda$3;
            case 16:
                webViewActivityIntent$lambda$0 = UriAction.getWebViewActivityIntent$lambda$0(str);
                return webViewActivityIntent$lambda$0;
            case 17:
                brazeActionVersionAndJson$lambda$1 = BrazeActionParser.getBrazeActionVersionAndJson$lambda$1(str);
                return brazeActionVersionAndJson$lambda$1;
            case 18:
                execute$lambda$2 = BrazeActionParser.execute$lambda$2(str);
                return execute$lambda$2;
            case 19:
                onOtherUrlAction$lambda$1 = DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$1(str);
                return onOtherUrlAction$lambda$1;
            case 20:
                onOtherUrlAction$lambda$2 = DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$2(str);
                return onOtherUrlAction$lambda$2;
            case 21:
                onOtherUrlAction$lambda$3 = DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$3(str);
                return onOtherUrlAction$lambda$3;
            case 22:
                prepareInAppMessageWithBitmapDownload$lambda$3 = BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload$lambda$3(str);
                return prepareInAppMessageWithBitmapDownload$lambda$3;
            case 23:
                handleLocalImage$lambda$0 = BackgroundInAppMessagePreparer.handleLocalImage$lambda$0(str);
                return handleLocalImage$lambda$0;
            case 24:
                handleLocalImage$lambda$1 = BackgroundInAppMessagePreparer.handleLocalImage$lambda$1(str);
                return handleLocalImage$lambda$1;
            case 25:
                prepareInAppMessageWithZippedAssetHtml$lambda$0 = BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml$lambda$0(str);
                return prepareInAppMessageWithZippedAssetHtml$lambda$0;
            case 26:
                prepareInAppMessageWithZippedAssetHtml$lambda$3 = BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml$lambda$3(str);
                return prepareInAppMessageWithZippedAssetHtml$lambda$3;
            case 27:
                appropriateImageUrl$lambda$0 = InAppMessageBaseView.Companion.getAppropriateImageUrl$lambda$0(str);
                return appropriateImageUrl$lambda$0;
            case 28:
                return Updater.mutableStateOf$default(str);
            default:
                return Updater.mutableStateOf$default(Boolean.valueOf(str != null));
        }
    }
}
