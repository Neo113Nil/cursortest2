package defpackage;

import com.yandex.go.overdraft.data.model.t0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class wqk0 {
    public final String a;
    public final String b;
    public final String c;
    public final t0 d;

    public wqk0(String str, String str2, String str3, t0 t0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqk0)) {
            return false;
        }
        wqk0 wqk0Var = (wqk0) obj;
        return jl40.l(this.a, wqk0Var.a) && jl40.l(this.b, wqk0Var.b) && jl40.l(this.c, wqk0Var.c) && jl40.l(this.d, wqk0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideViewModel(title=", this.a, ", subtitle=", this.b, ", description=");
        v.append(this.c);
        v.append(", tapAction=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
