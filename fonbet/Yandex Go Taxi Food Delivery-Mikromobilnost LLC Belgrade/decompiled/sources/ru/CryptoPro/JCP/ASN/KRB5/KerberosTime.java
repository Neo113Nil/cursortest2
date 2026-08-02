package ru.CryptoPro.JCP.ASN.KRB5;

import com.objsys.asn1j.runtime.Asn1GeneralizedTime;

/* loaded from: classes4.dex */
public class KerberosTime extends Asn1GeneralizedTime {
    public KerberosTime() {
        super(true);
    }

    public KerberosTime(boolean z) {
        super(z);
    }

    public KerberosTime(String str) {
        super(str);
    }

    public KerberosTime(String str, boolean z) {
        super(str, z);
    }
}
