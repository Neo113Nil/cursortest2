package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class y760 {
    public final int a;
    public final nbv b;
    public final Text.Resource c;
    public final int d;

    public y760(int i, nbv nbvVar, Text.Resource resource, int i2) {
        this.a = i;
        this.b = nbvVar;
        this.c = resource;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y760)) {
            return false;
        }
        y760 y760Var = (y760) obj;
        return this.a == y760Var.a && this.b.equals(y760Var.b) && this.c.equals(y760Var.c) && this.d == y760Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + uw51.b(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "State(background=" + this.a + ", icon=" + this.b + ", text=" + this.c + ", textColorResId=" + this.d + Extension.C_BRAKE;
    }
}
