package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uju {
    public final Text a;
    public final int b;

    public uju(Text text, int i) {
        this.a = text;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final Text b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uju)) {
            return false;
        }
        uju ujuVar = (uju) obj;
        return this.a.equals(ujuVar.a) && this.b == ujuVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HintState(text=" + this.a + ", colorAttr=" + this.b + Extension.C_BRAKE;
    }
}
