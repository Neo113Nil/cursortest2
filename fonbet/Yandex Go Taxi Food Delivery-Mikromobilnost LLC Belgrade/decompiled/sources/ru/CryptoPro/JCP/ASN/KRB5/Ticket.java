package ru.CryptoPro.JCP.ASN.KRB5;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class Ticket extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(64, 32, 1);
    public EncryptedData enc_part;
    public Realm realm;
    public PrincipalName sname;
    public Asn1Integer tkt_vno;

    public Ticket(long j, String str, PrincipalName principalName, EncryptedData encryptedData) {
        this.tkt_vno = new Asn1Integer(j);
        this.realm = new Realm(str);
        this.sname = principalName;
        this.enc_part = encryptedData;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            matchTag(asn1BerDecodeBuffer, TAG);
        }
        int matchTag = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, matchTag);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer = new Asn1Integer();
        this.tkt_vno = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Realm realm = new Realm();
        this.realm = realm;
        realm.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        PrincipalName principalName = new PrincipalName();
        this.sname = principalName;
        principalName.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        EncryptedData encryptedData = new EncryptedData();
        this.enc_part = encryptedData;
        encryptedData.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.enc_part.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode) + encode;
        int encode2 = this.sname.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength2 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode2) + encodeTagAndLength + encode2;
        int encode3 = this.realm.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength3 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode3) + encodeTagAndLength2 + encode3;
        int encode4 = this.tkt_vno.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength4 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode4) + encodeTagAndLength3 + encode4;
        int encodeTagAndLength5 = asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength4) + encodeTagAndLength4;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encodeTagAndLength5) + encodeTagAndLength5 : encodeTagAndLength5;
    }

    public void init() {
        this.tkt_vno = null;
        this.realm = null;
        this.sname = null;
        this.enc_part = null;
    }

    public Ticket(Asn1Integer asn1Integer, Realm realm, PrincipalName principalName, EncryptedData encryptedData) {
        this.tkt_vno = asn1Integer;
        this.realm = realm;
        this.sname = principalName;
        this.enc_part = encryptedData;
    }

    public Ticket() {
    }
}
