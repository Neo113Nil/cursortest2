package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.AccessDeniedEsiaVerificationEbsException;
import ru.rt.ebs.cryptosdk.presentation.error.accessDenied.AccessDeniedFragment;

/* loaded from: classes4.dex */
public final class sfp0 extends mds {
    public final AccessDeniedEsiaVerificationEbsException a;

    public sfp0(AccessDeniedEsiaVerificationEbsException accessDeniedEsiaVerificationEbsException) {
        this.a = accessDeniedEsiaVerificationEbsException;
    }

    @Override // defpackage.mds
    public final Fragment a() {
        AccessDeniedFragment.Companion.getClass();
        AccessDeniedFragment accessDeniedFragment = new AccessDeniedFragment();
        accessDeniedFragment.setArguments(wwg.g(new Pair("ARG_ACCESS_DENIED_ERROR", this.a)));
        return accessDeniedFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sfp0) && jl40.l(this.a, ((sfp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AccessDeniedScreen(error=" + this.a + Extension.C_BRAKE;
    }
}
