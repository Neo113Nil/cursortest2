package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class s62 implements y62 {
    public final ie3 a;

    public s62(ie3 ie3Var) {
        this.a = ie3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s62) && jl40.l(this.a, ((s62) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "AuctionAction(auctionUiAction=" + this.a + Extension.C_BRAKE;
    }
}
