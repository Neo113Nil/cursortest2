package defpackage;

import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.SimpleTimeZone;
import org.w3c.dom.Element;
import ru.CryptoPro.AdES.certificate.CertificateFinder;
import ru.CryptoPro.AdES.certificate.CertificateItem;
import ru.CryptoPro.AdES.evidence.crl.CRLFinder;
import ru.CryptoPro.AdES.evidence.ocsp.OCSPFinder;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeDecoder;
import ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder;
import ru.CryptoPro.AdES.external.decode.ParentalDecoder;
import ru.CryptoPro.AdES.normalize.ReferenceValidator;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.AdES.tools.ProviderUtility;
import ru.CryptoPro.AdES.tools.revocation.xades.ResponderIDNoIssuer;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.XAdES.cl_29;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.util.SystemUtils;
import ru.CryptoPro.XAdES.util.XAdESUtility;
import ru.CryptoPro.XAdES.util.XMLUtils;

/* loaded from: classes4.dex */
public class sr61 implements AdESXLongType1AttributeParametersDecoder, ParentalDecoder, ProviderUtility {
    public final LinkedList a = new LinkedList();
    public final LinkedList b = new LinkedList();
    public final LinkedList c = new LinkedList();
    public v2k0 w = null;
    public String x = null;
    public final LinkedList y = new LinkedList();
    public final LinkedList z = new LinkedList();
    public AdESXLongType1AttributeDecoder A = null;

