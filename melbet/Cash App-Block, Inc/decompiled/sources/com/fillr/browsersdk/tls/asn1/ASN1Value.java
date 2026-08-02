package com.fillr.browsersdk.tls.asn1;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class ASN1Value {

    /* renamed from: type, reason: collision with root package name */
    public final ASN1Type f987type;

    public ASN1Value(ASN1Type aSN1Type) {
        this.f987type = aSN1Type;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ASN1Value)) {
            ASN1Value aSN1Value = (ASN1Value) obj;
            byte[] payload = getPayload();
            byte[] payload2 = aSN1Value.getPayload();
            if (this.f987type == aSN1Value.f987type && Arrays.equals(payload, payload2)) {
                return true;
            }
        }
        return false;
    }

    public abstract byte[] getPayload();

    public final int hashCode() {
        return Integer.valueOf(getPayload().length).hashCode() ^ this.f987type.hashCode();
    }

    public synchronized byte[] toBytes() {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] byteArray;
        try {
            byte[] payload = getPayload();
            int i = 0;
            if (payload == null) {
                payload = new byte[0];
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(this.f987type.tag);
            try {
                int length = payload.length;
                if (length < 128) {
                    byteArray = new byte[]{(byte) length};
                } else {
                    int i2 = length;
                    while (i2 >= 256) {
                        i2 >>>= 8;
                        i++;
                    }
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    byteArrayOutputStream2.write(128 | (i + 1));
                    while (i >= 0) {
                        byteArrayOutputStream2.write((length >> (i * 8)) & 255);
                        i--;
                    }
                    byteArray = byteArrayOutputStream2.toByteArray();
                }
                byteArrayOutputStream.write(byteArray);
                if (payload.length > 0) {
                    byteArrayOutputStream.write(payload);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
