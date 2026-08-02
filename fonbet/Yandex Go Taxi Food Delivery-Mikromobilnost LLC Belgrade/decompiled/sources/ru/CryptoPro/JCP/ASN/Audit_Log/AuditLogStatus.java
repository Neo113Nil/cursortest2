package ru.CryptoPro.JCP.ASN.Audit_Log;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import java.io.IOException;

/* loaded from: classes4.dex */
public class AuditLogStatus extends Asn1Integer {
    public static final int corrupted = 1;
    public static final int corrupted_signedByOther = 4;
    public static final int emergency = 2;
    public static final int emergency_signedByOther = 5;
    public static final int normal = 0;
    public static final int normal_signedByOther = 6;
    public static final int suspicious = 3;

    public AuditLogStatus() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1Integer, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        super.decode(asn1BerDecodeBuffer, z, i);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Integer, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        return super.encode(asn1BerEncodeBuffer, z);
    }

    public AuditLogStatus(long j) {
        super(j);
    }
}
