package defpackage;

/* loaded from: classes5.dex */
public final class faa implements gaa {
    public final float a;

    public faa(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof faa) && Float.compare(this.a, ((faa) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ouj.m("ReadyToDownload(progress=", this.a, ")");
    }
}
