package defpackage;

/* loaded from: classes3.dex */
public final class s80 implements t80 {
    public final int a;

    public s80(int i) {
        this.a = i;
    }

    @Override // defpackage.t80
    public final int a() {
        return this.a;
    }

    @Override // defpackage.t80
    public final String b() {
        return "yesterday";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s80) && this.a == ((s80) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "Yesterday(indexDay=", ")");
    }
}
