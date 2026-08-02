package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.rover;

import defpackage.ao;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tgl0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lao;", "actionRover", "", "isOpeningInProgress", "", "Ltgl0;", "<anonymous>", "(Lao;Z)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.rover.RoverStateHolder$widgetModelFlow$2", f = "RoverStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class RoverStateHolder$widgetModelFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoverStateHolder$widgetModelFlow$2(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        RoverStateHolder$widgetModelFlow$2 roverStateHolder$widgetModelFlow$2 = new RoverStateHolder$widgetModelFlow$2(this.this$0, (Continuation) obj3);
        roverStateHolder$widgetModelFlow$2.L$0 = (ao) obj;
        roverStateHolder$widgetModelFlow$2.Z$0 = booleanValue;
        return roverStateHolder$widgetModelFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ao aoVar = (ao) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        tgl0 tgl0Var = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (aoVar != null) {
            this.this$0.b.getClass();
            tgl0Var = new tgl0(aoVar.a, !z, z);
        }
        return scc.h(tgl0Var);
    }
}
