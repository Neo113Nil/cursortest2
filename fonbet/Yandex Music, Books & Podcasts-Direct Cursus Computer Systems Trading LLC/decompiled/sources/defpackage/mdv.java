package defpackage;

/* loaded from: classes3.dex */
public final class mdv {
    public final String a;
    public final int b;

    public mdv(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdv)) {
            return false;
        }
        mdv mdvVar = (mdv) obj;
        return this.a.equals(mdvVar.a) && this.b == mdvVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Counter(chatOrBotId=" + this.a + ", unread=" + this.b + ")";
    }
}
