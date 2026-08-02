package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

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
public class AlgorithmIdentifier extends Asn1Type {
    public Asn1ObjectIdentifier algorithm;
    public Asn1Type parameters;

    public AlgorithmIdentifier(int[] iArr, Asn1Type asn1Type) {
        this.algorithm = new Asn1ObjectIdentifier(iArr);
        this.parameters = asn1Type;
    }

    public void checkTC(boolean z) throws Asn1Exception {
        ALGORITHM_ID algorithm_id;
        int i = 0;
        while (true) {
            ALGORITHM_ID[] algorithm_idArr = _PKIX1Explicit88Values.SupportedAlgorithms;
            if (i >= algorithm_idArr.length) {
                algorithm_id = null;
                break;
            } else {
                if (algorithm_idArr[i].id.equals(this.algorithm)) {
                    algorithm_id = algorithm_idArr[i];
                    break;
                }
                i++;
            }
        }
        if (algorithm_id == null || !z || this.parameters == null || algorithm_id.Type == null) {
            return;
        }
        try {
            Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(((Asn1OpenType) this.parameters).value);
            Asn1Type asn1Type = (Asn1Type) algorithm_id.Type.getClass().newInstance();
            this.parameters = asn1Type;
            asn1Type.decode(asn1BerDecodeBuffer, true, 0);
        } catch (Exception unused) {
            quz.s("table constraint: parameters decode failed");
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
        this.algorithm = asn1ObjectIdentifier;
        asn1ObjectIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.expired()) {
            Asn1OpenType asn1OpenType = new Asn1OpenType();
            this.parameters = asn1OpenType;
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
        Asn1Type asn1Type = this.parameters;
        int encode = this.algorithm.encode(asn1BerEncodeBuffer, true) + (asn1Type != null ? asn1Type.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.algorithm = null;
        this.parameters = null;
    }

    public AlgorithmIdentifier(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1OpenType asn1OpenType) {
        this.algorithm = asn1ObjectIdentifier;
        this.parameters = asn1OpenType;
    }

    public AlgorithmIdentifier(Asn1ObjectIdentifier asn1ObjectIdentifier) {
        this.algorithm = asn1ObjectIdentifier;
    }

    public AlgorithmIdentifier() {
    }

    public AlgorithmIdentifier(int[] iArr) {
        this.algorithm = new Asn1ObjectIdentifier(iArr);
    }
}
