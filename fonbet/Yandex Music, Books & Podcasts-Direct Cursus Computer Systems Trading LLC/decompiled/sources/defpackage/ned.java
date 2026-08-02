package defpackage;

/* loaded from: classes5.dex */
public final class ned {
    public final String a;
    public final boolean b;

    public ned(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ned)) {
            return false;
        }
        ned nedVar = (ned) obj;
        return this.a.equals(nedVar.a) && this.b == nedVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return v3w.e("Trigger(reasonForAnalytics=", this.a, ", respectLocalPlayback=", ")", this.b);
    }
}
