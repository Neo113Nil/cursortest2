package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class oy implements uy {
    public final List a;

    public oy(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy) && this.a.equals(((oy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v3w.f("DuplicateAlbums(albumList=", ")", this.a);
    }
}
