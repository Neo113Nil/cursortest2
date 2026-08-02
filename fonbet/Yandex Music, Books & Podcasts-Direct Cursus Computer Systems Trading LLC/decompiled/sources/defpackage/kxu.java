package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kxu implements mxu {
    public final Exception a;
    public final qxu b;

    public kxu(Exception exc, qxu qxuVar) {
        exc.getClass();
        qxuVar.getClass();
        this.a = exc;
        this.b = qxuVar;
    }

    @Override // defpackage.mxu
    public final Exception a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxu)) {
            return false;
        }
        kxu kxuVar = (kxu) obj;
        return Intrinsics.d(this.a, kxuVar.a) && Intrinsics.d(this.b, kxuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NetworkWithFallback(exception=" + this.a + ", fallbackResult=" + this.b + ")";
    }
}
