package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b2q implements g1q {
    public final String a;

    public b2q(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2q) && Intrinsics.d(this.a, ((b2q) obj).a);
    }

    @Override // defpackage.g1q
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("SharedGlagolTrackId(trackId=", this.a, ")");
    }
}
