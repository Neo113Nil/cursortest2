package defpackage;

/* loaded from: classes7.dex */
public final class v581 {
    public static final v581 b = new v581(false);
    public final boolean a;

    public v581(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && v581.class == obj.getClass() && this.a == ((v581) obj).a;
    }

    public final int hashCode() {
        return !this.a ? 1 : 0;
    }
}
