package yads;

import defpackage.ag71;
import java.io.Serializable;
import java.util.List;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes7.dex */
public final class je2 implements ag71, Serializable {
    private static final long serialVersionUID = 0;
    public final List b;

    public je2(List list) {
        this.b = list;
    }

    @Override // defpackage.ag71
    public final boolean apply(Object obj) {
        for (int i = 0; i < this.b.size(); i++) {
            if (!((ag71) this.b.get(i)).apply(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof je2) {
            return this.b.equals(((je2) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.b;
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : list) {
            if (!z) {
                sb.append(HexString.CHAR_COMMA);
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
