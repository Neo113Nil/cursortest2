package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zn01 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Text d;
    public final int e;

    public zn01(boolean z, boolean z2, boolean z3, Text.Resource resource, int i) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = resource;
        this.e = i;
    }

    public final Text a() {
        return this.d;
    }

    public final boolean b() {
        return this.c;
    }

    public final int c() {
        return this.e;
    }

    public final boolean d() {
        return this.a;
    }

    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn01)) {
            return false;
        }
        zn01 zn01Var = (zn01) obj;
        return this.a == zn01Var.a && this.b == zn01Var.b && this.c == zn01Var.c && jl40.l(this.d, zn01Var.d) && this.e == zn01Var.e;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Text text = this.d;
        return Integer.hashCode(this.e) + ((e + (text == null ? 0 : text.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder u = qv10.u("TransferReceiverNameViewState(isButtonEnabled=", ", isButtonLoading=", ", hasError=", this.a, this.b);
        u.append(this.c);
        u.append(", errorText=");
        u.append(this.d);
        u.append(", subtitleColorAttr=");
        return oyr.m(this.e, Extension.C_BRAKE, u);
    }

    public zn01() {
        this(false, false, false, null, ung0.ybColor_textIcon_secondary);
    }
}
