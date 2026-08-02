package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rgb0 {
    public final dlb0 a;
    public final hj0 b;
    public final tls c;

    public rgb0(dlb0 dlb0Var, hj0 hj0Var, tls tlsVar) {
        this.a = dlb0Var;
        this.b = hj0Var;
        this.c = tlsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgb0)) {
            return false;
        }
        rgb0 rgb0Var = (rgb0) obj;
        return this.a.equals(rgb0Var.a) && this.b.equals(rgb0Var.b) && this.c.equals(rgb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PhotoCommentsModel(photoCommentItems=" + this.a + ", photoCommentButton=" + this.b + ", onPhotoCommentDeleteClick=" + this.c + Extension.C_BRAKE;
    }
}
