package ru.yandex.taxi.logistics.sdk.ui.component.control;

import defpackage.ay41;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.component.control.WheelPickerKt$WheelPicker$2$1$1", f = "WheelPicker.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class WheelPickerKt$WheelPicker$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ m3u0 $currentIndex$delegate;
    final /* synthetic */ m3u0 $isScrollInProgress$delegate;
    final /* synthetic */ tls $onValueSelected;
    final /* synthetic */ List<String> $values;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WheelPickerKt$WheelPicker$2$1$1(List list, tls tlsVar, m3u0 m3u0Var, m3u0 m3u0Var2, Continuation continuation) {
        super(2, continuation);
        this.$values = list;
        this.$onValueSelected = tlsVar;
        this.$isScrollInProgress$delegate = m3u0Var;
        this.$currentIndex$delegate = m3u0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WheelPickerKt$WheelPicker$2$1$1(this.$values, this.$onValueSelected, this.$isScrollInProgress$delegate, this.$currentIndex$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WheelPickerKt$WheelPicker$2$1$1 wheelPickerKt$WheelPicker$2$1$1 = (WheelPickerKt$WheelPicker$2$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        wheelPickerKt$WheelPicker$2$1$1.invokeSuspend(zy11Var);
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
        m3u0 m3u0Var = this.$isScrollInProgress$delegate;
        float f = ay41.a;
        if (!((Boolean) m3u0Var.getValue()).booleanValue() && !this.$values.isEmpty() && ((Number) this.$currentIndex$delegate.getValue()).intValue() < this.$values.size()) {
            this.$onValueSelected.invoke(new Integer(((Number) this.$currentIndex$delegate.getValue()).intValue()));
        }
        return zy11.a;
    }
}
