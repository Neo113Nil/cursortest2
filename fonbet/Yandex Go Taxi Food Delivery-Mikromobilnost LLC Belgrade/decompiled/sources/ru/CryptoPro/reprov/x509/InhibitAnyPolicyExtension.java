package ru.CryptoPro.reprov.x509;

import defpackage.n;
import defpackage.ny61;
import defpackage.oyr;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import ru.CryptoPro.AdES.evidence.crl.rfc3280.RFC3280CRLUtility;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.array.ObjectIdentifier;
import ru.CryptoPro.reprov.utils.Debug;

/* loaded from: classes4.dex */
public class InhibitAnyPolicyExtension extends Extension implements CertAttrSet {
    public static ObjectIdentifier AnyPolicy_Id = null;
    public static final String IDENT = "x509.info.extensions.InhibitAnyPolicy";
    public static final String NAME = "InhibitAnyPolicy";
    public static final String SKIP_CERTS = "skip_certs";
    private static final Debug debug = Debug.getInstance("certpath");
    private int skipCerts;

    static {
        try {
            AnyPolicy_Id = new ObjectIdentifier(RFC3280CRLUtility.ANY_POLICY);
        } catch (IOException unused) {
        }
    }

    public InhibitAnyPolicyExtension(Boolean bool, Object obj) throws IOException {
        this.skipCerts = Integer.MAX_VALUE;
        this.extensionId = PKIXExtensions.InhibitAnyPolicy_Id;
        if (!bool.booleanValue()) {
            ny61.v("Criticality cannot be false for InhibitAnyPolicy");
            throw null;
        }
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 2) {
            ny61.v("Invalid encoding of InhibitAnyPolicy: data not integer");
            throw null;
        }
        if (derValue.data == null) {
            ny61.v("Invalid encoding of InhibitAnyPolicy: null data");
            throw null;
        }
        int integer = derValue.getInteger();
        if (integer < -1) {
            ny61.v("Invalid value for skipCerts");
            throw null;
        }
        if (integer == -1) {
            this.skipCerts = Integer.MAX_VALUE;
        } else {
            this.skipCerts = integer;
        }
    }

    private void encodeThis() throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        derOutputStream.putInteger(this.skipCerts);
        this.extensionValue = derOutputStream.toByteArray();
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (!str.equalsIgnoreCase(SKIP_CERTS)) {
            throw new IOException("Attribute name not recognized by CertAttrSet:InhibitAnyPolicy.");
        }
        throw new IOException("Attribute skip_certs may not be deleted.");
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, java.security.cert.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.InhibitAnyPolicy_Id;
            this.critical = true;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(SKIP_CERTS)) {
            return new Integer(this.skipCerts);
        }
        ny61.v("Attribute name not recognized by CertAttrSet:InhibitAnyPolicy.");
        return null;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Enumeration getElements() {
        return n.s(SKIP_CERTS);
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        String str2;
        if (!str.equalsIgnoreCase(SKIP_CERTS)) {
            str2 = "Attribute name not recognized by CertAttrSet:InhibitAnyPolicy.";
        } else if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            if (intValue >= -1) {
                if (intValue == -1) {
                    intValue = Integer.MAX_VALUE;
                }
                this.skipCerts = intValue;
                encodeThis();
                return;
            }
            str2 = "Invalid value for skipCerts";
        } else {
            str2 = "Attribute value should be of type Integer.";
        }
        ny61.v(str2);
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("InhibitAnyPolicy: ");
        return oyr.m(this.skipCerts, "\n", sb);
    }

    public InhibitAnyPolicyExtension(int i) throws IOException {
        this.skipCerts = Integer.MAX_VALUE;
        if (i < -1) {
            ny61.v("Invalid value for skipCerts");
            throw null;
        }
        if (i == -1) {
            this.skipCerts = Integer.MAX_VALUE;
        } else {
            this.skipCerts = i;
        }
        this.extensionId = PKIXExtensions.InhibitAnyPolicy_Id;
        this.critical = true;
        encodeThis();
    }
}
