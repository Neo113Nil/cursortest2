package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s3d implements t3d {
    public final e5d a;

    public s3d(e5d e5dVar) {
        e5dVar.getClass();
        this.a = e5dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3d) && Intrinsics.d(this.a, ((s3d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(stream=" + this.a + ")";
    }
}
