package com.braze.ui.inappmessage.factories;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.braze.BrazeInternal;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$layout;
import com.braze.ui.inappmessage.IInAppMessageViewFactory;
import com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.utils.InAppMessageWebViewClient;
import com.braze.ui.inappmessage.views.InAppMessageFullView$$ExternalSyntheticLambda1;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlView;
import com.braze.ui.support.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/braze/ui/inappmessage/factories/DefaultInAppMessageHtmlViewFactory;", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "inAppMessageWebViewClientListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "<init>", "(Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;)V", "createInAppMessageView", "Lcom/braze/ui/inappmessage/views/InAppMessageHtmlView;", "activity", "Landroid/app/Activity;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public class DefaultInAppMessageHtmlViewFactory implements IInAppMessageViewFactory {
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;

    public DefaultInAppMessageHtmlViewFactory(IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener) {
        iInAppMessageWebViewClientListener.getClass();
        this.inAppMessageWebViewClientListener = iInAppMessageWebViewClientListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createInAppMessageView$lambda$0() {
        return "The device is not currently in touch mode. This message requires user touch interaction to display properly. Please set setIsTouchModeRequiredForHtmlInAppMessages to false to change this behavior.";
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewFactory
    public InAppMessageHtmlView createInAppMessageView(Activity activity, IInAppMessage inAppMessage) {
        activity.getClass();
        inAppMessage.getClass();
        Context applicationContext = activity.getApplicationContext();
        View inflate = activity.getLayoutInflater().inflate(R$layout.com_braze_inappmessage_html, (ViewGroup) null);
        inflate.getClass();
        InAppMessageHtmlView inAppMessageHtmlView = (InAppMessageHtmlView) inflate;
        BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
        applicationContext.getClass();
        if (brazeInternal.getConfigurationProvider(applicationContext).isTouchModeRequiredForHtmlInAppMessages() && ViewUtils.isDeviceNotInTouchMode(inAppMessageHtmlView)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(5), 6, (Object) null);
            return null;
        }
        InAppMessageHtml inAppMessageHtml = (InAppMessageHtml) inAppMessage;
        InAppMessageJavascriptInterface inAppMessageJavascriptInterface = new InAppMessageJavascriptInterface(applicationContext, inAppMessageHtml);
        InAppMessageHtmlBaseView.setWebViewContent$default(inAppMessageHtmlView, inAppMessageHtml.getMessage(), null, 2, null);
        Context applicationContext2 = activity.getApplicationContext();
        applicationContext2.getClass();
        inAppMessageHtmlView.setInAppMessageWebViewClient(new InAppMessageWebViewClient(applicationContext2, inAppMessageHtml, this.inAppMessageWebViewClientListener, null, 8, null));
        WebView messageWebView = inAppMessageHtmlView.getMessageWebView();
        if (messageWebView != null) {
            messageWebView.addJavascriptInterface(inAppMessageJavascriptInterface, "brazeInternalBridge");
        }
        inAppMessageHtmlView.setupDirectionalNavigation();
        return inAppMessageHtmlView;
    }
}
