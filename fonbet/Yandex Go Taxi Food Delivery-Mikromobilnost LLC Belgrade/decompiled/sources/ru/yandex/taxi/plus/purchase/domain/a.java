package ru.yandex.taxi.plus.purchase.domain;

import com.adjust.sdk.Constants;
import defpackage.a0v0;
import defpackage.as6;
import defpackage.b0v0;
import defpackage.b1v0;
import defpackage.bkd0;
import defpackage.c0v0;
import defpackage.d0v0;
import defpackage.evu0;
import defpackage.fib1;
import defpackage.g4u0;
import defpackage.l0v0;
import defpackage.l9y0;
import defpackage.lx4;
import defpackage.mth;
import defpackage.na1;
import defpackage.ny61;
import defpackage.o0v0;
import defpackage.oy80;
import defpackage.q0v0;
import defpackage.u0v0;
import defpackage.vr41;
import defpackage.znp0;
import defpackage.zzu0;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.plus.api.dto.menu.button.ButtonAction;
import ru.yandex.taxi.plus.repository.c;

/* loaded from: classes6.dex */
public final class a {
    public final c a;
    public final ru.yandex.taxi.plus.sdk.domain.a b;
    public final b1v0 c;
    public final com.yandex.go.payments.plus.domain.c d;
    public final q0v0 e;
    public final oy80 f;

