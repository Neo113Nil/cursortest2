package defpackage;

/* loaded from: classes4.dex */
public final class a18 {
    public final int a;

    public a18(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a18) && this.a == ((a18) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "DeviceItemIconUiState(iconResId=", ")");
    }
}
