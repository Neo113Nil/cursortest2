package ru.yandex.taxi.communications.common.repository;

import defpackage.cmt;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.layers.api.TrackerApi;

/* loaded from: classes5.dex */
public final class b {
    public final TrackerApi a;

    public b(TrackerApi trackerApi) {
        this.a = trackerApi;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|24|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        defpackage.jst.e.getClass();
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        TaxiTrackingLinkRepository$trackLink$1 taxiTrackingLinkRepository$trackLink$1;
        int i;
        if (continuationImpl instanceof TaxiTrackingLinkRepository$trackLink$1) {
            taxiTrackingLinkRepository$trackLink$1 = (TaxiTrackingLinkRepository$trackLink$1) continuationImpl;
            int i2 = taxiTrackingLinkRepository$trackLink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiTrackingLinkRepository$trackLink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiTrackingLinkRepository$trackLink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiTrackingLinkRepository$trackLink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt b = TrackerApi.b(this.a, str, null, 6);
                    taxiTrackingLinkRepository$trackLink$1.L$0 = null;
                    taxiTrackingLinkRepository$trackLink$1.label = 1;
                    if (ru.yandex.taxi.network.api.a.a(b, null, taxiTrackingLinkRepository$trackLink$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        taxiTrackingLinkRepository$trackLink$1 = new TaxiTrackingLinkRepository$trackLink$1(this, continuationImpl);
        Object obj2 = taxiTrackingLinkRepository$trackLink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiTrackingLinkRepository$trackLink$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
