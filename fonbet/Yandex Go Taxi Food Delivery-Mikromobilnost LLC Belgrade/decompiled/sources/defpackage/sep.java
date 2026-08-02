package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class sep implements tep {
    public final ydp a;

    public sep(ydp ydpVar) {
        this.a = ydpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sep) && jl40.l(this.a, ((sep) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ViewOpened(payload=" + this.a + Extension.C_BRAKE;
    }
}
