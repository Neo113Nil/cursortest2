package ru.yandex.taxi.fragment.common;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import defpackage.gd5;
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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.fragment.common.BaseWebChromeClient$onShowFileChooser$1", f = "BaseWebChromeClient.kt", l = {HProv.PP_SECURITY_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class BaseWebChromeClient$onShowFileChooser$1 extends SuspendLambda implements wls {
    final /* synthetic */ a $fileChooserHandler;
    final /* synthetic */ WebChromeClient.FileChooserParams $fileChooserParams;
    final /* synthetic */ ValueCallback<Uri[]> $filePathCallback;
    final /* synthetic */ WebView $webView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ BaseWebChromeClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebChromeClient$onShowFileChooser$1(BaseWebChromeClient baseWebChromeClient, WebView webView, a aVar, WebChromeClient.FileChooserParams fileChooserParams, ValueCallback valueCallback, Continuation continuation) {
        super(2, continuation);
        this.this$0 = baseWebChromeClient;
        this.$webView = webView;
        this.$fileChooserHandler = aVar;
        this.$fileChooserParams = fileChooserParams;
        this.$filePathCallback = valueCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseWebChromeClient$onShowFileChooser$1(this.this$0, this.$webView, this.$fileChooserHandler, this.$fileChooserParams, this.$filePathCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseWebChromeClient$onShowFileChooser$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c cVar;
        BaseWebChromeClient baseWebChromeClient;
        a aVar;
        ValueCallback<Uri[]> valueCallback;
        c cVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                BaseWebChromeClient baseWebChromeClient2 = this.this$0;
                WebView webView = this.$webView;
                a aVar2 = this.$fileChooserHandler;
                WebChromeClient.FileChooserParams fileChooserParams = this.$fileChooserParams;
                ValueCallback<Uri[]> valueCallback2 = this.$filePathCallback;
                cVar = baseWebChromeClient2.fileChooserIntentFactory;
                Context context = webView.getContext();
                this.L$0 = baseWebChromeClient2;
                this.L$1 = aVar2;
                this.L$2 = valueCallback2;
                this.label = 1;
                Object e = cVar.e(context, aVar2, fileChooserParams, this);
                if (e == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = e;
                baseWebChromeClient = baseWebChromeClient2;
                aVar = aVar2;
                valueCallback = valueCallback2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                valueCallback = (ValueCallback) this.L$2;
                aVar = (a) this.L$1;
                baseWebChromeClient = (BaseWebChromeClient) this.L$0;
                kotlin.b.b(obj);
            }
            cVar2 = baseWebChromeClient.fileChooserIntentFactory;
            ((b) aVar).d((Intent) obj, cVar2.a, new gd5(baseWebChromeClient, valueCallback, 0));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            jst.e.j(th);
        }
        return zy11.a;
    }
}
