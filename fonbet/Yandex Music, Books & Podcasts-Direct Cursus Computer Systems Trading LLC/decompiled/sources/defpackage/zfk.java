package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zfk {
    public final bve a;
    public final boolean b;

    public zfk(bve bveVar, boolean z) {
        bveVar.getClass();
        this.a = bveVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfk)) {
            return false;
        }
        zfk zfkVar = (zfk) obj;
        return Intrinsics.d(this.a, zfkVar.a) && this.b == zfkVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentParams(offer=" + this.a + ", isSilentPayment=" + this.b + ")";
    }
}
