package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wak0 implements yak0 {
    public final String a;
    public final String b;

    public wak0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wak0)) {
            return false;
        }
        wak0 wak0Var = (wak0) obj;
        return this.a.equals(wak0Var.a) && this.b.equals(wak0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("OpenChat(analyticsName=", this.a, ", url=", this.b, Extension.C_BRAKE);
    }
}
