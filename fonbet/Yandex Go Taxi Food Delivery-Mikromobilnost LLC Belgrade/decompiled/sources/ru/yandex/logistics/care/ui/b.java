package ru.yandex.logistics.care.ui;

import android.util.Log;
import defpackage.bb60;
import defpackage.cvu0;
import defpackage.dt8;
import defpackage.geh;
import defpackage.gt8;
import defpackage.ny61;
import defpackage.qne;
import defpackage.sbx;
import defpackage.va41;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class b {
    public final sbx a;

    public b(sbx sbxVar) {
        this.a = sbxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v0, types: [ru.yandex.logistics.care.ui.b] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, gt8 gt8Var, ContinuationImpl continuationImpl) {
        CareWebViewConfigProvider$authoriseCareUrl$1 careWebViewConfigProvider$authoriseCareUrl$1;
        int i;
        geh gehVar;
        ?? r8;
        Throwable a;
        if (continuationImpl instanceof CareWebViewConfigProvider$authoriseCareUrl$1) {
            careWebViewConfigProvider$authoriseCareUrl$1 = (CareWebViewConfigProvider$authoriseCareUrl$1) continuationImpl;
            int i2 = careWebViewConfigProvider$authoriseCareUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                careWebViewConfigProvider$authoriseCareUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = careWebViewConfigProvider$authoriseCareUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = careWebViewConfigProvider$authoriseCareUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (cvu0.x(str, "file://", false)) {
                        return str;
                    }
                    dt8 dt8Var = gt8Var.b;
                    geh gehVar2 = dt8Var.b;
                    ru.yandex.taxi.logistics.care.impl.router.b bVar = dt8Var.e;
                    ru.yandex.taxi.logistics.care.impl.router.a aVar = dt8Var.d;
                    if (bVar != null) {
                        careWebViewConfigProvider$authoriseCareUrl$1.L$0 = str;
                        careWebViewConfigProvider$authoriseCareUrl$1.L$1 = null;
                        careWebViewConfigProvider$authoriseCareUrl$1.L$2 = gehVar2;
                        careWebViewConfigProvider$authoriseCareUrl$1.L$3 = null;
                        careWebViewConfigProvider$authoriseCareUrl$1.L$4 = null;
                        careWebViewConfigProvider$authoriseCareUrl$1.label = 1;
                        Object a2 = bVar.a(str, careWebViewConfigProvider$authoriseCareUrl$1);
                        if (a2 != coroutineSingletons) {
                            gehVar = gehVar2;
                            r8 = a2;
                        }
                    } else {
                        careWebViewConfigProvider$authoriseCareUrl$1.L$0 = null;
                        careWebViewConfigProvider$authoriseCareUrl$1.L$1 = null;
                        careWebViewConfigProvider$authoriseCareUrl$1.L$2 = null;
                        careWebViewConfigProvider$authoriseCareUrl$1.L$3 = null;
                        careWebViewConfigProvider$authoriseCareUrl$1.L$4 = null;
                        careWebViewConfigProvider$authoriseCareUrl$1.label = 2;
                        Serializable b = b(str, aVar, gehVar2, careWebViewConfigProvider$authoriseCareUrl$1);
                        if (b != coroutineSingletons) {
                            return b;
                        }
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
                gehVar = (geh) careWebViewConfigProvider$authoriseCareUrl$1.L$2;
                str = (String) careWebViewConfigProvider$authoriseCareUrl$1.L$0;
                kotlin.b.b(obj);
                r8 = ((Result) obj).getValue();
                if (r8 instanceof Result.Failure) {
                } else {
                    str = r8;
                }
                a = Result.a(str);
                if (a != null) {
                    gehVar.getClass();
                    Log.e("Care_SDK", "Failed to add auth data to URL", a);
                }
                return str;
            }
        }
        careWebViewConfigProvider$authoriseCareUrl$1 = new CareWebViewConfigProvider$authoriseCareUrl$1(this, continuationImpl);
        Object obj2 = careWebViewConfigProvider$authoriseCareUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = careWebViewConfigProvider$authoriseCareUrl$1.label;
        if (i != 0) {
        }
        if (r8 instanceof Result.Failure) {
        }
        a = Result.a(str);
        if (a != null) {
        }
        return str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|28|6|7|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r9 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(String str, ru.yandex.taxi.logistics.care.impl.router.a aVar, geh gehVar, ContinuationImpl continuationImpl) {
        CareWebViewConfigProvider$authoriseUrl$1 careWebViewConfigProvider$authoriseUrl$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof CareWebViewConfigProvider$authoriseUrl$1) {
            careWebViewConfigProvider$authoriseUrl$1 = (CareWebViewConfigProvider$authoriseUrl$1) continuationImpl;
            int i2 = careWebViewConfigProvider$authoriseUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                careWebViewConfigProvider$authoriseUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = careWebViewConfigProvider$authoriseUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = careWebViewConfigProvider$authoriseUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    careWebViewConfigProvider$authoriseUrl$1.L$0 = null;
                    careWebViewConfigProvider$authoriseUrl$1.L$1 = null;
                    careWebViewConfigProvider$authoriseUrl$1.L$2 = gehVar;
                    careWebViewConfigProvider$authoriseUrl$1.L$3 = null;
                    careWebViewConfigProvider$authoriseUrl$1.I$0 = 0;
                    careWebViewConfigProvider$authoriseUrl$1.label = 1;
                    obj = c(str, aVar, gehVar, careWebViewConfigProvider$authoriseUrl$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gehVar = (geh) careWebViewConfigProvider$authoriseUrl$1.L$2;
                    kotlin.b.b(obj);
                }
                Serializable failure = (String) obj;
                a = Result.a(failure);
                if (a != null) {
                    gehVar.getClass();
                    Log.e("Care_SDK", "Failed to add auth data to URL", a);
                }
                return failure;
            }
        }
        careWebViewConfigProvider$authoriseUrl$1 = new CareWebViewConfigProvider$authoriseUrl$1(this, continuationImpl);
        Object obj2 = careWebViewConfigProvider$authoriseUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = careWebViewConfigProvider$authoriseUrl$1.label;
        if (i != 0) {
        }
        Serializable failure2 = (String) obj2;
        a = Result.a(failure2);
        if (a != null) {
        }
        return failure2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ru.yandex.taxi.logistics.care.impl.router.a aVar, geh gehVar, ContinuationImpl continuationImpl) {
        CareWebViewConfigProvider$wrapUrlWithAuthorization$1 careWebViewConfigProvider$wrapUrlWithAuthorization$1;
        int i;
        va41 va41Var;
        if (continuationImpl instanceof CareWebViewConfigProvider$wrapUrlWithAuthorization$1) {
            careWebViewConfigProvider$wrapUrlWithAuthorization$1 = (CareWebViewConfigProvider$wrapUrlWithAuthorization$1) continuationImpl;
            int i2 = careWebViewConfigProvider$wrapUrlWithAuthorization$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                careWebViewConfigProvider$wrapUrlWithAuthorization$1.label = i2 - Integer.MIN_VALUE;
                Object obj = careWebViewConfigProvider$wrapUrlWithAuthorization$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = careWebViewConfigProvider$wrapUrlWithAuthorization$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gehVar.getClass();
                    careWebViewConfigProvider$wrapUrlWithAuthorization$1.L$0 = str;
                    careWebViewConfigProvider$wrapUrlWithAuthorization$1.L$1 = null;
                    careWebViewConfigProvider$wrapUrlWithAuthorization$1.L$2 = gehVar;
                    careWebViewConfigProvider$wrapUrlWithAuthorization$1.label = 1;
                    obj = aVar.a(careWebViewConfigProvider$wrapUrlWithAuthorization$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gehVar = (geh) careWebViewConfigProvider$wrapUrlWithAuthorization$1.L$2;
                    str = (String) careWebViewConfigProvider$wrapUrlWithAuthorization$1.L$0;
                    kotlin.b.b(obj);
                }
                va41Var = (va41) obj;
                if (!(va41Var instanceof qne)) {
                    gehVar.getClass();
                    return ((qne) va41Var).a;
                }
                if (va41Var instanceof bb60) {
                    gehVar.getClass();
                    return str;
                }
                String str2 = "Authorization failed: " + va41Var;
                geh.a(gehVar, str2);
                ny61.r(str2);
                return null;
            }
        }
        careWebViewConfigProvider$wrapUrlWithAuthorization$1 = new CareWebViewConfigProvider$wrapUrlWithAuthorization$1(this, continuationImpl);
        Object obj3 = careWebViewConfigProvider$wrapUrlWithAuthorization$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = careWebViewConfigProvider$wrapUrlWithAuthorization$1.label;
        if (i != 0) {
        }
        va41Var = (va41) obj3;
        if (!(va41Var instanceof qne)) {
        }
    }
}
