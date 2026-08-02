package ru.yandex.taxi.am;

import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportAutoLoginRetryRequiredException;
import defpackage.b64;
import defpackage.bvf0;
import defpackage.cl7;
import defpackage.cug;
import defpackage.d9;
import defpackage.dvw;
import defpackage.fhz;
import defpackage.g6u;
import defpackage.hbp0;
import defpackage.im51;
import defpackage.ip90;
import defpackage.j18;
import defpackage.jst;
import defpackage.kj;
import defpackage.lnj;
import defpackage.mdh;
import defpackage.n61;
import defpackage.ny61;
import defpackage.o400;
import defpackage.owx;
import defpackage.qr3;
import defpackage.r40;
import defpackage.rr3;
import defpackage.sjh;
import defpackage.sr3;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uj;
import defpackage.um3;
import defpackage.uyj;
import defpackage.vj;
import defpackage.w94;
import defpackage.wj;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.AutoLoginState;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

/* loaded from: classes9.dex */
public final class r {
    public final Lifecycle a;
    public final w94 b;
    public final ru.yandex.taxi.activity.g c;
    public final g d;
    public final k e;
    public final ru.yandex.taxi.startup.launch.c f;
    public final e g;
    public final ru.yandex.taxi.am.internal.f h;
    public final ru.yandex.taxi.am.internal.d i;
    public final fhz j;
    public final tt2 k;
    public final s l;
    public final ip90 m;
    public final lnj n;
    public final hbp0 o = new hbp0(new d9(20, this), "AutoLogin", new sr3(this));
    public final qr3 p = new qr3(this);
    public final boolean q;
    public rr3 r;
    public volatile boolean s;
    public final kotlinx.coroutines.flow.r0 t;
    public final kotlinx.coroutines.flow.r0 u;

