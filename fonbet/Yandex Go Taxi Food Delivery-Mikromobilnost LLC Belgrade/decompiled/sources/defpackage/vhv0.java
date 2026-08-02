package defpackage;

import android.graphics.Rect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class vhv0 {
    public final boolean a;
    public final Rect b;
    public final int c;
    public final int d;

    public vhv0(boolean z, Rect rect, int i, int i2) {
        this.a = z;
        this.b = rect;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhv0)) {
            return false;
        }
        vhv0 vhv0Var = (vhv0) obj;
        return this.a == vhv0Var.a && jl40.l(this.b, vhv0Var.b) && this.c == vhv0Var.c && this.d == vhv0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SummaryMarginsState(routeVisible=");
        sb.append(this.a);
        sb.append(", addToFavoritesRect=");
        sb.append(this.b);
        sb.append(", plusOffset=");
        return ly3.k(this.c, this.d, ", surgeOffset=", Extension.C_BRAKE, sb);
    }
}
