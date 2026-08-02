package ru.yandex.taxi.fragment.common;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.web.WebContentView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.fragment.common.WebViewFragment$loadUrlWithCache$1", f = "WebViewFragment.kt", l = {332}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class WebViewFragment$loadUrlWithCache$1 extends SuspendLambda implements wls {
    final /* synthetic */ ru.yandex.taxi.controller.b $cacheLoader;
    final /* synthetic */ String $token;
    final /* synthetic */ String $url;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ WebViewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewFragment$loadUrlWithCache$1(ru.yandex.taxi.controller.b bVar, String str, WebViewFragment webViewFragment, String str2, Continuation continuation) {
        super(2, continuation);
        this.$cacheLoader = bVar;
        this.$token = str;
        this.this$0 = webViewFragment;
        this.$url = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewFragment$loadUrlWithCache$1(this.$cacheLoader, this.$token, this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewFragment$loadUrlWithCache$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WebViewFragment webViewFragment;
        String str;
        WebViewFragment webViewFragment2;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                ru.yandex.taxi.controller.b bVar = this.$cacheLoader;
                String str3 = this.$token;
                WebViewFragment webViewFragment3 = this.this$0;
                String str4 = this.$url;
                try {
                    this.L$0 = webViewFragment3;
                    this.L$1 = str4;
                    this.L$2 = webViewFragment3;
                    this.L$3 = str4;
                    this.label = 1;
                    obj = bVar.c(str3, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    webViewFragment2 = webViewFragment3;
                    webViewFragment = webViewFragment2;
                    str = str4;
                    str2 = str;
                } catch (Throwable unused) {
                    webViewFragment = webViewFragment3;
                    str = str4;
                    webViewFragment.loadUrlWithHeaders(str);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.L$3;
                webViewFragment = (WebViewFragment) this.L$2;
                String str5 = (String) this.L$1;
                webViewFragment2 = (WebViewFragment) this.L$0;
                try {
                    kotlin.b.b(obj);
                    str2 = str5;
                } catch (Throwable unused2) {
                    webViewFragment.loadUrlWithHeaders(str);
                    return zy11.a;
                }
            }
            String str6 = (String) obj;
            WebContentView webContentView = webViewFragment2.webView;
            if (webContentView != null) {
                webContentView.clearHistory();
                webContentView.loadDataWithBaseURL(str2, str6, "text/html", "UTF-8", null);
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
