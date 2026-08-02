package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zu5 {
    public final p0d a;

    public zu5(p0d p0dVar) {
        p0dVar.getClass();
        this.a = p0dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zu5) && Intrinsics.d(this.a, ((zu5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ConcertGalleryItem(photo=" + this.a + ")";
    }
}
