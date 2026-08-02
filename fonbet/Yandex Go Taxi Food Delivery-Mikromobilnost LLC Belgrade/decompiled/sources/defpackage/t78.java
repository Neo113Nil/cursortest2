package defpackage;

import com.yandex.go.taxi.order.models.api.promotions.ObjectAppearanceOverride;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class t78 {
    public final v48 a;
    public final ObjectAppearanceOverride b;

    public t78(v48 v48Var, ObjectAppearanceOverride objectAppearanceOverride) {
        this.a = v48Var;
        this.b = objectAppearanceOverride;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t78)) {
            return false;
        }
        t78 t78Var = (t78) obj;
        return jl40.l(this.a, t78Var.a) && jl40.l(this.b, t78Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ObjectAppearanceOverride objectAppearanceOverride = this.b;
        return hashCode + (objectAppearanceOverride == null ? 0 : objectAppearanceOverride.hashCode());
    }

    public final String toString() {
        return "CarRenderState(carIconData=" + this.a + ", override=" + this.b + Extension.C_BRAKE;
    }
}
