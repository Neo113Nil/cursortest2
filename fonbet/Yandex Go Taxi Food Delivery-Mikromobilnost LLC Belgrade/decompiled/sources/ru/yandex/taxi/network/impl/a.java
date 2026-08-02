package ru.yandex.taxi.network.impl;

import android.net.Uri;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.go.blockeduser.api.analytics.BlockedReason;
import com.yandex.go.captcha.api.AuthChallengeResult;
import com.yandex.go.captcha.c;
import com.yandex.go.captcha.g;
import defpackage.bvf0;
import defpackage.cmt;
import defpackage.cw11;
import defpackage.d5j0;
import defpackage.dvw;
import defpackage.dw11;
import defpackage.emt;
import defpackage.ens0;
import defpackage.fmt;
import defpackage.hb20;
import defpackage.hl2;
import defpackage.i38;
import defpackage.j18;
import defpackage.jk7;
import defpackage.jl40;
import defpackage.jse;
import defpackage.jst;
import defpackage.kvj0;
import defpackage.kwu;
import defpackage.ny61;
import defpackage.oeu;
import defpackage.rvj0;
import defpackage.s36;
import defpackage.s8o;
import defpackage.si3;
import defpackage.sls;
import defpackage.t36;
import defpackage.tj;
import defpackage.tje;
import defpackage.w511;
import defpackage.xf7;
import defpackage.xnt;
import defpackage.yv60;
import defpackage.zy11;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.yandex.taxi.network.api.AuthChallengeCheckResult;
import ru.yandex.taxi.network.api.RedirectCheckResult;
import ru.yandex.taxi.network.api.models.CheckType;
import ru.yandex.taxi.network.api.models.GoApiHttpException;
import ru.yandex.taxi.network.api.models.GoApiOtherException;
import ru.yandex.taxi.network.api.models.GoCheckException;
import ru.yandex.taxi.network.api.models.GoParsingException;

/* loaded from: classes9.dex */
public final class a implements cmt {
    public final Type a;
    public final xf7 b;
    public final yv60 c;
    public final sls d;
    public final jse e;
    public final jk7 f;
    public final AtomicReference g = new AtomicReference(null);

