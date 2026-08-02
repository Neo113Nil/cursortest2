package ru.CryptoPro.XAdES;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import defpackage.b64;
import defpackage.dw61;
import defpackage.fw61;
import defpackage.g8e;
import defpackage.iw61;
import defpackage.ls61;
import defpackage.lv61;
import defpackage.mv61;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.ps61;
import defpackage.qu61;
import defpackage.st61;
import defpackage.sv61;
import defpackage.vw61;
import defpackage.yu61;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLObject;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.certificate.BaseCertificateChainValidatorImpl;
import ru.CryptoPro.AdES.certificate.CertificateChainBuilderImpl;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.signature.AdESSigner;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.CAdES.tools.CAdESUtility;
import ru.CryptoPro.JCP.tools.AlgorithmUtility;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.SelfTester_Auxiliary;
import ru.CryptoPro.JCPxml.dsig.internal.dom.XMLDSigRI;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.interfaces.external.IXAdESSignature;
import ru.CryptoPro.XAdES.transform.ITransform;
import ru.CryptoPro.XAdES.util.SystemUtils;
import ru.CryptoPro.XAdES.util.XAdESUtility;
import ru.CryptoPro.XAdES.util.XMLUtils;

/* loaded from: classes4.dex */
public class XAdESSignature implements XAdESParameters, IXAdESSignature {
    public static final String ELEMENT_SIGNATURE = "Signature";
    public Document a;
    public final Integer b;
    public final ArrayList c;
    public final ArrayList w;
    public OutputStream x;
    public Options y;

    static {
        JCPLogger.fine("%%% Initializing of the CAdES context... %%%");
        CAdESUtility.initJCPAlgorithms();
        JCPLogger.fine("%%% Initializing of the CAdES context completed. %%%");
        JCPLogger.fine("%%% Initializing of the XAdES context... %%%");
        XAdESUtility.initXMLAlgorithms();
        JCPLogger.fine("%%% Initializing of the XAdES context completed. %%%");
    }

    public XAdESSignature(Element element, Integer num) throws XAdESException {
        NodeList nodeList = null;
        this.a = null;
        this.b = XAdESParameters.XAdES_Unknown;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.w = new ArrayList();
        this.x = null;
        this.y = null;
        JCPLogger.subEnter();
        SelfTester_Auxiliary.checkClass(XAdESSignature.class);
        this.a = element.getOwnerDocument();
        this.b = num;
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Decoding signature... %%%");
        arrayList.clear();
        if (XMLUtils.checkIfElementIsSignatureElementById(element, null)) {
            XAdESSignerBinaryImpl e = XAdESSignerFactory.e(element, num);
            try {
                e.h();
                arrayList.add(e);
            } catch (AdESException e2) {
                throw new XAdESException(e2, e2.getErrorCode());
            }
        } else {
            nodeList = element.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", ELEMENT_SIGNATURE);
        }
        if (nodeList != null) {
            int length = nodeList.getLength();
            for (int i = 0; i < length; i++) {
                XAdESSignerBinaryImpl e3 = XAdESSignerFactory.e((Element) nodeList.item(i), num);
                try {
                    e3.h();
                    arrayList.add(e3);
                } catch (AdESException e4) {
                    throw new XAdESException(e4, e4.getErrorCode());
                }
            }
        }
        JCPLogger.fine("%%% Signature decoded %%%");
        JCPLogger.subExit();
        JCPLogger.subExit();
    }

