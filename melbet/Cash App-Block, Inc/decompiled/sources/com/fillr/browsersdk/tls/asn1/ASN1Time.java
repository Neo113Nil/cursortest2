package com.fillr.browsersdk.tls.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public final class ASN1Time extends ASN1Value {
    public final /* synthetic */ int $r8$classId = 1;
    public Serializable date;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ASN1Time() {
        super(ASN1Type.SET);
        Set set = Collections.EMPTY_SET;
        this.date = new HashSet(set);
        this.date = new LinkedHashSet();
    }

    @Override // com.fillr.browsersdk.tls.asn1.ASN1Value
    public final byte[] getPayload() {
        switch (this.$r8$classId) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                return simpleDateFormat.format((Date) this.date).getBytes();
            case 1:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterator it = ((HashSet) this.date).iterator();
                while (it.hasNext()) {
                    try {
                        byteArrayOutputStream.write(((ASN1Value) it.next()).toBytes());
                    } catch (IOException unused) {
                    }
                }
                return byteArrayOutputStream.toByteArray();
            default:
                byte[] byteArray = ((BigInteger) this.date).toByteArray();
                if ((byteArray[0] & 128) == 0) {
                    return byteArray;
                }
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                byteArrayOutputStream2.write(0);
                try {
                    byteArrayOutputStream2.write(byteArray);
                    return byteArrayOutputStream2.toByteArray();
                } catch (Exception unused2) {
                    return byteArray;
                }
        }
    }

    public ASN1Time(Date date) {
        super(ASN1Type.UTC_TIME);
        this.date = date;
    }

    public /* synthetic */ ASN1Time(ASN1Type aSN1Type) {
        super(aSN1Type);
    }
}
