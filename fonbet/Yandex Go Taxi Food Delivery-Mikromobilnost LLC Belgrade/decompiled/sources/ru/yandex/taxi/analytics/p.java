package ru.yandex.taxi.analytics;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.e8y;
import defpackage.h630;
import defpackage.jbh;
import defpackage.k0b0;
import defpackage.ny61;
import defpackage.oo31;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.x4e;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes9.dex */
public final class p {
    public final h630 a;
    public final rqo b;
    public final k0b0 c;

    public p(h630 h630Var, rqo rqoVar, k0b0 k0b0Var) {
        this.a = h630Var;
        this.b = rqoVar;
        this.c = k0b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(e8y e8yVar, int i, int i2, String str, ContinuationImpl continuationImpl) {
        LbsRequestAnalytics$afterRequest$1 lbsRequestAnalytics$afterRequest$1;
        int i3;
        Object obj;
        String str2;
        int i4;
        int i5;
        boolean z;
        boolean booleanValue;
        if (continuationImpl instanceof LbsRequestAnalytics$afterRequest$1) {
            lbsRequestAnalytics$afterRequest$1 = (LbsRequestAnalytics$afterRequest$1) continuationImpl;
            int i6 = lbsRequestAnalytics$afterRequest$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                lbsRequestAnalytics$afterRequest$1.label = i6 - Integer.MIN_VALUE;
                Object obj2 = lbsRequestAnalytics$afterRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = lbsRequestAnalytics$afterRequest$1.label;
                if (i3 != 0) {
                    kotlin.b.b(obj2);
                    t1b0 f = ((jbh) this.b).f(SimplePersistentBooleanExperiment.SEND_MONITORING_LBS_ANALYTICS);
                    lbsRequestAnalytics$afterRequest$1.L$0 = e8yVar;
                    lbsRequestAnalytics$afterRequest$1.L$1 = str;
                    lbsRequestAnalytics$afterRequest$1.Z$0 = false;
                    lbsRequestAnalytics$afterRequest$1.I$0 = i;
                    lbsRequestAnalytics$afterRequest$1.I$1 = i2;
                    lbsRequestAnalytics$afterRequest$1.label = 1;
                    Object b = f.b(lbsRequestAnalytics$afterRequest$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b;
                    str2 = str;
                    i4 = i2;
                    i5 = i;
                    z = false;
                } else {
                    if (i3 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i7 = lbsRequestAnalytics$afterRequest$1.I$1;
                    int i8 = lbsRequestAnalytics$afterRequest$1.I$0;
                    boolean z2 = lbsRequestAnalytics$afterRequest$1.Z$0;
                    String str3 = (String) lbsRequestAnalytics$afterRequest$1.L$1;
                    e8y e8yVar2 = (e8y) lbsRequestAnalytics$afterRequest$1.L$0;
                    kotlin.b.b(obj2);
                    z = z2;
                    e8yVar = e8yVar2;
                    obj = obj2;
                    str2 = str3;
                    i4 = i7;
                    i5 = i8;
                }
                booleanValue = ((Boolean) obj).booleanValue();
                zy11 zy11Var = zy11.a;
                if (booleanValue) {
                    return zy11Var;
                }
                boolean isEmpty = e8yVar.e.isEmpty();
                boolean isEmpty2 = e8yVar.d.isEmpty();
                String str4 = e8yVar.b;
                boolean z3 = str4 == null || str4.length() == 0;
                String str5 = e8yVar.c;
                boolean z4 = str5 == null || str5.length() == 0;
                boolean g = this.c.g();
                h630 h630Var = this.a;
                h630Var.getClass();
                HashMap hashMap = new HashMap();
                oo31.q(isEmpty, hashMap, "isWifiEmpty", isEmpty2, "isGsmEmpty");
                oo31.q(z, hashMap, "isFromLocationSdk", z3, "isIpEmpty");
                hashMap.put("isIdEmpty", Boolean.valueOf(z4));
                hashMap.put(AuthSdkActivity.RESPONSE_TYPE_CODE, Integer.valueOf(i5));
                hashMap.put(ErrorResponseData.JSON_ERROR_CODE, Integer.valueOf(i4));
                if (str2 != null) {
                    hashMap.put(ErrorResponseData.JSON_ERROR_MESSAGE, str2);
                }
                h630Var.a.a("MonitoringLbsAfterRequestEvent", hashMap, 1, x4e.r(g, hashMap, "hasFineLocationPermission"));
                return zy11Var;
            }
        }
        lbsRequestAnalytics$afterRequest$1 = new LbsRequestAnalytics$afterRequest$1(this, continuationImpl);
        Object obj22 = lbsRequestAnalytics$afterRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = lbsRequestAnalytics$afterRequest$1.label;
        if (i3 != 0) {
        }
        booleanValue = ((Boolean) obj).booleanValue();
        zy11 zy11Var2 = zy11.a;
        if (booleanValue) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(e8y e8yVar, ContinuationImpl continuationImpl) {
        LbsRequestAnalytics$beforeRequest$1 lbsRequestAnalytics$beforeRequest$1;
        int i;
        Object obj;
        boolean z;
        boolean booleanValue;
        if (continuationImpl instanceof LbsRequestAnalytics$beforeRequest$1) {
            lbsRequestAnalytics$beforeRequest$1 = (LbsRequestAnalytics$beforeRequest$1) continuationImpl;
            int i2 = lbsRequestAnalytics$beforeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbsRequestAnalytics$beforeRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = lbsRequestAnalytics$beforeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lbsRequestAnalytics$beforeRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    t1b0 f = ((jbh) this.b).f(SimplePersistentBooleanExperiment.SEND_MONITORING_LBS_ANALYTICS);
                    lbsRequestAnalytics$beforeRequest$1.L$0 = e8yVar;
                    lbsRequestAnalytics$beforeRequest$1.Z$0 = false;
                    lbsRequestAnalytics$beforeRequest$1.label = 1;
                    Object b = f.b(lbsRequestAnalytics$beforeRequest$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b;
                    z = false;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z2 = lbsRequestAnalytics$beforeRequest$1.Z$0;
                    e8y e8yVar2 = (e8y) lbsRequestAnalytics$beforeRequest$1.L$0;
                    kotlin.b.b(obj2);
                    z = z2;
                    e8yVar = e8yVar2;
                    obj = obj2;
                }
                booleanValue = ((Boolean) obj).booleanValue();
                zy11 zy11Var = zy11.a;
                if (booleanValue) {
                    return zy11Var;
                }
                boolean isEmpty = e8yVar.e.isEmpty();
                boolean isEmpty2 = e8yVar.d.isEmpty();
                String str = e8yVar.b;
                boolean z3 = str == null || str.length() == 0;
                String str2 = e8yVar.c;
                boolean z4 = str2 == null || str2.length() == 0;
                boolean g = this.c.g();
                h630 h630Var = this.a;
                h630Var.getClass();
                HashMap hashMap = new HashMap();
                oo31.q(isEmpty, hashMap, "isWifiEmpty", isEmpty2, "isGsmEmpty");
                oo31.q(z, hashMap, "isFromLocationSdk", z3, "isIpEmpty");
                hashMap.put("isIdEmpty", Boolean.valueOf(z4));
                hashMap.put("hasFineLocationPermission", Boolean.valueOf(g));
                h630Var.a.a("MonitoringLbsBeforeRequestEvent", hashMap, 1, new HashMap());
                return zy11Var;
            }
        }
        lbsRequestAnalytics$beforeRequest$1 = new LbsRequestAnalytics$beforeRequest$1(this, continuationImpl);
        Object obj22 = lbsRequestAnalytics$beforeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lbsRequestAnalytics$beforeRequest$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj).booleanValue();
        zy11 zy11Var2 = zy11.a;
        if (booleanValue) {
        }
    }
}
