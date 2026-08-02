package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s6h implements t6h {
    public final iil a;
    public final z5h b;

    public s6h(iil iilVar, z5h z5hVar) {
        this.a = iilVar;
        this.b = z5hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6h)) {
            return false;
        }
        s6h s6hVar = (s6h) obj;
        return this.a.equals(s6hVar.a) && Intrinsics.d(this.b, s6hVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        z5h z5hVar = this.b;
        return hashCode + (z5hVar == null ? 0 : z5hVar.hashCode());
    }

    public final String toString() {
        return "Success(uiData=" + this.a + ", analyticsPayload=" + this.b + ")";
    }
}
