package ru.yandex.taxi.am;

import com.yandex.passport.api.PushPlatform;
import defpackage.b64;
import defpackage.ep90;
import defpackage.g8e;
import defpackage.jst;
import defpackage.ny61;
import defpackage.xby;
import defpackage.zy11;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class p0 {
    public final ep90 a;

    public p0(ep90 ep90Var) {
        this.a = ep90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SupportedPushPlatform supportedPushPlatform, String str, Map map, Continuation continuation) {
        PassportPushInteractorImpl$handlePushInfo$1 passportPushInteractorImpl$handlePushInfo$1;
        int i;
        Object f;
        Throwable a;
        if (continuation instanceof PassportPushInteractorImpl$handlePushInfo$1) {
            passportPushInteractorImpl$handlePushInfo$1 = (PassportPushInteractorImpl$handlePushInfo$1) continuation;
            int i2 = passportPushInteractorImpl$handlePushInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportPushInteractorImpl$handlePushInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportPushInteractorImpl$handlePushInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportPushInteractorImpl$handlePushInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.api.b a2 = this.a.a();
                    passportPushInteractorImpl$handlePushInfo$1.L$0 = supportedPushPlatform;
                    passportPushInteractorImpl$handlePushInfo$1.L$1 = null;
                    passportPushInteractorImpl$handlePushInfo$1.L$2 = null;
                    passportPushInteractorImpl$handlePushInfo$1.label = 1;
                    f = a2.f(str, map, passportPushInteractorImpl$handlePushInfo$1);
                    if (f == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    supportedPushPlatform = (SupportedPushPlatform) passportPushInteractorImpl$handlePushInfo$1.L$0;
                    kotlin.b.b(obj);
                    f = ((Result) obj).getValue();
                }
                a = Result.a(f);
                if (a != null) {
                    return f;
                }
                xby.l(jst.e, b64.j(supportedPushPlatform.getErrorPrefix(), ":FAILED_TO_HANDLE_PUSH_INFO"), null, a, g8e.o("Error with handle push info in passport received by ", supportedPushPlatform.name()), 2);
                return Boolean.FALSE;
            }
        }
        passportPushInteractorImpl$handlePushInfo$1 = new PassportPushInteractorImpl$handlePushInfo$1(this, continuation);
        Object obj2 = passportPushInteractorImpl$handlePushInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportPushInteractorImpl$handlePushInfo$1.label;
        if (i != 0) {
        }
        a = Result.a(f);
        if (a != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PassportPushInteractorImpl$onFcmTokenRefresh$1 passportPushInteractorImpl$onFcmTokenRefresh$1;
        int i;
        Object j;
        Throwable a;
        if (continuationImpl instanceof PassportPushInteractorImpl$onFcmTokenRefresh$1) {
            passportPushInteractorImpl$onFcmTokenRefresh$1 = (PassportPushInteractorImpl$onFcmTokenRefresh$1) continuationImpl;
            int i2 = passportPushInteractorImpl$onFcmTokenRefresh$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportPushInteractorImpl$onFcmTokenRefresh$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportPushInteractorImpl$onFcmTokenRefresh$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportPushInteractorImpl$onFcmTokenRefresh$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.api.b a2 = this.a.a();
                    PushPlatform pushPlatform = PushPlatform.FCM;
                    passportPushInteractorImpl$onFcmTokenRefresh$1.label = 1;
                    j = a2.j(pushPlatform, passportPushInteractorImpl$onFcmTokenRefresh$1);
                    if (j == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    j = ((Result) obj).getValue();
                }
                a = Result.a(j);
                if (a != null) {
                    xby.l(jst.e, b64.j(SupportedPushPlatform.FCM.getErrorPrefix(), ":FAILED_TO_REFRESH_TOKEN"), null, a, "Error with FCM token refresh in passport", 2);
                }
                return zy11.a;
            }
        }
        passportPushInteractorImpl$onFcmTokenRefresh$1 = new PassportPushInteractorImpl$onFcmTokenRefresh$1(this, continuationImpl);
        Object obj2 = passportPushInteractorImpl$onFcmTokenRefresh$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportPushInteractorImpl$onFcmTokenRefresh$1.label;
        if (i != 0) {
        }
        a = Result.a(j);
        if (a != null) {
        }
        return zy11.a;
    }
}
