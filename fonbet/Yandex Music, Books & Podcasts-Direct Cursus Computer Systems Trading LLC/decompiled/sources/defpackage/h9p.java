package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h9p implements k7h {
    public final String a;

    public h9p(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h9p) && Intrinsics.d(this.a, ((h9p) obj).a);
    }

    @Override // defpackage.g9p
    public final String getTag() {
        return this.a;
    }

    @Override // defpackage.g9p
    public final String getType() {
        return "activity";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("SeedActivity(tag=", this.a, ")");
    }
}
