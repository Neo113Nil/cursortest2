package ru.yandex.taxi.analytics;

import defpackage.jbh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.analytics.GeoProvidersAnalyticStateRepositoryImpl$1", f = "GeoProvidersAnalyticStateRepositoryImpl.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class GeoProvidersAnalyticStateRepositoryImpl$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoProvidersAnalyticStateRepositoryImpl$1(n nVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GeoProvidersAnalyticStateRepositoryImpl$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GeoProvidersAnalyticStateRepositoryImpl$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AtomicBoolean atomicBoolean;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n nVar = this.this$0;
            AtomicBoolean atomicBoolean2 = nVar.e;
            this.L$0 = atomicBoolean2;
            this.label = 1;
            obj = ((jbh) nVar.d).f(SimplePersistentBooleanExperiment.SEND_GEO_PROVIDERS_ANALYTICS).b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            atomicBoolean = atomicBoolean2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            atomicBoolean = (AtomicBoolean) this.L$0;
            kotlin.b.b(obj);
        }
        atomicBoolean.set(((Boolean) obj).booleanValue());
        return zy11.a;
    }
}
