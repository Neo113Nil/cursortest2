package com.braze.ui.inappmessage.views;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import bo.app.re$$ExternalSyntheticOutline0;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeWebViewActivity$createWebChromeClient$1$$ExternalSyntheticLambda0;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J,\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"com/braze/ui/inappmessage/views/InAppMessageHtmlBaseView$messageWebView$6", "Landroid/webkit/WebChromeClient;", "onConsoleMessage", "", "cm", "Landroid/webkit/ConsoleMessage;", "onCreateWindow", "view", "Landroid/webkit/WebView;", "isDialog", "isUserGesture", "resultMsg", "Landroid/os/Message;", "getDefaultVideoPoster", "Landroid/graphics/Bitmap;", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InAppMessageHtmlBaseView$messageWebView$6 extends WebChromeClient {
    final /* synthetic */ boolean $isLinkTargetSupported;
    final /* synthetic */ InAppMessageHtmlBaseView this$0;

    public InAppMessageHtmlBaseView$messageWebView$6(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, boolean z) {
        this.this$0 = inAppMessageHtmlBaseView;
        this.$isLinkTargetSupported = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onConsoleMessage$lambda$0(ConsoleMessage consoleMessage) {
        int lineNumber = consoleMessage.lineNumber();
        String sourceId = consoleMessage.sourceId();
        ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
        String message = consoleMessage.message();
        StringBuilder m = re$$ExternalSyntheticOutline0.m("Braze HTML In-app Message log. Line: ", lineNumber, ". SourceId: ", sourceId, ". Log Level: ");
        m.append(messageLevel);
        m.append(". Message: ");
        m.append(message);
        return m.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreateWindow$lambda$1() {
        return "linkTargetSupport not enabled, passing to super.onCreateWindow()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreateWindow$lambda$2() {
        return "onCreateWindow webView is null, not opening link";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreateWindow$lambda$3(WebView.HitTestResult hitTestResult) {
        return "onCreateWindow HitTestResult is " + hitTestResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreateWindow$lambda$4(WebView.HitTestResult hitTestResult) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(hitTestResult.getType(), "onCreateWindow: hitTestResult type was ", ". Not doing anything.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreateWindow$lambda$5(WebView.HitTestResult hitTestResult) {
        return "Failed to open link in new window. " + hitTestResult;
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage cm) {
        cm.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeWebViewActivity$createWebChromeClient$1$$ExternalSyntheticLambda0(cm, 1), 7, (Object) null);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
        if (!this.$isLinkTargetSupported) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new ViewUtils$$ExternalSyntheticLambda0(3), 6, (Object) null);
            return super.onCreateWindow(view, isDialog, isUserGesture, resultMsg);
        }
        int i = 4;
        final int i2 = 0;
        if (view == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new ViewUtils$$ExternalSyntheticLambda0(i), 6, (Object) null);
            return false;
        }
        final WebView.HitTestResult hitTestResult = view.getHitTestResult();
        hitTestResult.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$6$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onCreateWindow$lambda$3;
                String onCreateWindow$lambda$4;
                String onCreateWindow$lambda$5;
                int i3 = i2;
                WebView.HitTestResult hitTestResult2 = hitTestResult;
                switch (i3) {
                    case 0:
                        onCreateWindow$lambda$3 = InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$3(hitTestResult2);
                        return onCreateWindow$lambda$3;
                    case 1:
                        onCreateWindow$lambda$4 = InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$4(hitTestResult2);
                        return onCreateWindow$lambda$4;
                    default:
                        onCreateWindow$lambda$5 = InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$5(hitTestResult2);
                        return onCreateWindow$lambda$5;
                }
            }
        }, 6, (Object) null);
        final int i3 = 2;
        try {
            int type2 = hitTestResult.getType();
            if (type2 == 2) {
                this.this$0.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("tel:" + hitTestResult.getExtra())));
                return false;
            }
            if (type2 == 4) {
                this.this$0.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mailto:" + hitTestResult.getExtra())));
                return false;
            }
            if (type2 != 7) {
                final int i4 = 1;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$6$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String onCreateWindow$lambda$3;
                        String onCreateWindow$lambda$4;
                        String onCreateWindow$lambda$5;
                        int i32 = i4;
                        WebView.HitTestResult hitTestResult2 = hitTestResult;
                        switch (i32) {
                            case 0:
                                onCreateWindow$lambda$3 = InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$3(hitTestResult2);
                                return onCreateWindow$lambda$3;
                            case 1:
                                onCreateWindow$lambda$4 = InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$4(hitTestResult2);
                                return onCreateWindow$lambda$4;
                            default:
                                onCreateWindow$lambda$5 = InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$5(hitTestResult2);
                                return onCreateWindow$lambda$5;
                        }
                    }
                }, 6, (Object) null);
                return false;
            }
            String extra = hitTestResult.getExtra();
            this.this$0.getContext().startActivity(new Intent("android.intent.action.VIEW", extra != null ? Uri.parse(extra) : null));
            return false;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$6$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onCreateWindow$lambda$3;
                    String onCreateWindow$lambda$4;
                    String onCreateWindow$lambda$5;
                    int i32 = i3;
                    WebView.HitTestResult hitTestResult2 = hitTestResult;
                    switch (i32) {
                        case 0:
                            onCreateWindow$lambda$3 = InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$3(hitTestResult2);
                            return onCreateWindow$lambda$3;
                        case 1:
                            onCreateWindow$lambda$4 = InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$4(hitTestResult2);
                            return onCreateWindow$lambda$4;
                        default:
                            onCreateWindow$lambda$5 = InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$5(hitTestResult2);
                            return onCreateWindow$lambda$5;
                    }
                }
            }, 4, (Object) null);
            return false;
        }
    }
}
