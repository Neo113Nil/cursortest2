package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lult;", "", "Companion", "slt", "tlt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ult {
    public static final tlt Companion = new tlt();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public /* synthetic */ ult(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z3;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z4;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z5;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z6;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z7;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z8;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ult)) {
            return false;
        }
        ult ultVar = (ult) obj;
        return this.a == ultVar.a && this.b == ultVar.b && this.c == ultVar.c && this.d == ultVar.d && this.e == ultVar.e && this.f == ultVar.f && this.g == ultVar.g && this.h == ultVar.h && this.i == ultVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder u = qv10.u("GnssSatelliteParams(svid=", ", constellationType=", ", cn0DbHz=", this.a, this.b);
        nnm.v(", elevationDegrees=", ", azimuthDegrees=", u, this.c, this.d);
        nnm.v(", carrierFrequencyHz=", ", usedInFix=", u, this.e, this.f);
        nnm.v(", hasAlmanac=", ", hasEphemeris=", u, this.g, this.h);
        return x4e.i(u, this.i, Extension.C_BRAKE);
    }

    public ult(int i) {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
    }

    public ult() {
        this(0);
    }
}
