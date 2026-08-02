package ru.yandex.taxi.superapp.knownOrder;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.knownOrder.KnownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$3", f = "KnownOrdersRepositoryImpl.kt", l = {288}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class KnownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$3 extends SuspendLambda implements zls {
    final /* synthetic */ boolean $includePending$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KnownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$3(boolean z, Continuation continuation) {
        super(3, continuation);
        this.$includePending$inlined = z;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        KnownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$3 knownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$3 = new KnownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$3(this.$includePending$inlined, (Continuation) obj3);
        knownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$3.L$0 = (vpr) obj;
        knownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return knownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ArrayList arrayList = new ArrayList();
            for (TaxiOrder taxiOrder : (TaxiOrder[]) objArr) {
                if (this.$includePending$inlined || taxiOrder.C()) {
                    arrayList.add(taxiOrder);
                }
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(arrayList, this) == coroutineSingletons) {
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
