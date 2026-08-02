package defpackage;

import com.yandex.go.trusted_contacts.ui.error.ErrorScreenAction;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wg11 {
    public final String a;
    public final String b;
    public final String c;
    public final ErrorScreenAction d;

    public wg11(String str, String str2, String str3, ErrorScreenAction errorScreenAction) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = errorScreenAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg11)) {
            return false;
        }
        wg11 wg11Var = (wg11) obj;
        return jl40.l(this.a, wg11Var.a) && jl40.l(this.b, wg11Var.b) && jl40.l(this.c, wg11Var.c) && this.d == wg11Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("TrustedContactsErrorUiState(title=", this.a, ", text=", this.b, ", buttonText=");
        v.append(this.c);
        v.append(", action=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
