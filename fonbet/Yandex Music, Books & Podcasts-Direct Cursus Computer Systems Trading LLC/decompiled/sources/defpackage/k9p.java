package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k9p implements k7h {
    public final String a;

    public k9p(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k9p) && Intrinsics.d(this.a, ((k9p) obj).a);
    }

    @Override // defpackage.g9p
    public final String getTag() {
        return this.a;
    }

    @Override // defpackage.g9p
    public final String getType() {
        return "epoch";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("SeedEpoch(tag=", this.a, ")");
    }
}
