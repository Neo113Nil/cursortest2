package ru.yandex.taxi.maas.impl.ride.metropick;

import defpackage.c0l0;
import defpackage.k200;
import defpackage.m000;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xyz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.maas.impl.ride.metropick.MaasToMetroFragmentRouter$launchExitsPicker$listener$1$onDoneClick$1", f = "MaasToMetroFragmentRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MaasToMetroFragmentRouter$launchExitsPicker$listener$1$onDoneClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ pv0 $addressInfo;
    final /* synthetic */ m000 $deeplinkData;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaasToMetroFragmentRouter$launchExitsPicker$listener$1$onDoneClick$1(d dVar, pv0 pv0Var, m000 m000Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$addressInfo = pv0Var;
        this.$deeplinkData = m000Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MaasToMetroFragmentRouter$launchExitsPicker$listener$1$onDoneClick$1(this.this$0, this.$addressInfo, this.$deeplinkData, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MaasToMetroFragmentRouter$launchExitsPicker$listener$1$onDoneClick$1 maasToMetroFragmentRouter$launchExitsPicker$listener$1$onDoneClick$1 = (MaasToMetroFragmentRouter$launchExitsPicker$listener$1$onDoneClick$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        maasToMetroFragmentRouter$launchExitsPicker$listener$1$onDoneClick$1.invokeSuspend(zy11Var);
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
        c0l0 c = this.this$0.D.c(this.$addressInfo);
        d dVar = this.this$0;
        ru.yandex.taxi.maas.impl.ride.common.a aVar = dVar.D;
        tse o = dVar.o();
        m000 a = m000.a(this.$deeplinkData, c);
        d dVar2 = this.this$0;
        aVar.d(o, a, new xyz(3, dVar2), new k200(0, dVar2));
        return zy11.a;
    }
}
