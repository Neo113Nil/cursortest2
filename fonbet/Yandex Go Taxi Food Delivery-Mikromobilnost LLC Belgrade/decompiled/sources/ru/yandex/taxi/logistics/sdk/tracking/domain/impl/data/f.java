package ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data;

import defpackage.aci;
import defpackage.c801;
import defpackage.f801;
import defpackage.fzw;
import defpackage.gri;
import defpackage.jqr;
import defpackage.ls50;
import defpackage.ny61;
import defpackage.ps50;
import defpackage.pxy0;
import defpackage.rz50;
import defpackage.t701;
import defpackage.u701;
import defpackage.w701;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.h;

/* loaded from: classes5.dex */
public final class f {
    public final d a;
    public final c801 b;
    public final h c;
    public final aci d;
    public final String e;

    public f(f801 f801Var, d dVar, c801 c801Var, h hVar, aci aciVar) {
        this.a = dVar;
        this.b = c801Var;
        this.c = hVar;
        this.d = aciVar;
        this.e = f801Var.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, ContinuationImpl continuationImpl) {
        TrackingStateSourceRepository$loadTrackingState$1 trackingStateSourceRepository$loadTrackingState$1;
        int i;
        int i2;
        rz50 rz50Var;
        int i3;
        String str = fVar.e;
        if (continuationImpl instanceof TrackingStateSourceRepository$loadTrackingState$1) {
            trackingStateSourceRepository$loadTrackingState$1 = (TrackingStateSourceRepository$loadTrackingState$1) continuationImpl;
            int i4 = trackingStateSourceRepository$loadTrackingState$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                trackingStateSourceRepository$loadTrackingState$1.label = i4 - Integer.MIN_VALUE;
                Object obj = trackingStateSourceRepository$loadTrackingState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingStateSourceRepository$loadTrackingState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Integer num = (Integer) fVar.d.a.get(str);
                    int intValue = num != null ? num.intValue() : 0;
                    d dVar = fVar.a;
                    pxy0 pxy0Var = new pxy0(18, fVar);
                    trackingStateSourceRepository$loadTrackingState$1.I$0 = intValue;
                    trackingStateSourceRepository$loadTrackingState$1.label = 1;
                    Object a = dVar.a(str, pxy0Var, trackingStateSourceRepository$loadTrackingState$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i2 = intValue;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = trackingStateSourceRepository$loadTrackingState$1.I$0;
                    kotlin.b.b(obj);
                }
                rz50Var = (rz50) obj;
                if (rz50Var != null) {
                    return null;
                }
                ps50 ps50Var = rz50Var.b;
                gri griVar = (gri) rz50Var.a;
                return ps50Var == null ? griVar == null ? w701.a : new t701(griVar, i2) : (!(ps50Var instanceof ls50) || 400 > (i3 = ((ls50) ps50Var).a) || i3 >= 500) ? fVar.b() : u701.a;
            }
        }
        trackingStateSourceRepository$loadTrackingState$1 = new TrackingStateSourceRepository$loadTrackingState$1(fVar, continuationImpl);
        Object obj2 = trackingStateSourceRepository$loadTrackingState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingStateSourceRepository$loadTrackingState$1.label;
        if (i != 0) {
        }
        rz50Var = (rz50) obj2;
        if (rz50Var != null) {
        }
    }

    public final t701 b() {
        Pair pair = (Pair) this.b.a.get(this.e);
        if (pair != null) {
            return new t701((gri) pair.getFirst(), ((Number) pair.getSecond()).intValue());
        }
        return null;
    }

    public final jqr c() {
        return new jqr(new fzw(29, this.c.a(this.e), this), new TrackingStateSourceRepository$trackingFlow$2(2, this, f.class, "updateCache", "updateCache(Lru/yandex/taxi/logistics/sdk/tracking/domain/api/TrackingState;)V", 4), 3);
    }
}
