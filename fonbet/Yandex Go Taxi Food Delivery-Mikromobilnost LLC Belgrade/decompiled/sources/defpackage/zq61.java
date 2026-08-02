package defpackage;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.util.Iterator;
import java.util.Vector;
import org.bouncycastle.cert.X509CertificateHolder;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.signature.ATSHashIndex;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.CAdES.tools.CAdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public final class zq61 implements ATSHashIndex {
    public final boolean A;
    public String a = null;
    public String b = null;
    public ncc c = null;
    public ncc w = null;
    public final Vector x = new Vector();
    public i3 y = null;
    public final Vector z = new Vector();

    public zq61(boolean z) {
        this.A = z;
    }

    public final boolean a(ATSHashIndex aTSHashIndex) {
        Vector vector = new Vector(((zq61) aTSHashIndex).z);
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            a2 a2Var = (a2) it.next();
            if (!vector.remove(a2Var)) {
                JCPLogger.fine("This hash does not present in AtsHashIndex: " + a2Var.toString());
            }
        }
        return vector.isEmpty();
    }

    public final byte[] b(boolean z) {
        a2 xr1Var;
        a2 a2Var;
        Vector vector = this.z;
        try {
            JCPLogger.fine("Calculating digest using certificates, CRLs and attributes...");
            String correctProviderByHashAlgorithm = AdESUtility.correctProviderByHashAlgorithm(this.a, this.b);
            String str = this.b;
            MessageDigest messageDigest = correctProviderByHashAlgorithm == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, correctProviderByHashAlgorithm);
            c2 c2Var = new c2();
            if (z) {
                JCPLogger.fine("Using old variant of ats-hash-index and adding algorithm identifier as ASN1ObjectIdentifier...");
                xr1Var = new u2(this.b);
            } else {
                xr1Var = new xr1(new u2(this.b));
            }
            c2Var.a(xr1Var);
            c2 c2Var2 = new c2();
            vector.clear();
            ncc nccVar = this.c;
            if (nccVar != null) {
                Iterator it = nccVar.a(null).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    u2 u2Var = jw61.a;
                    if (next instanceof Certificate) {
                        a2Var = (a2) next;
                    } else {
                        if (!(next instanceof X509CertificateHolder)) {
                            throw new CAdESException("Unknown Certificate.", IAdESException.ecInternal);
                        }
                        a2Var = ((X509CertificateHolder) next).a;
                    }
                    byte[] digest = messageDigest.digest(((h79) a2Var).getEncoded());
                    c2Var2.a(new dqf(digest));
                    vector.add(new dqf(digest));
                    messageDigest.reset();
                }
            }
            c2Var.a(new jqf(c2Var2));
            c2 c2Var3 = new c2();
            ncc nccVar2 = this.w;
            if (nccVar2 != null) {
                Iterator it2 = nccVar2.a(null).iterator();
                while (it2.hasNext()) {
                    byte[] digest2 = messageDigest.digest(jw61.a(it2.next()).toASN1Primitive().getEncoded("DER"));
                    c2Var3.a(new dqf(digest2));
                    vector.add(new dqf(digest2));
                    messageDigest.reset();
                }
            }
            c2Var.a(new jqf(c2Var3));
            c2 c2Var4 = new c2();
            Iterator it3 = this.x.iterator();
            while (it3.hasNext()) {
                vc3 vc3Var = (vc3) it3.next();
                if (this.A) {
                    byte[] encoded = vc3Var.a.getEncoded("DER");
                    for (a2 a2Var2 : c2.b(vc3Var.b.a)) {
                        messageDigest.update(CAdESUtility.concatenate(encoded, a2Var2.toASN1Primitive().getEncoded("DER")));
                        dqf dqfVar = new dqf(messageDigest.digest());
                        vector.add(dqfVar);
                        c2Var4.a(dqfVar);
                        messageDigest.reset();
                    }
                } else {
                    if (z) {
                        byte[] encoded2 = vc3Var.a.getEncoded("DER");
                        byte[] encoded3 = vc3Var.b.getEncoded("DER");
                        messageDigest.update(encoded2);
                        messageDigest.update(encoded3);
                    } else {
                        messageDigest.update(vc3Var.getEncoded("DER"));
                    }
                    dqf dqfVar2 = new dqf(messageDigest.digest());
                    vector.add(dqfVar2);
                    c2Var4.a(dqfVar2);
                    messageDigest.reset();
                }
            }
            c2Var.a(new jqf(c2Var4));
            jqf jqfVar = new jqf(c2Var);
            this.y = jqfVar;
            return jqfVar.getEncoded("DER");
        } catch (Exception e) {
            throw new CAdESException(e, IAdESException.ecATSHashIndexCreatingFailure);
        }
    }

    @Override // ru.CryptoPro.AdES.external.signature.ATSHashIndex
    public final byte[] getDigest() {
        try {
            i3 i3Var = this.y;
            return i3Var != null ? i3Var.getEncoded("DER") : b(false);
        } catch (IOException e) {
            throw new CAdESException(e, IAdESException.ecInvalidATSHashIndex);
        }
    }

    @Override // ru.CryptoPro.AdES.external.signature.ATSHashIndex
    public final String getDigestAlgorithm() {
        return this.b;
    }

    @Override // ru.CryptoPro.AdES.external.signature.ATSHashIndex
    public final void setArchiveSignatureCertificateToBeHashedStore(ncc nccVar) {
        if (this.c != null || nccVar == null) {
            return;
        }
        this.c = nccVar;
    }

    @Override // ru.CryptoPro.AdES.external.signature.ATSHashIndex
    public final void setArchiveSignatureValidationDataToBeHashedStore(ncc nccVar) {
        if (this.w != null || nccVar == null) {
            return;
        }
        this.w = nccVar;
    }

    @Override // ru.CryptoPro.AdES.external.signature.ATSHashIndex
    public final void setAttributes(Vector vector) {
        if (vector != null) {
            this.x.addAll(vector);
        }
    }

    @Override // ru.CryptoPro.AdES.external.signature.ATSHashIndex, ru.CryptoPro.AdES.tools.DigestUtility
    public final void setDigestAlgorithm(String str) {
        this.b = str;
    }

    @Override // ru.CryptoPro.AdES.external.signature.ATSHashIndex, ru.CryptoPro.AdES.tools.ProviderUtility
    public final void setProvider(String str) {
        this.a = str;
    }

    @Override // ru.CryptoPro.AdES.external.signature.ATSHashIndex
    public final void validateImprint(ATSHashIndex aTSHashIndex) {
        JCPLogger.subEnter();
        getDigest();
        if (!a(aTSHashIndex)) {
            if (this.A) {
                throw new CAdESException(IAdESException.ecArchiveTimestampV3WrongImprint);
            }
            JCPLogger.fine("Using old variant of ats-hash-index as ASN1ObjectIdentifier...");
            b(true);
            if (!a(aTSHashIndex)) {
                throw new CAdESException(IAdESException.ecTimestampWrongImprint);
            }
        }
        JCPLogger.subExit();
    }
}
