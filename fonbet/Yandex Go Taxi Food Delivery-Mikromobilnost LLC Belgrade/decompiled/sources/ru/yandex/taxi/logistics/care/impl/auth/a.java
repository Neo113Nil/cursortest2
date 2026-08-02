package ru.yandex.taxi.logistics.care.impl.auth;

import defpackage.dac;
import defpackage.ene;
import defpackage.foc;
import defpackage.g6u;
import defpackage.gne;
import defpackage.jj3;
import defpackage.jst;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.superapp.f;

/* loaded from: classes5.dex */
public final class a {
    public final f a;
    public final jj3 b;
    public final tt2 c;

    public a(f fVar, jj3 jj3Var, tt2 tt2Var) {
        this.a = fVar;
        this.b = jj3Var;
        this.c = tt2Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|13|(1:15)|16))|27|6|7|(0)(0)|12|13|(0)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        r5 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        CareAuthInteractor$ensureAndInjectCookies$1 careAuthInteractor$ensureAndInjectCookies$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof CareAuthInteractor$ensureAndInjectCookies$1) {
            careAuthInteractor$ensureAndInjectCookies$1 = (CareAuthInteractor$ensureAndInjectCookies$1) continuationImpl;
            int i2 = careAuthInteractor$ensureAndInjectCookies$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                careAuthInteractor$ensureAndInjectCookies$1.label = i2 - Integer.MIN_VALUE;
                Object obj = careAuthInteractor$ensureAndInjectCookies$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = careAuthInteractor$ensureAndInjectCookies$1.label;
                if (i != 0) {
                    b.b(obj);
                    jst.e.getClass();
                    careAuthInteractor$ensureAndInjectCookies$1.L$0 = null;
                    careAuthInteractor$ensureAndInjectCookies$1.L$1 = null;
                    careAuthInteractor$ensureAndInjectCookies$1.label = 1;
                    if (b(str, false, true, careAuthInteractor$ensureAndInjectCookies$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                Object failure = zy11.a;
                a = Result.a(failure);
                if (a != null) {
                    jst.e.h("CareAuthInteractor", "ensureAndInjectCookies failed", a);
                }
                return failure;
            }
        }
        careAuthInteractor$ensureAndInjectCookies$1 = new CareAuthInteractor$ensureAndInjectCookies$1(this, continuationImpl);
        Object obj3 = careAuthInteractor$ensureAndInjectCookies$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = careAuthInteractor$ensureAndInjectCookies$1.label;
        if (i != 0) {
        }
        Object failure2 = zy11.a;
        a = Result.a(failure2);
        if (a != null) {
        }
        return failure2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (r12 != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (defpackage.tje.k0(r12, r1, r6) == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        CareAuthInteractor$ensureAuthorizedAndInject$1 careAuthInteractor$ensureAuthorizedAndInject$1;
        int i;
        if (continuationImpl instanceof CareAuthInteractor$ensureAuthorizedAndInject$1) {
            careAuthInteractor$ensureAuthorizedAndInject$1 = (CareAuthInteractor$ensureAuthorizedAndInject$1) continuationImpl;
            int i2 = careAuthInteractor$ensureAuthorizedAndInject$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                careAuthInteractor$ensureAuthorizedAndInject$1.label = i2 - Integer.MIN_VALUE;
                CareAuthInteractor$ensureAuthorizedAndInject$1 careAuthInteractor$ensureAuthorizedAndInject$12 = careAuthInteractor$ensureAuthorizedAndInject$1;
                Object obj = careAuthInteractor$ensureAuthorizedAndInject$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = careAuthInteractor$ensureAuthorizedAndInject$12.label;
                if (i != 0) {
                    b.b(obj);
                    this.c.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    CareAuthInteractor$ensureAuthorizedAndInject$2 careAuthInteractor$ensureAuthorizedAndInject$2 = new CareAuthInteractor$ensureAuthorizedAndInject$2(this, null);
                    careAuthInteractor$ensureAuthorizedAndInject$12.L$0 = str;
                    careAuthInteractor$ensureAuthorizedAndInject$12.Z$0 = z;
                    careAuthInteractor$ensureAuthorizedAndInject$12.Z$1 = z2;
                    careAuthInteractor$ensureAuthorizedAndInject$12.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        gne gneVar = (gne) obj;
                        if (!(gneVar instanceof ene)) {
                            return zy11.a;
                        }
                        dac.f(((ene) gneVar).a, "Cookie injection failed: ");
                        return null;
                    }
                    z2 = careAuthInteractor$ensureAuthorizedAndInject$12.Z$1;
                    z = careAuthInteractor$ensureAuthorizedAndInject$12.Z$0;
                    str = (String) careAuthInteractor$ensureAuthorizedAndInject$12.L$0;
                    b.b(obj);
                }
                boolean z3 = z;
                boolean z4 = z2;
                careAuthInteractor$ensureAuthorizedAndInject$12.L$0 = null;
                careAuthInteractor$ensureAuthorizedAndInject$12.Z$0 = z3;
                careAuthInteractor$ensureAuthorizedAndInject$12.Z$1 = z4;
                careAuthInteractor$ensureAuthorizedAndInject$12.label = 2;
                obj = this.a.b(str, z3, z4, new foc(16), careAuthInteractor$ensureAuthorizedAndInject$12);
            }
        }
        careAuthInteractor$ensureAuthorizedAndInject$1 = new CareAuthInteractor$ensureAuthorizedAndInject$1(this, continuationImpl);
        CareAuthInteractor$ensureAuthorizedAndInject$1 careAuthInteractor$ensureAuthorizedAndInject$122 = careAuthInteractor$ensureAuthorizedAndInject$1;
        Object obj2 = careAuthInteractor$ensureAuthorizedAndInject$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = careAuthInteractor$ensureAuthorizedAndInject$122.label;
        if (i != 0) {
        }
        boolean z32 = z;
        boolean z42 = z2;
        careAuthInteractor$ensureAuthorizedAndInject$122.L$0 = null;
        careAuthInteractor$ensureAuthorizedAndInject$122.Z$0 = z32;
        careAuthInteractor$ensureAuthorizedAndInject$122.Z$1 = z42;
        careAuthInteractor$ensureAuthorizedAndInject$122.label = 2;
        obj2 = this.a.b(str, z32, z42, new foc(16), careAuthInteractor$ensureAuthorizedAndInject$122);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|13|(1:15)|16))|27|6|7|(0)(0)|12|13|(0)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        r5 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        CareAuthInteractor$onUnauthorized$1 careAuthInteractor$onUnauthorized$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof CareAuthInteractor$onUnauthorized$1) {
            careAuthInteractor$onUnauthorized$1 = (CareAuthInteractor$onUnauthorized$1) continuationImpl;
            int i2 = careAuthInteractor$onUnauthorized$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                careAuthInteractor$onUnauthorized$1.label = i2 - Integer.MIN_VALUE;
                Object obj = careAuthInteractor$onUnauthorized$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = careAuthInteractor$onUnauthorized$1.label;
                if (i != 0) {
                    b.b(obj);
                    jst.e.getClass();
                    careAuthInteractor$onUnauthorized$1.L$0 = null;
                    careAuthInteractor$onUnauthorized$1.L$1 = null;
                    careAuthInteractor$onUnauthorized$1.label = 1;
                    if (b(str, true, false, careAuthInteractor$onUnauthorized$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                Object failure = zy11.a;
                a = Result.a(failure);
                if (a != null) {
                    jst.e.h("CareAuthInteractor", "onUnauthorized failed", a);
                }
                return failure;
            }
        }
        careAuthInteractor$onUnauthorized$1 = new CareAuthInteractor$onUnauthorized$1(this, continuationImpl);
        Object obj3 = careAuthInteractor$onUnauthorized$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = careAuthInteractor$onUnauthorized$1.label;
        if (i != 0) {
        }
        Object failure2 = zy11.a;
        a = Result.a(failure2);
        if (a != null) {
        }
        return failure2;
    }
}
