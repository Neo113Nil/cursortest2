package ru.yandex.taxi.logistics.sdk.address_details.impl.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.address_details.impl.ui.AddressDetailsViewModel$onStaticMapClick$1", f = "AddressDetailsViewModel.kt", l = {HProv.PP_CONTAINER_STATUS}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AddressDetailsViewModel$onStaticMapClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $addressIndex;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressDetailsViewModel$onStaticMapClick$1(e eVar, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$addressIndex = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressDetailsViewModel$onStaticMapClick$1(this.this$0, this.$addressIndex, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressDetailsViewModel$onStaticMapClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.taxi.logistics.sdk.address_details.api.a aVar = this.this$0.b;
        int i2 = this.$addressIndex;
        this.label = 1;
        Object invoke = aVar.b.invoke(new Integer(i2), this);
        if (invoke != coroutineSingletons) {
            invoke = zy11Var;
        }
        return invoke == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
