package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class dlu {
    public final String a;
    public final String b;
    public final ArrayList c;

    public dlu(String str, String str2, ArrayList arrayList) {
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
        if (!(obj instanceof dlu)) {
            return false;
        }
        dlu dluVar = (dlu) obj;
        return Intrinsics.d(this.a, dluVar.a) && Intrinsics.d(this.b, dluVar.b) && this.c.equals(dluVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vz1.t(f1d.m("WaveAgentEntity(id=", this.a, ", title=", this.b, ", items="), this.c, ")");
    }
}
