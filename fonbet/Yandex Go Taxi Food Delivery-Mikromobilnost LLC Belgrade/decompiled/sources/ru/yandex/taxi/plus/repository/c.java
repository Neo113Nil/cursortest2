package ru.yandex.taxi.plus.repository;

import defpackage.acr0;
import defpackage.aqp0;
import defpackage.asp0;
import defpackage.bnd0;
import defpackage.bqd0;
import defpackage.cmt;
import defpackage.drg;
import defpackage.e3n;
import defpackage.ekd0;
import defpackage.evu0;
import defpackage.fmt;
import defpackage.fo10;
import defpackage.jl40;
import defpackage.k7d0;
import defpackage.k7r0;
import defpackage.kp50;
import defpackage.kq2;
import defpackage.l0v0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.r1v0;
import defpackage.rqd0;
import defpackage.u0d0;
import defpackage.u3d0;
import defpackage.xjd0;
import defpackage.ymd0;
import defpackage.z1d0;
import defpackage.znp0;
import defpackage.zrp0;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.cashback.l;
import ru.yandex.taxi.network.api.models.GoApiHttpException;
import ru.yandex.taxi.plus.api.PlusApi;
import ru.yandex.taxi.plus.api.dto.menu.button.ButtonAction;
import ru.yandex.taxi.plus.net.response.Status;
import ru.yandex.taxi.plus.purchase.domain.PurchaseStatus;
import ru.yandex.taxi.plus.purchase.domain.UpgradeStatus;

/* loaded from: classes9.dex */
public final class c {
    public final ru.yandex.taxi.plus.sdk.cache.c a;
    public final z1d0 b;
    public final k7r0 c;
    public final acr0 d;
    public final fo10 e;
    public final ru.yandex.taxi.plus.sdk.existing_screens.c f;
    public final u3d0 g;
    public final bqd0 h;
    public final drg i;
    public final aqp0 j;
    public final ekd0 k;
    public final asp0 l;
    public final l m;
    public final kq2 n;
    public final rqd0 o;
    public final PlusApi p;

    public c(u0d0 u0d0Var, ru.yandex.taxi.plus.sdk.cache.c cVar, z1d0 z1d0Var, k7r0 k7r0Var, acr0 acr0Var, fo10 fo10Var, ru.yandex.taxi.plus.sdk.existing_screens.c cVar2, u3d0 u3d0Var, bqd0 bqd0Var, drg drgVar, aqp0 aqp0Var, ekd0 ekd0Var, asp0 asp0Var, l lVar, kq2 kq2Var, rqd0 rqd0Var) {
        this.a = cVar;
        this.b = z1d0Var;
        this.c = k7r0Var;
        this.d = acr0Var;
        this.e = fo10Var;
        this.f = cVar2;
        this.g = u3d0Var;
        this.h = bqd0Var;
        this.i = drgVar;
        this.j = aqp0Var;
        this.k = ekd0Var;
        this.l = asp0Var;
        this.m = lVar;
        this.n = kq2Var;
        this.o = rqd0Var;
        this.p = u0d0Var.a();
    }

