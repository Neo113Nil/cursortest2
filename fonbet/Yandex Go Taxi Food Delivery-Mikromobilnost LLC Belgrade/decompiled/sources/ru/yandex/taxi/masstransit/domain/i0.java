package ru.yandex.taxi.masstransit.domain;

import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class i0 {
    public final po21 a;

    public i0(po21 po21Var) {
        this.a = po21Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (((ru.yandex.taxi.preorder.source.userposition.e) r6).d(r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SDKGeoInteractorImpl$getCurrentLocation$1 sDKGeoInteractorImpl$getCurrentLocation$1;
        Object obj;
        int i;
        if (continuationImpl instanceof SDKGeoInteractorImpl$getCurrentLocation$1) {
            sDKGeoInteractorImpl$getCurrentLocation$1 = (SDKGeoInteractorImpl$getCurrentLocation$1) continuationImpl;
            int i2 = sDKGeoInteractorImpl$getCurrentLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sDKGeoInteractorImpl$getCurrentLocation$1.label = i2 - Integer.MIN_VALUE;
                obj = sDKGeoInteractorImpl$getCurrentLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sDKGeoInteractorImpl$getCurrentLocation$1.label;
                po21 po21Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sDKGeoInteractorImpl$getCurrentLocation$1.label = 1;
                    obj = Boolean.valueOf(((ru.yandex.taxi.preorder.source.userposition.e) po21Var).f.b());
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return ((mo21) obj).a();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    sDKGeoInteractorImpl$getCurrentLocation$1.label = 3;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).f(sDKGeoInteractorImpl$getCurrentLocation$1);
                }
                if (((Boolean) obj).booleanValue()) {
                    sDKGeoInteractorImpl$getCurrentLocation$1.label = 2;
                }
                sDKGeoInteractorImpl$getCurrentLocation$1.label = 3;
                obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).f(sDKGeoInteractorImpl$getCurrentLocation$1);
            }
        }
        sDKGeoInteractorImpl$getCurrentLocation$1 = new SDKGeoInteractorImpl$getCurrentLocation$1(this, continuationImpl);
        obj = sDKGeoInteractorImpl$getCurrentLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sDKGeoInteractorImpl$getCurrentLocation$1.label;
        po21 po21Var2 = this.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        sDKGeoInteractorImpl$getCurrentLocation$1.label = 3;
        obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var2).f(sDKGeoInteractorImpl$getCurrentLocation$1);
    }
}
