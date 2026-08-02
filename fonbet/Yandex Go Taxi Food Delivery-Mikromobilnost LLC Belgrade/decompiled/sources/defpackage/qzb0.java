package defpackage;

import com.yandex.mapkit.maps.core.geometry.Point;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;

/* loaded from: classes7.dex */
public final class qzb0 {
    public final mwb0 a;
    public final float b;
    public final Point c;
    public final Float d;
    public final PinState e;
    public final String f;

    public qzb0(mwb0 mwb0Var, float f, Point point, PinState pinState, int i) {
        Float valueOf = Float.valueOf(0.0f);
        pinState = (i & 16) != 0 ? PinState.ICON_LABEL_M : pinState;
        this.a = mwb0Var;
        this.b = f;
        this.c = point;
        this.d = valueOf;
        this.e = pinState;
        this.f = "";
        PinState pinState2 = PinState.INVISIBLE;
        if (pinState.compareTo(pinState2) > 0) {
            return;
        }
        vg10.r(pinState2, "Pin max state must not be ");
        throw null;
    }

    public final mwb0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzb0)) {
            return false;
        }
        qzb0 qzb0Var = (qzb0) obj;
        return jl40.l(this.a, qzb0Var.a) && Float.compare(this.b, qzb0Var.b) == 0 && jl40.l(this.c, qzb0Var.c) && jl40.l(this.d, qzb0Var.d) && this.e == qzb0Var.e && jl40.l(this.f, qzb0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + g8e.c(this.b, this.a.hashCode() * 31, 31)) * 31;
        Float f = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((hashCode + (f == null ? 0 : f.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "PinSeed(id=" + this.a + ", priority=" + this.b + ", coordinates=" + this.c + ", mustBeVisibleAtZoom=" + this.d + ", maxState=" + this.e + ", type=" + this.f + Extension.C_BRAKE;
    }
}
