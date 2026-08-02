package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class upl0 extends vpl0 {
    public final String c;

    public upl0(String str) {
        super(true, str);
        this.c = str;
    }

    @Override // defpackage.vpl0
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof upl0) && this.c.equals(((upl0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return oyr.p("VisibleState(title=", this.c, Extension.C_BRAKE);
    }
}
