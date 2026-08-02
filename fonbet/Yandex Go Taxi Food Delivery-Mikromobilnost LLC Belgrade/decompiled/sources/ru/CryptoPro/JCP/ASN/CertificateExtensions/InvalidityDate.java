package ru.CryptoPro.JCP.ASN.CertificateExtensions;

import com.objsys.asn1j.runtime.Asn1GeneralizedTime;

/* loaded from: classes4.dex */
public class InvalidityDate extends Asn1GeneralizedTime {
    public InvalidityDate() {
        super(true);
    }

    public InvalidityDate(boolean z) {
        super(z);
    }

    public InvalidityDate(String str) {
        super(str);
    }

    public InvalidityDate(String str, boolean z) {
        super(str, z);
    }
}
