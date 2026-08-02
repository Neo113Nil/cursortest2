package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ahe {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public ahe(String str, String str2, String str3, List list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahe)) {
            return false;
        }
        ahe aheVar = (ahe) obj;
        return Intrinsics.d(this.a, aheVar.a) && Intrinsics.d(this.b, aheVar.b) && Intrinsics.d(this.c, aheVar.c) && Intrinsics.d(this.d, aheVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("InStyleBlockEntityUiData(id=", this.a, ", title=", this.b, ", coverUrl=");
        m.append(this.c);
        m.append(", items=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
