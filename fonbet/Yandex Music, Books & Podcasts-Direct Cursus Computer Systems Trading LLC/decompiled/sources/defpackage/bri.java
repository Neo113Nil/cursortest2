package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class bri {
    public final String a;
    public final List b;

    public bri(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bri)) {
            return false;
        }
        bri briVar = (bri) obj;
        return this.a.equals(briVar.a) && Intrinsics.d(this.b, briVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return dfi.h("MyShelfBlockCoversButtonData(title=", this.a, ", covers=", ")", this.b);
    }
}
