package ru.yandex.taxi.due_selector.impl.domain.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.swm;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.due_selector.impl.domain.interactor.price.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ljwm;", "<anonymous>", "(Ltse;)Ljwm;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.due_selector.impl.domain.interactor.DuePickerButtonsInteractor$observeScheduledOrderButtonPrice$1$priceState$1", f = "DuePickerButtonsInteractor.kt", l = {150}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DuePickerButtonsInteractor$observeScheduledOrderButtonPrice$1$priceState$1 extends SuspendLambda implements wls {
    final /* synthetic */ swm $state;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DuePickerButtonsInteractor$observeScheduledOrderButtonPrice$1$priceState$1(a aVar, swm swmVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$state = swmVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DuePickerButtonsInteractor$observeScheduledOrderButtonPrice$1$priceState$1(this.this$0, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DuePickerButtonsInteractor$observeScheduledOrderButtonPrice$1$priceState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f fVar = this.this$0.e;
        swm swmVar = this.$state;
        Calendar calendar = swmVar.d;
        String str = swmVar.b;
        boolean z = swmVar.l;
        Integer num = swmVar.m;
        this.label = 1;
        Object a = fVar.a(calendar, str, z, num, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
