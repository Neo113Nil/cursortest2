package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class tqo0 implements uqo0 {
    public final CharSequence a;

    public tqo0(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tqo0) && jl40.l(this.a, ((tqo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.h(this.a, "Title(text=", Extension.C_BRAKE);
    }
}
