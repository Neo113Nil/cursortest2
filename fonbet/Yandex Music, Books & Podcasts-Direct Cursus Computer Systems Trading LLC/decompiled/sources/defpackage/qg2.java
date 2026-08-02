package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qg2 {
    public final String a;
    public final boolean b;

    public qg2(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg2)) {
            return false;
        }
        qg2 qg2Var = (qg2) obj;
        return Intrinsics.d(this.a, qg2Var.a) && this.b == qg2Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return v3w.e("AvatarUiData(url=", this.a, ", hasStroke=", ")", this.b);
    }
}
