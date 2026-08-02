package ru.yandex.taxi.maas.impl.ride.metropick;

import com.yandex.go.taxi.tariffs.interactor.k;
import defpackage.hxx;
import defpackage.l200;
import defpackage.m000;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q100;
import defpackage.tse;
import defpackage.wls;
import defpackage.za31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.maas.impl.ride.metropick.MaasToMetroFragmentRouter$launchMetroPicker$1", f = "MaasToMetroFragmentRouter.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MaasToMetroFragmentRouter$launchMetroPicker$1 extends SuspendLambda implements wls {
    final /* synthetic */ m000 $deeplinkData;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaasToMetroFragmentRouter$launchMetroPicker$1(d dVar, m000 m000Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$deeplinkData = m000Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MaasToMetroFragmentRouter$launchMetroPicker$1(this.this$0, this.$deeplinkData, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MaasToMetroFragmentRouter$launchMetroPicker$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.maas.impl.ride.common.a aVar = this.this$0.D;
            String str = this.$deeplinkData.b;
            this.label = 1;
            obj = e.y(new mth(new k(((com.yandex.go.taxi.tariffs.internal.repository.k) aVar.a.a).i(), str), 6), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boolean e = this.this$0.D.e((za31) obj, this.$deeplinkData);
        zy11 zy11Var = zy11.a;
        if (!e) {
            return zy11Var;
        }
        b bVar = (b) this.this$0.E.get();
        m000 m000Var = this.$deeplinkData;
        q100 q100Var = new q100(m000Var);
        d dVar = this.this$0;
        dVar.E(bVar, q100Var, new l200(dVar, m000Var), hxx.a);
        return zy11Var;
    }
}
