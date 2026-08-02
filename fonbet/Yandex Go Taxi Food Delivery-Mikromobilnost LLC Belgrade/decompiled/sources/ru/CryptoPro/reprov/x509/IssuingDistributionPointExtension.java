package ru.CryptoPro.reprov.x509;

import defpackage.ny61;
import defpackage.oyr;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class IssuingDistributionPointExtension extends Extension implements CertAttrSet {
    public static final String IDENT = "x509.info.extensions.IssuingDistributionPoint";
    public static final String INDIRECT_CRL = "indirect_crl";
    public static final String NAME = "IssuingDistributionPoint";
    public static final String ONLY_ATTRIBUTE_CERTS = "only_attribute_certs";
    public static final String ONLY_CA_CERTS = "only_ca_certs";
    public static final String ONLY_USER_CERTS = "only_user_certs";
    public static final String POINT = "point";
    public static final String REASONS = "reasons";
    private static final byte TAG_DISTRIBUTION_POINT = 0;
    private static final byte TAG_INDIRECT_CRL = 4;
    private static final byte TAG_ONLY_ATTRIBUTE_CERTS = 5;
    private static final byte TAG_ONLY_CA_CERTS = 2;
    private static final byte TAG_ONLY_SOME_REASONS = 3;
    private static final byte TAG_ONLY_USER_CERTS = 1;
    private DistributionPointName distributionPoint;
    private boolean hasOnlyAttributeCerts;
    private boolean hasOnlyCACerts;
    private boolean hasOnlyUserCerts;
    private boolean isIndirectCRL;
    private ReasonFlags revocationReasons;

    public IssuingDistributionPointExtension(Boolean bool, Object obj) throws IOException {
        this.distributionPoint = null;
        this.revocationReasons = null;
        this.hasOnlyUserCerts = false;
        this.hasOnlyCACerts = false;
        this.hasOnlyAttributeCerts = false;
        this.isIndirectCRL = false;
        this.extensionId = PKIXExtensions.IssuingDistributionPoint_Id;
        this.critical = bool.booleanValue();
        if (!(obj instanceof byte[])) {
            ny61.v("Illegal argument type");
            throw null;
        }
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 48) {
            ny61.v("Invalid encoding for IssuingDistributionPointExtension.");
            throw null;
        }
        DerInputStream derInputStream = derValue.data;
        if (derInputStream == null || derInputStream.available() == 0) {
            return;
        }
        DerInputStream derInputStream2 = derValue.data;
        while (derInputStream2 != null && derInputStream2.available() != 0) {
            DerValue derValue2 = derInputStream2.getDerValue();
            if (derValue2.isContextSpecific((byte) 0) && derValue2.isConstructed()) {
                this.distributionPoint = new DistributionPointName(derValue2.data.getDerValue());
            } else if (derValue2.isContextSpecific((byte) 1) && !derValue2.isConstructed()) {
                derValue2.resetTag((byte) 1);
                this.hasOnlyUserCerts = derValue2.getBoolean();
            } else if (derValue2.isContextSpecific((byte) 2) && !derValue2.isConstructed()) {
                derValue2.resetTag((byte) 1);
                this.hasOnlyCACerts = derValue2.getBoolean();
            } else if (derValue2.isContextSpecific((byte) 3) && !derValue2.isConstructed()) {
                this.revocationReasons = new ReasonFlags(derValue2);
            } else if (derValue2.isContextSpecific((byte) 4) && !derValue2.isConstructed()) {
                derValue2.resetTag((byte) 1);
                this.isIndirectCRL = derValue2.getBoolean();
            } else {
                if (!derValue2.isContextSpecific((byte) 5) || derValue2.isConstructed()) {
                    ny61.v("Invalid encoding of IssuingDistributionPoint");
                    throw null;
                }
                derValue2.resetTag((byte) 1);
                this.hasOnlyAttributeCerts = derValue2.getBoolean();
            }
        }
    }

    private void encodeThis() throws IOException {
        byte[] byteArray;
        if (this.distributionPoint != null || this.revocationReasons != null || this.hasOnlyUserCerts || this.hasOnlyCACerts || this.hasOnlyAttributeCerts || this.isIndirectCRL) {
            DerOutputStream derOutputStream = new DerOutputStream();
            if (this.distributionPoint != null) {
                DerOutputStream derOutputStream2 = new DerOutputStream();
                this.distributionPoint.encode(derOutputStream2);
                derOutputStream.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 0), derOutputStream2);
            }
            if (this.hasOnlyUserCerts) {
                DerOutputStream derOutputStream3 = new DerOutputStream();
                derOutputStream3.putBoolean(this.hasOnlyUserCerts);
                derOutputStream.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 1), derOutputStream3);
            }
            if (this.hasOnlyCACerts) {
                DerOutputStream derOutputStream4 = new DerOutputStream();
                derOutputStream4.putBoolean(this.hasOnlyCACerts);
                derOutputStream.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 2), derOutputStream4);
            }
            if (this.revocationReasons != null) {
                DerOutputStream derOutputStream5 = new DerOutputStream();
                this.revocationReasons.encode(derOutputStream5);
                derOutputStream.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 3), derOutputStream5);
            }
            if (this.isIndirectCRL) {
                DerOutputStream derOutputStream6 = new DerOutputStream();
                derOutputStream6.putBoolean(this.isIndirectCRL);
                derOutputStream.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 4), derOutputStream6);
            }
            if (this.hasOnlyAttributeCerts) {
                DerOutputStream derOutputStream7 = new DerOutputStream();
                derOutputStream7.putBoolean(this.hasOnlyAttributeCerts);
                derOutputStream.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 5), derOutputStream7);
            }
            DerOutputStream derOutputStream8 = new DerOutputStream();
            derOutputStream8.write((byte) 48, derOutputStream);
            byteArray = derOutputStream8.toByteArray();
        } else {
            byteArray = null;
        }
        this.extensionValue = byteArray;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase(POINT)) {
            this.distributionPoint = null;
        } else if (str.equalsIgnoreCase(INDIRECT_CRL)) {
            this.isIndirectCRL = false;
        } else if (str.equalsIgnoreCase(REASONS)) {
            this.revocationReasons = null;
        } else if (str.equalsIgnoreCase(ONLY_USER_CERTS)) {
            this.hasOnlyUserCerts = false;
        } else if (str.equalsIgnoreCase(ONLY_CA_CERTS)) {
            this.hasOnlyCACerts = false;
        } else {
            if (!str.equalsIgnoreCase(ONLY_ATTRIBUTE_CERTS)) {
                ny61.v(oyr.p("Attribute name [", str, "] not recognized by CertAttrSet:IssuingDistributionPointExtension."));
                return;
            }
            this.hasOnlyAttributeCerts = false;
        }
        encodeThis();
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, java.security.cert.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.IssuingDistributionPoint_Id;
            this.critical = false;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(POINT)) {
            return this.distributionPoint;
        }
        if (str.equalsIgnoreCase(INDIRECT_CRL)) {
            return Boolean.valueOf(this.isIndirectCRL);
        }
        if (str.equalsIgnoreCase(REASONS)) {
            return this.revocationReasons;
        }
        if (str.equalsIgnoreCase(ONLY_USER_CERTS)) {
            return Boolean.valueOf(this.hasOnlyUserCerts);
        }
        if (str.equalsIgnoreCase(ONLY_CA_CERTS)) {
            return Boolean.valueOf(this.hasOnlyCACerts);
        }
        if (str.equalsIgnoreCase(ONLY_ATTRIBUTE_CERTS)) {
            return Boolean.valueOf(this.hasOnlyAttributeCerts);
        }
        ny61.v(oyr.p("Attribute name [", str, "] not recognized by CertAttrSet:IssuingDistributionPointExtension."));
        return null;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Enumeration getElements() {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        attributeNameEnumeration.addElement(POINT);
        attributeNameEnumeration.addElement(REASONS);
        attributeNameEnumeration.addElement(ONLY_USER_CERTS);
        attributeNameEnumeration.addElement(ONLY_CA_CERTS);
        attributeNameEnumeration.addElement(ONLY_ATTRIBUTE_CERTS);
        attributeNameEnumeration.addElement(INDIRECT_CRL);
        return attributeNameEnumeration.elements();
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (str.equalsIgnoreCase(POINT)) {
            if (!(obj instanceof DistributionPointName)) {
                ny61.v("Attribute value should be of type DistributionPointName.");
                return;
            }
            this.distributionPoint = (DistributionPointName) obj;
        } else if (str.equalsIgnoreCase(REASONS)) {
            if (!(obj instanceof ReasonFlags)) {
                ny61.v("Attribute value should be of type ReasonFlags.");
                return;
            }
        } else if (str.equalsIgnoreCase(INDIRECT_CRL)) {
            if (!(obj instanceof Boolean)) {
                ny61.v("Attribute value should be of type Boolean.");
                return;
            }
            this.isIndirectCRL = ((Boolean) obj).booleanValue();
        } else if (str.equalsIgnoreCase(ONLY_USER_CERTS)) {
            if (!(obj instanceof Boolean)) {
                ny61.v("Attribute value should be of type Boolean.");
                return;
            }
            this.hasOnlyUserCerts = ((Boolean) obj).booleanValue();
        } else if (str.equalsIgnoreCase(ONLY_CA_CERTS)) {
            if (!(obj instanceof Boolean)) {
                ny61.v("Attribute value should be of type Boolean.");
                return;
            }
            this.hasOnlyCACerts = ((Boolean) obj).booleanValue();
        } else if (!str.equalsIgnoreCase(ONLY_ATTRIBUTE_CERTS)) {
            ny61.v(oyr.p("Attribute name [", str, "] not recognized by CertAttrSet:IssuingDistributionPointExtension."));
            return;
        } else {
            if (!(obj instanceof Boolean)) {
                ny61.v("Attribute value should be of type Boolean.");
                return;
            }
            this.hasOnlyAttributeCerts = ((Boolean) obj).booleanValue();
        }
        encodeThis();
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(super.toString());
        stringBuffer.append("IssuingDistributionPoint [\n  ");
        DistributionPointName distributionPointName = this.distributionPoint;
        if (distributionPointName != null) {
            stringBuffer.append(distributionPointName);
        }
        ReasonFlags reasonFlags = this.revocationReasons;
        if (reasonFlags != null) {
            stringBuffer.append(reasonFlags);
        }
        stringBuffer.append(this.hasOnlyUserCerts ? "  Only contains user certs: true" : "  Only contains user certs: false");
        stringBuffer.append("\n");
        stringBuffer.append(this.hasOnlyCACerts ? "  Only contains CA certs: true" : "  Only contains CA certs: false");
        stringBuffer.append("\n");
        stringBuffer.append(this.hasOnlyAttributeCerts ? "  Only contains attribute certs: true" : "  Only contains attribute certs: false");
        stringBuffer.append("\n");
        stringBuffer.append(this.isIndirectCRL ? "  Indirect CRL: true" : "  Indirect CRL: false");
        stringBuffer.append("\n]\n");
        return stringBuffer.toString();
    }

    public IssuingDistributionPointExtension(DistributionPointName distributionPointName, ReasonFlags reasonFlags, boolean z, boolean z2, boolean z3, boolean z4) throws IOException {
        this.distributionPoint = null;
        this.revocationReasons = null;
        this.hasOnlyUserCerts = false;
        this.hasOnlyCACerts = false;
        this.hasOnlyAttributeCerts = false;
        this.isIndirectCRL = false;
        if ((z && (z2 || z3)) || ((z2 && (z || z3)) || (z3 && (z || z2)))) {
            ny61.g("Only one of hasOnlyUserCerts, hasOnlyCACerts, hasOnlyAttributeCerts may be set to true");
            throw null;
        }
        this.extensionId = PKIXExtensions.IssuingDistributionPoint_Id;
        this.critical = true;
        this.distributionPoint = distributionPointName;
        this.revocationReasons = reasonFlags;
        this.hasOnlyUserCerts = z;
        this.hasOnlyCACerts = z2;
        this.hasOnlyAttributeCerts = z3;
        this.isIndirectCRL = z4;
        encodeThis();
    }
}
