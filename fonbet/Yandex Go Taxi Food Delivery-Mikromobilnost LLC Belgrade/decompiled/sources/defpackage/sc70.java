package defpackage;

import com.ybsdk.widgets.common.l;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class sc70 implements uc70 {
    public final rbv a;
    public final l b;
    public final boolean c;

    public sc70(rbv rbvVar, l lVar, boolean z) {
        this.a = rbvVar;
        this.b = lVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc70)) {
            return false;
        }
        sc70 sc70Var = (sc70) obj;
        return this.a.equals(sc70Var.a) && this.b.equals(sc70Var.b) && this.c == sc70Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.a.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Icon(statusIcon=");
        sb.append(this.a);
        sb.append(", smallIconProgressState=");
        sb.append(this.b);
        sb.append(", shouldAnimateProgress=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
