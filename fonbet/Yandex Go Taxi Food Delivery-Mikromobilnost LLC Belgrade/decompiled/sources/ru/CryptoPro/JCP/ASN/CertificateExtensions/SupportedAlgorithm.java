package ru.CryptoPro.JCP.ASN.CertificateExtensions;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;

/* loaded from: classes4.dex */
public class SupportedAlgorithm extends Asn1Type {
    public AlgorithmIdentifier algorithmIdentifier;
    public CertificatePoliciesSyntax intendedCertificatePolicies;
    public KeyUsage intendedUsage;

    public SupportedAlgorithm(AlgorithmIdentifier algorithmIdentifier, KeyUsage keyUsage, CertificatePoliciesSyntax certificatePoliciesSyntax) {
        this.algorithmIdentifier = algorithmIdentifier;
        this.intendedUsage = keyUsage;
        this.intendedCertificatePolicies = certificatePoliciesSyntax;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier();
        this.algorithmIdentifier = algorithmIdentifier;
        algorithmIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 0, intHolder, true)) {
            KeyUsage keyUsage = new KeyUsage();
            this.intendedUsage = keyUsage;
            keyUsage.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            CertificatePoliciesSyntax certificatePoliciesSyntax = new CertificatePoliciesSyntax();
            this.intendedCertificatePolicies = certificatePoliciesSyntax;
            certificatePoliciesSyntax.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 128, (short) 0, 0) || peekTag.equals((short) 128, (short) 32, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        CertificatePoliciesSyntax certificatePoliciesSyntax = this.intendedCertificatePolicies;
        if (certificatePoliciesSyntax != null) {
            int encode = certificatePoliciesSyntax.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode) + encode;
        } else {
            i = 0;
        }
        KeyUsage keyUsage = this.intendedUsage;
        if (keyUsage != null) {
            int encode2 = keyUsage.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode2);
        }
        int encode3 = this.algorithmIdentifier.encode(asn1BerEncodeBuffer, true) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode3) + encode3 : encode3;
    }

    public void init() {
        this.algorithmIdentifier = null;
        this.intendedUsage = null;
        this.intendedCertificatePolicies = null;
    }

    public SupportedAlgorithm() {
    }

    public SupportedAlgorithm(AlgorithmIdentifier algorithmIdentifier) {
        this.algorithmIdentifier = algorithmIdentifier;
    }
}
