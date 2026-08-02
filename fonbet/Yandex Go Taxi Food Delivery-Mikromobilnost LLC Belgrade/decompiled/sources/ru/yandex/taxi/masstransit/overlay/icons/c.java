package ru.yandex.taxi.masstransit.overlay.icons;

import android.graphics.Bitmap;
import defpackage.b64;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.unr0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.overlay.icons.VehicleIconView;

/* loaded from: classes6.dex */
public final class c {
    public final String a;
    public final int b;
    public final VehicleIconView.LabelDirection c;
    public final Bitmap d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public c(String str, int i, VehicleIconView.LabelDirection labelDirection, Bitmap bitmap, boolean z, boolean z2, int i2) {
        this.a = str;
        this.b = i;
        this.c = labelDirection;
        this.d = bitmap;
        this.e = z;
        this.f = z2;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return jl40.l(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && jl40.l(this.d, cVar.d) && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31)) * 31;
        Bitmap bitmap = this.d;
        return Integer.hashCode(this.g) + unr0.e(unr0.e((hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "State(name=", this.a, ", nameColor=", ", labelDirection=");
        u.append(this.c);
        u.append(", icon=");
        u.append(this.d);
        u.append(", showLabel=");
        nnm.v(", isSelected=", ", shadowOffset=", u, this.e, this.f);
        return oyr.m(this.g, Extension.C_BRAKE, u);
    }
}
