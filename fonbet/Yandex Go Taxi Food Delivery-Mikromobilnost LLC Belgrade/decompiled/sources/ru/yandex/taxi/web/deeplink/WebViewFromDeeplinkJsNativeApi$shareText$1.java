package ru.yandex.taxi.web.deeplink;

import defpackage.j73;
import defpackage.jst;
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
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkJsNativeApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkJsNativeApi$shareText$1", f = "WebViewFromDeeplinkJsNativeApi.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class WebViewFromDeeplinkJsNativeApi$shareText$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params;
    int label;
    final /* synthetic */ WebViewFromDeeplinkJsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewFromDeeplinkJsNativeApi$shareText$1(WebViewFromDeeplinkJsNativeApi webViewFromDeeplinkJsNativeApi, String[] strArr, Continuation continuation) {
        super(2, continuation);
        this.this$0 = webViewFromDeeplinkJsNativeApi;
        this.$params = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewFromDeeplinkJsNativeApi$shareText$1(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WebViewFromDeeplinkJsNativeApi$shareText$1 webViewFromDeeplinkJsNativeApi$shareText$1 = (WebViewFromDeeplinkJsNativeApi$shareText$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        webViewFromDeeplinkJsNativeApi$shareText$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object deserialize;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        WebViewFromDeeplinkJsNativeApi webViewFromDeeplinkJsNativeApi = this.this$0;
        String[] strArr = this.$params;
        try {
            deserialize = webViewFromDeeplinkJsNativeApi.deserialize((String) j73.C(strArr), WebViewFromDeeplinkJsNativeApi.a.Companion.serializer());
            webViewFromDeeplinkJsNativeApi.shareText(((WebViewFromDeeplinkJsNativeApi.a) deserialize).a);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            jst.e.c("WebViewFromDeeplinkJsNativeApi.shareText cant find param = " + j73.D(strArr));
        }
        return zy11.a;
    }
}
