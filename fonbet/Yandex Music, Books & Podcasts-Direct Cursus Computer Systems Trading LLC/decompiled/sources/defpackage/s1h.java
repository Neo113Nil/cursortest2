package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s1h implements v1h {
    public final l1h a;

    public s1h(l1h l1hVar) {
        l1hVar.getClass();
        this.a = l1hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1h) && Intrinsics.d(this.a, ((s1h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(headerUiState=" + this.a + ")";
    }
}
