package ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.Asn1UTCTime;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Name;

/* loaded from: classes4.dex */
public class CrlIdentifier extends Asn1Type {
    public Asn1UTCTime crlIssuedTime;
    public Asn1Integer crlNumber;
    public Name crlissuer;

    public CrlIdentifier(Name name, String str, long j) {
        this.crlissuer = name;
        this.crlIssuedTime = new Asn1UTCTime(str);
        this.crlNumber = new Asn1Integer(j);
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
        Name name = new Name();
        this.crlissuer = name;
        name.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 23, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1UTCTime asn1UTCTime = new Asn1UTCTime(true);
        this.crlIssuedTime = asn1UTCTime;
        asn1UTCTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            Asn1Integer asn1Integer = new Asn1Integer();
            this.crlNumber = asn1Integer;
            asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 23) || peekTag.equals((short) 0, (short) 0, 2)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Asn1Integer asn1Integer = this.crlNumber;
        int encode = this.crlissuer.encode(asn1BerEncodeBuffer, true) + this.crlIssuedTime.encode(asn1BerEncodeBuffer, true) + (asn1Integer != null ? asn1Integer.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.crlissuer = null;
        this.crlIssuedTime = null;
        this.crlNumber = null;
    }

    public CrlIdentifier(Name name, Asn1UTCTime asn1UTCTime, Asn1Integer asn1Integer) {
        this.crlissuer = name;
        this.crlIssuedTime = asn1UTCTime;
        this.crlNumber = asn1Integer;
    }

    public CrlIdentifier(Name name, Asn1UTCTime asn1UTCTime) {
        this.crlissuer = name;
        this.crlIssuedTime = asn1UTCTime;
    }

    public CrlIdentifier() {
    }

    public CrlIdentifier(Name name, String str) {
        this.crlissuer = name;
        this.crlIssuedTime = new Asn1UTCTime(str);
    }
}
