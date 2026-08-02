package ru.yandex.taxi.logistics.sdk.tracking.impl.domain;

import defpackage.bgc;
import defpackage.dri;
import defpackage.eri;
import defpackage.fri;
import defpackage.m8s0;
import defpackage.ny61;
import defpackage.qqi;
import defpackage.rqi;
import defpackage.sqi;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class n {
    public final com.yandex.go.urbanads.b a;
    public final com.yandex.delivery.utils.storage.impl.c b;

    public n(com.yandex.go.urbanads.b bVar, com.yandex.delivery.utils.storage.impl.c cVar) {
        this.a = bVar;
        this.b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0063, code lost:
    
        if (r14 == r0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(dri driVar, ContinuationImpl continuationImpl) {
        TrackingPopupHandler$handle$1 trackingPopupHandler$handle$1;
        Object obj;
        int i;
        dri driVar2;
        boolean booleanValue;
        if (continuationImpl instanceof TrackingPopupHandler$handle$1) {
            trackingPopupHandler$handle$1 = (TrackingPopupHandler$handle$1) continuationImpl;
            int i2 = trackingPopupHandler$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingPopupHandler$handle$1.label = i2 - Integer.MIN_VALUE;
                TrackingPopupHandler$handle$1 trackingPopupHandler$handle$12 = trackingPopupHandler$handle$1;
                obj = trackingPopupHandler$handle$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingPopupHandler$handle$12.label;
                com.yandex.delivery.utils.storage.impl.c cVar = this.b;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m8s0 m8s0Var = driVar.b;
                    trackingPopupHandler$handle$12.L$0 = driVar;
                    trackingPopupHandler$handle$12.label = 1;
                    obj = cVar.b(m8s0Var, trackingPopupHandler$handle$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        driVar2 = (dri) trackingPopupHandler$handle$12.L$0;
                        kotlin.b.b(obj);
                        booleanValue = ((Boolean) obj).booleanValue();
                        if (booleanValue) {
                            m8s0 m8s0Var2 = driVar2.b;
                            trackingPopupHandler$handle$12.L$0 = null;
                            trackingPopupHandler$handle$12.L$1 = null;
                            trackingPopupHandler$handle$12.Z$0 = booleanValue;
                            trackingPopupHandler$handle$12.label = 3;
                            if (cVar.a(m8s0Var2, trackingPopupHandler$handle$12) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return zy11Var;
                    }
                    driVar = (dri) trackingPopupHandler$handle$12.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    sqi sqiVar = driVar.a;
                    if (sqiVar instanceof rqi) {
                        fri friVar = ((rqi) sqiVar).a;
                        String str = friVar.a;
                        eri eriVar = friVar.b;
                        String str2 = eriVar != null ? eriVar.a : null;
                        String str3 = eriVar != null ? eriVar.b : null;
                        trackingPopupHandler$handle$12.L$0 = driVar;
                        trackingPopupHandler$handle$12.L$1 = null;
                        trackingPopupHandler$handle$12.label = 2;
                        int i3 = 12;
                        obj = this.a.b(str, str2, str3, new bgc(i3), new bgc(i3), trackingPopupHandler$handle$12);
                        if (obj != coroutineSingletons) {
                            driVar2 = driVar;
                            booleanValue = ((Boolean) obj).booleanValue();
                            if (booleanValue) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (!(sqiVar instanceof qqi)) {
                        w511.b();
                        return null;
                    }
                }
                return zy11Var;
            }
        }
        trackingPopupHandler$handle$1 = new TrackingPopupHandler$handle$1(this, continuationImpl);
        TrackingPopupHandler$handle$1 trackingPopupHandler$handle$122 = trackingPopupHandler$handle$1;
        obj = trackingPopupHandler$handle$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingPopupHandler$handle$122.label;
        com.yandex.delivery.utils.storage.impl.c cVar2 = this.b;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11Var2;
    }
}
