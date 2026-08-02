package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rdp implements sdp {
    public final rfk a;
    public final g3j b;

    public rdp(rfk rfkVar, g3j g3jVar) {
        rfkVar.getClass();
        this.a = rfkVar;
        this.b = g3jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdp)) {
            return false;
        }
        rdp rdpVar = (rdp) obj;
        return Intrinsics.d(this.a, rdpVar.a) && Intrinsics.d(this.b, rdpVar.b);
    }

    @Override // defpackage.sdp
    public final rfk getMethod() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g3j g3jVar = this.b;
        return hashCode + (g3jVar == null ? 0 : g3jVar.hashCode());
    }

    public final String toString() {
        return "FromNewCard(method=" + this.a + ", card=" + this.b + ")";
    }
}
