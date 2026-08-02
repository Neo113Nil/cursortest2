package ru.yandex.taxi.web.deeplink;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkRouter$showInternal$loadingListener$1$onPageLoadingError$1", f = "WebViewFromDeeplinkRouter.kt", l = {HProv.PP_LCD_QUERY}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class WebViewFromDeeplinkRouter$showInternal$loadingListener$1$onPageLoadingError$1 extends SuspendLambda implements wls {
    final /* synthetic */ WebViewFromDeeplinkExperiment.a $urlWithId;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewFromDeeplinkRouter$showInternal$loadingListener$1$onPageLoadingError$1(m mVar, WebViewFromDeeplinkExperiment.a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$urlWithId = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewFromDeeplinkRouter$showInternal$loadingListener$1$onPageLoadingError$1(this.this$0, this.$urlWithId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewFromDeeplinkRouter$showInternal$loadingListener$1$onPageLoadingError$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m mVar = this.this$0;
            WebViewFromDeeplinkExperiment.a aVar = this.$urlWithId;
            this.label = 1;
            if (m.Q(mVar, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
