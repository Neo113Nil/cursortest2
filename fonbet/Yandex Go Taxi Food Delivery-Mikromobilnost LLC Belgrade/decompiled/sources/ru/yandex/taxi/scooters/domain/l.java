package ru.yandex.taxi.scooters.domain;

import defpackage.cwn0;
import defpackage.cyn0;
import defpackage.dyn0;
import defpackage.eyn0;
import defpackage.f4b1;
import defpackage.kyn0;
import defpackage.ny61;
import defpackage.nyn0;
import defpackage.pqm0;
import defpackage.pzt0;
import defpackage.q5o0;
import defpackage.r5o0;
import defpackage.s5o0;
import defpackage.t5o0;
import defpackage.tje;
import defpackage.tse;
import defpackage.u5o0;
import defpackage.uh6;
import defpackage.v5o0;
import defpackage.w511;
import defpackage.ymn0;
import defpackage.yvf0;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.model.ScootersMobilityHubFinishResolution;

/* loaded from: classes6.dex */
public final class l implements cwn0 {
    public final tse a;
    public final nyn0 b;
    public final pqm0 c;
    public final yvf0 d;
    public final ru.yandex.taxi.scooters.data.g e;
    public final v5o0 f;
    public final kyn0 g;
    public pzt0 h;

    public l(tse tseVar, nyn0 nyn0Var, pqm0 pqm0Var, yvf0 yvf0Var, ru.yandex.taxi.scooters.data.g gVar, v5o0 v5o0Var, kyn0 kyn0Var) {
        this.a = tseVar;
        this.b = nyn0Var;
        this.c = pqm0Var;
        this.d = yvf0Var;
        this.e = gVar;
        this.f = v5o0Var;
        this.g = kyn0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l lVar, zuo0 zuo0Var, Continuation continuation) {
        ScootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1 scootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1;
        int i;
        t5o0 t5o0Var;
        lVar.getClass();
        if (continuation instanceof ScootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1) {
            scootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1 = (ScootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1) continuation;
            int i2 = scootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ScootersMobilityHubFinishResolution scootersMobilityHubFinishResolution = (ScootersMobilityHubFinishResolution) ((r0) lVar.g.b).getValue();
                    boolean y = uh6.y(lVar.e.a());
                    if (lVar.b.a(zuo0Var.getSessionId())) {
                        scootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1.L$0 = null;
                        scootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1.L$1 = null;
                        scootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1.Z$0 = y;
                        scootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1.label = 2;
                        obj = lVar.d(zuo0Var, scootersMobilityHubFinishResolution, scootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1);
                    } else {
                        scootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1.L$0 = null;
                        scootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1.L$1 = null;
                        scootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1.Z$0 = y;
                        scootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1.label = 1;
                        obj = lVar.e(zuo0Var, y, scootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1);
                    }
                    return obj2;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    t5o0Var = (t5o0) obj;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    t5o0Var = (t5o0) obj;
                }
                v5o0 v5o0Var = lVar.f;
                zy11 zy11Var = zy11.a;
                if (t5o0Var != null) {
                    return zy11Var;
                }
                v5o0Var.a(t5o0Var);
                return zy11Var;
            }
        }
        scootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1 = new ScootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1(lVar, continuation);
        Object obj3 = scootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOrderCompletionDirectiveLifecycleInteractor$handleSessionDisappearance$1.label;
        if (i != 0) {
        }
        v5o0 v5o0Var2 = lVar.f;
        zy11 zy11Var2 = zy11.a;
        if (t5o0Var != null) {
        }
    }

    @Override // defpackage.cwn0
    public final void b() {
        if (this.h != null) {
            return;
        }
        this.h = tje.N(this.a, null, null, new ScootersOrderCompletionDirectiveLifecycleInteractor$onLaunch$1(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r6.f.a.emit(r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1 scootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1;
        int i;
        if (continuationImpl instanceof ScootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1) {
            scootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1 = (ScootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1) continuationImpl;
            int i2 = scootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    s5o0 s5o0Var = s5o0.a;
                    scootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1.L$0 = zuo0Var;
                    scootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    zuo0Var = (zuo0) scootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1.L$0;
                    kotlin.b.b(obj);
                }
                ru.yandex.taxi.scooters.presentation.finish_info.b bVar = (ru.yandex.taxi.scooters.presentation.finish_info.b) this.d.get();
                scootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1.L$0 = null;
                scootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1.label = 2;
                Object a = bVar.a(zuo0Var, scootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1);
                return a != coroutineSingletons ? coroutineSingletons : a;
            }
        }
        scootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1 = new ScootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1(this, continuationImpl);
        Object obj2 = scootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1.label;
        if (i != 0) {
        }
        ru.yandex.taxi.scooters.presentation.finish_info.b bVar2 = (ru.yandex.taxi.scooters.presentation.finish_info.b) this.d.get();
        scootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1.L$0 = null;
        scootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1.label = 2;
        Object a2 = bVar2.a(zuo0Var, scootersOrderCompletionDirectiveLifecycleInteractor$getFinishInfo$1);
        if (a2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(zuo0 zuo0Var, ScootersMobilityHubFinishResolution scootersMobilityHubFinishResolution, ContinuationImpl continuationImpl) {
        ScootersOrderCompletionDirectiveLifecycleInteractor$resolveMobilityHubCompletion$1 scootersOrderCompletionDirectiveLifecycleInteractor$resolveMobilityHubCompletion$1;
        int i;
        int i2;
        nyn0 nyn0Var = this.b;
        s5o0 s5o0Var = s5o0.b;
        if (continuationImpl instanceof ScootersOrderCompletionDirectiveLifecycleInteractor$resolveMobilityHubCompletion$1) {
            scootersOrderCompletionDirectiveLifecycleInteractor$resolveMobilityHubCompletion$1 = (ScootersOrderCompletionDirectiveLifecycleInteractor$resolveMobilityHubCompletion$1) continuationImpl;
            int i3 = scootersOrderCompletionDirectiveLifecycleInteractor$resolveMobilityHubCompletion$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersOrderCompletionDirectiveLifecycleInteractor$resolveMobilityHubCompletion$1.label = i3 - Integer.MIN_VALUE;
                Object obj = scootersOrderCompletionDirectiveLifecycleInteractor$resolveMobilityHubCompletion$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOrderCompletionDirectiveLifecycleInteractor$resolveMobilityHubCompletion$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!f4b1.d(zuo0Var)) {
                        cyn0 b = nyn0Var.b.b();
                        if (b != null) {
                            nyn0Var.c.a(new dyn0(b.b));
                            ru.yandex.taxi.scooters.data.p pVar = nyn0Var.b;
                            pVar.c = true;
                            pVar.b.l(null);
                            pVar.a();
                            nyn0Var.a.a.l(null);
                            return s5o0Var;
                        }
                        return s5o0Var;
                    }
                    scootersOrderCompletionDirectiveLifecycleInteractor$resolveMobilityHubCompletion$1.L$0 = null;
                    scootersOrderCompletionDirectiveLifecycleInteractor$resolveMobilityHubCompletion$1.L$1 = scootersMobilityHubFinishResolution;
                    scootersOrderCompletionDirectiveLifecycleInteractor$resolveMobilityHubCompletion$1.label = 1;
                    obj = c(zuo0Var, scootersOrderCompletionDirectiveLifecycleInteractor$resolveMobilityHubCompletion$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    scootersMobilityHubFinishResolution = (ScootersMobilityHubFinishResolution) scootersOrderCompletionDirectiveLifecycleInteractor$resolveMobilityHubCompletion$1.L$1;
                    kotlin.b.b(obj);
                }
                ymn0 ymn0Var = (ymn0) obj;
                String str = ymn0Var == null ? ymn0Var.a.d : null;
                i2 = u5o0.a[scootersMobilityHubFinishResolution.ordinal()];
                if (i2 != 1) {
                    cyn0 b2 = nyn0Var.b.b();
                    if (b2 != null) {
                        nyn0Var.c.a(new eyn0(b2.b, str));
                        ru.yandex.taxi.scooters.data.p pVar2 = nyn0Var.b;
                        pVar2.c = true;
                        pVar2.b.l(null);
                        pVar2.a();
                        nyn0Var.a.a.l(null);
                        return s5o0Var;
                    }
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    cyn0 b3 = nyn0Var.b.b();
                    if (b3 != null) {
                        nyn0Var.c.a(new dyn0(b3.b));
                        ru.yandex.taxi.scooters.data.p pVar3 = nyn0Var.b;
                        pVar3.c = true;
                        pVar3.b.l(null);
                        pVar3.a();
                        nyn0Var.a.a.l(null);
                        return s5o0Var;
                    }
                }
                return s5o0Var;
            }
        }
        scootersOrderCompletionDirectiveLifecycleInteractor$resolveMobilityHubCompletion$1 = new ScootersOrderCompletionDirectiveLifecycleInteractor$resolveMobilityHubCompletion$1(this, continuationImpl);
        Object obj3 = scootersOrderCompletionDirectiveLifecycleInteractor$resolveMobilityHubCompletion$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOrderCompletionDirectiveLifecycleInteractor$resolveMobilityHubCompletion$1.label;
        if (i != 0) {
        }
        ymn0 ymn0Var2 = (ymn0) obj3;
        if (ymn0Var2 == null) {
        }
        i2 = u5o0.a[scootersMobilityHubFinishResolution.ordinal()];
        if (i2 != 1) {
        }
        return s5o0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(zuo0 zuo0Var, boolean z, ContinuationImpl continuationImpl) {
        ScootersOrderCompletionDirectiveLifecycleInteractor$resolvePlainCompletion$1 scootersOrderCompletionDirectiveLifecycleInteractor$resolvePlainCompletion$1;
        int i;
        if (continuationImpl instanceof ScootersOrderCompletionDirectiveLifecycleInteractor$resolvePlainCompletion$1) {
            scootersOrderCompletionDirectiveLifecycleInteractor$resolvePlainCompletion$1 = (ScootersOrderCompletionDirectiveLifecycleInteractor$resolvePlainCompletion$1) continuationImpl;
            int i2 = scootersOrderCompletionDirectiveLifecycleInteractor$resolvePlainCompletion$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOrderCompletionDirectiveLifecycleInteractor$resolvePlainCompletion$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersOrderCompletionDirectiveLifecycleInteractor$resolvePlainCompletion$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOrderCompletionDirectiveLifecycleInteractor$resolvePlainCompletion$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!f4b1.d(zuo0Var)) {
                        if (z) {
                            return s5o0.b;
                        }
                        return null;
                    }
                    scootersOrderCompletionDirectiveLifecycleInteractor$resolvePlainCompletion$1.L$0 = null;
                    scootersOrderCompletionDirectiveLifecycleInteractor$resolvePlainCompletion$1.Z$0 = z;
                    scootersOrderCompletionDirectiveLifecycleInteractor$resolvePlainCompletion$1.label = 1;
                    obj = c(zuo0Var, scootersOrderCompletionDirectiveLifecycleInteractor$resolvePlainCompletion$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = scootersOrderCompletionDirectiveLifecycleInteractor$resolvePlainCompletion$1.Z$0;
                    kotlin.b.b(obj);
                }
                ymn0 ymn0Var = (ymn0) obj;
                return !z ? new r5o0(ymn0Var) : new q5o0(ymn0Var);
            }
        }
        scootersOrderCompletionDirectiveLifecycleInteractor$resolvePlainCompletion$1 = new ScootersOrderCompletionDirectiveLifecycleInteractor$resolvePlainCompletion$1(this, continuationImpl);
        Object obj3 = scootersOrderCompletionDirectiveLifecycleInteractor$resolvePlainCompletion$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOrderCompletionDirectiveLifecycleInteractor$resolvePlainCompletion$1.label;
        if (i != 0) {
        }
        ymn0 ymn0Var2 = (ymn0) obj3;
        if (!z) {
        }
    }

    @Override // defpackage.cwn0
    public final void onDismiss() {
        pzt0 pzt0Var = this.h;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.h = null;
    }
}
