package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ygt implements lht {
    public final String a;
    public final List b;

    public ygt(String str, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygt)) {
            return false;
        }
        ygt ygtVar = (ygt) obj;
        return Intrinsics.d(this.a, ygtVar.a) && Intrinsics.d(this.b, ygtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return dfi.h("Success(id=", this.a, ", data=", ")", this.b);
    }
}
