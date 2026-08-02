package ru.yandex.taxi.persuggest.fingerprint;

import defpackage.bvf0;
import defpackage.cvw;
import defpackage.g6u;
import defpackage.ike;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o400;
import defpackage.olt;
import defpackage.qhw0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tm21;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zm21;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.experiments.u;

/* loaded from: classes9.dex */
public final class c {
    public final u a;
    public final olt b;
    public final zm21 c;
    public final tm21 d;
    public final tt2 e;
    public final ike f;
    public final AtomicBoolean g;

    public c(u uVar, olt oltVar, zm21 zm21Var, tm21 tm21Var, tt2 tt2Var) {
        this.a = uVar;
        this.b = oltVar;
        this.c = zm21Var;
        this.d = tm21Var;
        this.e = tt2Var;
        qhw0 a = jl40.a();
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.f = bvf0.a(cvw.U(a, mdh.b));
        this.g = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Continuation continuation, c cVar, boolean z, boolean z2) {
        UserFingerprintZoneInteractor$applySensorRecognition$1 userFingerprintZoneInteractor$applySensorRecognition$1;
        int i;
        cVar.getClass();
        if (continuation instanceof UserFingerprintZoneInteractor$applySensorRecognition$1) {
            userFingerprintZoneInteractor$applySensorRecognition$1 = (UserFingerprintZoneInteractor$applySensorRecognition$1) continuation;
            int i2 = userFingerprintZoneInteractor$applySensorRecognition$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userFingerprintZoneInteractor$applySensorRecognition$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userFingerprintZoneInteractor$applySensorRecognition$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userFingerprintZoneInteractor$applySensorRecognition$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cVar.e.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    UserFingerprintZoneInteractor$applySensorRecognition$2 userFingerprintZoneInteractor$applySensorRecognition$2 = new UserFingerprintZoneInteractor$applySensorRecognition$2(null, cVar, z, z2);
                    userFingerprintZoneInteractor$applySensorRecognition$1.Z$0 = z;
                    userFingerprintZoneInteractor$applySensorRecognition$1.Z$1 = z2;
                    userFingerprintZoneInteractor$applySensorRecognition$1.label = 1;
                    if (tje.k0(g6uVar, userFingerprintZoneInteractor$applySensorRecognition$2, userFingerprintZoneInteractor$applySensorRecognition$1) == coroutineSingletons) {
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
        userFingerprintZoneInteractor$applySensorRecognition$1 = new UserFingerprintZoneInteractor$applySensorRecognition$1(cVar, continuation);
        Object obj2 = userFingerprintZoneInteractor$applySensorRecognition$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userFingerprintZoneInteractor$applySensorRecognition$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final void b() {
        if (this.g.compareAndSet(false, true)) {
            tje.N(this.f, null, null, new UserFingerprintZoneInteractor$start$1(this, null), 3);
        }
    }
}
