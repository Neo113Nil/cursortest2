package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class sy8 implements pre {
    public final String a;
    public final ArrayList b;
    public final int c;
    public final o690 d;
    public final mx8 e;
    public final Integer f;
    public final x2s g;

    public sy8(String str, ArrayList arrayList, int i, o690 o690Var, mx8 mx8Var, Integer num, x2s x2sVar) {
        this.a = str;
        this.b = arrayList;
        this.c = i;
        this.d = o690Var;
        this.e = mx8Var;
        this.f = num;
        this.g = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy8)) {
            return false;
        }
        sy8 sy8Var = (sy8) obj;
        return jl40.l(this.a, sy8Var.a) && this.b.equals(sy8Var.b) && this.c == sy8Var.c && jl40.l(this.d, sy8Var.d) && jl40.l(this.e, sy8Var.e) && jl40.l(this.f, sy8Var.f) && this.g.equals(sy8Var.g);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "carousel-items";
    }

    public final int hashCode() {
        int b = oyr.b(this.c, ly3.b(this.a.hashCode() * 31, 31, this.b), 31);
        o690 o690Var = this.d;
        int hashCode = (b + (o690Var == null ? 0 : o690Var.hashCode())) * 31;
        mx8 mx8Var = this.e;
        int hashCode2 = (hashCode + (mx8Var == null ? 0 : mx8Var.hashCode())) * 31;
        Integer num = this.f;
        return this.g.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = x4e.m("CarouselItemsRemoteCoreWidget(id=", this.a, ", items=", ", itemHeight=", this.b);
        m.append(this.c);
        m.append(", horizontalPaddings=");
        m.append(this.d);
        m.append(", indicatorsStyle=");
        m.append(this.e);
        m.append(", autoscrollIntervalSeconds=");
        m.append(this.f);
        m.append(", analyticsData=");
        m.append(this.g);
        m.append(Extension.C_BRAKE);
        return m.toString();
    }
}
