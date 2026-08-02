package defpackage;

import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentFullscreen;
import com.yandex.go.payments.acceptance.data.model.d;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class xd implements zd {
    public final String a;
    public final AcceptancePaymentFullscreen b;

    static {
        d dVar = AcceptancePaymentFullscreen.Companion;
    }

    public xd(String str, AcceptancePaymentFullscreen acceptancePaymentFullscreen) {
        this.a = str;
        this.b = acceptancePaymentFullscreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd)) {
            return false;
        }
        xd xdVar = (xd) obj;
        return jl40.l(this.a, xdVar.a) && jl40.l(this.b, xdVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        AcceptancePaymentFullscreen acceptancePaymentFullscreen = this.b;
        return hashCode + (acceptancePaymentFullscreen == null ? 0 : acceptancePaymentFullscreen.hashCode());
    }

    public final String toString() {
        return "Loading(text=" + this.a + ", fullscreen=" + this.b + Extension.C_BRAKE;
    }
}
