package ru.yandex.taxi.data;

import defpackage.cmt;
import defpackage.dqk0;
import defpackage.evu0;
import defpackage.h3y;
import defpackage.jst;
import defpackage.mct;
import defpackage.ny61;
import defpackage.rct;
import defpackage.xby;
import defpackage.xpk0;
import defpackage.ypk0;
import java.util.Calendar;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.data.api.RideHistoryApi;

/* loaded from: classes5.dex */
public final class a implements ypk0 {
    public final h3y a;
    public final g b;

    public a(h3y h3yVar, g gVar) {
        this.a = h3yVar;
        this.b = gVar;
    }

    public static xpk0 b(rct.a aVar) {
        if (evu0.J(aVar.a)) {
            jst.e.k(new IllegalArgumentException("order_id from orderhistory/v2/item returned empty"), "history:RideHistoryRepositoryImpl");
            return null;
        }
        dqk0 dqk0Var = new dqk0(aVar.a);
        String str = aVar.f.c;
        Calendar calendar = aVar.b;
        rct.c cVar = aVar.g;
        String str2 = cVar.a.a;
        rct.d dVar = (rct.d) kotlin.collections.a.b0(cVar.b);
        return new xpk0(dqk0Var, str, calendar, str2, dVar != null ? dVar.a : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074 A[Catch: all -> 0x0031, CancellationException -> 0x0092, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0092, all -> 0x0031, blocks: (B:11:0x002d, B:12:0x006e, B:14:0x0074, B:26:0x0055), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(dqk0 dqk0Var, ContinuationImpl continuationImpl) {
        RideHistoryRepositoryImpl$getRideOrderById$1 rideHistoryRepositoryImpl$getRideOrderById$1;
        int i;
        rct.a aVar;
        try {
            if (continuationImpl instanceof RideHistoryRepositoryImpl$getRideOrderById$1) {
                rideHistoryRepositoryImpl$getRideOrderById$1 = (RideHistoryRepositoryImpl$getRideOrderById$1) continuationImpl;
                int i2 = rideHistoryRepositoryImpl$getRideOrderById$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    rideHistoryRepositoryImpl$getRideOrderById$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = rideHistoryRepositoryImpl$getRideOrderById$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = rideHistoryRepositoryImpl$getRideOrderById$1.label;
                    if (i != 0) {
                        b.b(obj);
                        if (!this.b.g()) {
                            jst.e.getClass();
                            return null;
                        }
                        cmt<rct> a = ((RideHistoryApi) this.a.get()).a(new mct(dqk0Var.a, 12));
                        rideHistoryRepositoryImpl$getRideOrderById$1.L$0 = dqk0Var;
                        rideHistoryRepositoryImpl$getRideOrderById$1.L$1 = null;
                        rideHistoryRepositoryImpl$getRideOrderById$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.a(a, null, rideHistoryRepositoryImpl$getRideOrderById$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dqk0Var = (dqk0) rideHistoryRepositoryImpl$getRideOrderById$1.L$0;
                        b.b(obj);
                    }
                    aVar = ((rct) obj).a;
                    if (aVar == null) {
                        return b(aVar);
                    }
                    return null;
                }
            }
            if (i != 0) {
            }
            aVar = ((rct) obj).a;
            if (aVar == null) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, "history:RideHistoryRepositoryImpl", null, th, "Failed to load get history ride order for " + dqk0Var, 2);
            return null;
        }
        rideHistoryRepositoryImpl$getRideOrderById$1 = new RideHistoryRepositoryImpl$getRideOrderById$1(this, continuationImpl);
        Object obj2 = rideHistoryRepositoryImpl$getRideOrderById$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideHistoryRepositoryImpl$getRideOrderById$1.label;
    }
}
