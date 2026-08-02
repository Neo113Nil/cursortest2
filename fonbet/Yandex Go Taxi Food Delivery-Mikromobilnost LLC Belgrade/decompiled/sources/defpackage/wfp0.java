package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.presentation.error.noInternetConnection.NoInternetConnectionFragment;

/* loaded from: classes4.dex */
public final class wfp0 extends mds {
    public final Exception a;

    public wfp0(Exception exc) {
        this.a = exc;
    }

    @Override // defpackage.mds
    public final Fragment a() {
        NoInternetConnectionFragment.Companion.getClass();
        NoInternetConnectionFragment noInternetConnectionFragment = new NoInternetConnectionFragment();
        noInternetConnectionFragment.setArguments(wwg.g(new Pair("ARG_NO_INTERNET_CONNECTION_ERROR", this.a)));
        return noInternetConnectionFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wfp0) && jl40.l(this.a, ((wfp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NoInternetConnectionScreen(error=" + this.a + Extension.C_BRAKE;
    }
}
