package ru.yandex.taxi.masstransit.ui.route.modal.collapsed;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import defpackage.d610;
import defpackage.d6z;
import defpackage.e9s;
import defpackage.g610;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesPresenter$refreshPaymentData$1", f = "MtCollapsedRoutesPresenter.kt", l = {404}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtCollapsedRoutesPresenter$refreshPaymentData$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $shouldRefreshPromo;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtCollapsedRoutesPresenter$refreshPaymentData$1(d dVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$shouldRefreshPromo = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtCollapsedRoutesPresenter$refreshPaymentData$1(this.this$0, this.$shouldRefreshPromo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtCollapsedRoutesPresenter$refreshPaymentData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Address address;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ZoneAddress zoneAddress = this.this$0.F.a().a;
            zzs B = (zoneAddress == null || (address = zoneAddress.a) == null) ? null : address.B();
            d dVar = this.this$0;
            com.yandex.go.payments.transport.domain.a aVar = dVar.P;
            g610 g610Var = dVar.T;
            Object b = g610Var.b.b();
            if (!((d610) b).b) {
                b = null;
            }
            d610 d610Var = (d610) b;
            if (d610Var == null) {
                d610Var = g610Var.a;
            }
            boolean z = d610Var.b;
            d6z.Y(d610Var, d610Var.d.c);
            e9s.b(d610Var.e.a, d610Var);
            this.L$0 = null;
            this.label = 1;
            if (aVar.a(B, z, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boolean z2 = this.$shouldRefreshPromo;
        zy11 zy11Var = zy11.a;
        if (z2) {
            ((ru.yandex.taxi.masstransit.repository.a) this.this$0.Q).e.g(zy11Var);
        }
        return zy11Var;
    }
}
