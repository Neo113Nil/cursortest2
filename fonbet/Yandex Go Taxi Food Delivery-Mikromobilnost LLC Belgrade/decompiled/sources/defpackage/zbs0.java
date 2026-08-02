package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import org.bouncycastle.cms.CMSException;
import ru.cprocsp.ACSP.tools.integrity.CSPIntegrityConstants;

/* loaded from: classes4.dex */
public final class zbs0 {
    public final xbs0 a;
    public final i87 b;
    public final i87 c;
    public final she d;
    public final ljj e;
    public final xr1 f;
    public final t87 g;
    public byte[] h;

    public zbs0(zbs0 zbs0Var, ru61 ru61Var, i87 i87Var) {
        this.h = null;
        this.a = zbs0Var.a;
        this.d = zbs0Var.d;
        this.f = zbs0Var.f;
        this.e = zbs0Var.e;
        this.g = zbs0Var.g;
        this.b = ru61Var;
        this.c = i87Var;
    }

    public static HashMap b(u2 u2Var, xr1 xr1Var, xr1 xr1Var2, byte[] bArr) {
        HashMap hashMap = new HashMap();
        if (u2Var != null) {
            hashMap.put("contentType", u2Var);
        }
        hashMap.put("digestAlgID", xr1Var);
        hashMap.put("signatureAlgID", xr1Var2);
        hashMap.put(CSPIntegrityConstants.DIGEST, rza1.b(bArr));
        return hashMap;
    }

    public final ybs0 a(u2 u2Var) {
        xr1 xr1Var;
        lqf lqfVar;
        she sheVar = this.d;
        try {
            xr1 findEncryptionAlgorithm = this.g.findEncryptionAlgorithm(sheVar.getAlgorithmIdentifier());
            i87 i87Var = this.b;
            lqf lqfVar2 = null;
            ljj ljjVar = this.e;
            if (i87Var != null) {
                xr1Var = ljjVar.getAlgorithmIdentifier();
                this.h = ljjVar.getDigest();
                xc3 b = i87Var.b(Collections.unmodifiableMap(b(u2Var, ljjVar.getAlgorithmIdentifier(), findEncryptionAlgorithm, this.h)));
                lqf lqfVar3 = b != null ? new lqf(b.g()) : null;
                OutputStream outputStream = sheVar.getOutputStream();
                outputStream.write(lqfVar3.getEncoded("DER"));
                outputStream.close();
                lqfVar = lqfVar3;
            } else {
                xr1Var = this.f;
                if (ljjVar != null) {
                    this.h = ljjVar.getDigest();
                } else {
                    this.h = null;
                }
                lqfVar = null;
            }
            byte[] signature = sheVar.getSignature();
            i87 i87Var2 = this.c;
            if (i87Var2 != null) {
                HashMap b2 = b(u2Var, xr1Var, findEncryptionAlgorithm, this.h);
                b2.put("encryptedDigest", rza1.b(signature));
                xc3 b3 = i87Var2.b(Collections.unmodifiableMap(b2));
                if (b3 != null) {
                    lqfVar2 = new lqf(b3.g());
                }
            }
            lqf lqfVar4 = lqfVar2;
            if (i87Var == null && ekn.b.q(findEncryptionAlgorithm.a)) {
                xr1Var = new xr1(a150.l);
            }
            return new ybs0(this.a, xr1Var, lqfVar, findEncryptionAlgorithm, new dqf(signature), lqfVar4);
        } catch (IOException e) {
            throw new CMSException("encoding error.", e);
        }
    }

    public zbs0(xbs0 xbs0Var, she sheVar, ljj ljjVar, t87 t87Var, kkh kkhVar) {
        this.h = null;
        this.a = xbs0Var;
        this.d = sheVar;
        this.f = ljjVar.getAlgorithmIdentifier();
        this.e = ljjVar;
        this.b = kkhVar;
        this.c = null;
        this.g = t87Var;
    }
}
