package ru.yandex.taxi.vendor_api.google.push;

import com.google.android.gms.tasks.zzw;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.evu0;
import defpackage.gtq0;
import defpackage.jst;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.ujp;
import defpackage.wjp;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n;

/* loaded from: classes10.dex */
public final class a {
    public final wjp a;
    public final FirebaseMessaging b;
    public final ujp c;

    public a(wjp wjpVar, FirebaseMessaging firebaseMessaging, ujp ujpVar) {
        this.a = wjpVar;
        this.b = firebaseMessaging;
        this.c = ujpVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:21|22))(4:23|(2:27|(1:29))|16|17)|12|13|(1:15)(1:19)|16|17))|42|6|7|(0)(0)|12|13|(0)(0)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002e, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        r6 = r6.c;
        r0 = (ru.yandex.taxi.vendor_api.google.b) r6.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
    
        if (((com.google.android.gms.common.a) r0.d.getValue()).d(r0.a, com.google.android.gms.common.b.a) != 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0078, code lost:
    
        defpackage.jst.e.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
    
        if (r6.a.compareAndSet(false, true) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
    
        defpackage.jst.e.m(defpackage.g8e.o("PUSH_TOKEN_NOT_AVAILABLE:", r6.c)).h("[VendorPushTokenAnalytics]", "push token not available, service availability: " + ((ru.yandex.taxi.vendor_api.google.b) r6.b).b(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0075, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        FcmPushTokenRepository$refreshTokenIfItNeed$1 fcmPushTokenRepository$refreshTokenIfItNeed$1;
        int i;
        String str;
        if (continuationImpl instanceof FcmPushTokenRepository$refreshTokenIfItNeed$1) {
            fcmPushTokenRepository$refreshTokenIfItNeed$1 = (FcmPushTokenRepository$refreshTokenIfItNeed$1) continuationImpl;
            int i2 = fcmPushTokenRepository$refreshTokenIfItNeed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fcmPushTokenRepository$refreshTokenIfItNeed$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fcmPushTokenRepository$refreshTokenIfItNeed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fcmPushTokenRepository$refreshTokenIfItNeed$1.label;
                str = null;
                wjp wjpVar = this.a;
                if (i != 0) {
                    b.b(obj);
                    String a = wjpVar.a();
                    if (a == null || evu0.J(a)) {
                        zzw d = this.b.d();
                        fcmPushTokenRepository$refreshTokenIfItNeed$1.L$0 = null;
                        fcmPushTokenRepository$refreshTokenIfItNeed$1.label = 1;
                        obj = gtq0.c(d, fcmPushTokenRepository$refreshTokenIfItNeed$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                str = (String) obj;
                if (str == null) {
                    wjpVar.b(str);
                } else {
                    jst.e.getClass();
                }
                return zy11.a;
            }
        }
        fcmPushTokenRepository$refreshTokenIfItNeed$1 = new FcmPushTokenRepository$refreshTokenIfItNeed$1(this, continuationImpl);
        Object obj2 = fcmPushTokenRepository$refreshTokenIfItNeed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fcmPushTokenRepository$refreshTokenIfItNeed$1.label;
        str = null;
        wjp wjpVar2 = this.a;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        FcmPushTokenRepository$takeToken$1 fcmPushTokenRepository$takeToken$1;
        int i;
        if (continuationImpl instanceof FcmPushTokenRepository$takeToken$1) {
            fcmPushTokenRepository$takeToken$1 = (FcmPushTokenRepository$takeToken$1) continuationImpl;
            int i2 = fcmPushTokenRepository$takeToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fcmPushTokenRepository$takeToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fcmPushTokenRepository$takeToken$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fcmPushTokenRepository$takeToken$1.label;
                if (i != 0) {
                    b.b(obj);
                    fcmPushTokenRepository$takeToken$1.label = 1;
                    if (a(fcmPushTokenRepository$takeToken$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return this.a.a();
            }
        }
        fcmPushTokenRepository$takeToken$1 = new FcmPushTokenRepository$takeToken$1(this, continuationImpl);
        Object obj3 = fcmPushTokenRepository$takeToken$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fcmPushTokenRepository$takeToken$1.label;
        if (i != 0) {
        }
        return this.a.a();
    }

    public final n c() {
        return new n(new rol0(new FcmPushTokenRepository$tokenFlow$1(this, null)), new FcmPushTokenRepository$tokenFlow$2(this, null));
    }
}
