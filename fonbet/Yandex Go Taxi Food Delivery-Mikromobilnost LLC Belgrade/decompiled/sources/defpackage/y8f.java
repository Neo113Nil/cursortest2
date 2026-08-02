package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class y8f {
    public final LinkedHashMap a = new LinkedHashMap();

    public abstract Object a(x8f x8fVar);

    public final boolean equals(Object obj) {
        if (obj instanceof y8f) {
            return jl40.l(this.a, ((y8f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ')';
    }
}
