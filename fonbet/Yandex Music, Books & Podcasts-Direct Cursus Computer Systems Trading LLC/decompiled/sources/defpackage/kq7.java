package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class kq7 {
    public final Boolean a;
    public final String b;

    public kq7(String str, Boolean bool) {
        this.a = bool;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq7)) {
            return false;
        }
        kq7 kq7Var = (kq7) obj;
        return Intrinsics.d(this.a, kq7Var.a) && Intrinsics.d(this.b, kq7Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeedbackSignal(isPlaying=" + this.a + ", streamId=" + this.b + ")";
    }
}
