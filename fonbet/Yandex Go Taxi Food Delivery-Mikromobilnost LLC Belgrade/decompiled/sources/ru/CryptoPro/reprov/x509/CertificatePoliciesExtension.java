package ru.CryptoPro.reprov.x509;

import defpackage.n;
import defpackage.ny61;
import defpackage.oyr;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class CertificatePoliciesExtension extends Extension implements CertAttrSet {
    public static final String IDENT = "x509.info.extensions.CertificatePolicies";
    public static final String NAME = "CertificatePolicies";
    public static final String POLICIES = "policies";
    private List certPolicies;

    public CertificatePoliciesExtension(Boolean bool, Object obj) throws IOException {
        this.extensionId = PKIXExtensions.CertificatePolicies_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 48) {
            ny61.v("Invalid encoding for CertificatePoliciesExtension.");
            throw null;
        }
        this.certPolicies = new ArrayList();
        while (derValue.data.available() != 0) {
            this.certPolicies.add(new PolicyInformation(derValue.data.getDerValue()));
        }
    }

    private void encodeThis() throws IOException {
        List list = this.certPolicies;
        if (list == null || list.isEmpty()) {
            this.extensionValue = null;
            return;
        }
        DerOutputStream derOutputStream = new DerOutputStream();
        DerOutputStream derOutputStream2 = new DerOutputStream();
        Iterator it = this.certPolicies.iterator();
        while (it.hasNext()) {
            ((PolicyInformation) it.next()).encode(derOutputStream2);
        }
        derOutputStream.write((byte) 48, derOutputStream2);
        this.extensionValue = derOutputStream.toByteArray();
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (!str.equalsIgnoreCase(POLICIES)) {
            ny61.v(oyr.p("Attribute name [", str, "] not recognized by CertAttrSet:CertificatePoliciesExtension."));
        } else {
            this.certPolicies = null;
            encodeThis();
        }
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, java.security.cert.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.CertificatePolicies_Id;
            this.critical = false;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(POLICIES)) {
            return this.certPolicies;
        }
        ny61.v(oyr.p("Attribute name [", str, "] not recognized by CertAttrSet:CertificatePoliciesExtension."));
        return null;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Enumeration getElements() {
        return n.s(POLICIES);
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!str.equalsIgnoreCase(POLICIES)) {
            ny61.v(oyr.p("Attribute name [", str, "] not recognized by CertAttrSet:CertificatePoliciesExtension."));
        } else if (!(obj instanceof List)) {
            ny61.v("Attribute value should be of type List.");
        } else {
            this.certPolicies = (List) obj;
            encodeThis();
        }
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        if (this.certPolicies == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(super.toString());
        stringBuffer.append("CertificatePolicies [\n");
        Iterator it = this.certPolicies.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((PolicyInformation) it.next()).toString());
        }
        stringBuffer.append("]\n");
        return stringBuffer.toString();
    }

    public CertificatePoliciesExtension(Boolean bool, List list) throws IOException {
        this.certPolicies = list;
        this.extensionId = PKIXExtensions.CertificatePolicies_Id;
        this.critical = bool.booleanValue();
        encodeThis();
    }

    public CertificatePoliciesExtension(List list) throws IOException {
        this(Boolean.FALSE, list);
    }
}
