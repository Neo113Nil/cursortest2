package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w1s implements m0s {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public w1s(String str, String str2, String str3, List list) {
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
        if (!(obj instanceof w1s)) {
            return false;
        }
        w1s w1sVar = (w1s) obj;
        return this.a.equals(w1sVar.a) && Intrinsics.d(this.b, w1sVar.b) && Intrinsics.d(this.c, w1sVar.c) && Intrinsics.d(this.d, w1sVar.d);
    }

    @Override // defpackage.m0s
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.m0s
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("TabUiData(id=", this.a, ", title=", this.b, ", subtitle=");
        m.append(this.c);
        m.append(", covers=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
