package ru.yandex.taxi.linked_order.map.movement;

import defpackage.fmt;
import defpackage.h001;
import defpackage.i201;
import defpackage.mw2;
import defpackage.npy;
import defpackage.ny61;
import defpackage.o201;
import defpackage.p201;
import defpackage.q201;
import defpackage.qpy;
import defpackage.r201;
import defpackage.s201;
import defpackage.s8o;
import defpackage.tcc;
import defpackage.tpy;
import defpackage.ul00;
import defpackage.wwg;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.linked_order.api.LinkedOrderApi;
import ru.yandex.taxi.linked_order.provider.i;
import ru.yandex.taxi.net.tracker.models.StopTrackException;

/* loaded from: classes5.dex */
public final class b implements s201 {
    public final ul00 a;
    public final i b;

    public b(ul00 ul00Var, i iVar) {
        this.a = ul00Var;
        this.b = iVar;
    }

    public static o201 b(fmt fmtVar) {
        npy npyVar = (npy) fmtVar.a;
        Long l = wwg.l(fmtVar).b;
        long longValue = l != null ? l.longValue() : 5000L;
        String a = fmtVar.e.a("X-YaTraceId");
        p201 p201Var = new p201(0);
        q201 q201Var = q201.c;
        List<qpy> list = npyVar.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (qpy qpyVar : list) {
            arrayList.add(new h001(qpyVar.a, qpyVar.b, qpyVar.c, null, null));
        }
        return new o201(p201Var, q201Var, arrayList, i201.a, npyVar.b, longValue, a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.s201
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(mw2 mw2Var, ContinuationImpl continuationImpl) {
        LinkedOrderTrackerRequestFactory$request$1 linkedOrderTrackerRequestFactory$request$1;
        int i;
        try {
            if (continuationImpl instanceof LinkedOrderTrackerRequestFactory$request$1) {
                linkedOrderTrackerRequestFactory$request$1 = (LinkedOrderTrackerRequestFactory$request$1) continuationImpl;
                int i2 = linkedOrderTrackerRequestFactory$request$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    linkedOrderTrackerRequestFactory$request$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = linkedOrderTrackerRequestFactory$request$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = linkedOrderTrackerRequestFactory$request$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        r201 r201Var = (r201) mw2Var.invoke();
                        String str = this.a.a;
                        if (str == null) {
                            str = "";
                        }
                        tpy tpyVar = new tpy(r201Var.a, str, r201Var.b);
                        i iVar = this.b;
                        linkedOrderTrackerRequestFactory$request$1.L$0 = null;
                        linkedOrderTrackerRequestFactory$request$1.L$1 = null;
                        linkedOrderTrackerRequestFactory$request$1.L$2 = null;
                        linkedOrderTrackerRequestFactory$request$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.b(((LinkedOrderApi) iVar.e.getValue()).b(tpyVar), null, linkedOrderTrackerRequestFactory$request$1);
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
                    return b((fmt) obj);
                }
            }
            if (i != 0) {
            }
            return b((fmt) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            if (s8o.u(th)) {
                throw new StopTrackException();
            }
            throw th;
        }
        linkedOrderTrackerRequestFactory$request$1 = new LinkedOrderTrackerRequestFactory$request$1(this, continuationImpl);
        Object obj2 = linkedOrderTrackerRequestFactory$request$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedOrderTrackerRequestFactory$request$1.label;
    }
}
