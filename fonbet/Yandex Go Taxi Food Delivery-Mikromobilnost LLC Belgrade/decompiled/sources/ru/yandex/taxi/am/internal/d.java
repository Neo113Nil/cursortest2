package ru.yandex.taxi.am.internal;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.k2;
import com.yandex.passport.internal.entities.Filter;
import defpackage.bd90;
import defpackage.ep90;
import defpackage.fgb0;
import defpackage.go90;
import defpackage.gtq0;
import defpackage.jst;
import defpackage.mu11;
import defpackage.ny61;
import defpackage.qz10;
import defpackage.s8o;
import defpackage.tcc;
import defpackage.u02;
import defpackage.yce;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.k;

/* loaded from: classes9.dex */
public final class d {
    public final ep90 a;
    public final u02 b;
    public final k c;
    public final fgb0 d;
    public final go90 e;

    public d(ep90 ep90Var, u02 u02Var, k kVar, fgb0 fgb0Var, go90 go90Var) {
        this.a = ep90Var;
        this.b = u02Var;
        this.c = kVar;
        this.d = fgb0Var;
        this.e = go90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PassportUidImpl passportUidImpl, ContinuationImpl continuationImpl) {
        PassportAccountRepository$getAccount$1 passportAccountRepository$getAccount$1;
        int i;
        Object g;
        Object obj;
        Throwable a;
        if (continuationImpl instanceof PassportAccountRepository$getAccount$1) {
            passportAccountRepository$getAccount$1 = (PassportAccountRepository$getAccount$1) continuationImpl;
            int i2 = passportAccountRepository$getAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAccountRepository$getAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = passportAccountRepository$getAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAccountRepository$getAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.passport.api.b a2 = this.a.a();
                    passportAccountRepository$getAccount$1.L$0 = passportUidImpl;
                    passportAccountRepository$getAccount$1.label = 1;
                    g = a2.g(passportUidImpl, passportAccountRepository$getAccount$1);
                    obj = passportUidImpl;
                    if (g == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj3 = (k2) passportAccountRepository$getAccount$1.L$0;
                    kotlin.b.b(obj2);
                    g = ((Result) obj2).getValue();
                    obj = obj3;
                }
                if (!(g instanceof Result.Failure)) {
                    g = s8o.c((com.yandex.passport.api.i) g);
                }
                a = Result.a(g);
                if (a != null) {
                    return g;
                }
                if (a instanceof PassportAccountNotFoundException) {
                    gtq0.F("Account not found", "Not found account with " + obj, a);
                } else {
                    gtq0.F("Passport runtime exception while get account", "Failed to get account with " + obj, a);
                }
                return null;
            }
        }
        passportAccountRepository$getAccount$1 = new PassportAccountRepository$getAccount$1(this, continuationImpl);
        Object obj22 = passportAccountRepository$getAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAccountRepository$getAccount$1.label;
        if (i != 0) {
        }
        if (!(g instanceof Result.Failure)) {
        }
        a = Result.a(g);
        if (a != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PassportAccountRepository$getAccounts$1 passportAccountRepository$getAccounts$1;
        int i;
        Object d;
        if (continuationImpl instanceof PassportAccountRepository$getAccounts$1) {
            passportAccountRepository$getAccounts$1 = (PassportAccountRepository$getAccounts$1) continuationImpl;
            int i2 = passportAccountRepository$getAccounts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAccountRepository$getAccounts$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportAccountRepository$getAccounts$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAccountRepository$getAccounts$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    passportAccountRepository$getAccounts$1.L$0 = this;
                    passportAccountRepository$getAccounts$1.label = 1;
                    this.d.getClass();
                    obj = Boolean.TRUE;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        d = ((Result) obj).getValue();
                        Throwable a = Result.a(d);
                        if (a == null) {
                            return d;
                        }
                        gtq0.F("Unknown exception in attempt to get accounts.", null, a);
                        return EmptyList.a;
                    }
                    this = (d) passportAccountRepository$getAccounts$1.L$0;
                    kotlin.b.b(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                passportAccountRepository$getAccounts$1.L$0 = null;
                passportAccountRepository$getAccounts$1.label = 2;
                d = this.d(booleanValue, passportAccountRepository$getAccounts$1);
            }
        }
        passportAccountRepository$getAccounts$1 = new PassportAccountRepository$getAccounts$1(this, continuationImpl);
        Object obj3 = passportAccountRepository$getAccounts$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAccountRepository$getAccounts$1.label;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        passportAccountRepository$getAccounts$1.L$0 = null;
        passportAccountRepository$getAccounts$1.label = 2;
        d = this.d(booleanValue2, passportAccountRepository$getAccounts$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Filter filter, ContinuationImpl continuationImpl) {
        PassportAccountRepository$getAccounts$4 passportAccountRepository$getAccounts$4;
        int i;
        Object o;
        if (continuationImpl instanceof PassportAccountRepository$getAccounts$4) {
            passportAccountRepository$getAccounts$4 = (PassportAccountRepository$getAccounts$4) continuationImpl;
            int i2 = passportAccountRepository$getAccounts$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAccountRepository$getAccounts$4.label = i2 - Integer.MIN_VALUE;
                Object obj = passportAccountRepository$getAccounts$4.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAccountRepository$getAccounts$4.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.api.b a = this.a.a();
                    passportAccountRepository$getAccounts$4.L$0 = null;
                    passportAccountRepository$getAccounts$4.label = 1;
                    o = a.o(filter, passportAccountRepository$getAccounts$4);
                    if (o == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    o = ((Result) obj).getValue();
                }
                if (!(o instanceof Result.Failure)) {
                    return o;
                }
                List list = (List) o;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(s8o.c((com.yandex.passport.api.i) it.next()));
                }
                return arrayList;
            }
        }
        passportAccountRepository$getAccounts$4 = new PassportAccountRepository$getAccounts$4(this, continuationImpl);
        Object obj2 = passportAccountRepository$getAccounts$4.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAccountRepository$getAccounts$4.label;
        if (i != 0) {
        }
        if (!(o instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(boolean z, ContinuationImpl continuationImpl) {
        PassportAccountRepository$getAccounts$3 passportAccountRepository$getAccounts$3;
        int i;
        if (continuationImpl instanceof PassportAccountRepository$getAccounts$3) {
            passportAccountRepository$getAccounts$3 = (PassportAccountRepository$getAccounts$3) continuationImpl;
            int i2 = passportAccountRepository$getAccounts$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAccountRepository$getAccounts$3.label = i2 - Integer.MIN_VALUE;
                Object obj = passportAccountRepository$getAccounts$3.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAccountRepository$getAccounts$3.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                kotlin.b.b(obj);
                Filter a = this.e.a(new yce(z, 16));
                passportAccountRepository$getAccounts$3.L$0 = null;
                passportAccountRepository$getAccounts$3.Z$0 = z;
                passportAccountRepository$getAccounts$3.label = 1;
                Object c = c(a, passportAccountRepository$getAccounts$3);
                return c == obj2 ? obj2 : c;
            }
        }
        passportAccountRepository$getAccounts$3 = new PassportAccountRepository$getAccounts$3(this, continuationImpl);
        Object obj3 = passportAccountRepository$getAccounts$3.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAccountRepository$getAccounts$3.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        PassportAccountRepository$getLinkageAccount$1 passportAccountRepository$getLinkageAccount$1;
        int i;
        Object f;
        Throwable a;
        if (continuationImpl instanceof PassportAccountRepository$getLinkageAccount$1) {
            passportAccountRepository$getLinkageAccount$1 = (PassportAccountRepository$getLinkageAccount$1) continuationImpl;
            int i2 = passportAccountRepository$getLinkageAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAccountRepository$getLinkageAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportAccountRepository$getLinkageAccount$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAccountRepository$getLinkageAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mu11 a2 = this.c.x.a();
                    if (!a2.a()) {
                        return null;
                    }
                    long j = a2.a;
                    passportAccountRepository$getLinkageAccount$1.L$0 = null;
                    passportAccountRepository$getLinkageAccount$1.label = 1;
                    f = f(j, passportAccountRepository$getLinkageAccount$1);
                    if (f == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    f = ((Result) obj).getValue();
                }
                a = Result.a(f);
                if (a != null) {
                    return f;
                }
                if (a instanceof PassportAccountNotFoundException) {
                    gtq0.F("Current Account not found", null, a);
                    return null;
                }
                gtq0.F("Unknown exception in attempt to get accounts.", null, a);
                return null;
            }
        }
        passportAccountRepository$getLinkageAccount$1 = new PassportAccountRepository$getLinkageAccount$1(this, continuationImpl);
        Object obj3 = passportAccountRepository$getLinkageAccount$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAccountRepository$getLinkageAccount$1.label;
        if (i != 0) {
        }
        a = Result.a(f);
        if (a != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(long j, ContinuationImpl continuationImpl) {
        PassportAccountRepository$getLinkageAccount$3 passportAccountRepository$getLinkageAccount$3;
        int i;
        Object obj;
        if (continuationImpl instanceof PassportAccountRepository$getLinkageAccount$3) {
            passportAccountRepository$getLinkageAccount$3 = (PassportAccountRepository$getLinkageAccount$3) continuationImpl;
            int i2 = passportAccountRepository$getLinkageAccount$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAccountRepository$getLinkageAccount$3.label = i2 - Integer.MIN_VALUE;
                Object obj2 = passportAccountRepository$getLinkageAccount$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAccountRepository$getLinkageAccount$3.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.passport.api.b a = this.a.a();
                    gtq0.h(this.b, j);
                    passportAccountRepository$getLinkageAccount$3.J$0 = j;
                    passportAccountRepository$getLinkageAccount$3.label = 1;
                    a.y();
                    if (coroutineSingletons == null) {
                        return coroutineSingletons;
                    }
                    obj = null;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = passportAccountRepository$getLinkageAccount$3.J$0;
                    kotlin.b.b(obj2);
                    obj = ((Result) obj2).getValue();
                }
                if (!(obj instanceof Result.Failure)) {
                    return obj;
                }
                com.yandex.passport.api.i iVar = (com.yandex.passport.api.i) obj;
                if (iVar == null) {
                    jst.e.p(String.format("PassportApi.getLinkageAccount() returned 0 for %d", Arrays.copyOf(new Object[]{new Long(j)}, 1)), new IllegalStateException("Linkage account not provided"));
                    return null;
                }
                jst.e.p(String.format("PassportApi.getLinkageAccount() returned candidate with uid %d", Arrays.copyOf(new Object[]{new Long(iVar.getUid().getValue())}, 1)), new Throwable("Linkage account provided"));
                return s8o.c(iVar);
            }
        }
        passportAccountRepository$getLinkageAccount$3 = new PassportAccountRepository$getLinkageAccount$3(this, continuationImpl);
        Object obj22 = passportAccountRepository$getLinkageAccount$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAccountRepository$getLinkageAccount$3.label;
        if (i != 0) {
        }
        if (!(obj instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        PassportAccountRepository$getNonPhonishAccounts$1 passportAccountRepository$getNonPhonishAccounts$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof PassportAccountRepository$getNonPhonishAccounts$1) {
            passportAccountRepository$getNonPhonishAccounts$1 = (PassportAccountRepository$getNonPhonishAccounts$1) continuationImpl;
            int i2 = passportAccountRepository$getNonPhonishAccounts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAccountRepository$getNonPhonishAccounts$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportAccountRepository$getNonPhonishAccounts$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAccountRepository$getNonPhonishAccounts$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Filter a2 = this.e.a(new qz10(16));
                    passportAccountRepository$getNonPhonishAccounts$1.L$0 = null;
                    passportAccountRepository$getNonPhonishAccounts$1.label = 1;
                    c = c(a2, passportAccountRepository$getNonPhonishAccounts$1);
                    if (c == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a != null) {
                    return c;
                }
                gtq0.F("Unknown exception in attempt to get accounts.", null, a);
                return EmptyList.a;
            }
        }
        passportAccountRepository$getNonPhonishAccounts$1 = new PassportAccountRepository$getNonPhonishAccounts$1(this, continuationImpl);
        Object obj3 = passportAccountRepository$getNonPhonishAccounts$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAccountRepository$getNonPhonishAccounts$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        PassportAccountRepository$getPortalAccounts$1 passportAccountRepository$getPortalAccounts$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof PassportAccountRepository$getPortalAccounts$1) {
            passportAccountRepository$getPortalAccounts$1 = (PassportAccountRepository$getPortalAccounts$1) continuationImpl;
            int i2 = passportAccountRepository$getPortalAccounts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAccountRepository$getPortalAccounts$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportAccountRepository$getPortalAccounts$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAccountRepository$getPortalAccounts$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Filter a2 = this.e.a(new bd90(6));
                    passportAccountRepository$getPortalAccounts$1.L$0 = null;
                    passportAccountRepository$getPortalAccounts$1.label = 1;
                    c = c(a2, passportAccountRepository$getPortalAccounts$1);
                    if (c == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a != null) {
                    return c;
                }
                gtq0.F("Unknown exception in attempt to get accounts.", null, a);
                return EmptyList.a;
            }
        }
        passportAccountRepository$getPortalAccounts$1 = new PassportAccountRepository$getPortalAccounts$1(this, continuationImpl);
        Object obj3 = passportAccountRepository$getPortalAccounts$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAccountRepository$getPortalAccounts$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a != null) {
        }
    }
}
