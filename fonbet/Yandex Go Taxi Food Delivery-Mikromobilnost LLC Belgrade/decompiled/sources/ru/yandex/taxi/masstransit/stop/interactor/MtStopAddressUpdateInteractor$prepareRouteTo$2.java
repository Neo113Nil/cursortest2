package ru.yandex.taxi.masstransit.stop.interactor;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.a140;
import defpackage.atd0;
import defpackage.jfl0;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.pv0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uu30;
import defpackage.wls;
import defpackage.wu30;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stop.interactor.MtStopAddressUpdateInteractor$prepareRouteTo$2", f = "MtStopAddressUpdateInteractor.kt", l = {49, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 56}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopAddressUpdateInteractor$prepareRouteTo$2 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $point;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopAddressUpdateInteractor$prepareRouteTo$2(b bVar, zzs zzsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$point = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtStopAddressUpdateInteractor$prepareRouteTo$2(this.this$0, this.$point, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtStopAddressUpdateInteractor$prepareRouteTo$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        if (r4 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        uu30 a;
        Object A;
        pv0 pv0Var;
        ZoneAddress zoneAddress;
        Object h;
        uu30 uu30Var;
        pv0 pv0Var2;
        Object a2;
        pv0 pv0Var3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a = this.this$0.e.a();
            tpr c = atd0.c(this.this$0.b, this.$point, RoutePointType.POINT_B, null, null, null, null, 56);
            this.L$0 = a;
            this.label = 1;
            A = kotlinx.coroutines.flow.e.A(c, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pv0Var3 = (pv0) this.L$1;
                    a = (uu30) this.L$0;
                    kotlin.b.b(obj);
                    a2 = obj;
                    zoneAddress = (ZoneAddress) a2;
                    pv0Var = pv0Var3;
                    wu30 wu30Var = this.this$0.d;
                    if (zoneAddress == null) {
                        zoneAddress = new ZoneAddress((Address) null, 3);
                    }
                    wu30Var.i(zoneAddress);
                    this.this$0.d.d(pv0Var.a);
                    b bVar = this.this$0;
                    a140 a140Var = bVar.a;
                    uu30 a3 = bVar.e.a();
                    r0 r0Var = a140Var.a;
                    jfl0 jfl0Var = new jfl0(a, a3);
                    r0Var.getClass();
                    r0Var.m(null, jfl0Var);
                    return Boolean.TRUE;
                }
                pv0Var2 = (pv0) this.L$1;
                uu30 uu30Var2 = (uu30) this.L$0;
                kotlin.b.b(obj);
                uu30Var = uu30Var2;
                h = obj;
                zzs a4 = ((mo21) h).a();
                b bVar2 = this.this$0;
                this.L$0 = uu30Var;
                this.L$1 = pv0Var2;
                this.L$2 = null;
                this.label = 3;
                a2 = b.a(bVar2, a4, null, this);
                if (a2 != coroutineSingletons) {
                    pv0Var3 = pv0Var2;
                    a = uu30Var;
                    zoneAddress = (ZoneAddress) a2;
                    pv0Var = pv0Var3;
                    wu30 wu30Var2 = this.this$0.d;
                    if (zoneAddress == null) {
                    }
                    wu30Var2.i(zoneAddress);
                    this.this$0.d.d(pv0Var.a);
                    b bVar3 = this.this$0;
                    a140 a140Var2 = bVar3.a;
                    uu30 a32 = bVar3.e.a();
                    r0 r0Var2 = a140Var2.a;
                    jfl0 jfl0Var2 = new jfl0(a, a32);
                    r0Var2.getClass();
                    r0Var2.m(null, jfl0Var2);
                    return Boolean.TRUE;
                }
                return coroutineSingletons;
            }
            a = (uu30) this.L$0;
            kotlin.b.b(obj);
            A = obj;
        }
        pv0Var = (pv0) A;
        if (pv0Var == null) {
            return Boolean.FALSE;
        }
        zoneAddress = a.a;
        if (zoneAddress == null) {
            po21 po21Var = this.this$0.f;
            this.L$0 = a;
            this.L$1 = pv0Var;
            this.label = 2;
            h = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(this);
            if (h != coroutineSingletons) {
                uu30Var = a;
                pv0Var2 = pv0Var;
                zzs a42 = ((mo21) h).a();
                b bVar22 = this.this$0;
                this.L$0 = uu30Var;
                this.L$1 = pv0Var2;
                this.L$2 = null;
                this.label = 3;
                a2 = b.a(bVar22, a42, null, this);
                if (a2 != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        wu30 wu30Var22 = this.this$0.d;
        if (zoneAddress == null) {
        }
        wu30Var22.i(zoneAddress);
        this.this$0.d.d(pv0Var.a);
        b bVar32 = this.this$0;
        a140 a140Var22 = bVar32.a;
        uu30 a322 = bVar32.e.a();
        r0 r0Var22 = a140Var22.a;
        jfl0 jfl0Var22 = new jfl0(a, a322);
        r0Var22.getClass();
        r0Var22.m(null, jfl0Var22);
        return Boolean.TRUE;
    }
}
