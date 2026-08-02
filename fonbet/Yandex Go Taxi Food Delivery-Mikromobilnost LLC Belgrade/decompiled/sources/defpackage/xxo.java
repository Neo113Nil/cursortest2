package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class xxo {
    public final ArrayList a;
    public final String b;

    public xxo(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxo)) {
            return false;
        }
        xxo xxoVar = (xxo) obj;
        return this.a.equals(xxoVar.a) && jl40.l(this.b, xxoVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ExtendedOptionsUiState(items=" + this.a + ", header=" + this.b + Extension.C_BRAKE;
    }
}
