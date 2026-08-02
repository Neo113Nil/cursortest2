package defpackage;

import com.yandex.mapkit.map.VisibleRegion;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class r6c0 {
    public final VisibleRegion a;
    public final float b;

    public r6c0(VisibleRegion visibleRegion, float f) {
        this.a = visibleRegion;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6c0)) {
            return false;
        }
        r6c0 r6c0Var = (r6c0) obj;
        return jl40.l(this.a, r6c0Var.a) && Float.compare(this.b, r6c0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CameraSnapshot(region=" + this.a + ", zoom=" + this.b + Extension.C_BRAKE;
    }
}
