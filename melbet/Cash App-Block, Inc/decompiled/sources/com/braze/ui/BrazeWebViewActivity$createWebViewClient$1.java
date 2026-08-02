package com.braze.ui;

import android.content.Context;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.braze.enums.Channel;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.b$$ExternalSyntheticLambda1;
import com.braze.support.c$$ExternalSyntheticLambda2;
import com.braze.ui.actions.UriAction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0017J\u001f\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"com/braze/ui/BrazeWebViewActivity$createWebViewClient$1", "Landroid/webkit/WebViewClient;", "shouldOverrideUrlLoading", "", "view", "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "url", "", "handleUrlOverride", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Boolean;", "onRenderProcessGone", "detail", "Landroid/webkit/RenderProcessGoneDetail;", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BrazeWebViewActivity$createWebViewClient$1 extends WebViewClient {
    final /* synthetic */ BrazeWebViewActivity this$0;

    public BrazeWebViewActivity$createWebViewClient$1(BrazeWebViewActivity brazeWebViewActivity) {
        this.this$0 = brazeWebViewActivity;
    }

    private final Boolean handleUrlOverride(Context context, String url) {
        try {
            if (CollectionsKt.contains(BrazeFileUtils.REMOTE_SCHEMES, Uri.parse(url).getScheme())) {
                return null;
            }
            UriAction createUriActionFromUrlString = BrazeDeeplinkHandler.INSTANCE.getInstance().createUriActionFromUrlString(url, this.this$0.getIntent().getExtras(), false, Channel.UNKNOWN);
            if (createUriActionFromUrlString == null) {
                return Boolean.FALSE;
            }
            createUriActionFromUrlString.execute(context);
            this.this$0.finish();
            return Boolean.TRUE;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new b$$ExternalSyntheticLambda1(url, 28), 4, (Object) null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleUrlOverride$lambda$0(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unexpected exception while processing url ", str, ". Passing url back to WebView.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onRenderProcessGone$lambda$1() {
        return "The webview rendering process crashed, returning true";
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        view.getClass();
        detail.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new c$$ExternalSyntheticLambda2(11), 6, (Object) null);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        view.getClass();
        request.getClass();
        Context context = view.getContext();
        context.getClass();
        String uri = request.getUrl().toString();
        uri.getClass();
        Boolean handleUrlOverride = handleUrlOverride(context, uri);
        return handleUrlOverride != null ? handleUrlOverride.booleanValue() : super.shouldOverrideUrlLoading(view, request);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.getClass();
        url.getClass();
        Context context = view.getContext();
        context.getClass();
        Boolean handleUrlOverride = handleUrlOverride(context, url);
        return handleUrlOverride != null ? handleUrlOverride.booleanValue() : super.shouldOverrideUrlLoading(view, url);
    }
}
