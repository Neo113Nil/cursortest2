package com.yandex.passport.data.network;

import com.yandex.passport.common.network.BackendError;
import defpackage.n9h;
import defpackage.qy0;
import defpackage.tkr;
import defpackage.u75;
import defpackage.uob;
import defpackage.wsd;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class k5 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ k5(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new wsd(tkr.a, r5.a, 1);
            case 1:
                return new qy0(tkr.a, 2);
            case 2:
                return new qy0(tkr.a, 2);
            case 3:
                return new qy0(b5.a, 0);
            case 4:
                return new qy0(l5.a, 0);
            case 5:
                return new qy0(d5.a, 0);
            case 6:
                return new qy0(h5.a, 0);
            case 7:
                return new qy0(tkr.a, 2);
            case 8:
                return new qy0(v4.a, 0);
            case 9:
                return new qy0(y4.a, 0);
            case 10:
                return new qy0(tkr.a, 0);
            case 11:
                return BackendError.Companion.serializer();
            case 12:
                return new qy0(tkr.a, 0);
            case 13:
                return new qy0(z7.a, 0);
            case 14:
                tkr tkrVar = tkr.a;
                return new wsd(tkrVar, tkrVar, 1);
            case 15:
                return new qy0(a4.a, 0);
            case 16:
                return com.yandex.passport.common.url.b.Companion.serializer();
            case 17:
                return new qy0(tkr.a, 0);
            case 18:
                tkr tkrVar2 = tkr.a;
                return new qy0(new n9h(tkrVar2, tkrVar2, 1), 0);
            case 19:
                return u75.h(new com.yandex.passport.internal.credentials.f("ixnjS4SWsp6DD8fshySJ/ClWdh38gE/8EyyCvNaD+qEPmlANxFG2IvCpi9PDzl/E", "iU22SNiVvsrSCJG7hy2Or80ApPky0d92/7+fYSB60nZjmc18fduySNaiLpXlwdwk"), new com.yandex.passport.internal.credentials.f("2hjjG9aQvp6ECpK4h32OqmsKO/FS5MjrSC2k5jbpuulTxNlZJTbGu1qjNGMgGNCS", "iU/gT9fHts+HX8Wwhynb/E50SuXqPFgiEL9heWzkKIClKeZ/2bfgHBw5/9SWyu5F"));
            case 20:
                return u75.h(new com.yandex.passport.internal.credentials.f("30iwH9LBts7aWsa+h3jW+Pw2Nhffr9+OKE6kZUd3myxUewFcIBLQ/nPv9h9McIAP", "3xG+HNSdvpjXXMe4h3/W+5IuRDGIssyuQYxU9exB1baFb1Y+JYPq4PI56ipR46e8"), new com.yandex.passport.internal.credentials.f("2RGyS4eX5M3WCpSwhy3drvxsFZiazERFgXh7Xyaxay97+WpIBn2q/U89j4pq8Q/g", "2x2/StnG4J3aX8K5hy6K/CG+nXJ+DJToPsBAqhNMpZucmW/DxBbYG97ywOMObJ/f"));
            case 21:
                return CollectionsKt.g0((List) com.yandex.passport.internal.credentials.g.b.getValue(), (List) com.yandex.passport.internal.credentials.g.c.getValue());
            case 22:
                return new qy0(tkr.a, 2);
            case 23:
                return new qy0(tkr.a, 2);
            case 24:
                ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                newCachedThreadPool.getClass();
                return new uob(newCachedThreadPool);
            case 25:
                return ConstantDeviceInfo.APP_PLATFORM;
            case 26:
                String language = Locale.getDefault().getLanguage();
                language.getClass();
                return language;
            case 27:
                return "7.54.1";
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return "light";
            default:
                String language2 = Locale.getDefault().getLanguage();
                language2.getClass();
                return language2;
        }
    }
}
