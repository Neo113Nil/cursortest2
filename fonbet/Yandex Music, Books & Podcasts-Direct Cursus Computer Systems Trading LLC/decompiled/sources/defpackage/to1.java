package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class to1 {
    public final List a;

    public to1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof to1) && this.a.equals(((to1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v3w.f("ArtistsTop(artists=", ")", this.a);
    }
}
