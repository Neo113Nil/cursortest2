package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.core.view.WindowInsetsCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.jg$$ExternalSyntheticLambda1;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.inappmessage.utils.InAppMessageWebViewClient;
import com.braze.ui.support.ViewUtils;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda0;
import com.braze.ui.support.WebViewUtilsKt;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u001e\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH\u0017J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0018\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020'H&J\u0010\u0010+\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.H\u0016J\u0006\u0010/\u001a\u00020\u001cR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u00061"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;", "Landroid/widget/RelativeLayout;", "Lcom/braze/ui/inappmessage/views/IInAppMessageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "configuredMessageWebView", "Landroid/webkit/WebView;", "inAppMessageWebViewClient", "Lcom/braze/ui/inappmessage/utils/InAppMessageWebViewClient;", "isFinished", "", "hasAppliedWindowInsets", "getHasAppliedWindowInsets", "()Z", "setHasAppliedWindowInsets", "(Z)V", "messageClickableView", "Landroid/view/View;", "getMessageClickableView", "()Landroid/view/View;", "messageWebView", "getMessageWebView", "()Landroid/webkit/WebView;", "finishWebViewDisplay", "", "setWebViewContent", "htmlBody", "", "assetDirectoryUrl", "setInAppMessageWebViewClient", "setHtmlPageFinishedListener", "listener", "Lcom/braze/ui/inappmessage/listeners/IWebViewClientStateListener;", "onKeyDown", "keyCode", "", BreadcrumbHelper.Category.EVENT, "Landroid/view/KeyEvent;", "getWebViewViewId", "dispatchKeyEvent", "applyWindowInsets", "insets", "Landroidx/core/view/WindowInsetsCompat;", "setupDirectionalNavigation", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class InAppMessageHtmlBaseView extends RelativeLayout implements IInAppMessageView {
    private WebView configuredMessageWebView;
    private boolean hasAppliedWindowInsets;
    private InAppMessageWebViewClient inAppMessageWebViewClient;
    private boolean isFinished;

    public InAppMessageHtmlBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_messageWebView_$lambda$0() {
        return "Cannot return the WebView for an already finished message";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_messageWebView_$lambda$1() {
        return "Cannot find WebView. getWebViewViewId() returned 0.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_messageWebView_$lambda$2(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "findViewById for ", " returned null. Returning null for WebView.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_messageWebView_$lambda$3() {
        return "HtmlInAppMessageHtmlLinkTarget enabled";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_messageWebView_$lambda$4() {
        return "HtmlInAppMessageHtmlLinkTarget not enabled";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String finishWebViewDisplay$lambda$0() {
        return "Finishing WebView display";
    }

    public static /* synthetic */ void setWebViewContent$default(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, String str, String str2, int i, Object obj) {
        if (obj != null) {
            a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: setWebViewContent");
            return;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        inAppMessageHtmlBaseView.setWebViewContent(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setWebViewContent$lambda$0() {
        return "Cannot load WebView. htmlBody was null.";
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(WindowInsetsCompat insets) {
        insets.getClass();
        setHasAppliedWindowInsets(true);
        Context context = getContext();
        context.getClass();
        if (new BrazeConfigurationProvider(context).isHtmlInAppMessageApplyWindowInsetsEnabled() && getLayoutParams() != null && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(insets) + marginLayoutParams.leftMargin, ViewUtils.getMaxSafeTopInset(insets) + marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(insets) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(insets) + marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        event.getClass();
        if (!InAppMessageViewUtils.isApiBelowBaklava() || isInTouchMode() || event.getKeyCode() != 4 || !BrazeInAppMessageManager.INSTANCE.getInstance().getDoesBackButtonDismissInAppMessageViewField()) {
            return super.dispatchKeyEvent(event);
        }
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        return true;
    }

    public void finishWebViewDisplay() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ViewUtils$$ExternalSyntheticLambda0(2), 7, (Object) null);
        this.isFinished = true;
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            webView.loadUrl("about:blank");
            webView.onPause();
            webView.removeAllViews();
            this.configuredMessageWebView = null;
        }
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public boolean getHasAppliedWindowInsets() {
        return this.hasAppliedWindowInsets;
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public View getMessageClickableView() {
        return this;
    }

    public WebView getMessageWebView() {
        if (this.isFinished) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(26), 6, (Object) null);
            return null;
        }
        int webViewViewId = getWebViewViewId();
        if (webViewViewId == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(27), 7, (Object) null);
            return null;
        }
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            return webView;
        }
        WebView webView2 = (WebView) findViewById(webViewViewId);
        if (webView2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(webViewViewId, 24), 7, (Object) null);
            return null;
        }
        WebSettings settings = webView2.getSettings();
        settings.getClass();
        Context context = getContext();
        context.getClass();
        WebViewUtilsKt.setWebViewSettings(settings, context);
        webView2.setLayerType(2, null);
        webView2.setBackgroundColor(0);
        Context context2 = getContext();
        context2.getClass();
        boolean isHtmlInAppMessageHtmlLinkTargetEnabled = new BrazeConfigurationProvider(context2).isHtmlInAppMessageHtmlLinkTargetEnabled();
        if (isHtmlInAppMessageHtmlLinkTargetEnabled) {
            webView2.getSettings().setSupportMultipleWindows(true);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(28), 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(29), 6, (Object) null);
        }
        webView2.setWebChromeClient(new InAppMessageHtmlBaseView$messageWebView$6(this, isHtmlInAppMessageHtmlLinkTargetEnabled));
        this.configuredMessageWebView = webView2;
        return webView2;
    }

    public abstract int getWebViewViewId();

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        event.getClass();
        if (InAppMessageViewUtils.isApiBelowBaklava() && keyCode == 4 && BrazeInAppMessageManager.INSTANCE.getInstance().getDoesBackButtonDismissInAppMessageViewField()) {
            InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
            return true;
        }
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            ViewUtils.setFocusableInTouchModeAndRequestFocus(webView);
        }
        return super.onKeyDown(keyCode, event);
    }

    public void setHasAppliedWindowInsets(boolean z) {
        this.hasAppliedWindowInsets = z;
    }

    public void setHtmlPageFinishedListener(IWebViewClientStateListener listener) {
        InAppMessageWebViewClient inAppMessageWebViewClient = this.inAppMessageWebViewClient;
        if (inAppMessageWebViewClient != null) {
            inAppMessageWebViewClient.setWebViewClientStateListener(listener);
        }
    }

    public void setInAppMessageWebViewClient(InAppMessageWebViewClient inAppMessageWebViewClient) {
        inAppMessageWebViewClient.getClass();
        WebView messageWebView = getMessageWebView();
        if (messageWebView != null) {
            messageWebView.setWebViewClient(inAppMessageWebViewClient);
        }
        this.inAppMessageWebViewClient = inAppMessageWebViewClient;
    }

    public void setWebViewContent(String htmlBody, String assetDirectoryUrl) {
        if (htmlBody == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ViewUtils$$ExternalSyntheticLambda0(1), 7, (Object) null);
            return;
        }
        WebView messageWebView = getMessageWebView();
        if (messageWebView != null) {
            messageWebView.loadDataWithBaseURL("https://iamcache.braze/", htmlBody, "text/html", "utf-8", null);
        }
    }

    public final void setupDirectionalNavigation() {
        WebView messageWebView = getMessageWebView();
        if (messageWebView == null) {
            return;
        }
        messageWebView.setNextFocusDownId(messageWebView.getId());
        messageWebView.setNextFocusLeftId(messageWebView.getId());
        messageWebView.setNextFocusRightId(messageWebView.getId());
        messageWebView.setNextFocusUpId(messageWebView.getId());
        messageWebView.requestFocus();
        messageWebView.setFocusedByDefault(true);
        messageWebView.post(new InAppMessageHtmlBaseView$$ExternalSyntheticLambda0(messageWebView));
    }

    public final void setWebViewContent(String str) {
        setWebViewContent$default(this, str, null, 2, null);
    }
}
