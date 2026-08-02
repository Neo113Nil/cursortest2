package ru.yandex.taxi.am;

import defpackage.hge0;
import defpackage.jst;
import defpackage.ny61;
import defpackage.xby;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;

/* loaded from: classes9.dex */
public final class e0 implements hge0 {
    public final MainUiAvailabilityMonitor a;

    public e0(MainUiAvailabilityMonitor mainUiAvailabilityMonitor) {
        this.a = mainUiAvailabilityMonitor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (r12 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0046, code lost:
    
        if (r12 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.hge0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MainUiAutoLoginDelayCondition$performAction$1 mainUiAutoLoginDelayCondition$performAction$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof MainUiAutoLoginDelayCondition$performAction$1) {
            mainUiAutoLoginDelayCondition$performAction$1 = (MainUiAutoLoginDelayCondition$performAction$1) continuationImpl;
            int i2 = mainUiAutoLoginDelayCondition$performAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainUiAutoLoginDelayCondition$performAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainUiAutoLoginDelayCondition$performAction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainUiAutoLoginDelayCondition$performAction$1.label;
                MainUiAvailabilityMonitor mainUiAvailabilityMonitor = this.a;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mainUiAutoLoginDelayCondition$performAction$1.label = 1;
                    obj = b(5000L, mainUiAutoLoginDelayCondition$performAction$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            if (!((Boolean) mainUiAvailabilityMonitor.c.getValue()).booleanValue()) {
                                xby.t(jst.e, "Autologin.UiDelay.SplashLongTimeout", null, null, 14);
                            }
                            if (!((Boolean) mainUiAvailabilityMonitor.d.getValue()).booleanValue()) {
                                xby.t(jst.e, "Autologin.UiDelay.FirstLaunchTimeout", null, null, 14);
                            }
                        }
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    if (!((Boolean) mainUiAvailabilityMonitor.c.getValue()).booleanValue()) {
                        xby.t(jst.e, "Autologin.UiDelay.SplashTimeout", null, null, 14);
                    }
                    if (!((Boolean) mainUiAvailabilityMonitor.d.getValue()).booleanValue()) {
                        mainUiAutoLoginDelayCondition$performAction$1.Z$0 = booleanValue;
                        mainUiAutoLoginDelayCondition$performAction$1.label = 2;
                        obj = b(15000L, mainUiAutoLoginDelayCondition$performAction$1);
                    }
                }
                return zy11Var;
            }
        }
        mainUiAutoLoginDelayCondition$performAction$1 = new MainUiAutoLoginDelayCondition$performAction$1(this, continuationImpl);
        Object obj3 = mainUiAutoLoginDelayCondition$performAction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainUiAutoLoginDelayCondition$performAction$1.label;
        MainUiAvailabilityMonitor mainUiAvailabilityMonitor2 = this.a;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj3).booleanValue();
        if (!booleanValue) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, ContinuationImpl continuationImpl) {
        MainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$1 mainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$1;
        int i;
        try {
            if (continuationImpl instanceof MainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$1) {
                mainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$1 = (MainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$1) continuationImpl;
                int i2 = mainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = mainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        MainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$2 mainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$2 = new MainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$2(this, null);
                        mainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$1.J$0 = j;
                        mainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$1.label = 1;
                        if (kotlinx.coroutines.a.u(j, mainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$2, mainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return Boolean.TRUE;
                }
            }
            if (i != 0) {
            }
            return Boolean.TRUE;
        } catch (TimeoutCancellationException unused) {
            return Boolean.FALSE;
        }
        mainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$1 = new MainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$1(this, continuationImpl);
        Object obj2 = mainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$1.label;
    }
}
