package ru.CryptoPro.reprov.x509;

import defpackage.ny61;
import defpackage.oyr;
import defpackage.qv10;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class PolicyConstraintsExtension extends Extension implements CertAttrSet {
    public static final String IDENT = "x509.info.extensions.PolicyConstraints";
    public static final String INHIBIT = "inhibit";
    public static final String NAME = "PolicyConstraints";
    public static final String REQUIRE = "require";
    private static final byte TAG_INHIBIT = 1;
    private static final byte TAG_REQUIRE = 0;
    private int inhibit;
    private int require;

    public PolicyConstraintsExtension(Boolean bool, Object obj) throws IOException {
        this.require = -1;
        this.inhibit = -1;
        this.extensionId = PKIXExtensions.PolicyConstraints_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 48) {
            ny61.v("Sequence tag missing for PolicyConstraint.");
            throw null;
        }
        DerInputStream derInputStream = derValue.data;
        while (derInputStream != null && derInputStream.available() != 0) {
            DerValue derValue2 = derInputStream.getDerValue();
            if (!derValue2.isContextSpecific((byte) 0) || derValue2.isConstructed()) {
                if (!derValue2.isContextSpecific((byte) 1) || derValue2.isConstructed()) {
                    ny61.v("Invalid encoding of PolicyConstraint");
                    throw null;
                }
                if (this.inhibit != -1) {
                    ny61.v("Duplicate inhibitPolicyMappingfound in the PolicyConstraintsExtension");
                    throw null;
                }
                derValue2.resetTag((byte) 2);
                this.inhibit = derValue2.getInteger();
            } else {
                if (this.require != -1) {
                    ny61.v("Duplicate requireExplicitPolicyfound in the PolicyConstraintsExtension");
                    throw null;
                }
                derValue2.resetTag((byte) 2);
                this.require = derValue2.getInteger();
            }
        }
    }

    private void encodeThis() throws IOException {
        byte[] byteArray;
        if (this.require == -1 && this.inhibit == -1) {
            byteArray = null;
        } else {
            DerOutputStream derOutputStream = new DerOutputStream();
            DerOutputStream derOutputStream2 = new DerOutputStream();
            if (this.require != -1) {
                DerOutputStream derOutputStream3 = new DerOutputStream();
                derOutputStream3.putInteger(this.require);
                derOutputStream.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 0), derOutputStream3);
            }
            if (this.inhibit != -1) {
                DerOutputStream derOutputStream4 = new DerOutputStream();
                derOutputStream4.putInteger(this.inhibit);
                derOutputStream.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 1), derOutputStream4);
            }
            derOutputStream2.write((byte) 48, derOutputStream);
            byteArray = derOutputStream2.toByteArray();
        }
        this.extensionValue = byteArray;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase(REQUIRE)) {
            this.require = -1;
        } else {
            if (!str.equalsIgnoreCase(INHIBIT)) {
                ny61.v("Attribute name not recognized by CertAttrSet:PolicyConstraints.");
                return;
            }
            this.inhibit = -1;
        }
        encodeThis();
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, java.security.cert.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.PolicyConstraints_Id;
            this.critical = false;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(REQUIRE)) {
            return new Integer(this.require);
        }
        if (str.equalsIgnoreCase(INHIBIT)) {
            return new Integer(this.inhibit);
        }
        ny61.v("Attribute name not recognized by CertAttrSet:PolicyConstraints.");
        return null;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Enumeration getElements() {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        attributeNameEnumeration.addElement(REQUIRE);
        attributeNameEnumeration.addElement(INHIBIT);
        return attributeNameEnumeration.elements();
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        String str2;
        if (obj instanceof Integer) {
            if (str.equalsIgnoreCase(REQUIRE)) {
                this.require = ((Integer) obj).intValue();
            } else if (str.equalsIgnoreCase(INHIBIT)) {
                this.inhibit = ((Integer) obj).intValue();
            } else {
                str2 = oyr.p("Attribute name [", str, "] not recognized by CertAttrSet:PolicyConstraints.");
            }
            encodeThis();
            return;
        }
        str2 = "Attribute value should be of type Integer.";
        ny61.v(str2);
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        String m;
        String sb;
        String t = oyr.t(new StringBuilder(), super.toString(), "PolicyConstraints: [  Require: ");
        if (this.require == -1) {
            m = t.concat("unspecified;");
        } else {
            m = oyr.m(this.require, ";", qv10.t(t));
        }
        String concat = m.concat("\tInhibit: ");
        if (this.inhibit == -1) {
            sb = concat.concat("unspecified");
        } else {
            StringBuilder t2 = qv10.t(concat);
            t2.append(this.inhibit);
            sb = t2.toString();
        }
        return sb.concat(" ]\n");
    }

    public PolicyConstraintsExtension(Boolean bool, int i, int i2) throws IOException {
        this.require = i;
        this.inhibit = i2;
        this.extensionId = PKIXExtensions.PolicyConstraints_Id;
        this.critical = bool.booleanValue();
        encodeThis();
    }

    public PolicyConstraintsExtension(int i, int i2) throws IOException {
        this(Boolean.FALSE, i, i2);
    }
}
