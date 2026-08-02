package ru.yandex.taxi.single;

import com.yandex.go.taxi.order.models.api.response.NearestDrivers;
import defpackage.ny61;
import defpackage.zzs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class a {
    public final b a;

    public a(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(Set set, zzs zzsVar, ArrayList arrayList, ContinuationImpl continuationImpl) {
        StaticNearestDriversProvider$getNearestDrivers$1 staticNearestDriversProvider$getNearestDrivers$1;
        int i;
        if (continuationImpl instanceof StaticNearestDriversProvider$getNearestDrivers$1) {
            staticNearestDriversProvider$getNearestDrivers$1 = (StaticNearestDriversProvider$getNearestDrivers$1) continuationImpl;
            int i2 = staticNearestDriversProvider$getNearestDrivers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                staticNearestDriversProvider$getNearestDrivers$1.label = i2 - Integer.MIN_VALUE;
                Object obj = staticNearestDriversProvider$getNearestDrivers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = staticNearestDriversProvider$getNearestDrivers$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    staticNearestDriversProvider$getNearestDrivers$1.L$0 = null;
                    staticNearestDriversProvider$getNearestDrivers$1.L$1 = null;
                    staticNearestDriversProvider$getNearestDrivers$1.L$2 = null;
                    staticNearestDriversProvider$getNearestDrivers$1.label = 1;
                    obj = this.a.b(set, zzsVar, arrayList, staticNearestDriversProvider$getNearestDrivers$1);
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
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (!((NearestDrivers.Driver) obj2).d.isEmpty()) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            }
        }
        staticNearestDriversProvider$getNearestDrivers$1 = new StaticNearestDriversProvider$getNearestDrivers$1(this, continuationImpl);
        Object obj3 = staticNearestDriversProvider$getNearestDrivers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = staticNearestDriversProvider$getNearestDrivers$1.label;
        if (i != 0) {
        }
        ArrayList arrayList22 = new ArrayList();
        while (r6.hasNext()) {
        }
        return arrayList22;
    }
}