    public static qu61 a(XAdESSignerBESImpl xAdESSignerBESImpl, String str, String str2, DataObjects dataObjects) {
        LinkedList c;
        XAdESSignerBESImpl xAdESSignerBESImpl2 = xAdESSignerBESImpl;
        LinkedList linkedList = dataObjects.a;
        JCPLogger.fine("Marshalling qualifying properties...");
        Document document = xAdESSignerBESImpl2.b;
        qu61 qu61Var = new qu61(document.createElementNS(XAdESParameters.XADES_SIGNATURE_NAMESPACE, cl_63.f), str2);
        qu61Var.A = document;
        Element e = qu61Var.e();
        e.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:xades", XAdESParameters.XADES_SIGNATURE_NAMESPACE);
        e.setPrefix(XAdESParameters.XADES_SIGNATURE_PREFIX);
        qu61Var.a(null, "Target", ShimmerDivHandler.NUMBER_SING + str2);
        qu61Var.a(null, "Id", oyr.t(new StringBuilder(), str2, "-QualifyingProperties"));
        JCPLogger.fine("Encoding signed attributes of qualifying properties...");
        JCPLogger.subEnter();
        cl_64[] values = cl_64.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            cl_64 cl_64Var = values[i];
            if (cl_64.e.equals(cl_64Var)) {
                sv61 l = XAdESSignerBESImpl.l(qu61Var);
                l.getClass();
                Date date = new Date();
                new iw61(l.x, l, cl_63.i, l.b, l.c, l.w).e().setTextContent(SystemUtils.formatDate(date));
            } else {
                Object obj = xAdESSignerBESImpl2.z.get(cl_64Var);
                if (obj == null) {
                    continue;
                } else {
                    if (cl_64.n.equals(cl_64Var)) {
                        for (ls61 ls61Var : (Collection) obj) {
                            mv61 h = qu61Var.h();
                            if (h.y == null) {
                                Document document2 = h.z;
                                lv61 lv61Var = new lv61(document2, h, cl_63.r, h.b, h.c, h.w);
                                lv61Var.y = new ArrayList();
                                lv61Var.x = document2;
                                h.y = lv61Var;
                            }
                            lv61 lv61Var2 = h.y;
                            lv61Var2.getClass();
                            ps61 ps61Var = new ps61(lv61Var2.x, lv61Var2, cl_63.s, lv61Var2.b, lv61Var2.c, lv61Var2.w);
                            ((ArrayList) lv61Var2.y).add(ps61Var);
                            ls61Var.getClass();
                            String str3 = ls61Var.a;
                            if (str3 == null) {
                                ny61.r("objectReference не был определен перед вызовом getObjectReference().");
                                return null;
                            }
                            ps61Var.a(null, "ObjectReference", str3);
                        }
                    }
                    if (cl_64.f.equals(cl_64Var)) {
                        XAdESSignerBESImpl.l(qu61Var);
                        ny61.u();
                        return null;
                    }
                    if (cl_64.g.equals(cl_64Var)) {
                        sv61 l2 = XAdESSignerBESImpl.l(qu61Var);
                        l2.getClass();
                        new fw61(l2.x, l2, (dw61) obj, l2.b, l2.c, l2.w);
                    } else if (cl_64.h.equals(cl_64Var)) {
                        XAdESSignerBESImpl.l(qu61Var);
                        ny61.u();
                        return null;
                    }
                }
            }
            i++;
            xAdESSignerBESImpl2 = xAdESSignerBESImpl;
        }
        JCPLogger.subExit();
        mv61 h2 = qu61Var.h();
        if (linkedList.contains(XAdESParameters.URI_SIGNED_PROPERTIES)) {
            try {
                c = c(dataObjects.x);
            } catch (GeneralSecurityException e2) {
                throw new XAdESException(e2, IAdESException.ecNodeEncodingFailed);
            }
        } else {
            c = null;
        }
        try {
            linkedList.add(e(str, h2.d("Id"), c, XAdESParameters.URI_SIGNED_PROPERTIES, null));
            return qu61Var;
        } catch (GeneralSecurityException e3) {
            throw new XAdESException(e3, IAdESException.ecNodeEncodingFailed);
        }
    }

    public static ArrayList b(String str, DataObjects dataObjects) {
        String str2;
        Reference e;
        JCPLogger.fine("Resolving data object references...");
        LinkedList linkedList = dataObjects.a;
        ArrayList arrayList = new ArrayList(linkedList.size());
        for (Object obj : linkedList) {
            if (obj instanceof Reference) {
                e = (Reference) obj;
            } else {
                LinkedList c = linkedList.contains(obj) ? c(dataObjects.x) : null;
                String str3 = (String) obj;
                ls61 ls61Var = (ls61) dataObjects.b.get(obj);
                if (ls61Var == null) {
                    str2 = null;
                } else {
                    str2 = ls61Var.a;
                    if (str2 == null) {
                        ny61.r("objectReference не был определен перед вызовом getObjectReference().");
                        return null;
                    }
                }
                e = e(str, str3, c, null, str2);
            }
            arrayList.add(e);
        }
        return arrayList;
    }

    public static LinkedList c(LinkedList linkedList) {
        JCPLogger.fine("Converting transforms...");
        LinkedList linkedList2 = new LinkedList();
        XMLSignatureFactory i = i();
        if (!linkedList.isEmpty()) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                linkedList2.add(((ITransform) it.next()).getTransform(i));
            }
        }
        return linkedList2;
    }

    public static DigestMethod d(String str) {
        return i().newDigestMethod(str, (DigestMethodParameterSpec) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List] */
    public static Reference e(String str, String str2, LinkedList linkedList, String str3, String str4) {
        JCPLogger.fine("Resolving references...");
        XMLSignatureFactory i = i();
        DigestMethod d = d(str);
        String trim = str2.trim();
        if (trim.equals("")) {
            Transform newTransform = i.newTransform("http://www.w3.org/2000/09/xmldsig#enveloped-signature", (TransformParameterSpec) null);
            if (linkedList == null) {
                linkedList = Collections.singletonList(newTransform);
            } else if (!linkedList.contains(newTransform)) {
                linkedList.add(0, newTransform);
            }
        } else if (!trim.startsWith(ShimmerDivHandler.NUMBER_SING) && !trim.startsWith("http://") && !trim.startsWith("https://")) {
            trim = ShimmerDivHandler.NUMBER_SING.concat(trim);
        }
        return i.newReference(trim, d, linkedList, str3, str4);
    }

    public static XMLObject f(ArrayList arrayList) {
        return i().newXMLObject(arrayList, (String) null, (String) null, (String) null);
    }

    public static KeyInfo g(X509Certificate[] x509CertificateArr, String str) {
        JCPLogger.fine("Creating key information...");
        KeyInfoFactory keyInfoFactory = i().getKeyInfoFactory();
        ArrayList arrayList = new ArrayList();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            arrayList.add(x509Certificate);
        }
        X509Data newX509Data = keyInfoFactory.newX509Data(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(newX509Data);
        return keyInfoFactory.newKeyInfo(arrayList2, str);
    }

    public static SignatureMethod h(String str) {
        return i().newSignatureMethod(str, (SignatureMethodParameterSpec) null);
    }

    public static XMLSignatureFactory i() {
        return XMLSignatureFactory.getInstance("DOM", XMLDSigRI.PROVIDER_NAME);
    }

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSignature
    public void addSigner(String str, String str2, String str3, String str4, PrivateKey privateKey, List<X509Certificate> list, boolean z, Integer num, String str5, Set<X509CRL> set) throws XAdESException {
        Set<X509CRL> set2;
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Adding a new signer... %%%");
        if (list == null || list.isEmpty()) {
            throw new XAdESException(IAdESException.ecCertificateChainIsNull);
        }
        if (!AdESSigner.CREATED_SIGNATURE_TYPES().contains(num)) {
            throw new XAdESException("Unsupported signature type " + XAdESType.getSignatureTypeName(num) + " for creation", IAdESException.ecSignatureUnsupported);
        }
        Integer num2 = XAdESParameters.XAdES_T;
        if (num.equals(num2) && str5 == null) {
            throw new XAdESException("Expected signature type is XAdES-T but TSA url not found", IAdESException.ecInternal);
        }
        String algorithm = privateKey.getAlgorithm();
        JCPLogger.fine("Private key algorithm: " + algorithm);
        if (str2 == null && !AdESUtility.isInternalImplemented(str)) {
            throw new XAdESException(g8e.o("Digest URI/URN is not supported by provider ", str), IAdESException.ecInternal);
        }
        if (str3 == null && !AdESUtility.isInternalImplemented(str)) {
            throw new XAdESException(g8e.o("Signature URI/URN is not supported by provider ", str), IAdESException.ecInternal);
        }
        String str6 = str4 == null ? SignatureTimeStamp.DEFAULT_CANONICALIZATION_ALGORITHM : str4;
        String keyAlgToDigestOid = AlgorithmUtility.keyAlgToDigestOid(algorithm);
        JCPLogger.fine("Digest OID from key: " + keyAlgToDigestOid);
        String findDigestUriByKey = XAdESUtility.findDigestUriByKey(privateKey);
        JCPLogger.fine("Digest URI from key: " + findDigestUriByKey);
        String digestAlgToSignatureOid = AlgorithmUtility.digestAlgToSignatureOid(keyAlgToDigestOid);
        JCPLogger.fine("Signature OID from key: " + digestAlgToSignatureOid);
        String findSignatureUriByKey = XAdESUtility.findSignatureUriByKey(privateKey);
        JCPLogger.fine("Signature URI from key: " + findSignatureUriByKey);
        if (set == null) {
            try {
                set2 = Collections.EMPTY_SET;
            } catch (AdESException e) {
                throw new XAdESException(e, e.getErrorCode());
            } catch (Exception e2) {
                throw new XAdESException(e2, IAdESException.ecInternal);
            }
        } else {
            set2 = set;
        }
        AdESUtility.checkOidAndKeyAlgorithmXAdESConformity(keyAlgToDigestOid, digestAlgToSignatureOid, privateKey);
        X509Certificate findCertMatch = AdESUtility.findCertMatch(privateKey, list, str);
        if (findCertMatch == null) {
            throw new CAdESException(IAdESException.ecKeyMismatch);
        }
        String str7 = str6;
        JCPLogger.fineFormat("Adding the signer certificate\n\tserial number: {0}\n\tsubject: {1}\n\tissuer: {2}\n\tfrom: {3}\n\ttill: {4}", findCertMatch.getSerialNumber().toString(16), findCertMatch.getSubjectDN(), findCertMatch.getIssuerDN(), findCertMatch.getNotBefore(), findCertMatch.getNotAfter());
        JCPLogger.fine("Building of the signer certificate chain...");
        HashSet hashSet = new HashSet(list);
        CertificateChainBuilderImpl certificateChainBuilderImpl = new CertificateChainBuilderImpl();
        certificateChainBuilderImpl.setProvider(str);
        certificateChainBuilderImpl.setCertificateValues(hashSet);
        certificateChainBuilderImpl.build(findCertMatch);
        JCPLogger.fine("Building of the signer certificate chain completed.");
        List<X509Certificate> certificateChain = certificateChainBuilderImpl.getCertificateChain();
        if (!num.equals(XAdESParameters.XAdES_X_Long_Type_1)) {
            Options options = this.y;
            boolean z2 = options == null || options.isEnableCertificateValidation() || !(num.equals(XAdESParameters.XAdES_BES) || num.equals(num2));
            JCPLogger.fine("Validating of the signer certificate chain...");
            BaseCertificateChainValidatorImpl baseCertificateChainValidatorImpl = new BaseCertificateChainValidatorImpl();
            baseCertificateChainValidatorImpl.setCRLs(set2);
            baseCertificateChainValidatorImpl.setProvider(str);
            JCPLogger.fine("validateCertificateChain = " + z2);
            baseCertificateChainValidatorImpl.setEnableCertificateValidation(z2);
            baseCertificateChainValidatorImpl.validate(certificateChain, (List) null);
            JCPLogger.fine("Validating of the signer certificate chain completed.");
        }
        JCPLogger.fine("Preparing signer information...");
        vw61 vw61Var = new vw61();
        HashSet hashSet2 = vw61Var.l;
        vw61Var.e = num;
        vw61Var.c = privateKey;
        vw61Var.d = findCertMatch;
        vw61Var.f.addAll(certificateChain);
        vw61Var.g = findDigestUriByKey;
        vw61Var.h = findSignatureUriByKey;
        vw61Var.i = str7;
        vw61Var.j = str5;
        hashSet2.addAll(certificateChain);
        hashSet2.addAll(hashSet);
        vw61Var.m.addAll(set2);
        vw61Var.a = str;
        vw61Var.b = keyAlgToDigestOid;
        vw61Var.k = z;
        this.w.add(vw61Var);
        JCPLogger.fine("%%% Signer added %%%");
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSignature, ru.CryptoPro.AdES.external.interfaces.IAdESSignature
    public void close() throws XAdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Closing context... %%%");
        OutputStream outputStream = this.x;
        if (outputStream != null) {
            try {
                XMLUtils.writeXML(outputStream, this.a);
                this.x.close();
            } catch (Exception e) {
                throw new XAdESException(e, IAdESException.ecClosingOutputContextFailed);
            }
        }
        JCPLogger.fine("%%% Context closed %%%");
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSignature
    public XAdESSigner getXAdESSignerInfo(int i) throws ArrayIndexOutOfBoundsException {
        ArrayList arrayList = this.c;
        XAdESSigner[] xAdESSignerArr = (XAdESSigner[]) arrayList.toArray(new XAdESSigner[arrayList.size()]);
        if (i >= 0 && i < xAdESSignerArr.length) {
            return xAdESSignerArr[i];
        }
        throw new ArrayIndexOutOfBoundsException(oyr.m(xAdESSignerArr.length, Extension.C_BRAKE, b64.t(i, "Index ", " is out of array bounds (array size: ")));
    }

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSignature
    public XAdESSigner[] getXAdESSignerInfos() {
        ArrayList arrayList = this.c;
        return (XAdESSigner[]) arrayList.toArray(new XAdESSigner[arrayList.size()]);
    }

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSignature, ru.CryptoPro.AdES.external.interfaces.IAdESSignature
    public void open(OutputStream outputStream) throws XAdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Opening context... %%%");
        this.x = outputStream;
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSignature, ru.CryptoPro.AdES.external.interfaces.IAdESSignature, ru.CryptoPro.AdES.SignatureOptions
    public void setOptions(Options options) {
        this.y = options;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01ac A[Catch: Exception -> 0x02e6, AdESException -> 0x02ef, TryCatch #2 {AdESException -> 0x02ef, Exception -> 0x02e6, blocks: (B:3:0x000b, B:4:0x0011, B:6:0x0017, B:8:0x003f, B:11:0x0051, B:13:0x00c5, B:15:0x00cb, B:16:0x00d6, B:17:0x00de, B:18:0x0159, B:20:0x01ac, B:23:0x01b7, B:24:0x01f9, B:26:0x0212, B:27:0x0225, B:29:0x0248, B:31:0x0250, B:33:0x0254, B:35:0x027f, B:38:0x0296, B:39:0x02b7, B:42:0x02b8, B:43:0x02d9, B:44:0x021c, B:45:0x01b1, B:47:0x00d1, B:48:0x00e3, B:50:0x00ef, B:51:0x013c, B:53:0x02da, B:54:0x02e1), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0212 A[Catch: Exception -> 0x02e6, AdESException -> 0x02ef, TryCatch #2 {AdESException -> 0x02ef, Exception -> 0x02e6, blocks: (B:3:0x000b, B:4:0x0011, B:6:0x0017, B:8:0x003f, B:11:0x0051, B:13:0x00c5, B:15:0x00cb, B:16:0x00d6, B:17:0x00de, B:18:0x0159, B:20:0x01ac, B:23:0x01b7, B:24:0x01f9, B:26:0x0212, B:27:0x0225, B:29:0x0248, B:31:0x0250, B:33:0x0254, B:35:0x027f, B:38:0x0296, B:39:0x02b7, B:42:0x02b8, B:43:0x02d9, B:44:0x021c, B:45:0x01b1, B:47:0x00d1, B:48:0x00e3, B:50:0x00ef, B:51:0x013c, B:53:0x02da, B:54:0x02e1), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0248 A[Catch: Exception -> 0x02e6, AdESException -> 0x02ef, TryCatch #2 {AdESException -> 0x02ef, Exception -> 0x02e6, blocks: (B:3:0x000b, B:4:0x0011, B:6:0x0017, B:8:0x003f, B:11:0x0051, B:13:0x00c5, B:15:0x00cb, B:16:0x00d6, B:17:0x00de, B:18:0x0159, B:20:0x01ac, B:23:0x01b7, B:24:0x01f9, B:26:0x0212, B:27:0x0225, B:29:0x0248, B:31:0x0250, B:33:0x0254, B:35:0x027f, B:38:0x0296, B:39:0x02b7, B:42:0x02b8, B:43:0x02d9, B:44:0x021c, B:45:0x01b1, B:47:0x00d1, B:48:0x00e3, B:50:0x00ef, B:51:0x013c, B:53:0x02da, B:54:0x02e1), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x021c A[Catch: Exception -> 0x02e6, AdESException -> 0x02ef, TryCatch #2 {AdESException -> 0x02ef, Exception -> 0x02e6, blocks: (B:3:0x000b, B:4:0x0011, B:6:0x0017, B:8:0x003f, B:11:0x0051, B:13:0x00c5, B:15:0x00cb, B:16:0x00d6, B:17:0x00de, B:18:0x0159, B:20:0x01ac, B:23:0x01b7, B:24:0x01f9, B:26:0x0212, B:27:0x0225, B:29:0x0248, B:31:0x0250, B:33:0x0254, B:35:0x027f, B:38:0x0296, B:39:0x02b7, B:42:0x02b8, B:43:0x02d9, B:44:0x021c, B:45:0x01b1, B:47:0x00d1, B:48:0x00e3, B:50:0x00ef, B:51:0x013c, B:53:0x02da, B:54:0x02e1), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f8  */
    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSignature
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void update(Element element, DataObjects dataObjects) throws XAdESException {
        Iterator it;
        XAdESSignerBESImpl xAdESSignerBESImpl;
        KeyInfo keyInfo;
        Element element2;
        XAdESSignerBESImpl xAdESSignerBESImpl2;
        Element element3 = element;
        DataObjects dataObjects2 = dataObjects;
        JCPLogger.subEnter();
        try {
            Iterator it2 = this.w.iterator();
            while (it2.hasNext()) {
                vw61 vw61Var = (vw61) it2.next();
                String a = dataObjects2.a();
                Integer num = vw61Var.e;
                List list = vw61Var.f;
                HashSet hashSet = vw61Var.m;
                HashSet hashSet2 = vw61Var.l;
                JCPLogger.fineFormat("** Creating signer with id: {0} and type: {1}", a, XAdESType.getSignatureTypeName(num));
                DataObjects dataObjects3 = new DataObjects(dataObjects2);
                if (!dataObjects2.w) {
                    throw new IllegalStateException("DataObjectFormat'ы нельзя получить пока не был сгенерирован идентификатор узла подписи.");
                }
                Collection values = dataObjects2.b.values();
                Integer num2 = vw61Var.e;
                Integer num3 = XAdESParameters.XAdES_X_Long_Type_1;
                if (num2.equals(num3)) {
                    JCPLogger.fine("Initializing enhanced signature-timestamp...");
                    st61 st61Var = new st61(vw61Var.j);
                    st61Var.setDigestAlgorithm(vw61Var.b);
                    st61Var.setProvider(vw61Var.a);
                    st61Var.setCertificateValues(hashSet2);
                    st61Var.setCRLs(hashSet);
                    JCPLogger.fine("Initializing enhanced sig-and-refs-timestamp...");
                    yu61 yu61Var = new yu61(vw61Var.j);
                    yu61Var.setDigestAlgorithm(vw61Var.b);
                    yu61Var.setProvider(vw61Var.a);
                    yu61Var.setCertificateValues(hashSet2);
                    JCPLogger.fine("Initializing [X Long Type 1]-signer...");
                    XAdESSignerXLT1Impl xAdESSignerXLT1Impl = new XAdESSignerXLT1Impl(element3);
                    it = it2;
                    TreeMap treeMap = xAdESSignerXLT1Impl.z;
                    JCPLogger.fine("Override signer certificate chain...");
                    xAdESSignerXLT1Impl.o(list);
                    xAdESSignerXLT1Impl.setProvider(vw61Var.a);
                    xAdESSignerXLT1Impl.setDigestAlgorithm(vw61Var.b);
                    xAdESSignerXLT1Impl.b(hashSet2);
                    xAdESSignerXLT1Impl.c(hashSet);
                    xAdESSignerXLT1Impl.r(Collections.singletonList(st61Var));
                    JCPLogger.subEnter();
                    treeMap.put(cl_64.N, st61Var);
                    JCPLogger.subExit();
                    List singletonList = Collections.singletonList(yu61Var);
                    JCPLogger.subEnter();
                    if (singletonList == null || singletonList.size() <= 0) {
                        treeMap.remove(cl_64.K);
                    } else {
                        treeMap.put(cl_64.K, singletonList);
                    }
                    JCPLogger.subExit();
                    xAdESSignerXLT1Impl.k(vw61Var.d);
                    xAdESSignerBESImpl2 = xAdESSignerXLT1Impl;
                } else {
                    it = it2;
                    if (vw61Var.e.equals(XAdESParameters.XAdES_T)) {
                        JCPLogger.fine("Initializing signature-timestamp...");
                        SignatureTimeStampImpl signatureTimeStampImpl = new SignatureTimeStampImpl(vw61Var.j);
                        signatureTimeStampImpl.setDigestAlgorithm(vw61Var.b);
                        signatureTimeStampImpl.setProvider(vw61Var.a);
                        signatureTimeStampImpl.setCertificateValues(hashSet2);
                        signatureTimeStampImpl.setCRLs(hashSet);
                        signatureTimeStampImpl.setOptions(this.y);
                        JCPLogger.fine("Initializing [T]-signer...");
                        XAdESSignerTImpl xAdESSignerTImpl = new XAdESSignerTImpl(element3);
                        xAdESSignerTImpl.p(Collections.singletonList(signatureTimeStampImpl));
                        JCPLogger.fine("Override signer certificate chain...");
                        xAdESSignerTImpl.o(list);
                        xAdESSignerTImpl.k(vw61Var.d);
                        xAdESSignerTImpl.setProvider(vw61Var.a);
                        xAdESSignerTImpl.b(hashSet2);
                        xAdESSignerTImpl.c(hashSet);
                        xAdESSignerTImpl.m(values);
                        xAdESSignerBESImpl = xAdESSignerTImpl;
                        JCPLogger.fine("Encoding signed properties...");
                        qu61 a2 = a(xAdESSignerBESImpl, vw61Var.g, a, dataObjects3);
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(a2);
                        ArrayList arrayList2 = new ArrayList();
                        XMLObject f = f(arrayList);
                        arrayList2.add(f);
                        String str = a + "-SignatureValue";
                        JCPLogger.fine("Preparing signature parameters...");
                        XMLSignatureFactory i = i();
                        CanonicalizationMethod newCanonicalizationMethod = i.newCanonicalizationMethod(vw61Var.i, (C14NMethodParameterSpec) null);
                        ArrayList b = b(vw61Var.g, dataObjects3);
                        if (vw61Var.e.equals(num3)) {
                            if (!vw61Var.k) {
                                list = Collections.singletonList(vw61Var.d);
                            }
                            String str2 = a + "-KeyInfo";
                            KeyInfo g = g((X509Certificate[]) list.toArray(new X509Certificate[list.size()]), str2);
                            b.add(i.newReference(ShimmerDivHandler.NUMBER_SING + str2, d(vw61Var.g)));
                            keyInfo = g;
                        } else {
                            keyInfo = null;
                        }
                        SignedInfo newSignedInfo = i.newSignedInfo(newCanonicalizationMethod, h(vw61Var.h), b);
                        JCPLogger.fine("Creating XML signature element...");
                        XMLSignature newXMLSignature = i.newXMLSignature(newSignedInfo, keyInfo, arrayList2, a, str);
                        DOMSignContext dOMSignContext = xAdESSignerBESImpl.c == null ? new DOMSignContext(vw61Var.c, xAdESSignerBESImpl.c) : new DOMSignContext(vw61Var.c, xAdESSignerBESImpl.b);
                        dOMSignContext.putNamespacePrefix("http://www.w3.org/2000/09/xmldsig#", XAdESParameters.XML_SIGNATURE_PREFIX);
                        dOMSignContext.putNamespacePrefix(XAdESParameters.XADES_SIGNATURE_NAMESPACE, XAdESParameters.XADES_SIGNATURE_PREFIX);
                        JCPLogger.fine("Calculating XML signature...");
                        newXMLSignature.sign(dOMSignContext);
                        element2 = (Element) XMLUtils.findSignatureElementById((Element) dOMSignContext.getParent(), a);
                        if (element2 != null) {
                            throw new XAdESException("Signature " + a + " not found.", IAdESException.ecNodeNotFound);
                        }
                        Element childElementByTagNameNS = XMLUtils.getChildElementByTagNameNS(element2, "SignatureValue", "http://www.w3.org/2000/09/xmldsig#");
                        if (childElementByTagNameNS == null) {
                            throw new XAdESException("SignatureValue not found in Signature " + a + Extension.DOT_CHAR, IAdESException.ecNodeNotFound);
                        }
                        if (xAdESSignerBESImpl instanceof XAdESSignerT) {
                            JCPLogger.fine("Adding unsigned attributes...");
                            xAdESSignerBESImpl.j(a2, a, childElementByTagNameNS);
                            JCPLogger.fine("Validating after creating...");
                            xAdESSignerBESImpl.e(vw61Var.a, this.y);
                            JCPLogger.fine("Replacing unsigned attributes...");
                            arrayList2.remove(f);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(a2);
                            arrayList2.add(f(arrayList3));
                        }
                        xAdESSignerBESImpl.a(a);
                        xAdESSignerBESImpl.g();
                        this.a = xAdESSignerBESImpl.b;
                        JCPLogger.fine("Signer completed.");
                        element3 = element;
                        dataObjects2 = dataObjects;
                        it2 = it;
                    } else {
                        JCPLogger.fine("Initializing [BES]-signer...");
                        XAdESSignerBESImpl xAdESSignerBESImpl3 = new XAdESSignerBESImpl(element3, XAdESParameters.XAdES_BES);
                        xAdESSignerBESImpl3.k(vw61Var.d);
                        xAdESSignerBESImpl3.setProvider(vw61Var.a);
                        xAdESSignerBESImpl3.b(hashSet2);
                        xAdESSignerBESImpl3.c(hashSet);
                        xAdESSignerBESImpl2 = xAdESSignerBESImpl3;
                    }
                }
                xAdESSignerBESImpl2.m(values);
                xAdESSignerBESImpl = xAdESSignerBESImpl2;
                JCPLogger.fine("Encoding signed properties...");
                qu61 a22 = a(xAdESSignerBESImpl, vw61Var.g, a, dataObjects3);
                ArrayList arrayList4 = new ArrayList(1);
                arrayList4.add(a22);
                ArrayList arrayList22 = new ArrayList();
                XMLObject f2 = f(arrayList4);
                arrayList22.add(f2);
                String str3 = a + "-SignatureValue";
                JCPLogger.fine("Preparing signature parameters...");
                XMLSignatureFactory i2 = i();
                CanonicalizationMethod newCanonicalizationMethod2 = i2.newCanonicalizationMethod(vw61Var.i, (C14NMethodParameterSpec) null);
                ArrayList b2 = b(vw61Var.g, dataObjects3);
                if (vw61Var.e.equals(num3)) {
                }
                SignedInfo newSignedInfo2 = i2.newSignedInfo(newCanonicalizationMethod2, h(vw61Var.h), b2);
                JCPLogger.fine("Creating XML signature element...");
                XMLSignature newXMLSignature2 = i2.newXMLSignature(newSignedInfo2, keyInfo, arrayList22, a, str3);
                if (xAdESSignerBESImpl.c == null) {
                }
                dOMSignContext.putNamespacePrefix("http://www.w3.org/2000/09/xmldsig#", XAdESParameters.XML_SIGNATURE_PREFIX);
                dOMSignContext.putNamespacePrefix(XAdESParameters.XADES_SIGNATURE_NAMESPACE, XAdESParameters.XADES_SIGNATURE_PREFIX);
                JCPLogger.fine("Calculating XML signature...");
                newXMLSignature2.sign(dOMSignContext);
                element2 = (Element) XMLUtils.findSignatureElementById((Element) dOMSignContext.getParent(), a);
                if (element2 != null) {
                }
            }
            JCPLogger.subExit();
        } catch (AdESException e) {
            throw new XAdESException(e, e.getErrorCode());
        } catch (Exception e2) {
            throw new XAdESException(e2, IAdESException.ecInternal);
        }
    }

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSignature, ru.CryptoPro.AdES.external.interfaces.IAdESSignature
    public void verify(Set<X509Certificate> set, Set<X509CRL> set2) throws XAdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Verifying signature... %%%");
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            ((XAdESSigner) it.next()).verify(set, set2, this.b, false);
            i++;
        }
        JCPLogger.fineFormat("Verification completed!\n\ttotal: {0} signature(s)\n\tverified: {1} signature(s)", Integer.valueOf(arrayList.size()), Integer.valueOf(i));
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSignature, ru.CryptoPro.AdES.external.interfaces.IAdESSignature
    public void verify(Set<X509Certificate> set) throws XAdESException {
        JCPLogger.subEnter();
        verify(set, null);
        JCPLogger.subExit();
    }

    public XAdESSignature() {
        this.a = null;
        this.b = XAdESParameters.XAdES_Unknown;
        this.c = new ArrayList();
        this.w = new ArrayList();
        this.x = null;
        this.y = null;
        SelfTester_Auxiliary.checkClass(XAdESSignature.class);
    }

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSignature
    public void addSigner(String str, String str2, String str3, String str4, PrivateKey privateKey, List<X509Certificate> list, boolean z, Integer num, String str5) throws XAdESException {
        addSigner(str, str2, str3, str4, privateKey, list, z, num, str5, null);
    }

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSignature
    public void addSigner(String str, String str2, String str3, String str4, PrivateKey privateKey, List<X509Certificate> list, Integer num, String str5) throws XAdESException {
        addSigner(str, str2, str3, str4, privateKey, list, false, num, str5);
    }

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSignature
    public void addSigner(String str, String str2, PrivateKey privateKey, List<X509Certificate> list, Integer num, String str3) throws XAdESException {
        addSigner(str, str2, privateKey, list, false, num, str3);
    }

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSignature
    public void addSigner(String str, String str2, PrivateKey privateKey, List<X509Certificate> list, boolean z, Integer num, String str3) throws XAdESException {
        addSigner(str, null, null, str2, privateKey, list, z, num, str3);
    }
}
