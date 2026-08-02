package ru.CryptoPro.reprov.x509;

import defpackage.n;
import defpackage.ny61;
import defpackage.oyr;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Iterator;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class IssuerAlternativeNameExtension extends Extension implements CertAttrSet {
    public static final String IDENT = "x509.info.extensions.IssuerAlternativeName";
    public static final String ISSUER_NAME = "issuer_name";
    public static final String NAME = "IssuerAlternativeName";
    GeneralNames names;

    public IssuerAlternativeNameExtension(Boolean bool, Object obj) throws IOException {
        this.names = null;
        this.extensionId = PKIXExtensions.IssuerAlternativeName_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        DerValue derValue = new DerValue(bArr);
        if (derValue.data == null) {
            this.names = new GeneralNames();
        } else {
            this.names = new GeneralNames(derValue);
        }
    }

    private void encodeThis() throws IOException {
        GeneralNames generalNames = this.names;
        if (generalNames == null || generalNames.isEmpty()) {
            this.extensionValue = null;
            return;
        }
        DerOutputStream derOutputStream = new DerOutputStream();
        this.names.encode(derOutputStream);
        this.extensionValue = derOutputStream.toByteArray();
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (!str.equalsIgnoreCase(ISSUER_NAME)) {
            ny61.v("Attribute name not recognized by CertAttrSet:IssuerAlternativeName.");
        } else {
            this.names = null;
            encodeThis();
        }
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, java.security.cert.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.IssuerAlternativeName_Id;
            this.critical = false;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(ISSUER_NAME)) {
            return this.names;
        }
        ny61.v("Attribute name not recognized by CertAttrSet:IssuerAlternativeName.");
        return null;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Enumeration getElements() {
        return n.s(ISSUER_NAME);
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!str.equalsIgnoreCase(ISSUER_NAME)) {
            ny61.v("Attribute name not recognized by CertAttrSet:IssuerAlternativeName.");
        } else if (!(obj instanceof GeneralNames)) {
            ny61.v("Attribute value should be of type GeneralNames.");
        } else {
            this.names = (GeneralNames) obj;
            encodeThis();
        }
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        String str;
        String t = oyr.t(new StringBuilder(), super.toString(), "IssuerAlternativeName [\n");
        GeneralNames generalNames = this.names;
        if (generalNames == null) {
            str = t.concat("  null\n");
        } else {
            Iterator it = generalNames.names().iterator();
            while (it.hasNext()) {
                t = t + "  " + ((GeneralName) it.next()) + "\n";
            }
            str = t;
        }
        return str.concat("]\n");
    }

    public IssuerAlternativeNameExtension() {
        this.names = null;
        this.extensionId = PKIXExtensions.IssuerAlternativeName_Id;
        this.critical = false;
        this.names = new GeneralNames();
    }

    public IssuerAlternativeNameExtension(Boolean bool, GeneralNames generalNames) throws IOException {
        this.names = generalNames;
        this.extensionId = PKIXExtensions.IssuerAlternativeName_Id;
        this.critical = bool.booleanValue();
        encodeThis();
    }

    public IssuerAlternativeNameExtension(GeneralNames generalNames) throws IOException {
        this.names = generalNames;
        this.extensionId = PKIXExtensions.IssuerAlternativeName_Id;
        this.critical = false;
        encodeThis();
    }
}
