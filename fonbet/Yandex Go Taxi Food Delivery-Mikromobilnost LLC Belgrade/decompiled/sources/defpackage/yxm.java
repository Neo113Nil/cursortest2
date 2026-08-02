package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class yxm implements aym {
    public final String a;

    public yxm(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yxm) && jl40.l(this.a, ((yxm) obj).a);
    }

    @Override // defpackage.aym
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("ExactMinutesWithoutPicker(title=", this.a, Extension.C_BRAKE);
    }
}
