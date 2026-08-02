package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_TLS;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.GostR3410_EncryptionSyntax.GostR3410_KeyTransport;

/* loaded from: classes4.dex */
public class TLSGostKeyTransportBlob extends Asn1Type {
    public GostR3410_KeyTransport keyBlob;
    public _SeqOfTLSProxyKeyTransportBlob proxyKeyBlobs;

    public TLSGostKeyTransportBlob(GostR3410_KeyTransport gostR3410_KeyTransport, _SeqOfTLSProxyKeyTransportBlob _seqoftlsproxykeytransportblob) {
        this.keyBlob = gostR3410_KeyTransport;
        this.proxyKeyBlobs = _seqoftlsproxykeytransportblob;
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
        GostR3410_KeyTransport gostR3410_KeyTransport = new GostR3410_KeyTransport();
        this.keyBlob = gostR3410_KeyTransport;
        gostR3410_KeyTransport.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            _SeqOfTLSProxyKeyTransportBlob _seqoftlsproxykeytransportblob = new _SeqOfTLSProxyKeyTransportBlob();
            this.proxyKeyBlobs = _seqoftlsproxykeytransportblob;
            _seqoftlsproxykeytransportblob.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 32, 16)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        _SeqOfTLSProxyKeyTransportBlob _seqoftlsproxykeytransportblob = this.proxyKeyBlobs;
        int encode = this.keyBlob.encode(asn1BerEncodeBuffer, true) + (_seqoftlsproxykeytransportblob != null ? _seqoftlsproxykeytransportblob.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.keyBlob = null;
        this.proxyKeyBlobs = null;
    }

    public TLSGostKeyTransportBlob() {
    }

    public TLSGostKeyTransportBlob(GostR3410_KeyTransport gostR3410_KeyTransport) {
        this.keyBlob = gostR3410_KeyTransport;
    }
}
