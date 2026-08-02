package ru.CryptoPro.ssl;

import defpackage.kbs;
import defpackage.ny61;
import defpackage.oyr;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.SecretKey;
import ru.CryptoPro.JCP.Key.MasterSecretInterface;
import ru.CryptoPro.ssl.gost.GostConstants;

/* loaded from: classes4.dex */
final class cl_55 extends cl_47 {
    public final byte[] b;
    public final cl_84 c;
    public final boolean d;

    public cl_55(cl_84 cl_84Var, cl_46 cl_46Var, cl_8 cl_8Var) {
        this.c = cl_84Var;
        cl_11 cl_11Var = cl_8Var.w;
        this.d = cl_11Var == cl_11.q || cl_11Var == cl_11.r || cl_11Var == cl_11.s || cl_11Var == cl_11.t || cl_11Var == cl_11.u;
        byte[] bArr = new byte[(cl_11Var == cl_11.t || cl_11Var == cl_11.u) ? 32 : cl_84Var.n >= cl_84.x.n ? 12 : 36];
        this.b = bArr;
        cl_46Var.read(bArr);
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final void a(cl_62 cl_62Var) {
        cl_62Var.write(this.b);
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int c() {
        return this.b.length;
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final String d() {
        StringBuffer stringBuffer = new StringBuffer("*** Finished\n");
        stringBuffer.append(cl_47.a("verify_data", this.b));
        stringBuffer.append("***\n");
        return stringBuffer.toString();
    }

    public final byte[] e(cl_45 cl_45Var, int i, SecretKey secretKey, boolean z) {
        String str;
        if (i == 1 || i == 2) {
            int i2 = this.c.n;
            if (i2 >= cl_84.x.n) {
                try {
                    if (z) {
                        try {
                            return ((MasterSecretInterface) secretKey).computeFinished(i == 1 ? GostConstants.LABEL_CLIENT_FINISHED : GostConstants.LABEL_SERVER_FINISHED, ((MessageDigest) cl_45Var.c.clone()).digest());
                        } catch (CloneNotSupportedException e) {
                            throw new RuntimeException("Could not clone digest", e);
                        }
                    }
                    if (i2 >= cl_84.z.n) {
                        cl_45Var.getClass();
                        throw new RuntimeException("getFinishedHash() unsupported.");
                    }
                    if (cl_45Var.a != 1) {
                        throw new RuntimeException("getMD5Clone() can be only be called for TLS 1.1");
                    }
                    throw new RuntimeException("getMD5Clone() unsupported.");
                } catch (GeneralSecurityException e2) {
                    ny61.n("PRF failed", e2);
                    return null;
                }
            }
            str = "Digest failed";
        } else {
            str = oyr.i(i, "Invalid sender: ");
        }
        kbs.g(str);
        return null;
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int a() {
        return 20;
    }

    public cl_55(cl_84 cl_84Var, cl_45 cl_45Var, int i, SecretKey secretKey, cl_8 cl_8Var) {
        this.c = cl_84Var;
        cl_11 cl_11Var = cl_8Var.w;
        boolean z = cl_11Var == cl_11.q || cl_11Var == cl_11.r || cl_11Var == cl_11.s || cl_11Var == cl_11.t || cl_11Var == cl_11.u;
        this.d = z;
        this.b = e(cl_45Var, i, secretKey, z);
    }
}
