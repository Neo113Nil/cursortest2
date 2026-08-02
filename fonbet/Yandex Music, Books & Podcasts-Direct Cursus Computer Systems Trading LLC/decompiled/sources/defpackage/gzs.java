package defpackage;

/* loaded from: classes3.dex */
public final class gzs implements ezs {
    public final int a;

    public gzs(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gzs) && this.a == ((gzs) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "VolumeItem(volume=", ")");
    }
}
