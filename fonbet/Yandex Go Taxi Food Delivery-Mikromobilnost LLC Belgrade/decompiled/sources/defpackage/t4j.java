package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.superapp.orders.models.ActionAccessibilityType;

/* loaded from: classes14.dex */
public final class t4j {
    public final Drawable a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final ActionAccessibilityType h;
    public final sls i;

    public /* synthetic */ t4j(Drawable drawable, String str, int i, int i2, String str2, String str3, sls slsVar, int i3) {
        this((i3 & 1) != 0 ? null : drawable, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, "", (i3 & 32) != 0 ? "" : str2, (i3 & 64) != 0 ? "" : str3, null, (i3 & 256) != 0 ? new bgc(12) : slsVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4j)) {
            return false;
        }
        t4j t4jVar = (t4j) obj;
        return jl40.l(this.a, t4jVar.a) && jl40.l(this.b, t4jVar.b) && this.c == t4jVar.c && this.d == t4jVar.d && jl40.l(this.e, t4jVar.e) && jl40.l(this.f, t4jVar.f) && jl40.l(this.g, t4jVar.g) && this.h == t4jVar.h && jl40.l(this.i, t4jVar.i);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int b = unr0.b(unr0.b(unr0.b(oyr.b(this.d, oyr.b(this.c, unr0.b((drawable == null ? 0 : drawable.hashCode()) * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g);
        ActionAccessibilityType actionAccessibilityType = this.h;
        return this.i.hashCode() + ((b + (actionAccessibilityType != null ? actionAccessibilityType.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(icon=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", textColor=");
        vfc.u(this.c, this.d, ", backgroundColor=", ", badgeText=", sb);
        g8e.D(sb, this.e, ", contentDescription=", this.f, ", analyticsName=");
        sb.append(this.g);
        sb.append(", actionAccessibilityType=");
        sb.append(this.h);
        sb.append(", onClick=");
        return ly3.r(sb, this.i, Extension.C_BRAKE);
    }

    public t4j() {
        this(null, null, 0, 0, null, null, null, 511);
    }

    public t4j(Drawable drawable, String str, int i, int i2, String str2, String str3, String str4, ActionAccessibilityType actionAccessibilityType, sls slsVar) {
        this.a = drawable;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = actionAccessibilityType;
        this.i = slsVar;
    }
}
