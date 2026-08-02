package ru.yandex.taxi.fragment.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.b1;
import defpackage.dy60;
import defpackage.e90;
import defpackage.fd5;
import defpackage.hd5;
import defpackage.jl40;
import defpackage.jr31;
import defpackage.js4;
import defpackage.jst;
import defpackage.kve;
import defpackage.l8x;
import defpackage.lj41;
import defpackage.ly60;
import defpackage.ney;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pey;
import defpackage.q5z;
import defpackage.rve;
import defpackage.s5r;
import defpackage.sae;
import defpackage.scc;
import defpackage.tje;
import defpackage.tse;
import defpackage.unr0;
import defpackage.uyo0;
import defpackage.v7j0;
import defpackage.w511;
import defpackage.xby;
import defpackage.yfa;
import defpackage.zi;
import defpackage.zxf0;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.eatskit.ContentView;
import ru.yandex.taxi.eatskit.Controller$State;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 j2\u00020\u0001:\u0003kJlB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ#\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u001a\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J5\u0010)\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00142\u0014\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010$0#2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020\u00112\b\u0010/\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0011H\u0014¢\u0006\u0004\b2\u0010\u001dJ\u000f\u00103\u001a\u00020\u0011H\u0014¢\u0006\u0004\b3\u0010\u001dJ\u0017\u00106\u001a\u00020\u00112\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u001a\u00109\u001a\u0004\u0018\u00010\r2\u0006\u00108\u001a\u00020\rH\u0082@¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b=\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010BR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR$\u0010K\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR$\u0010U\u001a\u0004\u0018\u00010T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010\\\u001a\u0004\u0018\u00010[8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010gR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010i¨\u0006m"}, d2 = {"Lru/yandex/taxi/fragment/common/BaseWebChromeClient;", "Landroid/webkit/WebChromeClient;", "Ltse;", "coroutineScope", "Lly60;", "onGeolocationPermissionsShowPromptDelegate", "<init>", "(Ltse;Lly60;)V", "", "delayedSpinner", "Llj41;", "progress", "(Ltse;ZLlj41;)V", "", "origin", "Landroid/webkit/GeolocationPermissions$Callback;", "callback", "Lzy11;", "onGeolocationPermissionsShowPrompt", "(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V", "Landroid/webkit/WebView;", "view", "isDialog", "isUserGesture", "Landroid/os/Message;", "resultMsg", "onCreateWindow", "(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z", "showLoading", "()V", "", "newProgress", "onProgressChanged", "(Landroid/webkit/WebView;I)V", "webView", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "filePathCallback", "Landroid/webkit/WebChromeClient$FileChooserParams;", "fileChooserParams", "onShowFileChooser", "(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z", "Landroid/webkit/PermissionRequest;", "request", "onPermissionRequest", "(Landroid/webkit/PermissionRequest;)V", "window", "onCloseWindow", "(Landroid/webkit/WebView;)V", "hideContent", "showContent", "Landroid/content/Context;", "context", "setupLifecycleObservable", "(Landroid/content/Context;)V", "resource", "getResourceOrNull", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCameraResourceOrNull", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMicrophoneResourceOrNull", "Ltse;", "", "startTime", "J", "Z", "Llj41;", "Landroid/os/Handler;", "uiHandler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "showSpinner", "Ljava/lang/Runnable;", "Lru/yandex/taxi/fragment/common/a;", "fileChooserHandler", "Lru/yandex/taxi/fragment/common/a;", "getFileChooserHandler", "()Lru/yandex/taxi/fragment/common/a;", "setFileChooserHandler", "(Lru/yandex/taxi/fragment/common/a;)V", "Lru/yandex/taxi/fragment/common/c;", "fileChooserIntentFactory", "Lru/yandex/taxi/fragment/common/c;", "Lv7j0;", "requestPermissionInteractor", "Lv7j0;", "getRequestPermissionInteractor", "()Lv7j0;", "setRequestPermissionInteractor", "(Lv7j0;)V", "Ldy60;", "onCreateWindowDelegate", "Ldy60;", "getOnCreateWindowDelegate", "()Ldy60;", "setOnCreateWindowDelegate", "(Ldy60;)V", "Lney;", "lifecycleObservable", "Lney;", "Ll8x;", "createIntentJob", "Ll8x;", "requestPermissionJob", "Lly60;", "Companion", "a", "fd5", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public class BaseWebChromeClient extends WebChromeClient {
    private static final fd5 Companion = new fd5();
    private static final int NO_SHOW_PROGRESS_THRESHOLD = 30;
    private static final long SHOW_TIME_THRESHOLD = 1000;
    private final tse coroutineScope;
    private l8x createIntentJob;
    private final boolean delayedSpinner;
    private ru.yandex.taxi.fragment.common.a fileChooserHandler;
    private final c fileChooserIntentFactory;
    private ney lifecycleObservable;
    private dy60 onCreateWindowDelegate;
    private ly60 onGeolocationPermissionsShowPromptDelegate;
    private final lj41 progress;
    private v7j0 requestPermissionInteractor;
    private l8x requestPermissionJob;
    private final Runnable showSpinner;
    private long startTime;
    private final Handler uiHandler;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00012\u00020\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/fragment/common/BaseWebChromeClient$a;", "Ljava/util/function/Consumer;", "", "Landroid/net/Uri;", "Lzxf0;", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface a extends Consumer<Uri[]>, zxf0 {
    }

    public BaseWebChromeClient(tse tseVar, ly60 ly60Var) {
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.fileChooserIntentFactory = new c();
        this.coroutineScope = tseVar;
        this.progress = null;
        this.delayedSpinner = false;
        this.showSpinner = new zi(20);
        this.onGeolocationPermissionsShowPromptDelegate = ly60Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(BaseWebChromeClient baseWebChromeClient) {
        lj41 lj41Var = baseWebChromeClient.progress;
        if (lj41Var != null) {
            lj41Var.setVisible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCameraResourceOrNull(Continuation<? super Boolean> continuation) {
        BaseWebChromeClient$getCameraResourceOrNull$1 baseWebChromeClient$getCameraResourceOrNull$1;
        int i;
        if (continuation instanceof BaseWebChromeClient$getCameraResourceOrNull$1) {
            baseWebChromeClient$getCameraResourceOrNull$1 = (BaseWebChromeClient$getCameraResourceOrNull$1) continuation;
            int i2 = baseWebChromeClient$getCameraResourceOrNull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseWebChromeClient$getCameraResourceOrNull$1.label = i2 - Integer.MIN_VALUE;
                Object obj = baseWebChromeClient$getCameraResourceOrNull$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseWebChromeClient$getCameraResourceOrNull$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    v7j0 v7j0Var = this.requestPermissionInteractor;
                    if (v7j0Var == null) {
                        return null;
                    }
                    baseWebChromeClient$getCameraResourceOrNull$1.L$0 = null;
                    baseWebChromeClient$getCameraResourceOrNull$1.label = 1;
                    obj = ((com.yandex.go.permission.b) v7j0Var).d(3, baseWebChromeClient$getCameraResourceOrNull$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
            }
        }
        baseWebChromeClient$getCameraResourceOrNull$1 = new BaseWebChromeClient$getCameraResourceOrNull$1(this, continuation);
        Object obj2 = baseWebChromeClient$getCameraResourceOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseWebChromeClient$getCameraResourceOrNull$1.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        bool2.getClass();
        return bool2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getMicrophoneResourceOrNull(Continuation<? super Boolean> continuation) {
        BaseWebChromeClient$getMicrophoneResourceOrNull$1 baseWebChromeClient$getMicrophoneResourceOrNull$1;
        int i;
        if (continuation instanceof BaseWebChromeClient$getMicrophoneResourceOrNull$1) {
            baseWebChromeClient$getMicrophoneResourceOrNull$1 = (BaseWebChromeClient$getMicrophoneResourceOrNull$1) continuation;
            int i2 = baseWebChromeClient$getMicrophoneResourceOrNull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseWebChromeClient$getMicrophoneResourceOrNull$1.label = i2 - Integer.MIN_VALUE;
                Object obj = baseWebChromeClient$getMicrophoneResourceOrNull$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseWebChromeClient$getMicrophoneResourceOrNull$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    v7j0 v7j0Var = this.requestPermissionInteractor;
                    if (v7j0Var == null) {
                        return null;
                    }
                    baseWebChromeClient$getMicrophoneResourceOrNull$1.L$0 = null;
                    baseWebChromeClient$getMicrophoneResourceOrNull$1.label = 1;
                    obj = ((com.yandex.go.permission.b) v7j0Var).d(14, baseWebChromeClient$getMicrophoneResourceOrNull$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
            }
        }
        baseWebChromeClient$getMicrophoneResourceOrNull$1 = new BaseWebChromeClient$getMicrophoneResourceOrNull$1(this, continuation);
        Object obj2 = baseWebChromeClient$getMicrophoneResourceOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseWebChromeClient$getMicrophoneResourceOrNull$1.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        bool2.getClass();
        return bool2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
    
        if (r8 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
    
        if (r8 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getResourceOrNull(String str, Continuation<? super String> continuation) {
        BaseWebChromeClient$getResourceOrNull$1 baseWebChromeClient$getResourceOrNull$1;
        int i;
        if (continuation instanceof BaseWebChromeClient$getResourceOrNull$1) {
            baseWebChromeClient$getResourceOrNull$1 = (BaseWebChromeClient$getResourceOrNull$1) continuation;
            int i2 = baseWebChromeClient$getResourceOrNull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseWebChromeClient$getResourceOrNull$1.label = i2 - Integer.MIN_VALUE;
                Object obj = baseWebChromeClient$getResourceOrNull$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseWebChromeClient$getResourceOrNull$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int hashCode = str.hashCode();
                    if (hashCode != -1660821873) {
                        if (hashCode != 968612586) {
                            if (hashCode == 1069496794 && str.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                                return str;
                            }
                        } else if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                            baseWebChromeClient$getResourceOrNull$1.L$0 = str;
                            baseWebChromeClient$getResourceOrNull$1.label = 2;
                            obj = getMicrophoneResourceOrNull(baseWebChromeClient$getResourceOrNull$1);
                        }
                    } else if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                        baseWebChromeClient$getResourceOrNull$1.L$0 = str;
                        baseWebChromeClient$getResourceOrNull$1.label = 1;
                        obj = getCameraResourceOrNull(baseWebChromeClient$getResourceOrNull$1);
                    }
                } else if (i == 1) {
                    str = (String) baseWebChromeClient$getResourceOrNull$1.L$0;
                    kotlin.b.b(obj);
                    if (jl40.l(obj, Boolean.TRUE)) {
                        return str;
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) baseWebChromeClient$getResourceOrNull$1.L$0;
                    kotlin.b.b(obj);
                    if (jl40.l(obj, Boolean.TRUE)) {
                        return str;
                    }
                }
                return null;
            }
        }
        baseWebChromeClient$getResourceOrNull$1 = new BaseWebChromeClient$getResourceOrNull$1(this, continuation);
        Object obj3 = baseWebChromeClient$getResourceOrNull$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseWebChromeClient$getResourceOrNull$1.label;
        if (i != 0) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupLifecycleObservable(Context context) {
        if (context instanceof pey) {
            ney neyVar = new ney(((pey) context).getLifecycle());
            this.lifecycleObservable = neyVar;
            neyVar.b(this, new hd5(0, this, neyVar));
        }
    }

    public final ru.yandex.taxi.fragment.common.a getFileChooserHandler() {
        return this.fileChooserHandler;
    }

    public final dy60 getOnCreateWindowDelegate() {
        return this.onCreateWindowDelegate;
    }

    public final v7j0 getRequestPermissionInteractor() {
        return this.requestPermissionInteractor;
    }

    public void hideContent() {
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView window) {
        super.onCloseWindow(window);
        l8x l8xVar = this.createIntentJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        l8x l8xVar2 = this.requestPermissionJob;
        if (l8xVar2 != null) {
            l8xVar2.a(null);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
        final ContentView contentView;
        dy60 dy60Var = this.onCreateWindowDelegate;
        if (dy60Var == null) {
            return super.onCreateWindow(view, isDialog, isUserGesture, resultMsg);
        }
        final com.yandex.go.payments.shared.business.accountcreation.corp.personalaccount.a aVar = (com.yandex.go.payments.shared.business.accountcreation.corp.personalaccount.a) ((yfa) dy60Var).a;
        sae saeVar = aVar.e;
        Activity activity = aVar.a;
        kve kveVar = aVar.c;
        b1 b1Var = (b1) saeVar.b;
        b1Var.getClass();
        b1Var.a.a("B2BHome.WebView.TryOpenInExternalBrowser", new HashMap(), 1, new HashMap());
        WebView.HitTestResult hitTestResult = view != null ? view.getHitTestResult() : null;
        int i = 0;
        if (hitTestResult == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("bad hit test result");
            kveVar.getClass();
            kve.b(illegalArgumentException);
            return false;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            s5r s5rVar = new s5r(kotlin.sequences.b.g(new jr31(viewGroup, i), new uyo0(28, ContentView.class)));
            if (!s5rVar.hasNext()) {
                w511.i("Sequence is empty.");
                return false;
            }
            contentView = (ContentView) s5rVar.next();
        } else {
            contentView = null;
        }
        String extra = hitTestResult.getExtra();
        if (extra != null) {
            if (q5z.O(activity, extra)) {
                b1 b1Var2 = (b1) aVar.e.b;
                b1Var2.getClass();
                b1Var2.a.a("B2BHome.WebView.SuccessOpenInExternalBrowser", new HashMap(), 1, new HashMap());
                return false;
            }
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Browser not found");
            kveVar.getClass();
            kve.b(illegalArgumentException2);
            return false;
        }
        if (resultMsg != null) {
            if (contentView != null) {
                contentView.updateState(Controller$State.LOADING);
            }
            WebView webView = new WebView(activity);
            webView.setWebViewClient(new WebViewClient() { // from class: com.yandex.go.payments.shared.business.accountcreation.corp.personalaccount.CorpPersonalAccountRouter$createWebViewForNewTabUrl$1
                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView view2, String url) {
                    ContentView contentView2 = ContentView.this;
                    if (contentView2 != null) {
                        contentView2.updateState(Controller$State.ACTIVE);
                    }
                    super.onPageFinished(view2, url);
                }

                @Override // android.webkit.WebViewClient
                public void onPageStarted(WebView view2, String url, Bitmap favicon) {
                    if (url != null) {
                        q5z.O(aVar.a, url);
                    }
                    ContentView contentView2 = ContentView.this;
                    if (contentView2 != null) {
                        contentView2.updateState(Controller$State.ACTIVE);
                    }
                    super.onPageStarted(view2, url, favicon);
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedError(WebView view2, int errorCode, String description, String failingUrl) {
                    ContentView contentView2 = ContentView.this;
                    if (contentView2 != null) {
                        contentView2.updateState(Controller$State.ACTIVE);
                    }
                    super.onReceivedError(view2, errorCode, description, failingUrl);
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedHttpError(WebView view2, WebResourceRequest request, WebResourceResponse errorResponse) {
                    ContentView contentView2 = ContentView.this;
                    if (contentView2 != null) {
                        contentView2.updateState(Controller$State.ACTIVE);
                    }
                    super.onReceivedHttpError(view2, request, errorResponse);
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedLoginRequest(WebView view2, String realm, String account, String args) {
                    ContentView contentView2 = ContentView.this;
                    if (contentView2 != null) {
                        contentView2.updateState(Controller$State.ACTIVE);
                    }
                    super.onReceivedLoginRequest(view2, realm, account, args);
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedSslError(WebView view2, SslErrorHandler handler, SslError error) {
                    ContentView contentView2 = ContentView.this;
                    if (contentView2 != null) {
                        contentView2.updateState(Controller$State.ACTIVE);
                    }
                    super.onReceivedSslError(view2, handler, error);
                }

                @Override // android.webkit.WebViewClient
                public void onTooManyRedirects(WebView view2, Message cancelMsg, Message continueMsg) {
                    ContentView contentView2 = ContentView.this;
                    if (contentView2 != null) {
                        contentView2.updateState(Controller$State.ACTIVE);
                    }
                    super.onTooManyRedirects(view2, cancelMsg, continueMsg);
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView view2, String url) {
                    if (url != null) {
                        q5z.O(aVar.a, url);
                    }
                    ContentView contentView2 = ContentView.this;
                    if (contentView2 != null) {
                        contentView2.updateState(Controller$State.ACTIVE);
                    }
                    return super.shouldOverrideUrlLoading(view2, url);
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedError(WebView view2, WebResourceRequest request, WebResourceError error) {
                    ContentView contentView2 = ContentView.this;
                    if (contentView2 != null) {
                        contentView2.updateState(Controller$State.ACTIVE);
                    }
                    super.onReceivedError(view2, request, error);
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView view2, WebResourceRequest request) {
                    ContentView contentView2 = ContentView.this;
                    if (contentView2 != null) {
                        contentView2.updateState(Controller$State.ACTIVE);
                    }
                    return super.shouldOverrideUrlLoading(view2, request);
                }
            });
            Object obj = resultMsg.obj;
            WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
            if (webViewTransport != null) {
                webViewTransport.setWebView(webView);
                resultMsg.sendToTarget();
                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("bad web view url");
                kveVar.getClass();
                kve.b(illegalArgumentException3);
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
        ly60 ly60Var;
        Object failure;
        boolean l;
        if (origin == null || callback == null || (ly60Var = this.onGeolocationPermissionsShowPromptDelegate) == null) {
            super.onGeolocationPermissionsShowPrompt(origin, callback);
            return;
        }
        e90 e90Var = (e90) ly60Var;
        rve rveVar = (rve) e90Var.b;
        List list = (List) e90Var.c;
        kve kveVar = rveVar.n;
        try {
            String host = Uri.parse(origin).getHost();
            if (host == null) {
                host = "";
            }
            boolean contains = list.contains(host);
            if (!contains) {
                kveVar.getClass();
                kve.a(host);
            }
            failure = Boolean.valueOf(contains);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            kveVar.getClass();
            String th2 = a2.toString();
            xby.l(jst.e, kotlin.collections.a.X(scc.g("CORP_PERSONAL_ACCOUNT_ERROR_TOKEN", th2), ":", null, null, null, 62), null, new IllegalArgumentException(), oyr.q(th2, " ", a2.getMessage(), " ", a2.getLocalizedMessage()), 2);
            l = false;
        } else {
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            l = jl40.l(failure, Boolean.TRUE);
        }
        if (l) {
            b1 b1Var = (b1) rveVar.i.b;
            b1Var.getClass();
            b1Var.a.a("B2BHome.WebView.SuccessLocation", new HashMap(), 1, new HashMap());
        }
        callback.invoke(origin, l, false);
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest request) {
        this.requestPermissionJob = tje.N(this.coroutineScope, null, null, new BaseWebChromeClient$onPermissionRequest$1(request, this, null), 3);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView view, int newProgress) {
        unr0.C(new Object[]{Integer.valueOf(newProgress)}, 1, "Web view has loaded %d%% of the page", jst.e);
        if (!this.delayedSpinner || SystemClock.uptimeMillis() - this.startTime >= 1000 || newProgress <= 30) {
            return;
        }
        this.uiHandler.removeCallbacks(this.showSpinner);
        showContent();
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        ru.yandex.taxi.fragment.common.a aVar = this.fileChooserHandler;
        if (aVar == null) {
            return false;
        }
        l8x l8xVar = this.createIntentJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        setupLifecycleObservable(webView.getContext());
        this.createIntentJob = tje.N(this.coroutineScope, null, null, new BaseWebChromeClient$onShowFileChooser$1(this, webView, aVar, fileChooserParams, filePathCallback, null), 3);
        return true;
    }

    public final void setFileChooserHandler(ru.yandex.taxi.fragment.common.a aVar) {
        this.fileChooserHandler = aVar;
    }

    public final void setOnCreateWindowDelegate(dy60 dy60Var) {
        this.onCreateWindowDelegate = dy60Var;
    }

    public final void setRequestPermissionInteractor(v7j0 v7j0Var) {
        this.requestPermissionInteractor = v7j0Var;
    }

    public void showContent() {
    }

    public final void showLoading() {
        if (this.progress == null) {
            return;
        }
        this.startTime = SystemClock.uptimeMillis();
        if (!this.delayedSpinner) {
            this.progress.setVisible(true);
            hideContent();
        } else {
            this.uiHandler.removeCallbacks(this.showSpinner);
            this.uiHandler.postDelayed(this.showSpinner, 1000L);
            this.progress.setVisible(false);
        }
    }

    public /* synthetic */ BaseWebChromeClient(tse tseVar, ly60 ly60Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tseVar, (i & 2) != 0 ? null : ly60Var);
    }

    public BaseWebChromeClient(tse tseVar, boolean z, lj41 lj41Var) {
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.fileChooserIntentFactory = new c();
        this.coroutineScope = tseVar;
        this.delayedSpinner = z;
        this.progress = lj41Var;
        this.showSpinner = new js4(9, this);
    }
}
