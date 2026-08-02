package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o9p implements g9p {
    public final String a;
    public final String b;

    public o9p(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9p)) {
            return false;
        }
        o9p o9pVar = (o9p) obj;
        return this.a.equals(o9pVar.a) && Intrinsics.d(this.b, o9pVar.b);
    }

    @Override // defpackage.g9p
    public final String getTag() {
        return this.b;
    }

    @Override // defpackage.g9p
    public final String getType() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("SeedOther(type=", this.a, ", tag=", this.b, ")");
    }
}
