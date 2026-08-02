package defpackage;

/* loaded from: classes2.dex */
public final class qbc {
    public final String a;
    public final String b;
    public final boolean c;

    public qbc(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbc)) {
            return false;
        }
        qbc qbcVar = (qbc) obj;
        return this.a.equals(qbcVar.a) && this.b.equals(qbcVar.b) && this.c == qbcVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectContactsWebUrlResult(url=");
        sb.append(this.a);
        sb.append(", skipText=");
        sb.append(this.b);
        sb.append(", alreadyCollected=");
        return unr0.u(sb, this.c, ')');
    }
}
