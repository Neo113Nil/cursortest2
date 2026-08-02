package defpackage;

import com.yandex.mapkit.geometry.BoundingBox;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class z911 implements ga11 {
    public final BoundingBox a;

    public z911(BoundingBox boundingBox) {
        this.a = boundingBox;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z911) && jl40.l(this.a, ((z911) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRoute(routeBoundaryBox=" + this.a + Extension.C_BRAKE;
    }
}
