package ru.yandex.taxi.masstransit.threadschedule;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.a640;
import defpackage.avj0;
import defpackage.kne0;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.myy0;
import defpackage.mz30;
import defpackage.ny61;
import defpackage.tdu;
import defpackage.v540;
import defpackage.vpr;
import defpackage.w511;
import defpackage.y540;
import defpackage.z540;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.utils.RefreshState;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvpr;", "Lz540;", "Lkotlin/Pair;", "Lru/yandex/taxi/masstransit/utils/RefreshState;", "", "<destruct>", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.threadschedule.MtThreadScheduleRefreshInteractor$refreshUiState$3", f = "MtThreadScheduleRefreshInteractor.kt", l = {58, SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE, 66, 66}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtThreadScheduleRefreshInteractor$refreshUiState$3 extends SuspendLambda implements zls {
    final /* synthetic */ mz30 $selectedVehicleRepository;
    final /* synthetic */ y540 $state;
    long J$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtThreadScheduleRefreshInteractor$refreshUiState$3(e eVar, y540 y540Var, mz30 mz30Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
        this.$state = y540Var;
        this.$selectedVehicleRepository = mz30Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtThreadScheduleRefreshInteractor$refreshUiState$3 mtThreadScheduleRefreshInteractor$refreshUiState$3 = new MtThreadScheduleRefreshInteractor$refreshUiState$3(this.this$0, this.$state, this.$selectedVehicleRepository, (Continuation) obj3);
        mtThreadScheduleRefreshInteractor$refreshUiState$3.L$0 = (vpr) obj;
        mtThreadScheduleRefreshInteractor$refreshUiState$3.L$1 = (Pair) obj2;
        return mtThreadScheduleRefreshInteractor$refreshUiState$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0136, code lost:
    
        if (r0.emit(r14, r13) == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0121, code lost:
    
        if (r14 == r2) goto L43;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long longValue;
        z540 z540Var;
        RefreshState refreshState;
        long j;
        vpr vprVar = (vpr) this.L$0;
        Pair pair = (Pair) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            RefreshState refreshState2 = (RefreshState) pair.getFirst();
            longValue = ((Number) pair.getSecond()).longValue();
            int i2 = v540.a[refreshState2.ordinal()];
            if (i2 == 1) {
                a640 a640Var = this.this$0.c;
                tdu f = a640Var.f(((avj0) a640Var.b).h(kyh0.mt_schedule_header), this.$state.a);
                ArrayList arrayList = new ArrayList(4);
                for (int i3 = 0; i3 < 4; i3++) {
                    arrayList.add(myy0.a);
                }
                z540Var = new z540(f, arrayList, (kne0) null);
            } else if (i2 == 2) {
                a640 a640Var2 = this.this$0.c;
                y540 y540Var = this.$state;
                avj0 avj0Var = (avj0) a640Var2.b;
                z540Var = new z540(a640Var2.f(avj0Var.h(kyh0.mt_schedules_title_error), y540Var.a), new kne0(avj0Var.h(kyh0.mt_refreshing), true), 2);
            } else {
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
                z540Var = null;
            }
            if (z540Var != null) {
                this.L$0 = vprVar;
                this.L$1 = null;
                this.L$2 = refreshState2;
                this.L$3 = null;
                this.J$0 = longValue;
                this.label = 1;
                if (vprVar.emit(z540Var, this) != coroutineSingletons) {
                    refreshState = refreshState2;
                }
                return coroutineSingletons;
            }
            e eVar = this.this$0;
            y540 y540Var2 = this.$state;
            mz30 mz30Var = this.$selectedVehicleRepository;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = vprVar;
            this.J$0 = longValue;
            this.label = 3;
            obj = e.a(eVar, y540Var2, mz30Var, this);
        } else if (i == 1) {
            longValue = this.J$0;
            refreshState = (RefreshState) this.L$2;
            kotlin.b.b(obj);
        } else if (i == 2) {
            j = this.J$0;
            kotlin.b.b(obj);
            longValue = j;
            e eVar2 = this.this$0;
            y540 y540Var22 = this.$state;
            mz30 mz30Var2 = this.$selectedVehicleRepository;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = vprVar;
            this.J$0 = longValue;
            this.label = 3;
            obj = e.a(eVar2, y540Var22, mz30Var2, this);
        } else {
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            long j2 = this.J$0;
            vpr vprVar2 = (vpr) this.L$4;
            kotlin.b.b(obj);
            longValue = j2;
            vprVar = vprVar2;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.J$0 = longValue;
            this.label = 4;
        }
        if (refreshState == RefreshState.ERROR_LOADING) {
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.J$0 = longValue;
            this.label = 2;
            if (kotlinx.coroutines.a.i(longValue, this) != coroutineSingletons) {
                j = longValue;
                longValue = j;
            }
            return coroutineSingletons;
        }
        e eVar22 = this.this$0;
        y540 y540Var222 = this.$state;
        mz30 mz30Var22 = this.$selectedVehicleRepository;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = vprVar;
        this.J$0 = longValue;
        this.label = 3;
        obj = e.a(eVar22, y540Var222, mz30Var22, this);
    }
}
