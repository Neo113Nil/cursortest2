package ru.CryptoPro.reprov.x509;

import defpackage.ny61;
import defpackage.oyr;
import java.io.IOException;
import java.security.cert.PolicyQualifierInfo;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class PolicyInformation {
    public static final String ID = "id";
    public static final String NAME = "PolicyInformation";
    public static final String QUALIFIERS = "qualifiers";
    private CertificatePolicyId policyIdentifier;
    private Set policyQualifiers;

    public PolicyInformation(DerValue derValue) throws IOException {
        if (derValue.tag != 48) {
            ny61.v("Invalid encoding of PolicyInformation");
            throw null;
        }
        this.policyIdentifier = new CertificatePolicyId(derValue.data.getDerValue());
        if (derValue.data.available() == 0) {
            this.policyQualifiers = Collections.EMPTY_SET;
            return;
        }
        this.policyQualifiers = new LinkedHashSet();
        DerValue derValue2 = derValue.data.getDerValue();
        if (derValue2.tag != 48) {
            ny61.v("Invalid encoding of PolicyInformation");
            throw null;
        }
        if (derValue2.data.available() == 0) {
            ny61.v("No data available in policyQualifiers");
            throw null;
        }
        while (derValue2.data.available() != 0) {
            this.policyQualifiers.add(new PolicyQualifierInfo(derValue2.data.getDerValue().toByteArray()));
        }
    }

    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase(QUALIFIERS)) {
            this.policyQualifiers = Collections.EMPTY_SET;
        } else if (str.equalsIgnoreCase("id")) {
            ny61.v("Attribute ID may not be deleted from PolicyInformation.");
        } else {
            ny61.v(oyr.p("Attribute name [", str, "] not recognized by PolicyInformation."));
        }
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        DerOutputStream derOutputStream2 = new DerOutputStream();
        this.policyIdentifier.encode(derOutputStream2);
        if (!this.policyQualifiers.isEmpty()) {
            DerOutputStream derOutputStream3 = new DerOutputStream();
            Iterator it = this.policyQualifiers.iterator();
            while (it.hasNext()) {
                derOutputStream3.write(((PolicyQualifierInfo) it.next()).getEncoded());
            }
            derOutputStream2.write((byte) 48, derOutputStream3);
        }
        derOutputStream.write((byte) 48, derOutputStream2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PolicyInformation)) {
            return false;
        }
        PolicyInformation policyInformation = (PolicyInformation) obj;
        if (this.policyIdentifier.equals(policyInformation.getPolicyIdentifier())) {
            return this.policyQualifiers.equals(policyInformation.getPolicyQualifiers());
        }
        return false;
    }

    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase("id")) {
            return this.policyIdentifier;
        }
        if (str.equalsIgnoreCase(QUALIFIERS)) {
            return this.policyQualifiers;
        }
        ny61.v(oyr.p("Attribute name [", str, "] not recognized by PolicyInformation."));
        return null;
    }

    public Enumeration getElements() {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        attributeNameEnumeration.addElement("id");
        attributeNameEnumeration.addElement(QUALIFIERS);
        return attributeNameEnumeration.elements();
    }

    public String getName() {
        return NAME;
    }

    public CertificatePolicyId getPolicyIdentifier() {
        return this.policyIdentifier;
    }

    public Set getPolicyQualifiers() {
        return this.policyQualifiers;
    }

    public int hashCode() {
        return this.policyQualifiers.hashCode() + ((this.policyIdentifier.hashCode() + 37) * 37);
    }

    public void set(String str, Object obj) throws IOException {
        if (str.equalsIgnoreCase("id")) {
            if (obj instanceof CertificatePolicyId) {
                this.policyIdentifier = (CertificatePolicyId) obj;
                return;
            } else {
                ny61.v("Attribute value must be instance of CertificatePolicyId.");
                return;
            }
        }
        if (!str.equalsIgnoreCase(QUALIFIERS)) {
            ny61.v(oyr.p("Attribute name [", str, "] not recognized by PolicyInformation"));
            return;
        }
        if (this.policyIdentifier == null) {
            ny61.v("Attribute must have a CertificatePolicyIdentifier value before PolicyQualifierInfo can be set.");
            return;
        }
        if (!(obj instanceof Set)) {
            ny61.v("Attribute value must be of type Set.");
            return;
        }
        Set set = (Set) obj;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof PolicyQualifierInfo)) {
                ny61.v("Attribute value must be aSet of PolicyQualifierInfo objects.");
                return;
            }
        }
        this.policyQualifiers = set;
    }

    public String toString() {
        return ("  [" + this.policyIdentifier.toString()).concat(this.policyQualifiers + "  ]\n");
    }

    public PolicyInformation(CertificatePolicyId certificatePolicyId, Set set) throws IOException {
        if (set == null) {
            ny61.t("policyQualifiers is null");
            throw null;
        }
        this.policyQualifiers = new LinkedHashSet(set);
        this.policyIdentifier = certificatePolicyId;
    }
}
