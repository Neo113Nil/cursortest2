package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class hou {
    public final String a;
    public final String b;
    public final ArrayList c;

    public hou(String str, String str2, ArrayList arrayList) {
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
        if (!(obj instanceof hou)) {
            return false;
        }
        hou houVar = (hou) obj;
        return Intrinsics.d(this.a, houVar.a) && Intrinsics.d(this.b, houVar.b) && this.c.equals(houVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vz1.t(f1d.m("WaveEntity(id=", this.a, ", title=", this.b, ", items="), this.c, ")");
    }
}
