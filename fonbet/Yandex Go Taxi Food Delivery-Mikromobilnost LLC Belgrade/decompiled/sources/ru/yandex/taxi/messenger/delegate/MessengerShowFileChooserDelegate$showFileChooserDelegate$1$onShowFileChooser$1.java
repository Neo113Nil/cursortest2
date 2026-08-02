package ru.yandex.taxi.messenger.delegate;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import defpackage.gd5;
import defpackage.jl40;
import defpackage.jst;
import defpackage.m420;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.fragment.common.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.messenger.delegate.MessengerShowFileChooserDelegate$showFileChooserDelegate$1$onShowFileChooser$1", f = "MessengerShowFileChooserDelegate.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MessengerShowFileChooserDelegate$showFileChooserDelegate$1$onShowFileChooser$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    final /* synthetic */ ru.yandex.taxi.fragment.common.a $fileChooserHandler;
    final /* synthetic */ WebChromeClient.FileChooserParams $fileChooserParams;
    final /* synthetic */ ValueCallback<Uri[]> $filePathCallback;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ m420 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerShowFileChooserDelegate$showFileChooserDelegate$1$onShowFileChooser$1(m420 m420Var, Context context, ru.yandex.taxi.fragment.common.a aVar, WebChromeClient.FileChooserParams fileChooserParams, ValueCallback valueCallback, Continuation continuation) {
        super(2, continuation);
        this.this$0 = m420Var;
        this.$context = context;
        this.$fileChooserHandler = aVar;
        this.$fileChooserParams = fileChooserParams;
        this.$filePathCallback = valueCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MessengerShowFileChooserDelegate$showFileChooserDelegate$1$onShowFileChooser$1(this.this$0, this.$context, this.$fileChooserHandler, this.$fileChooserParams, this.$filePathCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessengerShowFileChooserDelegate$showFileChooserDelegate$1$onShowFileChooser$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        m420 m420Var;
        ru.yandex.taxi.fragment.common.a aVar;
        ValueCallback<Uri[]> valueCallback;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                m420 m420Var2 = this.this$0;
                Context context = this.$context;
                ru.yandex.taxi.fragment.common.a aVar2 = this.$fileChooserHandler;
                WebChromeClient.FileChooserParams fileChooserParams = this.$fileChooserParams;
                ValueCallback<Uri[]> valueCallback2 = this.$filePathCallback;
                c cVar = m420Var2.c;
                this.L$0 = m420Var2;
                this.L$1 = aVar2;
                this.L$2 = valueCallback2;
                this.label = 1;
                Object b = cVar.b(context, aVar2, fileChooserParams, this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = b;
                m420Var = m420Var2;
                aVar = aVar2;
                valueCallback = valueCallback2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                valueCallback = (ValueCallback) this.L$2;
                aVar = (ru.yandex.taxi.fragment.common.a) this.L$1;
                m420Var = (m420) this.L$0;
                b.b(obj);
            }
            Intent intent = (Intent) obj;
            m420Var.b.q(jl40.l(intent.getAction(), "android.media.action.IMAGE_CAPTURE"));
            ((ru.yandex.taxi.fragment.common.b) aVar).d(intent, m420Var.c.a, new gd5(m420Var, valueCallback, 2));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.j(th);
        }
        return zy11.a;
    }
}
