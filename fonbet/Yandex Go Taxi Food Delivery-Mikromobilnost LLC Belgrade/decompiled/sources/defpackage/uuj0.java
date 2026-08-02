package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class uuj0 {
    public final Resources a;
    public final Resources.Theme b;

    public uuj0(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uuj0.class == obj.getClass()) {
            uuj0 uuj0Var = (uuj0) obj;
            if (this.a.equals(uuj0Var.a) && Objects.equals(this.b, uuj0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
