package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qsi implements zqi {
    public final String a;
    public final String b;
    public final List c;

    public qsi(String str, String str2, List list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsi)) {
            return false;
        }
        qsi qsiVar = (qsi) obj;
        return this.a.equals(qsiVar.a) && this.b.equals(qsiVar.b) && Intrinsics.d(this.c, qsiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vz1.u(f1d.m("MyShelfEntitiesBlock(id=", this.a, ", title=", this.b, ", entities="), this.c, ")");
    }
}
