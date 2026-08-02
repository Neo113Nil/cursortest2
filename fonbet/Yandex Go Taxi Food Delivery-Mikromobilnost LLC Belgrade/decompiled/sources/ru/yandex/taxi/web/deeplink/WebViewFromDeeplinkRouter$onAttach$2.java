package ru.yandex.taxi.web.deeplink;

import android.net.Uri;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkRouter$onAttach$2", f = "WebViewFromDeeplinkRouter.kt", l = {58}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class WebViewFromDeeplinkRouter$onAttach$2 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $deeplink;
    Object L$0;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewFromDeeplinkRouter$onAttach$2(m mVar, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$deeplink = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewFromDeeplinkRouter$onAttach$2(this.this$0, this.$deeplink, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewFromDeeplinkRouter$onAttach$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        m mVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                m mVar2 = this.this$0;
                Uri uri = this.$deeplink;
                try {
                    this.L$0 = mVar2;
                    this.label = 1;
                    if (m.P(mVar2, uri, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    mVar = mVar2;
                    jst.e.k(th, "Uncaught exception in WebViewFromDeeplinkRouter");
                    mVar.r(new qu(9));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mVar = (m) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    jst.e.k(th, "Uncaught exception in WebViewFromDeeplinkRouter");
                    mVar.r(new qu(9));
                    return zy11.a;
                }
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
