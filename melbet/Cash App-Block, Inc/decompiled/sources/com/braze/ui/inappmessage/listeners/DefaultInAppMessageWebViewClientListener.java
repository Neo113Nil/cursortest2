package com.braze.ui.inappmessage.listeners;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.zf$$ExternalSyntheticLambda10;
import com.braze.Braze;
import com.braze.enums.Channel;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.actions.UriAction;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.views.InAppMessageFullView$$ExternalSyntheticLambda1;
import com.braze.ui.support.UriUtils$$ExternalSyntheticLambda2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/DefaultInAppMessageWebViewClientListener;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "<init>", "()V", "inAppMessageManager", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "getInAppMessageManager", "()Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "onCloseAction", "", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "url", "", "queryBundle", "Landroid/os/Bundle;", "onCustomEventAction", "onOtherUrlAction", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public class DefaultInAppMessageWebViewClientListener implements IInAppMessageWebViewClientListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    private final BrazeInAppMessageManager getInAppMessageManager() {
        return BrazeInAppMessageManager.INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCloseAction$lambda$0() {
        return "IInAppMessageWebViewClientListener.onCloseAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCloseAction$lambda$1() {
        return "IInAppMessageWebViewClientListener.onCloseAction finished.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCustomEventAction$lambda$0() {
        return "IInAppMessageWebViewClientListener.onCustomEventAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCustomEventAction$lambda$1() {
        return "Can't perform custom event action because the activity is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$0() {
        return "IInAppMessageWebViewClientListener.onOtherUrlAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$1(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Can't perform other url action because the cached activity is null. Url: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$2(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("HTML message action listener handled url in onOtherUrlAction. Doing nothing further. Url: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$3(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("UriAction is null. Not passing any URI to BrazeDeeplinkHandler. Url: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$4(Uri uri, String str) {
        return "Not passing local uri to BrazeDeeplinkHandler. Got local uri: " + uri + " for url: " + str;
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onCloseAction(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        inAppMessage.getClass();
        url.getClass();
        queryBundle.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(19), 7, (Object) null);
        INSTANCE.logHtmlInAppMessageClick(inAppMessage, queryBundle);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(true);
        getInAppMessageManager().getHtmlInAppMessageActionListener().onCloseClicked(inAppMessage, url, queryBundle);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(20), 7, (Object) null);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onCustomEventAction(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        BrazeWebViewClient.Companion companion;
        String parseCustomEventNameFromQueryBundle;
        inAppMessage.getClass();
        url.getClass();
        queryBundle.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(21), 7, (Object) null);
        if (getInAppMessageManager().getActivity() == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(22), 6, (Object) null);
            return;
        }
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onCustomEventFired(inAppMessage, url, queryBundle) || (parseCustomEventNameFromQueryBundle = (companion = BrazeWebViewClient.INSTANCE).parseCustomEventNameFromQueryBundle(queryBundle)) == null || StringsKt.isBlank(parseCustomEventNameFromQueryBundle)) {
            return;
        }
        BrazeProperties parsePropertiesFromQueryBundle = companion.parsePropertiesFromQueryBundle(queryBundle);
        Activity activity = getInAppMessageManager().getActivity();
        if (activity != null) {
            Braze.INSTANCE.getInstance(activity).logCustomEvent(parseCustomEventNameFromQueryBundle, parsePropertiesFromQueryBundle);
        }
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onOtherUrlAction(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        inAppMessage.getClass();
        url.getClass();
        queryBundle.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(18), 7, (Object) null);
        if (getInAppMessageManager().getActivity() == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(url, 19), 6, (Object) null);
            return;
        }
        Companion companion = INSTANCE;
        companion.logHtmlInAppMessageClick(inAppMessage, queryBundle);
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onOtherUrlAction(inAppMessage, url, queryBundle)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(url, 20), 6, (Object) null);
            return;
        }
        boolean parseUseWebViewFromQueryBundle = companion.parseUseWebViewFromQueryBundle(inAppMessage, queryBundle);
        Bundle bundle = BundleUtils.toBundle(inAppMessage.getExtras());
        bundle.putAll(queryBundle);
        BrazeDeeplinkHandler.Companion companion2 = BrazeDeeplinkHandler.INSTANCE;
        UriAction createUriActionFromUrlString = companion2.getInstance().createUriActionFromUrlString(url, bundle, parseUseWebViewFromQueryBundle, Channel.INAPP_MESSAGE);
        if (createUriActionFromUrlString == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(url, 21), 6, (Object) null);
            return;
        }
        Uri uri = createUriActionFromUrlString.getUri();
        if (BrazeFileUtils.isLocalUri(uri)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zf$$ExternalSyntheticLambda10(uri, url, 1), 6, (Object) null);
            return;
        }
        inAppMessage.setAnimateOut(false);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
        Activity activity = getInAppMessageManager().getActivity();
        if (activity != null) {
            companion2.getInstance().gotoUri(activity, createUriActionFromUrlString);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\f"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/DefaultInAppMessageWebViewClientListener$Companion;", "", "<init>", "()V", "parseUseWebViewFromQueryBundle", "", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "queryBundle", "Landroid/os/Bundle;", "logHtmlInAppMessageClick", "", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void logHtmlInAppMessageClick(IInAppMessage inAppMessage, Bundle queryBundle) {
            inAppMessage.getClass();
            queryBundle.getClass();
            if (!queryBundle.containsKey("abButtonId")) {
                if (inAppMessage.getMessageType() == MessageType.HTML_FULL) {
                    inAppMessage.logClick();
                }
            } else {
                IInAppMessageHtml iInAppMessageHtml = (IInAppMessageHtml) inAppMessage;
                String string2 = queryBundle.getString("abButtonId");
                if (string2 != null) {
                    iInAppMessageHtml.logButtonClick(string2);
                }
            }
        }

        public final boolean parseUseWebViewFromQueryBundle(IInAppMessage inAppMessage, Bundle queryBundle) {
            boolean z;
            boolean z2;
            boolean z3;
            inAppMessage.getClass();
            queryBundle.getClass();
            if (queryBundle.containsKey("abDeepLink")) {
                z = Boolean.parseBoolean(queryBundle.getString("abDeepLink"));
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
            if (queryBundle.containsKey("abExternalOpen")) {
                z3 = Boolean.parseBoolean(queryBundle.getString("abExternalOpen"));
                z2 = true;
            } else {
                z3 = false;
            }
            return z2 ? (z || z3) ? false : true : inAppMessage.getOpenUriInWebView();
        }

        private Companion() {
        }
    }
}
