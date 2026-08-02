package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class owk implements qwk {
    public final int a;
    public final String b;

    public owk(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owk)) {
            return false;
        }
        owk owkVar = (owk) obj;
        return this.a == owkVar.a && Intrinsics.d(this.b, owkVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AdditionalInfoTrack(trackSourceKey=" + this.a + ", batchId=" + this.b + ")";
    }
}
