package ru.yandex.taxi.sdc.route.repository;

import defpackage.cmt;
import defpackage.emp0;
import defpackage.i3y;
import defpackage.kmp0;
import defpackage.lr40;
import defpackage.ny61;
import defpackage.on2;
import defpackage.x6v;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.sdc.route.api.SdcRouteApi;

/* loaded from: classes6.dex */
public final class a {
    public final i3y a;
    public volatile String b;

    public a(on2 on2Var) {
        this.a = kotlin.a.a(new lr40(on2Var, 13));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        SdcRouteRepository$request$1 sdcRouteRepository$request$1;
        int i;
        kmp0 kmp0Var;
        if (continuationImpl instanceof SdcRouteRepository$request$1) {
            sdcRouteRepository$request$1 = (SdcRouteRepository$request$1) continuationImpl;
            int i2 = sdcRouteRepository$request$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdcRouteRepository$request$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sdcRouteRepository$request$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdcRouteRepository$request$1.label;
                if (i != 0) {
                    b.b(obj);
                    String str = this.b;
                    if (str != null) {
                        cmt<kmp0> a = ((SdcRouteApi) this.a.getValue()).a(str, new emp0(list), x6v.a);
                        sdcRouteRepository$request$1.L$0 = null;
                        sdcRouteRepository$request$1.L$1 = null;
                        sdcRouteRepository$request$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.d(a, sdcRouteRepository$request$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    ny61.g("Self-driving route api url is null");
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                kmp0Var = (kmp0) obj;
                if (kmp0Var != null) {
                    return kmp0Var;
                }
                ny61.g("Self-driving route api url is null");
                return null;
            }
        }
        sdcRouteRepository$request$1 = new SdcRouteRepository$request$1(this, continuationImpl);
        Object obj2 = sdcRouteRepository$request$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdcRouteRepository$request$1.label;
        if (i != 0) {
        }
        kmp0Var = (kmp0) obj2;
        if (kmp0Var != null) {
        }
        ny61.g("Self-driving route api url is null");
        return null;
    }
}
