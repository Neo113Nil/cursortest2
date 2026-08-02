package defpackage;

import com.yandex.mapkit.geometry.Point;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rxi0 implements sxi0 {
    public final Point a;

    public rxi0(Point point) {
        this.a = point;
    }

    public final Point a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxi0) && this.a.equals(((rxi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ZoomTo(point=" + this.a + Extension.C_BRAKE;
    }
}
