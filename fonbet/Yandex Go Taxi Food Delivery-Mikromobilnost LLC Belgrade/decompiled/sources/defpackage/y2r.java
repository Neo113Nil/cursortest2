package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class y2r {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;

    public y2r(String str, String str2, String str3, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2r)) {
            return false;
        }
        y2r y2rVar = (y2r) obj;
        return jl40.l(this.a, y2rVar.a) && jl40.l(this.b, y2rVar.b) && jl40.l(this.c, y2rVar.c) && jl40.l(this.d, y2rVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.d;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("FileViewData(fileId=", this.a, ", filename=", this.b, ", fileExtension=");
        v.append(this.c);
        v.append(", fileSource=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public y2r() {
        this(null, null, null, null);
    }
}
