package ru.yandex.taxi.location.lbs;

import defpackage.h3y;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class c {
    public final h3y a;
    public final h3y b;
    public boolean c;

    public c(h3y h3yVar, h3y h3yVar2) {
        this.a = h3yVar;
        this.b = h3yVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        LbsPollingStarterImpl$startPolling$1 lbsPollingStarterImpl$startPolling$1;
        int i;
        if (continuationImpl instanceof LbsPollingStarterImpl$startPolling$1) {
            lbsPollingStarterImpl$startPolling$1 = (LbsPollingStarterImpl$startPolling$1) continuationImpl;
            int i2 = lbsPollingStarterImpl$startPolling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbsPollingStarterImpl$startPolling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lbsPollingStarterImpl$startPolling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lbsPollingStarterImpl$startPolling$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (!this.c) {
                    this.c = true;
                    LbsPollingStarterImpl$startPolling$2 lbsPollingStarterImpl$startPolling$2 = new LbsPollingStarterImpl$startPolling$2(this, null);
                    lbsPollingStarterImpl$startPolling$1.label = 1;
                    if (jl40.O(lbsPollingStarterImpl$startPolling$2, lbsPollingStarterImpl$startPolling$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        lbsPollingStarterImpl$startPolling$1 = new LbsPollingStarterImpl$startPolling$1(this, continuationImpl);
        Object obj2 = lbsPollingStarterImpl$startPolling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lbsPollingStarterImpl$startPolling$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r6.f(r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        if (r6.d(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        LbsPollingStarterImpl$stopPolling$1 lbsPollingStarterImpl$stopPolling$1;
        int i;
        if (continuationImpl instanceof LbsPollingStarterImpl$stopPolling$1) {
            lbsPollingStarterImpl$stopPolling$1 = (LbsPollingStarterImpl$stopPolling$1) continuationImpl;
            int i2 = lbsPollingStarterImpl$stopPolling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbsPollingStarterImpl$stopPolling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lbsPollingStarterImpl$stopPolling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lbsPollingStarterImpl$stopPolling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (this.c) {
                        ru.yandex.taxi.location.lbs.gsm.a aVar = (ru.yandex.taxi.location.lbs.gsm.a) this.b.get();
                        lbsPollingStarterImpl$stopPolling$1.label = 1;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    this.c = false;
                    return zy11.a;
                }
                kotlin.b.b(obj);
                ru.yandex.taxi.location.lbs.wifi.a aVar2 = (ru.yandex.taxi.location.lbs.wifi.a) this.a.get();
                lbsPollingStarterImpl$stopPolling$1.label = 2;
            }
        }
        lbsPollingStarterImpl$stopPolling$1 = new LbsPollingStarterImpl$stopPolling$1(this, continuationImpl);
        Object obj2 = lbsPollingStarterImpl$stopPolling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lbsPollingStarterImpl$stopPolling$1.label;
        if (i != 0) {
        }
        ru.yandex.taxi.location.lbs.wifi.a aVar22 = (ru.yandex.taxi.location.lbs.wifi.a) this.a.get();
        lbsPollingStarterImpl$stopPolling$1.label = 2;
    }
}
