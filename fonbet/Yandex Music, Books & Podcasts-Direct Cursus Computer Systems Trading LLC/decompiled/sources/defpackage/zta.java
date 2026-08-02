package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zta implements aua {
    public final Exception a;
    public final String b;

    public zta(String str, Exception exc) {
        exc.getClass();
        this.a = exc;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zta)) {
            return false;
        }
        zta ztaVar = (zta) obj;
        return Intrinsics.d(this.a, ztaVar.a) && Intrinsics.d(this.b, ztaVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Error(exception=" + this.a + ", message=" + this.b + ")";
    }
}
