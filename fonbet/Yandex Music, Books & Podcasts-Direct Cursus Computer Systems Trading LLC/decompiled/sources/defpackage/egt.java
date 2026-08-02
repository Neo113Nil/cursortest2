package defpackage;

/* loaded from: classes4.dex */
public final class egt extends eht {
    public final boolean a;
    public final boolean b;

    public egt(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egt)) {
            return false;
        }
        egt egtVar = (egt) obj;
        return this.a == egtVar.a && this.b == egtVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.t("Placeholder(isLoading=", this.a, ", covered=", this.b, ")");
    }
}
