package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.map.WalkingRouteUiState;

/* loaded from: classes6.dex */
public final class ry1 {
    public static final ry1 e = new ry1(0);
    public final qy1 a;
    public final qy1 b;
    public final vy1 c;
    public final WalkingRouteUiState d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ry1(int i) {
        this(r10, r10, null, new WalkingRouteUiState(null, null, 0.0f, null, null, null, null, HProv.PP_VERSION_TIMESTAMP));
        qy1 qy1Var = qy1.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry1)) {
            return false;
        }
        ry1 ry1Var = (ry1) obj;
        return jl40.l(this.a, ry1Var.a) && jl40.l(this.b, ry1Var.b) && jl40.l(this.c, ry1Var.c) && jl40.l(this.d, ry1Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        vy1 vy1Var = this.c;
        return this.d.hashCode() + ((hashCode + (vy1Var == null ? 0 : vy1Var.hashCode())) * 31);
    }

    public final String toString() {
        return "AltpinBMapUiState(alternativeBubble=" + this.a + ", destinationBubble=" + this.b + ", sourceBubble=" + this.c + ", walkingRouteState=" + this.d + Extension.C_BRAKE;
    }

    public ry1(qy1 qy1Var, qy1 qy1Var2, vy1 vy1Var, WalkingRouteUiState walkingRouteUiState) {
        this.a = qy1Var;
        this.b = qy1Var2;
        this.c = vy1Var;
        this.d = walkingRouteUiState;
    }

    public ry1() {
        this(0);
    }
}
