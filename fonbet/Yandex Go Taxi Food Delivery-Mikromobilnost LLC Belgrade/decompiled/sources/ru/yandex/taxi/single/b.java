package ru.yandex.taxi.single;

import com.yandex.go.taxi.order.models.api.response.NearestDrivers;
import defpackage.cmt;
import defpackage.gk50;
import defpackage.jst;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zzs;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.launch.c;
import ru.yandex.taxi.net.taxi.NearestDriversApi;

/* loaded from: classes6.dex */
public final class b {
    public final NearestDriversApi a;
    public final c b;
    public final tt2 c;

    public b(NearestDriversApi nearestDriversApi, c cVar, tt2 tt2Var) {
        this.a = nearestDriversApi;
        this.b = cVar;
        this.c = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, String str, zzs zzsVar, Set set, List list, ContinuationImpl continuationImpl) {
        StaticNearestDriversRepository$fetch$1 staticNearestDriversRepository$fetch$1;
        int i;
        bVar.getClass();
        try {
            if (continuationImpl instanceof StaticNearestDriversRepository$fetch$1) {
                staticNearestDriversRepository$fetch$1 = (StaticNearestDriversRepository$fetch$1) continuationImpl;
                int i2 = staticNearestDriversRepository$fetch$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    staticNearestDriversRepository$fetch$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = staticNearestDriversRepository$fetch$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = staticNearestDriversRepository$fetch$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<NearestDrivers> a = bVar.a.a(new gk50(str, zzsVar, set, list, null, null));
                        staticNearestDriversRepository$fetch$1.L$0 = null;
                        staticNearestDriversRepository$fetch$1.L$1 = null;
                        staticNearestDriversRepository$fetch$1.L$2 = null;
                        staticNearestDriversRepository$fetch$1.L$3 = null;
                        staticNearestDriversRepository$fetch$1.L$4 = null;
                        staticNearestDriversRepository$fetch$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.a(a, null, staticNearestDriversRepository$fetch$1);
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
                    return (NearestDrivers) obj;
                }
            }
            if (i != 0) {
            }
            return (NearestDrivers) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        staticNearestDriversRepository$fetch$1 = new StaticNearestDriversRepository$fetch$1(bVar, continuationImpl);
        Object obj2 = staticNearestDriversRepository$fetch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = staticNearestDriversRepository$fetch$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(Set set, zzs zzsVar, List list, ContinuationImpl continuationImpl) {
        StaticNearestDriversRepository$getNearestDrivers$1 staticNearestDriversRepository$getNearestDrivers$1;
        int i;
        Object value;
        Throwable a;
        if (continuationImpl instanceof StaticNearestDriversRepository$getNearestDrivers$1) {
            staticNearestDriversRepository$getNearestDrivers$1 = (StaticNearestDriversRepository$getNearestDrivers$1) continuationImpl;
            int i2 = staticNearestDriversRepository$getNearestDrivers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                staticNearestDriversRepository$getNearestDrivers$1.label = i2 - Integer.MIN_VALUE;
                Object obj = staticNearestDriversRepository$getNearestDrivers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = staticNearestDriversRepository$getNearestDrivers$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.c.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    StaticNearestDriversRepository$getNearestDrivers$result$1 staticNearestDriversRepository$getNearestDrivers$result$1 = new StaticNearestDriversRepository$getNearestDrivers$result$1(this, zzsVar, set, list, null);
                    staticNearestDriversRepository$getNearestDrivers$1.L$0 = null;
                    staticNearestDriversRepository$getNearestDrivers$1.L$1 = null;
                    staticNearestDriversRepository$getNearestDrivers$1.L$2 = null;
                    staticNearestDriversRepository$getNearestDrivers$1.label = 1;
                    obj = tje.k0(mdhVar, staticNearestDriversRepository$getNearestDrivers$result$1, staticNearestDriversRepository$getNearestDrivers$1);
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
                value = ((Result) obj).getValue();
                ListBuilder a2 = rcc.a();
                a = Result.a(value);
                if (a != null) {
                    jst.e.k(a, "Fail to fetch static nearest drivers");
                }
                if (!(value instanceof Result.Failure)) {
                    a2.addAll(((NearestDrivers) value).a);
                }
                return a2.j();
            }
        }
        staticNearestDriversRepository$getNearestDrivers$1 = new StaticNearestDriversRepository$getNearestDrivers$1(this, continuationImpl);
        Object obj2 = staticNearestDriversRepository$getNearestDrivers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = staticNearestDriversRepository$getNearestDrivers$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        ListBuilder a22 = rcc.a();
        a = Result.a(value);
        if (a != null) {
        }
        if (!(value instanceof Result.Failure)) {
        }
        return a22.j();
    }
}
