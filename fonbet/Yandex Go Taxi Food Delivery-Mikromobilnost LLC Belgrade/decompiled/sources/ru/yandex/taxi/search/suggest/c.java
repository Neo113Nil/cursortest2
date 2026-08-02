package ru.yandex.taxi.search.suggest;

import defpackage.g2t;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g2t b;

    public c(vpr vprVar, g2t g2tVar) {
        this.a = vprVar;
        this.b = g2tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PointAddressInteractor$updatePhotoAddressFlow$lambda$0$$inlined$map$1$2$1 pointAddressInteractor$updatePhotoAddressFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PointAddressInteractor$updatePhotoAddressFlow$lambda$0$$inlined$map$1$2$1) {
            pointAddressInteractor$updatePhotoAddressFlow$lambda$0$$inlined$map$1$2$1 = (PointAddressInteractor$updatePhotoAddressFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = pointAddressInteractor$updatePhotoAddressFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pointAddressInteractor$updatePhotoAddressFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = pointAddressInteractor$updatePhotoAddressFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pointAddressInteractor$updatePhotoAddressFlow$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = new Pair(this.b, (pv0) obj);
                    pointAddressInteractor$updatePhotoAddressFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    pointAddressInteractor$updatePhotoAddressFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    pointAddressInteractor$updatePhotoAddressFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    pointAddressInteractor$updatePhotoAddressFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    pointAddressInteractor$updatePhotoAddressFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, pointAddressInteractor$updatePhotoAddressFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        pointAddressInteractor$updatePhotoAddressFlow$lambda$0$$inlined$map$1$2$1 = new PointAddressInteractor$updatePhotoAddressFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = pointAddressInteractor$updatePhotoAddressFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pointAddressInteractor$updatePhotoAddressFlow$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
