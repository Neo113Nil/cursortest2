package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class vx71 {
    public final b971 a;
    public final al81 b;
    public final o481 c;
    public final hr81 d;
    public final ru71 e;
    public final xx71 f;
    public final List g;
    public final List h;

    public vx71(b971 b971Var, al81 al81Var, o481 o481Var, hr81 hr81Var, ru71 ru71Var, xx71 xx71Var, List list, List list2) {
        this.a = b971Var;
        this.b = al81Var;
        this.c = o481Var;
        this.d = hr81Var;
        this.e = ru71Var;
        this.f = xx71Var;
        this.g = list;
        this.h = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx71)) {
            return false;
        }
        vx71 vx71Var = (vx71) obj;
        return this.a.equals(vx71Var.a) && this.b.equals(vx71Var.b) && this.c.equals(vx71Var.c) && this.d.equals(vx71Var.d) && this.e.equals(vx71Var.e) && this.f.equals(vx71Var.f) && this.g.equals(vx71Var.g) && this.h.equals(vx71Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + unr0.c(unr0.e((this.e.hashCode() + ly3.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d.a)) * 31, 31, this.f.a), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DebugPanelData(appData=");
        sb.append(this.a);
        sb.append(", sdkData=");
        sb.append(this.b);
        sb.append(", networkSettingsData=");
        sb.append(this.c);
        sb.append(", adaptersData=");
        sb.append(this.d);
        sb.append(", consentsData=");
        sb.append(this.e);
        sb.append(", debugErrorIndicatorData=");
        sb.append(this.f);
        sb.append(", adUnits=");
        return vfc.p(sb, this.g, ", alerts=", this.h, Extension.C_BRAKE);
    }
}
