package ru.yandex.taxi.logistics.care.impl.router;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.care.impl.router.DeliveryCareRouterImpl$handleShowFleChooser$1", f = "DeliveryCareRouterImpl.kt", l = {178}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryCareRouterImpl$handleShowFleChooser$1 extends SuspendLambda implements wls {
    final /* synthetic */ ru.yandex.taxi.fragment.common.c $fileChooserIntentFactory;
    final /* synthetic */ WebChromeClient.FileChooserParams $fileChooserParams;
    final /* synthetic */ ValueCallback<Uri[]> $filePathCallback;
    final /* synthetic */ WebView $webView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryCareRouterImpl$handleShowFleChooser$1(ru.yandex.taxi.fragment.common.c cVar, WebView webView, f fVar, WebChromeClient.FileChooserParams fileChooserParams, ValueCallback valueCallback, Continuation continuation) {
        super(2, continuation);
        this.$fileChooserIntentFactory = cVar;
        this.$webView = webView;
        this.this$0 = fVar;
        this.$fileChooserParams = fileChooserParams;
        this.$filePathCallback = valueCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryCareRouterImpl$handleShowFleChooser$1(this.$fileChooserIntentFactory, this.$webView, this.this$0, this.$fileChooserParams, this.$filePathCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryCareRouterImpl$handleShowFleChooser$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ru.yandex.taxi.fragment.common.c cVar;
        f fVar;
        ValueCallback<Uri[]> valueCallback;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                ru.yandex.taxi.fragment.common.c cVar2 = this.$fileChooserIntentFactory;
                WebView webView = this.$webView;
                f fVar2 = this.this$0;
                WebChromeClient.FileChooserParams fileChooserParams = this.$fileChooserParams;
                ValueCallback<Uri[]> valueCallback2 = this.$filePathCallback;
                Context context = webView.getContext();
                ru.yandex.taxi.fragment.common.b bVar = fVar2.K;
                this.L$0 = cVar2;
                this.L$1 = fVar2;
                this.L$2 = valueCallback2;
                this.label = 1;
                Object e = cVar2.e(context, bVar, fileChooserParams, this);
                if (e == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = e;
                cVar = cVar2;
                fVar = fVar2;
                valueCallback = valueCallback2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                valueCallback = (ValueCallback) this.L$2;
                fVar = (f) this.L$1;
                cVar = (ru.yandex.taxi.fragment.common.c) this.L$0;
                kotlin.b.b(obj);
            }
            fVar.K.d((Intent) obj, cVar.a, new gd5(fVar, valueCallback, i2));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            jst.e.j(th);
        }
        return zy11.a;
    }
}
