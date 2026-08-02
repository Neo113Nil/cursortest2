package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.X509CertImpl;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes11.dex */
public final class sz5 extends keo {
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public sz5(String str, String str2, String str3, boolean z) {
        super("biometry_supply_device_challenge_result", b.i(new Pair(Constants.KEY_DATA, str), new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str2), new Pair(X509CertImpl.SIGNATURE, str3), new Pair("user_success", String.valueOf(z))));
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz5)) {
            return false;
        }
        sz5 sz5Var = (sz5) obj;
        return jl40.l(this.c, sz5Var.c) && jl40.l(this.d, sz5Var.d) && jl40.l(this.e, sz5Var.e) && this.f == sz5Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + unr0.b(unr0.b(this.c.hashCode() * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return nnm.i(this.e, ", userSuccess=", Extension.C_BRAKE, b64.v("BiometrySupplyDeviceChallengeResult(data=", this.c, ", description=", this.d, ", secureSignature="), this.f);
    }
}
