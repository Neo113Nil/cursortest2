package ru.yandex.taxi.altpins.order;

import defpackage.ck;
import defpackage.cmt;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.on2;
import defpackage.s8o;
import defpackage.t08;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class f {
    public final i3y a;

    public f(on2 on2Var) {
        this.a = kotlin.a.a(new ck(on2Var, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        AltpinDestinationWalkingInfoRepository$cancelWalkingRoute$1 altpinDestinationWalkingInfoRepository$cancelWalkingRoute$1;
        int i;
        zy11 zy11Var;
        try {
            if (continuationImpl instanceof AltpinDestinationWalkingInfoRepository$cancelWalkingRoute$1) {
                altpinDestinationWalkingInfoRepository$cancelWalkingRoute$1 = (AltpinDestinationWalkingInfoRepository$cancelWalkingRoute$1) continuationImpl;
                int i2 = altpinDestinationWalkingInfoRepository$cancelWalkingRoute$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    altpinDestinationWalkingInfoRepository$cancelWalkingRoute$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = altpinDestinationWalkingInfoRepository$cancelWalkingRoute$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = altpinDestinationWalkingInfoRepository$cancelWalkingRoute$1.label;
                    zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<zy11> a = ((AltpinApi) this.a.getValue()).a(new t08(str));
                        altpinDestinationWalkingInfoRepository$cancelWalkingRoute$1.L$0 = null;
                        altpinDestinationWalkingInfoRepository$cancelWalkingRoute$1.label = 1;
                        return ru.yandex.taxi.network.api.a.d(a, altpinDestinationWalkingInfoRepository$cancelWalkingRoute$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
            }
            if (i != 0) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return s8o.C(e2) ? zy11Var : new Result.Failure(e2);
        }
        altpinDestinationWalkingInfoRepository$cancelWalkingRoute$1 = new AltpinDestinationWalkingInfoRepository$cancelWalkingRoute$1(this, continuationImpl);
        Object obj2 = altpinDestinationWalkingInfoRepository$cancelWalkingRoute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = altpinDestinationWalkingInfoRepository$cancelWalkingRoute$1.label;
        zy11Var = zy11.a;
    }
}
