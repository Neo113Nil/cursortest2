package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i8b {
    public final o3a a;

    public i8b(o3a o3aVar) {
        this.a = o3aVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i8b) {
            return Intrinsics.d(this.a.i, ((i8b) obj).a.i);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.i.hashCode();
    }
}
