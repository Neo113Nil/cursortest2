package ru.yandex.taxi.scooters.data.data_source;

import defpackage.eci0;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tqm0;
import defpackage.tse;
import defpackage.wsr0;
import defpackage.xsr0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.scooters.data.h;

/* loaded from: classes9.dex */
public final class a {
    public final ru.yandex.taxi.scooters.data.mapper.a a;
    public final b b;
    public final h c;
    public final tqm0 d;
    public final eci0 e;

    public a(tse tseVar, ru.yandex.taxi.scooters.data.mapper.a aVar, b bVar, h hVar, tqm0 tqm0Var) {
        this.a = aVar;
        this.b = bVar;
        this.c = hVar;
        this.d = tqm0Var;
        this.e = e.O(new o(new rol0(new ScootersActiveOrdersDataSource$activeOrdersRequestFlow$1(this, null)), new ScootersActiveOrdersDataSource$activeOrdersRequestFlow$2(3, null)), tseVar, wsr0.a(xsr0.a, 3), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersActiveOrdersDataSource$obtainActiveOrders$1 scootersActiveOrdersDataSource$obtainActiveOrders$1;
        int i;
        if (continuationImpl instanceof ScootersActiveOrdersDataSource$obtainActiveOrders$1) {
            scootersActiveOrdersDataSource$obtainActiveOrders$1 = (ScootersActiveOrdersDataSource$obtainActiveOrders$1) continuationImpl;
            int i2 = scootersActiveOrdersDataSource$obtainActiveOrders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActiveOrdersDataSource$obtainActiveOrders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersActiveOrdersDataSource$obtainActiveOrders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActiveOrdersDataSource$obtainActiveOrders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersActiveOrdersDataSource$obtainActiveOrders$1.label = 1;
                    obj = e.y(this.e, scootersActiveOrdersDataSource$obtainActiveOrders$1);
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
                Object value = ((Result) obj).getValue();
                kotlin.b.b(value);
                return value;
            }
        }
        scootersActiveOrdersDataSource$obtainActiveOrders$1 = new ScootersActiveOrdersDataSource$obtainActiveOrders$1(this, continuationImpl);
        Object obj2 = scootersActiveOrdersDataSource$obtainActiveOrders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActiveOrdersDataSource$obtainActiveOrders$1.label;
        if (i != 0) {
        }
        Object value2 = ((Result) obj2).getValue();
        kotlin.b.b(value2);
        return value2;
    }
}
