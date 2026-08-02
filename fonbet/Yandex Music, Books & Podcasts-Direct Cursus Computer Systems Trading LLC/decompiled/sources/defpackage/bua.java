package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class bua {
    public final String a;
    public final String b;

    public bua(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bua)) {
            return false;
        }
        bua buaVar = (bua) obj;
        return Intrinsics.d(this.a, buaVar.a) && Intrinsics.d(this.b, buaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("Action(id=", this.a, ", uri=", this.b, ")");
    }
}
