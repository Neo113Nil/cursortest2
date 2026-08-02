package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zzj0 implements b0k0 {
    public final String a;

    public zzj0(String str) {
        this.a = str;
    }

    @Override // defpackage.b0k0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzj0) && jl40.l(this.a, ((zzj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("ClientState(formStateKey=", this.a, Extension.C_BRAKE);
    }
}
