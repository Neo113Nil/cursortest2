package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pgr {
    public final String a;
    public final String b;
    public final List c;
    public final dtq d;

    public pgr(String str, String str2, List list, dtq dtqVar) {
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
        if (!(obj instanceof pgr)) {
            return false;
        }
        pgr pgrVar = (pgr) obj;
        return Intrinsics.d(this.a, pgrVar.a) && Intrinsics.d(this.b, pgrVar.b) && Intrinsics.d(this.c, pgrVar.c) && Intrinsics.d(this.d, pgrVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.d.hashCode() + k5r.d((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder m = f1d.m("StatsSlideContentUiData(header=", this.a, ", footer=", this.b, ", stats=");
        m.append(this.c);
        m.append(", align=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
