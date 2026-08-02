package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class w1f {
    public final String a;
    public final v1f b;
    public final u1f c;

    public w1f(String str, v1f v1fVar, u1f u1fVar) {
        this.a = str;
        this.b = v1fVar;
        this.c = u1fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1f)) {
            return false;
        }
        w1f w1fVar = (w1f) obj;
        return this.a.equals(w1fVar.a) && this.b.equals(w1fVar.b) && this.c.equals(w1fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CouponState(title=" + this.a + ", inputField=" + this.b + ", confirmButton=" + this.c + Extension.C_BRAKE;
    }
}
