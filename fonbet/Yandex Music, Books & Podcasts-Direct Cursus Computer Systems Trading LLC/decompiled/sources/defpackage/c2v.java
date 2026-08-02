package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c2v implements f2v, e2v {
    public final tyt a;

    public c2v(tyt tytVar) {
        tytVar.getClass();
        this.a = tytVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2v) && Intrinsics.d(this.a, ((c2v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Various(subtypeSource=" + this.a + ")";
    }
}
