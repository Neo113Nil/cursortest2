package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class ido extends zwj implements Serializable {
    private static final long serialVersionUID = 0;
    public final zwj a;

    public ido(zwj zwjVar) {
        this.a = zwjVar;
    }

    @Override // defpackage.zwj
    public final zwj a() {
        return this.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ido) {
            return this.a.equals(((ido) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a + ".reverse()";
    }
}
