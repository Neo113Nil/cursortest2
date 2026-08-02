package defpackage;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class vhj implements daf {
    public final Object b;

    public vhj(Object obj) {
        w1g.s(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // defpackage.daf
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(daf.a));
    }

    @Override // defpackage.daf
    public final boolean equals(Object obj) {
        if (obj instanceof vhj) {
            return this.b.equals(((vhj) obj).b);
        }
        return false;
    }

    @Override // defpackage.daf
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return f1d.j(new StringBuilder("ObjectKey{object="), this.b, '}');
    }
}
