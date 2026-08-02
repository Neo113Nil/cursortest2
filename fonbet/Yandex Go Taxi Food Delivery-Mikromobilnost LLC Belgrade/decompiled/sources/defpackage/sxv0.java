package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class sxv0 extends uxv0 {
    public final CharSequence a;

    public sxv0(String str) {
        this.a = str;
    }

    @Override // defpackage.uxv0
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxv0) && jl40.l(this.a, ((sxv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.h(this.a, "ErrorWithAction(input=", Extension.C_BRAKE);
    }
}
