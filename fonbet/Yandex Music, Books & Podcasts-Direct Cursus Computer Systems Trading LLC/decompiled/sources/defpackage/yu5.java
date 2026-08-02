package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class yu5 {
    public final ArrayList a;

    public yu5(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yu5) && this.a.equals(((yu5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("ConcertGalleryData(photoList=", ")", this.a);
    }
}
