package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class oav {
    public final String a;
    public final String b;
    public final List c;

    public oav(String str, String str2, List list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oav)) {
            return false;
        }
        oav oavVar = (oav) obj;
        return Intrinsics.d(this.a, oavVar.a) && Intrinsics.d(this.b, oavVar.b) && Intrinsics.d(this.c, oavVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vz1.u(f1d.m("WavesBlockUiEntity(id=", this.a, ", title=", this.b, ", items="), this.c, ")");
    }
}
