package defpackage;

import java.util.List;

/* loaded from: classes9.dex */
public final class v4x implements j5x {
    public final List a;

    public v4x(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v4x) && this.a.equals(((v4x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.t(new StringBuilder("JasonArray(content="), this.a, ')');
    }
}
