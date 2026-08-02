package ru.yandex.taxi.am;

import android.content.Context;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportInvalidTokenException;
import com.yandex.passport.api.exception.PassportUpdateInfoNeededException;
import com.yandex.passport.api.n2;
import defpackage.ckf0;
import defpackage.cne0;
import defpackage.dvx;
import defpackage.ep90;
import defpackage.evx;
import defpackage.g6u;
import defpackage.gtq0;
import defpackage.hqe;
import defpackage.jl40;
import defpackage.jst;
import defpackage.kj;
import defpackage.lm;
import defpackage.ny61;
import defpackage.o400;
import defpackage.owx;
import defpackage.pj;
import defpackage.pz40;
import defpackage.qv10;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.u02;
import defpackage.uyj;
import defpackage.w511;
import defpackage.xby;
import defpackage.y50;
import defpackage.zy11;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final class s0 implements j {
    public final Context a;
    public final u02 b;
    public final k c;
    public final hqe d;
    public final ru.yandex.taxi.am.internal.b e;
    public final ep90 f;
    public final g g;
    public final y50 h;
    public final lm i;
    public final ru.yandex.taxi.activity.g j;
    public final ru.yandex.taxi.startup.launch.c k;
    public final ckf0 l;
    public final evx m;
    public final tt2 n;
    public final pj o;

    public s0(Context context, u02 u02Var, k kVar, hqe hqeVar, ru.yandex.taxi.am.internal.b bVar, ep90 ep90Var, g gVar, y50 y50Var, lm lmVar, ru.yandex.taxi.activity.g gVar2, ru.yandex.taxi.startup.launch.c cVar, ckf0 ckf0Var, evx evxVar, tt2 tt2Var, pj pjVar) {
        this.a = context;
        this.b = u02Var;
        this.c = kVar;
        this.d = hqeVar;
        this.e = bVar;
        this.f = ep90Var;
        this.g = gVar;
        this.h = y50Var;
        this.i = lmVar;
        this.j = gVar2;
        this.k = cVar;
        this.l = ckf0Var;
        this.m = evxVar;
        this.n = tt2Var;
        this.o = pjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(s0 s0Var, kj kjVar, boolean z, ContinuationImpl continuationImpl) {
        UpgradeAccountRouterImpl$createUpgradePhonishProperties$1 upgradeAccountRouterImpl$createUpgradePhonishProperties$1;
        int i;
        com.yandex.passport.api.i iVar;
        s0Var.getClass();
        if (continuationImpl instanceof UpgradeAccountRouterImpl$createUpgradePhonishProperties$1) {
            upgradeAccountRouterImpl$createUpgradePhonishProperties$1 = (UpgradeAccountRouterImpl$createUpgradePhonishProperties$1) continuationImpl;
            int i2 = upgradeAccountRouterImpl$createUpgradePhonishProperties$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeAccountRouterImpl$createUpgradePhonishProperties$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upgradeAccountRouterImpl$createUpgradePhonishProperties$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeAccountRouterImpl$createUpgradePhonishProperties$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    upgradeAccountRouterImpl$createUpgradePhonishProperties$1.L$0 = null;
                    upgradeAccountRouterImpl$createUpgradePhonishProperties$1.Z$0 = z;
                    upgradeAccountRouterImpl$createUpgradePhonishProperties$1.label = 1;
                    obj = s0Var.d(kjVar, upgradeAccountRouterImpl$createUpgradePhonishProperties$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = upgradeAccountRouterImpl$createUpgradePhonishProperties$1.Z$0;
                    kotlin.b.b(obj);
                }
                iVar = (com.yandex.passport.api.i) obj;
                if (iVar == null) {
                    return new n2(s0Var.d.a(), iVar, z);
                }
                ny61.g("Account not found");
                return null;
            }
        }
        upgradeAccountRouterImpl$createUpgradePhonishProperties$1 = new UpgradeAccountRouterImpl$createUpgradePhonishProperties$1(s0Var, continuationImpl);
        Object obj3 = upgradeAccountRouterImpl$createUpgradePhonishProperties$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeAccountRouterImpl$createUpgradePhonishProperties$1.label;
        if (i != 0) {
        }
        iVar = (com.yandex.passport.api.i) obj3;
        if (iVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(kj kjVar, ContinuationImpl continuationImpl) {
        UpgradeAccountRouterImpl$getPassportAccount$1 upgradeAccountRouterImpl$getPassportAccount$1;
        int i;
        Object g;
        if (continuationImpl instanceof UpgradeAccountRouterImpl$getPassportAccount$1) {
            upgradeAccountRouterImpl$getPassportAccount$1 = (UpgradeAccountRouterImpl$getPassportAccount$1) continuationImpl;
            int i2 = upgradeAccountRouterImpl$getPassportAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeAccountRouterImpl$getPassportAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upgradeAccountRouterImpl$getPassportAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeAccountRouterImpl$getPassportAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PassportUidImpl h = gtq0.h(this.b, kjVar.a);
                    com.yandex.passport.api.b a = this.f.a();
                    upgradeAccountRouterImpl$getPassportAccount$1.L$0 = null;
                    upgradeAccountRouterImpl$getPassportAccount$1.L$1 = null;
                    upgradeAccountRouterImpl$getPassportAccount$1.label = 1;
                    g = a.g(h, upgradeAccountRouterImpl$getPassportAccount$1);
                    if (g == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    g = ((Result) obj).getValue();
                }
                if (g instanceof Result.Failure) {
                    return g;
                }
                return null;
            }
        }
        upgradeAccountRouterImpl$getPassportAccount$1 = new UpgradeAccountRouterImpl$getPassportAccount$1(this, continuationImpl);
        Object obj2 = upgradeAccountRouterImpl$getPassportAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeAccountRouterImpl$getPassportAccount$1.label;
        if (i != 0) {
        }
        if (g instanceof Result.Failure) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if (defpackage.tje.k0(r2, r5, r3) == r4) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(kj kjVar, com.yandex.passport.api.w wVar, ContinuationImpl continuationImpl) {
        UpgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1 upgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1;
        int i;
        com.yandex.passport.api.w wVar2;
        Object obj;
        Throwable a;
        if (continuationImpl instanceof UpgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1) {
            upgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1 = (UpgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1) continuationImpl;
            int i2 = upgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = upgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1.label;
                pj pjVar = this.o;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (wVar instanceof com.yandex.passport.api.u) {
                        this.n.getClass();
                        sjh sjhVar = uyj.a;
                        g6u g6uVar = o400.a;
                        UpgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$2 upgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$2 = new UpgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$2(this, wVar, null);
                        upgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1.L$0 = null;
                        upgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1.L$1 = null;
                        upgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1.label = 1;
                    } else {
                        if (wVar instanceof com.yandex.passport.api.q) {
                            pjVar.getClass();
                            pjVar.a.a("Account.PhonishUpgrade.Canceled", new HashMap(), 1, new HashMap());
                            ny61.r("Upgrade cancelled");
                            return null;
                        }
                        if (!(wVar instanceof com.yandex.passport.api.s)) {
                            if (wVar instanceof com.yandex.passport.api.t) {
                                pjVar.a();
                                ny61.r("Upgrade forbidden");
                                return null;
                            }
                            if (!(wVar instanceof com.yandex.passport.api.v)) {
                                w511.b();
                                return null;
                            }
                            pjVar.a();
                            ny61.r("OpenUrl result is not expected during account upgrade");
                            return null;
                        }
                        Throwable th = ((com.yandex.passport.api.s) wVar).a;
                        if (th instanceof PassportUpdateInfoNeededException) {
                            PassportUidImpl h = gtq0.h(this.b, kjVar.a);
                            pjVar.getClass();
                            pjVar.a.a("Account.PhonishUpgrade.UpdateInfoStarted", new HashMap(), 1, new HashMap());
                            com.yandex.passport.api.b a2 = this.f.a();
                            upgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1.L$0 = null;
                            upgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1.L$1 = wVar;
                            upgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1.L$2 = null;
                            upgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1.label = 2;
                            Object e = a2.e(h, upgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1);
                            if (e != coroutineSingletons) {
                                obj = e;
                                wVar2 = wVar;
                                if (!(obj instanceof Result.Failure)) {
                                }
                                a = Result.a(obj);
                                if (a != null) {
                                }
                            }
                        } else {
                            if (th instanceof PassportInvalidTokenException) {
                                pjVar.a();
                                xby.l(jst.e, "phonish_upgrade_error", null, th, "invalid x-token error during phonish to neophonish upgrade", 2);
                                lm lmVar = this.i;
                                ((cne0) lmVar.a.getValue()).u("upgrade_account_token_error", true);
                                pz40 pz40Var = (pz40) lmVar.b.getValue();
                                Boolean bool = Boolean.TRUE;
                                kotlinx.coroutines.flow.r0 r0Var = (kotlinx.coroutines.flow.r0) pz40Var;
                                r0Var.getClass();
                                r0Var.m(null, bool);
                            } else {
                                pjVar.a();
                            }
                            wVar2 = wVar;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wVar2 = (com.yandex.passport.api.w) upgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1.L$1;
                kotlin.b.b(obj2);
                obj = ((Result) obj2).getValue();
                if (!(obj instanceof Result.Failure)) {
                    pjVar.getClass();
                    pjVar.a.a("Account.PhonishUpgrade.UpdateInfoCompleted", new HashMap(), 1, new HashMap());
                }
                a = Result.a(obj);
                if (a != null) {
                    String message = a.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    pjVar.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("error", message);
                    pjVar.a.a("Account.PhonishUpgrade.UpdateInfoFailed", hashMap, 1, new HashMap());
                }
                throw ((com.yandex.passport.api.s) wVar2).a;
            }
        }
        upgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1 = new UpgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1(this, continuationImpl);
        Object obj22 = upgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$1.label;
        pj pjVar2 = this.o;
        if (i != 0) {
        }
        throw ((com.yandex.passport.api.s) wVar2).a;
    }

    public final Object f(kj kjVar, com.yandex.passport.api.w wVar, Continuation continuation) {
        qv10.C(new Object[]{new Long(kjVar.a)}, 1, "Handle upgrade account result for account [%s]", jst.e);
        if (wVar instanceof com.yandex.passport.api.u) {
            this.n.getClass();
            sjh sjhVar = uyj.a;
            return tje.k0(o400.a, new UpgradeAccountRouterImpl$handleUpgradeResult$2(this, wVar, null), continuation);
        }
        if (jl40.l(wVar, com.yandex.passport.api.q.a)) {
            w511.s("Upgrade cancelled");
            return null;
        }
        if (jl40.l(wVar, com.yandex.passport.api.t.a)) {
            w511.s("Upgrade forbidden");
            return null;
        }
        if (wVar instanceof com.yandex.passport.api.s) {
            throw ((com.yandex.passport.api.s) wVar).a;
        }
        if (wVar instanceof com.yandex.passport.api.v) {
            ny61.r("OpenUrl result is not expected during account upgrade");
            return null;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        UpgradeAccountRouterImpl$requestLaunch$1 upgradeAccountRouterImpl$requestLaunch$1;
        int i;
        if (continuationImpl instanceof UpgradeAccountRouterImpl$requestLaunch$1) {
            upgradeAccountRouterImpl$requestLaunch$1 = (UpgradeAccountRouterImpl$requestLaunch$1) continuationImpl;
            int i2 = upgradeAccountRouterImpl$requestLaunch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeAccountRouterImpl$requestLaunch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upgradeAccountRouterImpl$requestLaunch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeAccountRouterImpl$requestLaunch$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    upgradeAccountRouterImpl$requestLaunch$1.label = 1;
                    obj = this.k.a("UpgradeToPortalAccountInteractor", upgradeAccountRouterImpl$requestLaunch$1, false);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                this.n.getClass();
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                UpgradeAccountRouterImpl$requestLaunch$2 upgradeAccountRouterImpl$requestLaunch$2 = new UpgradeAccountRouterImpl$requestLaunch$2(this, (owx) obj, null);
                upgradeAccountRouterImpl$requestLaunch$1.L$0 = null;
                upgradeAccountRouterImpl$requestLaunch$1.label = 2;
                Object k0 = tje.k0(g6uVar, upgradeAccountRouterImpl$requestLaunch$2, upgradeAccountRouterImpl$requestLaunch$1);
                return k0 != coroutineSingletons ? coroutineSingletons : k0;
            }
        }
        upgradeAccountRouterImpl$requestLaunch$1 = new UpgradeAccountRouterImpl$requestLaunch$1(this, continuationImpl);
        Object obj2 = upgradeAccountRouterImpl$requestLaunch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeAccountRouterImpl$requestLaunch$1.label;
        if (i != 0) {
        }
        this.n.getClass();
        sjh sjhVar2 = uyj.a;
        g6u g6uVar2 = o400.a;
        UpgradeAccountRouterImpl$requestLaunch$2 upgradeAccountRouterImpl$requestLaunch$22 = new UpgradeAccountRouterImpl$requestLaunch$2(this, (owx) obj2, null);
        upgradeAccountRouterImpl$requestLaunch$1.L$0 = null;
        upgradeAccountRouterImpl$requestLaunch$1.label = 2;
        Object k02 = tje.k0(g6uVar2, upgradeAccountRouterImpl$requestLaunch$22, upgradeAccountRouterImpl$requestLaunch$1);
        if (k02 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(1:(1:(1:(2:13|14)(2:16|17))(2:18|19))(5:20|21|22|23|(1:26)(1:25)))(2:28|29))(2:34|(2:36|37)(2:38|(2:40|26)))|30|31|(2:33|26)|22|23|(0)(0)))|51|6|7|(0)(0)|30|31|(0)|22|23|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005a, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
    
        r3.getClass();
        r2 = defpackage.uyj.a;
        r2 = defpackage.o400.a;
        r3 = new ru.yandex.taxi.am.UpgradeAccountRouterImpl$startPhonishAccountUpgrade$3(r12, null);
        r0.L$0 = null;
        r0.L$1 = r14;
        r0.Z$0 = r13;
        r0.label = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f9, code lost:
    
        if (defpackage.tje.k0(r2, r3, r0) != r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fd, code lost:
    
        throw r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005f, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e0, code lost:
    
        throw r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x005d, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c3, code lost:
    
        r14 = new kotlin.Result.Failure(r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(boolean z, ContinuationImpl continuationImpl) {
        UpgradeAccountRouterImpl$startPhonishAccountUpgrade$1 upgradeAccountRouterImpl$startPhonishAccountUpgrade$1;
        Object obj;
        int i;
        kj Ig;
        com.yandex.passport.api.w wVar;
        if (continuationImpl instanceof UpgradeAccountRouterImpl$startPhonishAccountUpgrade$1) {
            upgradeAccountRouterImpl$startPhonishAccountUpgrade$1 = (UpgradeAccountRouterImpl$startPhonishAccountUpgrade$1) continuationImpl;
            int i2 = upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.label;
                tt2 tt2Var = this.n;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Ig = this.c.Ig();
                    pj pjVar = this.o;
                    if (Ig == null) {
                        pjVar.a();
                        return new Result.Failure(new IllegalStateException("No cached account found"));
                    }
                    pjVar.getClass();
                    pjVar.a.a("Account.PhonishUpgrade.Requested", new HashMap(), 1, new HashMap());
                    upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.L$0 = Ig;
                    upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.Z$0 = z;
                    upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.label = 1;
                    obj2 = j(Ig, z, upgradeAccountRouterImpl$startPhonishAccountUpgrade$1);
                    if (obj2 == obj) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                Object obj3 = upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.L$1;
                                kotlin.b.b(obj2);
                                return obj3;
                            }
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th = (Throwable) upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.L$1;
                            kotlin.b.b(obj2);
                            throw th;
                        }
                        z = upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.Z$0;
                        kotlin.b.b(obj2);
                        Object failure = zy11.a;
                        tt2Var.getClass();
                        sjh sjhVar = uyj.a;
                        g6u g6uVar = o400.a;
                        UpgradeAccountRouterImpl$startPhonishAccountUpgrade$3 upgradeAccountRouterImpl$startPhonishAccountUpgrade$3 = new UpgradeAccountRouterImpl$startPhonishAccountUpgrade$3(this, null);
                        upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.L$0 = null;
                        upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.L$1 = failure;
                        upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.Z$0 = z;
                        upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.label = 3;
                        return tje.k0(g6uVar, upgradeAccountRouterImpl$startPhonishAccountUpgrade$3, upgradeAccountRouterImpl$startPhonishAccountUpgrade$1) == obj ? obj : failure;
                    }
                    z = upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.Z$0;
                    Ig = (kj) upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.L$0;
                    kotlin.b.b(obj2);
                }
                wVar = (com.yandex.passport.api.w) obj2;
                upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.L$0 = null;
                upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.L$1 = null;
                upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.Z$0 = z;
                upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.label = 2;
                if (e(Ig, wVar, upgradeAccountRouterImpl$startPhonishAccountUpgrade$1) == obj) {
                }
                Object failure2 = zy11.a;
                tt2Var.getClass();
                sjh sjhVar2 = uyj.a;
                g6u g6uVar2 = o400.a;
                UpgradeAccountRouterImpl$startPhonishAccountUpgrade$3 upgradeAccountRouterImpl$startPhonishAccountUpgrade$32 = new UpgradeAccountRouterImpl$startPhonishAccountUpgrade$3(this, null);
                upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.L$0 = null;
                upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.L$1 = failure2;
                upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.Z$0 = z;
                upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.label = 3;
                if (tje.k0(g6uVar2, upgradeAccountRouterImpl$startPhonishAccountUpgrade$32, upgradeAccountRouterImpl$startPhonishAccountUpgrade$1) == obj) {
                }
            }
        }
        upgradeAccountRouterImpl$startPhonishAccountUpgrade$1 = new UpgradeAccountRouterImpl$startPhonishAccountUpgrade$1(this, continuationImpl);
        Object obj22 = upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.label;
        tt2 tt2Var2 = this.n;
        if (i != 0) {
        }
        wVar = (com.yandex.passport.api.w) obj22;
        upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.L$0 = null;
        upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.L$1 = null;
        upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.Z$0 = z;
        upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.label = 2;
        if (e(Ig, wVar, upgradeAccountRouterImpl$startPhonishAccountUpgrade$1) == obj) {
        }
        Object failure22 = zy11.a;
        tt2Var2.getClass();
        sjh sjhVar22 = uyj.a;
        g6u g6uVar22 = o400.a;
        UpgradeAccountRouterImpl$startPhonishAccountUpgrade$3 upgradeAccountRouterImpl$startPhonishAccountUpgrade$322 = new UpgradeAccountRouterImpl$startPhonishAccountUpgrade$3(this, null);
        upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.L$0 = null;
        upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.L$1 = failure22;
        upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.Z$0 = z;
        upgradeAccountRouterImpl$startPhonishAccountUpgrade$1.label = 3;
        if (tje.k0(g6uVar22, upgradeAccountRouterImpl$startPhonishAccountUpgrade$322, upgradeAccountRouterImpl$startPhonishAccountUpgrade$1) == obj) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a2, code lost:
    
        if (r0 != r7) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(kj kjVar, ContinuationImpl continuationImpl) {
        UpgradeAccountRouterImpl$startUpgradeAccountActivity$1 upgradeAccountRouterImpl$startUpgradeAccountActivity$1;
        int i;
        int i2;
        if (continuationImpl instanceof UpgradeAccountRouterImpl$startUpgradeAccountActivity$1) {
            upgradeAccountRouterImpl$startUpgradeAccountActivity$1 = (UpgradeAccountRouterImpl$startUpgradeAccountActivity$1) continuationImpl;
            int i3 = upgradeAccountRouterImpl$startUpgradeAccountActivity$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                upgradeAccountRouterImpl$startUpgradeAccountActivity$1.label = i3 - Integer.MIN_VALUE;
                UpgradeAccountRouterImpl$startUpgradeAccountActivity$1 upgradeAccountRouterImpl$startUpgradeAccountActivity$12 = upgradeAccountRouterImpl$startUpgradeAccountActivity$1;
                Object obj = upgradeAccountRouterImpl$startUpgradeAccountActivity$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeAccountRouterImpl$startUpgradeAccountActivity$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    long j = kjVar.a;
                    int i4 = (((int) j) | HProv.PP_PASSWD_TERM) & 65535;
                    qv10.C(new Object[]{new Long(j)}, 1, "Upgrade account to portal [%s]", jst.e);
                    com.yandex.passport.internal.ui.account_upgrade.j jVar = this.f.a().q().d;
                    this.n.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    UpgradeAccountRouterImpl$startUpgradeAccountActivity$2 upgradeAccountRouterImpl$startUpgradeAccountActivity$2 = new UpgradeAccountRouterImpl$startUpgradeAccountActivity$2(this, i4, jVar, kjVar, null);
                    upgradeAccountRouterImpl$startUpgradeAccountActivity$12.L$0 = null;
                    upgradeAccountRouterImpl$startUpgradeAccountActivity$12.L$1 = null;
                    upgradeAccountRouterImpl$startUpgradeAccountActivity$12.I$0 = i4;
                    upgradeAccountRouterImpl$startUpgradeAccountActivity$12.label = 1;
                    obj = tje.k0(g6uVar, upgradeAccountRouterImpl$startUpgradeAccountActivity$2, upgradeAccountRouterImpl$startUpgradeAccountActivity$12);
                    if (obj != coroutineSingletons) {
                        i2 = i4;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                i2 = upgradeAccountRouterImpl$startUpgradeAccountActivity$12.I$0;
                kotlin.b.b(obj);
                upgradeAccountRouterImpl$startUpgradeAccountActivity$12.L$0 = null;
                upgradeAccountRouterImpl$startUpgradeAccountActivity$12.L$1 = null;
                upgradeAccountRouterImpl$startUpgradeAccountActivity$12.I$0 = i2;
                upgradeAccountRouterImpl$startUpgradeAccountActivity$12.label = 2;
                obj = kotlinx.coroutines.flow.e.y((tpr) obj, upgradeAccountRouterImpl$startUpgradeAccountActivity$12);
            }
        }
        upgradeAccountRouterImpl$startUpgradeAccountActivity$1 = new UpgradeAccountRouterImpl$startUpgradeAccountActivity$1(this, continuationImpl);
        UpgradeAccountRouterImpl$startUpgradeAccountActivity$1 upgradeAccountRouterImpl$startUpgradeAccountActivity$122 = upgradeAccountRouterImpl$startUpgradeAccountActivity$1;
        Object obj2 = upgradeAccountRouterImpl$startUpgradeAccountActivity$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeAccountRouterImpl$startUpgradeAccountActivity$122.label;
        if (i != 0) {
        }
        upgradeAccountRouterImpl$startUpgradeAccountActivity$122.L$0 = null;
        upgradeAccountRouterImpl$startUpgradeAccountActivity$122.L$1 = null;
        upgradeAccountRouterImpl$startUpgradeAccountActivity$122.I$0 = i2;
        upgradeAccountRouterImpl$startUpgradeAccountActivity$122.label = 2;
        obj2 = kotlinx.coroutines.flow.e.y((tpr) obj2, upgradeAccountRouterImpl$startUpgradeAccountActivity$122);
    }

    public final Object j(kj kjVar, boolean z, Continuation continuation) {
        long j = kjVar.a;
        int i = (((int) j) | HProv.PP_VERSION_EX) & 65535;
        qv10.C(new Object[]{new Long(j)}, 1, "Upgrade account to neoPhonish [%s]", jst.e);
        com.yandex.passport.internal.impl.u uVar = new com.yandex.passport.internal.impl.u(this.f.a().t().a);
        this.n.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(o400.a, new UpgradeAccountRouterImpl$startUpgradePhonishAccountActivity$2(this, uVar, kjVar, z, i, null), continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|8))|60|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0060, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fe, code lost:
    
        r4 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0096, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0123, code lost:
    
        r3.getClass();
        r8 = defpackage.uyj.a;
        r8 = defpackage.o400.a;
        r9 = new ru.yandex.taxi.am.UpgradeAccountRouterImpl$startUpgradeToPortal$5(r6, null);
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = r7;
        r0.L$3 = null;
        r0.label = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013e, code lost:
    
        if (defpackage.tje.k0(r8, r9, r0) != r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0142, code lost:
    
        throw r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0140 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:17:0x005b, B:24:0x006f, B:25:0x00d8, B:27:0x00e0, B:29:0x00e4, B:32:0x00f6, B:33:0x00fd, B:35:0x007f, B:36:0x00c8, B:43:0x00b4), top: B:7:0x0023, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4 A[Catch: all -> 0x0060, TRY_ENTER, TryCatch #0 {all -> 0x0060, blocks: (B:17:0x005b, B:24:0x006f, B:25:0x00d8, B:27:0x00e0, B:29:0x00e4, B:32:0x00f6, B:33:0x00fd, B:35:0x007f, B:36:0x00c8, B:43:0x00b4), top: B:7:0x0023, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(kj kjVar, tls tlsVar, ContinuationImpl continuationImpl) {
        UpgradeAccountRouterImpl$startUpgradeToPortal$3 upgradeAccountRouterImpl$startUpgradeToPortal$3;
        int i;
        Object obj;
        tls tlsVar2;
        dvx dvxVar;
        if (continuationImpl instanceof UpgradeAccountRouterImpl$startUpgradeToPortal$3) {
            upgradeAccountRouterImpl$startUpgradeToPortal$3 = (UpgradeAccountRouterImpl$startUpgradeToPortal$3) continuationImpl;
            int i2 = upgradeAccountRouterImpl$startUpgradeToPortal$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeAccountRouterImpl$startUpgradeToPortal$3.label = i2 - Integer.MIN_VALUE;
                Object obj2 = upgradeAccountRouterImpl$startUpgradeToPortal$3.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeAccountRouterImpl$startUpgradeToPortal$3.label;
                tt2 tt2Var = this.n;
                Object obj4 = zy11.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj2);
                        if (kjVar.n) {
                            return obj4;
                        }
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.L$0 = kjVar;
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.L$1 = tlsVar;
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.label = 1;
                        obj = i(kjVar, upgradeAccountRouterImpl$startUpgradeToPortal$3);
                        if (obj == obj3) {
                        }
                        if (!(obj instanceof Result.Failure)) {
                            upgradeAccountRouterImpl$startUpgradeToPortal$3.L$0 = null;
                            upgradeAccountRouterImpl$startUpgradeToPortal$3.L$1 = tlsVar;
                            upgradeAccountRouterImpl$startUpgradeToPortal$3.L$2 = null;
                            upgradeAccountRouterImpl$startUpgradeToPortal$3.label = 2;
                            if (f(kjVar, (com.yandex.passport.api.w) obj, upgradeAccountRouterImpl$startUpgradeToPortal$3) != obj3) {
                                tlsVar2 = tlsVar;
                                upgradeAccountRouterImpl$startUpgradeToPortal$3.L$0 = null;
                                upgradeAccountRouterImpl$startUpgradeToPortal$3.L$1 = tlsVar2;
                                upgradeAccountRouterImpl$startUpgradeToPortal$3.L$2 = null;
                                upgradeAccountRouterImpl$startUpgradeToPortal$3.label = 3;
                                obj2 = g(upgradeAccountRouterImpl$startUpgradeToPortal$3);
                                if (obj2 == obj3) {
                                }
                                dvxVar = (dvx) obj2;
                                if (dvxVar.a() || !dvxVar.d) {
                                    throw new CancellationException("Account was not upgraded to portal");
                                }
                                upgradeAccountRouterImpl$startUpgradeToPortal$3.L$0 = null;
                                upgradeAccountRouterImpl$startUpgradeToPortal$3.L$1 = null;
                                upgradeAccountRouterImpl$startUpgradeToPortal$3.L$2 = null;
                                upgradeAccountRouterImpl$startUpgradeToPortal$3.L$3 = null;
                                upgradeAccountRouterImpl$startUpgradeToPortal$3.label = 4;
                                if (tlsVar2.invoke(upgradeAccountRouterImpl$startUpgradeToPortal$3) == obj3) {
                                }
                                obj = obj4;
                            }
                        }
                        tt2Var.getClass();
                        sjh sjhVar = uyj.a;
                        g6u g6uVar = o400.a;
                        UpgradeAccountRouterImpl$startUpgradeToPortal$5 upgradeAccountRouterImpl$startUpgradeToPortal$5 = new UpgradeAccountRouterImpl$startUpgradeToPortal$5(this, null);
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.L$0 = null;
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.L$1 = null;
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.L$2 = obj;
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.L$3 = null;
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.label = 5;
                        return tje.k0(g6uVar, upgradeAccountRouterImpl$startUpgradeToPortal$5, upgradeAccountRouterImpl$startUpgradeToPortal$3) == obj3 ? obj3 : obj;
                    case 1:
                        tlsVar = (tls) upgradeAccountRouterImpl$startUpgradeToPortal$3.L$1;
                        kjVar = (kj) upgradeAccountRouterImpl$startUpgradeToPortal$3.L$0;
                        kotlin.b.b(obj2);
                        obj = ((Result) obj2).getValue();
                        if (!(obj instanceof Result.Failure)) {
                        }
                        tt2Var.getClass();
                        sjh sjhVar2 = uyj.a;
                        g6u g6uVar2 = o400.a;
                        UpgradeAccountRouterImpl$startUpgradeToPortal$5 upgradeAccountRouterImpl$startUpgradeToPortal$52 = new UpgradeAccountRouterImpl$startUpgradeToPortal$5(this, null);
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.L$0 = null;
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.L$1 = null;
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.L$2 = obj;
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.L$3 = null;
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.label = 5;
                        if (tje.k0(g6uVar2, upgradeAccountRouterImpl$startUpgradeToPortal$52, upgradeAccountRouterImpl$startUpgradeToPortal$3) == obj3) {
                        }
                        break;
                    case 2:
                        tlsVar2 = (tls) upgradeAccountRouterImpl$startUpgradeToPortal$3.L$1;
                        kotlin.b.b(obj2);
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.L$0 = null;
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.L$1 = tlsVar2;
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.L$2 = null;
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.label = 3;
                        obj2 = g(upgradeAccountRouterImpl$startUpgradeToPortal$3);
                        if (obj2 == obj3) {
                        }
                        dvxVar = (dvx) obj2;
                        if (dvxVar.a()) {
                            break;
                        }
                        throw new CancellationException("Account was not upgraded to portal");
                    case 3:
                        tlsVar2 = (tls) upgradeAccountRouterImpl$startUpgradeToPortal$3.L$1;
                        kotlin.b.b(obj2);
                        dvxVar = (dvx) obj2;
                        if (dvxVar.a()) {
                        }
                        throw new CancellationException("Account was not upgraded to portal");
                    case 4:
                        kotlin.b.b(obj2);
                        obj = obj4;
                        tt2Var.getClass();
                        sjh sjhVar22 = uyj.a;
                        g6u g6uVar22 = o400.a;
                        UpgradeAccountRouterImpl$startUpgradeToPortal$5 upgradeAccountRouterImpl$startUpgradeToPortal$522 = new UpgradeAccountRouterImpl$startUpgradeToPortal$5(this, null);
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.L$0 = null;
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.L$1 = null;
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.L$2 = obj;
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.L$3 = null;
                        upgradeAccountRouterImpl$startUpgradeToPortal$3.label = 5;
                        if (tje.k0(g6uVar22, upgradeAccountRouterImpl$startUpgradeToPortal$522, upgradeAccountRouterImpl$startUpgradeToPortal$3) == obj3) {
                        }
                        break;
                    case 5:
                        Object obj5 = upgradeAccountRouterImpl$startUpgradeToPortal$3.L$2;
                        kotlin.b.b(obj2);
                        return obj5;
                    case 6:
                        Throwable th = (Throwable) upgradeAccountRouterImpl$startUpgradeToPortal$3.L$2;
                        kotlin.b.b(obj2);
                        throw th;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        upgradeAccountRouterImpl$startUpgradeToPortal$3 = new UpgradeAccountRouterImpl$startUpgradeToPortal$3(this, continuationImpl);
        Object obj22 = upgradeAccountRouterImpl$startUpgradeToPortal$3.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeAccountRouterImpl$startUpgradeToPortal$3.label;
        tt2 tt2Var2 = this.n;
        Object obj42 = zy11.a;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(tls tlsVar, ContinuationImpl continuationImpl) {
        UpgradeAccountRouterImpl$startUpgradeToPortal$1 upgradeAccountRouterImpl$startUpgradeToPortal$1;
        int i;
        if (continuationImpl instanceof UpgradeAccountRouterImpl$startUpgradeToPortal$1) {
            upgradeAccountRouterImpl$startUpgradeToPortal$1 = (UpgradeAccountRouterImpl$startUpgradeToPortal$1) continuationImpl;
            int i2 = upgradeAccountRouterImpl$startUpgradeToPortal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeAccountRouterImpl$startUpgradeToPortal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upgradeAccountRouterImpl$startUpgradeToPortal$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeAccountRouterImpl$startUpgradeToPortal$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                kotlin.b.b(obj);
                kj Ig = this.c.Ig();
                if (Ig == null) {
                    return new Result.Failure(new IllegalStateException("No cached account is found"));
                }
                upgradeAccountRouterImpl$startUpgradeToPortal$1.L$0 = null;
                upgradeAccountRouterImpl$startUpgradeToPortal$1.L$1 = null;
                upgradeAccountRouterImpl$startUpgradeToPortal$1.label = 1;
                Object k = k(Ig, tlsVar, upgradeAccountRouterImpl$startUpgradeToPortal$1);
                return k == obj2 ? obj2 : k;
            }
        }
        upgradeAccountRouterImpl$startUpgradeToPortal$1 = new UpgradeAccountRouterImpl$startUpgradeToPortal$1(this, continuationImpl);
        Object obj3 = upgradeAccountRouterImpl$startUpgradeToPortal$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeAccountRouterImpl$startUpgradeToPortal$1.label;
        if (i == 0) {
        }
    }
}
