package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class rxv0 extends uxv0 {
    public final CharSequence a;
    public final yxv0 b;
    public int c = 0;

    public rxv0(String str, yxv0 yxv0Var) {
        this.a = str;
        this.b = yxv0Var;
    }

    @Override // defpackage.uxv0
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxv0)) {
            return false;
        }
        rxv0 rxv0Var = (rxv0) obj;
        return jl40.l(this.a, rxv0Var.a) && this.b.equals(rxv0Var.b) && this.c == rxv0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + unr0.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        int i = this.c;
        StringBuilder sb = new StringBuilder("Content(input=");
        sb.append((Object) this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", scrollPosition=");
        return oyr.m(i, Extension.C_BRAKE, sb);
    }
}
