package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class skg {
    public final Text.Constant a;
    public final rbv b;

    public skg(Text.Constant constant, rbv rbvVar) {
        this.a = constant;
        this.b = rbvVar;
    }

    public final rbv a() {
        return this.b;
    }

    public final Text b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skg)) {
            return false;
        }
        skg skgVar = (skg) obj;
        return this.a.equals(skgVar.a) && this.b.equals(skgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DashboardNavigationLogoEntity(title=" + this.a + ", image=" + this.b + Extension.C_BRAKE;
    }
}
