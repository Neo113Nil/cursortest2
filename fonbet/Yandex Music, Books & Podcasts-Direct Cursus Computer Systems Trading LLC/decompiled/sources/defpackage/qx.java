package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class qx {
    public final ArrayList a;

    public qx(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qx) && this.a.equals(((qx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("AlbumRelatedContentBlocks(blocks=", ")", this.a);
    }
}
