package ru.yandex.taxi.communications;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.communications.TaxiCommunicationsWebViewStarter$startWebView$1$1$authorizationLink$1", f = "TaxiCommunicationsWebViewStarter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TaxiCommunicationsWebViewStarter$startWebView$1$1$authorizationLink$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $link;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiCommunicationsWebViewStarter$startWebView$1$1$authorizationLink$1(n nVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$link = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiCommunicationsWebViewStarter$startWebView$1$1$authorizationLink$1(this.this$0, this.$link, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiCommunicationsWebViewStarter$startWebView$1$1$authorizationLink$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.taxi.am.o oVar = this.this$0.f;
        String str = this.$link;
        this.label = 1;
        Object a = ru.yandex.taxi.am.n.a(oVar, str, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
