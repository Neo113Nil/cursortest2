package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d3o {
    public final Resources a;
    public final Resources.Theme b;

    public d3o(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d3o.class == obj.getClass()) {
            d3o d3oVar = (d3o) obj;
            if (this.a.equals(d3oVar.a) && Objects.equals(this.b, d3oVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
