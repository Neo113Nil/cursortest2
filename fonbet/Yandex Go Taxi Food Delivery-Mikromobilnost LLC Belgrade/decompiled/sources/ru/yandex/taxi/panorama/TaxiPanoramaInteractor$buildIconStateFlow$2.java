package ru.yandex.taxi.panorama;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lru/yandex/taxi/theme/ThemeType;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.panorama.TaxiPanoramaInteractor$buildIconStateFlow$2", f = "TaxiPanoramaInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TaxiPanoramaInteractor$buildIconStateFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiPanoramaInteractor$buildIconStateFlow$2(l lVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = lVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TaxiPanoramaInteractor$buildIconStateFlow$2 taxiPanoramaInteractor$buildIconStateFlow$2 = new TaxiPanoramaInteractor$buildIconStateFlow$2(this.this$0, (Continuation) obj3);
        taxiPanoramaInteractor$buildIconStateFlow$2.L$0 = (Throwable) obj2;
        zy11 zy11Var = zy11.a;
        taxiPanoramaInteractor$buildIconStateFlow$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.d.getClass();
        return zy11.a;
    }
}
