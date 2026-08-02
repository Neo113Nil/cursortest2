package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jkj {
    public final String a;
    public final String b;
    public final ArrayList c;

    public jkj(String str, String str2, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkj)) {
            return false;
        }
        jkj jkjVar = (jkj) obj;
        return Intrinsics.d(this.a, jkjVar.a) && Intrinsics.d(this.b, jkjVar.b) && this.c.equals(jkjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vz1.t(f1d.m("Meta(batchId=", this.a, ", positionId=", this.b, ", productIds="), this.c, ")");
    }
}
