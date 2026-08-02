package ru.CryptoPro.reprov.x509;

import defpackage.ly3;
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
public class AuthorityInfoAccessExtension extends Extension implements CertAttrSet {
    public static final String DESCRIPTIONS = "descriptions";
    public static final String IDENT = "x509.info.extensions.AuthorityInfoAccess";
    public static final String NAME = "AuthorityInfoAccess";
    private List accessDescriptions;

    public AuthorityInfoAccessExtension(Boolean bool, Object obj) throws IOException {
        this.extensionId = PKIXExtensions.AuthInfoAccess_Id;
        this.critical = bool.booleanValue();
        if (!(obj instanceof byte[])) {
            ny61.v("Illegal argument type");
            throw null;
        }
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 48) {
            ny61.v("Invalid encoding for AuthorityInfoAccessExtension.");
            throw null;
        }
        this.accessDescriptions = new ArrayList();
        while (derValue.data.available() != 0) {
            this.accessDescriptions.add(new AccessDescription(derValue.data.getDerValue()));
        }
    }

    private void encodeThis() throws IOException {
        byte[] byteArray;
        if (this.accessDescriptions.isEmpty()) {
            byteArray = null;
        } else {
            DerOutputStream derOutputStream = new DerOutputStream();
            Iterator it = this.accessDescriptions.iterator();
            while (it.hasNext()) {
                ((AccessDescription) it.next()).encode(derOutputStream);
            }
            DerOutputStream derOutputStream2 = new DerOutputStream();
            derOutputStream2.write((byte) 48, derOutputStream);
            byteArray = derOutputStream2.toByteArray();
        }
        this.extensionValue = byteArray;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (!str.equalsIgnoreCase("descriptions")) {
            ny61.v(oyr.p("Attribute name [", str, "] not recognized by CertAttrSet:AuthorityInfoAccessExtension."));
        } else {
            this.accessDescriptions = new ArrayList();
            encodeThis();
        }
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, java.security.cert.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.AuthInfoAccess_Id;
            this.critical = false;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase("descriptions")) {
            return this.accessDescriptions;
        }
        ny61.v(oyr.p("Attribute name [", str, "] not recognized by CertAttrSet:AuthorityInfoAccessExtension."));
        return null;
    }

    public List getAccessDescriptions() {
        return this.accessDescriptions;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Enumeration getElements() {
        return n.s("descriptions");
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!str.equalsIgnoreCase("descriptions")) {
            ny61.v(oyr.p("Attribute name [", str, "] not recognized by CertAttrSet:AuthorityInfoAccessExtension."));
        } else if (!(obj instanceof List)) {
            ny61.v("Attribute value should be of type List.");
        } else {
            this.accessDescriptions = (List) obj;
            encodeThis();
        }
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("AuthorityInfoAccess [\n  ");
        return ly3.s(sb, this.accessDescriptions, "\n]\n");
    }

    public AuthorityInfoAccessExtension(List list) throws IOException {
        this.extensionId = PKIXExtensions.AuthInfoAccess_Id;
        this.critical = false;
        this.accessDescriptions = list;
        encodeThis();
    }
}
