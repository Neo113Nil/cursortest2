package ru.yandex.taxi.am;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.exception.PassportFailedResponseException;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import defpackage.ep90;
import defpackage.evu0;
import defpackage.fhz;
import defpackage.fl3;
import defpackage.gtq0;
import defpackage.hhz;
import defpackage.jst;
import defpackage.kj;
import defpackage.ny61;
import defpackage.rx2;
import defpackage.u02;
import defpackage.zy11;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;

/* loaded from: classes9.dex */
public final class y {
    public final k a;
    public final u02 b;
    public final g c;
    public final ru.yandex.taxi.am.token.a d;
    public final ru.yandex.taxi.am.internal.d e;
    public final ep90 f;
    public final fhz g;

    public y(k kVar, u02 u02Var, g gVar, ru.yandex.taxi.am.token.a aVar, ru.yandex.taxi.am.internal.d dVar, ep90 ep90Var, fhz fhzVar) {
        this.a = kVar;
        this.b = u02Var;
        this.c = gVar;
        this.d = aVar;
        this.e = dVar;
        this.f = ep90Var;
        this.g = fhzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kj kjVar, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, ContinuationImpl continuationImpl) {
        InternalLinkAccountRouter$authorizePortalUser$1 internalLinkAccountRouter$authorizePortalUser$1;
        int i;
        Object d;
        if (continuationImpl instanceof InternalLinkAccountRouter$authorizePortalUser$1) {
            internalLinkAccountRouter$authorizePortalUser$1 = (InternalLinkAccountRouter$authorizePortalUser$1) continuationImpl;
            int i2 = internalLinkAccountRouter$authorizePortalUser$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                internalLinkAccountRouter$authorizePortalUser$1.label = i2 - Integer.MIN_VALUE;
                Object obj = internalLinkAccountRouter$authorizePortalUser$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = internalLinkAccountRouter$authorizePortalUser$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.a.x.a.q(kjVar.a, "uid");
                    internalLinkAccountRouter$authorizePortalUser$1.L$0 = kjVar;
                    internalLinkAccountRouter$authorizePortalUser$1.L$1 = events$Zalogin$LinkageContext;
                    internalLinkAccountRouter$authorizePortalUser$1.label = 1;
                    d = this.d.d(false, internalLinkAccountRouter$authorizePortalUser$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    events$Zalogin$LinkageContext = (Events$Zalogin$LinkageContext) internalLinkAccountRouter$authorizePortalUser$1.L$1;
                    kjVar = (kj) internalLinkAccountRouter$authorizePortalUser$1.L$0;
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                if (!(d instanceof Result.Failure)) {
                    boolean J = evu0.J((String) d);
                    boolean z = !J;
                    if (!J) {
                        jst.e.getClass();
                        fhz fhzVar = this.g;
                        rx2 rx2Var = fhzVar.e;
                        String name = events$Zalogin$LinkageContext.name();
                        long j = fhzVar.b.x.a().a;
                        long j2 = kjVar.a;
                        Long valueOf = Long.valueOf(j);
                        Long valueOf2 = Long.valueOf(j2);
                        rx2Var.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("phone_uid", valueOf);
                        hashMap.put("portal_uid", valueOf2);
                        if (name != null) {
                            hashMap.put("context", name);
                        }
                        rx2Var.a.a("Zalogin.LinkSuccess", hashMap, 1, new HashMap());
                        g gVar = this.c;
                        hhz hhzVar = gVar.g;
                        hhzVar.getClass();
                        hhzVar.a.a("LOGIN: TrackAuthToken setPortalAccount", new HashMap(), 1, new HashMap());
                        gVar.a.Pg(kjVar);
                        gVar.h.a.g(kjVar);
                        gVar.d.a();
                        m mVar = gVar.f;
                        long j3 = kjVar.a;
                        kotlinx.coroutines.flow.r0 r0Var = mVar.e;
                        fl3 fl3Var = new fl3(j3);
                        r0Var.getClass();
                        r0Var.m(null, fl3Var);
                    }
                    d = Boolean.valueOf(z);
                }
                Boolean bool = (Boolean) (d instanceof Result.Failure ? null : d);
                return Boolean.valueOf(bool == null ? bool.booleanValue() : false);
            }
        }
        internalLinkAccountRouter$authorizePortalUser$1 = new InternalLinkAccountRouter$authorizePortalUser$1(this, continuationImpl);
        Object obj2 = internalLinkAccountRouter$authorizePortalUser$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = internalLinkAccountRouter$authorizePortalUser$1.label;
        if (i != 0) {
        }
        if (!(d instanceof Result.Failure)) {
        }
        Boolean bool2 = (Boolean) (d instanceof Result.Failure ? null : d);
        return Boolean.valueOf(bool2 == null ? bool2.booleanValue() : false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(7:11|12|13|14|(3:19|20|(1:22)(1:23))|16|17)(2:26|27))(2:28|29))(3:37|38|(2:40|34))|30|(1:32)(2:35|36)))|45|6|7|(0)(0)|30|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r7 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0040, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
    
        r7 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072 A[Catch: Exception -> 0x0040, CancellationException -> 0x00c9, TryCatch #3 {CancellationException -> 0x00c9, Exception -> 0x0040, blocks: (B:12:0x0036, B:13:0x0088, B:29:0x0051, B:30:0x0067, B:32:0x0072, B:35:0x0091, B:36:0x009b, B:38:0x0058), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091 A[Catch: Exception -> 0x0040, CancellationException -> 0x00c9, TryCatch #3 {CancellationException -> 0x00c9, Exception -> 0x0040, blocks: (B:12:0x0036, B:13:0x0088, B:29:0x0051, B:30:0x0067, B:32:0x0072, B:35:0x0091, B:36:0x009b, B:38:0x0058), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(Throwable th, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, ContinuationImpl continuationImpl) {
        InternalLinkAccountRouter$checkOtherPortalAccounts$1 internalLinkAccountRouter$checkOtherPortalAccounts$1;
        int i;
        List list;
        Object e;
        if (continuationImpl instanceof InternalLinkAccountRouter$checkOtherPortalAccounts$1) {
            internalLinkAccountRouter$checkOtherPortalAccounts$1 = (InternalLinkAccountRouter$checkOtherPortalAccounts$1) continuationImpl;
            int i2 = internalLinkAccountRouter$checkOtherPortalAccounts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                internalLinkAccountRouter$checkOtherPortalAccounts$1.label = i2 - Integer.MIN_VALUE;
                Object obj = internalLinkAccountRouter$checkOtherPortalAccounts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = internalLinkAccountRouter$checkOtherPortalAccounts$1.label;
                fhz fhzVar = this.g;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.am.internal.d dVar = this.e;
                    internalLinkAccountRouter$checkOtherPortalAccounts$1.L$0 = th;
                    internalLinkAccountRouter$checkOtherPortalAccounts$1.L$1 = events$Zalogin$LinkageContext;
                    internalLinkAccountRouter$checkOtherPortalAccounts$1.label = 1;
                    obj = dVar.h(internalLinkAccountRouter$checkOtherPortalAccounts$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        events$Zalogin$LinkageContext = (Events$Zalogin$LinkageContext) internalLinkAccountRouter$checkOtherPortalAccounts$1.L$1;
                        kotlin.b.b(obj);
                        e = ((Result) obj).getValue();
                        kotlin.b.b(e);
                        Serializable failure = (Boolean) e;
                        failure.getClass();
                        Throwable a = Result.a(failure);
                        if (a != null) {
                            try {
                                if (!(a instanceof PassportRuntimeUnknownException)) {
                                    throw a;
                                }
                                jst.e.k(a, "Error after checking other portal accounts after failed linkage");
                                fhzVar.g(null, events$Zalogin$LinkageContext, a.getMessage());
                                failure = Boolean.FALSE;
                            } catch (Throwable th2) {
                                failure = new Result.Failure(th2);
                            }
                        }
                        return failure;
                    }
                    events$Zalogin$LinkageContext = (Events$Zalogin$LinkageContext) internalLinkAccountRouter$checkOtherPortalAccounts$1.L$1;
                    th = (Throwable) internalLinkAccountRouter$checkOtherPortalAccounts$1.L$0;
                    kotlin.b.b(obj);
                }
                list = (List) obj;
                if (!list.isEmpty()) {
                    fhzVar.g(null, events$Zalogin$LinkageContext, "Linkage failed, no other accounts while handle PassportAccountNotFoundException");
                    throw new Exception(th) { // from class: ru.yandex.taxi.am.InternalLinkAccountRouter$NoLinkableAccountsException
                    };
                }
                kj kjVar = (kj) list.get(0);
                internalLinkAccountRouter$checkOtherPortalAccounts$1.L$0 = null;
                internalLinkAccountRouter$checkOtherPortalAccounts$1.L$1 = events$Zalogin$LinkageContext;
                internalLinkAccountRouter$checkOtherPortalAccounts$1.L$2 = null;
                internalLinkAccountRouter$checkOtherPortalAccounts$1.label = 2;
                e = e(kjVar, events$Zalogin$LinkageContext, internalLinkAccountRouter$checkOtherPortalAccounts$1);
            }
        }
        internalLinkAccountRouter$checkOtherPortalAccounts$1 = new InternalLinkAccountRouter$checkOtherPortalAccounts$1(this, continuationImpl);
        Object obj2 = internalLinkAccountRouter$checkOtherPortalAccounts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = internalLinkAccountRouter$checkOtherPortalAccounts$1.label;
        fhz fhzVar2 = this.g;
        if (i != 0) {
        }
        list = (List) obj2;
        if (!list.isEmpty()) {
        }
    }

    public final Object c(PassportAccountNotAuthorizedException passportAccountNotAuthorizedException, Continuation continuation) {
        PassportUidImpl a = passportAccountNotAuthorizedException.a();
        if (a != null) {
            jst.e.p(String.format("Get linkage candidate account from exception with uid %d", Arrays.copyOf(new Object[]{new Long(a.getValue())}, 1)), passportAccountNotAuthorizedException);
            return this.e.a(a, (ContinuationImpl) continuation);
        }
        jst.e.p("Get linkage candidate account from exception with null uid", passportAccountNotAuthorizedException);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #0 {all -> 0x0084, blocks: (B:12:0x002f, B:13:0x0077, B:14:0x007f, B:23:0x0060, B:25:0x0068), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(kj kjVar, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, ContinuationImpl continuationImpl) {
        InternalLinkAccountRouter$linkAccount$1 internalLinkAccountRouter$linkAccount$1;
        int i;
        Object e;
        boolean z;
        try {
            if (continuationImpl instanceof InternalLinkAccountRouter$linkAccount$1) {
                internalLinkAccountRouter$linkAccount$1 = (InternalLinkAccountRouter$linkAccount$1) continuationImpl;
                int i2 = internalLinkAccountRouter$linkAccount$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    internalLinkAccountRouter$linkAccount$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = internalLinkAccountRouter$linkAccount$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = internalLinkAccountRouter$linkAccount$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        internalLinkAccountRouter$linkAccount$1.L$0 = kjVar;
                        internalLinkAccountRouter$linkAccount$1.L$1 = events$Zalogin$LinkageContext;
                        internalLinkAccountRouter$linkAccount$1.label = 1;
                        e = e(kjVar, events$Zalogin$LinkageContext, internalLinkAccountRouter$linkAccount$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            z = ((Boolean) obj).booleanValue();
                            return Boolean.valueOf(z);
                        }
                        events$Zalogin$LinkageContext = (Events$Zalogin$LinkageContext) internalLinkAccountRouter$linkAccount$1.L$1;
                        kjVar = (kj) internalLinkAccountRouter$linkAccount$1.L$0;
                        kotlin.b.b(obj);
                        e = ((Result) obj).getValue();
                    }
                    if (!(e instanceof Result.Failure)) {
                        return e;
                    }
                    boolean booleanValue = ((Boolean) e).booleanValue();
                    if (!booleanValue) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                    internalLinkAccountRouter$linkAccount$1.L$0 = null;
                    internalLinkAccountRouter$linkAccount$1.L$1 = null;
                    internalLinkAccountRouter$linkAccount$1.Z$0 = booleanValue;
                    internalLinkAccountRouter$linkAccount$1.label = 2;
                    obj = a(kjVar, events$Zalogin$LinkageContext, internalLinkAccountRouter$linkAccount$1);
                }
            }
            if (i != 0) {
            }
            if (!(e instanceof Result.Failure)) {
            }
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        internalLinkAccountRouter$linkAccount$1 = new InternalLinkAccountRouter$linkAccount$1(this, continuationImpl);
        Object obj3 = internalLinkAccountRouter$linkAccount$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = internalLinkAccountRouter$linkAccount$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0142, code lost:
    
        if (r0 == r4) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c0, code lost:
    
        if (r2 == r4) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f4 A[Catch: all -> 0x0166, TryCatch #0 {all -> 0x0166, blocks: (B:13:0x004b, B:14:0x0145, B:15:0x0161, B:21:0x0070, B:22:0x00f0, B:24:0x00f4, B:25:0x0101, B:26:0x0106, B:34:0x00d3, B:36:0x00d7, B:41:0x0107, B:43:0x010b, B:44:0x0113, B:46:0x0117, B:48:0x0120, B:50:0x0132, B:52:0x014f, B:53:0x0154, B:54:0x0155), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0101 A[Catch: all -> 0x0166, TryCatch #0 {all -> 0x0166, blocks: (B:13:0x004b, B:14:0x0145, B:15:0x0161, B:21:0x0070, B:22:0x00f0, B:24:0x00f4, B:25:0x0101, B:26:0x0106, B:34:0x00d3, B:36:0x00d7, B:41:0x0107, B:43:0x010b, B:44:0x0113, B:46:0x0117, B:48:0x0120, B:50:0x0132, B:52:0x014f, B:53:0x0154, B:54:0x0155), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3 A[Catch: all -> 0x0166, TRY_ENTER, TryCatch #0 {all -> 0x0166, blocks: (B:13:0x004b, B:14:0x0145, B:15:0x0161, B:21:0x0070, B:22:0x00f0, B:24:0x00f4, B:25:0x0101, B:26:0x0106, B:34:0x00d3, B:36:0x00d7, B:41:0x0107, B:43:0x010b, B:44:0x0113, B:46:0x0117, B:48:0x0120, B:50:0x0132, B:52:0x014f, B:53:0x0154, B:54:0x0155), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(kj kjVar, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, ContinuationImpl continuationImpl) {
        InternalLinkAccountRouter$performLinkage$1 internalLinkAccountRouter$performLinkage$1;
        int i;
        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext2;
        Object obj;
        final Throwable a;
        Object b;
        kj kjVar2;
        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext3;
        Throwable th;
        kj kjVar3;
        kj kjVar4 = kjVar;
        try {
            if (continuationImpl instanceof InternalLinkAccountRouter$performLinkage$1) {
                internalLinkAccountRouter$performLinkage$1 = (InternalLinkAccountRouter$performLinkage$1) continuationImpl;
                int i2 = internalLinkAccountRouter$performLinkage$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    internalLinkAccountRouter$performLinkage$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = internalLinkAccountRouter$performLinkage$1.result;
                    Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = internalLinkAccountRouter$performLinkage$1.label;
                    fhz fhzVar = this.g;
                    k kVar = this.a;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        long j = kVar.x.a().a;
                        u02 u02Var = this.b;
                        gtq0.h(u02Var, j);
                        gtq0.h(u02Var, kjVar4.a);
                        com.yandex.passport.api.b a2 = this.f.a();
                        internalLinkAccountRouter$performLinkage$1.L$0 = kjVar4;
                        events$Zalogin$LinkageContext2 = events$Zalogin$LinkageContext;
                        internalLinkAccountRouter$performLinkage$1.L$1 = events$Zalogin$LinkageContext2;
                        internalLinkAccountRouter$performLinkage$1.L$2 = null;
                        internalLinkAccountRouter$performLinkage$1.L$3 = null;
                        internalLinkAccountRouter$performLinkage$1.label = 1;
                        a2.h();
                        obj = zy11.a;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                th = (Throwable) internalLinkAccountRouter$performLinkage$1.L$4;
                                events$Zalogin$LinkageContext3 = (Events$Zalogin$LinkageContext) internalLinkAccountRouter$performLinkage$1.L$1;
                                kjVar2 = (kj) internalLinkAccountRouter$performLinkage$1.L$0;
                                kotlin.b.b(obj2);
                                kjVar3 = (kj) obj2;
                                if (kjVar3 == null) {
                                    throw new InternalLinkAccountRouter$LinkAccountNotAuthorizedException(th, kjVar3);
                                }
                                jst.e.k(th, "Error while perform linkage");
                                fhzVar.g(kjVar2, events$Zalogin$LinkageContext3, th.getMessage());
                                return Boolean.valueOf(r12);
                            }
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj2);
                            b = ((Result) obj2).getValue();
                            kotlin.b.b(b);
                            r12 = ((Boolean) b).booleanValue();
                            return Boolean.valueOf(r12);
                        }
                        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext4 = (Events$Zalogin$LinkageContext) internalLinkAccountRouter$performLinkage$1.L$1;
                        kj kjVar5 = (kj) internalLinkAccountRouter$performLinkage$1.L$0;
                        kotlin.b.b(obj2);
                        obj = ((Result) obj2).getValue();
                        events$Zalogin$LinkageContext2 = events$Zalogin$LinkageContext4;
                        kjVar4 = kjVar5;
                    }
                    if (!(obj instanceof Result.Failure)) {
                        obj = Boolean.TRUE;
                    }
                    a = Result.a(obj);
                    if (a != null) {
                        return obj;
                    }
                    if (!(a instanceof PassportAccountNotAuthorizedException)) {
                        if (a instanceof PassportFailedResponseException) {
                            fhzVar.g(kjVar4, events$Zalogin$LinkageContext2, a.getMessage());
                        } else if (a instanceof PassportAccountNotFoundException) {
                            String message = ((PassportAccountNotFoundException) a).getMessage();
                            if (message != null ? evu0.y(message, String.valueOf(kVar.x.a().a), false) : false) {
                                throw new Exception(a) { // from class: ru.yandex.taxi.am.InternalLinkAccountRouter$CurrentAccountRemovedException
                                };
                            }
                            internalLinkAccountRouter$performLinkage$1.L$0 = null;
                            internalLinkAccountRouter$performLinkage$1.L$1 = null;
                            internalLinkAccountRouter$performLinkage$1.L$2 = null;
                            internalLinkAccountRouter$performLinkage$1.L$3 = null;
                            internalLinkAccountRouter$performLinkage$1.L$4 = null;
                            internalLinkAccountRouter$performLinkage$1.label = 3;
                            b = b(a, events$Zalogin$LinkageContext2, internalLinkAccountRouter$performLinkage$1);
                        } else {
                            jst.e.k(a, "Error while perform linkage");
                            fhzVar.g(kjVar4, events$Zalogin$LinkageContext2, a.getMessage());
                        }
                        return Boolean.valueOf(r12);
                    }
                    internalLinkAccountRouter$performLinkage$1.L$0 = kjVar4;
                    internalLinkAccountRouter$performLinkage$1.L$1 = events$Zalogin$LinkageContext2;
                    internalLinkAccountRouter$performLinkage$1.L$2 = null;
                    internalLinkAccountRouter$performLinkage$1.L$3 = null;
                    internalLinkAccountRouter$performLinkage$1.L$4 = a;
                    internalLinkAccountRouter$performLinkage$1.label = 2;
                    obj2 = c((PassportAccountNotAuthorizedException) a, internalLinkAccountRouter$performLinkage$1);
                    if (obj2 != obj3) {
                        kjVar2 = kjVar4;
                        events$Zalogin$LinkageContext3 = events$Zalogin$LinkageContext2;
                        th = a;
                        kjVar3 = (kj) obj2;
                        if (kjVar3 == null) {
                        }
                    }
                    return obj3;
                }
            }
            if (i != 0) {
            }
            if (!(obj instanceof Result.Failure)) {
            }
            a = Result.a(obj);
            if (a != null) {
            }
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
        internalLinkAccountRouter$performLinkage$1 = new InternalLinkAccountRouter$performLinkage$1(this, continuationImpl);
        Object obj22 = internalLinkAccountRouter$performLinkage$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = internalLinkAccountRouter$performLinkage$1.label;
        fhz fhzVar2 = this.g;
        k kVar2 = this.a;
    }
}
