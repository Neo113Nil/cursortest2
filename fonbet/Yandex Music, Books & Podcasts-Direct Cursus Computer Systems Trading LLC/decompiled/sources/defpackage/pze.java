package defpackage;

/* loaded from: classes4.dex */
public final class pze implements rze {
    public final boolean a;
    public final int b;

    public pze(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pze)) {
            return false;
        }
        pze pzeVar = (pze) obj;
        return this.a == pzeVar.a && this.b == pzeVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Placeholder(isLoading=" + this.a + ", count=" + this.b + ")";
    }
}
