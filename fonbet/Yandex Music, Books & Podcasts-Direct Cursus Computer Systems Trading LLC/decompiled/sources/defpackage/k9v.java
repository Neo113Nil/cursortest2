package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k9v implements n9v {
    public final String a;
    public final f6v b;

    public k9v(String str, f6v f6vVar) {
        str.getClass();
        this.a = str;
        this.b = f6vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9v)) {
            return false;
        }
        k9v k9vVar = (k9v) obj;
        return Intrinsics.d(this.a, k9vVar.a) && this.b == k9vVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "None(targetId=" + this.a + ", reason=" + this.b + ")";
    }
}
