package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ry8 extends n351 {
    public final List c;
    public final float d;
    public final l690 e;
    public final nx8 f;
    public final Long g;
    public final x2s h;
    public final String i;

    public ry8(List list, float f, l690 l690Var, nx8 nx8Var, Long l, x2s x2sVar, String str) {
        super("carousel-items", false, 14);
        this.c = list;
        this.d = f;
        this.e = l690Var;
        this.f = nx8Var;
        this.g = l;
        this.h = x2sVar;
        this.i = str;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry8)) {
            return false;
        }
        ry8 ry8Var = (ry8) obj;
        return jl40.l(this.c, ry8Var.c) && y7m.b(this.d, ry8Var.d) && this.e.equals(ry8Var.e) && jl40.l(this.f, ry8Var.f) && jl40.l(this.g, ry8Var.g) && this.h.equals(ry8Var.h) && jl40.l(this.i, ry8Var.i);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + g8e.c(this.d, this.c.hashCode() * 31, 31)) * 31;
        nx8 nx8Var = this.f;
        int hashCode2 = (hashCode + (nx8Var == null ? 0 : nx8Var.hashCode())) * 31;
        Long l = this.g;
        int a = tse0.a(this.h, (hashCode2 + (l == null ? 0 : l.hashCode())) * 31, 31);
        String str = this.i;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = xvz.s("CarouselItemsModel(items=", this.c, ", itemHeight=", y7m.c(this.d), ", horizontalPaddings=");
        s.append(this.e);
        s.append(", indicatorsStyle=");
        s.append(this.f);
        s.append(", autoscrollIntervalMs=");
        s.append(this.g);
        s.append(", onShownAnalyticsData=");
        s.append(this.h);
        s.append(", id=");
        return oyr.t(s, this.i, Extension.C_BRAKE);
    }
}
