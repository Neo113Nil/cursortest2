package defpackage;

/* loaded from: classes3.dex */
public final class vuo implements xuo {
    public final boolean a;

    public vuo(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vuo) && this.a == ((vuo) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("OpenCorrectScreen(purchased=", ")", this.a);
    }
}
