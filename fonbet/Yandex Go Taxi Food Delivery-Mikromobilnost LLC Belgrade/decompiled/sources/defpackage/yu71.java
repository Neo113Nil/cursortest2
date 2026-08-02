package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.j80;
import yads.k80;
import yads.l80;

@gsq0
/* loaded from: classes7.dex */
public final class yu71 {
    public static final vr71 Companion = new vr71();
    public static final i3y[] g;
    public final b971 a;
    public final al81 b;
    public final List c;
    public final ru71 d;
    public final List e;
    public final List f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, a.b(lazyThreadSafetyMode, j80.w), null, a.b(lazyThreadSafetyMode, k80.w), a.b(lazyThreadSafetyMode, l80.w)};
    }

    public yu71(int i, b971 b971Var, al81 al81Var, List list, ru71 ru71Var, List list2, List list3) {
        if (63 != (i & 63)) {
            qje.Z(i, 63, nf71.b);
            throw null;
        }
        this.a = b971Var;
        this.b = al81Var;
        this.c = list;
        this.d = ru71Var;
        this.e = list2;
        this.f = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu71)) {
            return false;
        }
        yu71 yu71Var = (yu71) obj;
        return jl40.l(this.a, yu71Var.a) && jl40.l(this.b, yu71Var.b) && jl40.l(this.c, yu71Var.c) && jl40.l(this.d, yu71Var.d) && jl40.l(this.e, yu71Var.e) && jl40.l(this.f, yu71Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.c((this.d.hashCode() + unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DebugPanelReportData(appData=");
        sb.append(this.a);
        sb.append(", sdkData=");
        sb.append(this.b);
        sb.append(", networksData=");
        sb.append(this.c);
        sb.append(", consentsData=");
        sb.append(this.d);
        sb.append(", sdkLogs=");
        return vfc.p(sb, this.e, ", networkLogs=", this.f, Extension.C_BRAKE);
    }

    public yu71(b971 b971Var, al81 al81Var, ArrayList arrayList, ru71 ru71Var, List list, List list2) {
        this.a = b971Var;
        this.b = al81Var;
        this.c = arrayList;
        this.d = ru71Var;
        this.e = list;
        this.f = list2;
    }
}
