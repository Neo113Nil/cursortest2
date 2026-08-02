package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class vd40 implements xd40 {
    public final p6o a;

    public vd40(p6o p6oVar) {
        this.a = p6oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vd40) && this.a.equals(((vd40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(errorContentState=" + this.a + Extension.C_BRAKE;
    }
}
