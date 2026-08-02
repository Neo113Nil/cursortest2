package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.preorder.source.points.StopPointsProvider$StopPointPlace;

/* loaded from: classes6.dex */
public final class tgu0 {
    public final int a;
    public final String b;
    public final boolean c;
    public final StopPointsProvider$StopPointPlace d;

    public tgu0(int i, String str, boolean z, StopPointsProvider$StopPointPlace stopPointsProvider$StopPointPlace) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = stopPointsProvider$StopPointPlace;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgu0)) {
            return false;
        }
        tgu0 tgu0Var = (tgu0) obj;
        return this.a == tgu0Var.a && jl40.l(this.b, tgu0Var.b) && this.c == tgu0Var.c && this.d == tgu0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e(unr0.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "Key(position=", ", color=", this.b, ", withShadow=");
        v.append(this.c);
        v.append(", place=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
