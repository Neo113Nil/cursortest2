package ru.CryptoPro.reprov.x509;

import defpackage.ly3;
import defpackage.n;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.unr0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.array.ObjectIdentifier;

/* loaded from: classes4.dex */
public class CRLDistributionPointsExtension extends Extension implements CertAttrSet {
    public static final String IDENT = "x509.info.extensions.CRLDistributionPoints";
    public static final String NAME = "CRLDistributionPoints";
    public static final String POINTS = "points";
    private List distributionPoints;
    private String extensionName;

    public CRLDistributionPointsExtension(ObjectIdentifier objectIdentifier, Boolean bool, Object obj, String str) throws IOException {
        this.extensionId = objectIdentifier;
        this.critical = bool.booleanValue();
        if (!(obj instanceof byte[])) {
            ny61.v("Illegal argument type");
            throw null;
        }
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 48) {
            ny61.v(oyr.p("Invalid encoding for ", str, " extension."));
            throw null;
        }
        this.distributionPoints = new ArrayList();
        while (derValue.data.available() != 0) {
            try {
                this.distributionPoints.add(new DistributionPoint(derValue.data.getDerValue()));
            } catch (IOException e) {
                JCPLogger.thrown(e);
            }
        }
        this.extensionName = str;
    }

    private void encodeThis() throws IOException {
        byte[] byteArray;
        if (this.distributionPoints.isEmpty()) {
            byteArray = null;
        } else {
            DerOutputStream derOutputStream = new DerOutputStream();
            Iterator it = this.distributionPoints.iterator();
            while (it.hasNext()) {
                ((DistributionPoint) it.next()).encode(derOutputStream);
            }
            DerOutputStream derOutputStream2 = new DerOutputStream();
            derOutputStream2.write((byte) 48, derOutputStream);
            byteArray = derOutputStream2.toByteArray();
        }
        this.extensionValue = byteArray;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (!str.equalsIgnoreCase(POINTS)) {
            ny61.v(oyr.t(unr0.x("Attribute name [", str, "] not recognized by CertAttrSet:"), this.extensionName, ru.CryptoPro.JCP.tools.CertReader.Extension.DOT_CHAR));
        } else {
            this.distributionPoints = new ArrayList();
            encodeThis();
        }
    }

    public void encode(OutputStream outputStream, ObjectIdentifier objectIdentifier, boolean z) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = objectIdentifier;
            this.critical = z;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(POINTS)) {
            return this.distributionPoints;
        }
        ny61.v(oyr.t(unr0.x("Attribute name [", str, "] not recognized by CertAttrSet:"), this.extensionName, ru.CryptoPro.JCP.tools.CertReader.Extension.DOT_CHAR));
        return null;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Enumeration getElements() {
        return n.s(POINTS);
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String getName() {
        return this.extensionName;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!str.equalsIgnoreCase(POINTS)) {
            ny61.v(oyr.t(unr0.x("Attribute name [", str, "] not recognized by CertAttrSet:"), this.extensionName, ru.CryptoPro.JCP.tools.CertReader.Extension.DOT_CHAR));
        } else if (!(obj instanceof List)) {
            ny61.v("Attribute value should be of type List.");
        } else {
            this.distributionPoints = (List) obj;
            encodeThis();
        }
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(this.extensionName);
        sb.append(" [\n  ");
        return ly3.s(sb, this.distributionPoints, "]\n");
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, java.security.cert.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        encode(outputStream, PKIXExtensions.CRLDistributionPoints_Id, false);
    }

    public CRLDistributionPointsExtension(List list) throws IOException {
        this(false, list);
    }

    public CRLDistributionPointsExtension(Boolean bool, Object obj) throws IOException {
        this(PKIXExtensions.CRLDistributionPoints_Id, bool, obj, NAME);
    }

    public CRLDistributionPointsExtension(ObjectIdentifier objectIdentifier, boolean z, List list, String str) throws IOException {
        this.extensionId = objectIdentifier;
        this.critical = z;
        this.distributionPoints = list;
        encodeThis();
        this.extensionName = str;
    }

    public CRLDistributionPointsExtension(boolean z, List list) throws IOException {
        this(PKIXExtensions.CRLDistributionPoints_Id, z, list, NAME);
    }
}
