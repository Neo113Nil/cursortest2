package ru.CryptoPro.JCP.params;

import defpackage.htf0;
import defpackage.nzs;
import java.security.AccessController;
import ru.CryptoPro.JCP.pref.JCPPref;

/* loaded from: classes4.dex */
public class EllipticParamsSpecDH extends EllipticParamsSpec {
    public static int A = EllipticParamsSpec.getIndex(loadDefaultDH("EllipticParamsSpecDH_class_defaultDH"));
    public static int B = EllipticParamsSpec.getIndex(loadDefaultDH("EllipticParamsSpecDH_2012_256_class_defaultDH"));

    public static EllipticParamsSpec getInstance(OID oid) {
        return EllipticParamsSpec.x[(oid == null ? ProviderSpec.getInstance().a != 1 ? A : B : EllipticParamsSpec.getIndex(oid)) + 9];
    }

    public static OID loadDefaultDH(String str) {
        OID oid;
        try {
            oid = (OID) AccessController.doPrivileged(new htf0(str, 11));
        } catch (Exception unused) {
            oid = null;
        }
        return oid == null ? EllipticParamsSpec.OID_ECCDHPRO : oid;
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsSpec
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EllipticParamsSpecDH) {
            return this.a == ((EllipticParamsSpecDH) obj).a;
        }
        return false;
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsSpec, ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final OID getDefault(OID oid) {
        return EllipticParamsSpec.b[ProviderSpec.getInstance(oid).a != 1 ? A : B];
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsSpec, ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final void setDefault(OID oid, OID oid2) {
        int index = EllipticParamsSpec.getIndex(oid2);
        int i = oid != null ? ProviderSpec.getInstance(oid).a : 0;
        String str = i == 0 ? "EllipticParamsSpecDH_class_defaultDH" : "EllipticParamsSpecDH_2012_256_class_defaultDH";
        if (i != 1) {
            A = index;
        } else {
            B = index;
        }
        new JCPPref(EllipticParamsSpecDH.class).putOID(str, EllipticParamsSpec.b[index]);
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsSpec, ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final boolean setDefaultAvailable() {
        return nzs.u(EllipticParamsSpecDH.class);
    }

    public static EllipticParamsSpec getInstance(int i) {
        if (i == -1) {
            i = ProviderSpec.getInstance().a != 1 ? A : B;
        }
        return EllipticParamsSpec.x[i + 9];
    }

    public static EllipticParamsSpec getInstance() {
        return EllipticParamsSpec.x[(ProviderSpec.getInstance().a != 1 ? A : B) + 9];
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsSpec, ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final void setDefault(OID oid) {
        setDefault(null, oid);
    }
}
