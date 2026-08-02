package ru.yandex.taxi.masstransit.geopayment.modal;

import defpackage.fl10;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uk30;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.modal.MtGeoPaymentLifecycleListener$subscribeToBluetoothScanPermission$1$1", f = "MtGeoPaymentLifecycleListener.kt", l = {62}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtGeoPaymentLifecycleListener$subscribeToBluetoothScanPermission$1$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ uk30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtGeoPaymentLifecycleListener$subscribeToBluetoothScanPermission$1$1(uk30 uk30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uk30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtGeoPaymentLifecycleListener$subscribeToBluetoothScanPermission$1$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtGeoPaymentLifecycleListener$subscribeToBluetoothScanPermission$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fl10 fl10Var = this.this$0.c;
            this.label = 1;
            if (((ru.yandex.taxi.masstransit.geopayment.adapter.a) fl10Var.a).a(this) == coroutineSingletons) {
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
