package ru.yandex.taxi.address.clarification.impl.ui;

import defpackage.eci0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sy0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.address.clarification.impl.ui.AddressMapPickerAdjustmentRouterImpl$onLaunch$1", f = "AddressMapPickerAdjustmentRouterImpl.kt", l = {HProv.PP_FAST_CODE}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AddressMapPickerAdjustmentRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ sy0 $payload;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerAdjustmentRouterImpl$onLaunch$1(sy0 sy0Var, Continuation continuation, d dVar) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$payload = sy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressMapPickerAdjustmentRouterImpl$onLaunch$1(this.$payload, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressMapPickerAdjustmentRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            eci0 c = e.c(this.this$0.J.g);
            d dVar = this.this$0;
            sy0 sy0Var = this.$payload;
            o oVar = new o(c, new AddressMapPickerAdjustmentRouterImpl$onLaunch$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            a aVar = new a(i2, dVar, sy0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(aVar, this) == coroutineSingletons) {
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
