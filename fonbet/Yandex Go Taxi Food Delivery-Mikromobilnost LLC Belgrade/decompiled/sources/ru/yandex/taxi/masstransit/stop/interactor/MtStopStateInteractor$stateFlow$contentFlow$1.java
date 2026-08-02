package ru.yandex.taxi.masstransit.stop.interactor;

import defpackage.b140;
import defpackage.igu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.v340;
import defpackage.w340;
import defpackage.w511;
import defpackage.wls;
import defpackage.x340;
import defpackage.y340;
import defpackage.z340;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz340;", "it", "Lzy11;", "<anonymous>", "(Lz340;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stop.interactor.MtStopStateInteractor$stateFlow$contentFlow$1", f = "MtStopStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopStateInteractor$stateFlow$contentFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ igu0 $stopModel;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopStateInteractor$stateFlow$contentFlow$1(igu0 igu0Var, Continuation continuation, g gVar) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$stopModel = igu0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtStopStateInteractor$stateFlow$contentFlow$1 mtStopStateInteractor$stateFlow$contentFlow$1 = new MtStopStateInteractor$stateFlow$contentFlow$1(this.$stopModel, continuation, this.this$0);
        mtStopStateInteractor$stateFlow$contentFlow$1.L$0 = obj;
        return mtStopStateInteractor$stateFlow$contentFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MtStopStateInteractor$stateFlow$contentFlow$1 mtStopStateInteractor$stateFlow$contentFlow$1 = (MtStopStateInteractor$stateFlow$contentFlow$1) create((z340) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mtStopStateInteractor$stateFlow$contentFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        z340 z340Var = (z340) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        g gVar = this.this$0;
        igu0 igu0Var = this.$stopModel;
        if (z340Var instanceof v340) {
            gVar.a.a.b(null, igu0Var.d.getAnalyticsName(), igu0Var.a);
        } else if (z340Var instanceof x340) {
            b140 b140Var = gVar.a;
            if (!b140Var.d) {
                b140Var.d = true;
                b140Var.a.b(200, igu0Var.d.getAnalyticsName(), igu0Var.a);
            }
        } else {
            gVar.getClass();
            if (!(z340Var instanceof y340) && !(z340Var instanceof w340)) {
                w511.b();
                return null;
            }
        }
        return zy11.a;
    }
}
