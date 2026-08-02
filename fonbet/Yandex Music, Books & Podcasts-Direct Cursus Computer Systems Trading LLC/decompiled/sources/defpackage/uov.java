package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class uov implements wov {
    public final llv a;
    public final plv b;

    public uov(llv llvVar, plv plvVar) {
        plvVar.getClass();
        this.a = llvVar;
        this.b = plvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uov)) {
            return false;
        }
        uov uovVar = (uov) obj;
        return this.a.equals(uovVar.a) && Intrinsics.d(this.b, uovVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(widgetButtons=" + this.a + ", colorType=" + this.b + ")";
    }
}
