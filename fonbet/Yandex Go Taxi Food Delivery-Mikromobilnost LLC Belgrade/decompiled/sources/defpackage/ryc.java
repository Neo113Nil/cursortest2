package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ryc extends yzc {
    public final myc c;
    public final myc d;

    public ryc(myc mycVar, myc mycVar2) {
        super("complete-buttons-key");
        this.c = mycVar;
        this.d = mycVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryc)) {
            return false;
        }
        ryc rycVar = (ryc) obj;
        return this.c.equals(rycVar.c) && jl40.l(this.d, rycVar.d);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        myc mycVar = this.d;
        return hashCode + (mycVar == null ? 0 : mycVar.hashCode());
    }

    public final String toString() {
        return "CompleteButtonsModel(primaryButton=" + this.c + ", secondaryButton=" + this.d + Extension.C_BRAKE;
    }
}
