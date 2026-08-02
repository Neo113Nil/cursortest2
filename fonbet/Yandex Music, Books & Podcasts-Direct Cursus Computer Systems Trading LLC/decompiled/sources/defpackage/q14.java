package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q14 {
    public final String a;
    public final List b;

    public q14(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q14)) {
            return false;
        }
        q14 q14Var = (q14) obj;
        return Intrinsics.d(this.a, q14Var.a) && Intrinsics.d(this.b, q14Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return dfi.h("CarouselContentUiData(savedChoiceKey=", this.a, ", items=", ")", this.b);
    }
}
