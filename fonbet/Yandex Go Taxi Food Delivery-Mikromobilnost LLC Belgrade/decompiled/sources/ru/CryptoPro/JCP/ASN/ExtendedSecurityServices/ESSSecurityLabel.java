package ru.CryptoPro.JCP.ASN.ExtendedSecurityServices;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1DerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1NotInSetException;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1SetDuplicateException;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import defpackage.quz;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class ESSSecurityLabel extends Asn1Type {
    public ESSPrivacyMark privacy_mark;
    public SecurityCategories security_categories;
    public SecurityClassification security_classification;
    public SecurityPolicyIdentifier security_policy_identifier;

    public ESSSecurityLabel(long j, int[] iArr, ESSPrivacyMark eSSPrivacyMark, SecurityCategories securityCategories) {
        this.security_classification = new SecurityClassification(j);
        this.security_policy_identifier = new SecurityPolicyIdentifier(iArr);
        this.privacy_mark = eSSPrivacyMark;
        this.security_categories = securityCategories;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SET);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        Asn1Tag asn1Tag = new Asn1Tag();
        while (!asn1BerDecodeContext.expired()) {
            asn1BerDecodeBuffer.mark(8);
            int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(asn1Tag);
            if (asn1Tag.equals((short) 0, (short) 0, 2)) {
                if (this.security_classification != null) {
                    throw new Asn1SetDuplicateException(asn1BerDecodeBuffer, asn1Tag);
                }
                asn1BerDecodeBuffer.reset();
                SecurityClassification securityClassification = new SecurityClassification();
                this.security_classification = securityClassification;
                securityClassification.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            } else if (asn1Tag.equals((short) 0, (short) 0, 6)) {
                if (this.security_policy_identifier != null) {
                    throw new Asn1SetDuplicateException(asn1BerDecodeBuffer, asn1Tag);
                }
                asn1BerDecodeBuffer.reset();
                SecurityPolicyIdentifier securityPolicyIdentifier = new SecurityPolicyIdentifier();
                this.security_policy_identifier = securityPolicyIdentifier;
                securityPolicyIdentifier.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            } else if (asn1Tag.equals((short) 0, (short) 0, 12) || asn1Tag.equals((short) 0, (short) 0, 19)) {
                if (this.privacy_mark != null) {
                    throw new Asn1SetDuplicateException(asn1BerDecodeBuffer, asn1Tag);
                }
                asn1BerDecodeBuffer.reset();
                ESSPrivacyMark eSSPrivacyMark = new ESSPrivacyMark();
                this.privacy_mark = eSSPrivacyMark;
                eSSPrivacyMark.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            } else {
                if (!asn1Tag.equals((short) 0, (short) 32, 17)) {
                    throw new Asn1NotInSetException(asn1BerDecodeBuffer, asn1Tag);
                }
                if (this.security_categories != null) {
                    throw new Asn1SetDuplicateException(asn1BerDecodeBuffer, asn1Tag);
                }
                asn1BerDecodeBuffer.reset();
                SecurityCategories securityCategories = new SecurityCategories();
                this.security_categories = securityCategories;
                securityCategories.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            }
        }
        if (this.security_policy_identifier != null) {
            return;
        }
        quz.h(asn1BerDecodeBuffer);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Asn1DerEncodeBuffer asn1DerEncodeBuffer = new Asn1DerEncodeBuffer();
        Asn1OctetString[] asn1OctetStringArr = new Asn1OctetString[4];
        SecurityCategories securityCategories = this.security_categories;
        int encode = securityCategories != null ? securityCategories.encode((Asn1BerEncodeBuffer) asn1DerEncodeBuffer, true) : 0;
        asn1OctetStringArr[0] = new Asn1OctetString(asn1DerEncodeBuffer.getMsgCopy());
        asn1DerEncodeBuffer.reset();
        ESSPrivacyMark eSSPrivacyMark = this.privacy_mark;
        if (eSSPrivacyMark != null) {
            encode += eSSPrivacyMark.encode((Asn1BerEncodeBuffer) asn1DerEncodeBuffer, true);
        }
        asn1OctetStringArr[1] = new Asn1OctetString(asn1DerEncodeBuffer.getMsgCopy());
        asn1DerEncodeBuffer.reset();
        int encode2 = this.security_policy_identifier.encode((Asn1BerEncodeBuffer) asn1DerEncodeBuffer, true) + encode;
        asn1OctetStringArr[2] = new Asn1OctetString(asn1DerEncodeBuffer.getMsgCopy());
        asn1DerEncodeBuffer.reset();
        SecurityClassification securityClassification = this.security_classification;
        if (securityClassification != null) {
            encode2 += securityClassification.encode((Asn1BerEncodeBuffer) asn1DerEncodeBuffer, true);
        }
        asn1OctetStringArr[3] = new Asn1OctetString(asn1DerEncodeBuffer.getMsgCopy());
        asn1DerEncodeBuffer.reset();
        Arrays.sort(asn1OctetStringArr);
        for (int i = 3; i >= 0; i--) {
            asn1OctetStringArr[i].encode(asn1BerEncodeBuffer, false);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SET, encode2) + encode2 : encode2;
    }

    public void init() {
        this.security_classification = null;
        this.security_policy_identifier = null;
        this.privacy_mark = null;
        this.security_categories = null;
    }

    public ESSSecurityLabel(SecurityClassification securityClassification, SecurityPolicyIdentifier securityPolicyIdentifier, ESSPrivacyMark eSSPrivacyMark, SecurityCategories securityCategories) {
        this.security_classification = securityClassification;
        this.security_policy_identifier = securityPolicyIdentifier;
        this.privacy_mark = eSSPrivacyMark;
        this.security_categories = securityCategories;
    }

    public ESSSecurityLabel(SecurityPolicyIdentifier securityPolicyIdentifier) {
        this.security_policy_identifier = securityPolicyIdentifier;
    }

    public ESSSecurityLabel() {
    }

    public ESSSecurityLabel(int[] iArr) {
        this.security_policy_identifier = new SecurityPolicyIdentifier(iArr);
    }
}
