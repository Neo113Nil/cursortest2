package defpackage;

import com.yandex.mapkit.geometry.BoundingBox;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class z6w0 {
    public final BoundingBox a;

    public z6w0(BoundingBox boundingBox) {
        this.a = boundingBox;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z6w0) && jl40.l(this.a, ((z6w0) obj).a);
    }

    public final int hashCode() {
        BoundingBox boundingBox = this.a;
        if (boundingBox == null) {
            return 0;
        }
        return boundingBox.hashCode();
    }

    public final String toString() {
        return "Ready(bbox=" + this.a + Extension.C_BRAKE;
    }
}
