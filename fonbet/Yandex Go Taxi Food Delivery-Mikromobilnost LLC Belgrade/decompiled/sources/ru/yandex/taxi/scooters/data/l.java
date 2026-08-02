package ru.yandex.taxi.scooters.data;

import defpackage.cmt;
import defpackage.djo;
import defpackage.gjo;
import defpackage.ny61;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.model.EvolveState;

/* loaded from: classes6.dex */
public final class l {
    public final ScootersEvolvingApi a;
    public final a b;

    public l(ScootersEvolvingApi scootersEvolvingApi, a aVar) {
        this.a = scootersEvolvingApi;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, EvolveState evolveState, Boolean bool, String str2, Boolean bool2, Boolean bool3, ContinuationImpl continuationImpl) {
        ScootersEvolvingRepository$evolve$1 scootersEvolvingRepository$evolve$1;
        int i;
        String str3;
        ScootersEvolvingApi scootersEvolvingApi;
        Object obj;
        djo djoVar;
        if (continuationImpl instanceof ScootersEvolvingRepository$evolve$1) {
            scootersEvolvingRepository$evolve$1 = (ScootersEvolvingRepository$evolve$1) continuationImpl;
            int i2 = scootersEvolvingRepository$evolve$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersEvolvingRepository$evolve$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersEvolvingRepository$evolve$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersEvolvingRepository$evolve$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    djo djoVar2 = new djo(evolveState, str, bool, bool3, bool2);
                    scootersEvolvingRepository$evolve$1.L$0 = null;
                    scootersEvolvingRepository$evolve$1.L$1 = null;
                    scootersEvolvingRepository$evolve$1.L$2 = null;
                    str3 = str2;
                    scootersEvolvingRepository$evolve$1.L$3 = str3;
                    scootersEvolvingRepository$evolve$1.L$4 = null;
                    scootersEvolvingRepository$evolve$1.L$5 = null;
                    ScootersEvolvingApi scootersEvolvingApi2 = this.a;
                    scootersEvolvingRepository$evolve$1.L$6 = scootersEvolvingApi2;
                    scootersEvolvingRepository$evolve$1.L$7 = djoVar2;
                    scootersEvolvingRepository$evolve$1.label = 1;
                    Object a = this.b.a(false, scootersEvolvingRepository$evolve$1);
                    if (a != coroutineSingletons) {
                        scootersEvolvingApi = scootersEvolvingApi2;
                        obj = a;
                        djoVar = djoVar2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return obj2;
                }
                djoVar = (djo) scootersEvolvingRepository$evolve$1.L$7;
                ScootersEvolvingApi scootersEvolvingApi3 = (ScootersEvolvingApi) scootersEvolvingRepository$evolve$1.L$6;
                String str4 = (String) scootersEvolvingRepository$evolve$1.L$3;
                kotlin.b.b(obj2);
                obj = obj2;
                str3 = str4;
                scootersEvolvingApi = scootersEvolvingApi3;
                cmt<gjo> a2 = scootersEvolvingApi.a(null, str3, djoVar, (Map) obj);
                scootersEvolvingRepository$evolve$1.L$0 = null;
                scootersEvolvingRepository$evolve$1.L$1 = null;
                scootersEvolvingRepository$evolve$1.L$2 = null;
                scootersEvolvingRepository$evolve$1.L$3 = null;
                scootersEvolvingRepository$evolve$1.L$4 = null;
                scootersEvolvingRepository$evolve$1.L$5 = null;
                scootersEvolvingRepository$evolve$1.L$6 = null;
                scootersEvolvingRepository$evolve$1.L$7 = null;
                scootersEvolvingRepository$evolve$1.label = 2;
                Object a3 = ru.yandex.taxi.network.api.a.a(a2, null, scootersEvolvingRepository$evolve$1);
                return a3 != coroutineSingletons ? coroutineSingletons : a3;
            }
        }
        scootersEvolvingRepository$evolve$1 = new ScootersEvolvingRepository$evolve$1(this, continuationImpl);
        Object obj22 = scootersEvolvingRepository$evolve$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersEvolvingRepository$evolve$1.label;
        if (i != 0) {
        }
        cmt<gjo> a22 = scootersEvolvingApi.a(null, str3, djoVar, (Map) obj);
        scootersEvolvingRepository$evolve$1.L$0 = null;
        scootersEvolvingRepository$evolve$1.L$1 = null;
        scootersEvolvingRepository$evolve$1.L$2 = null;
        scootersEvolvingRepository$evolve$1.L$3 = null;
        scootersEvolvingRepository$evolve$1.L$4 = null;
        scootersEvolvingRepository$evolve$1.L$5 = null;
        scootersEvolvingRepository$evolve$1.L$6 = null;
        scootersEvolvingRepository$evolve$1.L$7 = null;
        scootersEvolvingRepository$evolve$1.label = 2;
        Object a32 = ru.yandex.taxi.network.api.a.a(a22, null, scootersEvolvingRepository$evolve$1);
        if (a32 != coroutineSingletons2) {
        }
    }
}
