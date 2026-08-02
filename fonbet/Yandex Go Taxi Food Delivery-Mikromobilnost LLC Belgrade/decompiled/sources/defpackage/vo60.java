package defpackage;

import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Exception;
import org.bouncycastle.cert.CertIOException;
import org.bouncycastle.cert.ocsp.OCSPException;

/* loaded from: classes4.dex */
public final class vo60 {
    public final wo60 a;

    public vo60(InputStream inputStream) {
        try {
            wo60 m = wo60.m(new j2(inputStream).n());
            this.a = m;
            if (m == null) {
                throw new CertIOException("malformed response: no response data found");
            }
        } catch (ClassCastException e) {
            dy31.n("malformed response: ", e.getMessage(), e);
            throw null;
        } catch (IllegalArgumentException e2) {
            dy31.n("malformed response: ", e2.getMessage(), e2);
            throw null;
        } catch (ASN1Exception e3) {
            dy31.n("malformed response: ", e3.getMessage(), e3);
            throw null;
        }
    }

    public final Object a() {
        svj0 svj0Var = this.a.b;
        if (svj0Var == null) {
            return null;
        }
        boolean q = svj0Var.a.q(ro60.a);
        w2 w2Var = svj0Var.b;
        if (!q) {
            return w2Var;
        }
        try {
            return new ge5(he5.m(b3.r(w2Var.a)));
        } catch (Exception e) {
            throw new OCSPException("problem decoding object: " + e, e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vo60) {
            return this.a.equals(((vo60) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
