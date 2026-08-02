package defpackage;

import com.yandex.plus.core.graphql.type.SECTION_VIEW_TYPE;
import java.util.List;

/* loaded from: classes2.dex */
public final class r1e {
    public final List a;
    public final List b;
    public final SECTION_VIEW_TYPE c;

    public r1e(List list, List list2, SECTION_VIEW_TYPE section_view_type) {
        this.a = list;
        this.b = list2;
        this.c = section_view_type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1e)) {
            return false;
        }
        r1e r1eVar = (r1e) obj;
        return jl40.l(this.a, r1eVar.a) && jl40.l(this.b, r1eVar.b) && this.c == r1eVar.c;
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return this.c.hashCode() + ((hashCode + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ConfigurationSectionFragment(metaShortcuts=" + this.a + ", shortcuts=" + this.b + ", viewType=" + this.c + ')';
    }
}
