package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class gia {
    public final jia a;
    public final kia b;

    public gia(jia jiaVar, kia kiaVar) {
        jiaVar.getClass();
        kiaVar.getClass();
        this.a = jiaVar;
        this.b = kiaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gia)) {
            return false;
        }
        gia giaVar = (gia) obj;
        return Intrinsics.d(this.a, giaVar.a) && Intrinsics.d(this.b, giaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DownloadedSectionsBlockData(sections=" + this.a + ", metrics=" + this.b + ")";
    }
}
