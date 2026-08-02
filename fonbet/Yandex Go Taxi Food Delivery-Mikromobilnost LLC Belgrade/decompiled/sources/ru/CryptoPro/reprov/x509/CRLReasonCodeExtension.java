package ru.CryptoPro.reprov.x509;

import defpackage.n;
import defpackage.ny61;
import java.io.IOException;
import java.io.OutputStream;
import java.security.cert.CRLReason;
import java.util.Enumeration;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class CRLReasonCodeExtension extends Extension implements CertAttrSet {
    public static final int AA_COMPROMISE = 10;
    public static final int AFFLIATION_CHANGED = 3;
    public static final int CA_COMPROMISE = 2;
    public static final int CERTIFICATE_HOLD = 6;
    public static final int CESSATION_OF_OPERATION = 5;
    public static final int KEY_COMPROMISE = 1;
    public static final String NAME = "CRLReasonCode";
    public static final int PRIVILEGE_WITHDRAWN = 9;
    public static final String REASON = "reason";
    public static final int REMOVE_FROM_CRL = 8;
    public static final int SUPERSEDED = 4;
    public static final int UNSPECIFIED = 0;
    private static CRLReason[] values = CRLReason.values();
    private int reasonCode;

    public CRLReasonCodeExtension(Boolean bool, Object obj) throws IOException {
        this.reasonCode = 0;
        this.extensionId = PKIXExtensions.ReasonCode_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        this.reasonCode = new DerValue(bArr).getEnumerated();
    }

    private void encodeThis() throws IOException {
        byte[] byteArray;
        if (this.reasonCode == 0) {
            byteArray = null;
        } else {
            DerOutputStream derOutputStream = new DerOutputStream();
            derOutputStream.putEnumerated(this.reasonCode);
            byteArray = derOutputStream.toByteArray();
        }
        this.extensionValue = byteArray;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (!str.equalsIgnoreCase(REASON)) {
            ny61.v("Name not supported by CRLReasonCodeExtension");
        } else {
            this.reasonCode = 0;
            encodeThis();
        }
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, java.security.cert.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.ReasonCode_Id;
            this.critical = false;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(REASON)) {
            return new Integer(this.reasonCode);
        }
        ny61.v("Name not supported by CRLReasonCodeExtension");
        return null;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Enumeration getElements() {
        return n.s(REASON);
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    public CRLReason getReasonCode() {
        int i = this.reasonCode;
        if (i > 0) {
            CRLReason[] cRLReasonArr = values;
            if (i < cRLReasonArr.length) {
                return cRLReasonArr[i];
            }
        }
        return CRLReason.UNSPECIFIED;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!(obj instanceof Integer)) {
            ny61.v("Attribute must be of type Integer.");
        } else if (!str.equalsIgnoreCase(REASON)) {
            ny61.v("Name not supported by CRLReasonCodeExtension");
        } else {
            this.reasonCode = ((Integer) obj).intValue();
            encodeThis();
        }
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        return super.toString() + "    Reason Code: " + values[this.reasonCode];
    }

    public CRLReasonCodeExtension(int i) throws IOException {
        this(false, i);
    }

    public CRLReasonCodeExtension(boolean z, int i) throws IOException {
        this.reasonCode = 0;
        this.extensionId = PKIXExtensions.ReasonCode_Id;
        this.critical = z;
        this.reasonCode = i;
        encodeThis();
    }
}
