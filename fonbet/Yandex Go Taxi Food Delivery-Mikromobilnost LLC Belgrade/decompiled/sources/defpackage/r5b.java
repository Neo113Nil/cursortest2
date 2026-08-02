package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class r5b {
    public final String a;
    public final String b;
    public final boolean c;

    public r5b(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5b)) {
            return false;
        }
        r5b r5bVar = (r5b) obj;
        return jl40.l(this.a, r5bVar.a) && jl40.l(this.b, r5bVar.b) && this.c == r5bVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return x4e.i(b64.v("ChatMiniappEntity(chatId=", this.a, ", miniappUrl=", this.b, ", trusted="), this.c, Extension.C_BRAKE);
    }
}
