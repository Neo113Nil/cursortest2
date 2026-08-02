package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t1h implements v1h {
    public final l1h a;

    public t1h(l1h l1hVar) {
        l1hVar.getClass();
        this.a = l1hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1h) && Intrinsics.d(this.a, ((t1h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Placeholder(headerUiState=" + this.a + ")";
    }
}
