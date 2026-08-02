package defpackage;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class t2i {
    public static final t2i d = new t2i();
    public final Object a;
    public final boolean b;
    public final Throwable c;

    public t2i(Object obj) {
        this.a = obj;
        this.c = null;
        this.b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t2i.class != obj.getClass()) {
            return false;
        }
        t2i t2iVar = (t2i) obj;
        if (this.b == t2iVar.b && Objects.equals(this.a, t2iVar.a)) {
            return Objects.equals(this.c, t2iVar.c);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (((obj != null ? obj.hashCode() : 0) * 31) + (this.b ? 1 : 0)) * 31;
        Throwable th = this.c;
        return hashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{mData=");
        sb.append(this.a);
        sb.append(", mLoading=");
        sb.append(this.b);
        sb.append(", mFailure=");
        return f1d.k(sb, this.c, '}');
    }

    public t2i(Throwable th) {
        this.a = null;
        this.c = th;
        this.b = false;
    }

    public t2i() {
        this.a = null;
        this.c = null;
        this.b = true;
    }
}