    public a(Type type, xf7 xf7Var, yv60 yv60Var, sls slsVar, jse jseVar, jk7 jk7Var) {
        this.a = type;
        this.b = xf7Var;
        this.c = yv60Var;
        this.d = slsVar;
        this.e = jseVar;
        this.f = jk7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, kvj0 kvj0Var, ContinuationImpl continuationImpl) {
        GoApiCallImpl$notifyRedirect$1 goApiCallImpl$notifyRedirect$1;
        int i;
        List list;
        aVar.getClass();
        if (continuationImpl instanceof GoApiCallImpl$notifyRedirect$1) {
            goApiCallImpl$notifyRedirect$1 = (GoApiCallImpl$notifyRedirect$1) continuationImpl;
            int i2 = goApiCallImpl$notifyRedirect$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                goApiCallImpl$notifyRedirect$1.label = i2 - Integer.MIN_VALUE;
                Object obj = goApiCallImpl$notifyRedirect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = goApiCallImpl$notifyRedirect$1.label;
                String str = null;
                if (i != 0) {
                    b.b(obj);
                    kvj0 kvj0Var2 = kvj0Var.D;
                    if (kvj0Var2 == null || kvj0Var2.w != 302) {
                        return zy11.a;
                    }
                    ru.yandex.taxi.startup.launch.a aVar2 = (ru.yandex.taxi.startup.launch.a) aVar.d.invoke();
                    kvj0 kvj0Var3 = kvj0Var.D;
                    Map e = kvj0Var3 != null ? kvj0Var3.y.e() : kotlin.collections.b.f();
                    goApiCallImpl$notifyRedirect$1.L$0 = null;
                    goApiCallImpl$notifyRedirect$1.label = 1;
                    aVar2.getClass();
                    j18 j18Var = new j18(1, dvw.b(goApiCallImpl$notifyRedirect$1));
                    j18Var.u();
                    si3 si3Var = new si3(j18Var, 1);
                    j18Var.w(new tj(5, aVar2, si3Var));
                    List list2 = (List) e.get("X-Yandex-Captcha");
                    if (jl40.l(list2 != null ? (String) kotlin.collections.a.R(list2) : null, "captcha")) {
                        List list3 = (List) e.get("Location");
                        if ((list3 != null ? (String) kotlin.collections.a.R(list3) : null) != null && (list = (List) e.get("Location".toLowerCase(Locale.ROOT))) != null) {
                            str = (String) kotlin.collections.a.R(list);
                        }
                        i38 i38Var = aVar2.c;
                        g gVar = i38Var.b;
                        if (gVar == null) {
                            si3Var.invoke(Boolean.FALSE);
                        } else if (str == null) {
                            si3Var.invoke(Boolean.FALSE);
                        } else {
                            Uri parse = Uri.parse(str);
                            if (parse == null) {
                                si3Var.invoke(Boolean.FALSE);
                            } else {
                                hb20 hb20Var = i38Var.a;
                                String host = parse.getHost();
                                if (host == null) {
                                    host = "";
                                }
                                hl2 hl2Var = hb20Var.b;
                                hl2Var.getClass();
                                hl2Var.a("Antirobot.Captcha.Redirect", new Pair(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, host));
                                i38Var.d.add(si3Var);
                                gVar.invoke(str);
                            }
                        }
                    } else {
                        si3Var.invoke(Boolean.FALSE);
                    }
                    obj = j18Var.s();
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
                throw new GoCheckException(CheckType.Captcha, ((RedirectCheckResult) obj) == RedirectCheckResult.Success);
            }
        }
        goApiCallImpl$notifyRedirect$1 = new GoApiCallImpl$notifyRedirect$1(aVar, continuationImpl);
        Object obj2 = goApiCallImpl$notifyRedirect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = goApiCallImpl$notifyRedirect$1.label;
        String str2 = null;
        if (i != 0) {
        }
        throw new GoCheckException(CheckType.Captcha, ((RedirectCheckResult) obj2) == RedirectCheckResult.Success);
    }

