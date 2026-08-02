package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xis extends yis {
    public final Throwable b;
    public final boolean c;

    public xis(Throwable th, boolean z) {
        super(new tis(r501.a(th, unr0.h(Text.Companion, dzh0.ybsdk_pin_seems_like_you_forgot_code), new Text.Resource(dzh0.ybsdk_pin_you_have_to_log_in_again), new Text.Resource(dzh0.ybsdk_pin_set_new_code), z ? new Text.Resource(dzh0.ybsdk_common_exit_account_title) : null, null, null, null, null, null, new nbv(txg0.ybsdk_ic_status_error, null), null, null, 55234)));
        this.b = th;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xis)) {
            return false;
        }
        xis xisVar = (xis) obj;
        return jl40.l(this.b, xisVar.b) && this.c == xisVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "TooManyAttempts(throwable=" + this.b + ", shouldShowErrorSignOutButton=" + this.c + Extension.C_BRAKE;
    }
}
