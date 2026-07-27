package F;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f925a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f926b;

    public m(Resources resources, Resources.Theme theme) {
        this.f925a = resources;
        this.f926b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f925a.equals(mVar.f925a) && Objects.equals(this.f926b, mVar.f926b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f925a, this.f926b);
    }
}
