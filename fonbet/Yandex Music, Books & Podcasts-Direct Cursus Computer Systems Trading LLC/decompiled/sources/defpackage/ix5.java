package defpackage;

/* loaded from: classes3.dex */
public final class ix5 implements kx5 {
    public final boolean a;

    public ix5(boolean z) {
        this.a = z;
    }

    @Override // defpackage.kx5
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ix5) && this.a == ((ix5) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("AutoDetect(isSelected=", ")", this.a);
    }
}
