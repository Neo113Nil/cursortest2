package ru.CryptoPro.JCP.params;

import defpackage.nzs;
import defpackage.w511;
import java.util.Enumeration;
import java.util.Vector;
import ru.CryptoPro.JCP.pref.JCPRes;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public class ProviderSpec implements ParamsInterface {
    public static final int DEFAULT = -1;
    public static final int PROVIDER_2001 = 0;
    public static final int PROVIDER_2012_256 = 1;
    public static final int PROVIDER_2012_512 = 2;
    public static final OID[] b = {AlgIdSpec.OID_19, AlgIdSpec.OID_98, AlgIdSpec.OID_PARAMS_SIG_2012_256, AlgIdSpec.OID_PARAMS_EXC_2012_256, AlgIdSpec.OID_PARAMS_SIG_2012_512, AlgIdSpec.OID_PARAMS_EXC_2012_512};
    public static final String[] c = {JCPRes.getString("panel.alg.provider.gost2001", 2), JCPRes.getString("panel.alg.provider.gost2001", 2), JCPRes.getString("panel.alg.provider.gost2012_256", 2), JCPRes.getString("panel.alg.provider.gost2012_256", 2), JCPRes.getString("panel.alg.provider.gost2012_512", 2), JCPRes.getString("panel.alg.provider.gost2012_512", 2)};
    public static final ProviderSpec[] w = {new ProviderSpec(0), new ProviderSpec(0), new ProviderSpec(1), new ProviderSpec(1), new ProviderSpec(2), new ProviderSpec(2)};
    public final int a;

    public ProviderSpec(int i) {
        this.a = i;
    }

    public static ProviderSpec getInstance(OID oid) {
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
        if (obj instanceof ProviderSpec) {
            return this.a == ((ProviderSpec) obj).a;
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
        vector.add(AlgIdSpec.OID_19);
        vector.add(AlgIdSpec.OID_PARAMS_SIG_2012_256);
        vector.add(AlgIdSpec.OID_PARAMS_SIG_2012_512);
        return vector.elements();
    }

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    public final void setDefault(OID oid) {
        throw new IllegalArgumentException();
    }

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    public final boolean setDefaultAvailable() {
        return nzs.u(ProviderSpec.class);
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

    public static ProviderSpec getInstance() {
        return w[0];
    }
}
