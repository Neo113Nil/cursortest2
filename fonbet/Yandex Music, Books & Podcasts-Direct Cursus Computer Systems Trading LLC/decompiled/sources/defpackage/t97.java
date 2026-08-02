package defpackage;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class t97 implements daf {
    public final daf b;
    public final daf c;

    public t97(daf dafVar, daf dafVar2) {
        this.b = dafVar;
        this.c = dafVar2;
    }

    @Override // defpackage.daf
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
        this.c.b(messageDigest);
    }

    @Override // defpackage.daf
    public final boolean equals(Object obj) {
        if (obj instanceof t97) {
            t97 t97Var = (t97) obj;
            if (this.b.equals(t97Var.b) && this.c.equals(t97Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.daf
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
