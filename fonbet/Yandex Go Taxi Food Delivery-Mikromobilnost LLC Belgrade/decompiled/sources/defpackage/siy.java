package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class siy extends w3b1 {
    public final ArrayList a;
    public final double b;
    public final ldc c;

    public siy(ArrayList arrayList, double d, ldc ldcVar) {
        this.a = arrayList;
        this.b = d;
        this.c = ldcVar;
    }

    @Override // defpackage.w3b1
    public final ldc b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof siy)) {
            return false;
        }
        siy siyVar = (siy) obj;
        return this.a.equals(siyVar.a) && Double.compare(this.b, siyVar.b) == 0 && jl40.l(this.c, siyVar.c);
    }

    public final int hashCode() {
        int a = unr0.a(this.a.hashCode() * 31, 31, this.b);
        ldc ldcVar = this.c;
        return a + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a));
    }

    public final String toString() {
        return "LinearGradientBackgroundState(colorStops=" + this.a + ", angleRadians=" + this.b + ", rippleColor=" + this.c + Extension.C_BRAKE;
    }
}
