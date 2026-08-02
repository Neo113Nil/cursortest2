package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.PrivateKeyUsagePeriod;

/* loaded from: classes4.dex */
public class KeyProperties extends Asn1Type {
    public Asn1Integer keyDeriveCounter;
    public KeyType keyType;
    public PrivateKeyUsagePeriod keyUsagePeriod;

    public KeyProperties(long j, PrivateKeyUsagePeriod privateKeyUsagePeriod, long j2) {
        this.keyType = new KeyType(j);
        this.keyUsagePeriod = privateKeyUsagePeriod;
        this.keyDeriveCounter = new Asn1Integer(j2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        KeyType keyType = new KeyType();
        this.keyType = keyType;
        keyType.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        PrivateKeyUsagePeriod privateKeyUsagePeriod = new PrivateKeyUsagePeriod();
        this.keyUsagePeriod = privateKeyUsagePeriod;
        privateKeyUsagePeriod.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            Asn1Integer asn1Integer = new Asn1Integer();
            this.keyDeriveCounter = asn1Integer;
            asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
            long j = this.keyDeriveCounter.value;
            if (j < 0 || j > _Gost_CryptoPro_PrivateKeyValues.maxDWORD) {
                throw new Asn1ConsVioException("keyDeriveCounter.value", this.keyDeriveCounter.value);
            }
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 0, (short) 32, 16)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Asn1Integer asn1Integer = this.keyDeriveCounter;
        if (asn1Integer != null) {
            long j = asn1Integer.value;
            if (j < 0 || j > _Gost_CryptoPro_PrivateKeyValues.maxDWORD) {
                throw new Asn1ConsVioException("keyDeriveCounter.value", this.keyDeriveCounter.value);
            }
            i = asn1Integer.encode(asn1BerEncodeBuffer, true);
        } else {
            i = 0;
        }
        int encode = this.keyType.encode(asn1BerEncodeBuffer, true) + this.keyUsagePeriod.encode(asn1BerEncodeBuffer, true) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.keyType = null;
        this.keyUsagePeriod = null;
        this.keyDeriveCounter = null;
    }

    public KeyProperties(KeyType keyType, PrivateKeyUsagePeriod privateKeyUsagePeriod, Asn1Integer asn1Integer) {
        this.keyType = keyType;
        this.keyUsagePeriod = privateKeyUsagePeriod;
        this.keyDeriveCounter = asn1Integer;
    }

    public KeyProperties(KeyType keyType, PrivateKeyUsagePeriod privateKeyUsagePeriod) {
        this.keyType = keyType;
        this.keyUsagePeriod = privateKeyUsagePeriod;
    }

    public KeyProperties() {
    }

    public KeyProperties(long j, PrivateKeyUsagePeriod privateKeyUsagePeriod) {
        this.keyType = new KeyType(j);
        this.keyUsagePeriod = privateKeyUsagePeriod;
    }
}
