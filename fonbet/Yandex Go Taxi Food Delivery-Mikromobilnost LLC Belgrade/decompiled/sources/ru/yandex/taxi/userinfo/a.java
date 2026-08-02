package ru.yandex.taxi.userinfo;

import com.yandex.go.protector.net.UserInfoApi;
import defpackage.fva0;
import defpackage.hit;
import defpackage.hwx;
import defpackage.jbh;
import defpackage.jst;
import defpackage.kb20;
import defpackage.n9;
import defpackage.ny61;
import defpackage.on2;
import defpackage.owx;
import defpackage.pzt0;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.tje;
import defpackage.un21;
import defpackage.xby;
import defpackage.zl60;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes10.dex */
public final class a implements hwx {
    public final g a;
    public final n9 b;
    public final fva0 c;
    public final zl60 d;
    public final kb20 e;
    public final hit f;
    public final UserInfoApi g;
    public final qqo h;
    public final qqo i;
    public pzt0 j;
    public final String k;

    public a(on2 on2Var, rqo rqoVar, g gVar, n9 n9Var, fva0 fva0Var, zl60 zl60Var, kb20 kb20Var, hit hitVar) {
        this.a = gVar;
        this.b = n9Var;
        this.c = fva0Var;
        this.d = zl60Var;
        this.e = kb20Var;
        this.f = hitVar;
        on2Var.getClass();
        this.g = (UserInfoApi) on2Var.a(GoApiName.TaxiV3, UserInfoApi.class);
        jbh jbhVar = (jbh) rqoVar;
        this.h = jbhVar.a(SimpleBooleanExperiment.USE_USERINFO_MAIN_ENDPOINT);
        this.i = jbhVar.a(SimpleBooleanExperiment.USE_USERINFO_AUX_ENDPOINT);
        this.k = "userinfo";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(a aVar, String str, String str2, ContinuationImpl continuationImpl) {
        UserInfoSender$getRequestParams$1 userInfoSender$getRequestParams$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        String a;
        String valueOf;
        String str3;
        String str4;
        un21 un21Var;
        zl60 zl60Var = aVar.d;
        if (continuationImpl instanceof UserInfoSender$getRequestParams$1) {
            userInfoSender$getRequestParams$1 = (UserInfoSender$getRequestParams$1) continuationImpl;
            int i2 = userInfoSender$getRequestParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userInfoSender$getRequestParams$1.label = i2 - Integer.MIN_VALUE;
                obj = userInfoSender$getRequestParams$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userInfoSender$getRequestParams$1.label;
                if (i != 0) {
                    b.b(obj);
                    a = aVar.e.a();
                    g gVar = aVar.a;
                    valueOf = gVar.f() ? String.valueOf(gVar.i()) : null;
                    if (a == null) {
                        xby.l(jst.e, "UserInfo:MissingParam", null, zl60Var.a, "appmetricaDeviceId is null", 2);
                    }
                    if (valueOf == null) {
                        xby.l(jst.e, "UserInfo:MissingParam", null, zl60Var.b, "getYandexUid is null", 2);
                    }
                    userInfoSender$getRequestParams$1.L$0 = null;
                    userInfoSender$getRequestParams$1.L$1 = null;
                    userInfoSender$getRequestParams$1.L$2 = null;
                    userInfoSender$getRequestParams$1.L$3 = valueOf;
                    userInfoSender$getRequestParams$1.L$4 = str;
                    userInfoSender$getRequestParams$1.L$5 = a;
                    str3 = str2;
                    userInfoSender$getRequestParams$1.L$6 = str3;
                    userInfoSender$getRequestParams$1.label = 1;
                    Object b = aVar.b(userInfoSender$getRequestParams$1);
                    if (b != coroutineSingletons) {
                        str4 = str;
                        obj = b;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    un21Var = (un21) userInfoSender$getRequestParams$1.L$4;
                    b.b(obj);
                    return new Pair(un21Var, (String) obj);
                }
                str3 = (String) userInfoSender$getRequestParams$1.L$6;
                a = (String) userInfoSender$getRequestParams$1.L$5;
                String str5 = (String) userInfoSender$getRequestParams$1.L$4;
                valueOf = (String) userInfoSender$getRequestParams$1.L$3;
                b.b(obj);
                str4 = str5;
                un21 un21Var2 = new un21(str4, a, str3, (String) obj, valueOf);
                userInfoSender$getRequestParams$1.L$0 = null;
                userInfoSender$getRequestParams$1.L$1 = null;
                userInfoSender$getRequestParams$1.L$2 = null;
                userInfoSender$getRequestParams$1.L$3 = null;
                userInfoSender$getRequestParams$1.L$4 = un21Var2;
                userInfoSender$getRequestParams$1.L$5 = null;
                userInfoSender$getRequestParams$1.L$6 = null;
                userInfoSender$getRequestParams$1.label = 2;
                obj = aVar.c(userInfoSender$getRequestParams$1);
                if (obj != coroutineSingletons) {
                    un21Var = un21Var2;
                    return new Pair(un21Var, (String) obj);
                }
                return coroutineSingletons;
            }
        }
        userInfoSender$getRequestParams$1 = new UserInfoSender$getRequestParams$1(aVar, continuationImpl);
        obj = userInfoSender$getRequestParams$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userInfoSender$getRequestParams$1.label;
        if (i != 0) {
        }
        un21 un21Var22 = new un21(str4, a, str3, (String) obj, valueOf);
        userInfoSender$getRequestParams$1.L$0 = null;
        userInfoSender$getRequestParams$1.L$1 = null;
        userInfoSender$getRequestParams$1.L$2 = null;
        userInfoSender$getRequestParams$1.L$3 = null;
        userInfoSender$getRequestParams$1.L$4 = un21Var22;
        userInfoSender$getRequestParams$1.L$5 = null;
        userInfoSender$getRequestParams$1.L$6 = null;
        userInfoSender$getRequestParams$1.label = 2;
        obj = aVar.c(userInfoSender$getRequestParams$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        UserInfoSender$getDeviceInfo$1 userInfoSender$getDeviceInfo$1;
        int i;
        fva0 fva0Var;
        try {
            if (continuationImpl instanceof UserInfoSender$getDeviceInfo$1) {
                userInfoSender$getDeviceInfo$1 = (UserInfoSender$getDeviceInfo$1) continuationImpl;
                int i2 = userInfoSender$getDeviceInfo$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    userInfoSender$getDeviceInfo$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = userInfoSender$getDeviceInfo$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = userInfoSender$getDeviceInfo$1.label;
                    fva0Var = this.c;
                    if (i != 0) {
                        b.b(obj);
                        if (!((Boolean) this.i.b()).booleanValue()) {
                            return null;
                        }
                        fva0.f(this.c, "UserInfoSender.Data2", PerformanceAnalytics$Type.Creating, 0L, 4);
                        n9 n9Var = this.b;
                        userInfoSender$getDeviceInfo$1.label = 1;
                        obj = n9Var.e(userInfoSender$getDeviceInfo$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    String str = (String) obj;
                    fva0.b(fva0Var, "UserInfoSender.Data2", PerformanceAnalytics$Type.Creating, null, 4);
                    return str;
                }
            }
            if (i != 0) {
            }
            String str2 = (String) obj;
            fva0.b(fva0Var, "UserInfoSender.Data2", PerformanceAnalytics$Type.Creating, null, 4);
            return str2;
        } catch (Throwable th) {
            fva0.b(fva0Var, "UserInfoSender.Data2", PerformanceAnalytics$Type.Creating, null, 4);
            throw th;
        }
        userInfoSender$getDeviceInfo$1 = new UserInfoSender$getDeviceInfo$1(this, continuationImpl);
        Object obj2 = userInfoSender$getDeviceInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userInfoSender$getDeviceInfo$1.label;
        fva0Var = this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        UserInfoSender$getSignatureData$1 userInfoSender$getSignatureData$1;
        int i;
        fva0 fva0Var;
        try {
            if (continuationImpl instanceof UserInfoSender$getSignatureData$1) {
                userInfoSender$getSignatureData$1 = (UserInfoSender$getSignatureData$1) continuationImpl;
                int i2 = userInfoSender$getSignatureData$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    userInfoSender$getSignatureData$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = userInfoSender$getSignatureData$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = userInfoSender$getSignatureData$1.label;
                    fva0Var = this.c;
                    if (i != 0) {
                        b.b(obj);
                        fva0.f(this.c, "UserInfoSender.Data1", PerformanceAnalytics$Type.Creating, 0L, 4);
                        n9 n9Var = this.b;
                        userInfoSender$getSignatureData$1.label = 1;
                        obj = n9Var.c(userInfoSender$getSignatureData$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    String str = (String) obj;
                    fva0.b(fva0Var, "UserInfoSender.Data1", PerformanceAnalytics$Type.Creating, null, 4);
                    return str;
                }
            }
            if (i != 0) {
            }
            String str2 = (String) obj;
            fva0.b(fva0Var, "UserInfoSender.Data1", PerformanceAnalytics$Type.Creating, null, 4);
            return str2;
        } catch (Throwable th) {
            fva0.b(fva0Var, "UserInfoSender.Data1", PerformanceAnalytics$Type.Creating, null, 4);
            throw th;
        }
        userInfoSender$getSignatureData$1 = new UserInfoSender$getSignatureData$1(this, continuationImpl);
        Object obj2 = userInfoSender$getSignatureData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userInfoSender$getSignatureData$1.label;
        fva0Var = this.c;
    }

    @Override // defpackage.j35
    public final String getName() {
        return this.k;
    }

    @Override // defpackage.hwx
    public final void k(owx owxVar) {
        if (((Boolean) this.h.b()).booleanValue()) {
            String str = owxVar.g;
            if (str == null) {
                str = "";
            }
            String str2 = owxVar.m;
            String str3 = str2 != null ? str2 : "";
            pzt0 pzt0Var = this.j;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.j = tje.N(this.f.a, null, null, new UserInfoSender$sendUserInfo$1(this, str, str3, null), 3);
        }
    }
}
