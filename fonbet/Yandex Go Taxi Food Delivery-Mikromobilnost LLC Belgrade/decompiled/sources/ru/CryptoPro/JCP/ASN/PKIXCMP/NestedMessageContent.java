package ru.CryptoPro.JCP.ASN.PKIXCMP;

/* loaded from: classes4.dex */
public class NestedMessageContent extends PKIMessage {
    public NestedMessageContent() {
    }

    public NestedMessageContent(PKIHeader pKIHeader, PKIBody pKIBody, PKIProtection pKIProtection, PKIMessage_extraCerts pKIMessage_extraCerts) {
        super(pKIHeader, pKIBody, pKIProtection, pKIMessage_extraCerts);
    }

    public NestedMessageContent(PKIHeader pKIHeader, PKIBody pKIBody) {
        super(pKIHeader, pKIBody);
    }
}
