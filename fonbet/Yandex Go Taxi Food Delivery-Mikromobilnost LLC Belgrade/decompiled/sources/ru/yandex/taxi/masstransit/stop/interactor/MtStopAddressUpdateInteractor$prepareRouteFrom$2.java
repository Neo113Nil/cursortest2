package ru.yandex.taxi.masstransit.stop.interactor;

import com.yandex.go.address.models.ZoneAddress;
import defpackage.a140;
import defpackage.jfl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uu30;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stop.interactor.MtStopAddressUpdateInteractor$prepareRouteFrom$2", f = "MtStopAddressUpdateInteractor.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopAddressUpdateInteractor$prepareRouteFrom$2 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $point;
    final /* synthetic */ String $zoneName;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopAddressUpdateInteractor$prepareRouteFrom$2(b bVar, zzs zzsVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$point = zzsVar;
        this.$zoneName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtStopAddressUpdateInteractor$prepareRouteFrom$2(this.this$0, this.$point, this.$zoneName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtStopAddressUpdateInteractor$prepareRouteFrom$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        uu30 uu30Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            uu30 a = this.this$0.e.a();
            b bVar = this.this$0;
            zzs zzsVar = this.$point;
            String str = this.$zoneName;
            this.L$0 = a;
            this.label = 1;
            Object a2 = b.a(bVar, zzsVar, str, this);
            if (a2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            uu30Var = a;
            obj = a2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uu30Var = (uu30) this.L$0;
            kotlin.b.b(obj);
        }
        ZoneAddress zoneAddress = (ZoneAddress) obj;
        if (zoneAddress == null) {
            return Boolean.FALSE;
        }
        this.this$0.d.i(zoneAddress);
        this.this$0.d.b();
        b bVar2 = this.this$0;
        a140 a140Var = bVar2.a;
        uu30 a3 = bVar2.e.a();
        r0 r0Var = a140Var.a;
        jfl0 jfl0Var = new jfl0(uu30Var, a3);
        r0Var.getClass();
        r0Var.m(null, jfl0Var);
        return Boolean.TRUE;
    }
}
