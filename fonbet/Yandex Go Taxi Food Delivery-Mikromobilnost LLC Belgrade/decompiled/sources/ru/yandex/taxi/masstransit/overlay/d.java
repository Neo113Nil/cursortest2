package ru.yandex.taxi.masstransit.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.runtime.image.ImageProvider;
import defpackage.d631;
import defpackage.e0h0;
import defpackage.e631;
import defpackage.g16;
import defpackage.h631;
import defpackage.ny61;
import defpackage.obv;
import defpackage.pav;
import defpackage.pzt0;
import defpackage.tse;
import defpackage.u8b1;
import defpackage.w511;
import defpackage.wel0;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.masstransit.model.RouteType;
import ru.yandex.taxi.masstransit.model.VariantStyle;

/* loaded from: classes6.dex */
public final class d implements e631 {
    public final pav b;
    public final tse c;
    public final Context d;
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public pzt0 f;

    public d(pav pavVar, tse tseVar, Context context) {
        this.b = pavVar;
        this.c = tseVar;
        this.d = context;
    }

    public final Bitmap a(RouteType routeType, VariantStyle.VariantType variantType) {
        int i;
        int i2 = h631.a[variantType.ordinal()];
        if (i2 == 1) {
            e631.a.getClass();
            return d631.b;
        }
        Context context = this.d;
        if (i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                return u8b1.h(e0h0.ic_masstransit_vehicle_point_variant, context);
            }
            w511.b();
            return null;
        }
        switch (wel0.a[routeType.ordinal()]) {
            case 1:
                i = e0h0.ic_masstransit_vehicle_icon_bus;
                break;
            case 2:
            case 3:
                i = e0h0.ic_masstransit_vehicle_icon_minibus;
                break;
            case 4:
                i = e0h0.ic_masstransit_vehicle_icon_tram;
                break;
            case 5:
                i = e0h0.ic_masstransit_vehicle_icon_troley;
                break;
            case 6:
                i = e0h0.ic_masstransit_train;
                break;
            case 7:
                i = e0h0.ic_masstransit_ship;
                break;
            case 8:
                i = e0h0.ic_masstransit_funicular;
                break;
            case 9:
                i = e0h0.ic_masstransit_cableway;
                break;
            case 10:
                i = e0h0.ic_masstransit_aero;
                break;
            case 11:
                i = e0h0.ic_masstransit_metro;
                break;
            default:
                i = e0h0.ic_masstransit_vehicle_icon_bus;
                break;
        }
        return u8b1.h(i, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        VehicleVariantImageRepositoryImpl$getImage$1 vehicleVariantImageRepositoryImpl$getImage$1;
        int i;
        Bitmap bitmap;
        if (continuationImpl instanceof VehicleVariantImageRepositoryImpl$getImage$1) {
            vehicleVariantImageRepositoryImpl$getImage$1 = (VehicleVariantImageRepositoryImpl$getImage$1) continuationImpl;
            int i2 = vehicleVariantImageRepositoryImpl$getImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vehicleVariantImageRepositoryImpl$getImage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = vehicleVariantImageRepositoryImpl$getImage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vehicleVariantImageRepositoryImpl$getImage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g16 c = this.b.b().i(new obv(str, null, 6, 0)).c();
                    vehicleVariantImageRepositoryImpl$getImage$1.L$0 = str;
                    vehicleVariantImageRepositoryImpl$getImage$1.label = 1;
                    obj = ru.yandex.taxi.utils.a.b(c, vehicleVariantImageRepositoryImpl$getImage$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) vehicleVariantImageRepositoryImpl$getImage$1.L$0;
                    kotlin.b.b(obj);
                }
                bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    return ImageProvider.fromBitmap(bitmap, true, str);
                }
                return null;
            }
        }
        vehicleVariantImageRepositoryImpl$getImage$1 = new VehicleVariantImageRepositoryImpl$getImage$1(this, continuationImpl);
        Object obj2 = vehicleVariantImageRepositoryImpl$getImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vehicleVariantImageRepositoryImpl$getImage$1.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap == null) {
        }
    }
}
