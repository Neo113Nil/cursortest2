package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.presentation.esiaAuth.EsiaAuthEbsFragment;

/* loaded from: classes4.dex */
public final class ufp0 extends mds {
    public final boolean a;

    public ufp0(boolean z) {
        this.a = z;
    }

    @Override // defpackage.mds
    public final Fragment a() {
        EsiaAuthEbsFragment.Companion.getClass();
        EsiaAuthEbsFragment esiaAuthEbsFragment = new EsiaAuthEbsFragment();
        esiaAuthEbsFragment.setArguments(wwg.g(new Pair("ARG_IS_NEEDED_CLEAR_ESIA_SESSION", Boolean.valueOf(this.a))));
        return esiaAuthEbsFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufp0) && this.a == ((ufp0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("EsiaAuthorizationScreen(isNeededClearEsiaSession=", Extension.C_BRAKE, this.a);
    }
}
