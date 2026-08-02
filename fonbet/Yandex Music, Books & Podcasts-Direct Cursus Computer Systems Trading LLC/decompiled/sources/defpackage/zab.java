package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zab {
    public final String a;
    public final List b;

    public zab(String str, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zab)) {
            return false;
        }
        zab zabVar = (zab) obj;
        return Intrinsics.d(this.a, zabVar.a) && Intrinsics.d(this.b, zabVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return dfi.h("EntityListUiData(title=", this.a, ", entities=", ")", this.b);
    }
}
