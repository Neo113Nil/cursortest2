package defpackage;

import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ru.CryptoPro.AdES.certificate.CompleteCertificateReferenceFinder;
import ru.CryptoPro.AdES.evidence.crl.CRLFinder;
import ru.CryptoPro.AdES.evidence.ocsp.OCSPFinder;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeDecoder;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.CAdES.tools.CAdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class sx61 extends rw61 implements AdESXLongType1AttributeDecoder {
    public final LinkedList B;
    public final LinkedList C;
    public final LinkedList D;
    public v2k0 E;
    public final ArrayList F;
    public AdESXLongType1AttributeDecoder G;

    public sx61(acs0 acs0Var) {
        super(acs0Var);
        this.B = new LinkedList();
        this.C = new LinkedList();
        this.D = new LinkedList();
        this.E = null;
        this.F = new ArrayList();
        this.G = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02fd, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x025c, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0222  */
    @Override // defpackage.rw61, defpackage.erd0, ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESBESAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESTAttributeDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void decode() {
        int i;
        v2k0 revocationValues;
        v2k0 v2k0Var;
        bzc bzcVar;
        JCPLogger.subEnter();
        JCPLogger.fine("Decoding CAdES-X Long Type 1 structures...");
        super.decode();
        LinkedList linkedList = this.B;
        linkedList.clear();
        linkedList.add((cr80) this.c);
        JCPLogger.subEnter();
        JCPLogger.fine("Extracting complete-certificate-references...");
        acs0 acs0Var = (acs0) this.b;
        i3 i3Var = (i3) CAdESUtility.getSingleAttributeValue(acs0Var.getUnsignedAttributes(), b490.K3);
        if (i3Var != null) {
            for (int i2 = 0; i2 < i3Var.size(); i2++) {
                linkedList.add(cr80.o(i3Var.A(i2)));
            }
        } else if (this.G != null) {
            JCPLogger.fine("Extract (replaced) complete-certificate-references from parental signature.");
            for (cr80 cr80Var : this.G.getCompleteCertificateReferences()) {
                if (!linkedList.contains(cr80Var)) {
                    linkedList.add(cr80Var);
                }
            }
        }
        JCPLogger.subExit();
        LinkedList linkedList2 = this.C;
        linkedList2.clear();
        JCPLogger.subEnter();
        JCPLogger.fine("Extracting complete-revocation-references...");
        a2 singleAttributeValue = CAdESUtility.getSingleAttributeValue(acs0Var.getUnsignedAttributes(), b490.L3);
        if (singleAttributeValue != null) {
            if (singleAttributeValue instanceof bzc) {
                bzcVar = (bzc) singleAttributeValue;
            } else {
                i3 z = i3.z(singleAttributeValue);
                bzc bzcVar2 = new bzc();
                Enumeration B = z.B();
                while (B.hasMoreElements()) {
                    tbf.getInstance(B.nextElement());
                }
                bzcVar2.a = z;
                bzcVar = bzcVar2;
            }
            i3 i3Var2 = bzcVar.a;
            int size = i3Var2.size();
            tbf[] tbfVarArr = new tbf[size];
            for (int i3 = 0; i3 < size; i3++) {
                tbfVarArr[i3] = tbf.getInstance(i3Var2.A(i3));
            }
            for (int i4 = 0; i4 < size; i4++) {
                linkedList2.add(tbfVarArr[i4]);
            }
        } else if (this.G != null) {
            JCPLogger.fine("Extract (replaced) complete-revocation-references from parental signature.");
            for (tbf tbfVar : this.G.getCompleteRevocationReferences()) {
                if (!linkedList2.contains(tbfVar)) {
                    linkedList2.add(tbfVar);
                }
            }
        }
        JCPLogger.subExit();
        LinkedList linkedList3 = this.D;
        linkedList3.clear();
        JCPLogger.subEnter();
        JCPLogger.fine("Extracting certificate-values...");
        i3 i3Var3 = (i3) CAdESUtility.getSingleAttributeValue(acs0Var.getUnsignedAttributes(), b490.M3);
        if (i3Var3 != null) {
            for (int i5 = 0; i5 < i3Var3.size(); i5++) {
                try {
                    X509Certificate x509Certificate = (X509Certificate) AdESUtility.CERT_FACTORY.generateCertificate(new ByteArrayInputStream(((i3) i3Var3.A(i5)).getEncoded()));
                    if (!linkedList3.contains(x509Certificate)) {
                        CompleteCertificateReferenceFinder completeCertificateReferenceFinder = new CompleteCertificateReferenceFinder(linkedList);
                        try {
                            completeCertificateReferenceFinder.setProvider((String) this.a);
                        } catch (AdESException e) {
                            JCPLogger.ignoredException(e);
                        }
                        if (completeCertificateReferenceFinder.find(x509Certificate, true) == null) {
                            StringBuilder sb = new StringBuilder("Certificate: sn ");
                            vfc.B(x509Certificate, 16, sb, ", subject ", ", issuer ");
                            sb.append(" not found in complete-certificate-references attribute");
                            throw new CAdESException(sb.toString(), IAdESException.ecParserWrongCertRef);
                        }
                        linkedList3.add(x509Certificate);
                    }
                } catch (Exception e2) {
                    throw new CAdESException(e2, IAdESException.ecInternal);
                }
            }
            i = 0;
        } else {
            i = 0;
            if (this.G != null) {
                JCPLogger.fine("Extract (replaced) certificate-values from parental signature.");
                for (X509Certificate x509Certificate2 : this.G.getCertificateValues()) {
                    if (!linkedList3.contains(x509Certificate2)) {
                        CompleteCertificateReferenceFinder completeCertificateReferenceFinder2 = new CompleteCertificateReferenceFinder(linkedList);
                        try {
                            completeCertificateReferenceFinder2.setProvider((String) this.a);
                        } catch (AdESException e3) {
                            JCPLogger.ignoredException(e3);
                        }
                        if (completeCertificateReferenceFinder2.find(x509Certificate2, true) == null) {
                            StringBuilder sb2 = new StringBuilder("Certificate: sn ");
                            vfc.B(x509Certificate2, 16, sb2, ", subject ", ", issuer ");
                            sb2.append(" not found in complete-certificate-references attribute");
                            throw new CAdESException(sb2.toString(), IAdESException.ecParserWrongCertRef);
                        }
                        linkedList3.add(x509Certificate2);
                    }
                }
            }
        }
        JCPLogger.subExit();
        this.E = null;
        JCPLogger.subEnter();
        JCPLogger.fine("Extracting revocation-values...");
        a2 singleAttributeValue2 = CAdESUtility.getSingleAttributeValue(acs0Var.getUnsignedAttributes(), b490.O3);
        if (singleAttributeValue2 == null) {
            if (this.G != null) {
                JCPLogger.fine("Extract (replaced) revocation-values from parental signature.");
                revocationValues = this.G.getRevocationValues();
            }
            v2k0Var = this.E;
            if (v2k0Var != null) {
                he5[] ocspVals = v2k0Var.getOcspVals();
                if (ocspVals != null) {
                    int length = ocspVals.length;
                    int i6 = i;
                    while (i6 < length) {
                        he5 he5Var = ocspVals[i6];
                        Iterator it = linkedList2.iterator();
                        while (it.hasNext()) {
                            mr60 ocspids = ((tbf) it.next()).getOcspids();
                            if (ocspids != null) {
                                nr60[] m = ocspids.m();
                                int length2 = m.length;
                                for (int i7 = i; i7 < length2; i7++) {
                                    if (OCSPFinder.match(he5Var, m[i7], (String) this.a)) {
                                        break;
                                    }
                                }
                            }
                        }
                        bwj0 bwj0Var = he5Var.a;
                        gzo.n(bwj0Var.y);
                        i3 i3Var4 = bwj0Var.x;
                        int size2 = i3Var4.size();
                        qgn0[] qgn0VarArr = new qgn0[size2];
                        for (int i8 = i; i8 != size2; i8++) {
                            ths0 m2 = ths0.m(i3Var4.A(i8));
                            qgn0 qgn0Var = new qgn0();
                            qgn0Var.b = m2;
                            m2.getClass();
                            qgn0VarArr[i8] = qgn0Var;
                        }
                        qgn0 qgn0Var2 = qgn0VarArr[i];
                        StringBuilder sb3 = new StringBuilder("OCSP response for responder: sn ");
                        qgn0Var2.getClass();
                        d79 d79Var = ((ths0) qgn0Var2.b).a;
                        new l79(d79Var);
                        sb3.append(d79Var.w.x().toString(16));
                        sb3.append(" not found in complete-revocation-references attribute");
                        throw new CAdESException(sb3.toString(), IAdESException.ecParserWrongOcspRef);
                    }
                }
                m79[] crlVals = this.E.getCrlVals();
                if (crlVals != null) {
                    int length3 = crlVals.length;
                    int i9 = i;
                    while (i9 < length3) {
                        m79 m79Var = crlVals[i9];
                        Iterator it2 = linkedList2.iterator();
                        while (it2.hasNext()) {
                            sbf crlids = ((tbf) it2.next()).getCrlids();
                            if (crlids != null) {
                                ubf[] m3 = crlids.m();
                                int length4 = m3.length;
                                for (int i10 = i; i10 < length4; i10++) {
                                    if (CRLFinder.match(m79Var, m3[i10], (String) this.a)) {
                                        break;
                                    }
                                }
                            }
                        }
                        try {
                            X509CRL x509crl = (X509CRL) AdESUtility.CERT_FACTORY.generateCRL(new ByteArrayInputStream(m79Var.getEncoded("DER")));
                            BigInteger cRLSerialNumber = AdESUtility.getCRLSerialNumber(x509crl);
                            throw new CAdESException(oyr.t(new StringBuilder("CRL "), cRLSerialNumber != null ? ": sn " + cRLSerialNumber.toString(16) : " issued by " + x509crl.getIssuerDN(), " not found in complete-revocation-references attribute"), IAdESException.ecParserWrongCrlRef);
                        } catch (Exception e4) {
                            throw new CAdESException(e4, IAdESException.ecInternal);
                        }
                    }
                }
            }
            JCPLogger.subExit();
            ArrayList arrayList = this.F;
            arrayList.clear();
            h(b490.P3, arrayList);
            Collections.sort(arrayList, rw61.z);
            JCPLogger.subExit();
        }
        revocationValues = v2k0.getInstance(singleAttributeValue2);
        this.E = revocationValues;
        v2k0Var = this.E;
        if (v2k0Var != null) {
        }
        JCPLogger.subExit();
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        h(b490.P3, arrayList2);
        Collections.sort(arrayList2, rw61.z);
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public final List getCertificateValues() {
        return Collections.unmodifiableList(this.D);
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public final List getCompleteCertificateReferences() {
        return Collections.unmodifiableList(this.B);
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public final List getCompleteRevocationReferences() {
        return Collections.unmodifiableList(this.C);
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public final v2k0 getRevocationValues() {
        return this.E;
    }

    public final boolean i() {
        acs0 acs0Var = (acs0) this.b;
        if (acs0Var.getUnsignedAttributes() == null) {
            return false;
        }
        return (((i3) CAdESUtility.getSingleAttributeValue(acs0Var.getUnsignedAttributes(), b490.K3)) == null || CAdESUtility.getSingleAttributeValue(acs0Var.getUnsignedAttributes(), b490.L3) == null || ((i3) CAdESUtility.getSingleAttributeValue(acs0Var.getUnsignedAttributes(), b490.M3)) == null || CAdESUtility.getSingleAttributeValue(acs0Var.getUnsignedAttributes(), b490.O3) == null) ? false : true;
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeDecoder, ru.CryptoPro.AdES.external.decode.ParentalDecoder
    public final void setParentalDecoder(AdESXLongType1AttributeDecoder adESXLongType1AttributeDecoder) {
        this.G = adESXLongType1AttributeDecoder;
    }
}
