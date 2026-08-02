package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class flu {
    public final String a;
    public final String b;
    public final ArrayList c;

    public flu(String str, String str2, ArrayList arrayList) {
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
        if (!(obj instanceof flu)) {
            return false;
        }
        flu fluVar = (flu) obj;
        return Intrinsics.d(this.a, fluVar.a) && Intrinsics.d(this.b, fluVar.b) && this.c.equals(fluVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vz1.t(f1d.m("WaveAgentEntityUiData(id=", this.a, ", title=", this.b, ", items="), this.c, ")");
    }
}
