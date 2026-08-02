package ru.yandex.taxi.due_selector.impl.domain.interactor;

import com.yandex.go.due.data.api.dto.ScheduledOrderAvailabilityRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/go/due/data/api/dto/ScheduledOrderAvailabilityResponse;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.due_selector.impl.domain.interactor.DuePickerStateInteractor$fetchState$1", f = "DuePickerStateInteractor.kt", l = {44, 44}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DuePickerStateInteractor$fetchState$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScheduledOrderAvailabilityRequest.OpenOrigin $requestNavigationSource;
    final /* synthetic */ ScheduledOrderAvailabilityRequest.ScheduledOrderView.Type $scheduledOrderViewType;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DuePickerStateInteractor$fetchState$1(d dVar, ScheduledOrderAvailabilityRequest.ScheduledOrderView.Type type, ScheduledOrderAvailabilityRequest.OpenOrigin openOrigin, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$scheduledOrderViewType = type;
        this.$requestNavigationSource = openOrigin;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DuePickerStateInteractor$fetchState$1 duePickerStateInteractor$fetchState$1 = new DuePickerStateInteractor$fetchState$1(this.this$0, this.$scheduledOrderViewType, this.$requestNavigationSource, continuation);
        duePickerStateInteractor$fetchState$1.L$0 = obj;
        return duePickerStateInteractor$fetchState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DuePickerStateInteractor$fetchState$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r8 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ScheduledOrderAvailabilityRequest a = this.this$0.a.a(this.$scheduledOrderViewType, this.$requestNavigationSource, null);
            com.yandex.go.due.data.repository.a aVar = this.this$0.a;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar;
            this.label = 1;
            obj = aVar.b(a, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}
