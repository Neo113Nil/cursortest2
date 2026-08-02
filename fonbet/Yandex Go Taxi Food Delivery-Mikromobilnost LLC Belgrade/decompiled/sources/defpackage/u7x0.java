package defpackage;

import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class u7x0 {
    public static final u7x0 b = new u7x0(b.f());
    public final Map a;

    public u7x0(Map map) {
        this.a = map;
    }

    public final Object a() {
        return wav.class.cast(this.a.get(wav.class));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u7x0) {
            return jl40.l(this.a, ((u7x0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.n(new StringBuilder("Tags(tags="), this.a, ')');
    }
}
