package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class rcc implements scc {
    public final List a;

    public rcc(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rcc) && this.a.equals(((rcc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v3w.f("Success(filters=", ")", this.a);
    }
}
