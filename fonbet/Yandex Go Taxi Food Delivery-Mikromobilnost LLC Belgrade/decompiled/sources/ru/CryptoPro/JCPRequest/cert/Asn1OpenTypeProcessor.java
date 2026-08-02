package ru.CryptoPro.JCPRequest.cert;

import com.objsys.asn1j.runtime.Asn1OpenType;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class Asn1OpenTypeProcessor {
    public final Asn1OpenType a;

    public Asn1OpenTypeProcessor(Asn1OpenType asn1OpenType) {
        this.a = asn1OpenType;
    }

    public final String toString() {
        return Array.toHexLowString(this.a.value);
    }
}
