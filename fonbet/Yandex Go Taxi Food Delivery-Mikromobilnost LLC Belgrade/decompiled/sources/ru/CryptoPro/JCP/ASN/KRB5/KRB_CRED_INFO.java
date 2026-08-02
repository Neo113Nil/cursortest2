package ru.CryptoPro.JCP.ASN.KRB5;

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
public class KRB_CRED_INFO extends Asn1Type {
    public KerberosTime authtime;
    public HostAddresses caddr;
    public KerberosTime endtime;
    public TicketFlags flags;
    public EncryptionKey key;
    public PrincipalName pname;
    public Realm prealm;
    public KerberosTime renew_till;
    public PrincipalName sname;
    public Realm srealm;
    public KerberosTime starttime;

    public KRB_CRED_INFO(EncryptionKey encryptionKey, String str, PrincipalName principalName, TicketFlags ticketFlags, String str2, String str3, String str4, String str5, String str6, PrincipalName principalName2, HostAddresses hostAddresses) {
        this.key = encryptionKey;
        this.prealm = new Realm(str);
        this.pname = principalName;
        this.flags = ticketFlags;
        this.authtime = new KerberosTime(str2);
        this.starttime = new KerberosTime(str3);
        this.endtime = new KerberosTime(str4);
        this.renew_till = new KerberosTime(str5);
        this.srealm = new Realm(str6);
        this.sname = principalName2;
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
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            Realm realm = new Realm();
            this.prealm = realm;
            realm.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            PrincipalName principalName = new PrincipalName();
            this.pname = principalName;
            principalName.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            TicketFlags ticketFlags = new TicketFlags();
            this.flags = ticketFlags;
            ticketFlags.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 4, intHolder, true)) {
            KerberosTime kerberosTime = new KerberosTime();
            this.authtime = kerberosTime;
            kerberosTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 5, intHolder, true)) {
            KerberosTime kerberosTime2 = new KerberosTime();
            this.starttime = kerberosTime2;
            kerberosTime2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 6, intHolder, true)) {
            KerberosTime kerberosTime3 = new KerberosTime();
            this.endtime = kerberosTime3;
            kerberosTime3.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 7, intHolder, true)) {
            KerberosTime kerberosTime4 = new KerberosTime();
            this.renew_till = kerberosTime4;
            kerberosTime4.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 8, intHolder, true)) {
            Realm realm2 = new Realm();
            this.srealm = realm2;
            realm2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 9, intHolder, true)) {
            PrincipalName principalName2 = new PrincipalName();
            this.sname = principalName2;
            principalName2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 10, intHolder, true)) {
            HostAddresses hostAddresses = new HostAddresses();
            this.caddr = hostAddresses;
            hostAddresses.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3) || peekTag.equals((short) 128, (short) 32, 4) || peekTag.equals((short) 128, (short) 32, 5) || peekTag.equals((short) 128, (short) 32, 6) || peekTag.equals((short) 128, (short) 32, 7) || peekTag.equals((short) 128, (short) 32, 8) || peekTag.equals((short) 128, (short) 32, 9) || peekTag.equals((short) 128, (short) 32, 10)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        HostAddresses hostAddresses = this.caddr;
        if (hostAddresses != null) {
            int encode = hostAddresses.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 10, encode) + encode;
        } else {
            i = 0;
        }
        PrincipalName principalName = this.sname;
        if (principalName != null) {
            int encode2 = principalName.encode(asn1BerEncodeBuffer, true);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 9, encode2);
        }
        Realm realm = this.srealm;
        if (realm != null) {
            int encode3 = realm.encode(asn1BerEncodeBuffer, true);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 8, encode3);
        }
        KerberosTime kerberosTime = this.renew_till;
        if (kerberosTime != null) {
            int encode4 = kerberosTime.encode(asn1BerEncodeBuffer, true);
            i = i + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 7, encode4);
        }
        KerberosTime kerberosTime2 = this.endtime;
        if (kerberosTime2 != null) {
            int encode5 = kerberosTime2.encode(asn1BerEncodeBuffer, true);
            i = i + encode5 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 6, encode5);
        }
        KerberosTime kerberosTime3 = this.starttime;
        if (kerberosTime3 != null) {
            int encode6 = kerberosTime3.encode(asn1BerEncodeBuffer, true);
            i = i + encode6 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 5, encode6);
        }
        KerberosTime kerberosTime4 = this.authtime;
        if (kerberosTime4 != null) {
            int encode7 = kerberosTime4.encode(asn1BerEncodeBuffer, true);
            i = i + encode7 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode7);
        }
        TicketFlags ticketFlags = this.flags;
        if (ticketFlags != null) {
            int encode8 = ticketFlags.encode(asn1BerEncodeBuffer, true);
            i = i + encode8 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode8);
        }
        PrincipalName principalName2 = this.pname;
        if (principalName2 != null) {
            int encode9 = principalName2.encode(asn1BerEncodeBuffer, true);
            i = i + encode9 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode9);
        }
        Realm realm2 = this.prealm;
        if (realm2 != null) {
            int encode10 = realm2.encode(asn1BerEncodeBuffer, true);
            i = i + encode10 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode10);
        }
        int encode11 = this.key.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode11) + i + encode11;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength) + encodeTagAndLength : encodeTagAndLength;
    }

    public void init() {
        this.key = null;
        this.prealm = null;
        this.pname = null;
        this.flags = null;
        this.authtime = null;
        this.starttime = null;
        this.endtime = null;
        this.renew_till = null;
        this.srealm = null;
        this.sname = null;
        this.caddr = null;
    }

    public KRB_CRED_INFO(EncryptionKey encryptionKey, Realm realm, PrincipalName principalName, TicketFlags ticketFlags, KerberosTime kerberosTime, KerberosTime kerberosTime2, KerberosTime kerberosTime3, KerberosTime kerberosTime4, Realm realm2, PrincipalName principalName2, HostAddresses hostAddresses) {
        this.key = encryptionKey;
        this.prealm = realm;
        this.pname = principalName;
        this.flags = ticketFlags;
        this.authtime = kerberosTime;
        this.starttime = kerberosTime2;
        this.endtime = kerberosTime3;
        this.renew_till = kerberosTime4;
        this.srealm = realm2;
        this.sname = principalName2;
        this.caddr = hostAddresses;
    }

    public KRB_CRED_INFO(EncryptionKey encryptionKey) {
        this.key = encryptionKey;
    }

    public KRB_CRED_INFO() {
    }
}
