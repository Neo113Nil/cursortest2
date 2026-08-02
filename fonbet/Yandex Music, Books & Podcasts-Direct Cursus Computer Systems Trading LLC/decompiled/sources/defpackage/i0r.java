package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i0r {
    public final int a;
    public final String b;

    public i0r(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0r)) {
            return false;
        }
        i0r i0rVar = (i0r) obj;
        return this.a == i0rVar.a && Intrinsics.d(this.b, i0rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SmartPreviewAnalyticsEntity(position=" + this.a + ", trackId=" + this.b + ")";
    }
}
