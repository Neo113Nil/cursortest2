package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

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
public class TBSCertList extends Asn1Type {
    public Extensions crlExtensions;
    public Name issuer;
    public Time nextUpdate;
    public _SeqOfTBSCertList_revokedCertificates_element revokedCertificates;
    public AlgorithmIdentifier signature;
    public Time thisUpdate;
    public Version version;

    public TBSCertList(long j, AlgorithmIdentifier algorithmIdentifier, Name name, Time time, Time time2, _SeqOfTBSCertList_revokedCertificates_element _seqoftbscertlist_revokedcertificates_element, Extensions extensions) {
        this.version = new Version(j);
        this.signature = algorithmIdentifier;
        this.issuer = name;
        this.thisUpdate = time;
        this.nextUpdate = time2;
        this.revokedCertificates = _seqoftbscertlist_revokedcertificates_element;
        this.crlExtensions = extensions;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            Version version = new Version();
            this.version = version;
            version.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier();
        this.signature = algorithmIdentifier;
        algorithmIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Name name = new Name();
        this.issuer = name;
        name.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (!peekTag.equals((short) 0, (short) 0, 23) && !peekTag.equals((short) 0, (short) 0, 24)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Time time = new Time();
        this.thisUpdate = time;
        time.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.expired()) {
            Asn1Tag peekTag2 = asn1BerDecodeBuffer.peekTag();
            if (peekTag2.equals((short) 0, (short) 0, 23) || peekTag2.equals((short) 0, (short) 0, 24)) {
                Time time2 = new Time();
                this.nextUpdate = time2;
                time2.decode(asn1BerDecodeBuffer, true, intHolder.value);
            }
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            _SeqOfTBSCertList_revokedCertificates_element _seqoftbscertlist_revokedcertificates_element = new _SeqOfTBSCertList_revokedCertificates_element();
            this.revokedCertificates = _seqoftbscertlist_revokedcertificates_element;
            _seqoftbscertlist_revokedcertificates_element.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            Extensions extensions = new Extensions();
            this.crlExtensions = extensions;
            extensions.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag3 = asn1BerDecodeBuffer.peekTag();
        if (peekTag3.equals((short) 0, (short) 0, 2) || peekTag3.equals((short) 0, (short) 32, 16) || peekTag3.equals((short) 128, (short) 32, 0)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Extensions extensions = this.crlExtensions;
        int i = 0;
        if (extensions != null) {
            int encode = extensions.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode) + encode;
        }
        _SeqOfTBSCertList_revokedCertificates_element _seqoftbscertlist_revokedcertificates_element = this.revokedCertificates;
        if (_seqoftbscertlist_revokedcertificates_element != null) {
            i += _seqoftbscertlist_revokedcertificates_element.encode(asn1BerEncodeBuffer, true);
        }
        Time time = this.nextUpdate;
        if (time != null) {
            i += time.encode(asn1BerEncodeBuffer, true);
        }
        int encode2 = this.signature.encode(asn1BerEncodeBuffer, true) + this.issuer.encode(asn1BerEncodeBuffer, true) + this.thisUpdate.encode(asn1BerEncodeBuffer, true) + i;
        Version version = this.version;
        if (version != null) {
            encode2 += version.encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.version = null;
        this.signature = null;
        this.issuer = null;
        this.thisUpdate = null;
        this.nextUpdate = null;
        this.revokedCertificates = null;
        this.crlExtensions = null;
    }

    public TBSCertList(Version version, AlgorithmIdentifier algorithmIdentifier, Name name, Time time, Time time2, _SeqOfTBSCertList_revokedCertificates_element _seqoftbscertlist_revokedcertificates_element, Extensions extensions) {
        this.version = version;
        this.signature = algorithmIdentifier;
        this.issuer = name;
        this.thisUpdate = time;
        this.nextUpdate = time2;
        this.revokedCertificates = _seqoftbscertlist_revokedcertificates_element;
        this.crlExtensions = extensions;
    }

    public TBSCertList(AlgorithmIdentifier algorithmIdentifier, Name name, Time time) {
        this.signature = algorithmIdentifier;
        this.issuer = name;
        this.thisUpdate = time;
    }

    public TBSCertList() {
    }
}
