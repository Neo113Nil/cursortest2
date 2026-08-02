package ru.yandex.taxi.superapp;

import android.net.Uri;
import com.yandex.go.account.api.superapp.CookieInjectionEvent;
import com.yandex.go.account.api.superapp.CookieInjectionResult$Failure$Reason;
import com.yandex.passport.api.k2;
import defpackage.ene;
import defpackage.ep90;
import defpackage.fne;
import defpackage.g050;
import defpackage.jst;
import defpackage.nne;
import defpackage.ny61;
import defpackage.one;
import defpackage.rrb1;
import defpackage.tls;
import defpackage.u02;
import defpackage.zp7;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class f {
    public final u02 a;
    public final ru.yandex.taxi.am.k b;
    public final ep90 c;
    public final AtomicReference d = new AtomicReference();

    public f(u02 u02Var, ep90 ep90Var, ru.yandex.taxi.am.k kVar) {
        this.a = u02Var;
        this.b = kVar;
        this.c = ep90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(k2 k2Var, String str, ContinuationImpl continuationImpl) {
        CookiesInjector$ensureCookie$1 cookiesInjector$ensureCookie$1;
        int i;
        Object m;
        Throwable a;
        if (continuationImpl instanceof CookiesInjector$ensureCookie$1) {
            cookiesInjector$ensureCookie$1 = (CookiesInjector$ensureCookie$1) continuationImpl;
            int i2 = cookiesInjector$ensureCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cookiesInjector$ensureCookie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cookiesInjector$ensureCookie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cookiesInjector$ensureCookie$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jst.e.n("EatsKitDelegates.Main ensuring cookies...");
                    com.yandex.passport.api.b a2 = this.c.a();
                    cookiesInjector$ensureCookie$1.L$0 = null;
                    cookiesInjector$ensureCookie$1.L$1 = null;
                    cookiesInjector$ensureCookie$1.label = 1;
                    m = a2.m(k2Var, str, cookiesInjector$ensureCookie$1);
                    if (m == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    m = ((Result) obj).getValue();
                }
                if (!(m instanceof Result.Failure)) {
                    jst.e.n("EatsKitDelegates.Main cookies ensured");
                }
                a = Result.a(m);
                if (a != null) {
                    jst.e.g("CookiesInjector", "CookiesInjector", "EatsKitDelegates.Main cookies ensuring failed", a);
                }
                return m;
            }
        }
        cookiesInjector$ensureCookie$1 = new CookiesInjector$ensureCookie$1(this, continuationImpl);
        Object obj2 = cookiesInjector$ensureCookie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cookiesInjector$ensureCookie$1.label;
        if (i != 0) {
        }
        if (!(m instanceof Result.Failure)) {
        }
        a = Result.a(m);
        if (a != null) {
        }
        return m;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(6:(2:3|(7:5|6|7|(1:(10:65|(1:(1:(11:69|70|44|45|(1:47)|48|(1:50)|51|(1:53)(1:56)|54|55)(2:71|72))(2:73|74))(2:77|78)|75|32|33|(1:35)|36|(1:38)|39|(3:41|(10:43|44|45|(0)|48|(0)|51|(0)(0)|54|55)|30)(9:57|45|(0)|48|(0)|51|(0)(0)|54|55))(1:10))(2:81|(2:83|84)(2:85|(2:87|88)(3:89|(1:91)|30)))|11|12|(2:19|(3:21|22|23)(3:24|(2:58|(7:60|33|(0)|36|(0)|39|(0)(0)))(2:27|(1:29)(8:31|32|33|(0)|36|(0)|39|(0)(0)))|30))(3:15|16|17)))|11|12|(0)|19|(0)(0))|93|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0061, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x016d A[Catch: all -> 0x0162, TRY_LEAVE, TryCatch #1 {all -> 0x0162, blocks: (B:12:0x0151, B:15:0x0159, B:19:0x0166, B:21:0x016d, B:24:0x017f, B:27:0x0188, B:58:0x01b3), top: B:11:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x017f A[Catch: all -> 0x0162, TRY_ENTER, TryCatch #1 {all -> 0x0162, blocks: (B:12:0x0151, B:15:0x0159, B:19:0x0166, B:21:0x016d, B:24:0x017f, B:27:0x0188, B:58:0x01b3), top: B:11:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01dc A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:70:0x0056, B:45:0x0241, B:47:0x0245, B:48:0x024b, B:50:0x0251, B:51:0x0254, B:53:0x025a, B:56:0x025d, B:33:0x01d8, B:35:0x01dc, B:36:0x01e4, B:38:0x01ea, B:39:0x01ef, B:41:0x01f5, B:57:0x023c), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ea A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:70:0x0056, B:45:0x0241, B:47:0x0245, B:48:0x024b, B:50:0x0251, B:51:0x0254, B:53:0x025a, B:56:0x025d, B:33:0x01d8, B:35:0x01dc, B:36:0x01e4, B:38:0x01ea, B:39:0x01ef, B:41:0x01f5, B:57:0x023c), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f5 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:70:0x0056, B:45:0x0241, B:47:0x0245, B:48:0x024b, B:50:0x0251, B:51:0x0254, B:53:0x025a, B:56:0x025d, B:33:0x01d8, B:35:0x01dc, B:36:0x01e4, B:38:0x01ea, B:39:0x01ef, B:41:0x01f5, B:57:0x023c), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0245 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:70:0x0056, B:45:0x0241, B:47:0x0245, B:48:0x024b, B:50:0x0251, B:51:0x0254, B:53:0x025a, B:56:0x025d, B:33:0x01d8, B:35:0x01dc, B:36:0x01e4, B:38:0x01ea, B:39:0x01ef, B:41:0x01f5, B:57:0x023c), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0251 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:70:0x0056, B:45:0x0241, B:47:0x0245, B:48:0x024b, B:50:0x0251, B:51:0x0254, B:53:0x025a, B:56:0x025d, B:33:0x01d8, B:35:0x01dc, B:36:0x01e4, B:38:0x01ea, B:39:0x01ef, B:41:0x01f5, B:57:0x023c), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x025a A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:70:0x0056, B:45:0x0241, B:47:0x0245, B:48:0x024b, B:50:0x0251, B:51:0x0254, B:53:0x025a, B:56:0x025d, B:33:0x01d8, B:35:0x01dc, B:36:0x01e4, B:38:0x01ea, B:39:0x01ef, B:41:0x01f5, B:57:0x023c), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x025d A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:70:0x0056, B:45:0x0241, B:47:0x0245, B:48:0x024b, B:50:0x0251, B:51:0x0254, B:53:0x025a, B:56:0x025d, B:33:0x01d8, B:35:0x01dc, B:36:0x01e4, B:38:0x01ea, B:39:0x01ef, B:41:0x01f5, B:57:0x023c), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x023c A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:70:0x0056, B:45:0x0241, B:47:0x0245, B:48:0x024b, B:50:0x0251, B:51:0x0254, B:53:0x025a, B:56:0x025d, B:33:0x01d8, B:35:0x01dc, B:36:0x01e4, B:38:0x01ea, B:39:0x01ef, B:41:0x01f5, B:57:0x023c), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r12v16, types: [g050] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object, ru.yandex.taxi.superapp.f] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, boolean z, boolean z2, tls tlsVar, ContinuationImpl continuationImpl) {
        CookiesInjector$inject$1 cookiesInjector$inject$1;
        int i;
        Uri parse;
        String host;
        nne a;
        kotlinx.coroutines.sync.a a2;
        tls tlsVar2;
        boolean z3;
        boolean z4;
        one oneVar;
        nne nneVar;
        g050 g050Var;
        Object obj;
        Throwable a3;
        nne nneVar2;
        Uri uri;
        boolean z5;
        Object obj2;
        Throwable a4;
        tls tlsVar3;
        kotlinx.coroutines.sync.a aVar;
        boolean z6;
        Result result;
        ?? r2 = "CookiesInjector";
        try {
            if (continuationImpl instanceof CookiesInjector$inject$1) {
                cookiesInjector$inject$1 = (CookiesInjector$inject$1) continuationImpl;
                int i2 = cookiesInjector$inject$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cookiesInjector$inject$1.label = i2 - Integer.MIN_VALUE;
                    Object obj3 = cookiesInjector$inject$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = cookiesInjector$inject$1.label;
                    Object obj4 = fne.a;
                    ?? r7 = 3;
                    int i3 = 1;
                    if (i != 0) {
                        kotlin.b.b(obj3);
                        if (this.b.Mg()) {
                            jst.e.n("EatsKitDelegates.Main skip updating cookies for phonish profile");
                            return new ene(CookieInjectionResult$Failure$Reason.UNSUPPORTED_ACCOUNT_TYPE);
                        }
                        parse = Uri.parse(str);
                        host = parse.getHost();
                        if (host == null) {
                            return new ene(CookieInjectionResult$Failure$Reason.MALFORMED_URL);
                        }
                        one oneVar2 = (one) this.d.updateAndGet(new zp7(i3, this));
                        a = oneVar2.a(host);
                        a2 = a.a();
                        cookiesInjector$inject$1.L$0 = null;
                        tlsVar2 = tlsVar;
                        cookiesInjector$inject$1.L$1 = tlsVar2;
                        cookiesInjector$inject$1.L$2 = parse;
                        cookiesInjector$inject$1.L$3 = host;
                        cookiesInjector$inject$1.L$4 = oneVar2;
                        cookiesInjector$inject$1.L$5 = a;
                        cookiesInjector$inject$1.L$6 = a2;
                        z3 = z;
                        cookiesInjector$inject$1.Z$0 = z3;
                        z4 = z2;
                        cookiesInjector$inject$1.Z$1 = z4;
                        cookiesInjector$inject$1.label = 1;
                        if (a2.a(cookiesInjector$inject$1) != coroutineSingletons) {
                            oneVar = oneVar2;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        try {
                            if (i == 2) {
                                z6 = cookiesInjector$inject$1.Z$1;
                                z5 = cookiesInjector$inject$1.Z$0;
                                g050 g050Var2 = (g050) cookiesInjector$inject$1.L$6;
                                nneVar = (nne) cookiesInjector$inject$1.L$5;
                                oneVar = (one) cookiesInjector$inject$1.L$4;
                                uri = (Uri) cookiesInjector$inject$1.L$2;
                                tlsVar3 = (tls) cookiesInjector$inject$1.L$1;
                                kotlin.b.b(obj3);
                                result = (Result) obj3;
                                r7 = g050Var2;
                            } else {
                                if (i != 3) {
                                    if (i != 4) {
                                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    g050Var = (g050) cookiesInjector$inject$1.L$6;
                                    nneVar2 = (nne) cookiesInjector$inject$1.L$5;
                                    kotlin.b.b(obj3);
                                    obj = ((Result) obj3).getValue();
                                    nneVar = nneVar2;
                                    if (!(obj instanceof Result.Failure)) {
                                        nneVar.d();
                                    }
                                    if (Result.a(obj) != null) {
                                        nneVar.e();
                                    }
                                    a3 = Result.a(obj);
                                    if (a3 == null) {
                                    } else {
                                        obj4 = new ene(rrb1.b(a3));
                                    }
                                    g050Var.d(null);
                                    return obj4;
                                }
                                z6 = cookiesInjector$inject$1.Z$1;
                                z5 = cookiesInjector$inject$1.Z$0;
                                g050 g050Var3 = (g050) cookiesInjector$inject$1.L$6;
                                nneVar = (nne) cookiesInjector$inject$1.L$5;
                                oneVar = (one) cookiesInjector$inject$1.L$4;
                                uri = (Uri) cookiesInjector$inject$1.L$2;
                                tlsVar3 = (tls) cookiesInjector$inject$1.L$1;
                                kotlin.b.b(obj3);
                                result = (Result) obj3;
                                r7 = g050Var3;
                            }
                            obj2 = result.getValue();
                            aVar = r7;
                            tlsVar2 = tlsVar3;
                            z4 = z6;
                            g050Var = aVar;
                            if (!(obj2 instanceof Result.Failure)) {
                                tlsVar2.invoke(CookieInjectionEvent.UPDATE_COMPLETED);
                            }
                            if (Result.a(obj2) != null) {
                                tlsVar2.invoke(CookieInjectionEvent.UPDATE_FAILED);
                            }
                            a4 = Result.a(obj2);
                            if (a4 != null) {
                                obj = new Result.Failure(a4);
                                if (!(obj instanceof Result.Failure)) {
                                }
                                if (Result.a(obj) != null) {
                                }
                                a3 = Result.a(obj);
                                if (a3 == null) {
                                }
                                g050Var.d(null);
                                return obj4;
                            }
                            k2 b = oneVar.b();
                            String uri2 = uri.buildUpon().clearQuery().path("").fragment(null).build().toString();
                            cookiesInjector$inject$1.L$0 = null;
                            cookiesInjector$inject$1.L$1 = null;
                            cookiesInjector$inject$1.L$2 = null;
                            cookiesInjector$inject$1.L$3 = null;
                            cookiesInjector$inject$1.L$4 = null;
                            cookiesInjector$inject$1.L$5 = nneVar;
                            cookiesInjector$inject$1.L$6 = g050Var;
                            cookiesInjector$inject$1.L$7 = null;
                            cookiesInjector$inject$1.L$8 = null;
                            cookiesInjector$inject$1.L$9 = null;
                            cookiesInjector$inject$1.L$10 = null;
                            cookiesInjector$inject$1.Z$0 = z5;
                            cookiesInjector$inject$1.Z$1 = z4;
                            cookiesInjector$inject$1.label = 4;
                            obj = c(b, uri2, cookiesInjector$inject$1);
                            if (obj != coroutineSingletons) {
                                nneVar2 = nneVar;
                                nneVar = nneVar2;
                                if (!(obj instanceof Result.Failure)) {
                                }
                                if (Result.a(obj) != null) {
                                }
                                a3 = Result.a(obj);
                                if (a3 == null) {
                                }
                                g050Var.d(null);
                                return obj4;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th) {
                            th = th;
                            r2 = r7;
                            r2.d(null);
                            throw th;
                        }
                    }
                    boolean z7 = cookiesInjector$inject$1.Z$1;
                    boolean z8 = cookiesInjector$inject$1.Z$0;
                    ?? r12 = (g050) cookiesInjector$inject$1.L$6;
                    nne nneVar3 = (nne) cookiesInjector$inject$1.L$5;
                    one oneVar3 = (one) cookiesInjector$inject$1.L$4;
                    host = (String) cookiesInjector$inject$1.L$3;
                    Uri uri3 = (Uri) cookiesInjector$inject$1.L$2;
                    tls tlsVar4 = (tls) cookiesInjector$inject$1.L$1;
                    kotlin.b.b(obj3);
                    parse = uri3;
                    tlsVar2 = tlsVar4;
                    a2 = r12;
                    a = nneVar3;
                    z4 = z7;
                    z3 = z8;
                    oneVar = oneVar3;
                    if (!a.c() && !z3) {
                        tlsVar2.invoke(CookieInjectionEvent.ALREADY_INJECTED);
                        a2.d(null);
                        return obj4;
                    }
                    if (a.b() < 4) {
                        jst.e.f("CookiesInjector", "CookiesInjector", "EatsKitDelegates.Main no more update cookies attempts left");
                        ene eneVar = new ene(CookieInjectionResult$Failure$Reason.ATTEMPTS_LIMIT_REACHED);
                        a2.d(null);
                        return eneVar;
                    }
                    tlsVar2.invoke(CookieInjectionEvent.UPDATE_STARTED);
                    if (!z4 || z3) {
                        k2 b2 = oneVar.b();
                        cookiesInjector$inject$1.L$0 = null;
                        cookiesInjector$inject$1.L$1 = tlsVar2;
                        cookiesInjector$inject$1.L$2 = parse;
                        cookiesInjector$inject$1.L$3 = null;
                        cookiesInjector$inject$1.L$4 = oneVar;
                        cookiesInjector$inject$1.L$5 = a;
                        cookiesInjector$inject$1.L$6 = a2;
                        cookiesInjector$inject$1.Z$0 = z3;
                        cookiesInjector$inject$1.Z$1 = z4;
                        cookiesInjector$inject$1.label = 3;
                        Object d = d(b2, host, cookiesInjector$inject$1);
                        if (d != coroutineSingletons) {
                            z5 = z3;
                            uri = parse;
                            obj2 = d;
                            g050Var = a2;
                            nneVar = a;
                            if (!(obj2 instanceof Result.Failure)) {
                            }
                            if (Result.a(obj2) != null) {
                            }
                            a4 = Result.a(obj2);
                            if (a4 != null) {
                            }
                        }
                    } else {
                        k2 b3 = oneVar.b();
                        cookiesInjector$inject$1.L$0 = null;
                        cookiesInjector$inject$1.L$1 = tlsVar2;
                        cookiesInjector$inject$1.L$2 = parse;
                        cookiesInjector$inject$1.L$3 = null;
                        cookiesInjector$inject$1.L$4 = oneVar;
                        cookiesInjector$inject$1.L$5 = a;
                        cookiesInjector$inject$1.L$6 = a2;
                        cookiesInjector$inject$1.Z$0 = z3;
                        cookiesInjector$inject$1.Z$1 = z4;
                        cookiesInjector$inject$1.label = 2;
                        Object a5 = a(b3, host, cookiesInjector$inject$1);
                        if (a5 != coroutineSingletons) {
                            kotlinx.coroutines.sync.a aVar2 = a2;
                            nneVar = a;
                            aVar = aVar2;
                            z5 = z3;
                            uri = parse;
                            obj2 = a5;
                            z6 = z4;
                            tlsVar3 = tlsVar2;
                            tlsVar2 = tlsVar3;
                            z4 = z6;
                            g050Var = aVar;
                            if (!(obj2 instanceof Result.Failure)) {
                            }
                            if (Result.a(obj2) != null) {
                            }
                            a4 = Result.a(obj2);
                            if (a4 != null) {
                            }
                        }
                    }
                    return coroutineSingletons;
                }
            }
            if (!a.c()) {
            }
            if (a.b() < 4) {
            }
        } catch (Throwable th2) {
            th = th2;
            r2 = a2;
            r2.d(null);
            throw th;
        }
        cookiesInjector$inject$1 = new CookiesInjector$inject$1(this, continuationImpl);
        Object obj32 = cookiesInjector$inject$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cookiesInjector$inject$1.label;
        Object obj42 = fne.a;
        ?? r72 = 3;
        int i32 = 1;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(k2 k2Var, String str, ContinuationImpl continuationImpl) {
        CookiesInjector$injectCookie$1 cookiesInjector$injectCookie$1;
        int i;
        Object d;
        Throwable a;
        if (continuationImpl instanceof CookiesInjector$injectCookie$1) {
            cookiesInjector$injectCookie$1 = (CookiesInjector$injectCookie$1) continuationImpl;
            int i2 = cookiesInjector$injectCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cookiesInjector$injectCookie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cookiesInjector$injectCookie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cookiesInjector$injectCookie$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jst.e.n("EatsKitDelegates.Main injecting cookies...");
                    com.yandex.passport.api.b a2 = this.c.a();
                    cookiesInjector$injectCookie$1.L$0 = null;
                    cookiesInjector$injectCookie$1.L$1 = null;
                    cookiesInjector$injectCookie$1.label = 1;
                    d = a2.d(k2Var, str, cookiesInjector$injectCookie$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                if (!(d instanceof Result.Failure)) {
                    jst.e.n("EatsKitDelegates.Main cookies injected");
                }
                a = Result.a(d);
                if (a != null) {
                    jst.e.g("CookiesInjector", "CookiesInjector", "EatsKitDelegates.Main cookies injection failed", a);
                }
                return d;
            }
        }
        cookiesInjector$injectCookie$1 = new CookiesInjector$injectCookie$1(this, continuationImpl);
        Object obj2 = cookiesInjector$injectCookie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cookiesInjector$injectCookie$1.label;
        if (i != 0) {
        }
        if (!(d instanceof Result.Failure)) {
        }
        a = Result.a(d);
        if (a != null) {
        }
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(k2 k2Var, String str, ContinuationImpl continuationImpl) {
        CookiesInjector$updateCookie$1 cookiesInjector$updateCookie$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof CookiesInjector$updateCookie$1) {
            cookiesInjector$updateCookie$1 = (CookiesInjector$updateCookie$1) continuationImpl;
            int i2 = cookiesInjector$updateCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cookiesInjector$updateCookie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cookiesInjector$updateCookie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cookiesInjector$updateCookie$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jst.e.n("EatsKitDelegates.Main updating cookies...");
                    com.yandex.passport.api.b a2 = this.c.a();
                    cookiesInjector$updateCookie$1.L$0 = null;
                    cookiesInjector$updateCookie$1.L$1 = null;
                    cookiesInjector$updateCookie$1.label = 1;
                    c = a2.c(k2Var, str, cookiesInjector$updateCookie$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                if (!(c instanceof Result.Failure)) {
                    jst.e.n("EatsKitDelegates.Main cookies updated");
                }
                a = Result.a(c);
                if (a != null) {
                    jst.e.g("CookiesInjector", "CookiesInjector", "EatsKitDelegates.Main cookies update failed", a);
                }
                return c;
            }
        }
        cookiesInjector$updateCookie$1 = new CookiesInjector$updateCookie$1(this, continuationImpl);
        Object obj2 = cookiesInjector$updateCookie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cookiesInjector$updateCookie$1.label;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
        a = Result.a(c);
        if (a != null) {
        }
        return c;
    }
}
