package ru.yandex.taxi.scooters.data;

import com.yandex.go.scooters.api.domain.model.ScootersSlowdown;
import defpackage.av0;
import defpackage.bvf0;
import defpackage.jqr;
import defpackage.ny61;
import defpackage.uso0;
import defpackage.vng;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class z {
    public final x a;
    public uso0 b;
    public boolean c;
    public final r0 d = bvf0.c(new com.yandex.go.scooters.api.domain.model.b(EmptyList.a));
    public final r0 e = bvf0.c(null);

    public z(x xVar) {
        this.a = xVar;
    }

    public final void a(ScootersSlowdown scootersSlowdown) {
        r0 r0Var;
        Object value;
        ArrayList arrayList;
        do {
            r0Var = this.d;
            value = r0Var.getValue();
            List list = ((com.yandex.go.scooters.api.domain.model.b) value).a;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ScootersSlowdown) obj).b != scootersSlowdown.b) {
                    arrayList.add(obj);
                }
            }
        } while (!r0Var.k(value, new com.yandex.go.scooters.api.domain.model.b(kotlin.collections.a.o0(arrayList, scootersSlowdown))));
    }

    public final void b(ScootersSlowdown scootersSlowdown) {
        r0 r0Var;
        Object value;
        ArrayList arrayList;
        do {
            r0Var = this.d;
            value = r0Var.getValue();
            List list = ((com.yandex.go.scooters.api.domain.model.b) value).a;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ScootersSlowdown) obj).b != scootersSlowdown.b) {
                    arrayList.add(obj);
                }
            }
        } while (!r0Var.k(value, new com.yandex.go.scooters.api.domain.model.b(arrayList)));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ScootersSlowdownRepository$updateRidingTogetherCommunications$1 scootersSlowdownRepository$updateRidingTogetherCommunications$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        z zVar;
        uso0 uso0Var;
        if (continuationImpl instanceof ScootersSlowdownRepository$updateRidingTogetherCommunications$1) {
            scootersSlowdownRepository$updateRidingTogetherCommunications$1 = (ScootersSlowdownRepository$updateRidingTogetherCommunications$1) continuationImpl;
            int i2 = scootersSlowdownRepository$updateRidingTogetherCommunications$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSlowdownRepository$updateRidingTogetherCommunications$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSlowdownRepository$updateRidingTogetherCommunications$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSlowdownRepository$updateRidingTogetherCommunications$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.c = false;
                    scootersSlowdownRepository$updateRidingTogetherCommunications$1.L$0 = this;
                    scootersSlowdownRepository$updateRidingTogetherCommunications$1.label = 1;
                    obj = this.a.d(scootersSlowdownRepository$updateRidingTogetherCommunications$1);
                    if (obj != coroutineSingletons) {
                        zVar = this;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zVar = (z) scootersSlowdownRepository$updateRidingTogetherCommunications$1.L$0;
                kotlin.b.b(obj);
                zVar.b = (uso0) obj;
                uso0Var = this.b;
                if (uso0Var == null || (uso0Var.a == null && uso0Var.b == null)) {
                    return zy11.a;
                }
                scootersSlowdownRepository$updateRidingTogetherCommunications$1.L$0 = null;
                scootersSlowdownRepository$updateRidingTogetherCommunications$1.label = 2;
                Object k = kotlinx.coroutines.flow.e.k(new jqr(vng.l(this.d, av0.K, vng.c), new ScootersSlowdownRepository$startToListenSlowdownRidingTogetherStateFlow$3(this, null), 3), new ScootersSlowdownRepository$startToListenSlowdownRidingTogetherStateFlow$4(this, null), scootersSlowdownRepository$updateRidingTogetherCommunications$1);
                return k != coroutineSingletons ? coroutineSingletons : k;
            }
        }
        scootersSlowdownRepository$updateRidingTogetherCommunications$1 = new ScootersSlowdownRepository$updateRidingTogetherCommunications$1(this, continuationImpl);
        Object obj2 = scootersSlowdownRepository$updateRidingTogetherCommunications$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSlowdownRepository$updateRidingTogetherCommunications$1.label;
        if (i != 0) {
        }
        zVar.b = (uso0) obj2;
        uso0Var = this.b;
        if (uso0Var == null) {
            scootersSlowdownRepository$updateRidingTogetherCommunications$1.L$0 = null;
            scootersSlowdownRepository$updateRidingTogetherCommunications$1.label = 2;
            Object k2 = kotlinx.coroutines.flow.e.k(new jqr(vng.l(this.d, av0.K, vng.c), new ScootersSlowdownRepository$startToListenSlowdownRidingTogetherStateFlow$3(this, null), 3), new ScootersSlowdownRepository$startToListenSlowdownRidingTogetherStateFlow$4(this, null), scootersSlowdownRepository$updateRidingTogetherCommunications$1);
            if (k2 != coroutineSingletons) {
            }
        }
        return zy11.a;
    }
}
