package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vps implements zps {
    public final Text.Constant a;
    public final Text b;
    public final xps c;

    public vps(Text.Constant constant, Text.Constant constant2, xps xpsVar) {
        this.a = constant;
        this.b = constant2;
        this.c = xpsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vps)) {
            return false;
        }
        vps vpsVar = (vps) obj;
        return this.a.equals(vpsVar.a) && jl40.l(this.b, vpsVar.b) && jl40.l(this.c, vpsVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        xps xpsVar = this.c;
        return hashCode2 + (xpsVar != null ? xpsVar.hashCode() : 0);
    }

    public final String toString() {
        return "InProgress(title=" + this.a + ", subtitle=" + this.b + ", resultScreen=" + this.c + Extension.C_BRAKE;
    }
}
