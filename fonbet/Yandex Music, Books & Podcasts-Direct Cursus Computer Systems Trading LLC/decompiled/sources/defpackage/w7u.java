package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w7u {
    public final String a;
    public final String b;
    public final List c;
    public final boolean d;

    public w7u(String str, String str2, List list, boolean z) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7u)) {
            return false;
        }
        w7u w7uVar = (w7u) obj;
        return this.a.equals(w7uVar.a) && this.b.equals(w7uVar.b) && Intrinsics.d(this.c, w7uVar.c) && this.d == w7uVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.d(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder m = f1d.m("VideoClipRadioSession(radioSessionId=", this.a, ", batchId=", this.b, ", sequence=");
        m.append(this.c);
        m.append(", pumpkin=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
