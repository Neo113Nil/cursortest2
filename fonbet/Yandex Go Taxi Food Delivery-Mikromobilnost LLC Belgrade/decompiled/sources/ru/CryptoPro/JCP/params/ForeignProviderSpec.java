package ru.CryptoPro.JCP.params;

import defpackage.nzs;
import defpackage.w511;
import java.util.Enumeration;
import java.util.Vector;
import ru.CryptoPro.JCP.pref.JCPRes;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public class ForeignProviderSpec implements ParamsInterface {
    public static final int DEFAULT = -1;
    public static final int PROVIDER_ECDSA = 4;
    public static final int PROVIDER_EDDSA = 5;
    public static final int PROVIDER_RSA = 3;
    public static final OID[] b = {AlgIdSpecForeign.OID_RSA, AlgIdSpecForeign.OID_ECDSA, AlgIdSpecForeign.OID_ECDH, AlgIdSpecForeign.OID_EDDSA};
    public static final String[] c = {JCPRes.getString("panel.alg.provider.RSA", 2), JCPRes.getString("panel.alg.provider.ECDSA", 2), JCPRes.getString("panel.alg.provider.ECDSA", 2), JCPRes.getString("panel.alg.provider.EDDSA", 2)};
    public static final ForeignProviderSpec[] w = {new ForeignProviderSpec(3), new ForeignProviderSpec(4), new ForeignProviderSpec(4), new ForeignProviderSpec(5)};
    public final int a;

    public ForeignProviderSpec(int i) {
        this.a = i;
    }

    public static ForeignProviderSpec getInstance(OID oid) {
        int i = 0;
        if (oid != null) {
            while (true) {
                OID[] oidArr = b;
                if (i >= oidArr.length) {
                    w511.q();
                    return null;
                }
                if (oidArr[i].equals(oid)) {
                    break;
                }
                i++;
            }
        }
        return w[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ForeignProviderSpec) {
            return this.a == ((ForeignProviderSpec) obj).a;
        }
        return false;
    }

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    public final OID getDefault(OID oid) {
        return oid == null ? b[0] : oid;
    }

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    public final String getNameByOID(OID oid) {
        int i = 0;
        while (true) {
            OID[] oidArr = b;
            if (i >= oidArr.length) {
                w511.q();
                return null;
            }
            if (oidArr[i].equals(oid)) {
                return c[i];
            }
            i++;
        }
    }

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    public final OID getOID() {
        throw new IllegalArgumentException();
    }

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    public final OID getOIDByName(String str) {
        int i = 0;
        while (true) {
            OID[] oidArr = b;
            if (i >= oidArr.length) {
                w511.q();
                return null;
            }
            if (c[i].equals(str)) {
                return oidArr[i];
            }
            i++;
        }
    }

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    public final Enumeration getOIDs(OID oid) {
        Vector vector = new Vector(0);
        vector.add(AlgIdSpecForeign.OID_RSA);
        vector.add(AlgIdSpecForeign.OID_ECDSA);
        vector.add(AlgIdSpecForeign.OID_EDDSA);
        return vector.elements();
    }

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    public final void setDefault(OID oid) {
        throw new IllegalArgumentException();
    }

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    public final boolean setDefaultAvailable() {
        return nzs.u(ForeignProviderSpec.class);
    }

    public final String toString() {
        return getClass().getName() + Extension.COLON_SPACE + b[this.a].toString();
    }

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    public final void setDefault(OID oid, OID oid2) {
        throw new IllegalArgumentException();
    }

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    public final Enumeration getOIDs() {
        return getOIDs(null);
    }

    public static ForeignProviderSpec getInstance() {
        return w[0];
    }
}
