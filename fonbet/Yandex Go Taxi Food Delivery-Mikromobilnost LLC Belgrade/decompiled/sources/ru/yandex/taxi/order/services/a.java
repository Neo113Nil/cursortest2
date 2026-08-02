package ru.yandex.taxi.order.services;

import android.os.Build;
import android.os.PowerManager;
import defpackage.ny61;
import defpackage.s66;
import defpackage.ygx;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a {
    public final PowerManager a;
    public final s66 b;
    public final int c = Build.VERSION.SDK_INT;
    public final String d = Build.MANUFACTURER;

    public a(PowerManager powerManager, s66 s66Var) {
        this.a = powerManager;
        this.b = s66Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        KeepAliveServiceBehaviorInteractor$couldStartServiceAsBackground$1 keepAliveServiceBehaviorInteractor$couldStartServiceAsBackground$1;
        int i;
        List list;
        if (continuationImpl instanceof KeepAliveServiceBehaviorInteractor$couldStartServiceAsBackground$1) {
            keepAliveServiceBehaviorInteractor$couldStartServiceAsBackground$1 = (KeepAliveServiceBehaviorInteractor$couldStartServiceAsBackground$1) continuationImpl;
            int i2 = keepAliveServiceBehaviorInteractor$couldStartServiceAsBackground$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                keepAliveServiceBehaviorInteractor$couldStartServiceAsBackground$1.label = i2 - Integer.MIN_VALUE;
                Object obj = keepAliveServiceBehaviorInteractor$couldStartServiceAsBackground$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = keepAliveServiceBehaviorInteractor$couldStartServiceAsBackground$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    keepAliveServiceBehaviorInteractor$couldStartServiceAsBackground$1.label = 1;
                    obj = this.b.b.b(keepAliveServiceBehaviorInteractor$couldStartServiceAsBackground$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                list = ((ygx) obj).c;
                if (!list.isEmpty()) {
                    return Boolean.TRUE;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((ygx.a) it.next()).b(this.c, this.d)) {
                        return Boolean.FALSE;
                    }
                }
                return Boolean.TRUE;
            }
        }
        keepAliveServiceBehaviorInteractor$couldStartServiceAsBackground$1 = new KeepAliveServiceBehaviorInteractor$couldStartServiceAsBackground$1(this, continuationImpl);
        Object obj2 = keepAliveServiceBehaviorInteractor$couldStartServiceAsBackground$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = keepAliveServiceBehaviorInteractor$couldStartServiceAsBackground$1.label;
        if (i != 0) {
        }
        list = ((ygx) obj2).c;
        if (!list.isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        KeepAliveServiceBehaviorInteractor$metricaTag$1 keepAliveServiceBehaviorInteractor$metricaTag$1;
        int i;
        if (continuationImpl instanceof KeepAliveServiceBehaviorInteractor$metricaTag$1) {
            keepAliveServiceBehaviorInteractor$metricaTag$1 = (KeepAliveServiceBehaviorInteractor$metricaTag$1) continuationImpl;
            int i2 = keepAliveServiceBehaviorInteractor$metricaTag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                keepAliveServiceBehaviorInteractor$metricaTag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = keepAliveServiceBehaviorInteractor$metricaTag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = keepAliveServiceBehaviorInteractor$metricaTag$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    keepAliveServiceBehaviorInteractor$metricaTag$1.label = 1;
                    obj = this.b.b.b(keepAliveServiceBehaviorInteractor$metricaTag$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((ygx) obj).e;
            }
        }
        keepAliveServiceBehaviorInteractor$metricaTag$1 = new KeepAliveServiceBehaviorInteractor$metricaTag$1(this, continuationImpl);
        Object obj2 = keepAliveServiceBehaviorInteractor$metricaTag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = keepAliveServiceBehaviorInteractor$metricaTag$1.label;
        if (i != 0) {
        }
        return ((ygx) obj2).e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        KeepAliveServiceBehaviorInteractor$shouldStartForegroundServiceForPushHandling$1 keepAliveServiceBehaviorInteractor$shouldStartForegroundServiceForPushHandling$1;
        int i;
        List list;
        if (continuationImpl instanceof KeepAliveServiceBehaviorInteractor$shouldStartForegroundServiceForPushHandling$1) {
            keepAliveServiceBehaviorInteractor$shouldStartForegroundServiceForPushHandling$1 = (KeepAliveServiceBehaviorInteractor$shouldStartForegroundServiceForPushHandling$1) continuationImpl;
            int i2 = keepAliveServiceBehaviorInteractor$shouldStartForegroundServiceForPushHandling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                keepAliveServiceBehaviorInteractor$shouldStartForegroundServiceForPushHandling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = keepAliveServiceBehaviorInteractor$shouldStartForegroundServiceForPushHandling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = keepAliveServiceBehaviorInteractor$shouldStartForegroundServiceForPushHandling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    keepAliveServiceBehaviorInteractor$shouldStartForegroundServiceForPushHandling$1.label = 1;
                    obj = this.b.b.b(keepAliveServiceBehaviorInteractor$shouldStartForegroundServiceForPushHandling$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                list = ((ygx) obj).d;
                if (!list.isEmpty()) {
                    return Boolean.TRUE;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((ygx.a) it.next()).b(this.c, this.d) && this.a.isPowerSaveMode()) {
                        return Boolean.TRUE;
                    }
                }
                return Boolean.FALSE;
            }
        }
        keepAliveServiceBehaviorInteractor$shouldStartForegroundServiceForPushHandling$1 = new KeepAliveServiceBehaviorInteractor$shouldStartForegroundServiceForPushHandling$1(this, continuationImpl);
        Object obj2 = keepAliveServiceBehaviorInteractor$shouldStartForegroundServiceForPushHandling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = keepAliveServiceBehaviorInteractor$shouldStartForegroundServiceForPushHandling$1.label;
        if (i != 0) {
        }
        list = ((ygx) obj2).d;
        if (!list.isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        KeepAliveServiceBehaviorInteractor$shouldStopForegroundOnAppResume$1 keepAliveServiceBehaviorInteractor$shouldStopForegroundOnAppResume$1;
        int i;
        List list;
        if (continuationImpl instanceof KeepAliveServiceBehaviorInteractor$shouldStopForegroundOnAppResume$1) {
            keepAliveServiceBehaviorInteractor$shouldStopForegroundOnAppResume$1 = (KeepAliveServiceBehaviorInteractor$shouldStopForegroundOnAppResume$1) continuationImpl;
            int i2 = keepAliveServiceBehaviorInteractor$shouldStopForegroundOnAppResume$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                keepAliveServiceBehaviorInteractor$shouldStopForegroundOnAppResume$1.label = i2 - Integer.MIN_VALUE;
                Object obj = keepAliveServiceBehaviorInteractor$shouldStopForegroundOnAppResume$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = keepAliveServiceBehaviorInteractor$shouldStopForegroundOnAppResume$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    keepAliveServiceBehaviorInteractor$shouldStopForegroundOnAppResume$1.label = 1;
                    obj = this.b.b.b(keepAliveServiceBehaviorInteractor$shouldStopForegroundOnAppResume$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                list = ((ygx) obj).b;
                if (!list.isEmpty()) {
                    return Boolean.TRUE;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((ygx.a) it.next()).b(this.c, this.d)) {
                        return Boolean.FALSE;
                    }
                }
                return Boolean.TRUE;
            }
        }
        keepAliveServiceBehaviorInteractor$shouldStopForegroundOnAppResume$1 = new KeepAliveServiceBehaviorInteractor$shouldStopForegroundOnAppResume$1(this, continuationImpl);
        Object obj2 = keepAliveServiceBehaviorInteractor$shouldStopForegroundOnAppResume$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = keepAliveServiceBehaviorInteractor$shouldStopForegroundOnAppResume$1.label;
        if (i != 0) {
        }
        list = ((ygx) obj2).b;
        if (!list.isEmpty()) {
        }
    }
}
