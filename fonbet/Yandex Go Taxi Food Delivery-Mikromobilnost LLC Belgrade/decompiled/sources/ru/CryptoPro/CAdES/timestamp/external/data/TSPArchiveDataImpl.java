package ru.CryptoPro.CAdES.timestamp.external.data;

import defpackage.a2;
import defpackage.b3;
import defpackage.dqf;
import defpackage.jqf;
import defpackage.l2;
import defpackage.lqf;
import defpackage.oqf;
import defpackage.u2;
import defpackage.vc3;
import defpackage.xbs0;
import defpackage.xc3;
import defpackage.xr1;
import defpackage.ybs0;
import java.security.MessageDigest;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class TSPArchiveDataImpl extends TSPSignatureDataImpl {
    public final u2 A;
    public final byte[] B;
    public final xr1 C;
    public final xr1 D;
    public final xc3 E;
    public final vc3 F;
    public final ybs0 G;
    public final xbs0 y;
    public final l2 z;

    public TSPArchiveDataImpl(byte[] bArr, byte[] bArr2, xbs0 xbs0Var, xr1 xr1Var, xr1 xr1Var2, int i, u2 u2Var, xc3 xc3Var, vc3 vc3Var, ybs0 ybs0Var) {
        super(bArr);
        this.y = xbs0Var;
        this.C = xr1Var;
        this.D = xr1Var2;
        this.z = new l2(i);
        this.A = u2Var;
        this.B = Array.copy(bArr2);
        this.E = new xc3(xc3.b(xc3Var.a));
        this.F = vc3Var;
        this.G = ybs0Var;
    }

    @Override // ru.CryptoPro.CAdES.timestamp.external.data.TSPSignatureDataImpl, ru.CryptoPro.AdES.external.timestamp.data.TSPData
    public byte[] getDigest() throws CAdESException {
        JCPLogger.fine("Calculating digest using signature and attributes...");
        if (this.x) {
            return getDigestOld();
        }
        try {
            String correctProviderByHashAlgorithm = AdESUtility.correctProviderByHashAlgorithm(this.b, this.c);
            String str = this.c;
            MessageDigest messageDigest = correctProviderByHashAlgorithm == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, correctProviderByHashAlgorithm);
            messageDigest.update(this.A.getEncoded());
            messageDigest.update(this.B);
            jqf jqfVar = (jqf) this.G.toASN1Primitive();
            int i = 0;
            while (true) {
                a2[] a2VarArr = jqfVar.a;
                if (i >= a2VarArr.length) {
                    messageDigest.update(this.F.b.a[0].toASN1Primitive().getEncoded("DER"));
                    return messageDigest.digest();
                }
                messageDigest.update(a2VarArr[i].toASN1Primitive().getEncoded());
                i++;
            }
        } catch (Exception e) {
            throw new CAdESException(e, IAdESException.ecATSHashIndexCreatingFailure);
        }
    }

    public byte[] getDigestOld() throws CAdESException {
        JCPLogger.fine("Calculating digest using signature and attributes (old)...");
        try {
            String correctProviderByHashAlgorithm = AdESUtility.correctProviderByHashAlgorithm(this.b, this.c);
            String str = this.c;
            MessageDigest messageDigest = correctProviderByHashAlgorithm == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, correctProviderByHashAlgorithm);
            messageDigest.update(this.A.getEncoded());
            messageDigest.update(this.B);
            messageDigest.update(this.z.getEncoded());
            boolean z = this.w;
            xbs0 xbs0Var = this.y;
            if (z) {
                messageDigest.update(xbs0Var.getEncoded());
            } else {
                messageDigest.update(xbs0.m(b3.r(xbs0Var.getEncoded())).getEncoded());
            }
            messageDigest.update(this.D.getEncoded());
            lqf lqfVar = new lqf(this.E.g());
            if (this.w) {
                messageDigest.update(lqfVar.getEncoded());
            } else {
                messageDigest.update(new oqf(2, 128, 0, lqfVar, 0).getEncoded());
            }
            messageDigest.update(this.C.getEncoded());
            boolean z2 = this.w;
            byte[] bArr = this.a;
            if (z2) {
                messageDigest.update(bArr);
            } else {
                messageDigest.update(new dqf(bArr).getEncoded());
            }
            boolean z3 = this.w;
            vc3 vc3Var = this.F;
            if (z3) {
                byte[] encoded = vc3Var.a.getEncoded("DER");
                byte[] encoded2 = vc3Var.b.getEncoded("DER");
                messageDigest.update(encoded);
                messageDigest.update(encoded2);
            } else {
                messageDigest.update(vc3Var.b.a[0].toASN1Primitive().getEncoded("DER"));
            }
            return messageDigest.digest();
        } catch (Exception e) {
            throw new CAdESException(e, IAdESException.ecATSHashIndexCreatingFailure);
        }
    }
}
