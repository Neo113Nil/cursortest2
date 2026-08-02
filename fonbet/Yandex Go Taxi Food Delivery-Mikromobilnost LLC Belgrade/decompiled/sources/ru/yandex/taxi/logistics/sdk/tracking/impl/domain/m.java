package ru.yandex.taxi.logistics.sdk.tracking.impl.domain;

import defpackage.cw;
import defpackage.d301;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.p670;
import defpackage.vn;
import defpackage.w511;
import defpackage.x201;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class m {
    public final ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.c a;
    public final x201 b;
    public final d301 c;

    public m(ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.c cVar, x201 x201Var, d301 d301Var) {
        this.a = cVar;
        this.b = x201Var;
        this.c = d301Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(vn vnVar, ContinuationImpl continuationImpl) {
        TrackingOnFirstLoadActionHandler$handle$2 trackingOnFirstLoadActionHandler$handle$2;
        Object obj;
        int i;
        vn vnVar2;
        cw cwVar;
        String str;
        if (continuationImpl instanceof TrackingOnFirstLoadActionHandler$handle$2) {
            trackingOnFirstLoadActionHandler$handle$2 = (TrackingOnFirstLoadActionHandler$handle$2) continuationImpl;
            int i2 = trackingOnFirstLoadActionHandler$handle$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingOnFirstLoadActionHandler$handle$2.label = i2 - Integer.MIN_VALUE;
                obj = trackingOnFirstLoadActionHandler$handle$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingOnFirstLoadActionHandler$handle$2.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cw cwVar2 = vnVar.i;
                    if (cwVar2 == null) {
                        if (cwVar2 != null) {
                            w511.b();
                            return null;
                        }
                        str = vnVar.e;
                        if (str != null) {
                            this.c.a(str);
                        }
                        this.b.a(new p670(vnVar.a, vnVar.b, vnVar.c, vnVar.d, vnVar.f));
                        return zy11Var;
                    }
                    String str2 = vnVar.a;
                    String str3 = cwVar2.a;
                    trackingOnFirstLoadActionHandler$handle$2.L$0 = vnVar;
                    trackingOnFirstLoadActionHandler$handle$2.L$1 = cwVar2;
                    trackingOnFirstLoadActionHandler$handle$2.label = 1;
                    Object c = this.a.c(str2, str3, trackingOnFirstLoadActionHandler$handle$2);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    vnVar2 = vnVar;
                    cwVar = cwVar2;
                    obj = c;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cwVar = (cw) trackingOnFirstLoadActionHandler$handle$2.L$1;
                    vnVar2 = (vn) trackingOnFirstLoadActionHandler$handle$2.L$0;
                    kotlin.b.b(obj);
                }
                if (!jl40.l(obj, cwVar.b)) {
                    return zy11Var;
                }
                vnVar = vnVar2;
                str = vnVar.e;
                if (str != null) {
                }
                this.b.a(new p670(vnVar.a, vnVar.b, vnVar.c, vnVar.d, vnVar.f));
                return zy11Var;
            }
        }
        trackingOnFirstLoadActionHandler$handle$2 = new TrackingOnFirstLoadActionHandler$handle$2(this, continuationImpl);
        obj = trackingOnFirstLoadActionHandler$handle$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingOnFirstLoadActionHandler$handle$2.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (!jl40.l(obj, cwVar.b)) {
        }
    }
}
