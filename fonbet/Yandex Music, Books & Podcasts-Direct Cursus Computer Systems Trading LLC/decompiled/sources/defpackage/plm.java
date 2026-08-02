package defpackage;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
public final class plm implements olm, Serializable {
    private static final long serialVersionUID = 0;
    public final List a;

    public plm(List list) {
        this.a = list;
    }

    @Override // defpackage.olm
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return true;
            }
            if (!((olm) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof plm) {
            return this.a.equals(((plm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
