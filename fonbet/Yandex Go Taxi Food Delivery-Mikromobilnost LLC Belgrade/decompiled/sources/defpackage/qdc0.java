package defpackage;

import com.yandex.go.places.map.domain.entities.PlacesPinWarV2Config$GeometryEasing;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinWarGeometryEasing;

/* loaded from: classes13.dex */
public final class qdc0 {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r9 == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n1c0 a(hdc0 hdc0Var) {
        PinWarGeometryEasing pinWarGeometryEasing;
        if (hdc0Var == null) {
            return null;
        }
        Float f = hdc0Var.a;
        float floatValue = f != null ? f.floatValue() : 0.2f;
        Double d = hdc0Var.b;
        double doubleValue = d != null ? d.doubleValue() : 5.0d;
        Double d2 = hdc0Var.c;
        double doubleValue2 = d2 != null ? d2.doubleValue() : 1.0E-6d;
        PlacesPinWarV2Config$GeometryEasing placesPinWarV2Config$GeometryEasing = hdc0Var.d;
        if (placesPinWarV2Config$GeometryEasing != null) {
            int i = pdc0.a[placesPinWarV2Config$GeometryEasing.ordinal()];
            if (i == 1) {
                pinWarGeometryEasing = PinWarGeometryEasing.LINEAR;
            } else if (i == 2) {
                pinWarGeometryEasing = PinWarGeometryEasing.EASE_IN;
            } else if (i == 3) {
                pinWarGeometryEasing = PinWarGeometryEasing.EASE_OUT;
            } else {
                if (i != 4) {
                    w511.b();
                    return null;
                }
                pinWarGeometryEasing = PinWarGeometryEasing.EASE_IN_OUT;
            }
        }
        pinWarGeometryEasing = PinWarGeometryEasing.EASE_OUT;
        return new n1c0(floatValue, doubleValue, doubleValue2, pinWarGeometryEasing);
    }

    public static s1c0 b(zm91 zm91Var) {
        if (zm91Var.equals(jdc0.g)) {
            return qtb1.K;
        }
        if (zm91Var.equals(jdc0.h)) {
            return vvb1.K;
        }
        if (zm91Var instanceof idc0) {
            return new r1c0(((idc0) zm91Var).g);
        }
        w511.b();
        return null;
    }
}
