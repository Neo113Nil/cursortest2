package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import java.io.IOException;

/* loaded from: classes4.dex */
public class UecSymmetricKeyDeriveCounter extends Asn1Integer {
    public UecSymmetricKeyDeriveCounter() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1Integer, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        super.decode(asn1BerDecodeBuffer, z, i);
        long j = this.value;
        if (j < 0 || j > _Gost_CryptoPro_PrivateKeyValues.maxDWORD) {
            throw new Asn1ConsVioException("value", this.value);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Integer, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        long j = this.value;
        if (j < 0 || j > _Gost_CryptoPro_PrivateKeyValues.maxDWORD) {
            throw new Asn1ConsVioException("value", this.value);
        }
        return super.encode(asn1BerEncodeBuffer, z);
    }

    public UecSymmetricKeyDeriveCounter(long j) {
        super(j);
    }
}
