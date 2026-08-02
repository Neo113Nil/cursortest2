package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class txk implements wxk {
    public final un6 a;
    public final String b;

    public txk(un6 un6Var, String str) {
        str.getClass();
        this.a = un6Var;
        this.b = str;
    }

    @Override // defpackage.wxk
    public final un6 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txk)) {
            return false;
        }
        txk txkVar = (txk) obj;
        return this.a.equals(txkVar.a) && Intrinsics.d(this.b, txkVar.b);
    }

    @Override // defpackage.wxk
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Unknown(coverUiData=" + this.a + ", title=" + this.b + ")";
    }
}
