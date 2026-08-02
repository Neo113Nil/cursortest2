package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.tv;

/* loaded from: classes7.dex */
public final class zj81 {
    public final tv a;
    public final String b;

    public zj81(tv tvVar, String str) {
        this.a = tvVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj81)) {
            return false;
        }
        zj81 zj81Var = (zj81) obj;
        return this.a == zj81Var.a && jl40.l(this.b, zj81Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CloseButtonValue(type=" + this.a + ", text=" + this.b + Extension.C_BRAKE;
    }
}
