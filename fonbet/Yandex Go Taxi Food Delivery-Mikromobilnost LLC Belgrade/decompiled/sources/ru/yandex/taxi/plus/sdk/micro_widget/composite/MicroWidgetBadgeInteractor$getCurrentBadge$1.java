package ru.yandex.taxi.plus.sdk.micro_widget.composite;

import defpackage.ioc0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.poc0;
import defpackage.soc0;
import defpackage.ve20;
import defpackage.we20;
import defpackage.xe20;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lve20;", "plaqueOnScreen", "Lpoc0;", "tablet", "Lwe20;", "<anonymous>", "(Lve20;Lpoc0;)Lwe20;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.sdk.micro_widget.composite.MicroWidgetBadgeInteractor$getCurrentBadge$1", f = "MicroWidgetBadgeInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MicroWidgetBadgeInteractor$getCurrentBadge$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ xe20 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroWidgetBadgeInteractor$getCurrentBadge$1(xe20 xe20Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = xe20Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MicroWidgetBadgeInteractor$getCurrentBadge$1 microWidgetBadgeInteractor$getCurrentBadge$1 = new MicroWidgetBadgeInteractor$getCurrentBadge$1(this.this$0, (Continuation) obj3);
        microWidgetBadgeInteractor$getCurrentBadge$1.L$0 = (ve20) obj;
        microWidgetBadgeInteractor$getCurrentBadge$1.L$1 = (poc0) obj2;
        return microWidgetBadgeInteractor$getCurrentBadge$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ve20 ve20Var = (ve20) this.L$0;
        poc0 poc0Var = (poc0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.getClass();
        ioc0 ioc0Var = ve20Var.a;
        String str = ve20Var.c;
        we20 we20Var = ioc0Var != null ? new we20(ioc0Var, str, ve20Var.b) : null;
        if (we20Var != null) {
            return we20Var;
        }
        this.this$0.getClass();
        return new we20(poc0Var, str, new soc0(kotlin.collections.b.f(), false, null));
    }
}
