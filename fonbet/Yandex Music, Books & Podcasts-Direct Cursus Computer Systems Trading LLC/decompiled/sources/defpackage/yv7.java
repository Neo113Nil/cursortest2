package defpackage;

/* loaded from: classes6.dex */
public final class yv7 {
    public final String a;
    public final Long b;

    public yv7(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yv7.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        yv7 yv7Var = (yv7) obj;
        return this.b.equals(yv7Var.b) && this.a.equals(yv7Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DelegatePlaybackParameters(mediaSourceUriString='");
        sb.append(this.a);
        sb.append("', startPosition=");
        return tlm.k(sb, this.b, ')');
    }
}
