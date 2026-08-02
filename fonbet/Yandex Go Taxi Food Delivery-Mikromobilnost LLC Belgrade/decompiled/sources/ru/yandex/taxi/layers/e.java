package ru.yandex.taxi.layers;

import defpackage.ah00;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qwc;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class e {
    public final ah00 a;
    public final qwc b;
    public final po21 c;

    public e(ah00 ah00Var, qwc qwcVar, po21 po21Var) {
        this.a = ah00Var;
        this.b = qwcVar;
        this.c = po21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MapStateProviderImpl$getCurrentUserLocation$1 mapStateProviderImpl$getCurrentUserLocation$1;
        int i;
        if (continuationImpl instanceof MapStateProviderImpl$getCurrentUserLocation$1) {
            mapStateProviderImpl$getCurrentUserLocation$1 = (MapStateProviderImpl$getCurrentUserLocation$1) continuationImpl;
            int i2 = mapStateProviderImpl$getCurrentUserLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapStateProviderImpl$getCurrentUserLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapStateProviderImpl$getCurrentUserLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapStateProviderImpl$getCurrentUserLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mapStateProviderImpl$getCurrentUserLocation$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.c).h(mapStateProviderImpl$getCurrentUserLocation$1);
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
                return ((mo21) obj).a();
            }
        }
        mapStateProviderImpl$getCurrentUserLocation$1 = new MapStateProviderImpl$getCurrentUserLocation$1(this, continuationImpl);
        Object obj2 = mapStateProviderImpl$getCurrentUserLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapStateProviderImpl$getCurrentUserLocation$1.label;
        if (i != 0) {
        }
        return ((mo21) obj2).a();
    }
}
