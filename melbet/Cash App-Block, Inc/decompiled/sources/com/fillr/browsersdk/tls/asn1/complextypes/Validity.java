package com.fillr.browsersdk.tls.asn1.complextypes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.tls.asn1.ASN1DefinedSequence;
import com.fillr.browsersdk.tls.asn1.ASN1Null;
import com.fillr.browsersdk.tls.asn1.ASN1ObjectId;
import com.fillr.browsersdk.tls.asn1.ASN1Time;
import com.fillr.browsersdk.tls.asn1.ASN1UtfString;
import com.fillr.browsersdk.tls.asn1.ASN1Value;

/* loaded from: classes4.dex */
public final class Validity extends ASN1DefinedSequence {
    public final /* synthetic */ int $r8$classId;
    public ASN1Value notAfter;
    public ASN1Value notBefore;

    public Validity(ASN1ObjectId aSN1ObjectId, ASN1UtfString aSN1UtfString) {
        this.$r8$classId = 2;
        this.notBefore = aSN1ObjectId;
        this.notAfter = aSN1UtfString;
    }

    @Override // com.fillr.browsersdk.tls.asn1.ASN1DefinedSequence
    public final void enqueueValues() {
        switch (this.$r8$classId) {
            case 0:
                addValue((ASN1Time) this.notBefore);
                addValue((ASN1Time) this.notAfter);
                break;
            case 1:
                addValue((ASN1ObjectId) this.notBefore);
                ASN1Null aSN1Null = (ASN1Null) this.notAfter;
                if (aSN1Null == null) {
                    aSN1Null = new ASN1Null();
                }
                addValue(aSN1Null);
                break;
            default:
                addValue((ASN1ObjectId) this.notBefore);
                ASN1Value aSN1Value = (ASN1UtfString) this.notAfter;
                if (aSN1Value == null) {
                    aSN1Value = new ASN1Null();
                }
                addValue(aSN1Value);
                break;
        }
    }

    @Override // com.fillr.browsersdk.tls.asn1.ASN1DefinedSequence
    public final void validate$1() {
        switch (this.$r8$classId) {
            case 0:
                if (((ASN1Time) this.notBefore) == null || ((ASN1Time) this.notAfter) == null) {
                    a$$ExternalSyntheticBUOutline0.m$4("Can't serialize Validity; both 'notBefore' and 'notAfter' are required!");
                    break;
                }
                break;
            case 1:
                if (((ASN1ObjectId) this.notBefore) == null) {
                    a$$ExternalSyntheticBUOutline0.m$4("Can't serialize AlgorithmIdentifier; no algorithm specified!");
                    break;
                }
                break;
            default:
                if (((ASN1ObjectId) this.notBefore) == null) {
                    a$$ExternalSyntheticBUOutline0.m$4("Can't serialize AttributeTypeAndValue; the 'type' has not been specified!");
                    break;
                }
                break;
        }
    }
}
