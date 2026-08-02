package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xxm implements aym {
    public final String a;

    public xxm(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xxm) && jl40.l(this.a, ((xxm) obj).a);
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
        return oyr.p("ExactMinutesWithPicker(title=", this.a, Extension.C_BRAKE);
    }
}
