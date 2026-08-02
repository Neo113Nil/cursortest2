package defpackage;

/* loaded from: classes6.dex */
public final class r6s {
    public final boolean a;
    public final int b;

    public r6s(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r6s.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        r6s r6sVar = (r6s) obj;
        return this.a == r6sVar.a && this.b == r6sVar.b;
    }

    public final int hashCode() {
        return (Boolean.hashCode(this.a) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TargetFormatTrackSelectionConfig(expSelectMonoBitrate=");
        sb.append(this.a);
        sb.append(", expDegradationSteps=");
        return vz1.r(sb, this.b, ')');
    }
}
