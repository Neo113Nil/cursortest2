package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class v330 {
    public final String a;

    public /* synthetic */ v330(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v330) {
            return jl40.l(this.a, ((v330) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("ModalWindowId(id=", this.a, Extension.C_BRAKE);
    }
}
