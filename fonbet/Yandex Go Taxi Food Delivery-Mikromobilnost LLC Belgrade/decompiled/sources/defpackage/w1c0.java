package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.yandexmaps.multiplatform.pin.war.ClusteringZoomStep;

/* loaded from: classes13.dex */
public final class w1c0 {
    public final v1c0 a;
    public final float b;
    public final ClusteringZoomStep c;

    public w1c0(v1c0 v1c0Var, float f, ClusteringZoomStep clusteringZoomStep) {
        this.a = v1c0Var;
        this.b = f;
        this.c = clusteringZoomStep;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1c0)) {
            return false;
        }
        w1c0 w1c0Var = (w1c0) obj;
        return jl40.l(this.a, w1c0Var.a) && Float.compare(this.b, w1c0Var.b) == 0 && this.c == w1c0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + g8e.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "PinWarClusteringParams(clusteringMode=" + this.a + ", clusterRadiusInPoints=" + this.b + ", zoomStep=" + this.c + Extension.C_BRAKE;
    }

    public w1c0() {
        this(7);
    }

    public /* synthetic */ w1c0(int i) {
        this(u1c0.a, 60.0f, ClusteringZoomStep.FULL);
    }
}
