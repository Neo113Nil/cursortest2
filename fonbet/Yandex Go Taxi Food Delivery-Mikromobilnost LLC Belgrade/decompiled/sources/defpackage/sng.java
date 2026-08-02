package defpackage;

import java.security.MessageDigest;

/* loaded from: classes10.dex */
public final class sng implements khx {
    public final khx b;
    public final khx c;

    public sng(khx khxVar, khx khxVar2) {
        this.b = khxVar;
        this.c = khxVar2;
    }

    @Override // defpackage.khx
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.khx
    public final boolean equals(Object obj) {
        if (obj instanceof sng) {
            sng sngVar = (sng) obj;
            if (this.b.equals(sngVar.b) && this.c.equals(sngVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.khx
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
