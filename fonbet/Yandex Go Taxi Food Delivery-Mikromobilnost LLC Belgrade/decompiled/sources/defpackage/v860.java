package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v860 {
    public final boolean a;
    public final String b;
    public final ColorModel c;

    public v860(String str, ColorModel colorModel, boolean z) {
        this.a = z;
        this.b = str;
        this.c = colorModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v860)) {
            return false;
        }
        v860 v860Var = (v860) obj;
        return this.a == v860Var.a && jl40.l(this.b, v860Var.b) && jl40.l(this.c, v860Var.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ColorModel colorModel = this.c;
        return hashCode2 + (colorModel != null ? colorModel.hashCode() : 0);
    }

    public final String toString() {
        return n.o(ly3.v("NfcPayloadEntity(hideNativeNfcButton=", ", buttonDeeplink=", this.b, ", buttonTint=", this.a), this.c, Extension.C_BRAKE);
    }

    public /* synthetic */ v860(int i) {
        this(null, null, false);
    }

    public v860() {
        this(0);
    }
}
