package defpackage;

/* loaded from: classes4.dex */
public final class j7v {
    public final boolean a;
    public final boolean b;

    public j7v(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7v)) {
            return false;
        }
        j7v j7vVar = (j7v) obj;
        return this.a == j7vVar.a && this.b == j7vVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.t("WaveWordsExperimentConfig(enabled=", this.a, ", oknyxEnabled=", this.b, ")");
    }
}
