package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m3n {
    public final m a;
    public final m b;

    public m3n(m mVar, m mVar2) {
        this.a = mVar;
        this.b = mVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3n)) {
            return false;
        }
        m3n m3nVar = (m3n) obj;
        return this.a.equals(m3nVar.a) && Intrinsics.d(this.b, m3nVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        m mVar = this.b;
        return hashCode + (mVar == null ? 0 : mVar.hashCode());
    }

    public final String toString() {
        return "PurchaseBlockTexts(title=" + this.a + ", subtitle=" + this.b + ")";
    }
}
