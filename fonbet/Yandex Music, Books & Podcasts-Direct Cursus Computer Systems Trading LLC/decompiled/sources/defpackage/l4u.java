package defpackage;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class l4u {
    public final ArrayList a;

    public l4u(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l4u) && this.a.equals(((l4u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("VideoClipInfo(videoClipInfo=", ")", this.a);
    }
}
