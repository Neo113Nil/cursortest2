package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ro8 extends wo8 {
    public final double a;
    public final om8 b;
    public final pm8 c;
    public final Uri d;
    public final boolean e;
    public final g39 f;
    public final List g;

    public ro8(double d, om8 om8Var, pm8 pm8Var, Uri uri, boolean z, g39 g39Var, ArrayList arrayList) {
        this.a = d;
        this.b = om8Var;
        this.c = pm8Var;
        this.d = uri;
        this.e = z;
        this.f = g39Var;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro8)) {
            return false;
        }
        ro8 ro8Var = (ro8) obj;
        return Double.compare(this.a, ro8Var.a) == 0 && this.b == ro8Var.b && this.c == ro8Var.c && Intrinsics.d(this.d, ro8Var.d) && this.e == ro8Var.e && this.f == ro8Var.f && Intrinsics.d(this.g, ro8Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + k5r.e((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Double.hashCode(this.a) * 31)) * 31)) * 31)) * 31, 31, this.e)) * 31;
        List list = this.g;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Image(alpha=");
        sb.append(this.a);
        sb.append(", contentAlignmentHorizontal=");
        sb.append(this.b);
        sb.append(", contentAlignmentVertical=");
        sb.append(this.c);
        sb.append(", imageUrl=");
        sb.append(this.d);
        sb.append(", preloadRequired=");
        sb.append(this.e);
        sb.append(", scale=");
        sb.append(this.f);
        sb.append(", filters=");
        return eta.h(sb, this.g, ')');
    }
}
