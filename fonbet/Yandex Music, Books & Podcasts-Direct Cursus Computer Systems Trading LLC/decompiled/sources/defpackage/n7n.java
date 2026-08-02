package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n7n {
    public final String a;
    public final String b;
    public final ArrayList c;

    public n7n(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7n)) {
            return false;
        }
        n7n n7nVar = (n7n) obj;
        return this.a.equals(n7nVar.a) && Intrinsics.d(this.b, n7nVar.b) && this.c.equals(n7nVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return vz1.t(f1d.m("QueryToVibeWaveItem(title=", this.a, ", description=", this.b, ", seeds="), this.c, ")");
    }
}
