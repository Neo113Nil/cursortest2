package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class wx3 {
    public final String a;
    public final String b;
    public final xv c;

    public wx3(String str, String str2, xv xvVar) {
        this.a = str;
        this.b = str2;
        this.c = xvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx3)) {
            return false;
        }
        wx3 wx3Var = (wx3) obj;
        return this.a.equals(wx3Var.a) && Intrinsics.d(this.b, wx3Var.b) && Intrinsics.d(this.c, wx3Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        xv xvVar = this.c;
        return hashCode2 + (xvVar != null ? xvVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("CardUiData(backgroundUrl=", this.a, ", imageDescription=", this.b, ", cardButtonUiData=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
