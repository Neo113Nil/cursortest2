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
public class EncTicketPart extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(64, 32, 3);
    public AuthorizationData authorization_data;
    public KerberosTime authtime;
    public HostAddresses caddr;
    public PrincipalName cname;
    public Realm crealm;
    public KerberosTime endtime;
    public TicketFlags flags;
    public EncryptionKey key;
    public KerberosTime renew_till;
    public KerberosTime starttime;
    public TransitedEncoding transited;

    public EncTicketPart(TicketFlags ticketFlags, EncryptionKey encryptionKey, String str, PrincipalName principalName, TransitedEncoding transitedEncoding, String str2, String str3, String str4, String str5, HostAddresses hostAddresses, AuthorizationData authorizationData) {
        this.flags = ticketFlags;
        this.key = encryptionKey;
        this.crealm = new Realm(str);
        this.cname = principalName;
        this.transited = transitedEncoding;
        this.authtime = new KerberosTime(str2);
        this.starttime = new KerberosTime(str3);
        this.endtime = new KerberosTime(str4);
        this.renew_till = new KerberosTime(str5);
        this.caddr = hostAddresses;
        this.authorization_data = authorizationData;
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
        TicketFlags ticketFlags = new TicketFlags();
        this.flags = ticketFlags;
        ticketFlags.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        EncryptionKey encryptionKey = new EncryptionKey();
        this.key = encryptionKey;
        encryptionKey.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Realm realm = new Realm();
        this.crealm = realm;
        realm.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        PrincipalName principalName = new PrincipalName();
        this.cname = principalName;
        principalName.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 4, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        TransitedEncoding transitedEncoding = new TransitedEncoding();
        this.transited = transitedEncoding;
        transitedEncoding.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 5, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        KerberosTime kerberosTime = new KerberosTime();
        this.authtime = kerberosTime;
        kerberosTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 6, intHolder, true)) {
            KerberosTime kerberosTime2 = new KerberosTime();
            this.starttime = kerberosTime2;
            kerberosTime2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 7, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        KerberosTime kerberosTime3 = new KerberosTime();
        this.endtime = kerberosTime3;
        kerberosTime3.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 8, intHolder, true)) {
            KerberosTime kerberosTime4 = new KerberosTime();
            this.renew_till = kerberosTime4;
            kerberosTime4.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 9, intHolder, true)) {
            HostAddresses hostAddresses = new HostAddresses();
            this.caddr = hostAddresses;
            hostAddresses.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 10, intHolder, true)) {
            AuthorizationData authorizationData = new AuthorizationData();
            this.authorization_data = authorizationData;
            authorizationData.decode(asn1BerDecodeBuffer, true, intHolder.value);
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
        AuthorizationData authorizationData = this.authorization_data;
        if (authorizationData != null) {
            int encode = authorizationData.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 10, encode) + encode;
        } else {
            i = 0;
        }
        HostAddresses hostAddresses = this.caddr;
        if (hostAddresses != null) {
            int encode2 = hostAddresses.encode(asn1BerEncodeBuffer, true);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 9, encode2);
        }
        KerberosTime kerberosTime = this.renew_till;
        if (kerberosTime != null) {
            int encode3 = kerberosTime.encode(asn1BerEncodeBuffer, true);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 8, encode3);
        }
        int encode4 = this.endtime.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 7, encode4) + i + encode4;
        KerberosTime kerberosTime2 = this.starttime;
        if (kerberosTime2 != null) {
            int encode5 = kerberosTime2.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength = encodeTagAndLength + encode5 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 6, encode5);
        }
        int encode6 = this.authtime.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength2 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 5, encode6) + encodeTagAndLength + encode6;
        int encode7 = this.transited.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength3 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode7) + encodeTagAndLength2 + encode7;
        int encode8 = this.cname.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength4 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode8) + encodeTagAndLength3 + encode8;
        int encode9 = this.crealm.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength5 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode9) + encodeTagAndLength4 + encode9;
        int encode10 = this.key.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength6 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode10) + encodeTagAndLength5 + encode10;
        int encode11 = this.flags.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength7 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode11) + encodeTagAndLength6 + encode11;
        int encodeTagAndLength8 = asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength7) + encodeTagAndLength7;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encodeTagAndLength8) + encodeTagAndLength8 : encodeTagAndLength8;
    }

    public void init() {
        this.flags = null;
        this.key = null;
        this.crealm = null;
        this.cname = null;
        this.transited = null;
        this.authtime = null;
        this.starttime = null;
        this.endtime = null;
        this.renew_till = null;
        this.caddr = null;
        this.authorization_data = null;
    }

    public EncTicketPart(TicketFlags ticketFlags, EncryptionKey encryptionKey, Realm realm, PrincipalName principalName, TransitedEncoding transitedEncoding, KerberosTime kerberosTime, KerberosTime kerberosTime2, KerberosTime kerberosTime3, KerberosTime kerberosTime4, HostAddresses hostAddresses, AuthorizationData authorizationData) {
        this.flags = ticketFlags;
        this.key = encryptionKey;
        this.crealm = realm;
        this.cname = principalName;
        this.transited = transitedEncoding;
        this.authtime = kerberosTime;
        this.starttime = kerberosTime2;
        this.endtime = kerberosTime3;
        this.renew_till = kerberosTime4;
        this.caddr = hostAddresses;
        this.authorization_data = authorizationData;
    }

    public EncTicketPart(TicketFlags ticketFlags, EncryptionKey encryptionKey, Realm realm, PrincipalName principalName, TransitedEncoding transitedEncoding, KerberosTime kerberosTime, KerberosTime kerberosTime2) {
        this.flags = ticketFlags;
        this.key = encryptionKey;
        this.crealm = realm;
        this.cname = principalName;
        this.transited = transitedEncoding;
        this.authtime = kerberosTime;
        this.endtime = kerberosTime2;
    }

    public EncTicketPart() {
    }

    public EncTicketPart(TicketFlags ticketFlags, EncryptionKey encryptionKey, String str, PrincipalName principalName, TransitedEncoding transitedEncoding, String str2, String str3) {
        this.flags = ticketFlags;
        this.key = encryptionKey;
        this.crealm = new Realm(str);
        this.cname = principalName;
        this.transited = transitedEncoding;
        this.authtime = new KerberosTime(str2);
        this.endtime = new KerberosTime(str3);
    }
}