    public a(c cVar, ru.yandex.taxi.plus.sdk.domain.a aVar, b1v0 b1v0Var, com.yandex.go.payments.plus.domain.c cVar2, q0v0 q0v0Var, oy80 oy80Var) {
        this.a = cVar;
        this.b = aVar;
        this.c = b1v0Var;
        this.d = cVar2;
        this.e = q0v0Var;
        this.f = oy80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(l0v0 l0v0Var, ContinuationImpl continuationImpl) {
        PlusSubscriptionInteractor$delaySuccessfulUpgrade$1 plusSubscriptionInteractor$delaySuccessfulUpgrade$1;
        int i;
        if (continuationImpl instanceof PlusSubscriptionInteractor$delaySuccessfulUpgrade$1) {
            plusSubscriptionInteractor$delaySuccessfulUpgrade$1 = (PlusSubscriptionInteractor$delaySuccessfulUpgrade$1) continuationImpl;
            int i2 = plusSubscriptionInteractor$delaySuccessfulUpgrade$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusSubscriptionInteractor$delaySuccessfulUpgrade$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusSubscriptionInteractor$delaySuccessfulUpgrade$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusSubscriptionInteractor$delaySuccessfulUpgrade$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                b.b(obj);
                if ((l0v0Var != null ? l0v0Var.d : null) != UpgradeStatus.UPGRADE_SUCCESS) {
                    return l0v0Var;
                }
                plusSubscriptionInteractor$delaySuccessfulUpgrade$1.L$0 = null;
                plusSubscriptionInteractor$delaySuccessfulUpgrade$1.label = 1;
                Object e = e(plusSubscriptionInteractor$delaySuccessfulUpgrade$1);
                return e == obj2 ? obj2 : e;
            }
        }
        plusSubscriptionInteractor$delaySuccessfulUpgrade$1 = new PlusSubscriptionInteractor$delaySuccessfulUpgrade$1(this, continuationImpl);
        Object obj3 = plusSubscriptionInteractor$delaySuccessfulUpgrade$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusSubscriptionInteractor$delaySuccessfulUpgrade$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(znp0 znp0Var, String str, boolean z, String str2, ContinuationImpl continuationImpl) {
        PlusSubscriptionInteractor$handleSubscriptionActionOnSdkData$1 plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$1;
        int i;
        boolean d;
        boolean g;
        boolean z2;
        l0v0 l0v0Var;
        boolean z3;
        boolean z4;
        o0v0 o0v0Var;
        vr41 vr41Var;
        znp0 znp0Var2 = znp0Var;
        boolean z5 = z;
        if (continuationImpl instanceof PlusSubscriptionInteractor$handleSubscriptionActionOnSdkData$1) {
            plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$1 = (PlusSubscriptionInteractor$handleSubscriptionActionOnSdkData$1) continuationImpl;
            int i2 = plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$1.label = i2 - Integer.MIN_VALUE;
                PlusSubscriptionInteractor$handleSubscriptionActionOnSdkData$1 plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12 = plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$1;
                Object obj = plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.label;
                if (i != 0) {
                    b.b(obj);
                    if (znp0Var2 == null) {
                        return new d0v0(null);
                    }
                    d = fib1.d(znp0Var2.d);
                    g = fib1.g(znp0Var2.d);
                    String str3 = znp0Var2.d.b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String b = this.d.b();
                    if (d) {
                        oy80 oy80Var = this.f;
                        l9y0 l9y0Var = (l9y0) oy80Var.c;
                        if (l9y0Var != null) {
                            i a = l9y0Var.a("CashbackCard.YandexPlusBuySubscriptionTapped", ((bkd0) oy80Var.b).b);
                            a.a.put("initiated", l9y0.b(z5));
                            a.a.put(Constants.DEEPLINK, l9y0Var.c);
                            a.a.put("purchase_source_type", "native");
                            a.m();
                        }
                    }
                    l0v0 l0v0Var2 = znp0Var2.d;
                    z2 = fib1.d(l0v0Var2) && l0v0Var2.a == ButtonAction.PLUS_BUY_WEBVIEW;
                    g4u0 g4u0Var = znp0Var2.c;
                    String str4 = (g4u0Var == null || (o0v0Var = g4u0Var.b) == null || (vr41Var = o0v0Var.e) == null) ? null : vr41Var.a;
                    if (z2 && str4 != null) {
                        return new b0v0(str4);
                    }
                    if (d && (b == null || evu0.J(b))) {
                        return new c0v0(null);
                    }
                    if (d && b != null && !evu0.J(b)) {
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$0 = znp0Var2;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$1 = null;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$2 = null;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$3 = null;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$4 = null;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$5 = null;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.Z$0 = z5;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.Z$1 = d;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.Z$2 = g;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.Z$3 = z2;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.label = 1;
                        obj = j(str3, b, str, z5, str2, plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12);
                        if (obj != obj2) {
                            z3 = z2;
                            z4 = g;
                            l0v0Var = (l0v0) obj;
                        }
                    } else if (g) {
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$0 = znp0Var2;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$1 = null;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$2 = null;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$3 = null;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$4 = null;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$5 = null;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.Z$0 = z5;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.Z$1 = d;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.Z$2 = g;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.Z$3 = z2;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.label = 2;
                        obj = k(z5, plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12);
                        if (obj != obj2) {
                            z3 = z2;
                            z4 = g;
                            l0v0Var = (l0v0) obj;
                        }
                    } else {
                        l0v0Var = null;
                        u0v0 a2 = this.c.a(znp0Var2.a, l0v0Var);
                        if (!d) {
                            return g ? new a0v0(a2.h) : new d0v0(a2.h);
                        }
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$0 = null;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$1 = null;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$2 = null;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$3 = null;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$4 = null;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$5 = null;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$6 = null;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$7 = null;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.Z$0 = z5;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.Z$1 = d;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.Z$2 = g;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.Z$3 = z2;
                        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.label = 3;
                        Object f = f(a2, z5, plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12);
                        if (f != obj2) {
                            return f;
                        }
                    }
                    return obj2;
                }
                if (i == 1) {
                    z3 = plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.Z$3;
                    z4 = plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.Z$2;
                    boolean z6 = plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.Z$1;
                    boolean z7 = plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.Z$0;
                    znp0Var2 = (znp0) plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$0;
                    b.b(obj);
                    d = z6;
                    z5 = z7;
                    l0v0Var = (l0v0) obj;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    z3 = plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.Z$3;
                    z4 = plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.Z$2;
                    boolean z8 = plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.Z$1;
                    boolean z9 = plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.Z$0;
                    znp0Var2 = (znp0) plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$12.L$0;
                    b.b(obj);
                    d = z8;
                    z5 = z9;
                    l0v0Var = (l0v0) obj;
                }
                z2 = z3;
                g = z4;
                u0v0 a22 = this.c.a(znp0Var2.a, l0v0Var);
                if (!d) {
                }
            }
        }
        plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$1 = new PlusSubscriptionInteractor$handleSubscriptionActionOnSdkData$1(this, continuationImpl);
        PlusSubscriptionInteractor$handleSubscriptionActionOnSdkData$1 plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$122 = plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$1;
        Object obj3 = plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusSubscriptionInteractor$handleSubscriptionActionOnSdkData$122.label;
        if (i != 0) {
        }
        z2 = z3;
        g = z4;
        u0v0 a222 = this.c.a(znp0Var2.a, l0v0Var);
        if (!d) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(boolean z, ContinuationImpl continuationImpl) {
        PlusSubscriptionInteractor$moveToSuccessState$1 plusSubscriptionInteractor$moveToSuccessState$1;
        int i;
        if (continuationImpl instanceof PlusSubscriptionInteractor$moveToSuccessState$1) {
            plusSubscriptionInteractor$moveToSuccessState$1 = (PlusSubscriptionInteractor$moveToSuccessState$1) continuationImpl;
            int i2 = plusSubscriptionInteractor$moveToSuccessState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusSubscriptionInteractor$moveToSuccessState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusSubscriptionInteractor$moveToSuccessState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusSubscriptionInteractor$moveToSuccessState$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                c.d(this.a, PurchaseStatus.SUCCESS, null, null, 6);
                plusSubscriptionInteractor$moveToSuccessState$1.Z$0 = false;
                plusSubscriptionInteractor$moveToSuccessState$1.Z$1 = z;
                plusSubscriptionInteractor$moveToSuccessState$1.label = 1;
                Object d = d(false, z, plusSubscriptionInteractor$moveToSuccessState$1);
                return d == obj2 ? obj2 : d;
            }
        }
        plusSubscriptionInteractor$moveToSuccessState$1 = new PlusSubscriptionInteractor$moveToSuccessState$1(this, continuationImpl);
        Object obj3 = plusSubscriptionInteractor$moveToSuccessState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusSubscriptionInteractor$moveToSuccessState$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (kotlinx.coroutines.a.i(3000, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(boolean z, boolean z2, ContinuationImpl continuationImpl) {
        PlusSubscriptionInteractor$onPurchaseSuccess$1 plusSubscriptionInteractor$onPurchaseSuccess$1;
        int i;
        l9y0 l9y0Var;
        if (continuationImpl instanceof PlusSubscriptionInteractor$onPurchaseSuccess$1) {
            plusSubscriptionInteractor$onPurchaseSuccess$1 = (PlusSubscriptionInteractor$onPurchaseSuccess$1) continuationImpl;
            int i2 = plusSubscriptionInteractor$onPurchaseSuccess$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusSubscriptionInteractor$onPurchaseSuccess$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusSubscriptionInteractor$onPurchaseSuccess$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusSubscriptionInteractor$onPurchaseSuccess$1.label;
                if (i != 0) {
                    b.b(obj);
                    plusSubscriptionInteractor$onPurchaseSuccess$1.Z$0 = z;
                    plusSubscriptionInteractor$onPurchaseSuccess$1.Z$1 = z2;
                    plusSubscriptionInteractor$onPurchaseSuccess$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = plusSubscriptionInteractor$onPurchaseSuccess$1.Z$1;
                    z = plusSubscriptionInteractor$onPurchaseSuccess$1.Z$0;
                    b.b(obj);
                }
                oy80 oy80Var = this.f;
                l9y0Var = (l9y0) oy80Var.c;
                if (l9y0Var != null) {
                    i a = l9y0Var.a("CashbackCard.YandexPlusBuySubscriptionSuccess", ((bkd0) oy80Var.b).b);
                    a.a.put("initiated", l9y0.b(z));
                    a.a.put(Constants.DEEPLINK, l9y0Var.c);
                    a.a.put("purchase_source_type", z2 ? "native" : "webview");
                    a.m();
                    lx4 lx4Var = l9y0Var.a;
                    ((na1) l9y0Var.b).getClass();
                    ((j) lx4Var).v(as6.s());
                }
                plusSubscriptionInteractor$onPurchaseSuccess$1.Z$0 = z;
                plusSubscriptionInteractor$onPurchaseSuccess$1.Z$1 = z2;
                plusSubscriptionInteractor$onPurchaseSuccess$1.label = 2;
                Object l = l(plusSubscriptionInteractor$onPurchaseSuccess$1);
                return l != obj2 ? obj2 : l;
            }
        }
        plusSubscriptionInteractor$onPurchaseSuccess$1 = new PlusSubscriptionInteractor$onPurchaseSuccess$1(this, continuationImpl);
        Object obj3 = plusSubscriptionInteractor$onPurchaseSuccess$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusSubscriptionInteractor$onPurchaseSuccess$1.label;
        if (i != 0) {
        }
        oy80 oy80Var2 = this.f;
        l9y0Var = (l9y0) oy80Var2.c;
        if (l9y0Var != null) {
        }
        plusSubscriptionInteractor$onPurchaseSuccess$1.Z$0 = z;
        plusSubscriptionInteractor$onPurchaseSuccess$1.Z$1 = z2;
        plusSubscriptionInteractor$onPurchaseSuccess$1.label = 2;
        Object l2 = l(plusSubscriptionInteractor$onPurchaseSuccess$1);
        if (l2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (kotlinx.coroutines.a.i(3000, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        PlusSubscriptionInteractor$onUpgradeSuccess$1 plusSubscriptionInteractor$onUpgradeSuccess$1;
        int i;
        if (continuationImpl instanceof PlusSubscriptionInteractor$onUpgradeSuccess$1) {
            plusSubscriptionInteractor$onUpgradeSuccess$1 = (PlusSubscriptionInteractor$onUpgradeSuccess$1) continuationImpl;
            int i2 = plusSubscriptionInteractor$onUpgradeSuccess$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusSubscriptionInteractor$onUpgradeSuccess$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusSubscriptionInteractor$onUpgradeSuccess$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusSubscriptionInteractor$onUpgradeSuccess$1.label;
                if (i != 0) {
                    b.b(obj);
                    plusSubscriptionInteractor$onUpgradeSuccess$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                plusSubscriptionInteractor$onUpgradeSuccess$1.label = 2;
                Object m = m(plusSubscriptionInteractor$onUpgradeSuccess$1);
                return m != obj2 ? obj2 : m;
            }
        }
        plusSubscriptionInteractor$onUpgradeSuccess$1 = new PlusSubscriptionInteractor$onUpgradeSuccess$1(this, continuationImpl);
        Object obj3 = plusSubscriptionInteractor$onUpgradeSuccess$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusSubscriptionInteractor$onUpgradeSuccess$1.label;
        if (i != 0) {
        }
        plusSubscriptionInteractor$onUpgradeSuccess$1.label = 2;
        Object m2 = m(plusSubscriptionInteractor$onUpgradeSuccess$1);
        if (m2 != obj22) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(u0v0 u0v0Var, boolean z, ContinuationImpl continuationImpl) {
        PlusSubscriptionInteractor$pollPurchase$1 plusSubscriptionInteractor$pollPurchase$1;
        int i;
        if (continuationImpl instanceof PlusSubscriptionInteractor$pollPurchase$1) {
            plusSubscriptionInteractor$pollPurchase$1 = (PlusSubscriptionInteractor$pollPurchase$1) continuationImpl;
            int i2 = plusSubscriptionInteractor$pollPurchase$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusSubscriptionInteractor$pollPurchase$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusSubscriptionInteractor$pollPurchase$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusSubscriptionInteractor$pollPurchase$1.label;
                if (i != 0) {
                    b.b(obj);
                    String str = u0v0Var.i;
                    if (str == null || evu0.J(str)) {
                        this.f.n(z);
                        return new zzu0(u0v0Var.h);
                    }
                    plusSubscriptionInteractor$pollPurchase$1.L$0 = null;
                    plusSubscriptionInteractor$pollPurchase$1.L$1 = null;
                    plusSubscriptionInteractor$pollPurchase$1.Z$0 = z;
                    plusSubscriptionInteractor$pollPurchase$1.label = 1;
                    obj = i(str, plusSubscriptionInteractor$pollPurchase$1, z);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                l0v0 l0v0Var = (l0v0) obj;
                return new zzu0(l0v0Var != null ? l0v0Var.c : null);
            }
        }
        plusSubscriptionInteractor$pollPurchase$1 = new PlusSubscriptionInteractor$pollPurchase$1(this, continuationImpl);
        Object obj3 = plusSubscriptionInteractor$pollPurchase$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusSubscriptionInteractor$pollPurchase$1.label;
        if (i != 0) {
        }
        l0v0 l0v0Var2 = (l0v0) obj3;
        return new zzu0(l0v0Var2 != null ? l0v0Var2.c : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        PlusSubscriptionInteractor$pollPurchaseIfRequired$1 plusSubscriptionInteractor$pollPurchaseIfRequired$1;
        int i;
        boolean z;
        boolean z2;
        vr41 vr41Var;
        String str;
        if (continuationImpl instanceof PlusSubscriptionInteractor$pollPurchaseIfRequired$1) {
            plusSubscriptionInteractor$pollPurchaseIfRequired$1 = (PlusSubscriptionInteractor$pollPurchaseIfRequired$1) continuationImpl;
            int i2 = plusSubscriptionInteractor$pollPurchaseIfRequired$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusSubscriptionInteractor$pollPurchaseIfRequired$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusSubscriptionInteractor$pollPurchaseIfRequired$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusSubscriptionInteractor$pollPurchaseIfRequired$1.label;
                if (i != 0) {
                    b.b(obj);
                    c cVar = this.a;
                    plusSubscriptionInteractor$pollPurchaseIfRequired$1.Z$0 = false;
                    plusSubscriptionInteractor$pollPurchaseIfRequired$1.label = 1;
                    Object obj3 = cVar.a.a;
                    obj = obj3 == null ? e.y(new mth(cVar.a.e, 6), plusSubscriptionInteractor$pollPurchaseIfRequired$1) : obj3;
                    if (obj != obj2) {
                        z = false;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return obj;
                }
                z = plusSubscriptionInteractor$pollPurchaseIfRequired$1.Z$0;
                b.b(obj);
                znp0 znp0Var = (znp0) obj;
                l0v0 l0v0Var = znp0Var.d;
                ButtonAction buttonAction = l0v0Var.a;
                String str2 = l0v0Var.b;
                z2 = str2 == null && !evu0.J(str2) && (buttonAction != ButtonAction.PLUS_BUY || buttonAction == ButtonAction.PLUS_BUY_WEBVIEW) && (buttonAction == ButtonAction.PLUS_BUY_WEBVIEW || ((vr41Var = l0v0Var.f) != null && (str = vr41Var.a) != null && str.length() > 0));
                String str3 = l0v0Var.e;
                PurchaseStatus purchaseStatus = l0v0Var.c;
                int i3 = (purchaseStatus != PurchaseStatus.NETWORK_OR_SERVER_ERROR || purchaseStatus == PurchaseStatus.PURCHASE_AVAILABLE || purchaseStatus == PurchaseStatus.IN_PROGRESS) ? 1 : 0;
                if (z2 || str3 == null || evu0.J(str3) || i3 == 0) {
                    return new d0v0(null);
                }
                u0v0 a = this.c.a(znp0Var.a, l0v0Var);
                plusSubscriptionInteractor$pollPurchaseIfRequired$1.L$0 = null;
                plusSubscriptionInteractor$pollPurchaseIfRequired$1.L$1 = null;
                plusSubscriptionInteractor$pollPurchaseIfRequired$1.L$2 = null;
                plusSubscriptionInteractor$pollPurchaseIfRequired$1.L$3 = null;
                plusSubscriptionInteractor$pollPurchaseIfRequired$1.Z$0 = z;
                plusSubscriptionInteractor$pollPurchaseIfRequired$1.Z$1 = z2;
                plusSubscriptionInteractor$pollPurchaseIfRequired$1.I$0 = i3;
                plusSubscriptionInteractor$pollPurchaseIfRequired$1.label = 2;
                Object f = f(a, z, plusSubscriptionInteractor$pollPurchaseIfRequired$1);
                return f == obj2 ? obj2 : f;
            }
        }
        plusSubscriptionInteractor$pollPurchaseIfRequired$1 = new PlusSubscriptionInteractor$pollPurchaseIfRequired$1(this, continuationImpl);
        Object obj4 = plusSubscriptionInteractor$pollPurchaseIfRequired$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusSubscriptionInteractor$pollPurchaseIfRequired$1.label;
        if (i != 0) {
        }
        znp0 znp0Var2 = (znp0) obj4;
        l0v0 l0v0Var2 = znp0Var2.d;
        ButtonAction buttonAction2 = l0v0Var2.a;
        String str22 = l0v0Var2.b;
        if (str22 == null) {
        }
        String str32 = l0v0Var2.e;
        PurchaseStatus purchaseStatus2 = l0v0Var2.c;
        if (purchaseStatus2 != PurchaseStatus.NETWORK_OR_SERVER_ERROR) {
        }
        if (z2) {
        }
        return new d0v0(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r10 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, String str2, ContinuationImpl continuationImpl, boolean z) {
        PlusSubscriptionInteractor$purchaseOrUpgradeSubscription$1 plusSubscriptionInteractor$purchaseOrUpgradeSubscription$1;
        int i;
        if (continuationImpl instanceof PlusSubscriptionInteractor$purchaseOrUpgradeSubscription$1) {
            plusSubscriptionInteractor$purchaseOrUpgradeSubscription$1 = (PlusSubscriptionInteractor$purchaseOrUpgradeSubscription$1) continuationImpl;
            int i2 = plusSubscriptionInteractor$purchaseOrUpgradeSubscription$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusSubscriptionInteractor$purchaseOrUpgradeSubscription$1.label = i2 - Integer.MIN_VALUE;
                PlusSubscriptionInteractor$purchaseOrUpgradeSubscription$1 plusSubscriptionInteractor$purchaseOrUpgradeSubscription$12 = plusSubscriptionInteractor$purchaseOrUpgradeSubscription$1;
                Object obj = plusSubscriptionInteractor$purchaseOrUpgradeSubscription$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusSubscriptionInteractor$purchaseOrUpgradeSubscription$12.label;
                if (i != 0) {
                    b.b(obj);
                    c cVar = this.a;
                    plusSubscriptionInteractor$purchaseOrUpgradeSubscription$12.L$0 = str;
                    plusSubscriptionInteractor$purchaseOrUpgradeSubscription$12.L$1 = str2;
                    plusSubscriptionInteractor$purchaseOrUpgradeSubscription$12.Z$0 = z;
                    plusSubscriptionInteractor$purchaseOrUpgradeSubscription$12.label = 1;
                    Object obj3 = cVar.a.a;
                    obj = obj3 == null ? e.y(new mth(cVar.a.e, 6), plusSubscriptionInteractor$purchaseOrUpgradeSubscription$12) : obj3;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    z = plusSubscriptionInteractor$purchaseOrUpgradeSubscription$12.Z$0;
                    str2 = (String) plusSubscriptionInteractor$purchaseOrUpgradeSubscription$12.L$1;
                    str = (String) plusSubscriptionInteractor$purchaseOrUpgradeSubscription$12.L$0;
                    b.b(obj);
                }
                String str3 = str;
                String str4 = str2;
                plusSubscriptionInteractor$purchaseOrUpgradeSubscription$12.L$0 = null;
                plusSubscriptionInteractor$purchaseOrUpgradeSubscription$12.L$1 = null;
                plusSubscriptionInteractor$purchaseOrUpgradeSubscription$12.L$2 = null;
                plusSubscriptionInteractor$purchaseOrUpgradeSubscription$12.Z$0 = z;
                plusSubscriptionInteractor$purchaseOrUpgradeSubscription$12.label = 2;
                Object b = b((znp0) obj, str3, z, str4, plusSubscriptionInteractor$purchaseOrUpgradeSubscription$12);
                return b != obj2 ? obj2 : b;
            }
        }
        plusSubscriptionInteractor$purchaseOrUpgradeSubscription$1 = new PlusSubscriptionInteractor$purchaseOrUpgradeSubscription$1(this, continuationImpl);
        PlusSubscriptionInteractor$purchaseOrUpgradeSubscription$1 plusSubscriptionInteractor$purchaseOrUpgradeSubscription$122 = plusSubscriptionInteractor$purchaseOrUpgradeSubscription$1;
        Object obj4 = plusSubscriptionInteractor$purchaseOrUpgradeSubscription$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusSubscriptionInteractor$purchaseOrUpgradeSubscription$122.label;
        if (i != 0) {
        }
        String str32 = str;
        String str42 = str2;
        plusSubscriptionInteractor$purchaseOrUpgradeSubscription$122.L$0 = null;
        plusSubscriptionInteractor$purchaseOrUpgradeSubscription$122.L$1 = null;
        plusSubscriptionInteractor$purchaseOrUpgradeSubscription$122.L$2 = null;
        plusSubscriptionInteractor$purchaseOrUpgradeSubscription$122.Z$0 = z;
        plusSubscriptionInteractor$purchaseOrUpgradeSubscription$122.label = 2;
        Object b2 = b((znp0) obj4, str32, z, str42, plusSubscriptionInteractor$purchaseOrUpgradeSubscription$122);
        if (b2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        if (r8 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x005b, code lost:
    
        if (r9 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, ContinuationImpl continuationImpl, boolean z) {
        PlusSubscriptionInteractor$purchaseStatus$1 plusSubscriptionInteractor$purchaseStatus$1;
        int i;
        Object b;
        PurchaseStatus purchaseStatus;
        PurchaseStatus purchaseStatus2;
        l0v0 l0v0Var;
        Object d;
        if (continuationImpl instanceof PlusSubscriptionInteractor$purchaseStatus$1) {
            plusSubscriptionInteractor$purchaseStatus$1 = (PlusSubscriptionInteractor$purchaseStatus$1) continuationImpl;
            int i2 = plusSubscriptionInteractor$purchaseStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusSubscriptionInteractor$purchaseStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusSubscriptionInteractor$purchaseStatus$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusSubscriptionInteractor$purchaseStatus$1.label;
                if (i != 0) {
                    b.b(obj);
                    plusSubscriptionInteractor$purchaseStatus$1.L$0 = null;
                    plusSubscriptionInteractor$purchaseStatus$1.Z$0 = z;
                    plusSubscriptionInteractor$purchaseStatus$1.label = 1;
                    b = this.a.b(str, plusSubscriptionInteractor$purchaseStatus$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        d = ((Result) obj).getValue();
                        return (l0v0) (d instanceof Result.Failure ? null : d);
                    }
                    z = plusSubscriptionInteractor$purchaseStatus$1.Z$0;
                    b.b(obj);
                    b = ((Result) obj).getValue();
                }
                boolean z2 = b instanceof Result.Failure;
                l0v0 l0v0Var2 = (l0v0) (!z2 ? null : b);
                purchaseStatus = l0v0Var2 == null ? l0v0Var2.c : null;
                purchaseStatus2 = PurchaseStatus.NETWORK_OR_SERVER_ERROR;
                oy80 oy80Var = this.f;
                if (purchaseStatus == purchaseStatus2) {
                    oy80Var.n(z);
                }
                l0v0Var = (l0v0) (!z2 ? null : b);
                if ((l0v0Var == null ? l0v0Var.c : null) == PurchaseStatus.SUCCESS) {
                    oy80Var.n(z);
                    return (l0v0) (z2 ? null : b);
                }
                plusSubscriptionInteractor$purchaseStatus$1.L$0 = null;
                plusSubscriptionInteractor$purchaseStatus$1.L$1 = null;
                plusSubscriptionInteractor$purchaseStatus$1.Z$0 = z;
                plusSubscriptionInteractor$purchaseStatus$1.label = 2;
                d = d(z, true, plusSubscriptionInteractor$purchaseStatus$1);
            }
        }
        plusSubscriptionInteractor$purchaseStatus$1 = new PlusSubscriptionInteractor$purchaseStatus$1(this, continuationImpl);
        Object obj3 = plusSubscriptionInteractor$purchaseStatus$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusSubscriptionInteractor$purchaseStatus$1.label;
        if (i != 0) {
        }
        boolean z22 = b instanceof Result.Failure;
        l0v0 l0v0Var22 = (l0v0) (!z22 ? null : b);
        if (l0v0Var22 == null) {
        }
        purchaseStatus2 = PurchaseStatus.NETWORK_OR_SERVER_ERROR;
        oy80 oy80Var2 = this.f;
        if (purchaseStatus == purchaseStatus2) {
        }
        l0v0Var = (l0v0) (!z22 ? null : b);
        if ((l0v0Var == null ? l0v0Var.c : null) == PurchaseStatus.SUCCESS) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, String str2, String str3, boolean z, String str4, ContinuationImpl continuationImpl) {
        PlusSubscriptionInteractor$startPurchase$1 plusSubscriptionInteractor$startPurchase$1;
        int i;
        Object a;
        l0v0 l0v0Var;
        if (continuationImpl instanceof PlusSubscriptionInteractor$startPurchase$1) {
            plusSubscriptionInteractor$startPurchase$1 = (PlusSubscriptionInteractor$startPurchase$1) continuationImpl;
            int i2 = plusSubscriptionInteractor$startPurchase$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusSubscriptionInteractor$startPurchase$1.label = i2 - Integer.MIN_VALUE;
                PlusSubscriptionInteractor$startPurchase$1 plusSubscriptionInteractor$startPurchase$12 = plusSubscriptionInteractor$startPurchase$1;
                Object obj = plusSubscriptionInteractor$startPurchase$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusSubscriptionInteractor$startPurchase$12.label;
                if (i != 0) {
                    b.b(obj);
                    this.e.a();
                    plusSubscriptionInteractor$startPurchase$12.L$0 = null;
                    plusSubscriptionInteractor$startPurchase$12.L$1 = null;
                    plusSubscriptionInteractor$startPurchase$12.L$2 = null;
                    plusSubscriptionInteractor$startPurchase$12.L$3 = null;
                    plusSubscriptionInteractor$startPurchase$12.Z$0 = z;
                    plusSubscriptionInteractor$startPurchase$12.label = 1;
                    a = this.a.a(str, str2, str3, str4, plusSubscriptionInteractor$startPurchase$12);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = plusSubscriptionInteractor$startPurchase$12.Z$0;
                    b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (a instanceof Result.Failure) {
                    a = null;
                }
                l0v0Var = (l0v0) a;
                if ((l0v0Var != null ? l0v0Var.c : null) == PurchaseStatus.NETWORK_OR_SERVER_ERROR) {
                    this.f.n(z);
                }
                return l0v0Var;
            }
        }
        plusSubscriptionInteractor$startPurchase$1 = new PlusSubscriptionInteractor$startPurchase$1(this, continuationImpl);
        PlusSubscriptionInteractor$startPurchase$1 plusSubscriptionInteractor$startPurchase$122 = plusSubscriptionInteractor$startPurchase$1;
        Object obj2 = plusSubscriptionInteractor$startPurchase$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusSubscriptionInteractor$startPurchase$122.label;
        if (i != 0) {
        }
        if (a instanceof Result.Failure) {
        }
        l0v0Var = (l0v0) a;
        if ((l0v0Var != null ? l0v0Var.c : null) == PurchaseStatus.NETWORK_OR_SERVER_ERROR) {
        }
        return l0v0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        if (r14 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r14 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(boolean z, ContinuationImpl continuationImpl) {
        PlusSubscriptionInteractor$startUpgrade$1 plusSubscriptionInteractor$startUpgrade$1;
        int i;
        Object e;
        Object a;
        if (continuationImpl instanceof PlusSubscriptionInteractor$startUpgrade$1) {
            plusSubscriptionInteractor$startUpgrade$1 = (PlusSubscriptionInteractor$startUpgrade$1) continuationImpl;
            int i2 = plusSubscriptionInteractor$startUpgrade$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusSubscriptionInteractor$startUpgrade$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusSubscriptionInteractor$startUpgrade$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusSubscriptionInteractor$startUpgrade$1.label;
                if (i != 0) {
                    b.b(obj);
                    oy80 oy80Var = this.f;
                    l9y0 l9y0Var = (l9y0) oy80Var.c;
                    if (l9y0Var != null) {
                        i a2 = l9y0Var.a("CashbackCard.ActivationButtonTapped", ((bkd0) oy80Var.b).b);
                        a2.a.put("initiated", l9y0.b(z));
                        a2.a.put(Constants.DEEPLINK, l9y0Var.c);
                        a2.a.put("purchase_source_type", "native");
                        a2.m();
                    }
                    c cVar = this.a;
                    plusSubscriptionInteractor$startUpgrade$1.Z$0 = z;
                    plusSubscriptionInteractor$startUpgrade$1.label = 1;
                    e = cVar.e(plusSubscriptionInteractor$startUpgrade$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = plusSubscriptionInteractor$startUpgrade$1.Z$0;
                        b.b(obj);
                        a = ((Result) obj).getValue();
                        if (a instanceof Result.Failure) {
                            a = null;
                        }
                        l0v0 l0v0Var = (l0v0) a;
                        UpgradeStatus upgradeStatus = l0v0Var != null ? l0v0Var.d : null;
                        UpgradeStatus upgradeStatus2 = UpgradeStatus.NETWORK_OR_SERVER_ERROR;
                        oy80 oy80Var2 = this.f;
                        l9y0 l9y0Var2 = (l9y0) oy80Var2.c;
                        if (upgradeStatus == upgradeStatus2) {
                            if (l9y0Var2 != null) {
                                i a3 = l9y0Var2.a("CashbackCard.ActivationCashbackFailed", ((bkd0) oy80Var2.b).b);
                                String b = l9y0.b(z);
                                LinkedHashMap linkedHashMap = a3.a;
                                linkedHashMap.put("initiated", b);
                                linkedHashMap.put("purchase_source_type", "native");
                                a3.m();
                                return l0v0Var;
                            }
                        } else if (l9y0Var2 != null) {
                            i a4 = l9y0Var2.a("CashbackCard.ActivationCashbackSuccess", ((bkd0) oy80Var2.b).b);
                            a4.a.put("initiated", l9y0.b(z));
                            a4.a.put(Constants.DEEPLINK, l9y0Var2.c);
                            a4.a.put("purchase_source_type", "native");
                            a4.m();
                        }
                        return l0v0Var;
                    }
                    z = plusSubscriptionInteractor$startUpgrade$1.Z$0;
                    b.b(obj);
                    e = ((Result) obj).getValue();
                }
                if (e instanceof Result.Failure) {
                    e = null;
                }
                plusSubscriptionInteractor$startUpgrade$1.L$0 = null;
                plusSubscriptionInteractor$startUpgrade$1.Z$0 = z;
                plusSubscriptionInteractor$startUpgrade$1.label = 2;
                a = a((l0v0) e, plusSubscriptionInteractor$startUpgrade$1);
            }
        }
        plusSubscriptionInteractor$startUpgrade$1 = new PlusSubscriptionInteractor$startUpgrade$1(this, continuationImpl);
        Object obj3 = plusSubscriptionInteractor$startUpgrade$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusSubscriptionInteractor$startUpgrade$1.label;
        if (i != 0) {
        }
        if (e instanceof Result.Failure) {
        }
        plusSubscriptionInteractor$startUpgrade$1.L$0 = null;
        plusSubscriptionInteractor$startUpgrade$1.Z$0 = z;
        plusSubscriptionInteractor$startUpgrade$1.label = 2;
        a = a((l0v0) e, plusSubscriptionInteractor$startUpgrade$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(ContinuationImpl continuationImpl) {
        PlusSubscriptionInteractor$updateSdkDataOnSuccessfulPurchase$1 plusSubscriptionInteractor$updateSdkDataOnSuccessfulPurchase$1;
        int i;
        c cVar;
        q0v0 q0v0Var;
        Object b;
        try {
            if (continuationImpl instanceof PlusSubscriptionInteractor$updateSdkDataOnSuccessfulPurchase$1) {
                plusSubscriptionInteractor$updateSdkDataOnSuccessfulPurchase$1 = (PlusSubscriptionInteractor$updateSdkDataOnSuccessfulPurchase$1) continuationImpl;
                int i2 = plusSubscriptionInteractor$updateSdkDataOnSuccessfulPurchase$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusSubscriptionInteractor$updateSdkDataOnSuccessfulPurchase$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = plusSubscriptionInteractor$updateSdkDataOnSuccessfulPurchase$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusSubscriptionInteractor$updateSdkDataOnSuccessfulPurchase$1.label;
                    cVar = this.a;
                    q0v0Var = this.e;
                    if (i != 0) {
                        b.b(obj);
                        ru.yandex.taxi.plus.sdk.domain.a aVar = this.b;
                        plusSubscriptionInteractor$updateSdkDataOnSuccessfulPurchase$1.label = 1;
                        b = ru.yandex.taxi.plus.sdk.domain.a.b(aVar, null, plusSubscriptionInteractor$updateSdkDataOnSuccessfulPurchase$1, 3);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        b = ((Result) obj).getValue();
                    }
                    b.b(b);
                    q0v0Var.b();
                    Object d = c.d(cVar, ((znp0) b).d.c, null, null, 6);
                    b.b(d);
                    return (l0v0) d;
                }
            }
            if (i != 0) {
            }
            b.b(b);
            q0v0Var.b();
            Object d2 = c.d(cVar, ((znp0) b).d.c, null, null, 6);
            b.b(d2);
            return (l0v0) d2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            q0v0Var.b();
            return c.d(cVar, PurchaseStatus.PURCHASED, null, null, 6);
        }
        plusSubscriptionInteractor$updateSdkDataOnSuccessfulPurchase$1 = new PlusSubscriptionInteractor$updateSdkDataOnSuccessfulPurchase$1(this, continuationImpl);
        Object obj2 = plusSubscriptionInteractor$updateSdkDataOnSuccessfulPurchase$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusSubscriptionInteractor$updateSdkDataOnSuccessfulPurchase$1.label;
        cVar = this.a;
        q0v0Var = this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(ContinuationImpl continuationImpl) {
        PlusSubscriptionInteractor$updateSdkDataOnSuccessfulUpgrade$1 plusSubscriptionInteractor$updateSdkDataOnSuccessfulUpgrade$1;
        int i;
        c cVar;
        q0v0 q0v0Var;
        Object b;
        try {
            if (continuationImpl instanceof PlusSubscriptionInteractor$updateSdkDataOnSuccessfulUpgrade$1) {
                plusSubscriptionInteractor$updateSdkDataOnSuccessfulUpgrade$1 = (PlusSubscriptionInteractor$updateSdkDataOnSuccessfulUpgrade$1) continuationImpl;
                int i2 = plusSubscriptionInteractor$updateSdkDataOnSuccessfulUpgrade$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusSubscriptionInteractor$updateSdkDataOnSuccessfulUpgrade$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = plusSubscriptionInteractor$updateSdkDataOnSuccessfulUpgrade$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusSubscriptionInteractor$updateSdkDataOnSuccessfulUpgrade$1.label;
                    cVar = this.a;
                    q0v0Var = this.e;
                    if (i != 0) {
                        b.b(obj);
                        ru.yandex.taxi.plus.sdk.domain.a aVar = this.b;
                        plusSubscriptionInteractor$updateSdkDataOnSuccessfulUpgrade$1.label = 1;
                        b = ru.yandex.taxi.plus.sdk.domain.a.b(aVar, null, plusSubscriptionInteractor$updateSdkDataOnSuccessfulUpgrade$1, 3);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        b = ((Result) obj).getValue();
                    }
                    b.b(b);
                    q0v0Var.c();
                    Object d = c.d(cVar, null, ((znp0) b).d.d, null, 5);
                    b.b(d);
                    return (l0v0) d;
                }
            }
            if (i != 0) {
            }
            b.b(b);
            q0v0Var.c();
            Object d2 = c.d(cVar, null, ((znp0) b).d.d, null, 5);
            b.b(d2);
            return (l0v0) d2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            q0v0Var.c();
            return c.d(cVar, null, UpgradeStatus.UPGRADE_SUCCESS, null, 5);
        }
        plusSubscriptionInteractor$updateSdkDataOnSuccessfulUpgrade$1 = new PlusSubscriptionInteractor$updateSdkDataOnSuccessfulUpgrade$1(this, continuationImpl);
        Object obj2 = plusSubscriptionInteractor$updateSdkDataOnSuccessfulUpgrade$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusSubscriptionInteractor$updateSdkDataOnSuccessfulUpgrade$1.label;
        cVar = this.a;
        q0v0Var = this.e;
    }
}
