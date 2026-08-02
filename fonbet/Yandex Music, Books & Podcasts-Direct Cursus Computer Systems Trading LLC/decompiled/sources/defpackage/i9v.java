package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i9v implements n9v {
    public final String a;
    public final q6v b;

    public i9v(String str, q6v q6vVar) {
        str.getClass();
        this.a = str;
        this.b = q6vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9v)) {
            return false;
        }
        i9v i9vVar = (i9v) obj;
        return Intrinsics.d(this.a, i9vVar.a) && this.b.equals(i9vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Loaded(targetId=" + this.a + ", words=" + this.b + ")";
    }
}
