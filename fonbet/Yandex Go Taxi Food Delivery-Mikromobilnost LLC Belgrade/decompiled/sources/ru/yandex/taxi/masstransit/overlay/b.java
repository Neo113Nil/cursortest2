package ru.yandex.taxi.masstransit.overlay;

import android.graphics.Bitmap;
import defpackage.f631;
import defpackage.g631;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g631 b;

    public b(vpr vprVar, g631 g631Var) {
        this.a = vprVar;
        this.b = g631Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        VehicleVariantImageRepositoryImpl$loadImage$$inlined$map$1$2$1 vehicleVariantImageRepositoryImpl$loadImage$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof VehicleVariantImageRepositoryImpl$loadImage$$inlined$map$1$2$1) {
            vehicleVariantImageRepositoryImpl$loadImage$$inlined$map$1$2$1 = (VehicleVariantImageRepositoryImpl$loadImage$$inlined$map$1$2$1) continuation;
            int i2 = vehicleVariantImageRepositoryImpl$loadImage$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vehicleVariantImageRepositoryImpl$loadImage$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = vehicleVariantImageRepositoryImpl$loadImage$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vehicleVariantImageRepositoryImpl$loadImage$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    f631 f631Var = new f631(this.b, (Bitmap) obj);
                    vehicleVariantImageRepositoryImpl$loadImage$$inlined$map$1$2$1.L$0 = null;
                    vehicleVariantImageRepositoryImpl$loadImage$$inlined$map$1$2$1.L$1 = null;
                    vehicleVariantImageRepositoryImpl$loadImage$$inlined$map$1$2$1.L$2 = null;
                    vehicleVariantImageRepositoryImpl$loadImage$$inlined$map$1$2$1.L$3 = null;
                    vehicleVariantImageRepositoryImpl$loadImage$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(f631Var, vehicleVariantImageRepositoryImpl$loadImage$$inlined$map$1$2$1) == coroutineSingletons) {
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
        vehicleVariantImageRepositoryImpl$loadImage$$inlined$map$1$2$1 = new VehicleVariantImageRepositoryImpl$loadImage$$inlined$map$1$2$1(this, continuation);
        Object obj22 = vehicleVariantImageRepositoryImpl$loadImage$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vehicleVariantImageRepositoryImpl$loadImage$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
