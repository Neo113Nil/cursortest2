package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zpy0 {
    public final ArrayList a;
    public final String b;

    public zpy0(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpy0)) {
            return false;
        }
        zpy0 zpy0Var = (zpy0) obj;
        return this.a.equals(zpy0Var.a) && jl40.l(this.b, zpy0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextInputStopWordsConfig(items=" + this.a + ", formStateKey=" + this.b + Extension.C_BRAKE;
    }
}
