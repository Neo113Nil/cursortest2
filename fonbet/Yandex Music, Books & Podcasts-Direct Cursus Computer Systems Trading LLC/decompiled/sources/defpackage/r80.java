package defpackage;

/* loaded from: classes3.dex */
public final class r80 implements t80 {
    public final int a;

    public r80(int i) {
        this.a = i;
    }

    @Override // defpackage.t80
    public final int a() {
        return this.a;
    }

    @Override // defpackage.t80
    public final String b() {
        return "today";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r80) && this.a == ((r80) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "Today(indexDay=", ")");
    }
}
