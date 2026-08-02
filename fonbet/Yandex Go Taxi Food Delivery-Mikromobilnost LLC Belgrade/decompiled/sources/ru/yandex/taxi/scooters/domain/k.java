package ru.yandex.taxi.scooters.domain;

import android.content.Context;
import defpackage.cwn0;
import defpackage.cyn0;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tse;
import defpackage.v0o0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class k implements cwn0 {
    public final Context a;
    public final tse b;
    public final tj60 c;
    public final ru.yandex.taxi.scooters.data.p d;
    public final v0o0 e;
    public pzt0 f;

    public k(Context context, tse tseVar, tj60 tj60Var, ru.yandex.taxi.scooters.data.p pVar, v0o0 v0o0Var) {
        this.a = context;
        this.b = tseVar;
        this.c = tj60Var;
        this.d = pVar;
        this.e = v0o0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(k kVar, cyn0 cyn0Var, ContinuationImpl continuationImpl) {
        ScootersMobilityHubGuidanceNotificationInteractor$handleMobilityHubContext$1 scootersMobilityHubGuidanceNotificationInteractor$handleMobilityHubContext$1;
        int i;
        tj60 tj60Var = kVar.c;
        if (continuationImpl instanceof ScootersMobilityHubGuidanceNotificationInteractor$handleMobilityHubContext$1) {
            scootersMobilityHubGuidanceNotificationInteractor$handleMobilityHubContext$1 = (ScootersMobilityHubGuidanceNotificationInteractor$handleMobilityHubContext$1) continuationImpl;
            int i2 = scootersMobilityHubGuidanceNotificationInteractor$handleMobilityHubContext$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMobilityHubGuidanceNotificationInteractor$handleMobilityHubContext$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMobilityHubGuidanceNotificationInteractor$handleMobilityHubContext$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMobilityHubGuidanceNotificationInteractor$handleMobilityHubContext$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (cyn0Var == null) {
                        tj60Var.c("SCOOTERS_MOBILITY_HUB_GUIDANCE_NOTIFICATION_ID");
                        return zy11Var;
                    }
                    scootersMobilityHubGuidanceNotificationInteractor$handleMobilityHubContext$1.L$0 = null;
                    scootersMobilityHubGuidanceNotificationInteractor$handleMobilityHubContext$1.label = 1;
                    if (kVar.c(cyn0Var, scootersMobilityHubGuidanceNotificationInteractor$handleMobilityHubContext$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ru.yandex.taxi.scooters.presentation.detailed_order.notification.a.a(tj60Var, kVar.a);
                return zy11Var;
            }
        }
        scootersMobilityHubGuidanceNotificationInteractor$handleMobilityHubContext$1 = new ScootersMobilityHubGuidanceNotificationInteractor$handleMobilityHubContext$1(kVar, continuationImpl);
        Object obj3 = scootersMobilityHubGuidanceNotificationInteractor$handleMobilityHubContext$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMobilityHubGuidanceNotificationInteractor$handleMobilityHubContext$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        ru.yandex.taxi.scooters.presentation.detailed_order.notification.a.a(tj60Var, kVar.a);
        return zy11Var2;
    }

    @Override // defpackage.cwn0
    public final void b() {
        this.f = tje.N(this.b, null, null, new ScootersMobilityHubGuidanceNotificationInteractor$onLaunch$$inlined$collectLatestIn$1(kotlinx.coroutines.flow.e.d(this.d.b), null, this), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cyn0 cyn0Var, ContinuationImpl continuationImpl) {
        ScootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$1 scootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$1;
        int i;
        if (continuationImpl instanceof ScootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$1) {
            scootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$1 = (ScootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$1) continuationImpl;
            int i2 = scootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kotlinx.coroutines.flow.internal.g gVar = this.e.e;
                    ScootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$2 scootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$2 = new ScootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$2(cyn0Var, null);
                    scootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$1.L$0 = null;
                    scootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$1.label = 1;
                    if (kotlinx.coroutines.flow.e.x(gVar, scootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$2, scootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$1) == coroutineSingletons) {
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
        scootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$1 = new ScootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$1(this, continuationImpl);
        Object obj2 = scootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    @Override // defpackage.cwn0
    public final void onDismiss() {
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.f = null;
        this.c.c("SCOOTERS_MOBILITY_HUB_GUIDANCE_NOTIFICATION_ID");
    }
}
