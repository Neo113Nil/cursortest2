package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v9f extends gc5 {
    public final String c;

    public v9f(int i) {
        super("credit_account_loader", 2);
        this.c = "credit_account_loader";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v9f) && jl40.l(this.c, ((v9f) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return oyr.p("CreditAccountLoaderViewItem(id=", this.c, Extension.C_BRAKE);
    }

    public v9f() {
        this(0);
    }
}
