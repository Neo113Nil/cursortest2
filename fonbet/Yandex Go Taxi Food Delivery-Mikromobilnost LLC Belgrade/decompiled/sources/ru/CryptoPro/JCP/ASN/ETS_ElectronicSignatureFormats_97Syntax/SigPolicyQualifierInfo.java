package ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OpenType;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class SigPolicyQualifierInfo extends Asn1Type {
    public Asn1Type qualifier;
    public Asn1ObjectIdentifier sigPolicyQualifierId;

    public SigPolicyQualifierInfo(int[] iArr, Asn1Type asn1Type) {
        this.sigPolicyQualifierId = new Asn1ObjectIdentifier(iArr);
        this.qualifier = asn1Type;
    }

    public void checkTC(boolean z) throws Asn1Exception {
        SIG_POLICY_QUALIFIER sig_policy_qualifier;
        int i = 0;
        while (true) {
            SIG_POLICY_QUALIFIER[] sig_policy_qualifierArr = _ETS_ElectronicSignatureFormats_97SyntaxValues.SupportedSigPolicyQualifiers;
            if (i >= sig_policy_qualifierArr.length) {
                sig_policy_qualifier = null;
                break;
            } else {
                if (sig_policy_qualifierArr[i].id.equals(this.sigPolicyQualifierId)) {
                    sig_policy_qualifier = sig_policy_qualifierArr[i];
                    break;
                }
                i++;
            }
        }
        if (sig_policy_qualifier == null || !z || this.qualifier == null || sig_policy_qualifier.Qualifier == null) {
            return;
        }
        try {
            Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(((Asn1OpenType) this.qualifier).value);
            Asn1Type asn1Type = (Asn1Type) sig_policy_qualifier.Qualifier.getClass().newInstance();
            this.qualifier = asn1Type;
            asn1Type.decode(asn1BerDecodeBuffer, true, 0);
        } catch (Exception unused) {
            quz.s("table constraint: qualifier decode failed");
        }
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
        Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
        this.sigPolicyQualifierId = asn1ObjectIdentifier;
        asn1ObjectIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.expired()) {
            Asn1OpenType asn1OpenType = new Asn1OpenType();
            this.qualifier = asn1OpenType;
            asn1OpenType.decode(asn1BerDecodeBuffer, true, 0);
        }
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 0, 6)) {
            checkTC(true);
        } else {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        checkTC(false);
        Asn1Type asn1Type = this.qualifier;
        int encode = this.sigPolicyQualifierId.encode(asn1BerEncodeBuffer, true) + (asn1Type != null ? asn1Type.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.sigPolicyQualifierId = null;
        this.qualifier = null;
    }

    public SigPolicyQualifierInfo(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1OpenType asn1OpenType) {
        this.sigPolicyQualifierId = asn1ObjectIdentifier;
        this.qualifier = asn1OpenType;
    }

    public SigPolicyQualifierInfo(Asn1ObjectIdentifier asn1ObjectIdentifier) {
        this.sigPolicyQualifierId = asn1ObjectIdentifier;
    }

    public SigPolicyQualifierInfo() {
    }

    public SigPolicyQualifierInfo(int[] iArr) {
        this.sigPolicyQualifierId = new Asn1ObjectIdentifier(iArr);
    }
}
