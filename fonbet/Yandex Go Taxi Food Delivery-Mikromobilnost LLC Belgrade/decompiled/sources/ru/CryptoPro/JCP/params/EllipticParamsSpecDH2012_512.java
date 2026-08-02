package ru.CryptoPro.JCP.params;

import defpackage.htf0;
import defpackage.nzs;
import defpackage.w511;
import java.security.AccessController;
import ru.CryptoPro.JCP.pref.JCPPref;

/* loaded from: classes4.dex */
public class EllipticParamsSpecDH2012_512 extends EllipticParamsSpec2012_512 {
    public static int z = EllipticParamsSpec2012_512.getIndex(loadDefault("EllipticParamsSpecDH2012_512_class_defaultECC2012", EllipticParamsSpec2012_512.OID_tc26_gost_3410_12_512_paramSetA));

    public static EllipticParamsSpec2012_512 getInstance(int i) {
        if (i == -1) {
            i = z;
        }
        if (i < 0 || i >= EllipticParamsSpec2012_512.b.length) {
            w511.q();
            return null;
        }
        return EllipticParamsSpec2012_512.x[i + 3];
    }

    public static OID loadDefault(String str, OID oid) {
        OID oid2;
        try {
            oid2 = (OID) AccessController.doPrivileged(new htf0(str, 13));
        } catch (Exception unused) {
            oid2 = null;
        }
        return oid2 == null ? oid : oid2;
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsSpec2012_512
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EllipticParamsSpecDH2012_512) {
            return this.a == ((EllipticParamsSpecDH2012_512) obj).a;
        }
        return false;
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsSpec2012_512, ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final OID getDefault(OID oid) {
        return EllipticParamsSpec2012_512.b[z];
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsSpec2012_512, ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final void setDefault(OID oid, OID oid2) {
        int index = EllipticParamsSpec2012_512.getIndex(oid2);
        if (index < 0) {
            w511.q();
        } else {
            z = index;
            new JCPPref(EllipticParamsSpecDH2012_512.class).putOID("EllipticParamsSpecDH2012_512_class_defaultECC2012", EllipticParamsSpec2012_512.b[index]);
        }
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsSpec2012_512, ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final boolean setDefaultAvailable() {
        return nzs.u(EllipticParamsSpecDH2012_512.class);
    }

    public static EllipticParamsSpec2012_512 getInstance() {
        return EllipticParamsSpec2012_512.x[z + 3];
    }

    public static EllipticParamsSpec2012_512 getInstance(OID oid) {
        return EllipticParamsSpec2012_512.x[(oid == null ? z : EllipticParamsSpec2012_512.getIndex(oid)) + 3];
    }
}
