package ru.yandex.taxi.logistics.care.impl.router;

import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class b {
    public final /* synthetic */ f a;

    public b(f fVar) {
        this.a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        DeliveryCareRouterImpl$createCookiesUpdater$1$ensureAndInjectCookies$1 deliveryCareRouterImpl$createCookiesUpdater$1$ensureAndInjectCookies$1;
        int i;
        if (continuationImpl instanceof DeliveryCareRouterImpl$createCookiesUpdater$1$ensureAndInjectCookies$1) {
            deliveryCareRouterImpl$createCookiesUpdater$1$ensureAndInjectCookies$1 = (DeliveryCareRouterImpl$createCookiesUpdater$1$ensureAndInjectCookies$1) continuationImpl;
            int i2 = deliveryCareRouterImpl$createCookiesUpdater$1$ensureAndInjectCookies$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryCareRouterImpl$createCookiesUpdater$1$ensureAndInjectCookies$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryCareRouterImpl$createCookiesUpdater$1$ensureAndInjectCookies$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryCareRouterImpl$createCookiesUpdater$1$ensureAndInjectCookies$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                kotlin.b.b(obj);
                ru.yandex.taxi.logistics.care.impl.auth.a aVar = this.a.H;
                deliveryCareRouterImpl$createCookiesUpdater$1$ensureAndInjectCookies$1.L$0 = null;
                deliveryCareRouterImpl$createCookiesUpdater$1$ensureAndInjectCookies$1.label = 1;
                Object a = aVar.a(str, deliveryCareRouterImpl$createCookiesUpdater$1$ensureAndInjectCookies$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        deliveryCareRouterImpl$createCookiesUpdater$1$ensureAndInjectCookies$1 = new DeliveryCareRouterImpl$createCookiesUpdater$1$ensureAndInjectCookies$1(this, continuationImpl);
        Object obj2 = deliveryCareRouterImpl$createCookiesUpdater$1$ensureAndInjectCookies$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryCareRouterImpl$createCookiesUpdater$1$ensureAndInjectCookies$1.label;
        if (i == 0) {
        }
    }
}
