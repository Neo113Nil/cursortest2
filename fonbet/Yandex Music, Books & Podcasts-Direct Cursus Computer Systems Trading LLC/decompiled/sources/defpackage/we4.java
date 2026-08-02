package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class we4 {
    public final String a;
    public final String b;
    public final List c;
    public final dtq d;

    public we4(String str, String str2, List list, dtq dtqVar) {
        list.getClass();
        dtqVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = dtqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we4)) {
            return false;
        }
        we4 we4Var = (we4) obj;
        return this.a.equals(we4Var.a) && Intrinsics.d(this.b, we4Var.b) && Intrinsics.d(this.c, we4Var.c) && Intrinsics.d(this.d, we4Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + k5r.d((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder m = f1d.m("ChartArtistContentUiData(cover=", this.a, ", title=", this.b, ", items=");
        m.append(this.c);
        m.append(", align=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
