package ru.yandex.taxi.logistics.deliveries.map.data;

import android.graphics.drawable.Drawable;
import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.go.pin.api.v2.d;
import defpackage.c0c0;
import defpackage.i1c0;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes5.dex */
public final class b {
    public final com.yandex.go.pin.api.widget.a a;

    public b(com.yandex.go.pin.api.widget.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Drawable drawable, int i, int i2, ContinuationImpl continuationImpl) {
        DeliveryMapPinFactory$createPin$1 deliveryMapPinFactory$createPin$1;
        int i3;
        if (continuationImpl instanceof DeliveryMapPinFactory$createPin$1) {
            deliveryMapPinFactory$createPin$1 = (DeliveryMapPinFactory$createPin$1) continuationImpl;
            int i4 = deliveryMapPinFactory$createPin$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                deliveryMapPinFactory$createPin$1.label = i4 - Integer.MIN_VALUE;
                Object obj = deliveryMapPinFactory$createPin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = deliveryMapPinFactory$createPin$1.label;
                if (i3 != 0) {
                    kotlin.b.b(obj);
                    deliveryMapPinFactory$createPin$1.L$0 = drawable;
                    deliveryMapPinFactory$createPin$1.I$0 = i;
                    deliveryMapPinFactory$createPin$1.I$1 = i2;
                    deliveryMapPinFactory$createPin$1.label = 1;
                    obj = this.a.b(deliveryMapPinFactory$createPin$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = deliveryMapPinFactory$createPin$1.I$1;
                    i = deliveryMapPinFactory$createPin$1.I$0;
                    drawable = (Drawable) deliveryMapPinFactory$createPin$1.L$0;
                    kotlin.b.b(obj);
                }
                return d.a((PinV2Component) obj, new i1c0(i2, i), PinV2Component.Position.ANCHORED, new SourceOnMapControl.a(new c0c0(drawable), null, null, false, false, null, null, 2046));
            }
        }
        deliveryMapPinFactory$createPin$1 = new DeliveryMapPinFactory$createPin$1(this, continuationImpl);
        Object obj2 = deliveryMapPinFactory$createPin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = deliveryMapPinFactory$createPin$1.label;
        if (i3 != 0) {
        }
        return d.a((PinV2Component) obj2, new i1c0(i2, i), PinV2Component.Position.ANCHORED, new SourceOnMapControl.a(new c0c0(drawable), null, null, false, false, null, null, 2046));
    }
}
