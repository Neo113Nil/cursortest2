package ru.yandex.taxi.superapp;

import defpackage.a7z;
import defpackage.ck7;
import defpackage.gcn;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.ug7;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.eatskit.dto.LocationAvailabilityStatus;
import ru.yandex.taxi.systemrequeirements.location.LocationRequirementsException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.SuperAppSystemInfoDelegate$requestLocationAvailability$1", f = "SuperAppSystemInfoDelegate.kt", l = {58}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SuperAppSystemInfoDelegate$requestLocationAvailability$1 extends SuspendLambda implements wls {
    final /* synthetic */ gcn $callback;
    int label;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppSystemInfoDelegate$requestLocationAvailability$1(u uVar, gcn gcnVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uVar;
        this.$callback = gcnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppSystemInfoDelegate$requestLocationAvailability$1(this.this$0, this.$callback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppSystemInfoDelegate$requestLocationAvailability$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                ru.yandex.taxi.systemrequeirements.location.f fVar = this.this$0.d;
                this.label = 1;
                if (fVar.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            this.$callback.a(u.f);
        } catch (Exception e) {
            gcn gcnVar = this.$callback;
            ck7 ck7Var = u.f;
            gcnVar.a(new ck7(new a7z(LocationAvailabilityStatus.NOT_AVAILABLE), new ug7(e.getClass().getName(), e instanceof LocationRequirementsException ? ((LocationRequirementsException) e).getFailureReason().name() : e.getMessage())));
        }
        return zy11.a;
    }
}
