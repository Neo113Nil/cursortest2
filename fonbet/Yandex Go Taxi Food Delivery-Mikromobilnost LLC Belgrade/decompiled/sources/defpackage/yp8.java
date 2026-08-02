package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class yp8 extends aq8 {
    public final hig c;
    public final boolean d;

    public yp8(hig higVar, boolean z) {
        this.c = higVar;
        this.d = z;
    }

    @Override // defpackage.aq8
    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp8)) {
            return false;
        }
        yp8 yp8Var = (yp8) obj;
        return this.c.equals(yp8Var.c) && this.d == yp8Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "Card(cardViewState=" + this.c + ", hasBackdrop=" + this.d + Extension.C_BRAKE;
    }
}
