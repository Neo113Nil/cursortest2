package ru.yandex.taxi.masstransit.trains.schedule;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.b611;
import defpackage.hh40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o950;
import defpackage.pj40;
import defpackage.smw0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.xf40;
import defpackage.yqg;
import defpackage.zg40;
import defpackage.zqg;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$ScheduleEntryPointSource;
import ru.yandex.taxi.masstransit.trains.schedule.dto.MtScheduleScenario;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.schedule.MtTrainScheduleModalRouter$onLaunch$1", f = "MtTrainScheduleModalRouter.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtTrainScheduleModalRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ hh40 $payload;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.trains.schedule.MtTrainScheduleModalRouter$onLaunch$1$1", f = "MtTrainScheduleModalRouter.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.trains.schedule.MtTrainScheduleModalRouter$onLaunch$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ hh40 $payload;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e eVar, hh40 hh40Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
            this.$payload = hh40Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$payload, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                f fVar = this.this$0.S;
                hh40 hh40Var = this.$payload;
                String str = hh40Var.a;
                String str2 = hh40Var.b;
                pj40 pj40Var = hh40Var.c;
                this.label = 1;
                Map f = kotlin.collections.b.f();
                yqg yqgVar = fVar.e;
                Calendar calendar = Calendar.getInstance();
                yqgVar.getClass();
                String a = zqg.a(calendar);
                zg40 zg40Var = new zg40(a, str, str2, f, MtScheduleScenario.V2, 72);
                ArrayList o = tcc.o(zg40Var.d.values());
                ArrayList arrayList = o.isEmpty() ? null : o;
                xf40 xf40Var = fVar.b;
                String str3 = a == null ? "" : a;
                String str4 = zg40Var.b;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = zg40Var.c;
                if (str5 == null) {
                    str5 = "";
                }
                if (a == null) {
                    a = "";
                }
                b611 b611Var = xf40Var.a;
                TransportRouteAnalytics$ScheduleEntryPointSource transportRouteAnalytics$ScheduleEntryPointSource = xf40Var.b.a;
                TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin = xf40Var.c;
                String str6 = pj40Var.a;
                String str7 = pj40Var.b;
                HashMap o2 = smw0.o(b611Var);
                o2.put("source", transportRouteAnalytics$ScheduleEntryPointSource.getEventValue());
                o2.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
                o2.put("date_tab", a);
                o2.put("selected_date", str3);
                o2.put("start_stop_id", str4);
                o2.put("final_stop_id", str5);
                if (arrayList != null) {
                    o2.put("selected_filters_id", arrayList);
                }
                if (str6 != null) {
                    o2.put("utm_source", str6);
                }
                if (str7 != null) {
                    o2.put("utm_medium", str7);
                }
                b611Var.a.a("TransportRoute.Schedule.Shown", o2, 4, new HashMap());
                if (fVar.a(zg40Var, pj40Var, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTrainScheduleModalRouter$onLaunch$1(e eVar, hh40 hh40Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$payload = hh40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTrainScheduleModalRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTrainScheduleModalRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o950 lifecycle = this.this$0.getLifecycle();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$payload, null);
            this.label = 1;
            if (b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
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
