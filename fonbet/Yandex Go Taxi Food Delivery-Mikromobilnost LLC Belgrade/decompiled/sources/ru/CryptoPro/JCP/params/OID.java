package ru.CryptoPro.JCP.params;

import ru.CryptoPro.JCP.tools.CPString;
import ru.CryptoPro.JCP.tools.Platform;

/* loaded from: classes4.dex */
public class OID {
    public final int[] value;

    public OID(String str) {
        String[] split = str.split(Platform.UNIX_POINT_SEPARATOR);
        int length = split.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = Integer.valueOf(split[i]).intValue();
        }
        this.value = iArr;
    }

    public static OID fromByteZ(byte[] bArr) {
        if (bArr != null) {
            return new OID(CPString.getString(bArr));
        }
        return null;
    }

    public boolean eq(int[] iArr) {
        if (iArr.length != this.value.length) {
            return false;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] != this.value[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        return (obj instanceof OID) && eq(((OID) obj).value);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public byte[] toByteZ() {
        return CPString.getArray(toString());
    }

    public String toString() {
        int[] iArr = this.value;
        StringBuffer stringBuffer = new StringBuffer(Integer.toString(iArr[0]));
        for (int i = 1; i < iArr.length; i++) {
            stringBuffer.append('.');
            stringBuffer.append(iArr[i]);
        }
        return stringBuffer.toString();
    }

    public OID(OID oid) {
        int[] iArr = new int[oid.value.length];
        this.value = iArr;
        int[] iArr2 = oid.value;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
    }

    public OID(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        this.value = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
    }
}
