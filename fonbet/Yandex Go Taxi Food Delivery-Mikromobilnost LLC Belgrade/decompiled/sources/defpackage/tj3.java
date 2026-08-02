package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes6.dex */
public final class tj3 {
    public static final sj3 Companion = new sj3();
    public final String a;
    public final String b;

    public /* synthetic */ tj3(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, rj3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final String toString() {
        return unr0.p("AuthParam(id=", this.a, ", phone=", this.b, Extension.C_BRAKE);
    }

    public tj3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
