package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class uv40 implements vv40 {
    public final CharSequence a;

    public uv40(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uv40) && jl40.l(this.a, ((uv40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.h(this.a, "Loading(buttonText=", Extension.C_BRAKE);
    }
}
