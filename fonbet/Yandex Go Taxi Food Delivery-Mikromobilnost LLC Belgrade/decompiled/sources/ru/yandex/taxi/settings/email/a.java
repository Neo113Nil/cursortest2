package ru.yandex.taxi.settings.email;

import defpackage.bsn;
import defpackage.bvf0;
import defpackage.cmt;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.dvx;
import defpackage.h3y;
import defpackage.hit;
import defpackage.jsn;
import defpackage.jst;
import defpackage.kgx;
import defpackage.mth;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.qdx;
import defpackage.qme0;
import defpackage.tje;
import defpackage.tl21;
import defpackage.zy11;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.client.api.LaunchApi;
import ru.yandex.taxi.net.taxi.dto.request.EmailParam$Action;

/* loaded from: classes10.dex */
public final class a {
    public static final /* synthetic */ kgx[] i = {new MutablePropertyReference1Impl("emailStatus", 0, "getEmailStatus()I", a.class), new MutablePropertyReference1Impl("_lastKnownEmail", 0, "get_lastKnownEmail()Ljava/lang/String;", a.class)};
    public final h3y a;
    public final ru.yandex.taxi.launch.c b;
    public final hit c;
    public final r0 d;
    public pzt0 e;
    public final qdx f;
    public final qme0 g;
    public final r0 h;

    public a(h3y h3yVar, ru.yandex.taxi.launch.c cVar, hit hitVar, dne0 dne0Var) {
        this.a = h3yVar;
        this.b = cVar;
        this.c = hitVar;
        cne0 b = dne0Var.b();
        this.d = bvf0.c(null);
        qdx qdxVar = new qdx(0, b, b, "FIELD_EMAIL_STATUS");
        this.f = qdxVar;
        this.g = new qme0(1, b, b, "FIELD_LAST_KNOWN_EMAIL");
        int i2 = tl21.d;
        this.h = bvf0.c(new tl21(c(), ((Number) qdxVar.getValue(this, i[0])).intValue()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0054, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        EmailRepositoryImpl$emailFromServer$1 emailRepositoryImpl$emailFromServer$1;
        int i2;
        aVar.getClass();
        if (continuationImpl instanceof EmailRepositoryImpl$emailFromServer$1) {
            emailRepositoryImpl$emailFromServer$1 = (EmailRepositoryImpl$emailFromServer$1) continuationImpl;
            int i3 = emailRepositoryImpl$emailFromServer$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                emailRepositoryImpl$emailFromServer$1.label = i3 - Integer.MIN_VALUE;
                Object obj = emailRepositoryImpl$emailFromServer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = emailRepositoryImpl$emailFromServer$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    mth b = aVar.b.b();
                    EmailRepositoryImpl$emailFromServer$sessionId$1 emailRepositoryImpl$emailFromServer$sessionId$1 = new EmailRepositoryImpl$emailFromServer$sessionId$1();
                    emailRepositoryImpl$emailFromServer$1.label = 1;
                    obj = e.x(b, emailRepositoryImpl$emailFromServer$sessionId$1, emailRepositoryImpl$emailFromServer$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        jsn jsnVar = (jsn) obj;
                        int b2 = jsnVar.b();
                        if (b2 == 1 || b2 == 4) {
                            String b3 = jsnVar.getB();
                            return aVar.f(b2, b3 != null ? b3 : "");
                        }
                        jst.e.k(new Exception("Get email not OK status"), "Get email response status: %s");
                        return new tl21("", b2);
                    }
                    kotlin.b.b(obj);
                }
                cmt<jsn> a = ((LaunchApi) aVar.a.get()).a(new bsn(((dvx) obj).a, EmailParam$Action.GET, null));
                emailRepositoryImpl$emailFromServer$1.L$0 = null;
                emailRepositoryImpl$emailFromServer$1.L$1 = null;
                emailRepositoryImpl$emailFromServer$1.label = 2;
                obj = ru.yandex.taxi.network.api.a.a(a, null, emailRepositoryImpl$emailFromServer$1);
            }
        }
        emailRepositoryImpl$emailFromServer$1 = new EmailRepositoryImpl$emailFromServer$1(aVar, continuationImpl);
        Object obj2 = emailRepositoryImpl$emailFromServer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = emailRepositoryImpl$emailFromServer$1.label;
        if (i2 != 0) {
        }
        cmt<jsn> a2 = ((LaunchApi) aVar.a.get()).a(new bsn(((dvx) obj2).a, EmailParam$Action.GET, null));
        emailRepositoryImpl$emailFromServer$1.L$0 = null;
        emailRepositoryImpl$emailFromServer$1.L$1 = null;
        emailRepositoryImpl$emailFromServer$1.label = 2;
        obj2 = ru.yandex.taxi.network.api.a.a(a2, null, emailRepositoryImpl$emailFromServer$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r9 != r2) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        EmailRepositoryImpl$deleteEmail$1 emailRepositoryImpl$deleteEmail$1;
        int i2;
        try {
            if (continuationImpl instanceof EmailRepositoryImpl$deleteEmail$1) {
                emailRepositoryImpl$deleteEmail$1 = (EmailRepositoryImpl$deleteEmail$1) continuationImpl;
                int i3 = emailRepositoryImpl$deleteEmail$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    emailRepositoryImpl$deleteEmail$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = emailRepositoryImpl$deleteEmail$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = emailRepositoryImpl$deleteEmail$1.label;
                    if (i2 != 0) {
                        kotlin.b.b(obj);
                        ru.yandex.taxi.launch.c cVar = this.b;
                        emailRepositoryImpl$deleteEmail$1.label = 1;
                        obj = cVar.c(emailRepositoryImpl$deleteEmail$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            jsn jsnVar = (jsn) obj;
                            if (jsnVar.b() == 1) {
                                return zy11.a;
                            }
                            throw new UpdateEmailFailedException("Delete email failed: " + jsnVar);
                        }
                        kotlin.b.b(obj);
                    }
                    cmt<jsn> a = ((LaunchApi) this.a.get()).a(new bsn((String) obj, EmailParam$Action.UNSET, null));
                    emailRepositoryImpl$deleteEmail$1.L$0 = null;
                    emailRepositoryImpl$deleteEmail$1.label = 2;
                    obj = ru.yandex.taxi.network.api.a.a(a, null, emailRepositoryImpl$deleteEmail$1);
                }
            }
            if (i2 != 0) {
            }
            cmt<jsn> a2 = ((LaunchApi) this.a.get()).a(new bsn((String) obj, EmailParam$Action.UNSET, null));
            emailRepositoryImpl$deleteEmail$1.L$0 = null;
            emailRepositoryImpl$deleteEmail$1.label = 2;
            obj = ru.yandex.taxi.network.api.a.a(a2, null, emailRepositoryImpl$deleteEmail$1);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        emailRepositoryImpl$deleteEmail$1 = new EmailRepositoryImpl$deleteEmail$1(this, continuationImpl);
        Object obj2 = emailRepositoryImpl$deleteEmail$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = emailRepositoryImpl$deleteEmail$1.label;
    }

