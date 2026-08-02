package ru.yandex.taxi.am;

import com.yandex.passport.api.PassportLatLng;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.PassportAnticrisisParamsUpdater$onAppCreated$1", f = "PassportAnticrisisParamsUpdater.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PassportAnticrisisParamsUpdater$onAppCreated$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ m0 this$0;

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00030\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/yandex/passport/api/PassportLatLng;", "", "", "", "geoLocation", "vpnParams"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "ru.yandex.taxi.am.PassportAnticrisisParamsUpdater$onAppCreated$1$1", f = "PassportAnticrisisParamsUpdater.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.am.PassportAnticrisisParamsUpdater$onAppCreated$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
            anonymousClass1.L$0 = (PassportLatLng) obj;
            anonymousClass1.L$1 = (Map) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PassportLatLng passportLatLng = (PassportLatLng) this.L$0;
            Map map = (Map) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return new Pair(passportLatLng, map);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportAnticrisisParamsUpdater$onAppCreated$1(m0 m0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = m0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassportAnticrisisParamsUpdater$onAppCreated$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PassportAnticrisisParamsUpdater$onAppCreated$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m0 m0Var = this.this$0;
            kotlinx.coroutines.flow.m0 m0Var2 = new kotlinx.coroutines.flow.m0(kotlinx.coroutines.flow.e.t(new i0(new mth(new kotlinx.coroutines.flow.j0(null, new kotlinx.coroutines.flow.m0(new mth(m0Var.d.b, 6), kotlinx.coroutines.flow.e.t(new com.yandex.go.zone.repository.c(ru.yandex.taxi.experiments.d.b(m0Var.f.b))), new PassportAnticrisisParamsUpdater$createDeviceGeoLocationFlow$1(3, null)), new PassportAnticrisisParamsUpdater$createDeviceGeoLocationFlow$2(3, null)), 4))), new k0(this.this$0.f.a()), new AnonymousClass1(3, null));
            this.this$0.b.getClass();
            tpr F = kotlinx.coroutines.flow.e.F(m0Var2, uyj.a);
            l0 l0Var = new l0(this.this$0);
            this.label = 1;
            if (F.collect(l0Var, this) == coroutineSingletons) {
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
