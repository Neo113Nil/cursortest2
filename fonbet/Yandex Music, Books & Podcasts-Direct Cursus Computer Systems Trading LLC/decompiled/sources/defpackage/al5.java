package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class al5 extends zwj implements Serializable {
    private static final long serialVersionUID = 0;
    public final mj a;

    public al5(mj mjVar) {
        this.a = mjVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof al5) {
            return this.a.equals(((al5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
