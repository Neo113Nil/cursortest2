package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrlt;", "", "Companion", "plt", "qlt", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class rlt {
    public static final qlt Companion = new qlt();
    public final Integer a;
    public final Integer b;
    public final Float c;
    public final Float d;
    public final Float e;
    public final Float f;
    public final Boolean g;
    public final Boolean h;
    public final Boolean i;

    public /* synthetic */ rlt(int i, Integer num, Integer num2, Float f, Float f2, Float f3, Float f4, Boolean bool, Boolean bool2, Boolean bool3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = f;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = f2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = f3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = f4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlt)) {
            return false;
        }
        rlt rltVar = (rlt) obj;
        return jl40.l(this.a, rltVar.a) && jl40.l(this.b, rltVar.b) && jl40.l(this.c, rltVar.c) && jl40.l(this.d, rltVar.d) && jl40.l(this.e, rltVar.e) && jl40.l(this.f, rltVar.f) && jl40.l(this.g, rltVar.g) && jl40.l(this.h, rltVar.h) && jl40.l(this.i, rltVar.i);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.c;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.d;
        int hashCode4 = (hashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.e;
        int hashCode5 = (hashCode4 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.f;
        int hashCode6 = (hashCode5 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Boolean bool = this.g;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.h;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.i;
        return hashCode8 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GnssSatelliteData(svid=");
        sb.append(this.a);
        sb.append(", constellationType=");
        sb.append(this.b);
        sb.append(", cn0DbHz=");
        sb.append(this.c);
        sb.append(", elevationDegrees=");
        sb.append(this.d);
        sb.append(", azimuthDegrees=");
        sb.append(this.e);
        sb.append(", carrierFrequencyHz=");
        sb.append(this.f);
        sb.append(", usedInFix=");
        sb.append(this.g);
        sb.append(", hasAlmanac=");
        sb.append(this.h);
        sb.append(", hasEphemeris=");
        return nzs.d(sb, this.i, Extension.C_BRAKE);
    }

    public rlt() {
        this(0);
    }

    public rlt(Integer num, Integer num2, Float f, Float f2, Float f3, Float f4, Boolean bool, Boolean bool2, Boolean bool3) {
        this.a = num;
        this.b = num2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = bool;
        this.h = bool2;
        this.i = bool3;
    }

    public /* synthetic */ rlt(int i) {
        this(null, null, null, null, null, null, null, null, null);
    }
}
