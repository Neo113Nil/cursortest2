package ru.yandex.taxi.scooters.presentation.feedback.newbie;

import com.yandex.go.scooters.api.domain.model.ScootersVehicleType;
import defpackage.imn0;
import defpackage.jtq0;
import defpackage.k7x0;
import defpackage.kgx;
import defpackage.n1o0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pwy0;
import defpackage.qme0;
import defpackage.qwo0;
import defpackage.tt2;
import defpackage.u1o0;
import defpackage.y1o0;
import defpackage.ytz;
import defpackage.zuo0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;
import ru.yandex.taxi.widget.c;

/* loaded from: classes6.dex */
public final class a {
    public final jtq0 a;
    public final pav b;
    public final ytz c;
    public final tt2 d;
    public final k7x0 e;
    public final pwy0 f;
    public final c g;
    public final qwo0 h;
    public final u1o0 i;

    public a(jtq0 jtq0Var, pav pavVar, ytz ytzVar, tt2 tt2Var, k7x0 k7x0Var, pwy0 pwy0Var, c cVar, qwo0 qwo0Var, u1o0 u1o0Var) {
        this.a = jtq0Var;
        this.b = pavVar;
        this.c = ytzVar;
        this.d = tt2Var;
        this.e = k7x0Var;
        this.f = pwy0Var;
        this.g = cVar;
        this.h = qwo0Var;
        this.i = u1o0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(imn0 imn0Var, zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersFinishInfoNewbieHeaderInteractor$getNewbieProgressInfoByConditions$1 scootersFinishInfoNewbieHeaderInteractor$getNewbieProgressInfoByConditions$1;
        int i;
        qwo0 qwo0Var;
        n1o0 n1o0Var;
        n1o0.a aVar;
        int c;
        n1o0.c cVar;
        if (continuationImpl instanceof ScootersFinishInfoNewbieHeaderInteractor$getNewbieProgressInfoByConditions$1) {
            scootersFinishInfoNewbieHeaderInteractor$getNewbieProgressInfoByConditions$1 = (ScootersFinishInfoNewbieHeaderInteractor$getNewbieProgressInfoByConditions$1) continuationImpl;
            int i2 = scootersFinishInfoNewbieHeaderInteractor$getNewbieProgressInfoByConditions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersFinishInfoNewbieHeaderInteractor$getNewbieProgressInfoByConditions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersFinishInfoNewbieHeaderInteractor$getNewbieProgressInfoByConditions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersFinishInfoNewbieHeaderInteractor$getNewbieProgressInfoByConditions$1.label;
                qwo0Var = this.h;
                if (i != 0) {
                    b.b(obj);
                    if (imn0Var.f == FeedbackSettingsParams$Screen.FINISH_CARD && zuo0Var.q() == ScootersVehicleType.SCOOTER && this.a.d() - (zuo0Var.getStartTime() * 1000) >= 60000) {
                        qme0 qme0Var = qwo0Var.A;
                        kgx[] kgxVarArr = qwo0.B;
                        if (!((Boolean) qme0Var.getValue(qwo0Var, kgxVarArr[25])).booleanValue() && ((Boolean) qwo0Var.y.getValue(qwo0Var, kgxVarArr[23])).booleanValue()) {
                            scootersFinishInfoNewbieHeaderInteractor$getNewbieProgressInfoByConditions$1.L$0 = null;
                            scootersFinishInfoNewbieHeaderInteractor$getNewbieProgressInfoByConditions$1.L$1 = null;
                            scootersFinishInfoNewbieHeaderInteractor$getNewbieProgressInfoByConditions$1.label = 1;
                            obj = this.i.a.b(scootersFinishInfoNewbieHeaderInteractor$getNewbieProgressInfoByConditions$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                n1o0Var = (n1o0) obj;
                if (n1o0Var.b && (aVar = n1o0Var.f) != null) {
                    c = qwo0Var.c();
                    if (c != 0) {
                        n1o0.c cVar2 = aVar.a;
                        if (cVar2 != null) {
                            return new y1o0(1, cVar2);
                        }
                    } else if (c == 1) {
                        n1o0.c cVar3 = aVar.b;
                        if (cVar3 != null) {
                            return new y1o0(2, cVar3);
                        }
                    } else if (c == 2 && (cVar = aVar.c) != null) {
                        return new y1o0(3, cVar);
                    }
                }
                return null;
            }
        }
        scootersFinishInfoNewbieHeaderInteractor$getNewbieProgressInfoByConditions$1 = new ScootersFinishInfoNewbieHeaderInteractor$getNewbieProgressInfoByConditions$1(this, continuationImpl);
        Object obj2 = scootersFinishInfoNewbieHeaderInteractor$getNewbieProgressInfoByConditions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersFinishInfoNewbieHeaderInteractor$getNewbieProgressInfoByConditions$1.label;
        qwo0Var = this.h;
        if (i != 0) {
        }
        n1o0Var = (n1o0) obj2;
        if (n1o0Var.b) {
            c = qwo0Var.c();
            if (c != 0) {
            }
        }
        return null;
    }
}
