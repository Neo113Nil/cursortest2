package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zv7 extends cw7 {
    public final String a;
    public final z220 b;
    public final String c;

    public zv7(String str, z220 z220Var, String str2) {
        this.a = str;
        this.b = z220Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv7)) {
            return false;
        }
        zv7 zv7Var = (zv7) obj;
        return jl40.l(this.a, zv7Var.a) && this.b.equals(zv7Var.b) && jl40.l(this.c, zv7Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancelMessageButtonActionOpenChat(title=");
        sb.append(this.a);
        sb.append(", messengerParams=");
        sb.append(this.b);
        sb.append(", imageTag=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
