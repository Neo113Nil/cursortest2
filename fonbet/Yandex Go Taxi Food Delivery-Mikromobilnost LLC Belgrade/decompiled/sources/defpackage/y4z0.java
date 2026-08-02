package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dashboard.model.common.ImagePositionModel;
import ru.yandex.taxi.logistics.sdk.dashboard.model.common.TileStyle;

/* loaded from: classes5.dex */
public final class y4z0 {
    public final yau a;
    public final s4z0 b;
    public final u3b1 c;
    public final z3b1 d;
    public final hhg e;
    public final w4v f;
    public final ImagePositionModel g;
    public final TileStyle h;
    public final Object i;
    public final String j;

    public y4z0(yau yauVar, s4z0 s4z0Var, u3b1 u3b1Var, z3b1 z3b1Var, hhg hhgVar, w4v w4vVar, ImagePositionModel imagePositionModel, TileStyle tileStyle, Object obj, String str) {
        this.a = yauVar;
        this.b = s4z0Var;
        this.c = u3b1Var;
        this.d = z3b1Var;
        this.e = hhgVar;
        this.f = w4vVar;
        this.g = imagePositionModel;
        this.h = tileStyle;
        this.i = obj;
        this.j = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4z0)) {
            return false;
        }
        y4z0 y4z0Var = (y4z0) obj;
        return jl40.l(this.a, y4z0Var.a) && jl40.l(this.b, y4z0Var.b) && jl40.l(this.c, y4z0Var.c) && jl40.l(this.d, y4z0Var.d) && jl40.l(this.e, y4z0Var.e) && jl40.l(this.f, y4z0Var.f) && this.g == y4z0Var.g && this.h == y4z0Var.h && jl40.l(this.i, y4z0Var.i) && jl40.l(this.j, y4z0Var.j);
    }

    public final int hashCode() {
        yau yauVar = this.a;
        int hashCode = (yauVar == null ? 0 : yauVar.hashCode()) * 31;
        s4z0 s4z0Var = this.b;
        int hashCode2 = (hashCode + (s4z0Var == null ? 0 : s4z0Var.hashCode())) * 31;
        u3b1 u3b1Var = this.c;
        int hashCode3 = (hashCode2 + (u3b1Var == null ? 0 : u3b1Var.hashCode())) * 31;
        z3b1 z3b1Var = this.d;
        int hashCode4 = (hashCode3 + (z3b1Var == null ? 0 : z3b1Var.hashCode())) * 31;
        hhg hhgVar = this.e;
        int hashCode5 = (hashCode4 + (hhgVar == null ? 0 : hhgVar.hashCode())) * 31;
        w4v w4vVar = this.f;
        int hashCode6 = (this.h.hashCode() + ((this.g.hashCode() + ((hashCode5 + (w4vVar == null ? 0 : w4vVar.hashCode())) * 31)) * 31)) * 961;
        Object obj = this.i;
        int hashCode7 = (hashCode6 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.j;
        return hashCode7 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TileModel(header=" + this.a + ", footer=" + this.b + ", background=" + this.c + ", badge=" + this.d + ", action=" + this.e + ", image=" + this.f + ", imagePosition=" + this.g + ", style=" + this.h + ", accessibilityLabel=null, meta=" + this.i + ", metricaLabel=" + this.j + Extension.C_BRAKE;
    }
}
