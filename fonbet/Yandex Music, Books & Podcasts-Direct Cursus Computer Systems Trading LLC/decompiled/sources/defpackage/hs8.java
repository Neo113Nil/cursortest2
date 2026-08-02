package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class hs8 {
    public final String a;
    public final String b;
    public final rv8 c;
    public final ys8 d;

    public hs8(String str, String str2, rv8 rv8Var, ys8 ys8Var) {
        str.getClass();
        str2.getClass();
        rv8Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = rv8Var;
        this.d = ys8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs8)) {
            return false;
        }
        hs8 hs8Var = (hs8) obj;
        return Intrinsics.d(this.a, hs8Var.a) && Intrinsics.d(this.b, hs8Var.b) && Intrinsics.d(this.c, hs8Var.c) && this.d == hs8Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("DivCommunicationData(screenId=", this.a, ", feedbackToken=", this.b, ", divData=");
        m.append(this.c);
        m.append(", uiType=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
