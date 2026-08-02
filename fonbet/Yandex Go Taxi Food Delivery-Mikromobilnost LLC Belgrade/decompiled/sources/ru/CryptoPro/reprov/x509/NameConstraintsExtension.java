package ru.CryptoPro.reprov.x509;

import defpackage.kbs;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.w511;
import defpackage.wx61;
import java.io.IOException;
import java.io.OutputStream;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class NameConstraintsExtension extends Extension implements Cloneable, CertAttrSet {
    public static final String EXCLUDED_SUBTREES = "excluded_subtrees";
    public static final String IDENT = "x509.info.extensions.NameConstraints";
    public static final String NAME = "NameConstraints";
    public static final String PERMITTED_SUBTREES = "permitted_subtrees";
    private static final byte TAG_EXCLUDED = 1;
    private static final byte TAG_PERMITTED = 0;
    private GeneralSubtrees excluded;
    private boolean hasMax;
    private boolean hasMin;
    private boolean minMaxValid;
    private GeneralSubtrees permitted;

    public NameConstraintsExtension(Boolean bool, Object obj) throws IOException {
        this.permitted = null;
        this.excluded = null;
        this.minMaxValid = false;
        this.extensionId = PKIXExtensions.NameConstraints_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 48) {
            ny61.v("Invalid encoding for NameConstraintsExtension.");
            throw null;
        }
        if (derValue.data == null) {
            return;
        }
        while (derValue.data.available() != 0) {
            DerValue derValue2 = derValue.data.getDerValue();
            if (derValue2.isContextSpecific((byte) 0) && derValue2.isConstructed()) {
                if (this.permitted != null) {
                    ny61.v("Duplicate permitted GeneralSubtrees in NameConstraintsExtension.");
                    throw null;
                }
                derValue2.resetTag((byte) 48);
                this.permitted = new GeneralSubtrees(derValue2);
            } else {
                if (!derValue2.isContextSpecific((byte) 1) || !derValue2.isConstructed()) {
                    ny61.v("Invalid encoding of NameConstraintsExtension.");
                    throw null;
                }
                if (this.excluded != null) {
                    ny61.v("Duplicate excluded GeneralSubtrees in NameConstraintsExtension.");
                    throw null;
                }
                derValue2.resetTag((byte) 48);
                this.excluded = new GeneralSubtrees(derValue2);
            }
        }
        this.minMaxValid = false;
    }

    private void calcMinMax() throws IOException {
        this.hasMin = false;
        this.hasMax = false;
        if (this.excluded != null) {
            for (int i = 0; i < this.excluded.size(); i++) {
                GeneralSubtree generalSubtree = this.excluded.get(i);
                if (generalSubtree.getMinimum() != 0) {
                    this.hasMin = true;
                }
                if (generalSubtree.getMaximum() != -1) {
                    this.hasMax = true;
                }
            }
        }
        if (this.permitted != null) {
            for (int i2 = 0; i2 < this.permitted.size(); i2++) {
                GeneralSubtree generalSubtree2 = this.permitted.get(i2);
                if (generalSubtree2.getMinimum() != 0) {
                    this.hasMin = true;
                }
                if (generalSubtree2.getMaximum() != -1) {
                    this.hasMax = true;
                }
            }
        }
        this.minMaxValid = true;
    }

    private void encodeThis() throws IOException {
        byte[] byteArray;
        this.minMaxValid = false;
        if (this.permitted == null && this.excluded == null) {
            byteArray = null;
        } else {
            DerOutputStream derOutputStream = new DerOutputStream();
            DerOutputStream derOutputStream2 = new DerOutputStream();
            if (this.permitted != null) {
                DerOutputStream derOutputStream3 = new DerOutputStream();
                this.permitted.encode(derOutputStream3);
                derOutputStream2.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 0), derOutputStream3);
            }
            if (this.excluded != null) {
                DerOutputStream derOutputStream4 = new DerOutputStream();
                this.excluded.encode(derOutputStream4);
                derOutputStream2.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 1), derOutputStream4);
            }
            derOutputStream.write((byte) 48, derOutputStream2);
            byteArray = derOutputStream.toByteArray();
        }
        this.extensionValue = byteArray;
    }

    public Object clone() {
        try {
            NameConstraintsExtension nameConstraintsExtension = (NameConstraintsExtension) super.clone();
            GeneralSubtrees generalSubtrees = this.permitted;
            if (generalSubtrees != null) {
                nameConstraintsExtension.permitted = (GeneralSubtrees) generalSubtrees.clone();
            }
            GeneralSubtrees generalSubtrees2 = this.excluded;
            if (generalSubtrees2 != null) {
                nameConstraintsExtension.excluded = (GeneralSubtrees) generalSubtrees2.clone();
            }
            return nameConstraintsExtension;
        } catch (CloneNotSupportedException unused) {
            kbs.g("CloneNotSupportedException while cloning NameConstraintsException. This should never happen.");
            return null;
        }
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase(PERMITTED_SUBTREES)) {
            this.permitted = null;
        } else {
            if (!str.equalsIgnoreCase(EXCLUDED_SUBTREES)) {
                ny61.v("Attribute name not recognized by CertAttrSet:NameConstraintsExtension.");
                return;
            }
            this.excluded = null;
        }
        encodeThis();
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, java.security.cert.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.NameConstraints_Id;
            this.critical = true;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(PERMITTED_SUBTREES)) {
            return this.permitted;
        }
        if (str.equalsIgnoreCase(EXCLUDED_SUBTREES)) {
            return this.excluded;
        }
        ny61.v("Attribute name not recognized by CertAttrSet:NameConstraintsExtension.");
        return null;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Enumeration getElements() {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        attributeNameEnumeration.addElement(PERMITTED_SUBTREES);
        attributeNameEnumeration.addElement(EXCLUDED_SUBTREES);
        return attributeNameEnumeration.elements();
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    public void merge(NameConstraintsExtension nameConstraintsExtension) throws IOException {
        GeneralSubtrees intersect;
        if (nameConstraintsExtension == null) {
            return;
        }
        GeneralSubtrees generalSubtrees = (GeneralSubtrees) nameConstraintsExtension.get(EXCLUDED_SUBTREES);
        GeneralSubtrees generalSubtrees2 = this.excluded;
        if (generalSubtrees2 == null) {
            this.excluded = generalSubtrees != null ? (GeneralSubtrees) generalSubtrees.clone() : null;
        } else if (generalSubtrees != null) {
            generalSubtrees2.union(generalSubtrees);
        }
        GeneralSubtrees generalSubtrees3 = (GeneralSubtrees) nameConstraintsExtension.get(PERMITTED_SUBTREES);
        GeneralSubtrees generalSubtrees4 = this.permitted;
        if (generalSubtrees4 == null) {
            this.permitted = generalSubtrees3 != null ? (GeneralSubtrees) generalSubtrees3.clone() : null;
        } else if (generalSubtrees3 != null && (intersect = generalSubtrees4.intersect(generalSubtrees3)) != null) {
            GeneralSubtrees generalSubtrees5 = this.excluded;
            if (generalSubtrees5 != null) {
                generalSubtrees5.union(intersect);
            } else {
                this.excluded = (GeneralSubtrees) intersect.clone();
            }
        }
        GeneralSubtrees generalSubtrees6 = this.permitted;
        if (generalSubtrees6 != null) {
            generalSubtrees6.reduce(this.excluded);
        }
        encodeThis();
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (str.equalsIgnoreCase(PERMITTED_SUBTREES)) {
            if (!(obj instanceof GeneralSubtrees)) {
                ny61.v("Attribute value should be of type GeneralSubtrees.");
                return;
            }
            this.permitted = (GeneralSubtrees) obj;
        } else if (!str.equalsIgnoreCase(EXCLUDED_SUBTREES)) {
            ny61.v("Attribute name not recognized by CertAttrSet:NameConstraintsExtension.");
            return;
        } else {
            if (!(obj instanceof GeneralSubtrees)) {
                ny61.v("Attribute value should be of type GeneralSubtrees.");
                return;
            }
            this.excluded = (GeneralSubtrees) obj;
        }
        encodeThis();
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("NameConstraints: [");
        String str2 = "";
        if (this.permitted == null) {
            str = "";
        } else {
            str = "\n    Permitted:" + this.permitted.toString();
        }
        sb.append(str);
        if (this.excluded != null) {
            str2 = "\n    Excluded:" + this.excluded.toString();
        }
        return oyr.t(sb, str2, "   ]\n");
    }

    public boolean verify(X509Certificate x509Certificate) throws IOException {
        if (x509Certificate == null) {
            ny61.v("Certificate is null");
            return false;
        }
        if (!this.minMaxValid) {
            calcMinMax();
        }
        if (this.hasMin) {
            ny61.v("Non-zero minimum BaseDistance in name constraints not supported");
            return false;
        }
        if (this.hasMax) {
            ny61.v("Maximum BaseDistance in name constraints not supported");
            return false;
        }
        X500Name asX500Name = X500Name.asX500Name(new X500Principal(x509Certificate.getSubjectX500Principal().getEncoded()));
        if (!asX500Name.isEmpty() && !verify(asX500Name)) {
            return false;
        }
        try {
            SubjectAlternativeNameExtension subjectAlternativeNameExtension = X509CertImpl.toImpl(x509Certificate).getSubjectAlternativeNameExtension();
            GeneralNames generalNames = subjectAlternativeNameExtension != null ? (GeneralNames) subjectAlternativeNameExtension.get(SubjectAlternativeNameExtension.SUBJECT_NAME) : null;
            if (generalNames == null) {
                return verifyRFC822SpecialCase(asX500Name);
            }
            for (int i = 0; i < generalNames.size(); i++) {
                if (!verify(generalNames.get(i).getName())) {
                    return false;
                }
            }
            return true;
        } catch (CertificateException e) {
            w511.r(e.getMessage(), "Unable to extract extensions from certificate: ");
            return false;
        }
    }

    public boolean verifyRFC822SpecialCase(X500Name x500Name) throws IOException {
        String valueString;
        for (AVA ava : x500Name.allAvas()) {
            if (ava.getOID().equals((Object) wx61.b) && (valueString = ava.getValueString()) != null) {
                try {
                    if (!verify(new RFC822Name(valueString))) {
                        return false;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return true;
    }

    public boolean verify(GeneralNameInterface generalNameInterface) throws IOException {
        GeneralName name;
        GeneralNameInterface name2;
        GeneralName name3;
        GeneralNameInterface name4;
        int constrains;
        if (generalNameInterface == null) {
            ny61.v("name is null");
            return false;
        }
        GeneralSubtrees generalSubtrees = this.excluded;
        if (generalSubtrees != null && generalSubtrees.size() > 0) {
            for (int i = 0; i < this.excluded.size(); i++) {
                GeneralSubtree generalSubtree = this.excluded.get(i);
                if (generalSubtree != null && (name3 = generalSubtree.getName()) != null && (name4 = name3.getName()) != null && ((constrains = name4.constrains(generalNameInterface)) == 0 || constrains == 1)) {
                    return false;
                }
            }
        }
        GeneralSubtrees generalSubtrees2 = this.permitted;
        if (generalSubtrees2 != null && generalSubtrees2.size() > 0) {
            boolean z = false;
            for (int i2 = 0; i2 < this.permitted.size(); i2++) {
                GeneralSubtree generalSubtree2 = this.permitted.get(i2);
                if (generalSubtree2 != null && (name = generalSubtree2.getName()) != null && (name2 = name.getName()) != null) {
                    int constrains2 = name2.constrains(generalNameInterface);
                    if (constrains2 == 0 || constrains2 == 1) {
                        return true;
                    }
                    if (constrains2 == 2 || constrains2 == 3) {
                        z = true;
                    }
                }
            }
            if (z) {
                return false;
            }
        }
        return true;
    }

    public NameConstraintsExtension(GeneralSubtrees generalSubtrees, GeneralSubtrees generalSubtrees2) throws IOException {
        this.minMaxValid = false;
        this.permitted = generalSubtrees;
        this.excluded = generalSubtrees2;
        this.extensionId = PKIXExtensions.NameConstraints_Id;
        this.critical = true;
        encodeThis();
    }
}