    public r(Lifecycle lifecycle, w94 w94Var, ru.yandex.taxi.activity.g gVar, g gVar2, k kVar, ru.yandex.taxi.startup.launch.c cVar, e eVar, ru.yandex.taxi.am.internal.f fVar, ru.yandex.taxi.am.internal.d dVar, fhz fhzVar, tt2 tt2Var, s sVar, ip90 ip90Var, lnj lnjVar, im51 im51Var) {
        this.a = lifecycle;
        this.b = w94Var;
        this.c = gVar;
        this.d = gVar2;
        this.e = kVar;
        this.f = cVar;
        this.g = eVar;
        this.h = fVar;
        this.i = dVar;
        this.j = fhzVar;
        this.k = tt2Var;
        this.l = sVar;
        this.m = ip90Var;
        this.n = lnjVar;
        im51Var.getClass();
        this.q = true;
        this.s = true;
        kotlinx.coroutines.flow.r0 c = bvf0.c(AutoLoginState.NOT_STARTED);
        this.t = c;
        this.u = c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(1:(1:(1:(5:14|15|16|17|18)(2:20|21))(4:22|23|17|18))(8:24|25|(1:27)|28|29|(3:31|(2:33|(1:35))(2:37|(2:39|16))|36)|17|18))(7:40|41|(3:43|(4:45|25|(0)|28)|36)|29|(0)|17|18))(1:46))(1:49)|47))|52|6|7|(0)(0)|47) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0081, code lost:
    
        if (r14 != r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006f, code lost:
    
        if (ru.yandex.taxi.lifecycle.c.e(r14, r3, r1) == r2) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6 A[Catch: all -> 0x0111, TRY_ENTER, TryCatch #0 {all -> 0x0111, blocks: (B:15:0x0036, B:16:0x010a, B:23:0x0045, B:31:0x00d6, B:33:0x00da, B:37:0x00f5), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(r rVar, ContinuationImpl continuationImpl) {
        AutoLogin$doAutoLogin$1 autoLogin$doAutoLogin$1;
        int i;
        Object a;
        kj kjVar;
        Object obj;
        Throwable a2;
        Throwable th;
        String name;
        fhz fhzVar = rVar.j;
        if (continuationImpl instanceof AutoLogin$doAutoLogin$1) {
            autoLogin$doAutoLogin$1 = (AutoLogin$doAutoLogin$1) continuationImpl;
            int i2 = autoLogin$doAutoLogin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoLogin$doAutoLogin$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = autoLogin$doAutoLogin$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoLogin$doAutoLogin$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Lifecycle lifecycle = rVar.a;
                    Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
                    autoLogin$doAutoLogin$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj2);
                            a = ((Result) obj2).getValue();
                            if (!(a instanceof Result.Failure)) {
                                kjVar = (kj) a;
                                autoLogin$doAutoLogin$1.L$0 = a;
                                autoLogin$doAutoLogin$1.L$1 = kjVar;
                                autoLogin$doAutoLogin$1.label = 3;
                                if (rVar.d(kjVar, autoLogin$doAutoLogin$1) != obj3) {
                                    obj = a;
                                    LoginAnalytics$AutoLoginContext loginAnalytics$AutoLoginContext = LoginAnalytics$AutoLoginContext.SMARTLOCK;
                                    ((ru.yandex.taxi.analytics.j) fhzVar.a).s("Login.Auto.Shown");
                                    cug cugVar = fhzVar.d;
                                    Long valueOf = Long.valueOf(kjVar.a);
                                    name = loginAnalytics$AutoLoginContext.name();
                                    cugVar.getClass();
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("uid", valueOf);
                                    if (name != null) {
                                    }
                                    cugVar.a.a("Login.Auto.Shown", hashMap, 1, new HashMap());
                                    a = obj;
                                }
                                return obj3;
                            }
                            a2 = Result.a(a);
                            if (a2 != null) {
                            }
                            return zy11.a;
                        }
                        if (i != 3) {
                            if (i == 4) {
                                kotlin.b.b(obj2);
                                return zy11.a;
                            }
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            th = (Throwable) autoLogin$doAutoLogin$1.L$0;
                            kotlin.b.b(obj2);
                            fhzVar.a(null, th.getMessage());
                            return zy11.a;
                        }
                        kjVar = (kj) autoLogin$doAutoLogin$1.L$1;
                        obj = autoLogin$doAutoLogin$1.L$0;
                        kotlin.b.b(obj2);
                        LoginAnalytics$AutoLoginContext loginAnalytics$AutoLoginContext2 = LoginAnalytics$AutoLoginContext.SMARTLOCK;
                        ((ru.yandex.taxi.analytics.j) fhzVar.a).s("Login.Auto.Shown");
                        cug cugVar2 = fhzVar.d;
                        Long valueOf2 = Long.valueOf(kjVar.a);
                        name = loginAnalytics$AutoLoginContext2.name();
                        cugVar2.getClass();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("uid", valueOf2);
                        if (name != null) {
                            hashMap2.put("context", name);
                        }
                        cugVar2.a.a("Login.Auto.Shown", hashMap2, 1, new HashMap());
                        a = obj;
                        a2 = Result.a(a);
                        if (a2 != null) {
                            if (a2 instanceof PassportAutoLoginRetryRequiredException) {
                                rVar.k.getClass();
                                sjh sjhVar = uyj.a;
                                g6u g6uVar = o400.a;
                                AutoLogin$doAutoLogin$3$1 autoLogin$doAutoLogin$3$1 = new AutoLogin$doAutoLogin$3$1(rVar, a2, null);
                                autoLogin$doAutoLogin$1.L$0 = null;
                                autoLogin$doAutoLogin$1.L$1 = null;
                                autoLogin$doAutoLogin$1.label = 4;
                                if (tje.k0(g6uVar, autoLogin$doAutoLogin$3$1, autoLogin$doAutoLogin$1) == obj3) {
                                }
                            } else {
                                jst.e.k(a2, "Error while AutoLogin");
                                autoLogin$doAutoLogin$1.L$0 = a2;
                                autoLogin$doAutoLogin$1.L$1 = null;
                                autoLogin$doAutoLogin$1.label = 5;
                                if (rVar.f(autoLogin$doAutoLogin$1) != obj3) {
                                    th = a2;
                                    fhzVar.a(null, th.getMessage());
                                }
                            }
                            return obj3;
                        }
                        return zy11.a;
                    }
                    kotlin.b.b(obj2);
                }
                ru.yandex.taxi.am.internal.f fVar = rVar.h;
                com.yandex.passport.api.g a3 = rVar.m.a();
                autoLogin$doAutoLogin$1.label = 2;
                a = fVar.a(a3, autoLogin$doAutoLogin$1);
            }
        }
        autoLogin$doAutoLogin$1 = new AutoLogin$doAutoLogin$1(rVar, continuationImpl);
        Object obj22 = autoLogin$doAutoLogin$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoLogin$doAutoLogin$1.label;
        if (i != 0) {
        }
        ru.yandex.taxi.am.internal.f fVar2 = rVar.h;
        com.yandex.passport.api.g a32 = rVar.m.a();
        autoLogin$doAutoLogin$1.label = 2;
        a = fVar2.a(a32, autoLogin$doAutoLogin$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c2, code lost:
    
        if (r8.f(r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(r rVar, r40 r40Var, ContinuationImpl continuationImpl) {
        AutoLogin$handleRetryAutoLogin$1 autoLogin$handleRetryAutoLogin$1;
        int i;
        kj kjVar;
        rVar.getClass();
        if (continuationImpl instanceof AutoLogin$handleRetryAutoLogin$1) {
            autoLogin$handleRetryAutoLogin$1 = (AutoLogin$handleRetryAutoLogin$1) continuationImpl;
            int i2 = autoLogin$handleRetryAutoLogin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoLogin$handleRetryAutoLogin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoLogin$handleRetryAutoLogin$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoLogin$handleRetryAutoLogin$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (r40Var.b != 120 || r40Var.a != -1) {
                        rVar.g();
                        return zy11Var;
                    }
                    Intent intent = r40Var.c;
                    if (intent == null) {
                        rVar.g();
                        return zy11Var;
                    }
                    PassportUidImpl a = com.yandex.passport.api.r.c(intent).a();
                    ru.yandex.taxi.am.internal.d dVar = rVar.i;
                    autoLogin$handleRetryAutoLogin$1.L$0 = null;
                    autoLogin$handleRetryAutoLogin$1.L$1 = null;
                    autoLogin$handleRetryAutoLogin$1.L$2 = null;
                    autoLogin$handleRetryAutoLogin$1.label = 1;
                    obj = dVar.a(a, autoLogin$handleRetryAutoLogin$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        jst.e.n("Error while get account after retry autoLogin");
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                }
                kjVar = (kj) obj;
                if (kjVar == null) {
                    autoLogin$handleRetryAutoLogin$1.L$0 = null;
                    autoLogin$handleRetryAutoLogin$1.L$1 = null;
                    autoLogin$handleRetryAutoLogin$1.L$2 = null;
                    autoLogin$handleRetryAutoLogin$1.L$3 = null;
                    autoLogin$handleRetryAutoLogin$1.label = 2;
                    Object d = rVar.d(kjVar, autoLogin$handleRetryAutoLogin$1);
                    if (d != obj2) {
                        return d;
                    }
                } else {
                    autoLogin$handleRetryAutoLogin$1.L$0 = null;
                    autoLogin$handleRetryAutoLogin$1.L$1 = null;
                    autoLogin$handleRetryAutoLogin$1.L$2 = null;
                    autoLogin$handleRetryAutoLogin$1.L$3 = null;
                    autoLogin$handleRetryAutoLogin$1.label = 3;
                }
                return obj2;
            }
        }
        autoLogin$handleRetryAutoLogin$1 = new AutoLogin$handleRetryAutoLogin$1(rVar, continuationImpl);
        Object obj3 = autoLogin$handleRetryAutoLogin$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoLogin$handleRetryAutoLogin$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        kjVar = (kj) obj3;
        if (kjVar == null) {
        }
        return obj22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
    
        if (r15.s() != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (ru.yandex.taxi.lifecycle.c.e(r15, r2, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r14v2, types: [T, uj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(r rVar, ContinuationImpl continuationImpl) {
        AutoLogin$showLoginWithMultipleAccounts$1 autoLogin$showLoginWithMultipleAccounts$1;
        int i;
        cl7 cl7Var;
        rVar.getClass();
        if (continuationImpl instanceof AutoLogin$showLoginWithMultipleAccounts$1) {
            autoLogin$showLoginWithMultipleAccounts$1 = (AutoLogin$showLoginWithMultipleAccounts$1) continuationImpl;
            int i2 = autoLogin$showLoginWithMultipleAccounts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoLogin$showLoginWithMultipleAccounts$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoLogin$showLoginWithMultipleAccounts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoLogin$showLoginWithMultipleAccounts$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Lifecycle lifecycle = rVar.a;
                    Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
                    autoLogin$showLoginWithMultipleAccounts$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                jst.e.getClass();
                k kVar = rVar.e;
                kVar.z.setValue(kVar, k.S[1], Boolean.TRUE);
                autoLogin$showLoginWithMultipleAccounts$1.label = 2;
                j18 j18Var = new j18(1, dvw.b(autoLogin$showLoginWithMultipleAccounts$1));
                Ref$ObjectRef y = b64.y(j18Var);
                vj vjVar = new vj(2, y);
                cl7Var = new cl7(j18Var, vjVar);
                n61 n61Var = new n61(rVar, new AutoLogin$showLoginWithMultipleAccounts$$inlined$suspendCallbackApi$2(cl7Var), new AutoLogin$showLoginWithMultipleAccounts$$inlined$suspendCallbackApi$3(cl7Var), i3);
                e eVar = rVar.g;
                Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.AUTOLOGIN;
                eVar.getClass();
                eVar.f(new um3(events$Zalogin$LoginContext, n61Var, false, false, 28));
                y.element = uj.w;
                if (cl7Var.c()) {
                    j18Var.w(new wj(cl7Var, 2));
                } else {
                    vjVar.invoke();
                }
            }
        }
        autoLogin$showLoginWithMultipleAccounts$1 = new AutoLogin$showLoginWithMultipleAccounts$1(rVar, continuationImpl);
        Object obj2 = autoLogin$showLoginWithMultipleAccounts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoLogin$showLoginWithMultipleAccounts$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        jst.e.getClass();
        k kVar2 = rVar.e;
        kVar2.z.setValue(kVar2, k.S[1], Boolean.TRUE);
        autoLogin$showLoginWithMultipleAccounts$1.label = 2;
        j18 j18Var2 = new j18(1, dvw.b(autoLogin$showLoginWithMultipleAccounts$1));
        Ref$ObjectRef y2 = b64.y(j18Var2);
        vj vjVar2 = new vj(2, y2);
        cl7Var = new cl7(j18Var2, vjVar2);
        n61 n61Var2 = new n61(rVar, new AutoLogin$showLoginWithMultipleAccounts$$inlined$suspendCallbackApi$2(cl7Var), new AutoLogin$showLoginWithMultipleAccounts$$inlined$suspendCallbackApi$3(cl7Var), i32);
        e eVar2 = rVar.g;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext2 = Events$Zalogin$LoginContext.AUTOLOGIN;
        eVar2.getClass();
        eVar2.f(new um3(events$Zalogin$LoginContext2, n61Var2, false, false, 28));
        y2.element = uj.w;
        if (cl7Var.c()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(4:19|20|(3:22|(2:25|14)|24)|15))(8:26|27|28|29|(2:31|(1:33))|20|(0)|15))(1:36))(1:42)|37|(3:39|(2:41|24)|28)|29|(0)|20|(0)|15))|46|6|7|(0)(0)|37|(0)|29|(0)|20|(0)|15) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        if (r13 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        if (r13 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005f, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009d, code lost:
    
        r13 = new kotlin.Result.Failure(r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084 A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #0 {all -> 0x005f, blocks: (B:27:0x005b, B:28:0x009a, B:39:0x0084), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(kj kjVar, ContinuationImpl continuationImpl) {
        AutoLogin$handleAutoLoginSuccess$1 autoLogin$handleAutoLoginSuccess$1;
        int i;
        Object failure;
        kj kjVar2;
        Object obj;
        Throwable a;
        Throwable th;
        kj kjVar3;
        if (continuationImpl instanceof AutoLogin$handleAutoLoginSuccess$1) {
            autoLogin$handleAutoLoginSuccess$1 = (AutoLogin$handleAutoLoginSuccess$1) continuationImpl;
            int i2 = autoLogin$handleAutoLoginSuccess$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoLogin$handleAutoLoginSuccess$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = autoLogin$handleAutoLoginSuccess$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoLogin$handleAutoLoginSuccess$1.label;
                Object obj4 = zy11.a;
                fhz fhzVar = this.j;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    autoLogin$handleAutoLoginSuccess$1.L$0 = kjVar;
                    autoLogin$handleAutoLoginSuccess$1.label = 1;
                    failure = this.d.c(kjVar, autoLogin$handleAutoLoginSuccess$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kjVar = (kj) autoLogin$handleAutoLoginSuccess$1.L$0;
                            kotlin.b.b(obj2);
                            failure = (owx) obj2;
                            kjVar2 = kjVar;
                            obj = failure;
                            if (!(obj instanceof Result.Failure)) {
                                k kVar = this.e;
                                kVar.z.setValue(kVar, k.S[1], Boolean.TRUE);
                                autoLogin$handleAutoLoginSuccess$1.L$0 = kjVar2;
                                autoLogin$handleAutoLoginSuccess$1.L$1 = obj;
                                autoLogin$handleAutoLoginSuccess$1.L$2 = null;
                                autoLogin$handleAutoLoginSuccess$1.label = 3;
                                this.k.getClass();
                                sjh sjhVar = uyj.a;
                                Object k0 = tje.k0(o400.a, new AutoLogin$notifySuccessAsync$2(this, null), autoLogin$handleAutoLoginSuccess$1);
                                if (k0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    k0 = obj4;
                                }
                            }
                            a = Result.a(obj);
                            if (a != null) {
                            }
                            return obj4;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            th = (Throwable) autoLogin$handleAutoLoginSuccess$1.L$2;
                            kjVar3 = (kj) autoLogin$handleAutoLoginSuccess$1.L$0;
                            kotlin.b.b(obj2);
                            fhzVar.a(kjVar3, th.getMessage());
                            return obj4;
                        }
                        obj = autoLogin$handleAutoLoginSuccess$1.L$1;
                        kjVar2 = (kj) autoLogin$handleAutoLoginSuccess$1.L$0;
                        kotlin.b.b(obj2);
                        a = Result.a(obj);
                        if (a != null) {
                            autoLogin$handleAutoLoginSuccess$1.L$0 = kjVar2;
                            autoLogin$handleAutoLoginSuccess$1.L$1 = obj;
                            autoLogin$handleAutoLoginSuccess$1.L$2 = a;
                            autoLogin$handleAutoLoginSuccess$1.label = 4;
                            if (f(autoLogin$handleAutoLoginSuccess$1) != obj3) {
                                th = a;
                                kjVar3 = kjVar2;
                                fhzVar.a(kjVar3, th.getMessage());
                            }
                            return obj3;
                        }
                        return obj4;
                    }
                    kjVar = (kj) autoLogin$handleAutoLoginSuccess$1.L$0;
                    kotlin.b.b(obj2);
                    failure = ((Result) obj2).getValue();
                }
                if (!(failure instanceof Result.Failure)) {
                    fhzVar.b(kjVar);
                    ru.yandex.taxi.startup.launch.c cVar = this.f;
                    autoLogin$handleAutoLoginSuccess$1.L$0 = kjVar;
                    autoLogin$handleAutoLoginSuccess$1.L$1 = null;
                    autoLogin$handleAutoLoginSuccess$1.label = 2;
                    obj2 = cVar.a("AutoLogin", autoLogin$handleAutoLoginSuccess$1, true);
                    if (obj2 == obj3) {
                        return obj3;
                    }
                    failure = (owx) obj2;
                }
                kjVar2 = kjVar;
                obj = failure;
                if (!(obj instanceof Result.Failure)) {
                }
                a = Result.a(obj);
                if (a != null) {
                }
                return obj4;
            }
        }
        autoLogin$handleAutoLoginSuccess$1 = new AutoLogin$handleAutoLoginSuccess$1(this, continuationImpl);
        Object obj22 = autoLogin$handleAutoLoginSuccess$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoLogin$handleAutoLoginSuccess$1.label;
        Object obj42 = zy11.a;
        fhz fhzVar2 = this.j;
        if (i != 0) {
        }
        if (!(failure instanceof Result.Failure)) {
        }
        kjVar2 = kjVar;
        obj = failure;
        if (!(obj instanceof Result.Failure)) {
        }
        a = Result.a(obj);
        if (a != null) {
        }
        return obj42;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0068, code lost:
    
        if (((java.lang.Boolean) r6).booleanValue() != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        AutoLogin$isAutologinCanBeStarted$1 autoLogin$isAutologinCanBeStarted$1;
        int i;
        if (continuationImpl instanceof AutoLogin$isAutologinCanBeStarted$1) {
            autoLogin$isAutologinCanBeStarted$1 = (AutoLogin$isAutologinCanBeStarted$1) continuationImpl;
            int i2 = autoLogin$isAutologinCanBeStarted$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoLogin$isAutologinCanBeStarted$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoLogin$isAutologinCanBeStarted$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoLogin$isAutologinCanBeStarted$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (this.q) {
                        k kVar = this.e;
                        if (!((Boolean) kVar.z.getValue(kVar, k.S[1])).booleanValue() && !this.d.f()) {
                            tpr a = this.n.a.a();
                            autoLogin$isAutologinCanBeStarted$1.label = 1;
                            obj = kotlinx.coroutines.flow.e.y(a, autoLogin$isAutologinCanBeStarted$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
        }
        autoLogin$isAutologinCanBeStarted$1 = new AutoLogin$isAutologinCanBeStarted$1(this, continuationImpl);
        Object obj2 = autoLogin$isAutologinCanBeStarted$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoLogin$isAutologinCanBeStarted$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
    }

    public final Object f(ContinuationImpl continuationImpl) {
        this.k.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new AutoLogin$notifyFailAsync$2(this, null), continuationImpl);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final void g() {
        this.s = false;
        rr3 rr3Var = this.r;
        if (rr3Var != null) {
            rr3Var.B();
        }
        this.r = null;
        kotlinx.coroutines.flow.r0 r0Var = this.t;
        k kVar = this.e;
        r0Var.l(((Boolean) kVar.z.getValue(kVar, k.S[1])).booleanValue() ? AutoLoginState.FAILED_WITH_PASSPORT : AutoLoginState.FAILED_WITHOUT_PASSPORT);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (r9 != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0049, code lost:
    
        if (r9 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055 A[Catch: all -> 0x0030, TRY_ENTER, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:18:0x0038, B:19:0x0060, B:28:0x0055), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        AutoLogin$performAutoLogin$1 autoLogin$performAutoLogin$1;
        Object obj;
        int i;
        Object k0;
        try {
            if (continuationImpl instanceof AutoLogin$performAutoLogin$1) {
                autoLogin$performAutoLogin$1 = (AutoLogin$performAutoLogin$1) continuationImpl;
                int i2 = autoLogin$performAutoLogin$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    autoLogin$performAutoLogin$1.label = i2 - Integer.MIN_VALUE;
                    obj = autoLogin$performAutoLogin$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = autoLogin$performAutoLogin$1.label;
                    Object obj3 = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        autoLogin$performAutoLogin$1.label = 1;
                        obj = e(autoLogin$performAutoLogin$1);
                    } else if (i == 1) {
                        kotlin.b.b(obj);
                    } else {
                        if (i != 2) {
                            if (i == 3) {
                                kotlin.b.b(obj);
                                return obj3;
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        this.t.l(AutoLoginState.STARTED);
                        autoLogin$performAutoLogin$1.label = 3;
                        this.k.getClass();
                        sjh sjhVar = uyj.a;
                        k0 = tje.k0(mdh.b, new AutoLogin$startAutoLogin$2(this, null), autoLogin$performAutoLogin$1);
                        if (k0 != obj2) {
                            k0 = obj3;
                        }
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return obj3;
                    }
                    s sVar = this.l;
                    autoLogin$performAutoLogin$1.label = 2;
                    if (sVar.a(autoLogin$performAutoLogin$1) == obj2) {
                        return obj2;
                    }
                    this.t.l(AutoLoginState.STARTED);
                    autoLogin$performAutoLogin$1.label = 3;
                    this.k.getClass();
                    sjh sjhVar2 = uyj.a;
                    k0 = tje.k0(mdh.b, new AutoLogin$startAutoLogin$2(this, null), autoLogin$performAutoLogin$1);
                    if (k0 != obj2) {
                    }
                }
            }
            if (i != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } finally {
            g();
        }
        autoLogin$performAutoLogin$1 = new AutoLogin$performAutoLogin$1(this, continuationImpl);
        obj = autoLogin$performAutoLogin$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoLogin$performAutoLogin$1.label;
        Object obj32 = zy11.a;
    }
}
