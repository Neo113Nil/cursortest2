package ru.yandex.taxi.logistics.deliveries.map.android;

import defpackage.f4c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rdi;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.deliveries.map.android.DeliveryPinUpdater$loadIcon$1", f = "DeliveryPinUpdater.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryPinUpdater$loadIcon$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $iconProvider;
    final /* synthetic */ f4c0 $placemark;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryPinUpdater$loadIcon$1(tls tlsVar, f4c0 f4c0Var, Continuation continuation) {
        super(2, continuation);
        this.$iconProvider = tlsVar;
        this.$placemark = f4c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryPinUpdater$loadIcon$1(this.$iconProvider, this.$placemark, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryPinUpdater$loadIcon$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tls tlsVar = this.$iconProvider;
            this.label = 1;
            obj = tlsVar.invoke(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        rdi rdiVar = (rdi) obj;
        this.$placemark.z(rdiVar.a, rdiVar.b);
        return zy11.a;
    }
}
