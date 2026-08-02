package ru.yandex.taxi.analytics;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class CrashlyticsInteractor {
    public final com.yandex.go.coroutines.h a = new com.yandex.go.coroutines.h(new CrashlyticsInteractor$crashlytics$1(1, null));

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        CrashlyticsInteractor$logDiagnosticEvent$1 crashlyticsInteractor$logDiagnosticEvent$1;
        int i;
        if (continuationImpl instanceof CrashlyticsInteractor$logDiagnosticEvent$1) {
            crashlyticsInteractor$logDiagnosticEvent$1 = (CrashlyticsInteractor$logDiagnosticEvent$1) continuationImpl;
            int i2 = crashlyticsInteractor$logDiagnosticEvent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                crashlyticsInteractor$logDiagnosticEvent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = crashlyticsInteractor$logDiagnosticEvent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = crashlyticsInteractor$logDiagnosticEvent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    crashlyticsInteractor$logDiagnosticEvent$1.L$0 = str;
                    crashlyticsInteractor$logDiagnosticEvent$1.label = 1;
                    obj = this.a.a(crashlyticsInteractor$logDiagnosticEvent$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) crashlyticsInteractor$logDiagnosticEvent$1.L$0;
                    kotlin.b.b(obj);
                }
                ((FirebaseCrashlytics) obj).log(str);
                return zy11.a;
            }
        }
        crashlyticsInteractor$logDiagnosticEvent$1 = new CrashlyticsInteractor$logDiagnosticEvent$1(this, continuationImpl);
        Object obj2 = crashlyticsInteractor$logDiagnosticEvent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = crashlyticsInteractor$logDiagnosticEvent$1.label;
        if (i != 0) {
        }
        ((FirebaseCrashlytics) obj2).log(str);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Exception exc, ContinuationImpl continuationImpl) {
        CrashlyticsInteractor$reportWtf$1 crashlyticsInteractor$reportWtf$1;
        int i;
        Exception exc2;
        if (continuationImpl instanceof CrashlyticsInteractor$reportWtf$1) {
            crashlyticsInteractor$reportWtf$1 = (CrashlyticsInteractor$reportWtf$1) continuationImpl;
            int i2 = crashlyticsInteractor$reportWtf$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                crashlyticsInteractor$reportWtf$1.label = i2 - Integer.MIN_VALUE;
                Object obj = crashlyticsInteractor$reportWtf$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = crashlyticsInteractor$reportWtf$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    crashlyticsInteractor$reportWtf$1.L$0 = exc;
                    crashlyticsInteractor$reportWtf$1.label = 1;
                    obj = this.a.a(crashlyticsInteractor$reportWtf$1);
                    exc2 = exc;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r5 = (Throwable) crashlyticsInteractor$reportWtf$1.L$0;
                    kotlin.b.b(obj);
                    exc2 = r5;
                }
                ((FirebaseCrashlytics) obj).recordException(exc2);
                return zy11.a;
            }
        }
        crashlyticsInteractor$reportWtf$1 = new CrashlyticsInteractor$reportWtf$1(this, continuationImpl);
        Object obj2 = crashlyticsInteractor$reportWtf$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = crashlyticsInteractor$reportWtf$1.label;
        if (i != 0) {
        }
        ((FirebaseCrashlytics) obj2).recordException(exc2);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        CrashlyticsInteractor$setCurrentScreen$1 crashlyticsInteractor$setCurrentScreen$1;
        int i;
        if (continuationImpl instanceof CrashlyticsInteractor$setCurrentScreen$1) {
            crashlyticsInteractor$setCurrentScreen$1 = (CrashlyticsInteractor$setCurrentScreen$1) continuationImpl;
            int i2 = crashlyticsInteractor$setCurrentScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                crashlyticsInteractor$setCurrentScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = crashlyticsInteractor$setCurrentScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = crashlyticsInteractor$setCurrentScreen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    crashlyticsInteractor$setCurrentScreen$1.L$0 = str;
                    crashlyticsInteractor$setCurrentScreen$1.label = 1;
                    obj = this.a.a(crashlyticsInteractor$setCurrentScreen$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) crashlyticsInteractor$setCurrentScreen$1.L$0;
                    kotlin.b.b(obj);
                }
                ((FirebaseCrashlytics) obj).setCustomKey("screen_name", str);
                return zy11.a;
            }
        }
        crashlyticsInteractor$setCurrentScreen$1 = new CrashlyticsInteractor$setCurrentScreen$1(this, continuationImpl);
        Object obj2 = crashlyticsInteractor$setCurrentScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = crashlyticsInteractor$setCurrentScreen$1.label;
        if (i != 0) {
        }
        ((FirebaseCrashlytics) obj2).setCustomKey("screen_name", str);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        CrashlyticsInteractor$setMetricaDeviceId$1 crashlyticsInteractor$setMetricaDeviceId$1;
        int i;
        if (continuationImpl instanceof CrashlyticsInteractor$setMetricaDeviceId$1) {
            crashlyticsInteractor$setMetricaDeviceId$1 = (CrashlyticsInteractor$setMetricaDeviceId$1) continuationImpl;
            int i2 = crashlyticsInteractor$setMetricaDeviceId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                crashlyticsInteractor$setMetricaDeviceId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = crashlyticsInteractor$setMetricaDeviceId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = crashlyticsInteractor$setMetricaDeviceId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    crashlyticsInteractor$setMetricaDeviceId$1.L$0 = str;
                    crashlyticsInteractor$setMetricaDeviceId$1.label = 1;
                    obj = this.a.a(crashlyticsInteractor$setMetricaDeviceId$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) crashlyticsInteractor$setMetricaDeviceId$1.L$0;
                    kotlin.b.b(obj);
                }
                ((FirebaseCrashlytics) obj).setUserId(str);
                return zy11.a;
            }
        }
        crashlyticsInteractor$setMetricaDeviceId$1 = new CrashlyticsInteractor$setMetricaDeviceId$1(this, continuationImpl);
        Object obj2 = crashlyticsInteractor$setMetricaDeviceId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = crashlyticsInteractor$setMetricaDeviceId$1.label;
        if (i != 0) {
        }
        ((FirebaseCrashlytics) obj2).setUserId(str);
        return zy11.a;
    }
}
