package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fzs implements ezs {
    public final mqs a;
    public final int b;

    public fzs(mqs mqsVar, int i) {
        mqsVar.getClass();
        this.a = mqsVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzs)) {
            return false;
        }
        fzs fzsVar = (fzs) obj;
        return Intrinsics.d(this.a, fzsVar.a) && this.b == fzsVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackItem(track=" + this.a + ", actualPosition=" + this.b + ")";
    }
}
