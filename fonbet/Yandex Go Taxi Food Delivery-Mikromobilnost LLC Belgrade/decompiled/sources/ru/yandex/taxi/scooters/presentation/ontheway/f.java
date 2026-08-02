package ru.yandex.taxi.scooters.presentation.ontheway;

import com.yandex.go.scooters.api.domain.model.ScootersVehicleType;
import defpackage.acn0;
import defpackage.ad5;
import defpackage.b5o0;
import defpackage.cgn0;
import defpackage.cyx;
import defpackage.d5o0;
import defpackage.dvw;
import defpackage.e9n0;
import defpackage.ea90;
import defpackage.egn0;
import defpackage.f4b1;
import defpackage.fgn0;
import defpackage.fll0;
import defpackage.fpb;
import defpackage.gtq0;
import defpackage.h6o0;
import defpackage.hen0;
import defpackage.hz7;
import defpackage.ico0;
import defpackage.ign0;
import defpackage.iin0;
import defpackage.j1;
import defpackage.j18;
import defpackage.jco0;
import defpackage.kco0;
import defpackage.kyh0;
import defpackage.l050;
import defpackage.l8x;
import defpackage.lhn0;
import defpackage.lrj0;
import defpackage.lwo0;
import defpackage.m1k;
import defpackage.m950;
import defpackage.mth;
import defpackage.nqm0;
import defpackage.ny61;
import defpackage.nyn0;
import defpackage.ojb0;
import defpackage.po21;
import defpackage.pyn0;
import defpackage.pzt0;
import defpackage.qwo0;
import defpackage.r6b;
import defpackage.sls;
import defpackage.t8n0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tmm0;
import defpackage.tse;
import defpackage.uq1;
import defpackage.wxm0;
import defpackage.x4o0;
import defpackage.zjn0;
import defpackage.zuo0;
import defpackage.zy11;
import defpackage.zzc;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.scooters.data.g;
import ru.yandex.taxi.scooters.data.u;
import ru.yandex.taxi.scooters.presentation.ontheway.domain.model.ScootersOnTheWayAction;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes6.dex */
public final class f extends ad5 {
    public final hen0 A;
    public final qwo0 B;
    public final ru.yandex.taxi.scooters.domain.f C;
    public final cyx D;
    public final h6o0 E;
    public final u F;
    public final nyn0 G;
    public final ru.yandex.taxi.scooters.presentation.ontheway.lock.domain.a H;
    public final nqm0 I;
    public final b5o0 J;
    public final kco0 K;
    public final x4o0 L;
    public final g M;
    public final ign0 N;
    public final wxm0 O;
    public final fll0 P;
    public final jco0 Q;
    public final ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.d R;
    public final lhn0 S;
    public pzt0 T;
    public final tse x;
    public final uq1 y;
    public final po21 z;

    public f(tse tseVar, uq1 uq1Var, po21 po21Var, hen0 hen0Var, qwo0 qwo0Var, ru.yandex.taxi.scooters.domain.f fVar, cyx cyxVar, h6o0 h6o0Var, u uVar, nyn0 nyn0Var, ru.yandex.taxi.scooters.presentation.ontheway.lock.domain.a aVar, nqm0 nqm0Var, b5o0 b5o0Var, kco0 kco0Var, x4o0 x4o0Var, g gVar, ign0 ign0Var, wxm0 wxm0Var, fll0 fll0Var, jco0 jco0Var, ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.d dVar, fgn0 fgn0Var) {
        super(l050.class);
        this.x = tseVar;
        this.y = uq1Var;
        this.z = po21Var;
        this.A = hen0Var;
        this.B = qwo0Var;
        this.C = fVar;
        this.D = cyxVar;
        this.E = h6o0Var;
        this.F = uVar;
        this.G = nyn0Var;
        this.H = aVar;
        this.I = nqm0Var;
        this.J = b5o0Var;
        this.K = kco0Var;
        this.L = x4o0Var;
        this.M = gVar;
        this.N = ign0Var;
        this.O = wxm0Var;
        this.P = fll0Var;
        this.Q = jco0Var;
        this.R = dVar;
        this.S = fgn0Var;
    }

