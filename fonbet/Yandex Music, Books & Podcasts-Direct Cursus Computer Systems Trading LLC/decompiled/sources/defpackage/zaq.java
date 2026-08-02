package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zaq {
    public final String a;
    public final String b;

    public zaq(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaq)) {
            return false;
        }
        zaq zaqVar = (zaq) obj;
        return Intrinsics.d(this.a, zaqVar.a) && Intrinsics.d(this.b, zaqVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return hrg.s("WaveDescription(name=", this.a, ", description=", this.b, ")");
    }
}
