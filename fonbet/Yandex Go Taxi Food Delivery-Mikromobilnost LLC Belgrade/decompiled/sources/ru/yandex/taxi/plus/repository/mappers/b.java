package ru.yandex.taxi.plus.repository.mappers;

import android.graphics.drawable.Drawable;
import defpackage.hld0;
import defpackage.mdh;
import defpackage.moc0;
import defpackage.noc0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pf20;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.wwx0;
import defpackage.y1d0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.plaque.api.models.PlaqueModel$TabletPlaqueModel$Notification$Position;

/* loaded from: classes6.dex */
public final class b {
    public final pav a;
    public final hld0 b;
    public final wwx0 c;

    public b(pav pavVar, hld0 hld0Var, wwx0 wwx0Var) {
        this.a = pavVar;
        this.b = hld0Var;
        this.c = wwx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        PlusCounterMapper$mapIconWidget$1 plusCounterMapper$mapIconWidget$1;
        int i;
        if (continuationImpl instanceof PlusCounterMapper$mapIconWidget$1) {
            plusCounterMapper$mapIconWidget$1 = (PlusCounterMapper$mapIconWidget$1) continuationImpl;
            int i2 = plusCounterMapper$mapIconWidget$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusCounterMapper$mapIconWidget$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusCounterMapper$mapIconWidget$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusCounterMapper$mapIconWidget$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    PlusCounterMapper$mapIconWidget$drawable$1 plusCounterMapper$mapIconWidget$drawable$1 = new PlusCounterMapper$mapIconWidget$drawable$1(this, str, null);
                    plusCounterMapper$mapIconWidget$1.L$0 = str;
                    plusCounterMapper$mapIconWidget$1.label = 1;
                    obj = tje.k0(mdhVar, plusCounterMapper$mapIconWidget$drawable$1, plusCounterMapper$mapIconWidget$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) plusCounterMapper$mapIconWidget$1.L$0;
                    kotlin.b.b(obj);
                }
                return new pf20(str, (Drawable) obj);
            }
        }
        plusCounterMapper$mapIconWidget$1 = new PlusCounterMapper$mapIconWidget$1(this, continuationImpl);
        Object obj2 = plusCounterMapper$mapIconWidget$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusCounterMapper$mapIconWidget$1.label;
        if (i != 0) {
        }
        return new pf20(str, (Drawable) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(y1d0 y1d0Var, PlaqueModel$TabletPlaqueModel$Notification$Position plaqueModel$TabletPlaqueModel$Notification$Position, ContinuationImpl continuationImpl) {
        PlusCounterMapper$mapModelToNotification$1 plusCounterMapper$mapModelToNotification$1;
        int i;
        if (continuationImpl instanceof PlusCounterMapper$mapModelToNotification$1) {
            plusCounterMapper$mapModelToNotification$1 = (PlusCounterMapper$mapModelToNotification$1) continuationImpl;
            int i2 = plusCounterMapper$mapModelToNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusCounterMapper$mapModelToNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusCounterMapper$mapModelToNotification$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusCounterMapper$mapModelToNotification$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = y1d0Var.c;
                    if (str == null) {
                        if (y1d0Var.a) {
                            return new moc0(plaqueModel$TabletPlaqueModel$Notification$Position, y1d0Var.b);
                        }
                        return null;
                    }
                    plusCounterMapper$mapModelToNotification$1.L$0 = null;
                    plusCounterMapper$mapModelToNotification$1.L$1 = plaqueModel$TabletPlaqueModel$Notification$Position;
                    plusCounterMapper$mapModelToNotification$1.L$2 = null;
                    plusCounterMapper$mapModelToNotification$1.label = 1;
                    obj = a(str, plusCounterMapper$mapModelToNotification$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    plaqueModel$TabletPlaqueModel$Notification$Position = (PlaqueModel$TabletPlaqueModel$Notification$Position) plusCounterMapper$mapModelToNotification$1.L$1;
                    kotlin.b.b(obj);
                }
                return new noc0((pf20) obj, plaqueModel$TabletPlaqueModel$Notification$Position);
            }
        }
        plusCounterMapper$mapModelToNotification$1 = new PlusCounterMapper$mapModelToNotification$1(this, continuationImpl);
        Object obj3 = plusCounterMapper$mapModelToNotification$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusCounterMapper$mapModelToNotification$1.label;
        if (i != 0) {
        }
        return new noc0((pf20) obj3, plaqueModel$TabletPlaqueModel$Notification$Position);
    }
}