    public static final void Kg(f fVar, zuo0 zuo0Var) {
        ru.yandex.taxi.scooters.domain.f fVar2 = fVar.C;
        String sessionId = zuo0Var.getSessionId();
        l8x l8xVar = (l8x) fVar2.d.c.remove(sessionId);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        acn0 acn0Var = fVar2.c;
        r0 r0Var = acn0Var.a;
        r0Var.m(null, kotlin.collections.b.j(sessionId, (Map) r0Var.getValue()));
        String sessionId2 = zuo0Var.getSessionId();
        acn0Var.c(sessionId2, ojb0.a);
        acn0Var.c.remove(sessionId2);
    }

    public static final Object Lg(f fVar, zuo0 zuo0Var, Continuation continuation) {
        if (fVar.C.e(zuo0Var.getSessionId()) <= 0) {
            return Boolean.FALSE;
        }
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        AlertDialog positiveButton = fVar.y.a().setTitle(kyh0.scooters_dismiss_title).setNegativeButton(kyh0.scooters_remove, new r6b(j18Var, 3)).setPositiveButton(kyh0.scooters_save, new r6b(j18Var, 4));
        j18Var.w(new j1(25, positiveButton));
        positiveButton.show();
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Mg(f fVar, ContinuationImpl continuationImpl) {
        ScootersOnTheWayPresenter$tryStartParkingValidationTimer$1 scootersOnTheWayPresenter$tryStartParkingValidationTimer$1;
        int i;
        ico0 ico0Var;
        fVar.getClass();
        if (continuationImpl instanceof ScootersOnTheWayPresenter$tryStartParkingValidationTimer$1) {
            scootersOnTheWayPresenter$tryStartParkingValidationTimer$1 = (ScootersOnTheWayPresenter$tryStartParkingValidationTimer$1) continuationImpl;
            int i2 = scootersOnTheWayPresenter$tryStartParkingValidationTimer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOnTheWayPresenter$tryStartParkingValidationTimer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersOnTheWayPresenter$tryStartParkingValidationTimer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOnTheWayPresenter$tryStartParkingValidationTimer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jco0 jco0Var = fVar.Q;
                    scootersOnTheWayPresenter$tryStartParkingValidationTimer$1.label = 1;
                    obj = jco0Var.a.b(scootersOnTheWayPresenter$tryStartParkingValidationTimer$1);
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
                ico0Var = (ico0) obj;
                if (ico0Var.b) {
                    kco0 kco0Var = fVar.K;
                    long j = ico0Var.c;
                    kco0Var.a = Long.valueOf(System.currentTimeMillis());
                    kco0Var.b = j;
                }
                return zy11.a;
            }
        }
        scootersOnTheWayPresenter$tryStartParkingValidationTimer$1 = new ScootersOnTheWayPresenter$tryStartParkingValidationTimer$1(fVar, continuationImpl);
        Object obj2 = scootersOnTheWayPresenter$tryStartParkingValidationTimer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOnTheWayPresenter$tryStartParkingValidationTimer$1.label;
        if (i != 0) {
        }
        ico0Var = (ico0) obj2;
        if (ico0Var.b) {
        }
        return zy11.a;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Bg(l050 l050Var) {
        super.Bg(l050Var);
        tje.N(Jg(), null, null, new ScootersOnTheWayPresenter$listenDeposit$$inlined$collectIn$1(new com.yandex.go.scooters.deposit.data.b(new mth(this.A.a, 6)), null, this), 3);
        tje.N(Jg(), null, null, new ScootersOnTheWayPresenter$attachView$$inlined$collectLatestIn$1(this.F.a(), null, this), 3);
    }

    public final void Ng(zuo0 zuo0Var, ScootersOnTheWayAction scootersOnTheWayAction) {
        Sg(zuo0Var.getSessionId(), scootersOnTheWayAction);
        d5o0 d5o0Var = new d5o0(this, zuo0Var, 0);
        tmm0 tmm0Var = new tmm0(27, gtq0.t(Jg(), new iin0(9, d5o0Var)), d5o0Var);
        if (!f4b1.d(zuo0Var)) {
            Ug(zuo0Var, hz7.a, tmm0Var);
            return;
        }
        a aVar = new a(this, zuo0Var, tmm0Var, 3);
        if (!this.G.a(zuo0Var.getSessionId())) {
            aVar.invoke();
            return;
        }
        ScootersVehicleType q = zuo0Var.q();
        ru.yandex.taxi.scooters.presentation.detailed_order.v2.a aVar2 = ((fgn0) this.S).a;
        aVar2.A((m950) aVar2.b0.get(), new pyn0(q), new cgn0(aVar, aVar));
    }

    public final void Og(final zuo0 zuo0Var, ScootersOnTheWayAction scootersOnTheWayAction) {
        Sg(zuo0Var.getSessionId(), scootersOnTheWayAction);
        final d5o0 d5o0Var = new d5o0(this, zuo0Var, 1);
        final m1k t = gtq0.t(Jg(), new iin0(10, d5o0Var));
        sls slsVar = new sls() { // from class: ru.yandex.taxi.scooters.presentation.ontheway.c
            @Override // defpackage.sls
            public final Object invoke() {
                tmm0 tmm0Var = new tmm0(26, t, d5o0Var);
                f fVar = f.this;
                tje.N(fVar.Jg(), null, null, new ScootersOnTheWayPresenter$realEvolveToNextState$1(tmm0Var, zuo0Var, null, fVar), 3);
                return zy11.a;
            }
        };
        if ((zuo0Var instanceof lrj0) || (zuo0Var instanceof ea90)) {
            tje.N(Jg(), null, null, new ScootersOnTheWayPresenter$showManualLockInstructionIfNeed$1(slsVar, zuo0Var, null, this), 3);
        } else {
            slsVar.invoke();
        }
    }

    public final void Pg(zuo0 zuo0Var, ScootersOnTheWayAction scootersOnTheWayAction) {
        tje.N(this.x, null, null, new ScootersOnTheWayPresenter$goToRouteNavigation$1(this, zuo0Var, scootersOnTheWayAction, null), 3);
        ((fgn0) this.S).a.V.a(lwo0.a);
    }

    public final void Qg(zuo0 zuo0Var, ScootersOnTheWayAction scootersOnTheWayAction) {
        tje.N(Jg(), null, null, new ScootersOnTheWayPresenter$goToWaiting$1(this, zuo0Var, scootersOnTheWayAction, null), 3);
    }

    public final void Rg(zuo0 zuo0Var) {
        tje.N(Jg(), null, null, new ScootersOnTheWayPresenter$openLock$1(this, zuo0Var, null), 3);
    }

    public final void Sg(String str, ScootersOnTheWayAction scootersOnTheWayAction) {
        ru.yandex.taxi.scooters.presentation.detailed_order.v2.a aVar = ((fgn0) this.S).a;
        com.yandex.go.scooters.deposit.notification.a[] aVarArr = (com.yandex.go.scooters.deposit.notification.a[]) EmptyList.a.toArray(new com.yandex.go.scooters.deposit.notification.a[0]);
        aVar.j(new fpb((m950[]) Arrays.copyOf(aVarArr, aVarArr.length)));
        this.L.d(scootersOnTheWayAction, str);
    }

    public final void Tg(RuntimeException runtimeException, zuo0 zuo0Var) {
        fgn0 fgn0Var = (fgn0) this.S;
        ru.yandex.taxi.scooters.presentation.detailed_order.v2.a aVar = fgn0Var.a;
        aVar.A((m950) aVar.N.get(), new zjn0(zuo0Var.m(), runtimeException, Collections.singletonList(zuo0Var.getNumber().a)), new t8n0(fgn0Var, zuo0Var, 1));
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [ru.yandex.taxi.scooters.presentation.ontheway.b] */
    public final void Ug(final zuo0 zuo0Var, zzc zzcVar, final sls slsVar) {
        a aVar = new a(this, zuo0Var, slsVar, 0);
        a aVar2 = new a(this, zuo0Var, slsVar, 1);
        a aVar3 = new a(slsVar, zuo0Var, this);
        ?? r7 = new tls() { // from class: ru.yandex.taxi.scooters.presentation.ontheway.b
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                f fVar = this;
                tje.N(fVar.Jg(), null, null, new ScootersOnTheWayPresenter$tryFinishOrder$1(slsVar, zuo0Var, null, fVar), 3);
                return zy11.a;
            }
        };
        fgn0 fgn0Var = (fgn0) this.S;
        ru.yandex.taxi.scooters.presentation.detailed_order.v2.a aVar4 = fgn0Var.a;
        aVar4.A((m950) aVar4.M.get(), new e9n0(zzcVar, zuo0Var), new egn0(aVar, aVar2, aVar3, slsVar, zuo0Var, fgn0Var.a, r7, slsVar));
    }

    public final void Vg(zuo0 zuo0Var) {
        tje.N(Jg(), null, null, new ScootersOnTheWayPresenter$whereIs$1(this, zuo0Var, null), 3);
    }
}
