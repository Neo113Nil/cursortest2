package defpackage;

/* loaded from: classes3.dex */
public final class k6n implements l6n {
    public final uft a;
    public final boolean b;

    public k6n(uft uftVar, boolean z) {
        uftVar.getClass();
        this.a = uftVar;
        this.b = z;
    }

    @Override // defpackage.l6n
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6n)) {
            return false;
        }
        k6n k6nVar = (k6n) obj;
        return this.a == k6nVar.a && this.b == k6nVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Selected(uiQuality=" + this.a + ", isLosslessUnavailable=" + this.b + ")";
    }
}
