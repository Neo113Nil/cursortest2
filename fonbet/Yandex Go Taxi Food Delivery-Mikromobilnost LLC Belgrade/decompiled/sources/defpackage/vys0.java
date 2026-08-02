package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vys0 implements xys0 {
    public final FormattedText a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final x2s e;

    public vys0(FormattedText formattedText, String str, ArrayList arrayList, String str2, x2s x2sVar) {
        this.a = formattedText;
        this.b = str;
        this.c = arrayList;
        this.d = str2;
        this.e = x2sVar;
    }

    @Override // defpackage.xys0
    public final x2s e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vys0)) {
            return false;
        }
        vys0 vys0Var = (vys0) obj;
        return this.a.equals(vys0Var.a) && jl40.l(this.b, vys0Var.b) && this.c.equals(vys0Var.c) && jl40.l(this.d, vys0Var.d) && this.e.equals(vys0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(ly3.b(unr0.b(this.a.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "ArBoxesSmartCamera(screenTitle=" + this.a + ", surfaceScanText=" + this.b + ", boxSizes=" + this.c + ", formStateBoxSizeKey=" + this.d + ", analyticsData=" + this.e + Extension.C_BRAKE;
    }
}
