package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k0s implements m0s {
    public final String a;
    public final String b;

    public k0s(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0s)) {
            return false;
        }
        k0s k0sVar = (k0s) obj;
        return this.a.equals(k0sVar.a) && Intrinsics.d(this.b, k0sVar.b);
    }

    @Override // defpackage.m0s
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.m0s
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("Impl(id=", this.a, ", title=", this.b, ")");
    }
}
