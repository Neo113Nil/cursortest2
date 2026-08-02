package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class hoi {
    public final String a;
    public final Object b;
    public final boolean c;
    public final itr d;

    public hoi(String str, Object obj, boolean z, itr itrVar) {
        this.a = str;
        this.b = obj;
        this.c = z;
        this.d = itrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoi)) {
            return false;
        }
        hoi hoiVar = (hoi) obj;
        return Intrinsics.d(this.a, hoiVar.a) && this.b.equals(hoiVar.b) && this.c == hoiVar.c && this.d == hoiVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + k5r.e((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "MusicSortBottomSheetItem(title=" + this.a + ", value=" + this.b + ", isSelected=" + this.c + ", sortType=" + this.d + ")";
    }
}
