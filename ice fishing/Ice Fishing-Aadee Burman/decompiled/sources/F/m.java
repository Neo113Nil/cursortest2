package F;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f871a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f872b;

    public m(Resources resources, Resources.Theme theme) {
        this.f871a = resources;
        this.f872b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f871a.equals(mVar.f871a) && Objects.equals(this.f872b, mVar.f872b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f871a, this.f872b);
    }
}
