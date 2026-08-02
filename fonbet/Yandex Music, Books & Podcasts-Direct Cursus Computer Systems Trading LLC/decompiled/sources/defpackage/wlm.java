package defpackage;

/* loaded from: classes.dex */
public final class wlm {
    public final String a;
    public final Long b;

    public wlm(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlm)) {
            return false;
        }
        wlm wlmVar = (wlm) obj;
        return this.a.equals(wlmVar.a) && this.b.equals(wlmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Preference(key=");
        sb.append(this.a);
        sb.append(", value=");
        return tlm.k(sb, this.b, ')');
    }
}
