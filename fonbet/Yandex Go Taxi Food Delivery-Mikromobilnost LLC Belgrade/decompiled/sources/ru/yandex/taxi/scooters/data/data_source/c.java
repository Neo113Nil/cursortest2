package ru.yandex.taxi.scooters.data.data_source;

import defpackage.cmt;
import defpackage.h3y;
import defpackage.mth;
import defpackage.ny61;
import defpackage.w6p0;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.ScootersUserStateApi;

/* loaded from: classes6.dex */
public final class c {
    public final ru.yandex.taxi.launch.c a;
    public final ru.yandex.taxi.scooters.data.a b;
    public final h3y c;

    public c(ru.yandex.taxi.launch.c cVar, ru.yandex.taxi.scooters.data.a aVar, h3y h3yVar) {
        this.a = cVar;
        this.b = aVar;
        this.c = h3yVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (kotlinx.coroutines.flow.e.y(r2, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersUserStateDataSource$obtainUserStateResponse$1 scootersUserStateDataSource$obtainUserStateResponse$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        ScootersUserStateApi scootersUserStateApi;
        if (continuationImpl instanceof ScootersUserStateDataSource$obtainUserStateResponse$1) {
            scootersUserStateDataSource$obtainUserStateResponse$1 = (ScootersUserStateDataSource$obtainUserStateResponse$1) continuationImpl;
            int i2 = scootersUserStateDataSource$obtainUserStateResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersUserStateDataSource$obtainUserStateResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersUserStateDataSource$obtainUserStateResponse$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersUserStateDataSource$obtainUserStateResponse$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mth mthVar = new mth(this.a.a(), 6);
                    scootersUserStateDataSource$obtainUserStateResponse$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                kotlin.b.b(obj);
                                return obj;
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        scootersUserStateApi = (ScootersUserStateApi) scootersUserStateDataSource$obtainUserStateResponse$1.L$0;
                        kotlin.b.b(obj);
                        cmt<w6p0> a2 = scootersUserStateApi.a((Map) obj);
                        scootersUserStateDataSource$obtainUserStateResponse$1.L$0 = null;
                        scootersUserStateDataSource$obtainUserStateResponse$1.label = 3;
                        Object a3 = ru.yandex.taxi.network.api.a.a(a2, null, scootersUserStateDataSource$obtainUserStateResponse$1);
                        return a3 != coroutineSingletons ? coroutineSingletons : a3;
                    }
                    kotlin.b.b(obj);
                }
                ScootersUserStateApi scootersUserStateApi2 = (ScootersUserStateApi) this.c.get();
                scootersUserStateDataSource$obtainUserStateResponse$1.L$0 = scootersUserStateApi2;
                scootersUserStateDataSource$obtainUserStateResponse$1.label = 2;
                a = this.b.a(true, scootersUserStateDataSource$obtainUserStateResponse$1);
                if (a != coroutineSingletons) {
                    obj = a;
                    scootersUserStateApi = scootersUserStateApi2;
                    cmt<w6p0> a22 = scootersUserStateApi.a((Map) obj);
                    scootersUserStateDataSource$obtainUserStateResponse$1.L$0 = null;
                    scootersUserStateDataSource$obtainUserStateResponse$1.label = 3;
                    Object a32 = ru.yandex.taxi.network.api.a.a(a22, null, scootersUserStateDataSource$obtainUserStateResponse$1);
                    if (a32 != coroutineSingletons) {
                    }
                }
            }
        }
        scootersUserStateDataSource$obtainUserStateResponse$1 = new ScootersUserStateDataSource$obtainUserStateResponse$1(this, continuationImpl);
        Object obj2 = scootersUserStateDataSource$obtainUserStateResponse$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersUserStateDataSource$obtainUserStateResponse$1.label;
        if (i != 0) {
        }
        ScootersUserStateApi scootersUserStateApi22 = (ScootersUserStateApi) this.c.get();
        scootersUserStateDataSource$obtainUserStateResponse$1.L$0 = scootersUserStateApi22;
        scootersUserStateDataSource$obtainUserStateResponse$1.label = 2;
        a = this.b.a(true, scootersUserStateDataSource$obtainUserStateResponse$1);
        if (a != coroutineSingletons) {
        }
    }
}
