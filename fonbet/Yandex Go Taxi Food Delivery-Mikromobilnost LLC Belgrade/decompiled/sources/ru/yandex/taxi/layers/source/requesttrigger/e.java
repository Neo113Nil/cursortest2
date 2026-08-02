package ru.yandex.taxi.layers.source.requesttrigger;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import defpackage.dp7;
import defpackage.gyx;
import defpackage.j73;
import defpackage.ny61;
import defpackage.uc4;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;
    public final /* synthetic */ gyx c;

    public e(vpr vprVar, g gVar, gyx gyxVar) {
        this.a = vprVar;
        this.b = gVar;
        this.c = gyxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a4, code lost:
    
        if (ru.yandex.taxi.map.utils.a.s(r5, new com.yandex.mapkit.geometry.BoundingBox(r7, new com.yandex.mapkit.geometry.Point(r2.a, r2.b))) == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$2$1 cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof CameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$2$1) {
            cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$2$1 = (CameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$2$1) continuation;
            int i2 = cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    dp7 dp7Var = (dp7) obj;
                    this.b.getClass();
                    gyx gyxVar = this.c;
                    Float[] fArr = gyxVar.d;
                    float f = dp7Var.a;
                    if (((Number) j73.C(fArr)).floatValue() < f && f <= ((Number) j73.O(fArr)).floatValue()) {
                        uc4 uc4Var = dp7Var.b;
                        uc4 uc4Var2 = gyxVar.a;
                        zzs zzsVar = uc4Var.a;
                        Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                        Point point = new Point(zzsVar.a, zzsVar.b);
                        zzs zzsVar2 = uc4Var.b;
                        BoundingBox boundingBox = new BoundingBox(point, new Point(zzsVar2.a, zzsVar2.b));
                        zzs zzsVar3 = uc4Var2.a;
                        Point point2 = new Point(zzsVar3.a, zzsVar3.b);
                        zzs zzsVar4 = uc4Var2.b;
                    }
                    cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$2$1.L$0 = null;
                    cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$2$1.L$1 = null;
                    cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$2$1.L$2 = null;
                    cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$2$1.L$3 = null;
                    cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$2$1.label = 1;
                    if (this.a.emit(obj, cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$2$1 = new CameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
