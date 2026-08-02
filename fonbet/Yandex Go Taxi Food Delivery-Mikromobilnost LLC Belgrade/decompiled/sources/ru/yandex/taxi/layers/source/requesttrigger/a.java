package ru.yandex.taxi.layers.source.requesttrigger;

import com.yandex.mapkit.map.CameraPosition;
import defpackage.ah00;
import defpackage.dp7;
import defpackage.gh00;
import defpackage.lb7;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ lb7 b;

    public a(vpr vprVar, lb7 lb7Var) {
        this.a = vprVar;
        this.b = lb7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CameraChangeSource$listenToCameraChange$$inlined$map$1$2$1 cameraChangeSource$listenToCameraChange$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof CameraChangeSource$listenToCameraChange$$inlined$map$1$2$1) {
            cameraChangeSource$listenToCameraChange$$inlined$map$1$2$1 = (CameraChangeSource$listenToCameraChange$$inlined$map$1$2$1) continuation;
            int i2 = cameraChangeSource$listenToCameraChange$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cameraChangeSource$listenToCameraChange$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cameraChangeSource$listenToCameraChange$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraChangeSource$listenToCameraChange$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    dp7 dp7Var = new dp7(((CameraPosition) obj).getZoom(), ru.yandex.taxi.map.utils.a.D(((gh00) ((ah00) this.b.c)).e.a()));
                    cameraChangeSource$listenToCameraChange$$inlined$map$1$2$1.L$0 = null;
                    cameraChangeSource$listenToCameraChange$$inlined$map$1$2$1.L$1 = null;
                    cameraChangeSource$listenToCameraChange$$inlined$map$1$2$1.L$2 = null;
                    cameraChangeSource$listenToCameraChange$$inlined$map$1$2$1.L$3 = null;
                    cameraChangeSource$listenToCameraChange$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(dp7Var, cameraChangeSource$listenToCameraChange$$inlined$map$1$2$1) == coroutineSingletons) {
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
        cameraChangeSource$listenToCameraChange$$inlined$map$1$2$1 = new CameraChangeSource$listenToCameraChange$$inlined$map$1$2$1(this, continuation);
        Object obj22 = cameraChangeSource$listenToCameraChange$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraChangeSource$listenToCameraChange$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
