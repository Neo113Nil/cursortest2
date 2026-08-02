package com.braze.ui;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.core.util.Pair;
import androidx.webkit.WebViewAssetLoader;
import androidx.webkit.internal.AssetHelper;
import bo.app.yf$$ExternalSyntheticLambda2;
import com.braze.BrazeInternal;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.b$$ExternalSyntheticLambda1;
import com.braze.support.c$$ExternalSyntheticLambda2;
import com.braze.ui.actions.UriAction$$ExternalSyntheticLambda4;
import com.braze.ui.banners.listeners.IBannerWebViewClientListener;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.braze.ui.support.UriUtils;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;
import okhttp3.internal.Tags;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 K2\u00020\u0001:\u0002LKBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010(\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\fH\u0017¢\u0006\u0004\b(\u0010*J\u0017\u0010-\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u00108R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00109R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lcom/braze/ui/BrazeWebViewClient;", "Landroid/webkit/WebViewClient;", "Landroid/content/Context;", "context", "Lcom/braze/ui/BrazeWebViewClient$Type;", "type", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "inAppMessageWebViewClientListener", "Lcom/braze/ui/banners/listeners/IBannerWebViewClientListener;", "bannerWebViewClientListener", "", "assetDirectoryUrl", "<init>", "(Landroid/content/Context;Lcom/braze/ui/BrazeWebViewClient$Type;Lcom/braze/models/inappmessage/IInAppMessage;Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;Lcom/braze/ui/banners/listeners/IBannerWebViewClientListener;Ljava/lang/String;)V", "Landroid/webkit/WebView;", "view", "", "appendBridgeJavascript", "(Landroid/webkit/WebView;)V", "markPageFinished", "()V", "url", "", "handleUrlOverride", "(Ljava/lang/String;)Z", "Landroid/net/Uri;", "uri", "Landroid/os/Bundle;", "queryBundle", "handleQueryAction", "(Ljava/lang/String;Landroid/net/Uri;Landroid/os/Bundle;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Lcom/braze/ui/inappmessage/listeners/IWebViewClientStateListener;", "listener", "setWebViewClientStateListener", "(Lcom/braze/ui/inappmessage/listeners/IWebViewClientStateListener;)V", "Landroid/webkit/RenderProcessGoneDetail;", "detail", "onRenderProcessGone", "(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/braze/ui/BrazeWebViewClient$Type;", "getType", "()Lcom/braze/ui/BrazeWebViewClient$Type;", "Lcom/braze/models/inappmessage/IInAppMessage;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "webViewClientStateListener", "Lcom/braze/ui/inappmessage/listeners/IWebViewClientStateListener;", "hasPageFinishedLoading", "Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasCalledPageFinishedOnListener", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlinx/coroutines/Job;", "markPageFinishedJob", "Lkotlinx/coroutines/Job;", "", "maxOnPageFinishedWaitTimeMs", "I", "Landroidx/webkit/WebViewAssetLoader;", "assetLoader", "Landroidx/webkit/WebViewAssetLoader;", "Companion", "Type", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BrazeWebViewClient extends WebViewClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final WebViewAssetLoader assetLoader;
    private final Context context;
    private final AtomicBoolean hasCalledPageFinishedOnListener;
    private boolean hasPageFinishedLoading;
    private final IInAppMessage inAppMessage;
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;
    private Job markPageFinishedJob;
    private final int maxOnPageFinishedWaitTimeMs;
    private final Type type;
    private IWebViewClientStateListener webViewClientStateListener;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/braze/ui/BrazeWebViewClient$Type;", "", "<init>", "(Ljava/lang/String;I)V", "BANNER", "IN_APP_MESSAGE", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type BANNER = new Type("BANNER", 0);
        public static final Type IN_APP_MESSAGE = new Type("IN_APP_MESSAGE", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{BANNER, IN_APP_MESSAGE};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.IN_APP_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BrazeWebViewClient(Context context, Type type2, IInAppMessage iInAppMessage, IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener, IBannerWebViewClientListener iBannerWebViewClientListener, String str) {
        WebViewAssetLoader webViewAssetLoader;
        context.getClass();
        type2.getClass();
        this.context = context;
        this.type = type2;
        this.inAppMessage = iInAppMessage;
        this.inAppMessageWebViewClientListener = iInAppMessageWebViewClientListener;
        this.hasCalledPageFinishedOnListener = new AtomicBoolean(false);
        this.maxOnPageFinishedWaitTimeMs = BrazeInternal.INSTANCE.getConfigurationProvider(context).getInAppMessageWebViewClientOnPageFinishedMaxWaitMs();
        if (str != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("/", new WebViewAssetLoader.InternalStoragePathHandler(context, new File(str))));
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                arrayList2.add(new WebViewAssetLoader.PathMatcher((String) pair.first, (WebViewAssetLoader.InternalStoragePathHandler) pair.second));
            }
            webViewAssetLoader = new WebViewAssetLoader(arrayList2);
        } else {
            File file = new File(context.getCacheDir(), "ab_triggers");
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new Pair("/ab_triggers/", new WebViewAssetLoader.InternalStoragePathHandler(context, file)));
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Pair pair2 = (Pair) it2.next();
                arrayList4.add(new WebViewAssetLoader.PathMatcher((String) pair2.first, (WebViewAssetLoader.InternalStoragePathHandler) pair2.second));
            }
            webViewAssetLoader = new WebViewAssetLoader(arrayList4);
        }
        this.assetLoader = webViewAssetLoader;
    }

    private final void appendBridgeJavascript(WebView view) {
        try {
            AssetManager assets = this.context.getAssets();
            assets.getClass();
            view.loadUrl("javascript:" + BrazeFileUtils.getAssetFileStringContents(assets, "braze-html-bridge.js"));
        } catch (Exception e) {
            if (this.type == Type.IN_APP_MESSAGE) {
                BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(false);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new yf$$ExternalSyntheticLambda2(this, 7), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String appendBridgeJavascript$lambda$0(BrazeWebViewClient brazeWebViewClient) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to get HTML ", brazeWebViewClient.type.name(), " javascript additions");
    }

    private final void handleQueryAction(String url, Uri uri, Bundle queryBundle) {
        IInAppMessage iInAppMessage;
        IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener;
        IInAppMessage iInAppMessage2;
        IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener2;
        String authority = uri.getAuthority();
        if (authority == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new UriAction$$ExternalSyntheticLambda4(uri, 6), 7, (Object) null);
            return;
        }
        int hashCode = authority.hashCode();
        if (hashCode == -1801488983) {
            if (authority.equals("customEvent") && this.type == Type.IN_APP_MESSAGE && (iInAppMessage = this.inAppMessage) != null && (iInAppMessageWebViewClientListener = this.inAppMessageWebViewClientListener) != null) {
                iInAppMessageWebViewClientListener.onCustomEventAction(iInAppMessage, url, queryBundle);
                return;
            }
            return;
        }
        if (hashCode == 94756344 && authority.equals("close") && this.type == Type.IN_APP_MESSAGE && (iInAppMessage2 = this.inAppMessage) != null && (iInAppMessageWebViewClientListener2 = this.inAppMessageWebViewClientListener) != null) {
            iInAppMessageWebViewClientListener2.onCloseAction(iInAppMessage2, url, queryBundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleQueryAction$lambda$0(Uri uri) {
        return CameraState$Type$EnumUnboxingLocalUtility.m(uri, "Uri authority was null. Uri: ");
    }

    private final boolean handleUrlOverride(String url) {
        IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener;
        Type type2 = this.type;
        String str = (type2 == Type.IN_APP_MESSAGE && this.inAppMessageWebViewClientListener == null) ? "BrazeWebViewClient was given null IInAppMessageWebViewClientListener listener. Returning true." : type2 == Type.BANNER ? "BrazeWebViewClient was given null IBannerWebViewClientListener listener. Returning true." : StringsKt.isBlank(url) ? "BrazeWebViewClient.shouldOverrideUrlLoading was given blank url. Returning true." : null;
        if (str != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda1(str, 29), 6, (Object) null);
            return true;
        }
        Uri parse = Uri.parse(url);
        Bundle bundleFromUrl = INSTANCE.getBundleFromUrl(url);
        if (parse.getScheme() != null && Intrinsics.areEqual(parse.getScheme(), "appboy")) {
            handleQueryAction(url, parse, bundleFromUrl);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new UriAction$$ExternalSyntheticLambda4(parse, 5), 7, (Object) null);
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1) {
            IInAppMessage iInAppMessage = this.inAppMessage;
            if (iInAppMessage != null && (iInAppMessageWebViewClientListener = this.inAppMessageWebViewClientListener) != null) {
                iInAppMessageWebViewClientListener.onOtherUrlAction(iInAppMessage, url, bundleFromUrl);
            }
        } else if (i != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleUrlOverride$lambda$0$0(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleUrlOverride$lambda$1(Uri uri) {
        return CameraState$Type$EnumUnboxingLocalUtility.m(uri, "Uri scheme was null or not an appboy url. Uri: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markPageFinished() {
        IWebViewClientStateListener iWebViewClientStateListener = this.webViewClientStateListener;
        if (iWebViewClientStateListener == null || !this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new c$$ExternalSyntheticLambda2(12), 6, (Object) null);
        ((PreviewView$1$$ExternalSyntheticLambda2) iWebViewClientStateListener).onPageFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String markPageFinished$lambda$0$0() {
        return "Page may not have finished loading, but max wait time has expired. Calling onPageFinished on listener.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onPageFinished$lambda$0$0() {
        return "Page has finished loading. Calling onPageFinished on listener";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onRenderProcessGone$lambda$0() {
        return "The webview rendering process crashed, returning true";
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        BrazeWebViewClient brazeWebViewClient;
        view.getClass();
        url.getClass();
        super.onPageFinished(view, url);
        appendBridgeJavascript(view);
        IWebViewClientStateListener iWebViewClientStateListener = this.webViewClientStateListener;
        if (iWebViewClientStateListener == null || !this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            brazeWebViewClient = this;
        } else {
            brazeWebViewClient = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeWebViewClient, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new c$$ExternalSyntheticLambda2(14), 6, (Object) null);
            ((PreviewView$1$$ExternalSyntheticLambda2) iWebViewClientStateListener).onPageFinished();
        }
        brazeWebViewClient.hasPageFinishedLoading = true;
        Job job = brazeWebViewClient.markPageFinishedJob;
        if (job != null) {
            job.cancel(null);
        }
        brazeWebViewClient.markPageFinishedJob = null;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        view.getClass();
        detail.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new c$$ExternalSyntheticLambda2(13), 6, (Object) null);
        return true;
    }

    public final void setWebViewClientStateListener(IWebViewClientStateListener listener) {
        if (listener != null && this.hasPageFinishedLoading && this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            ((PreviewView$1$$ExternalSyntheticLambda2) listener).onPageFinished();
        } else {
            this.markPageFinishedJob = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Integer.valueOf(this.maxOnPageFinishedWaitTimeMs), null, new BrazeWebViewClient$setWebViewClientStateListener$1(this, null), 2, null);
        }
        this.webViewClientStateListener = listener;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        File file;
        if (request != null) {
            WebViewAssetLoader webViewAssetLoader = this.assetLoader;
            Uri url = request.getUrl();
            Iterator it = webViewAssetLoader.mMatchers.iterator();
            while (it.hasNext()) {
                WebViewAssetLoader.PathMatcher pathMatcher = (WebViewAssetLoader.PathMatcher) it.next();
                pathMatcher.getClass();
                String str = pathMatcher.mPath;
                WebViewAssetLoader.InternalStoragePathHandler internalStoragePathHandler = (!url.getScheme().equals("http") && (url.getScheme().equals("http") || url.getScheme().equals("https")) && url.getAuthority().equals(pathMatcher.mAuthority) && url.getPath().startsWith(str)) ? pathMatcher.mHandler : null;
                if (internalStoragePathHandler != null) {
                    String replaceFirst = url.getPath().replaceFirst(str, "");
                    File file2 = internalStoragePathHandler.mDirectory;
                    try {
                        String canonicalDirPath = AssetHelper.getCanonicalDirPath(file2);
                        String canonicalPath = new File(file2, replaceFirst).getCanonicalPath();
                        file = canonicalPath.startsWith(canonicalDirPath) ? new File(canonicalPath) : null;
                    } catch (IOException e) {
                        Log.e("WebViewAssetLoader", "Error opening the requested path: " + replaceFirst, e);
                    }
                    if (file == null) {
                        Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", replaceFirst, file2));
                        return new WebResourceResponse(null, null, null);
                    }
                    InputStream fileInputStream = new FileInputStream(file);
                    if (file.getPath().endsWith(".svgz")) {
                        fileInputStream = new GZIPInputStream(fileInputStream);
                    }
                    return new WebResourceResponse(AssetHelper.guessMimeType(replaceFirst), null, fileInputStream);
                }
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        view.getClass();
        request.getClass();
        String uri = request.getUrl().toString();
        uri.getClass();
        return handleUrlOverride(uri);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u000fH\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u000fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/braze/ui/BrazeWebViewClient$Companion;", "", "<init>", "()V", "BRIDGE_JS_FILE", "", "JAVASCRIPT_PREFIX", "BRAZE_SCHEME", "AUTHORITY_NAME_CLOSE", "AUTHORITY_NAME_CUSTOM_EVENT", "BRAZE_CUSTOM_EVENT_NAME_KEY", "QUERY_NAME_BUTTON_ID", "QUERY_NAME_EXTERNAL_OPEN", "QUERY_NAME_DEEPLINK", "getBundleFromUrl", "Landroid/os/Bundle;", "url", "parseCustomEventNameFromQueryBundle", "queryBundle", "parsePropertiesFromQueryBundle", "Lcom/braze/models/outgoing/BrazeProperties;", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bundle getBundleFromUrl(String url) {
            url.getClass();
            Bundle bundle = new Bundle();
            if (!StringsKt.isBlank(url)) {
                for (Map.Entry<String, String> entry : UriUtils.getQueryParameters(Uri.parse(url)).entrySet()) {
                    bundle.putString(entry.getKey(), entry.getValue());
                }
            }
            return bundle;
        }

        public final String parseCustomEventNameFromQueryBundle(Bundle queryBundle) {
            queryBundle.getClass();
            return queryBundle.getString("name");
        }

        public final BrazeProperties parsePropertiesFromQueryBundle(Bundle queryBundle) {
            String string2;
            queryBundle.getClass();
            BrazeProperties brazeProperties = new BrazeProperties();
            for (String str : queryBundle.keySet()) {
                if (!Intrinsics.areEqual(str, "name") && (string2 = queryBundle.getString(str, null)) != null && !StringsKt.isBlank(string2)) {
                    str.getClass();
                    brazeProperties.addProperty(str, string2);
                }
            }
            return brazeProperties;
        }

        private Companion() {
        }
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.getClass();
        url.getClass();
        return handleUrlOverride(url);
    }
}
