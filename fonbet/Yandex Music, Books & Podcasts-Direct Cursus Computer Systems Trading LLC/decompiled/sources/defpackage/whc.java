package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class whc {
    public final yhc a;
    public final String b;
    public final arf c;
    public final uhc d;

    public whc(yhc yhcVar, String str, arf arfVar, uhc uhcVar) {
        this.a = yhcVar;
        this.b = str;
        this.c = arfVar;
        this.d = uhcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whc)) {
            return false;
        }
        whc whcVar = (whc) obj;
        return this.a == whcVar.a && Intrinsics.d(this.b, whcVar.b) && Intrinsics.d(this.c, whcVar.c) && Intrinsics.d(this.d, whcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "FlexLogEntry(level=" + this.a + ", message=" + this.b + ", context=" + this.c + ", metadata=" + this.d + ")";
    }
}
