package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zgg extends avf {
    public final ArrayList c;

    public zgg(ArrayList arrayList) {
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zgg) && this.c.equals(((zgg) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return f1d.h("EntitiesState(entities=", ")", this.c);
    }
}