    public static Object d(c cVar, PurchaseStatus purchaseStatus, UpgradeStatus upgradeStatus, String str, int i) {
        if ((i & 1) != 0) {
            purchaseStatus = null;
        }
        if ((i & 2) != 0) {
            upgradeStatus = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        znp0 znp0Var = cVar.a.a;
        if (znp0Var == null) {
            return new Result.Failure(new RuntimeException("no cached data at purchase state"));
        }
        l0v0 l0v0Var = znp0Var.d;
        if (purchaseStatus == null && upgradeStatus == null && str == null) {
            return l0v0Var;
        }
        ButtonAction buttonAction = l0v0Var.a;
        String str2 = l0v0Var.b;
        if (purchaseStatus == null) {
            purchaseStatus = l0v0Var.c;
        }
        PurchaseStatus purchaseStatus2 = purchaseStatus;
        if (upgradeStatus == null) {
            upgradeStatus = l0v0Var.d;
        }
        UpgradeStatus upgradeStatus2 = upgradeStatus;
        if (str == null) {
            str = l0v0Var.e;
        }
        l0v0 l0v0Var2 = new l0v0(buttonAction, str2, purchaseStatus2, upgradeStatus2, str, l0v0Var.f);
        cVar.a.c(znp0.a(znp0Var, l0v0Var2, null, 119));
        return l0v0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        PlusRepository$purchase$1 plusRepository$purchase$1;
        int i;
        String a;
        try {
            if (continuationImpl instanceof PlusRepository$purchase$1) {
                plusRepository$purchase$1 = (PlusRepository$purchase$1) continuationImpl;
                int i2 = plusRepository$purchase$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusRepository$purchase$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = plusRepository$purchase$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusRepository$purchase$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        d(this, PurchaseStatus.IN_PROGRESS, null, null, 6);
                        cmt<bnd0> c = this.p.c(new ymd0(str, str2, str3, str4));
                        k7d0 k7d0Var = new k7d0(6, this);
                        plusRepository$purchase$1.L$0 = null;
                        plusRepository$purchase$1.L$1 = null;
                        plusRepository$purchase$1.L$2 = null;
                        plusRepository$purchase$1.L$3 = null;
                        plusRepository$purchase$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.b(c, k7d0Var, plusRepository$purchase$1);
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
                    a = ((bnd0) ((fmt) obj).a).getA();
                    if (a != null && !evu0.J(a)) {
                        return d(this, PurchaseStatus.IN_PROGRESS, null, a, 2);
                    }
                    return new Result.Failure(new IllegalStateException("purchaseId is missing"));
                }
            }
            if (i != 0) {
            }
            a = ((bnd0) ((fmt) obj).a).getA();
            if (a != null) {
                return d(this, PurchaseStatus.IN_PROGRESS, null, a, 2);
            }
            return new Result.Failure(new IllegalStateException("purchaseId is missing"));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        plusRepository$purchase$1 = new PlusRepository$purchase$1(this, continuationImpl);
        Object obj2 = plusRepository$purchase$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusRepository$purchase$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (r13 != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[Catch: all -> 0x00b8, CancellationException -> 0x00bf, TryCatch #2 {CancellationException -> 0x00bf, all -> 0x00b8, blocks: (B:13:0x0035, B:14:0x0096, B:15:0x0067, B:17:0x006f, B:22:0x0085, B:24:0x0099, B:26:0x00a7, B:27:0x00ac, B:30:0x00b7, B:32:0x00aa, B:36:0x0047, B:38:0x004f, B:39:0x0065, B:41:0x0056), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[Catch: all -> 0x00b8, CancellationException -> 0x00bf, TryCatch #2 {CancellationException -> 0x00bf, all -> 0x00b8, blocks: (B:13:0x0035, B:14:0x0096, B:15:0x0067, B:17:0x006f, B:22:0x0085, B:24:0x0099, B:26:0x00a7, B:27:0x00ac, B:30:0x00b7, B:32:0x00aa, B:36:0x0047, B:38:0x004f, B:39:0x0065, B:41:0x0056), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0093 -> B:14:0x0096). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        PlusRepository$purchaseStatus$1 plusRepository$purchaseStatus$1;
        int i;
        r1v0 r1v0Var;
        try {
            if (continuationImpl instanceof PlusRepository$purchaseStatus$1) {
                plusRepository$purchaseStatus$1 = (PlusRepository$purchaseStatus$1) continuationImpl;
                int i2 = plusRepository$purchaseStatus$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusRepository$purchaseStatus$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = plusRepository$purchaseStatus$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusRepository$purchaseStatus$1.label;
                    PlusApi plusApi = this.p;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<r1v0> e = plusApi.e(str);
                        plusRepository$purchaseStatus$1.L$0 = str;
                        plusRepository$purchaseStatus$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.a(e, null, plusRepository$purchaseStatus$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (i == 1) {
                        str = (String) plusRepository$purchaseStatus$1.L$0;
                        kotlin.b.b(obj);
                    } else if (i == 2) {
                        str = (String) plusRepository$purchaseStatus$1.L$0;
                        kotlin.b.b(obj);
                        cmt<r1v0> e2 = plusApi.e(str);
                        plusRepository$purchaseStatus$1.L$0 = str;
                        plusRepository$purchaseStatus$1.L$1 = null;
                        plusRepository$purchaseStatus$1.label = 3;
                        obj = ru.yandex.taxi.network.api.a.a(e2, null, plusRepository$purchaseStatus$1);
                    } else {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) plusRepository$purchaseStatus$1.L$0;
                        kotlin.b.b(obj);
                        r1v0Var = (r1v0) obj;
                        if (r1v0Var.getA() != Status.PENDING) {
                            Object d = d(this, xjd0.b[r1v0Var.getA().ordinal()] == 1 ? PurchaseStatus.SUCCESS : PurchaseStatus.NETWORK_OR_SERVER_ERROR, null, null, 6);
                            Throwable a = Result.a(d);
                            if (a == null) {
                                return d;
                            }
                            throw a;
                        }
                        o430 o430Var = e3n.b;
                        long U = kp50.U(5, DurationUnit.SECONDS);
                        plusRepository$purchaseStatus$1.L$0 = str;
                        plusRepository$purchaseStatus$1.L$1 = null;
                        plusRepository$purchaseStatus$1.label = 2;
                        if (kotlinx.coroutines.a.j(U, plusRepository$purchaseStatus$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        cmt<r1v0> e22 = plusApi.e(str);
                        plusRepository$purchaseStatus$1.L$0 = str;
                        plusRepository$purchaseStatus$1.L$1 = null;
                        plusRepository$purchaseStatus$1.label = 3;
                        obj = ru.yandex.taxi.network.api.a.a(e22, null, plusRepository$purchaseStatus$1);
                    }
                    r1v0Var = (r1v0) obj;
                    if (r1v0Var.getA() != Status.PENDING) {
                    }
                }
            }
            if (i != 0) {
            }
            r1v0Var = (r1v0) obj;
            if (r1v0Var.getA() != Status.PENDING) {
            }
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable unused) {
            return d(this, PurchaseStatus.NETWORK_OR_SERVER_ERROR, null, null, 6);
        }
        plusRepository$purchaseStatus$1 = new PlusRepository$purchaseStatus$1(this, continuationImpl);
        Object obj2 = plusRepository$purchaseStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusRepository$purchaseStatus$1.label;
        PlusApi plusApi2 = this.p;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, List list, ContinuationImpl continuationImpl) {
        PlusRepository$sdkState$1 plusRepository$sdkState$1;
        int i;
        try {
            if (continuationImpl instanceof PlusRepository$sdkState$1) {
                plusRepository$sdkState$1 = (PlusRepository$sdkState$1) continuationImpl;
                int i2 = plusRepository$sdkState$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusRepository$sdkState$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = plusRepository$sdkState$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusRepository$sdkState$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (!this.m.a().b) {
                            ru.yandex.taxi.plus.sdk.cache.c cVar = this.a;
                            cVar.a = null;
                            cVar.e.l(null);
                            throw new IllegalStateException("cashback_by_zone disabled");
                        }
                        zrp0 a = this.l.a(list);
                        this.a.c = str;
                        PlusRepository$sdkState$2$1 plusRepository$sdkState$2$1 = new PlusRepository$sdkState$2$1(this, a, str, null);
                        plusRepository$sdkState$1.L$0 = null;
                        plusRepository$sdkState$1.L$1 = null;
                        plusRepository$sdkState$1.L$2 = null;
                        plusRepository$sdkState$1.label = 1;
                        obj = jl40.O(plusRepository$sdkState$2$1, plusRepository$sdkState$1);
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
                    return (znp0) obj;
                }
            }
            if (i != 0) {
            }
            return (znp0) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        plusRepository$sdkState$1 = new PlusRepository$sdkState$1(this, continuationImpl);
        Object obj2 = plusRepository$sdkState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusRepository$sdkState$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[Catch: all -> 0x0029, CancellationException -> 0x007c, TryCatch #2 {CancellationException -> 0x007c, all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0051, B:15:0x005e, B:19:0x0034, B:21:0x0040, B:24:0x005f), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        PlusRepository$upgrade$1 plusRepository$upgrade$1;
        int i;
        Throwable a;
        try {
            if (continuationImpl instanceof PlusRepository$upgrade$1) {
                plusRepository$upgrade$1 = (PlusRepository$upgrade$1) continuationImpl;
                int i2 = plusRepository$upgrade$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusRepository$upgrade$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = plusRepository$upgrade$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusRepository$upgrade$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        Throwable a2 = Result.a(d(this, null, UpgradeStatus.IN_PROGRESS, null, 5));
                        if (a2 != null) {
                            throw a2;
                        }
                        cmt<zy11> d = this.p.d(zy11.a);
                        plusRepository$upgrade$1.label = 1;
                        if (ru.yandex.taxi.network.api.a.a(d, null, plusRepository$upgrade$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    Object d2 = d(this, null, UpgradeStatus.UPGRADE_SUCCESS, null, 5);
                    a = Result.a(d2);
                    if (a != null) {
                        return d2;
                    }
                    throw a;
                }
            }
            if (i != 0) {
            }
            Object d22 = d(this, null, UpgradeStatus.UPGRADE_SUCCESS, null, 5);
            a = Result.a(d22);
            if (a != null) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return ((th instanceof GoApiHttpException) && th.getCode() == 409) ? d(this, null, UpgradeStatus.UPGRADE_SUCCESS, null, 5) : d(this, null, UpgradeStatus.NETWORK_OR_SERVER_ERROR, null, 5);
        }
        plusRepository$upgrade$1 = new PlusRepository$upgrade$1(this, continuationImpl);
        Object obj2 = plusRepository$upgrade$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusRepository$upgrade$1.label;
    }
}