    public static void b(X509Certificate x509Certificate, boolean z, String str) {
        if (JCPLogger.isFineEnabled()) {
            JCPLogger.fineFormat("Normalization result for the certificate:\n\tserial number: {0}\n\tsubject: {1}\n\tissuer:  {2}\n\trevocation expected: {3}\n\trevocation type: {4}", x509Certificate.getSerialNumber().toString(16), x509Certificate.getSubjectDN(), x509Certificate.getIssuerDN(), Boolean.valueOf(z), str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(cr80 cr80Var, List list, List list2, HashSet hashSet, HashSet hashSet2) {
        String str;
        ReferenceValidator referenceValidator;
        LinkedList linkedList;
        LinkedList linkedList2;
        String str2;
        String str3;
        X509Certificate x509Certificate;
        boolean z;
        boolean z2;
        cr80 cr80Var2;
        boolean z3;
        boolean z4;
        LinkedList linkedList3;
        X509Certificate x509Certificate2;
        ubf ubfVar;
        ys61 ys61Var;
        nr61 nr61Var;
        Iterator it;
        boolean z5;
        X509Certificate x509Certificate3;
        LinkedList linkedList4;
        LinkedList linkedList5;
        nr60 nr60Var;
        ht61 ht61Var;
        hu61 hu61Var;
        bvj0 bvj0Var;
        Element f;
        cl_29 cl_29Var;
        Element f2;
        cr80 cr80Var3 = cr80Var;
        JCPLogger.subEnter();
        JCPLogger.fine("Normalizing single certificate reference...");
        LinkedList linkedList6 = this.c;
        X509Certificate find = new CertificateFinder(linkedList6).find(cr80Var3);
        boolean isSelfSigned = AdESUtility.isSelfSigned(find);
        LinkedList linkedList7 = this.b;
        LinkedList linkedList8 = this.a;
        if (isSelfSigned) {
            linkedList = linkedList7;
            linkedList2 = linkedList8;
            z4 = true;
            z3 = false;
            x509Certificate = find;
            cr80Var2 = cr80Var3;
        } else {
            ReferenceValidator referenceValidator2 = new ReferenceValidator(find);
            referenceValidator2.setProvider(this.x);
            referenceValidator2.setCertificateValues(new HashSet(linkedList6));
            String str4 = "Algorithm";
            String str5 = "CRL reference made for CRL evidence but id != uri. Continue.";
            String str6 = "DigestAlgAndValue";
            if (hashSet.isEmpty()) {
                str = "DigestAlgAndValue";
                referenceValidator = referenceValidator2;
                linkedList = linkedList7;
                linkedList2 = linkedList8;
                str2 = "Algorithm";
                str3 = "CRL reference made for CRL evidence but id != uri. Continue.";
                x509Certificate = find;
            } else {
                Iterator it2 = hashSet.iterator();
                loop0: while (true) {
                    if (!it2.hasNext()) {
                        x509Certificate3 = find;
                        str = str6;
                        referenceValidator = referenceValidator2;
                        linkedList4 = linkedList7;
                        linkedList5 = linkedList8;
                        str2 = str4;
                        str3 = str5;
                        nr60Var = null;
                        ht61Var = null;
                        hu61Var = null;
                        break;
                    }
                    str3 = str5;
                    ht61Var = (ht61) ((at61) it2.next());
                    x509Certificate3 = find;
                    if (referenceValidator2.isOCSPAccepted(ht61Var.h())) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            Iterator it4 = it3;
                            hu61 hu61Var2 = (hu61) it3.next();
                            JCPLogger.fine("Producing OCSP response id...");
                            referenceValidator = referenceValidator2;
                            if (hu61Var2.y != null || (f2 = hu61Var2.f(str6)) == null) {
                                str = str6;
                                linkedList4 = linkedList7;
                                linkedList5 = linkedList8;
                            } else {
                                str = str6;
                                linkedList4 = linkedList7;
                                linkedList5 = linkedList8;
                                hu61Var2.y = new rs61(f2, hu61Var2.b, hu61Var2.c, hu61Var2.w);
                            }
                            rs61 rs61Var = hu61Var2.y;
                            if (rs61Var == null) {
                                throw new XAdESException("DigestAlgAndValue not found.", IAdESException.ecNodeNotFound);
                            }
                            byte[] h = rs61Var.h();
                            Element b = rs61Var.b("DigestMethod", "http://www.w3.org/2000/09/xmldsig#");
                            String findDigestNameByDigestUri = XAdESUtility.findDigestNameByDigestUri(b == null ? null : b.getAttribute(str4));
                            String findDigestOidByDigestName = XAdESUtility.findDigestOidByDigestName(findDigestNameByDigestUri);
                            if (findDigestOidByDigestName == null) {
                                throw new XAdESException(oyr.p("Digest algorithm for DigestMethod ", findDigestNameByDigestUri, " not found."), IAdESException.ecNodeInvalidContent);
                            }
                            fr80 fr80Var = new fr80(new xr1(new u2(findDigestOidByDigestName)), new dqf(h));
                            du61 h2 = hu61Var2.h();
                            if (h2 == null) {
                                throw new XAdESException("OCSPIdentifier not found.", IAdESException.ecNodeNotFound);
                            }
                            cl_29 cl_29Var2 = h2.B;
                            cl_29 cl_29Var3 = cl_29.a;
                            if (cl_29Var2 != cl_29Var3 || (f = h2.f("ResponderID")) == null) {
                                hu61Var = hu61Var2;
                            } else {
                                hu61Var = hu61Var2;
                                if (XMLUtils.getChildElementByTagNameNS(f, "ByName", h2.c) != null) {
                                    cl_29Var = cl_29.c;
                                } else if (XMLUtils.getChildElementByTagNameNS(f, "ByKey", h2.c) != null) {
                                    cl_29Var = cl_29.b;
                                }
                                h2.B = cl_29Var;
                            }
                            cl_29 cl_29Var4 = h2.B;
                            if (cl_29Var4 == cl_29Var3) {
                                throw new XAdESException("OCSPIdentifier has unknown content.", IAdESException.ecNodeInvalidContent);
                            }
                            int i = it61.a[cl_29Var4.ordinal()];
                            if (i == 1) {
                                byte[] h3 = h2.h();
                                if (h3 == null) {
                                    throw new XAdESException("ResponderID has invalid content.", IAdESException.ecNodeInvalidContent);
                                }
                                bvj0Var = new bvj0(new dqf(h3));
                            } else {
                                if (i != 2) {
                                    throw new XAdESException("OCSPIdentifier has invalid content.", IAdESException.ecNodeInvalidContent);
                                }
                                bvj0Var = new ResponderIDNoIssuer();
                            }
                            if (h2.A == null) {
                                Element b2 = h2.b("ProducedAt", h2.c);
                                String textContent = b2 != null ? b2.getTextContent() : null;
                                if (textContent != null) {
                                    h2.A = SystemUtils.parseDate(textContent);
                                }
                            }
                            Date date = h2.A;
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'");
                            str2 = str4;
                            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
                            lr60 lr60Var = new lr60(bvj0Var, new g2(simpleDateFormat.format(date)));
                            JCPLogger.fine("OCSP response id completed.");
                            nr60Var = new nr60(lr60Var, new er80(fr80Var));
                            if (OCSPFinder.match(ht61Var.h(), nr60Var, this.x)) {
                                if (ht61Var.y == null) {
                                    ht61Var.y = ht61Var.d("Id");
                                }
                                String str7 = ht61Var.y;
                                du61 h4 = hu61Var.h();
                                if (h4.x == null) {
                                    String d = h4.d(GlobalRouterActivity.URI);
                                    h4.x = d;
                                    if (d != null && d.length() > 0 && h4.x.charAt(0) == '#') {
                                        h4.x = h4.x.substring(1);
                                    }
                                }
                                String str8 = h4.x;
                                if ((str7 == null || str8 == null) ? str8 == null : str7.equals(str8)) {
                                    JCPLogger.fine("OCSP evidence match found. Return.");
                                    break loop0;
                                }
                                JCPLogger.fine(str3);
                            }
                            it3 = it4;
                            referenceValidator2 = referenceValidator;
                            str6 = str;
                            linkedList7 = linkedList4;
                            linkedList8 = linkedList5;
                            str4 = str2;
                        }
                    }
                    find = x509Certificate3;
                    str5 = str3;
                    referenceValidator2 = referenceValidator2;
                    str6 = str6;
                    linkedList7 = linkedList7;
                    linkedList8 = linkedList8;
                    str4 = str4;
                }
                if (ht61Var == null || nr60Var == null || hu61Var == null) {
                    cr80Var3 = cr80Var;
                    x509Certificate = x509Certificate3;
                    linkedList = linkedList4;
                    linkedList2 = linkedList5;
                } else {
                    cr80Var3 = cr80Var;
                    linkedList2 = linkedList5;
                    linkedList2.add(cr80Var3);
                    linkedList = linkedList4;
                    linkedList.add(new tbf(null, new mr60(new nr60[]{nr60Var})));
                    this.y.add(ht61Var.h());
                    x509Certificate = x509Certificate3;
                    b(x509Certificate, true, "OCSP");
                    z = true;
                    if (!z) {
                        return;
                    }
                    if (hashSet2.isEmpty()) {
                        z2 = z;
                        cr80Var2 = cr80Var3;
                    } else {
                        Iterator it5 = hashSet2.iterator();
                        loop2: while (true) {
                            if (!it5.hasNext()) {
                                z2 = z;
                                linkedList3 = linkedList;
                                x509Certificate2 = x509Certificate;
                                ubfVar = null;
                                ys61Var = null;
                                nr61Var = null;
                                break;
                            }
                            ys61 ys61Var2 = (ys61) ((us61) it5.next());
                            z2 = z;
                            ReferenceValidator referenceValidator3 = referenceValidator;
                            if (referenceValidator3.isCRLAccepted(ys61Var2.h())) {
                                Iterator it6 = list2.iterator();
                                while (it6.hasNext()) {
                                    ReferenceValidator referenceValidator4 = referenceValidator3;
                                    nr61 nr61Var2 = (nr61) it6.next();
                                    JCPLogger.fine("Producing crl validated id...");
                                    Iterator it7 = it5;
                                    if (nr61Var2.x == null) {
                                        it = it6;
                                        String str9 = str;
                                        Element f3 = nr61Var2.f(str9);
                                        if (f3 != null) {
                                            str = str9;
                                            x509Certificate2 = x509Certificate;
                                            linkedList3 = linkedList;
                                            nr61Var2.x = new rs61(f3, nr61Var2.b, nr61Var2.c, nr61Var2.w);
                                        } else {
                                            linkedList3 = linkedList;
                                            x509Certificate2 = x509Certificate;
                                            str = str9;
                                        }
                                    } else {
                                        linkedList3 = linkedList;
                                        x509Certificate2 = x509Certificate;
                                        it = it6;
                                    }
                                    rs61 rs61Var2 = nr61Var2.x;
                                    if (rs61Var2 == null) {
                                        throw new XAdESException("DigestAlgAndValue not found.", IAdESException.ecNodeNotFound);
                                    }
                                    byte[] h5 = rs61Var2.h();
                                    Element b3 = rs61Var2.b("DigestMethod", "http://www.w3.org/2000/09/xmldsig#");
                                    String str10 = str2;
                                    String findDigestNameByDigestUri2 = XAdESUtility.findDigestNameByDigestUri(b3 == null ? null : b3.getAttribute(str10));
                                    String findDigestOidByDigestName2 = XAdESUtility.findDigestOidByDigestName(findDigestNameByDigestUri2);
                                    if (findDigestOidByDigestName2 == null) {
                                        throw new XAdESException(oyr.p("Digest algorithm for DigestMethod ", findDigestNameByDigestUri2, " not found."), IAdESException.ecNodeInvalidContent);
                                    }
                                    nr61Var = nr61Var2;
                                    er80 er80Var = new er80(new fr80(new xr1(new u2(findDigestOidByDigestName2)), new dqf(h5)));
                                    nr61Var.h();
                                    JCPLogger.fine("Crl validated id completed.");
                                    ubfVar = new ubf(er80Var, null);
                                    if (CRLFinder.match(ys61Var2.h(), ubfVar, this.x)) {
                                        if (ys61Var2.y == null) {
                                            ys61Var2.y = ys61Var2.d("Id");
                                        }
                                        String str11 = ys61Var2.y;
                                        if (nr61Var.h() != null) {
                                            yt61 h6 = nr61Var.h();
                                            if (((String) h6.y) == null) {
                                                String d2 = h6.d(GlobalRouterActivity.URI);
                                                h6.y = d2;
                                                if (d2 != null && d2.length() > 0 && ((String) h6.y).charAt(0) == '#') {
                                                    h6.y = ((String) h6.y).substring(1);
                                                }
                                            }
                                            String str12 = (String) h6.y;
                                            if (str11 != null && str12 != null) {
                                                z5 = str11.equals(str12);
                                            } else if (str12 != null) {
                                                z5 = false;
                                            }
                                            if (!z5) {
                                                JCPLogger.fine("CRL evidence match found. Return.");
                                                ys61Var = ys61Var2;
                                                break loop2;
                                            }
                                            JCPLogger.fine(str3);
                                        }
                                        z5 = true;
                                        if (!z5) {
                                        }
                                    }
                                    it5 = it7;
                                    it6 = it;
                                    str2 = str10;
                                    x509Certificate = x509Certificate2;
                                    referenceValidator3 = referenceValidator4;
                                    linkedList = linkedList3;
                                }
                            }
                            referenceValidator = referenceValidator3;
                            z = z2;
                            it5 = it5;
                            str2 = str2;
                            x509Certificate = x509Certificate;
                            linkedList = linkedList;
                        }
                        if (ys61Var == null || ubfVar == null || nr61Var == null) {
                            cr80Var2 = cr80Var;
                            x509Certificate = x509Certificate2;
                            linkedList = linkedList3;
                        } else {
                            cr80Var2 = cr80Var;
                            linkedList2.add(cr80Var2);
                            linkedList = linkedList3;
                            linkedList.add(new tbf(new sbf(new ubf[]{ubfVar}), null));
                            this.z.add(ys61Var.h());
                            x509Certificate = x509Certificate2;
                            b(x509Certificate, true, "CRL");
                            z3 = true;
                            z4 = false;
                        }
                    }
                    z3 = z2;
                    z4 = false;
                }
            }
            z = false;
            if (!z) {
            }
        }
        if (!z3) {
            if (!z4) {
                CertificateItem.CertificateRole certificateRole = CertificateItem.CertificateRole.Unknown;
                if (!AdESUtility.skipCertificateValidity(x509Certificate, certificateRole) && !AdESUtility.skipTSPCertificateValidity(x509Certificate, certificateRole)) {
                    StringBuilder sb = new StringBuilder("Normalization failed for certificate with sn: ");
                    vfc.B(x509Certificate, 16, sb, ", subject: ", ", issuer: ");
                    sb.append(". It requires an evidence.");
                    throw new XAdESException(sb.toString(), IAdESException.ecNormalizingFailed);
                }
            }
            JCPLogger.fineFormat("Skip normalization of certificate\n\tserial number: {0}\n\tsubject: {1}\n\tissuer:  {2}\n\treason: pkix-ocsp-nocheck, or self-signed, or {3} disabled. It does not need an evidence.", x509Certificate.getSerialNumber().toString(16), x509Certificate.getSubjectDN(), x509Certificate.getIssuerDN(), AdESUtility.PROPERTY_REQUIRE_TSP_EVIDENCE);
            linkedList2.add(cr80Var2);
            linkedList.add(new tbf(null, null));
            b(x509Certificate, false, "none");
        }
        JCPLogger.fine("Normalizing of single certificate reference completed.");
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public final List getCertificateValues() {
        return Collections.unmodifiableList(this.c);
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public final List getCompleteCertificateReferences() {
        return Collections.unmodifiableList(this.a);
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public final List getCompleteRevocationReferences() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public final v2k0 getRevocationValues() {
        return this.w;
    }

    @Override // ru.CryptoPro.AdES.external.decode.ParentalDecoder
    public final void setParentalDecoder(AdESXLongType1AttributeDecoder adESXLongType1AttributeDecoder) {
        this.A = adESXLongType1AttributeDecoder;
    }

    @Override // ru.CryptoPro.AdES.tools.ProviderUtility
    public final void setProvider(String str) {
        this.x = str;
    }
}
