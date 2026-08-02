package ru.yandex.taxi.logistics.sdk.ui.component.control;

import defpackage.k9q0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.component.control.SegmentedComponentKt$SegmentedComponent$1$1", f = "SegmentedComponent.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SegmentedComponentKt$SegmentedComponent$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onShown;
    final /* synthetic */ k9q0 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedComponentKt$SegmentedComponent$1$1(tls tlsVar, k9q0 k9q0Var, Continuation continuation) {
        super(2, continuation);
        this.$onShown = tlsVar;
        this.$state = k9q0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SegmentedComponentKt$SegmentedComponent$1$1(this.$onShown, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SegmentedComponentKt$SegmentedComponent$1$1 segmentedComponentKt$SegmentedComponent$1$1 = (SegmentedComponentKt$SegmentedComponent$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        segmentedComponentKt$SegmentedComponent$1$1.invokeSuspend(zy11Var);
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
        this.$onShown.invoke(this.$state.c);
        return zy11.a;
    }
}
