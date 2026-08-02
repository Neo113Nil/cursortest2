package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.X509CertImpl;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class rz5 extends keo {
    public final String c;

    public rz5(String str) {
        super("biometry_signature_success", b.i(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Успешное формирование подписи: ".concat(gvu0.A0(10, str).concat("***"))), new Pair(X509CertImpl.SIGNATURE, gvu0.A0(10, str).concat("***"))));
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rz5) && jl40.l(this.c, ((rz5) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return oyr.p("BiometrySignatureSuccess(signature=", this.c, Extension.C_BRAKE);
    }
}
