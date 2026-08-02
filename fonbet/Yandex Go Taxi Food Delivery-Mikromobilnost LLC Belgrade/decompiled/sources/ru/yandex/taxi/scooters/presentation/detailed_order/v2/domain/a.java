package ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain;

import android.content.Intent;
import android.net.Uri;
import com.yandex.go.scooters.live.domain.model.ScootersLiveAction;
import defpackage.bvf0;
import defpackage.c6o0;
import defpackage.frl0;
import defpackage.h3y;
import defpackage.hgn0;
import defpackage.jl40;
import defpackage.m5u;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.o2b1;
import defpackage.odn0;
import defpackage.qxm0;
import defpackage.vwn0;
import defpackage.wwn0;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.u;
import ru.yandex.taxi.scooters.domain.q;

/* loaded from: classes6.dex */
public final class a {
    public final q a;
    public final h3y b;
    public final u c;
    public final ru.yandex.taxi.deeplinks.b d;
    public final vwn0 e;
    public final h3y f;

    public a(q qVar, h3y h3yVar, u uVar, ru.yandex.taxi.deeplinks.b bVar, vwn0 vwn0Var, h3y h3yVar2) {
        this.a = qVar;
        this.b = h3yVar;
        this.c = uVar;
        this.d = bVar;
        this.e = vwn0Var;
        this.f = h3yVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, Intent intent, String str, ContinuationImpl continuationImpl) {
        ScootersDetailedOrderIntentInteractor$handleIncomingIntent$1 scootersDetailedOrderIntentInteractor$handleIncomingIntent$1;
        int i;
        odn0 odn0Var;
        c6o0 i2;
        h3y h3yVar = aVar.b;
        if (continuationImpl instanceof ScootersDetailedOrderIntentInteractor$handleIncomingIntent$1) {
            scootersDetailedOrderIntentInteractor$handleIncomingIntent$1 = (ScootersDetailedOrderIntentInteractor$handleIncomingIntent$1) continuationImpl;
            int i3 = scootersDetailedOrderIntentInteractor$handleIncomingIntent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersDetailedOrderIntentInteractor$handleIncomingIntent$1.label = i3 - Integer.MIN_VALUE;
                Object obj = scootersDetailedOrderIntentInteractor$handleIncomingIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailedOrderIntentInteractor$handleIncomingIntent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    wwn0 a = aVar.e.a(intent);
                    if (a == null) {
                        Uri data = intent.getData();
                        if (data != null) {
                            q qVar = aVar.a;
                            scootersDetailedOrderIntentInteractor$handleIncomingIntent$1.L$0 = null;
                            scootersDetailedOrderIntentInteractor$handleIncomingIntent$1.L$1 = str;
                            scootersDetailedOrderIntentInteractor$handleIncomingIntent$1.L$2 = null;
                            scootersDetailedOrderIntentInteractor$handleIncomingIntent$1.L$3 = null;
                            scootersDetailedOrderIntentInteractor$handleIncomingIntent$1.label = 1;
                            obj = qVar.p(data, scootersDetailedOrderIntentInteractor$handleIncomingIntent$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        ScootersLiveAction scootersLiveAction = a.b;
                        zuo0 zuo0Var = a.a;
                        if (jl40.l(zuo0Var.getSessionId(), str)) {
                            ((qxm0) h3yVar.get()).d(o2b1.f(scootersLiveAction));
                            if (((hgn0) aVar.f.get()).a(zuo0Var.getSessionId(), scootersLiveAction != null ? scootersLiveAction.getOnTheWayAction() : null)) {
                                return new m5u(false, false);
                            }
                        }
                    }
                    return n5u.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) scootersDetailedOrderIntentInteractor$handleIncomingIntent$1.L$1;
                kotlin.b.b(obj);
                odn0Var = (odn0) obj;
                if (odn0Var != null && (i2 = frl0.m.i(odn0Var.a)) != null && jl40.l(i2.b, str)) {
                    ((qxm0) h3yVar.get()).d(null);
                    return new m5u(false, false);
                }
                return n5u.a;
            }
        }
        scootersDetailedOrderIntentInteractor$handleIncomingIntent$1 = new ScootersDetailedOrderIntentInteractor$handleIncomingIntent$1(aVar, continuationImpl);
        Object obj2 = scootersDetailedOrderIntentInteractor$handleIncomingIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailedOrderIntentInteractor$handleIncomingIntent$1.label;
        if (i != 0) {
        }
        odn0Var = (odn0) obj2;
        if (odn0Var != null) {
            ((qxm0) h3yVar.get()).d(null);
            return new m5u(false, false);
        }
        return n5u.a;
    }

    public final Object b(Continuation continuation) {
        Object n = bvf0.n(new ScootersDetailedOrderIntentInteractor$handleIntents$2(this, null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }
}
