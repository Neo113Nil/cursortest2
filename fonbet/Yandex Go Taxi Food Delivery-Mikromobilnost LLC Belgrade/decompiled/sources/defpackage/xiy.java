package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xiy {
    public final ArrayList a;
    public final double b;

    public xiy(double d, ArrayList arrayList) {
        this.a = arrayList;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xiy)) {
            return false;
        }
        xiy xiyVar = (xiy) obj;
        return this.a.equals(xiyVar.a) && Double.compare(this.b, xiyVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LinearGradientModel(colorStops=" + this.a + ", angleRadians=" + this.b + Extension.C_BRAKE;
    }
}
