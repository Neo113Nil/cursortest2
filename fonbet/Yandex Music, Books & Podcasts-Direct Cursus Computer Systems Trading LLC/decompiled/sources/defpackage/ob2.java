package defpackage;

/* loaded from: classes.dex */
public final class ob2 extends um5 {
    public final gd2 a;

    public ob2(gd2 gd2Var) {
        tm5 tm5Var = tm5.a;
        this.a = gd2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof um5)) {
            return false;
        }
        if (!this.a.equals(((ob2) ((um5) obj)).a)) {
            return false;
        }
        Object obj2 = tm5.a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ tm5.a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + tm5.a + "}";
    }
}
