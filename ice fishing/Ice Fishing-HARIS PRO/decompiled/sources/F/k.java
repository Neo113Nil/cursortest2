package F;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f213a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f214b;

    public k(Resources resources, Resources.Theme theme) {
        this.f213a = resources;
        this.f214b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f213a.equals(kVar.f213a) && Objects.equals(this.f214b, kVar.f214b);
    }

    public final int hashCode() {
        return Objects.hash(this.f213a, this.f214b);
    }
}
