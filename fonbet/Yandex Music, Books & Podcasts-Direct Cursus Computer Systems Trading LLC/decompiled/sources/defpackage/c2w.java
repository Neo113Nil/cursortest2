package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class c2w implements e2w {
    public final List a;

    public c2w(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2w) && this.a.equals(((c2w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v3w.f("Loaded(recommendedArtists=", ")", this.a);
    }
}
