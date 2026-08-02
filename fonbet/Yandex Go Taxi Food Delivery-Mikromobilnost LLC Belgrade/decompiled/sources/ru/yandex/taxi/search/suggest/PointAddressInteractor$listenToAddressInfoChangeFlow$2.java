package ru.yandex.taxi.search.suggest;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvpr;", "Lkotlin/Result;", "Lpv0;", "", "throwable", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.search.suggest.PointAddressInteractor$listenToAddressInfoChangeFlow$2", f = "PointAddressInteractor.kt", l = {464}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PointAddressInteractor$listenToAddressInfoChangeFlow$2 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public PointAddressInteractor$listenToAddressInfoChangeFlow$2() {
        super(3, null);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PointAddressInteractor$listenToAddressInfoChangeFlow$2 pointAddressInteractor$listenToAddressInfoChangeFlow$2 = new PointAddressInteractor$listenToAddressInfoChangeFlow$2(3, (Continuation) obj3);
        pointAddressInteractor$listenToAddressInfoChangeFlow$2.L$0 = (vpr) obj;
        pointAddressInteractor$listenToAddressInfoChangeFlow$2.L$1 = (Throwable) obj2;
        return pointAddressInteractor$listenToAddressInfoChangeFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Throwable th = (Throwable) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Result result = new Result(new Result.Failure(th));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(result, this) == coroutineSingletons) {
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
