package ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection;

import com.yandex.mapkit.map.CameraUpdateReason;
import defpackage.a650;
import defpackage.ad5;
import defpackage.ah00;
import defpackage.ako0;
import defpackage.atd0;
import defpackage.bko0;
import defpackage.bym0;
import defpackage.cno0;
import defpackage.cyx;
import defpackage.g8m0;
import defpackage.gus;
import defpackage.hpr0;
import defpackage.jl40;
import defpackage.mym0;
import defpackage.ny61;
import defpackage.po21;
import defpackage.pzt0;
import defpackage.qwc;
import defpackage.r0c0;
import defpackage.s0c0;
import defpackage.tje;
import defpackage.w33;
import defpackage.wnt;
import defpackage.ysd0;
import defpackage.zs7;
import defpackage.zuo0;
import defpackage.zy11;
import defpackage.zz7;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.map_object.f0;
import ru.yandex.taxi.scooters.data.u;
import ru.yandex.taxi.scooters.experiments.g0;
import ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.pin.ScootersPinStateRepository;
import ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.pin.n;

/* loaded from: classes6.dex */
public final class d extends ad5 {
    public final hpr0 A;
    public final atd0 B;
    public final po21 C;
    public final ysd0 D;
    public final cno0 E;
    public final u F;
    public final cyx G;
    public final bym0 H;
    public final zzs I;
    public final ScootersPinStateRepository J;
    public final ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.pin.d K;
    public final n L;
    public final c M;
    public pzt0 N;
    public zuo0 O;
    public final boolean P;
    public final wnt x;
    public final ah00 y;
    public final qwc z;

    public d(ako0 ako0Var, bko0 bko0Var, wnt wntVar, ah00 ah00Var, qwc qwcVar, hpr0 hpr0Var, atd0 atd0Var, po21 po21Var, ysd0 ysd0Var, cno0 cno0Var, u uVar, cyx cyxVar, bym0 bym0Var, zzs zzsVar, g0 g0Var) {
        super(mym0.class);
        this.x = wntVar;
        this.y = ah00Var;
        this.z = qwcVar;
        this.A = hpr0Var;
        this.B = atd0Var;
        this.C = po21Var;
        this.D = ysd0Var;
        this.E = cno0Var;
        this.F = uVar;
        this.G = cyxVar;
        this.H = bym0Var;
        this.I = zzsVar;
        ScootersPinStateRepository scootersPinStateRepository = new ScootersPinStateRepository();
        this.J = scootersPinStateRepository;
        gus gusVar = ako0Var.a;
        this.K = new ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.pin.d((r0c0) gusVar.a.get(), (s0c0) gusVar.b.get(), scootersPinStateRepository);
        zz7 zz7Var = bko0Var.a;
        this.L = new n((r0c0) zz7Var.a.get(), (s0c0) zz7Var.b.get(), scootersPinStateRepository);
        this.M = new c(ah00Var, new g8m0(23, this));
        a650 a650Var = g0Var.g;
        this.P = a650Var != null ? jl40.l(a650Var.d, Boolean.FALSE) : false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(d dVar, zs7 zs7Var, ContinuationImpl continuationImpl) {
        ScootersArbitraryDestinationSelectionPresenter$onCameraChanged$1 scootersArbitraryDestinationSelectionPresenter$onCameraChanged$1;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof ScootersArbitraryDestinationSelectionPresenter$onCameraChanged$1) {
            scootersArbitraryDestinationSelectionPresenter$onCameraChanged$1 = (ScootersArbitraryDestinationSelectionPresenter$onCameraChanged$1) continuationImpl;
            int i2 = scootersArbitraryDestinationSelectionPresenter$onCameraChanged$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersArbitraryDestinationSelectionPresenter$onCameraChanged$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersArbitraryDestinationSelectionPresenter$onCameraChanged$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersArbitraryDestinationSelectionPresenter$onCameraChanged$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!zs7Var.c) {
                        if (zs7Var.b == CameraUpdateReason.GESTURES) {
                            ((mym0) dVar.Dg()).E2();
                        }
                        return zy11.a;
                    }
                    scootersArbitraryDestinationSelectionPresenter$onCameraChanged$1.L$0 = zs7Var;
                    scootersArbitraryDestinationSelectionPresenter$onCameraChanged$1.label = 1;
                    if (kotlinx.coroutines.a.i(300L, scootersArbitraryDestinationSelectionPresenter$onCameraChanged$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zs7Var = (zs7) scootersArbitraryDestinationSelectionPresenter$onCameraChanged$1.L$0;
                    kotlin.b.b(obj);
                }
                ((mym0) dVar.Dg()).f5();
                dVar.Lg(ru.yandex.taxi.map.utils.a.E(zs7Var.a.getTarget(), null));
                return zy11.a;
            }
        }
        scootersArbitraryDestinationSelectionPresenter$onCameraChanged$1 = new ScootersArbitraryDestinationSelectionPresenter$onCameraChanged$1(dVar, continuationImpl);
        Object obj2 = scootersArbitraryDestinationSelectionPresenter$onCameraChanged$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersArbitraryDestinationSelectionPresenter$onCameraChanged$1.label;
        if (i != 0) {
        }
        ((mym0) dVar.Dg()).f5();
        dVar.Lg(ru.yandex.taxi.map.utils.a.E(zs7Var.a.getTarget(), null));
        return zy11.a;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        ((ru.yandex.taxi.map_common.b) this.D).b(f0.class);
        this.A.b(this.K, this.L);
    }

    public final void Lg(zzs zzsVar) {
        ScootersPinStateRepository scootersPinStateRepository = this.J;
        if (((Boolean) scootersPinStateRepository.c.getValue()).booleanValue() || this.P) {
            ((mym0) Dg()).qb();
        } else {
            ((mym0) Dg()).Te();
        }
        pzt0 pzt0Var = this.N;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.N = tje.N(Jg(), null, null, new ScootersArbitraryDestinationSelectionPresenter$loadAddress$1(this, zzsVar, null), 3);
        boolean booleanValue = ((Boolean) scootersPinStateRepository.c.getValue()).booleanValue();
        r0 r0Var = this.H.b;
        w33 w33Var = new w33(zzsVar, booleanValue);
        r0Var.getClass();
        r0Var.m(null, w33Var);
    }
}
