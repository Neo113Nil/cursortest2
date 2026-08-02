package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z2v implements a3v {
    public final String a;
    public final x2v b;

    public z2v(String str, x2v x2vVar) {
        str.getClass();
        this.a = str;
        this.b = x2vVar;
    }

    @Override // defpackage.a3v
    public final x2v a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2v)) {
            return false;
        }
        z2v z2vVar = (z2v) obj;
        return Intrinsics.d(this.a, z2vVar.a) && this.b.equals(z2vVar.b);
    }

    @Override // defpackage.a3v
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "JustTitle(title=" + this.a + ", domainEntity=" + this.b + ")";
    }
}