    public final String c() {
        return (String) this.g.getValue(this, i[1]);
    }

    public final void d() {
        pzt0 pzt0Var = this.e;
        if (pzt0Var != null ? pzt0Var.isActive() : false) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        r0 r0Var = this.d;
        r0Var.getClass();
        r0Var.m(null, bool);
        this.e = tje.N(this.c.a, null, null, new EmailRepositoryImpl$refreshEmailData$1(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r10 != r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(String str, ContinuationImpl continuationImpl) {
        EmailRepositoryImpl$setEmail$1 emailRepositoryImpl$setEmail$1;
        int i2;
        try {
            if (continuationImpl instanceof EmailRepositoryImpl$setEmail$1) {
                emailRepositoryImpl$setEmail$1 = (EmailRepositoryImpl$setEmail$1) continuationImpl;
                int i3 = emailRepositoryImpl$setEmail$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    emailRepositoryImpl$setEmail$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = emailRepositoryImpl$setEmail$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = emailRepositoryImpl$setEmail$1.label;
                    if (i2 != 0) {
                        kotlin.b.b(obj);
                        ru.yandex.taxi.launch.c cVar = this.b;
                        emailRepositoryImpl$setEmail$1.L$0 = str;
                        emailRepositoryImpl$setEmail$1.label = 1;
                        obj = cVar.c(emailRepositoryImpl$setEmail$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str = (String) emailRepositoryImpl$setEmail$1.L$0;
                            kotlin.b.b(obj);
                            jsn jsnVar = (jsn) obj;
                            int b = jsnVar.b();
                            if (b != 1 && b != 2) {
                                throw new UpdateEmailFailedException("Update email failed: " + jsnVar);
                            }
                            f(b, str);
                            return new Integer(b);
                        }
                        str = (String) emailRepositoryImpl$setEmail$1.L$0;
                        kotlin.b.b(obj);
                    }
                    cmt<jsn> a = ((LaunchApi) this.a.get()).a(new bsn((String) obj, EmailParam$Action.SET, str));
                    emailRepositoryImpl$setEmail$1.L$0 = str;
                    emailRepositoryImpl$setEmail$1.L$1 = null;
                    emailRepositoryImpl$setEmail$1.label = 2;
                    obj = ru.yandex.taxi.network.api.a.a(a, null, emailRepositoryImpl$setEmail$1);
                }
            }
            if (i2 != 0) {
            }
            cmt<jsn> a2 = ((LaunchApi) this.a.get()).a(new bsn((String) obj, EmailParam$Action.SET, str));
            emailRepositoryImpl$setEmail$1.L$0 = str;
            emailRepositoryImpl$setEmail$1.L$1 = null;
            emailRepositoryImpl$setEmail$1.label = 2;
            obj = ru.yandex.taxi.network.api.a.a(a2, null, emailRepositoryImpl$setEmail$1);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        emailRepositoryImpl$setEmail$1 = new EmailRepositoryImpl$setEmail$1(this, continuationImpl);
        Object obj2 = emailRepositoryImpl$setEmail$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = emailRepositoryImpl$setEmail$1.label;
    }

    public final tl21 f(int i2, String str) {
        kgx[] kgxVarArr = i;
        this.g.setValue(this, kgxVarArr[1], str);
        this.f.setValue(this, kgxVarArr[0], Integer.valueOf(i2));
        tl21 tl21Var = new tl21(str, i2);
        r0 r0Var = this.h;
        r0Var.getClass();
        r0Var.m(null, tl21Var);
        return tl21Var;
    }
}
