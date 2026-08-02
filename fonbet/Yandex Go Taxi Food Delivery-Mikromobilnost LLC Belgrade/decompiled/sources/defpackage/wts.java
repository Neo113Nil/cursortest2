package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class wts {
    public final String a;
    public final String b;
    public final boolean c;

    public wts(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public static wts a(wts wtsVar, boolean z) {
        String str = wtsVar.a;
        String str2 = wtsVar.b;
        wtsVar.getClass();
        return new wts(str, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wts)) {
            return false;
        }
        wts wtsVar = (wts) obj;
        return jl40.l(this.a, wtsVar.a) && jl40.l(this.b, wtsVar.b) && this.c == wtsVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("GasStationServiceFilterUiModel(filterId=", this.a, ", filterName=", this.b, ", isSelected="), this.c, Extension.C_BRAKE);
    }
}
