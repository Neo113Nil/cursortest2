package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class sqi0 {
    public final boolean a;
    public final kao b;
    public final Text c;
    public final Text d;

    public sqi0(boolean z, kao kaoVar, Text text, Text text2) {
        this.a = z;
        this.b = kaoVar;
        this.c = text;
        this.d = text2;
    }

    public final kao a() {
        return this.b;
    }

    public final Text b() {
        return this.d;
    }

    public final Text c() {
        return this.c;
    }

    public final boolean d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqi0)) {
            return false;
        }
        sqi0 sqi0Var = (sqi0) obj;
        return this.a == sqi0Var.a && jl40.l(this.b, sqi0Var.b) && jl40.l(this.c, sqi0Var.c) && jl40.l(this.d, sqi0Var.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        kao kaoVar = this.b;
        int hashCode2 = (hashCode + (kaoVar == null ? 0 : kaoVar.hashCode())) * 31;
        Text text = this.c;
        int hashCode3 = (hashCode2 + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.d;
        return hashCode3 + (text2 != null ? text2.hashCode() : 0);
    }

    public final String toString() {
        return "RegistrationApplicationStatusViewState(showProgress=" + this.a + ", errorState=" + this.b + ", progressTitle=" + this.c + ", progressSubtitle=" + this.d + Extension.C_BRAKE;
    }
}
