package ru.yandex.taxi.masstransit.repository;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import defpackage.g92;
import defpackage.ha2;
import defpackage.kyh0;
import defpackage.lct0;
import defpackage.mct0;
import defpackage.mvg;
import defpackage.nc30;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.uu30;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.design.sourcedestination.DestinationTrailMode;
import ru.yandex.taxi.masstransit.domain.f;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.repository.MtAddressRepository$stateFlow$$inlined$flatMapLatest$1", f = "MtAddressRepository.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class MtAddressRepository$stateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ nc30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtAddressRepository$stateFlow$$inlined$flatMapLatest$1(Continuation continuation, nc30 nc30Var) {
        super(3, continuation);
        this.this$0 = nc30Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtAddressRepository$stateFlow$$inlined$flatMapLatest$1 mtAddressRepository$stateFlow$$inlined$flatMapLatest$1 = new MtAddressRepository$stateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        mtAddressRepository$stateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        mtAddressRepository$stateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return mtAddressRepository$stateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Address address;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            uu30 uu30Var = (uu30) obj2;
            nc30 nc30Var = this.this$0;
            nc30Var.getClass();
            mct0 mct0Var = mct0.m;
            lct0 lct0Var = new lct0();
            ZoneAddress zoneAddress = uu30Var.a;
            lct0Var.a = q5z.F(zoneAddress != null ? zoneAddress.a : null);
            List list = uu30Var.b;
            if (list.isEmpty()) {
                lct0Var.f = DestinationTrailMode.NONE;
                lct0Var.b("");
            } else if (list.size() == 1) {
                String F = q5z.F((Address) kotlin.collections.a.R(list));
                lct0Var.f = DestinationTrailMode.ADD_DESTINATION;
                lct0Var.b(F);
            } else {
                String l = q5z.l(list);
                lct0Var.f = DestinationTrailMode.ADD_DESTINATION;
                int size = list.size();
                lct0Var.d = l;
                lct0Var.l = size;
            }
            lct0Var.g = nc30Var.b.a.getString(kyh0.summary_destination_prompt);
            g92 g92Var = new g92(2, lct0Var.a());
            f fVar = this.this$0.c;
            fVar.getClass();
            ZoneAddress zoneAddress2 = uu30Var.a;
            ha2 n = e.n(g92Var, fVar.b((zoneAddress2 == null || (address = zoneAddress2.a) == null) ? null : address.getAddress().n), e.d(this.this$0.d.a), new MtAddressRepository$stateFlow$1$1(4, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(n, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
