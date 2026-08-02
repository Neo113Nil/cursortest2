package ru.yandex.taxi.scheduleride.deeplink;

import defpackage.egz;
import defpackage.ehv0;
import defpackage.fx60;
import defpackage.hre0;
import defpackage.hxx;
import defpackage.inm0;
import defpackage.jnm0;
import defpackage.k9s0;
import defpackage.lnm0;
import defpackage.m950;
import defpackage.nnm0;
import defpackage.nse0;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.qtb1;
import defpackage.v770;
import defpackage.xpb1;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes9.dex */
public final class a extends jnm0 {
    public final nnm0 b;
    public final fx60 c;
    public final lnm0 d;

    public a(nnm0 nnm0Var, fx60 fx60Var, lnm0 lnm0Var) {
        this.b = nnm0Var;
        this.c = fx60Var;
        this.d = lnm0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d((inm0) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r12.d.b(r13, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(inm0 inm0Var, ContinuationImpl continuationImpl) {
        ScheduleRideDeeplinkHandler$handleDeeplink$1 scheduleRideDeeplinkHandler$handleDeeplink$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ScheduleRideDeeplinkHandler$handleDeeplink$1) {
            scheduleRideDeeplinkHandler$handleDeeplink$1 = (ScheduleRideDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = scheduleRideDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scheduleRideDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                obj = scheduleRideDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scheduleRideDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.DEEPLINK;
                    scheduleRideDeeplinkHandler$handleDeeplink$1.L$0 = null;
                    scheduleRideDeeplinkHandler$handleDeeplink$1.L$1 = inm0Var;
                    scheduleRideDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    scheduleRideDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    scheduleRideDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = this.c.c(events$Zalogin$LoginContext, scheduleRideDeeplinkHandler$handleDeeplink$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        nnm0 nnm0Var = this.b;
                        oep0 oep0Var = nnm0Var.b;
                        m950 m950Var = (m950) nnm0Var.a.get();
                        qtb1 qtb1Var = qtb1.M;
                        k9s0 k9s0Var = k9s0.f;
                        ((pep0) oep0Var).f(m950Var, new hre0(qtb1Var, new nse0(egz.H(new ehv0(0), null, 4)), "show summary with scheduled ride", true, xpb1.c), hxx.a);
                        return zy11.a;
                    }
                    inm0Var = (inm0) scheduleRideDeeplinkHandler$handleDeeplink$1.L$1;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    scheduleRideDeeplinkHandler$handleDeeplink$1.L$0 = null;
                    scheduleRideDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    scheduleRideDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    scheduleRideDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    scheduleRideDeeplinkHandler$handleDeeplink$1.label = 2;
                }
                return zy11.a;
            }
        }
        scheduleRideDeeplinkHandler$handleDeeplink$1 = new ScheduleRideDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        obj = scheduleRideDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scheduleRideDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }
}
