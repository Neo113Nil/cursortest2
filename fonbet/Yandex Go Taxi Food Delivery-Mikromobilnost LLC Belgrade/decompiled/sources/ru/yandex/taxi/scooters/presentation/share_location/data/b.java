package ru.yandex.taxi.scooters.presentation.share_location.data;

import defpackage.mdh;
import defpackage.mo21;
import defpackage.nmx;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class b {
    public final tt2 a;
    public final nmx b;
    public final ScootersShareLocationApi c;

    public b(tt2 tt2Var, nmx nmxVar, ScootersShareLocationApi scootersShareLocationApi) {
        this.a = tt2Var;
        this.b = nmxVar;
        this.c = scootersShareLocationApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(mo21 mo21Var, List list, ContinuationImpl continuationImpl) {
        ScootersShareLocationUpdateRepository$updateLocation$1 scootersShareLocationUpdateRepository$updateLocation$1;
        int i;
        if (continuationImpl instanceof ScootersShareLocationUpdateRepository$updateLocation$1) {
            scootersShareLocationUpdateRepository$updateLocation$1 = (ScootersShareLocationUpdateRepository$updateLocation$1) continuationImpl;
            int i2 = scootersShareLocationUpdateRepository$updateLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersShareLocationUpdateRepository$updateLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersShareLocationUpdateRepository$updateLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersShareLocationUpdateRepository$updateLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    ScootersShareLocationUpdateRepository$updateLocation$2 scootersShareLocationUpdateRepository$updateLocation$2 = new ScootersShareLocationUpdateRepository$updateLocation$2(this, mo21Var, list, null);
                    scootersShareLocationUpdateRepository$updateLocation$1.L$0 = null;
                    scootersShareLocationUpdateRepository$updateLocation$1.L$1 = null;
                    scootersShareLocationUpdateRepository$updateLocation$1.label = 1;
                    if (tje.k0(mdhVar, scootersShareLocationUpdateRepository$updateLocation$2, scootersShareLocationUpdateRepository$updateLocation$1) == coroutineSingletons) {
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
        scootersShareLocationUpdateRepository$updateLocation$1 = new ScootersShareLocationUpdateRepository$updateLocation$1(this, continuationImpl);
        Object obj2 = scootersShareLocationUpdateRepository$updateLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersShareLocationUpdateRepository$updateLocation$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