    @Override // defpackage.cmt
    public final Object a(Continuation continuation) {
        return e(true, continuation);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0208, code lost:
    
        if (r3 == r5) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Throwable th, boolean z, ContinuationImpl continuationImpl) {
        GoApiCallImpl$handleError$1 goApiCallImpl$handleError$1;
        Throwable goApiOtherException;
        rvj0 rvj0Var;
        InputStream byteStream;
        d5j0 d5j0Var;
        kwu kwuVar;
        boolean z2;
        Throwable th2;
        BufferedInputStream N;
        Object failure;
        s36 s36Var;
        fmt fmtVar;
        int i;
        boolean z3;
        if (continuationImpl instanceof GoApiCallImpl$handleError$1) {
            goApiCallImpl$handleError$1 = (GoApiCallImpl$handleError$1) continuationImpl;
            int i2 = goApiCallImpl$handleError$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                goApiCallImpl$handleError$1.label = i2 - Integer.MIN_VALUE;
                Object obj = goApiCallImpl$handleError$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (goApiCallImpl$handleError$1.label) {
                    case 0:
                        b.b(obj);
                        if ((th instanceof GoCheckException) || (th instanceof GoParsingException) || (th instanceof CancellationException)) {
                            goApiOtherException = th;
                        } else if (th instanceof HttpException) {
                            HttpException httpException = (HttpException) th;
                            Response response = httpException.a;
                            goApiOtherException = new GoApiHttpException(httpException.a(), new oeu(response != null ? response.a.y.e() : kotlin.collections.b.f()), (response == null || (d5j0Var = response.a.a) == null || (kwuVar = d5j0Var.a) == null) ? "" : kwuVar.i, (response == null || (rvj0Var = response.c) == null || (byteStream = rvj0Var.byteStream()) == null) ? null : byteStream instanceof BufferedInputStream ? (BufferedInputStream) byteStream : new BufferedInputStream(byteStream, 8192));
                        } else {
                            goApiOtherException = new GoApiOtherException(th);
                        }
                        if (goApiOtherException instanceof GoApiHttpException) {
                            boolean w = s8o.w(goApiOtherException);
                            sls slsVar = this.d;
                            if (w) {
                                ru.yandex.taxi.startup.launch.a aVar = (ru.yandex.taxi.startup.launch.a) slsVar.invoke();
                                GoApiHttpException goApiHttpException = (GoApiHttpException) goApiOtherException;
                                goApiCallImpl$handleError$1.L$0 = null;
                                goApiCallImpl$handleError$1.L$1 = goApiOtherException;
                                goApiCallImpl$handleError$1.Z$0 = z;
                                goApiCallImpl$handleError$1.label = 1;
                                t36 t36Var = aVar.b;
                                t36Var.getClass();
                                if (s8o.w(goApiHttpException) && (N = s8o.N(goApiHttpException)) != null) {
                                    String requestUrl = goApiHttpException.getRequestUrl();
                                    String L = s8o.L(N);
                                    if (L != null) {
                                        try {
                                            failure = (s36) ((xnt) t36Var.a).c(L, s36.Companion.serializer());
                                        } catch (Throwable th3) {
                                            failure = new Result.Failure(th3);
                                        }
                                        Throwable a = Result.a(failure);
                                        if (a != null) {
                                            jst.e.i("Cannot parse BlockedUserDto from response", a);
                                        }
                                        if (failure instanceof Result.Failure) {
                                            failure = null;
                                        }
                                        s36Var = (s36) failure;
                                    } else {
                                        s36Var = null;
                                    }
                                    t36Var.b.b(bvf0.q(s36Var, BlockedReason.HANDLE_FORBIDDEN, requestUrl));
                                }
                                if (zy11.a != obj2) {
                                    z2 = z;
                                    th2 = goApiOtherException;
                                    goApiOtherException = th2;
                                    z3 = goApiOtherException instanceof GoCheckException;
                                    if (!z3) {
                                        throw goApiOtherException;
                                    }
                                    GoCheckException goCheckException = z3 ? (GoCheckException) goApiOtherException : null;
                                    if (goCheckException == null) {
                                        throw goApiOtherException;
                                    }
                                    if (!goCheckException.getUserFinished()) {
                                        throw goApiOtherException;
                                    }
                                    goApiCallImpl$handleError$1.L$0 = null;
                                    goApiCallImpl$handleError$1.L$1 = null;
                                    goApiCallImpl$handleError$1.L$2 = null;
                                    goApiCallImpl$handleError$1.Z$0 = z2;
                                    goApiCallImpl$handleError$1.label = 6;
                                    Object e = e(true, goApiCallImpl$handleError$1);
                                    if (e != obj2) {
                                        return e;
                                    }
                                }
                            } else if (s8o.t(goApiOtherException) && z) {
                                goApiCallImpl$handleError$1.L$0 = null;
                                goApiCallImpl$handleError$1.L$1 = goApiOtherException;
                                goApiCallImpl$handleError$1.Z$0 = z;
                                goApiCallImpl$handleError$1.label = 2;
                                Object d = d((GoApiHttpException) goApiOtherException, goApiCallImpl$handleError$1);
                                if (d != obj2) {
                                    Throwable th4 = goApiOtherException;
                                    obj = d;
                                    z2 = z;
                                    th2 = th4;
                                    fmtVar = (fmt) obj;
                                    if (fmtVar != null) {
                                        return fmtVar;
                                    }
                                    goApiOtherException = th2;
                                    z3 = goApiOtherException instanceof GoCheckException;
                                    if (!z3) {
                                    }
                                }
                            } else if (s8o.y((Exception) goApiOtherException)) {
                                ru.yandex.taxi.startup.launch.a aVar2 = (ru.yandex.taxi.startup.launch.a) slsVar.invoke();
                                goApiCallImpl$handleError$1.L$0 = null;
                                goApiCallImpl$handleError$1.L$1 = goApiOtherException;
                                goApiCallImpl$handleError$1.Z$0 = z;
                                goApiCallImpl$handleError$1.label = 3;
                                aVar2.getClass();
                                j18 j18Var = new j18(1, dvw.b(goApiCallImpl$handleError$1));
                                j18Var.u();
                                si3 si3Var = new si3(j18Var, 0);
                                j18Var.w(new tj(4, aVar2, si3Var));
                                i38 i38Var = aVar2.c;
                                c cVar = i38Var.c;
                                if (cVar != null) {
                                    i38Var.e.add(si3Var);
                                    cVar.invoke();
                                } else {
                                    si3Var.invoke(AuthChallengeResult.Failure);
                                }
                                Object s = j18Var.s();
                                if (s != obj2) {
                                    Throwable th5 = goApiOtherException;
                                    obj = s;
                                    z2 = z;
                                    th2 = th5;
                                    i = emt.a[((AuthChallengeCheckResult) obj).ordinal()];
                                    if (i != 1) {
                                        goApiCallImpl$handleError$1.L$0 = null;
                                        goApiCallImpl$handleError$1.L$1 = null;
                                        goApiCallImpl$handleError$1.Z$0 = z2;
                                        goApiCallImpl$handleError$1.label = 4;
                                        Object e2 = e(true, goApiCallImpl$handleError$1);
                                        if (e2 != obj2) {
                                            return e2;
                                        }
                                    } else {
                                        if (i == 2) {
                                            throw new GoCheckException(CheckType.AuthChallenge, false);
                                        }
                                        if (i != 3) {
                                            w511.b();
                                            return null;
                                        }
                                        if (z2) {
                                            goApiCallImpl$handleError$1.L$0 = null;
                                            goApiCallImpl$handleError$1.L$1 = th2;
                                            goApiCallImpl$handleError$1.Z$0 = z2;
                                            goApiCallImpl$handleError$1.label = 5;
                                            obj = d((GoApiHttpException) th2, goApiCallImpl$handleError$1);
                                            break;
                                        }
                                        goApiOtherException = th2;
                                        z3 = goApiOtherException instanceof GoCheckException;
                                        if (!z3) {
                                        }
                                    }
                                }
                            }
                            return obj2;
                        }
                        z2 = z;
                        z3 = goApiOtherException instanceof GoCheckException;
                        if (!z3) {
                        }
                        break;
                    case 1:
                        z2 = goApiCallImpl$handleError$1.Z$0;
                        th2 = (Throwable) goApiCallImpl$handleError$1.L$1;
                        b.b(obj);
                        goApiOtherException = th2;
                        z3 = goApiOtherException instanceof GoCheckException;
                        if (!z3) {
                        }
                        break;
                    case 2:
                        z2 = goApiCallImpl$handleError$1.Z$0;
                        th2 = (Throwable) goApiCallImpl$handleError$1.L$1;
                        b.b(obj);
                        fmtVar = (fmt) obj;
                        if (fmtVar != null) {
                        }
                        goApiOtherException = th2;
                        z3 = goApiOtherException instanceof GoCheckException;
                        if (!z3) {
                        }
                        break;
                    case 3:
                        z2 = goApiCallImpl$handleError$1.Z$0;
                        th2 = (Throwable) goApiCallImpl$handleError$1.L$1;
                        b.b(obj);
                        i = emt.a[((AuthChallengeCheckResult) obj).ordinal()];
                        if (i != 1) {
                        }
                        return obj2;
                    case 4:
                        b.b(obj);
                        return obj;
                    case 5:
                        z2 = goApiCallImpl$handleError$1.Z$0;
                        th2 = (Throwable) goApiCallImpl$handleError$1.L$1;
                        b.b(obj);
                        fmt fmtVar2 = (fmt) obj;
                        if (fmtVar2 != null) {
                            return fmtVar2;
                        }
                        goApiOtherException = th2;
                        z3 = goApiOtherException instanceof GoCheckException;
                        if (!z3) {
                        }
                        break;
                    case 6:
                        b.b(obj);
                        return obj;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        goApiCallImpl$handleError$1 = new GoApiCallImpl$handleError$1(this, continuationImpl);
        Object obj3 = goApiCallImpl$handleError$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (goApiCallImpl$handleError$1.label) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r5.a(r8, r7) == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(GoApiHttpException goApiHttpException, ContinuationImpl continuationImpl) {
        GoApiCallImpl$refreshToken$1 goApiCallImpl$refreshToken$1;
        int i;
        cw11 cw11Var;
        if (continuationImpl instanceof GoApiCallImpl$refreshToken$1) {
            goApiCallImpl$refreshToken$1 = (GoApiCallImpl$refreshToken$1) continuationImpl;
            int i2 = goApiCallImpl$refreshToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                goApiCallImpl$refreshToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = goApiCallImpl$refreshToken$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = goApiCallImpl$refreshToken$1.label;
                if (i != 0) {
                    b.b(obj);
                    cw11 cw11Var2 = (cw11) goApiCallImpl$refreshToken$1.get_context().get(cw11.c);
                    if (cw11Var2 == null) {
                        cw11Var2 = dw11.a;
                    }
                    cw11Var = cw11Var2;
                    if (cw11Var.a) {
                        String str = (String) this.g.get();
                        if (str != null) {
                            ru.yandex.taxi.startup.launch.a aVar = (ru.yandex.taxi.startup.launch.a) this.d.invoke();
                            goApiCallImpl$refreshToken$1.L$0 = null;
                            goApiCallImpl$refreshToken$1.L$1 = cw11Var;
                            goApiCallImpl$refreshToken$1.L$2 = null;
                            goApiCallImpl$refreshToken$1.label = 1;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return obj;
                }
                cw11Var = (cw11) goApiCallImpl$refreshToken$1.L$1;
                b.b(obj);
                if (cw11Var.b) {
                    goApiCallImpl$refreshToken$1.L$0 = null;
                    goApiCallImpl$refreshToken$1.L$1 = null;
                    goApiCallImpl$refreshToken$1.L$2 = null;
                    goApiCallImpl$refreshToken$1.label = 2;
                    Object e = e(false, goApiCallImpl$refreshToken$1);
                    return e == obj2 ? obj2 : e;
                }
                return null;
            }
        }
        goApiCallImpl$refreshToken$1 = new GoApiCallImpl$refreshToken$1(this, continuationImpl);
        Object obj3 = goApiCallImpl$refreshToken$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = goApiCallImpl$refreshToken$1.label;
        if (i != 0) {
        }
        if (cw11Var.b) {
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(5:22|23|(1:25)(1:30)|26|(2:28|29))|19|20))|34|6|7|(0)(0)|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003b, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        r0.L$0 = null;
        r0.Z$0 = r7;
        r0.label = 2;
        r8 = c(r8, r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        if (r8 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(boolean z, Continuation continuation) {
        GoApiCallImpl$requestInternal$1 goApiCallImpl$requestInternal$1;
        int i;
        if (continuation instanceof GoApiCallImpl$requestInternal$1) {
            goApiCallImpl$requestInternal$1 = (GoApiCallImpl$requestInternal$1) continuation;
            int i2 = goApiCallImpl$requestInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                goApiCallImpl$requestInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = goApiCallImpl$requestInternal$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = goApiCallImpl$requestInternal$1.label;
                if (i != 0) {
                    b.b(obj);
                    goApiCallImpl$requestInternal$1.Z$0 = z;
                    goApiCallImpl$requestInternal$1.label = 1;
                    obj = tje.k0(goApiCallImpl$requestInternal$1.get_context().get(ens0.a) != null ? EmptyCoroutineContext.a : this.e, new GoApiCallImpl$executeRequest$2(this, null), goApiCallImpl$requestInternal$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return (fmt) obj;
                    }
                    z = goApiCallImpl$requestInternal$1.Z$0;
                    b.b(obj);
                }
                return (fmt) obj;
            }
        }
        goApiCallImpl$requestInternal$1 = new GoApiCallImpl$requestInternal$1(this, continuation);
        Object obj3 = goApiCallImpl$requestInternal$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = goApiCallImpl$requestInternal$1.label;
        if (i != 0) {
        }
        return (fmt) obj3;
    }
}
