package k7;

import java.util.List;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f38692a;

    public a(List list) {
        this.f38692a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        List list = this.f38692a;
        if (list == null) {
            if (aVar.f38692a != null) {
                return false;
            }
        } else if (!list.equals(aVar.f38692a)) {
            return false;
        }
        aVar.getClass();
        return true;
    }

    public final int hashCode() {
        List list = this.f38692a;
        return ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return "Advice{explicitBucketBoundaries=" + this.f38692a + ", attributes=null}";
    }
}
