package defpackage;

/* loaded from: classes6.dex */
public final class jbr {
    public final String a;
    public final int b;

    public jbr(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbr)) {
            return false;
        }
        jbr jbrVar = (jbr) obj;
        return this.a.equals(jbrVar.a) && this.b == jbrVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartBitrateDataHolder(uuid=");
        sb.append(this.a);
        sb.append(", bitrate=");
        return vz1.r(sb, this.b, ')');
    }
}
