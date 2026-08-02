package F;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f934a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f935b;

    public m(Resources resources, Resources.Theme theme) {
        this.f934a = resources;
        this.f935b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f934a.equals(mVar.f934a) && Objects.equals(this.f935b, mVar.f935b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f934a, this.f935b);
    }
}
