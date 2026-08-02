package ru.yandex.taxi.logistics.sdk.dashboard.ui.widget;

import defpackage.lhg;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ome;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.dashboard.ui.widget.ControlKt$Control$5$1", f = "Control.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ControlKt$Control$5$1 extends SuspendLambda implements wls {
    final /* synthetic */ lhg $analyticsEventListener;
    final /* synthetic */ ome $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlKt$Control$5$1(lhg lhgVar, ome omeVar, Continuation continuation) {
        super(2, continuation);
        this.$analyticsEventListener = lhgVar;
        this.$state = omeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ControlKt$Control$5$1(this.$analyticsEventListener, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ControlKt$Control$5$1 controlKt$Control$5$1 = (ControlKt$Control$5$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        controlKt$Control$5$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        lhg.a(this.$analyticsEventListener, this.$state.b(), this.$state.a());
        return zy11.a;
    }
}
