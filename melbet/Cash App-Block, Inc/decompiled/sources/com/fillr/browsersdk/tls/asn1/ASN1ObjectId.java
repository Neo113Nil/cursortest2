package com.fillr.browsersdk.tls.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class ASN1ObjectId extends ASN1Value {
    public static final int[] COMMON_NAME = {2, 5, 4, 3};
    public static final int[] ORGANIZATIONAL_UNIT = {2, 5, 4, 11};
    public static final int[] SHA256_WITH_RSA = {1, 2, 840, 113549, 1, 1, 11};
    public final /* synthetic */ int $r8$classId = 1;
    public final ArrayList valueChain;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ASN1ObjectId(int[] iArr) {
        super(ASN1Type.OBJECT_IDENTIFIER);
        List list = Collections.EMPTY_LIST;
        this.valueChain = new ArrayList(list);
        for (int i : iArr) {
            this.valueChain.add(Integer.valueOf(i));
        }
    }

    public void addValue(ASN1Value aSN1Value) {
        if (aSN1Value == null) {
            return;
        }
        this.valueChain.add(aSN1Value);
    }

    @Override // com.fillr.browsersdk.tls.asn1.ASN1Value
    public byte[] getPayload() {
        int i = this.$r8$classId;
        ArrayList arrayList = this.valueChain;
        switch (i) {
            case 0:
                if (arrayList == null || arrayList.size() < 2) {
                    return new byte[0];
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(((Integer) arrayList.get(1)).intValue() + (((Integer) arrayList.get(0)).intValue() * 40));
                if (arrayList.size() > 2) {
                    Iterator it = arrayList.subList(2, arrayList.size()).iterator();
                    while (it.hasNext()) {
                        long intValue = ((Integer) it.next()).intValue();
                        byte[] bArr = new byte[9];
                        int i2 = 8;
                        bArr[8] = (byte) (((int) intValue) & 127);
                        while (intValue >= 128) {
                            intValue >>= 7;
                            i2--;
                            bArr[i2] = (byte) ((((int) intValue) & 127) | 128);
                        }
                        byteArrayOutputStream.write(bArr, i2, 9 - i2);
                    }
                }
                return byteArrayOutputStream.toByteArray();
            default:
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    try {
                        byteArrayOutputStream2.write(((ASN1Value) it2.next()).toBytes());
                    } catch (IOException unused) {
                    }
                }
                return byteArrayOutputStream2.toByteArray();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ASN1ObjectId() {
        super(ASN1Type.SEQUENCE);
        List list = Collections.EMPTY_LIST;
        this.valueChain = new ArrayList(list);
    }
}
