package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class sob implements xob {
    public final boolean a;
    public final String b;
    public final int c;

    public sob(boolean z, String str, int i) {
        this.a = z;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sob)) {
            return false;
        }
        sob sobVar = (sob) obj;
        return this.a == sobVar.a && jl40.l(this.b, sobVar.b) && this.c == sobVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, ly3.v("CheckOptionAction(checked=", ", optionId=", this.b, ", groupIndex=", this.a));
    }
}
