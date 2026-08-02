package ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.ys0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "Lzy11;", "<anonymous>", "(I)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.AddressDetailsInteractor$openDetails$2", f = "AddressDetailsInteractor.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AddressDetailsInteractor$openDetails$2 extends SuspendLambda implements wls {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressDetailsInteractor$openDetails$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AddressDetailsInteractor$openDetails$2 addressDetailsInteractor$openDetails$2 = new AddressDetailsInteractor$openDetails$2(this.this$0, continuation);
        addressDetailsInteractor$openDetails$2.I$0 = ((Number) obj).intValue();
        return addressDetailsInteractor$openDetails$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressDetailsInteractor$openDetails$2) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            c cVar = aVar.o;
            ys0 ys0Var = new ys0(aVar, i, 0);
            this.I$0 = i;
            this.label = 1;
            if (cVar.a(i, ys0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
