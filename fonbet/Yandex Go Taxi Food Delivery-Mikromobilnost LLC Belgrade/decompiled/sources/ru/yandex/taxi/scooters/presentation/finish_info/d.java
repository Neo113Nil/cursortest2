package ru.yandex.taxi.scooters.presentation.finish_info;

import com.yandex.go.sharing_personal_goals.api.domain.model.SharingPersonalGoalsDisplayContext;
import com.yandex.go.sharing_personal_goals.api.domain.model.SharingPersonalGoalsServiceName;
import defpackage.ad5;
import defpackage.bho0;
import defpackage.cho0;
import defpackage.gei0;
import defpackage.i4b1;
import defpackage.imn0;
import defpackage.krl0;
import defpackage.kzo;
import defpackage.lbb0;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.qgn0;
import defpackage.sln0;
import defpackage.sls;
import defpackage.srr0;
import defpackage.tls;
import defpackage.tse;
import defpackage.ukn0;
import defpackage.wls;
import defpackage.wmn0;
import defpackage.wrr0;
import defpackage.y1o0;
import defpackage.zdk0;
import defpackage.zgo0;
import defpackage.zno0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class d extends ad5 {
    public final zno0 A;
    public final ru.yandex.taxi.scooters.domain.e B;
    public final qgn0 C;
    public final wrr0 D;
    public final ru.yandex.taxi.scooters.presentation.feedback.newbie.a E;
    public final zgo0 F;
    public final gei0 G;
    public final ru.yandex.taxi.scooters.presentation.finish_info.statistics.a H;
    public final sls I;
    public final tls J;
    public final zdk0 K;
    public final imn0 L;
    public final y1o0 M;
    public final wls N;
    public final ru.yandex.taxi.scooters.presentation.feedback.domain.c O;
    public final lbb0 P;
    public final tls Q;
    public pzt0 R;
    public final tse x;
    public final krl0 y;
    public final ukn0 z;

    public d(tse tseVar, krl0 krl0Var, ukn0 ukn0Var, zno0 zno0Var, ru.yandex.taxi.scooters.domain.e eVar, qgn0 qgn0Var, wrr0 wrr0Var, ru.yandex.taxi.scooters.presentation.feedback.newbie.a aVar, zgo0 zgo0Var, gei0 gei0Var, ru.yandex.taxi.scooters.presentation.finish_info.statistics.a aVar2, sls slsVar, tls tlsVar, zdk0 zdk0Var, imn0 imn0Var, y1o0 y1o0Var, wls wlsVar, ru.yandex.taxi.scooters.presentation.feedback.domain.c cVar, lbb0 lbb0Var, tls tlsVar2) {
        super(wmn0.class);
        this.x = tseVar;
        this.y = krl0Var;
        this.z = ukn0Var;
        this.A = zno0Var;
        this.B = eVar;
        this.C = qgn0Var;
        this.D = wrr0Var;
        this.E = aVar;
        this.F = zgo0Var;
        this.G = gei0Var;
        this.H = aVar2;
        this.I = slsVar;
        this.J = tlsVar;
        this.K = zdk0Var;
        this.L = imn0Var;
        this.M = y1o0Var;
        this.N = wlsVar;
        this.O = cVar;
        this.P = lbb0Var;
        this.Q = tlsVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(1:10)(2:28|29))(3:30|31|(1:33))|11|(4:13|(3:15|(1:17)|(1:21))(1:25)|22|23)|27|(0)(0)|22|23))|37|6|7|(0)(0)|11|(0)|27|(0)(0)|22|23|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
    
        throw r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[Catch: all -> 0x004c, CancellationException -> 0x0077, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0077, all -> 0x004c, blocks: (B:10:0x0027, B:11:0x0043, B:13:0x0047, B:31:0x0034), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r7v9, types: [eho0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(d dVar, ContinuationImpl continuationImpl) {
        ScootersFinishInfoPresenter$loadSharingPersonalGoals$1 scootersFinishInfoPresenter$loadSharingPersonalGoals$1;
        int i;
        cho0 cho0Var;
        bho0 bho0Var;
        srr0 srr0Var;
        dVar.getClass();
        if (continuationImpl instanceof ScootersFinishInfoPresenter$loadSharingPersonalGoals$1) {
            scootersFinishInfoPresenter$loadSharingPersonalGoals$1 = (ScootersFinishInfoPresenter$loadSharingPersonalGoals$1) continuationImpl;
            int i2 = scootersFinishInfoPresenter$loadSharingPersonalGoals$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersFinishInfoPresenter$loadSharingPersonalGoals$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersFinishInfoPresenter$loadSharingPersonalGoals$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersFinishInfoPresenter$loadSharingPersonalGoals$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    wrr0 wrr0Var = dVar.D;
                    SharingPersonalGoalsServiceName sharingPersonalGoalsServiceName = SharingPersonalGoalsServiceName.SCOOTERS;
                    SharingPersonalGoalsDisplayContext sharingPersonalGoalsDisplayContext = SharingPersonalGoalsDisplayContext.RIDE_FINISH;
                    scootersFinishInfoPresenter$loadSharingPersonalGoals$1.label = 1;
                    obj = wrr0Var.a(sharingPersonalGoalsServiceName, sharingPersonalGoalsDisplayContext, scootersFinishInfoPresenter$loadSharingPersonalGoals$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                srr0Var = (srr0) obj;
                if (srr0Var != null) {
                    cho0Var = i4b1.e(srr0Var);
                    if (cho0Var != null) {
                        ((wmn0) dVar.Dg()).V1(cho0Var);
                        cho0 cho0Var2 = cho0Var instanceof cho0 ? cho0Var : null;
                        if (cho0Var2 != null && (bho0Var = cho0Var2.e) != null) {
                            dVar.Q.invoke(bho0Var);
                        }
                    } else {
                        ((wmn0) dVar.Dg()).V1(null);
                    }
                    return zy11.a;
                }
                cho0Var = null;
                if (cho0Var != null) {
                }
                return zy11.a;
            }
        }
        scootersFinishInfoPresenter$loadSharingPersonalGoals$1 = new ScootersFinishInfoPresenter$loadSharingPersonalGoals$1(dVar, continuationImpl);
        Object obj2 = scootersFinishInfoPresenter$loadSharingPersonalGoals$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersFinishInfoPresenter$loadSharingPersonalGoals$1.label;
        if (i != 0) {
        }
        srr0Var = (srr0) obj2;
        if (srr0Var != null) {
        }
        cho0Var = null;
        if (cho0Var != null) {
        }
        return zy11.a;
    }

    public final void Lg() {
        kzo kzoVar = this.O.e;
        if (kzoVar.b) {
            kzoVar.b = false;
            if (((sln0) kzoVar.c).a) {
                ((wmn0) Dg()).dd();
            }
        }
    }
}
