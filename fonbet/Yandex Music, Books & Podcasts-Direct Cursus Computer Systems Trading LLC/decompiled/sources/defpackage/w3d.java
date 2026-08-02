package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w3d implements a0q {
    public final d5d a;

    public w3d(d5d d5dVar) {
        d5dVar.getClass();
        this.a = d5dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w3d) && Intrinsics.d(this.a, ((w3d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GenerativeContentId(id=" + this.a + ")";
    }
}
