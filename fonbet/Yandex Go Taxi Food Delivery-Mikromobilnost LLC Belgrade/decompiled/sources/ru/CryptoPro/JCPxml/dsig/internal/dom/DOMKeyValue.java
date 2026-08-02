package ru.CryptoPro.JCPxml.dsig.internal.dom;

import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import defpackage.dy31;
import defpackage.ny61;
import defpackage.w511;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.KeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.exceptions.Base64DecodingException;
import org.apache.xml.security.utils.Base64;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* loaded from: classes4.dex */
public abstract class DOMKeyValue extends DOMStructure implements KeyValue {
    private static final String XMLDSIG_11_XMLNS = "http://www.w3.org/2009/xmldsig11#";
    private static Log log = LogFactory.getLog(DOMKeyValue.class);
    private final PublicKey publicKey;

    final class Unknown extends DOMKeyValue {
        private javax.xml.crypto.dom.DOMStructure externalPublicKey;

        public Unknown(Element element, XMLCryptoContext xMLCryptoContext) throws MarshalException {
            super(element, xMLCryptoContext);
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMKeyValue
        public void marshalPublicKey(Node node, Document document, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
            node.appendChild(this.externalPublicKey.getNode());
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMKeyValue
        public PublicKey unmarshalKeyValue(Element element, XMLCryptoContext xMLCryptoContext) throws MarshalException {
            this.externalPublicKey = new javax.xml.crypto.dom.DOMStructure(element);
            return null;
        }
    }

    public DOMKeyValue(PublicKey publicKey) throws KeyException {
        if (publicKey != null) {
            this.publicKey = publicKey;
        } else {
            ny61.t("key cannot be null");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PublicKey generatePublicKey(KeyFactory keyFactory, KeySpec keySpec) {
        try {
            return keyFactory.generatePublic(keySpec);
        } catch (InvalidKeySpecException unused) {
            return null;
        }
    }

    public static KeyValue unmarshal(Element element, XMLCryptoContext xMLCryptoContext) throws MarshalException {
        Element firstChildElement = DOMUtils.getFirstChildElement(element);
        return firstChildElement.getLocalName().equals("DSAKeyValue") ? new DSA(firstChildElement, xMLCryptoContext) : firstChildElement.getLocalName().equals("RSAKeyValue") ? new RSA(firstChildElement, xMLCryptoContext) : firstChildElement.getLocalName().equals("ECKeyValue") ? new EC(firstChildElement, xMLCryptoContext) : firstChildElement.getLocalName().equals("GOSTKeyValue") ? new GOST3410_XXX(firstChildElement, xMLCryptoContext) : new Unknown(firstChildElement, xMLCryptoContext);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyValue)) {
            return false;
        }
        try {
            KeyValue keyValue = (KeyValue) obj;
            PublicKey publicKey = this.publicKey;
            if (publicKey == null) {
                if (keyValue.getPublicKey() != null) {
                    return false;
                }
            } else if (!publicKey.equals(keyValue.getPublicKey())) {
                return false;
            }
            return true;
        } catch (KeyException unused) {
            return false;
        }
    }

    public PublicKey getPublicKey() throws KeyException {
        PublicKey publicKey = this.publicKey;
        if (publicKey != null) {
            return publicKey;
        }
        throw new KeyException("can't convert KeyValue to PublicKey");
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMStructure
    public void marshal(Node node, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Document ownerDocument = DOMUtils.getOwnerDocument(node);
        Element createElement = DOMUtils.createElement(ownerDocument, "KeyValue", "http://www.w3.org/2000/09/xmldsig#", str);
        marshalPublicKey(createElement, ownerDocument, str, dOMCryptoContext);
        node.appendChild(createElement);
    }

    public abstract void marshalPublicKey(Node node, Document document, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException;

    public abstract PublicKey unmarshalKeyValue(Element element, XMLCryptoContext xMLCryptoContext) throws MarshalException;

    public DOMKeyValue(Element element, XMLCryptoContext xMLCryptoContext) throws MarshalException {
        this.publicKey = unmarshalKeyValue(element, xMLCryptoContext);
    }

    final class GOST3410_XXX extends DOMKeyValue {
        private DOMCryptoBinary gostPublicKey;
        private KeyFactory gostkf;

        public GOST3410_XXX(PublicKey publicKey) throws KeyException {
            super(publicKey);
            this.gostPublicKey = new DOMCryptoBinary(new BigInteger(publicKey.getEncoded()));
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMKeyValue
        public void marshalPublicKey(Node node, Document document, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
            Element createElement = DOMUtils.createElement(document, "GOSTKeyValue", "http://www.w3.org/2000/09/xmldsig#", str);
            Element createElement2 = DOMUtils.createElement(document, "PublicKey", "http://www.w3.org/2000/09/xmldsig#", str);
            this.gostPublicKey.marshal(createElement2, str, dOMCryptoContext);
            createElement.appendChild(createElement2);
            node.appendChild(createElement);
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMKeyValue
        public PublicKey unmarshalKeyValue(Element element, XMLCryptoContext xMLCryptoContext) throws MarshalException {
            String str = (String) xMLCryptoContext.getProperty("org.jcp.xml.dsig.internal.dom.SignatureProvider");
            try {
                Utils.checkProvider(str);
                if (DOMKeyValue.log.isDebugEnabled()) {
                    DOMKeyValue.log.debug("Provider for Key Factory: " + str);
                }
                if (this.gostkf == null) {
                    try {
                        this.gostkf = str == null ? KeyFactory.getInstance(JCP.GOST_EL_DEGREE_NAME) : KeyFactory.getInstance(JCP.GOST_EL_DEGREE_NAME, str);
                    } catch (NoSuchAlgorithmException e) {
                        dy31.l(e.getMessage(), "unable to create GOST KeyFactory: ");
                        return null;
                    } catch (NoSuchProviderException e2) {
                        dy31.l(e2.getMessage(), "unable to create GOST KeyFactory: ");
                        return null;
                    }
                }
                if (DOMKeyValue.log.isDebugEnabled()) {
                    DOMKeyValue.log.debug("Resolved Provider for Key Factory: " + this.gostkf.getProvider());
                }
                DOMCryptoBinary dOMCryptoBinary = new DOMCryptoBinary(DOMUtils.getFirstChildElement(element).getFirstChild());
                this.gostPublicKey = dOMCryptoBinary;
                try {
                    return this.gostkf.generatePublic(new X509EncodedKeySpec(dOMCryptoBinary.getBigNum().toByteArray()));
                } catch (InvalidKeySpecException e3) {
                    dy31.l(e3.getMessage(), "unable to create GOST PublicKey: ");
                    return null;
                }
            } catch (Exception e4) {
                throw new MarshalException(e4);
            }
        }

        public GOST3410_XXX(Element element, XMLCryptoContext xMLCryptoContext) throws MarshalException {
            super(element, xMLCryptoContext);
        }
    }

    final class RSA extends DOMKeyValue {
        private DOMCryptoBinary exponent;
        private DOMCryptoBinary modulus;
        private KeyFactory rsakf;

        public RSA(PublicKey publicKey) throws KeyException {
            super(publicKey);
            RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
            this.exponent = new DOMCryptoBinary(rSAPublicKey.getPublicExponent());
            this.modulus = new DOMCryptoBinary(rSAPublicKey.getModulus());
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMKeyValue
        public void marshalPublicKey(Node node, Document document, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
            Element createElement = DOMUtils.createElement(document, "RSAKeyValue", "http://www.w3.org/2000/09/xmldsig#", str);
            Element createElement2 = DOMUtils.createElement(document, "Modulus", "http://www.w3.org/2000/09/xmldsig#", str);
            Element createElement3 = DOMUtils.createElement(document, "Exponent", "http://www.w3.org/2000/09/xmldsig#", str);
            this.modulus.marshal(createElement2, str, dOMCryptoContext);
            this.exponent.marshal(createElement3, str, dOMCryptoContext);
            createElement.appendChild(createElement2);
            createElement.appendChild(createElement3);
            node.appendChild(createElement);
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMKeyValue
        public PublicKey unmarshalKeyValue(Element element, XMLCryptoContext xMLCryptoContext) throws MarshalException {
            if (this.rsakf == null) {
                try {
                    this.rsakf = KeyFactory.getInstance("RSA");
                } catch (NoSuchAlgorithmException e) {
                    dy31.l(e.getMessage(), "unable to create RSA KeyFactory: ");
                    return null;
                }
            }
            Element firstChildElement = DOMUtils.getFirstChildElement(element);
            this.modulus = new DOMCryptoBinary(firstChildElement.getFirstChild());
            this.exponent = new DOMCryptoBinary(DOMUtils.getNextSiblingElement(firstChildElement).getFirstChild());
            return DOMKeyValue.generatePublicKey(this.rsakf, new RSAPublicKeySpec(this.modulus.getBigNum(), this.exponent.getBigNum()));
        }

        public RSA(Element element, XMLCryptoContext xMLCryptoContext) throws MarshalException {
            super(element, xMLCryptoContext);
        }
    }

    final class DSA extends DOMKeyValue {
        private KeyFactory dsakf;
        private DOMCryptoBinary g;
        private DOMCryptoBinary j;
        private DOMCryptoBinary p;
        private DOMCryptoBinary q;
        private DOMCryptoBinary y;

        public DSA(PublicKey publicKey) throws KeyException {
            super(publicKey);
            DSAPublicKey dSAPublicKey = (DSAPublicKey) publicKey;
            DSAParams params = dSAPublicKey.getParams();
            this.p = new DOMCryptoBinary(params.getP());
            this.q = new DOMCryptoBinary(params.getQ());
            this.g = new DOMCryptoBinary(params.getG());
            this.y = new DOMCryptoBinary(dSAPublicKey.getY());
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMKeyValue
        public void marshalPublicKey(Node node, Document document, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
            Element createElement = DOMUtils.createElement(document, "DSAKeyValue", "http://www.w3.org/2000/09/xmldsig#", str);
            Element createElement2 = DOMUtils.createElement(document, CA20Status.STATUS_REQUEST_P, "http://www.w3.org/2000/09/xmldsig#", str);
            Element createElement3 = DOMUtils.createElement(document, CA20Status.STATUS_REQUEST_Q, "http://www.w3.org/2000/09/xmldsig#", str);
            Element createElement4 = DOMUtils.createElement(document, "G", "http://www.w3.org/2000/09/xmldsig#", str);
            Element createElement5 = DOMUtils.createElement(document, "Y", "http://www.w3.org/2000/09/xmldsig#", str);
            this.p.marshal(createElement2, str, dOMCryptoContext);
            this.q.marshal(createElement3, str, dOMCryptoContext);
            this.g.marshal(createElement4, str, dOMCryptoContext);
            this.y.marshal(createElement5, str, dOMCryptoContext);
            createElement.appendChild(createElement2);
            createElement.appendChild(createElement3);
            createElement.appendChild(createElement4);
            createElement.appendChild(createElement5);
            node.appendChild(createElement);
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMKeyValue
        public PublicKey unmarshalKeyValue(Element element, XMLCryptoContext xMLCryptoContext) throws MarshalException {
            if (this.dsakf == null) {
                try {
                    this.dsakf = KeyFactory.getInstance("DSA");
                } catch (NoSuchAlgorithmException e) {
                    dy31.l(e.getMessage(), "unable to create DSA KeyFactory: ");
                    return null;
                }
            }
            Element firstChildElement = DOMUtils.getFirstChildElement(element);
            if (firstChildElement.getLocalName().equals(CA20Status.STATUS_REQUEST_P)) {
                this.p = new DOMCryptoBinary(firstChildElement.getFirstChild());
                Element nextSiblingElement = DOMUtils.getNextSiblingElement(firstChildElement);
                this.q = new DOMCryptoBinary(nextSiblingElement.getFirstChild());
                firstChildElement = DOMUtils.getNextSiblingElement(nextSiblingElement);
            }
            if (firstChildElement.getLocalName().equals("G")) {
                this.g = new DOMCryptoBinary(firstChildElement.getFirstChild());
                firstChildElement = DOMUtils.getNextSiblingElement(firstChildElement);
            }
            this.y = new DOMCryptoBinary(firstChildElement.getFirstChild());
            Element nextSiblingElement2 = DOMUtils.getNextSiblingElement(firstChildElement);
            if (nextSiblingElement2 != null && nextSiblingElement2.getLocalName().equals("J")) {
                this.j = new DOMCryptoBinary(nextSiblingElement2.getFirstChild());
                DOMUtils.getNextSiblingElement(nextSiblingElement2);
            }
            return DOMKeyValue.generatePublicKey(this.dsakf, new DSAPublicKeySpec(this.y.getBigNum(), this.p.getBigNum(), this.q.getBigNum(), this.g.getBigNum()));
        }

        public DSA(Element element, XMLCryptoContext xMLCryptoContext) throws MarshalException {
            super(element, xMLCryptoContext);
        }
    }

    final class EC extends DOMKeyValue {
        private Method decodePoint;
        private ECParameterSpec ecParams;
        private byte[] ecPublicKey;
        private KeyFactory eckf;
        private Method encodePoint;
        private Method getCurveName;
        private Method getECParameterSpec;

        public EC(PublicKey publicKey) throws KeyException {
            super(publicKey);
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            ECPoint w = eCPublicKey.getW();
            this.ecParams = eCPublicKey.getParams();
            try {
                AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: ru.CryptoPro.JCPxml.dsig.internal.dom.DOMKeyValue.EC.1
                    @Override // java.security.PrivilegedExceptionAction
                    public Void run() throws ClassNotFoundException, NoSuchMethodException {
                        EC.this.getMethods();
                        return null;
                    }
                });
                try {
                    this.ecPublicKey = (byte[]) this.encodePoint.invoke(null, w, this.ecParams.getCurve());
                } catch (IllegalAccessException e) {
                    throw new KeyException(e);
                } catch (InvocationTargetException e2) {
                    throw new KeyException(e2);
                }
            } catch (PrivilegedActionException e3) {
                throw new KeyException("ECKeyValue not supported", e3.getException());
            }
        }

        public void getMethods() throws ClassNotFoundException, NoSuchMethodException {
            Class<?> cls = Class.forName("sun.security.ec.ECParameters");
            this.encodePoint = cls.getMethod("encodePoint", ECPoint.class, EllipticCurve.class);
            this.getCurveName = cls.getMethod("getCurveName", ECParameterSpec.class);
            this.decodePoint = cls.getMethod("decodePoint", byte[].class, EllipticCurve.class);
            this.getECParameterSpec = Class.forName("sun.security.ec.NamedCurve").getMethod("getECParameterSpec", String.class);
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMKeyValue
        public void marshalPublicKey(Node node, Document document, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
            String nSPrefix = DOMUtils.getNSPrefix(dOMCryptoContext, DOMKeyValue.XMLDSIG_11_XMLNS);
            Node createElement = DOMUtils.createElement(document, "ECKeyValue", DOMKeyValue.XMLDSIG_11_XMLNS, nSPrefix);
            Element createElement2 = DOMUtils.createElement(document, "NamedCurve", DOMKeyValue.XMLDSIG_11_XMLNS, nSPrefix);
            Node createElement3 = DOMUtils.createElement(document, "PublicKey", DOMKeyValue.XMLDSIG_11_XMLNS, nSPrefix);
            try {
                DOMUtils.setAttribute(createElement2, GlobalRouterActivity.URI, "urn:oid:" + ((String) this.getCurveName.invoke(null, this.ecParams)));
                createElement2.setAttributeNS("http://www.w3.org/2000/xmlns/", (nSPrefix == null || nSPrefix.length() == 0) ? "xmlns" : "xmlns:".concat(nSPrefix), DOMKeyValue.XMLDSIG_11_XMLNS);
                createElement.appendChild(createElement2);
                createElement3.appendChild(DOMUtils.getOwnerDocument(createElement3).createTextNode(Base64.encode(this.ecPublicKey)));
                createElement.appendChild(createElement3);
                node.appendChild(createElement);
            } catch (IllegalAccessException e) {
                throw new MarshalException(e);
            } catch (InvocationTargetException e2) {
                throw new MarshalException(e2);
            }
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMKeyValue
        public PublicKey unmarshalKeyValue(Element element, XMLCryptoContext xMLCryptoContext) throws MarshalException {
            if (this.eckf == null) {
                try {
                    this.eckf = KeyFactory.getInstance("EC");
                } catch (NoSuchAlgorithmException e) {
                    dy31.l(e.getMessage(), "unable to create EC KeyFactory: ");
                    return null;
                }
            }
            try {
                AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: ru.CryptoPro.JCPxml.dsig.internal.dom.DOMKeyValue.EC.2
                    @Override // java.security.PrivilegedExceptionAction
                    public Void run() throws ClassNotFoundException, NoSuchMethodException {
                        EC.this.getMethods();
                        return null;
                    }
                });
                Element firstChildElement = DOMUtils.getFirstChildElement(element);
                if (firstChildElement.getLocalName().equals("ECParameters")) {
                    w511.x("ECParameters not supported");
                    return null;
                }
                if (!firstChildElement.getLocalName().equals("NamedCurve")) {
                    throw new MarshalException("Invalid ECKeyValue");
                }
                String attributeValue = DOMUtils.getAttributeValue(firstChildElement, GlobalRouterActivity.URI);
                if (!attributeValue.startsWith("urn:oid:")) {
                    throw new MarshalException("Invalid NamedCurve URI");
                }
                try {
                    ECParameterSpec eCParameterSpec = (ECParameterSpec) this.getECParameterSpec.invoke(null, attributeValue.substring(8));
                    try {
                        return DOMKeyValue.generatePublicKey(this.eckf, new ECPublicKeySpec((ECPoint) this.decodePoint.invoke(null, Base64.decode(DOMUtils.getNextSiblingElement(firstChildElement)), eCParameterSpec.getCurve()), eCParameterSpec));
                    } catch (IllegalAccessException e2) {
                        throw new MarshalException(e2);
                    } catch (InvocationTargetException e3) {
                        throw new MarshalException(e3);
                    } catch (Base64DecodingException e4) {
                        throw new MarshalException("Invalid EC PublicKey", e4);
                    }
                } catch (IllegalAccessException e5) {
                    throw new MarshalException(e5);
                } catch (InvocationTargetException e6) {
                    throw new MarshalException(e6);
                }
            } catch (PrivilegedActionException e7) {
                throw new MarshalException("ECKeyValue not supported", e7.getException());
            }
        }

        public EC(Element element, XMLCryptoContext xMLCryptoContext) throws MarshalException {
            super(element, xMLCryptoContext);
        }
    }
}
