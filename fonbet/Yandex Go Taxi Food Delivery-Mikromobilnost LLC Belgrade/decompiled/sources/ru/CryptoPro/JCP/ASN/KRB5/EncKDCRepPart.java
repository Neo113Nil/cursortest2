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
public class EncKDCRepPart extends Asn1Type {
    public KerberosTime authtime;
    public HostAddresses caddr;
    public KerberosTime endtime;
    public TicketFlags flags;
    public EncryptionKey key;
    public KerberosTime key_expiration;
    public LastReq last_req;
    public Asn1Integer nonce;
    public KerberosTime renew_till;
    public PrincipalName sname;
    public Realm srealm;
    public KerberosTime starttime;

    public EncKDCRepPart(EncryptionKey encryptionKey, LastReq lastReq, long j, String str, TicketFlags ticketFlags, String str2, String str3, String str4, String str5, String str6, PrincipalName principalName, HostAddresses hostAddresses) {
        this.key = encryptionKey;
        this.last_req = lastReq;
        this.nonce = new Asn1Integer(j);
        this.key_expiration = new KerberosTime(str);
        this.flags = ticketFlags;
        this.authtime = new KerberosTime(str2);
        this.starttime = new KerberosTime(str3);
        this.endtime = new KerberosTime(str4);
        this.renew_till = new KerberosTime(str5);
        this.srealm = new Realm(str6);
        this.sname = principalName;
        this.caddr = hostAddresses;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        EncryptionKey encryptionKey = new EncryptionKey();
        this.key = encryptionKey;
        encryptionKey.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        LastReq lastReq = new LastReq();
        this.last_req = lastReq;
        lastReq.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer = new Asn1Integer();
        this.nonce = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            KerberosTime kerberosTime = new KerberosTime();
            this.key_expiration = kerberosTime;
            kerberosTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 4, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        TicketFlags ticketFlags = new TicketFlags();
        this.flags = ticketFlags;
        ticketFlags.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 5, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        KerberosTime kerberosTime2 = new KerberosTime();
        this.authtime = kerberosTime2;
        kerberosTime2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 6, intHolder, true)) {
            KerberosTime kerberosTime3 = new KerberosTime();
            this.starttime = kerberosTime3;
            kerberosTime3.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 7, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        KerberosTime kerberosTime4 = new KerberosTime();
        this.endtime = kerberosTime4;
        kerberosTime4.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 8, intHolder, true)) {
            KerberosTime kerberosTime5 = new KerberosTime();
            this.renew_till = kerberosTime5;
            kerberosTime5.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 9, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Realm realm = new Realm();
        this.srealm = realm;
        realm.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 10, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        PrincipalName principalName = new PrincipalName();
        this.sname = principalName;
        principalName.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 11, intHolder, true)) {
            HostAddresses hostAddresses = new HostAddresses();
            this.caddr = hostAddresses;
            hostAddresses.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3) || peekTag.equals((short) 128, (short) 32, 4) || peekTag.equals((short) 128, (short) 32, 5) || peekTag.equals((short) 128, (short) 32, 6) || peekTag.equals((short) 128, (short) 32, 7) || peekTag.equals((short) 128, (short) 32, 8) || peekTag.equals((short) 128, (short) 32, 9) || peekTag.equals((short) 128, (short) 32, 10) || peekTag.equals((short) 128, (short) 32, 11)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        HostAddresses hostAddresses = this.caddr;
        if (hostAddresses != null) {
            int encode = hostAddresses.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 11, encode) + encode;
        } else {
            i = 0;
        }
        int encode2 = this.sname.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 10, encode2) + i + encode2;
        int encode3 = this.srealm.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength2 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 9, encode3) + encodeTagAndLength + encode3;
        KerberosTime kerberosTime = this.renew_till;
        if (kerberosTime != null) {
            int encode4 = kerberosTime.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength2 = encodeTagAndLength2 + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 8, encode4);
        }
        int encode5 = this.endtime.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength3 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 7, encode5) + encodeTagAndLength2 + encode5;
        KerberosTime kerberosTime2 = this.starttime;
        if (kerberosTime2 != null) {
            int encode6 = kerberosTime2.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength3 = encodeTagAndLength3 + encode6 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 6, encode6);
        }
        int encode7 = this.authtime.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength4 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 5, encode7) + encodeTagAndLength3 + encode7;
        int encode8 = this.flags.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength5 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode8) + encodeTagAndLength4 + encode8;
        KerberosTime kerberosTime3 = this.key_expiration;
        if (kerberosTime3 != null) {
            int encode9 = kerberosTime3.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength5 = encodeTagAndLength5 + encode9 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode9);
        }
        int encode10 = this.nonce.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength6 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode10) + encodeTagAndLength5 + encode10;
        int encode11 = this.last_req.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength7 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode11) + encodeTagAndLength6 + encode11;
        int encode12 = this.key.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength8 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode12) + encodeTagAndLength7 + encode12;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength8) + encodeTagAndLength8 : encodeTagAndLength8;
    }

    public void init() {
        this.key = null;
        this.last_req = null;
        this.nonce = null;
        this.key_expiration = null;
        this.flags = null;
        this.authtime = null;
        this.starttime = null;
        this.endtime = null;
        this.renew_till = null;
        this.srealm = null;
        this.sname = null;
        this.caddr = null;
    }

    public EncKDCRepPart(EncryptionKey encryptionKey, LastReq lastReq, Asn1Integer asn1Integer, KerberosTime kerberosTime, TicketFlags ticketFlags, KerberosTime kerberosTime2, KerberosTime kerberosTime3, KerberosTime kerberosTime4, KerberosTime kerberosTime5, Realm realm, PrincipalName principalName, HostAddresses hostAddresses) {
        this.key = encryptionKey;
        this.last_req = lastReq;
        this.nonce = asn1Integer;
        this.key_expiration = kerberosTime;
        this.flags = ticketFlags;
        this.authtime = kerberosTime2;
        this.starttime = kerberosTime3;
        this.endtime = kerberosTime4;
        this.renew_till = kerberosTime5;
        this.srealm = realm;
        this.sname = principalName;
        this.caddr = hostAddresses;
    }

    public EncKDCRepPart(EncryptionKey encryptionKey, LastReq lastReq, Asn1Integer asn1Integer, TicketFlags ticketFlags, KerberosTime kerberosTime, KerberosTime kerberosTime2, Realm realm, PrincipalName principalName) {
        this.key = encryptionKey;
        this.last_req = lastReq;
        this.nonce = asn1Integer;
        this.flags = ticketFlags;
        this.authtime = kerberosTime;
        this.endtime = kerberosTime2;
        this.srealm = realm;
        this.sname = principalName;
    }

    public EncKDCRepPart() {
    }

    public EncKDCRepPart(EncryptionKey encryptionKey, LastReq lastReq, long j, TicketFlags ticketFlags, String str, String str2, String str3, PrincipalName principalName) {
        this.key = encryptionKey;
        this.last_req = lastReq;
        this.nonce = new Asn1Integer(j);
        this.flags = ticketFlags;
        this.authtime = new KerberosTime(str);
        this.endtime = new KerberosTime(str2);
        this.srealm = new Realm(str3);
        this.sname = principalName;
    }
}
