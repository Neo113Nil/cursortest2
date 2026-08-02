package defpackage;

import com.yandex.go.tariffcard.ui.model.VisibilityChangeOrigin;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xtx {
    public final String a;
    public final int b;
    public final VisibilityChangeOrigin c;

    public xtx(String str, int i, VisibilityChangeOrigin visibilityChangeOrigin) {
        this.a = str;
        this.b = i;
        this.c = visibilityChangeOrigin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtx)) {
            return false;
        }
        xtx xtxVar = (xtx) obj;
        return jl40.l(this.a, xtxVar.a) && this.b == xtxVar.b && this.c == xtxVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + oyr.b(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "LastVisibleItemState(tariffClass=", this.a, ", index=", ", origin=");
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
