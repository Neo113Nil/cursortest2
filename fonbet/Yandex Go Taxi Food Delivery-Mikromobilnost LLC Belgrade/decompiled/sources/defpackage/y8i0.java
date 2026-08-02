package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class y8i0 {
    public final ArrayList a;
    public final Float b;

    public y8i0(ArrayList arrayList, Float f) {
        this.a = arrayList;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8i0)) {
            return false;
        }
        y8i0 y8i0Var = (y8i0) obj;
        return this.a.equals(y8i0Var.a) && jl40.l(this.b, y8i0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Float f = this.b;
        return hashCode + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        return "RatioHeightConfigModel(serviceConfigModels=" + this.a + ", defaultRatio=" + this.b + Extension.C_BRAKE;
    }
}
