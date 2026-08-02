package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class m66 {
    public static final m66 e;
    public final boolean a;
    public final String[] b;
    public final String[] c;
    public final boolean d;

    static {
        fl4[] fl4VarArr = {fl4.o, fl4.p, fl4.q, fl4.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, fl4.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, fl4.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, fl4.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, fl4.n, fl4.m, fl4.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, fl4.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, fl4.TLS_RSA_WITH_AES_128_GCM_SHA256, fl4.TLS_RSA_WITH_AES_256_GCM_SHA384, fl4.TLS_RSA_WITH_AES_128_CBC_SHA, fl4.TLS_RSA_WITH_AES_256_CBC_SHA, fl4.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        k66 k66Var = new k66();
        k66Var.a = true;
        k66Var.c(fl4VarArr);
        tks tksVar = tks.TLS_1_3;
        tks tksVar2 = tks.TLS_1_2;
        k66Var.f(tksVar, tksVar2);
        k66Var.d = true;
        m66 m66Var = new m66(k66Var);
        e = m66Var;
        tks[] tksVarArr = {tksVar, tksVar2, tks.TLS_1_1, tks.TLS_1_0};
        boolean z = m66Var.a;
        if (!z) {
            xq0.q("no TLS versions for cleartext connections");
            return;
        }
        if (tksVarArr.length == 0) {
            xq0.x("At least one TlsVersion is required");
            return;
        }
        String[] strArr = new String[tksVarArr.length];
        for (int i = 0; i < tksVarArr.length; i++) {
            strArr[i] = tksVarArr[i].a;
        }
        if (z) {
            return;
        }
        xq0.q("no TLS extensions for cleartext connections");
    }

    public m66(k66 k66Var) {
        this.a = k66Var.a;
        this.b = k66Var.b;
        this.c = k66Var.c;
        this.d = k66Var.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m66)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        m66 m66Var = (m66) obj;
        boolean z = m66Var.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.b, m66Var.b) && Arrays.equals(this.c, m66Var.c) && this.d == m66Var.d;
        }
        return true;
    }

    public final int hashCode() {
        if (this.a) {
            return ((((527 + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c)) * 31) + (!this.d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List unmodifiableList;
        tks tksVar;
        if (!this.a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.b;
        if (strArr == null) {
            unmodifiableList = null;
        } else {
            fl4[] fl4VarArr = new fl4[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                fl4VarArr[i] = str.startsWith("SSL_") ? fl4.valueOf("TLS_".concat(str.substring(4))) : fl4.valueOf(str);
            }
            String[] strArr2 = bvt.a;
            unmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) fl4VarArr.clone()));
        }
        StringBuilder u = ouj.u("ConnectionSpec(cipherSuites=", unmodifiableList == null ? "[use default]" : unmodifiableList.toString(), ", tlsVersions=");
        String[] strArr3 = this.c;
        tks[] tksVarArr = new tks[strArr3.length];
        for (int i2 = 0; i2 < strArr3.length; i2++) {
            String str2 = strArr3[i2];
            if ("TLSv1.3".equals(str2)) {
                tksVar = tks.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                tksVar = tks.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                tksVar = tks.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                tksVar = tks.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    xq0.x(f1d.g("Unexpected TLS version: ", str2));
                    return null;
                }
                tksVar = tks.SSL_3_0;
            }
            tksVarArr[i2] = tksVar;
        }
        String[] strArr4 = bvt.a;
        u.append(Collections.unmodifiableList(Arrays.asList((Object[]) tksVarArr.clone())));
        u.append(", supportsTlsExtensions=");
        return ouj.r(u, this.d, ")");
    }
}
