package ru.yandex.taxi.due_selector.impl.domain.interactor;

import com.yandex.go.due.data.api.dto.ScheduledOrderButton;
import defpackage.hwm;
import defpackage.jwm;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.swm;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.due_selector.impl.domain.entity.DuePickerButtonPosition;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.due_selector.impl.domain.interactor.DuePickerButtonsInteractor$observeScheduledOrderButtonPrice$1", f = "DuePickerButtonsInteractor.kt", l = {149}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DuePickerButtonsInteractor$observeScheduledOrderButtonPrice$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScheduledOrderButton $button;
    final /* synthetic */ DuePickerButtonPosition $position;
    final /* synthetic */ swm $state;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DuePickerButtonsInteractor$observeScheduledOrderButtonPrice$1(a aVar, DuePickerButtonPosition duePickerButtonPosition, ScheduledOrderButton scheduledOrderButton, swm swmVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$position = duePickerButtonPosition;
        this.$button = scheduledOrderButton;
        this.$state = swmVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DuePickerButtonsInteractor$observeScheduledOrderButtonPrice$1(this.this$0, this.$position, this.$button, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DuePickerButtonsInteractor$observeScheduledOrderButtonPrice$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.b(this.$position, this.$button, this.$state, hwm.b);
            this.this$0.b.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            DuePickerButtonsInteractor$observeScheduledOrderButtonPrice$1$priceState$1 duePickerButtonsInteractor$observeScheduledOrderButtonPrice$1$priceState$1 = new DuePickerButtonsInteractor$observeScheduledOrderButtonPrice$1$priceState$1(this.this$0, this.$state, null);
            this.label = 1;
            obj = tje.k0(mdhVar, duePickerButtonsInteractor$observeScheduledOrderButtonPrice$1$priceState$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.b(this.$position, this.$button, this.$state, (jwm) obj);
        return zy11.a;
    }
}
