package ru.yandex.taxi.logistics.care.impl.router;

import defpackage.bb60;
import defpackage.jst;
import defpackage.nwh;
import defpackage.ny61;
import defpackage.qne;
import defpackage.txh;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.n;

/* loaded from: classes5.dex */
public final class a {
    public final /* synthetic */ f a;
    public final /* synthetic */ txh b;

    public a(f fVar, txh txhVar) {
        this.a = fVar;
        this.b = txhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        DeliveryCareRouterImpl$createAuthorizationInteractor$1$wrapAuthData$1 deliveryCareRouterImpl$createAuthorizationInteractor$1$wrapAuthData$1;
        int i;
        try {
            if (continuationImpl instanceof DeliveryCareRouterImpl$createAuthorizationInteractor$1$wrapAuthData$1) {
                deliveryCareRouterImpl$createAuthorizationInteractor$1$wrapAuthData$1 = (DeliveryCareRouterImpl$createAuthorizationInteractor$1$wrapAuthData$1) continuationImpl;
                int i2 = deliveryCareRouterImpl$createAuthorizationInteractor$1$wrapAuthData$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    deliveryCareRouterImpl$createAuthorizationInteractor$1$wrapAuthData$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = deliveryCareRouterImpl$createAuthorizationInteractor$1$wrapAuthData$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = deliveryCareRouterImpl$createAuthorizationInteractor$1$wrapAuthData$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        nwh nwhVar = this.a.G;
                        String str = this.b.a;
                        deliveryCareRouterImpl$createAuthorizationInteractor$1$wrapAuthData$1.L$0 = null;
                        deliveryCareRouterImpl$createAuthorizationInteractor$1$wrapAuthData$1.label = 1;
                        obj = n.a(nwhVar.c, str, deliveryCareRouterImpl$createAuthorizationInteractor$1$wrapAuthData$1);
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
                    return new qne((String) obj);
                }
            }
            if (i != 0) {
            }
            return new qne((String) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            jst.e.k(e2, "Error during getting auth url");
            return bb60.a;
        }
        deliveryCareRouterImpl$createAuthorizationInteractor$1$wrapAuthData$1 = new DeliveryCareRouterImpl$createAuthorizationInteractor$1$wrapAuthData$1(this, continuationImpl);
        Object obj2 = deliveryCareRouterImpl$createAuthorizationInteractor$1$wrapAuthData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryCareRouterImpl$createAuthorizationInteractor$1$wrapAuthData$1.label;
    }
}
