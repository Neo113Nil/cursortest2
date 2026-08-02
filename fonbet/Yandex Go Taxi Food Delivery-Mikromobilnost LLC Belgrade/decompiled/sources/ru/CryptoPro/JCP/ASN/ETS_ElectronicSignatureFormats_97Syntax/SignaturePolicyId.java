package ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class SignaturePolicyId extends Asn1Type {
    public SigPolicyHash sigPolicyHash;
    public SigPolicyId sigPolicyIdentifier;
    public SignaturePolicyId_sigPolicyQualifiers sigPolicyQualifiers;

    public SignaturePolicyId(int[] iArr, SigPolicyHash sigPolicyHash, SignaturePolicyId_sigPolicyQualifiers signaturePolicyId_sigPolicyQualifiers) {
        this.sigPolicyIdentifier = new SigPolicyId(iArr);
        this.sigPolicyHash = sigPolicyHash;
        this.sigPolicyQualifiers = signaturePolicyId_sigPolicyQualifiers;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 6, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        SigPolicyId sigPolicyId = new SigPolicyId();
        this.sigPolicyIdentifier = sigPolicyId;
        sigPolicyId.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        SigPolicyHash sigPolicyHash = new SigPolicyHash();
        this.sigPolicyHash = sigPolicyHash;
        sigPolicyHash.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            SignaturePolicyId_sigPolicyQualifiers signaturePolicyId_sigPolicyQualifiers = new SignaturePolicyId_sigPolicyQualifiers();
            this.sigPolicyQualifiers = signaturePolicyId_sigPolicyQualifiers;
            signaturePolicyId_sigPolicyQualifiers.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 6) || peekTag.equals((short) 0, (short) 32, 16)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        SignaturePolicyId_sigPolicyQualifiers signaturePolicyId_sigPolicyQualifiers = this.sigPolicyQualifiers;
        int encode = this.sigPolicyIdentifier.encode(asn1BerEncodeBuffer, true) + this.sigPolicyHash.encode(asn1BerEncodeBuffer, true) + (signaturePolicyId_sigPolicyQualifiers != null ? signaturePolicyId_sigPolicyQualifiers.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.sigPolicyIdentifier = null;
        this.sigPolicyHash = null;
        this.sigPolicyQualifiers = null;
    }

    public SignaturePolicyId(SigPolicyId sigPolicyId, SigPolicyHash sigPolicyHash, SignaturePolicyId_sigPolicyQualifiers signaturePolicyId_sigPolicyQualifiers) {
        this.sigPolicyIdentifier = sigPolicyId;
        this.sigPolicyHash = sigPolicyHash;
        this.sigPolicyQualifiers = signaturePolicyId_sigPolicyQualifiers;
    }

    public SignaturePolicyId(SigPolicyId sigPolicyId, SigPolicyHash sigPolicyHash) {
        this.sigPolicyIdentifier = sigPolicyId;
        this.sigPolicyHash = sigPolicyHash;
    }

    public SignaturePolicyId() {
    }

    public SignaturePolicyId(int[] iArr, SigPolicyHash sigPolicyHash) {
        this.sigPolicyIdentifier = new SigPolicyId(iArr);
        this.sigPolicyHash = sigPolicyHash;
    }
}
