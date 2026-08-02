package defpackage;

/* loaded from: classes3.dex */
public final class kaa implements laa {
    public final float a;

    public kaa(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kaa) && Float.compare(this.a, ((kaa) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ouj.m("ReadyToDownload(progress=", this.a, ")");
    }
}
