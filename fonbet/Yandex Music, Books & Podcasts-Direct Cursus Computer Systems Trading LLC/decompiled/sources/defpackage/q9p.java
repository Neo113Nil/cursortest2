package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q9p implements k7h {
    public final String a;

    public q9p(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q9p) && Intrinsics.d(this.a, ((q9p) obj).a);
    }

    @Override // defpackage.g9p
    public final String getTag() {
        return this.a;
    }

    @Override // defpackage.g9p
    public final String getType() {
        return "track";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("SeedTrack(tag=", this.a, ")");
    }
}
