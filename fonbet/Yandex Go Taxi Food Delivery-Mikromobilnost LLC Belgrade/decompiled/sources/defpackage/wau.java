package defpackage;

/* loaded from: classes2.dex */
public final class wau implements bwg {
    public final String a;
    public final String b;

    public wau(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wau)) {
            return false;
        }
        wau wauVar = (wau) obj;
        return this.a.equals(wauVar.a) && this.b.equals(wauVar.b);
    }

    @Override // defpackage.bwg
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderModel(id=");
        sb.append(this.a);
        sb.append(", title=");
        return b64.p(sb, this.b, ')');
    }
}
