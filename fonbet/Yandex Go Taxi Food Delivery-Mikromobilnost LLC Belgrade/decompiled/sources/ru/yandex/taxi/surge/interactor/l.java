package ru.yandex.taxi.surge.interactor;

import com.yandex.go.zone.dto.objects.ServiceLevelWidget$Invisible;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$SurgeAlert;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$SurgeBalance;
import com.yandex.go.zone.dto.objects.e5;
import com.yandex.go.zone.dto.objects.f5;
import defpackage.bvf0;
import defpackage.jl40;
import defpackage.nrv0;
import defpackage.ny61;
import defpackage.trv0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ trv0 b;
    public final /* synthetic */ f5 c;

    public l(vpr vprVar, trv0 trv0Var, f5 f5Var) {
        this.a = vprVar;
        this.b = trv0Var;
        this.c = f5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bf, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SummaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1 summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1;
        int i;
        Object obj2;
        vpr vprVar;
        if (continuation instanceof SummaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1) {
            summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1 = (SummaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1) continuation;
            int i2 = summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$0 = null;
                    summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$1 = null;
                    summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$2 = null;
                    summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$4 = vprVar2;
                    summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$5 = null;
                    summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$6 = null;
                    summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.label = 1;
                    trv0 trv0Var = this.b;
                    trv0Var.getClass();
                    f5 f5Var = this.c;
                    if (f5Var instanceof ServiceLevelWidget$SurgeBalance) {
                        obj2 = bvf0.n(new SummaryWidgetStateInteractor$mapBalanceContent$2(trv0Var, (ServiceLevelWidget$SurgeBalance) f5Var, null), summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1);
                    } else if (f5Var instanceof ServiceLevelWidget$SurgeAlert) {
                        obj2 = bvf0.n(new SummaryWidgetStateInteractor$mapBlizzardContent$2(trv0Var, (ServiceLevelWidget$SurgeAlert) f5Var, null), summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1);
                    } else {
                        if (!jl40.l(f5Var, e5.INSTANCE) && !(f5Var instanceof ServiceLevelWidget$Invisible) && f5Var != null) {
                            w511.b();
                            return null;
                        }
                        obj2 = nrv0.a;
                    }
                    obj3 = obj2;
                    if (obj3 != coroutineSingletons) {
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                    return zy11.a;
                }
                vprVar = (vpr) summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj3);
                summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$0 = null;
                summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$1 = null;
                summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$2 = null;
                summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$3 = null;
                summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$4 = null;
                summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$5 = null;
                summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$6 = null;
                summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.label = 2;
            }
        }
        summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1 = new SummaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1(this, continuation);
        Object obj32 = summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$0 = null;
        summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$1 = null;
        summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$2 = null;
        summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$3 = null;
        summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$4 = null;
        summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$5 = null;
        summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.L$6 = null;
        summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$2$1.label = 2;
    }
}
