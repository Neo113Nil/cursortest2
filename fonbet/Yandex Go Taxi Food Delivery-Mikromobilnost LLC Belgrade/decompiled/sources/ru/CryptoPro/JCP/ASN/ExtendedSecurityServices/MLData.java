package ru.CryptoPro.JCP.ASN.ExtendedSecurityServices;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1GeneralizedTime;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class MLData extends Asn1Type {
    public Asn1GeneralizedTime expansionTime;
    public EntityIdentifier mailListIdentifier;
    public MLReceiptPolicy mlReceiptPolicy;

    public MLData(EntityIdentifier entityIdentifier, String str, MLReceiptPolicy mLReceiptPolicy) {
        this.mailListIdentifier = entityIdentifier;
        this.expansionTime = new Asn1GeneralizedTime(str);
        this.mlReceiptPolicy = mLReceiptPolicy;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.expired()) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (!peekTag.equals((short) 0, (short) 0, 4) && !peekTag.equals((short) 0, (short) 32, 16)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        EntityIdentifier entityIdentifier = new EntityIdentifier();
        this.mailListIdentifier = entityIdentifier;
        entityIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 24, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1GeneralizedTime asn1GeneralizedTime = new Asn1GeneralizedTime(true);
        this.expansionTime = asn1GeneralizedTime;
        asn1GeneralizedTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.expired()) {
            Asn1Tag peekTag2 = asn1BerDecodeBuffer.peekTag();
            if (peekTag2.equals((short) 128, (short) 0, 0) || peekTag2.equals((short) 128, (short) 32, 1) || peekTag2.equals((short) 128, (short) 32, 2)) {
                MLReceiptPolicy mLReceiptPolicy = new MLReceiptPolicy();
                this.mlReceiptPolicy = mLReceiptPolicy;
                mLReceiptPolicy.decode(asn1BerDecodeBuffer, true, intHolder.value);
            }
        }
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 0, 24)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        MLReceiptPolicy mLReceiptPolicy = this.mlReceiptPolicy;
        int encode = this.mailListIdentifier.encode(asn1BerEncodeBuffer, true) + this.expansionTime.encode(asn1BerEncodeBuffer, true) + (mLReceiptPolicy != null ? mLReceiptPolicy.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.mailListIdentifier = null;
        this.expansionTime = null;
        this.mlReceiptPolicy = null;
    }

    public MLData(EntityIdentifier entityIdentifier, Asn1GeneralizedTime asn1GeneralizedTime, MLReceiptPolicy mLReceiptPolicy) {
        this.mailListIdentifier = entityIdentifier;
        this.expansionTime = asn1GeneralizedTime;
        this.mlReceiptPolicy = mLReceiptPolicy;
    }

    public MLData(EntityIdentifier entityIdentifier, Asn1GeneralizedTime asn1GeneralizedTime) {
        this.mailListIdentifier = entityIdentifier;
        this.expansionTime = asn1GeneralizedTime;
    }

    public MLData() {
    }

    public MLData(EntityIdentifier entityIdentifier, String str) {
        this.mailListIdentifier = entityIdentifier;
        this.expansionTime = new Asn1GeneralizedTime(str);
    }
}
