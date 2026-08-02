package ru.yandex.taxi.masstransit.deeplink;

import com.yandex.go.address.models.Address;
import defpackage.a611;
import defpackage.dd61;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.pv0;
import defpackage.w411;
import defpackage.zzs;
import java.util.Collections;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class g {
    public final ru.yandex.taxi.deeplinks.e a;
    public final po21 b;
    public final com.yandex.go.route.interactor.b c;

    public g(ru.yandex.taxi.deeplinks.e eVar, po21 po21Var, com.yandex.go.route.interactor.b bVar) {
        this.a = eVar;
        this.b = po21Var;
        this.c = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
    
        if (r11 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(w411 w411Var, ContinuationImpl continuationImpl) {
        TransportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1 transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1;
        Object obj;
        int i;
        Object b;
        dd61 dd61Var;
        boolean r;
        if (continuationImpl instanceof TransportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1) {
            transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1 = (TransportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1) continuationImpl;
            int i2 = transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1.label;
                com.yandex.go.route.interactor.b bVar = this.c;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Address h = bVar.c().h();
                    zzs B = h != null ? h.B() : null;
                    if (w411Var.a == null && w411Var.b == null && B != null) {
                        Address address = (Address) kotlin.collections.a.b0(bVar.c().b);
                        w411Var = new w411(B, address != null ? address.B() : null, w411Var.c);
                    }
                    transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1.L$0 = null;
                    transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1.L$1 = w411Var;
                    transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1.label = 1;
                    obj2 = b(w411Var, transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dd61Var = (dd61) transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1.L$2;
                        kotlin.b.b(obj2);
                        pv0 pv0Var = (pv0) obj2;
                        r = bVar.r(dd61Var.a());
                        boolean p = bVar.p(pv0Var == null ? Collections.singletonList(pv0Var.a) : EmptyList.a);
                        if (!r && !p) {
                            z = false;
                        }
                        return new a611(dd61Var, z);
                    }
                    w411Var = (w411) transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1.L$1;
                    kotlin.b.b(obj2);
                }
                dd61 dd61Var2 = (dd61) obj2;
                transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1.L$0 = null;
                transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1.L$1 = null;
                transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1.L$2 = dd61Var2;
                transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1.label = 2;
                zzs zzsVar = w411Var.b;
                b = zzsVar != null ? null : ru.yandex.taxi.deeplinks.e.b(this.a, zzsVar, transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1, 26);
                if (b != obj) {
                    obj2 = b;
                    dd61Var = dd61Var2;
                    pv0 pv0Var2 = (pv0) obj2;
                    r = bVar.r(dd61Var.a());
                    boolean p2 = bVar.p(pv0Var2 == null ? Collections.singletonList(pv0Var2.a) : EmptyList.a);
                    if (!r) {
                        z = false;
                    }
                    return new a611(dd61Var, z);
                }
                return obj;
            }
        }
        transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1 = new TransportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1(this, continuationImpl);
        Object obj22 = transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1.label;
        com.yandex.go.route.interactor.b bVar2 = this.c;
        boolean z2 = true;
        if (i != 0) {
        }
        dd61 dd61Var22 = (dd61) obj22;
        transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1.L$0 = null;
        transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1.L$1 = null;
        transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1.L$2 = dd61Var22;
        transportRoutesIntentDataInteractorImpl$handleDeeplinkTransportPoints$1.label = 2;
        zzs zzsVar2 = w411Var.b;
        if (zzsVar2 != null) {
        }
        if (b != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(w411 w411Var, ContinuationImpl continuationImpl) {
        TransportRoutesIntentDataInteractorImpl$resolveSourcePoint$1 transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        zzs zzsVar;
        Object e;
        if (continuationImpl instanceof TransportRoutesIntentDataInteractorImpl$resolveSourcePoint$1) {
            transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1 = (TransportRoutesIntentDataInteractorImpl$resolveSourcePoint$1) continuationImpl;
            int i2 = transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zzsVar = w411Var.a;
                    if (zzsVar == null) {
                        Address h = this.c.c().h();
                        zzsVar = h != null ? h.B() : null;
                        if (zzsVar == null) {
                            transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1.L$0 = null;
                            transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1.label = 1;
                            obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.b).g(transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1);
                        }
                    }
                    transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1.L$0 = null;
                    transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1.L$1 = null;
                    transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1.label = 2;
                    e = this.a.e(zzsVar, null, false, false, transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1);
                    return e == coroutineSingletons ? coroutineSingletons : e;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                kotlin.b.b(obj);
                zzsVar = ((mo21) obj).a();
                transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1.L$0 = null;
                transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1.L$1 = null;
                transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1.label = 2;
                e = this.a.e(zzsVar, null, false, false, transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1);
                if (e == coroutineSingletons) {
                }
            }
        }
        transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1 = new TransportRoutesIntentDataInteractorImpl$resolveSourcePoint$1(this, continuationImpl);
        Object obj2 = transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1.label;
        if (i != 0) {
        }
        zzsVar = ((mo21) obj2).a();
        transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1.L$0 = null;
        transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1.L$1 = null;
        transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1.label = 2;
        e = this.a.e(zzsVar, null, false, false, transportRoutesIntentDataInteractorImpl$resolveSourcePoint$1);
        if (e == coroutineSingletons) {
        }
    }
}
