package ru.cprocsp.ACSP.tools.common;

import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.w511;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;

/* loaded from: classes4.dex */
public class HexString {
    public static final char[] hex = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] HEX = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static byte decodeHexByte(String str) {
        char[] charArray = str.toCharArray();
        int hexDigit = getHexDigit(charArray[0]);
        if (hexDigit == -1) {
            w511.q();
            return (byte) 0;
        }
        int hexDigit2 = getHexDigit(charArray[1]);
        if (hexDigit2 != -1) {
            return (byte) ((hexDigit << 4) + hexDigit2);
        }
        w511.q();
        return (byte) 0;
    }

    public static byte[] decodeHexBytes(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 2;
            bArr[i] = decodeHexByte(str.substring(i2, i3));
            i++;
            i2 = i3;
        }
        return bArr;
    }

    public static int getHexDigit(char c) {
        if (c >= '0' && c <= '9') {
            return c - MoneyInputEditView.DEFAULT_VALUE;
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public static void toHex(byte[] bArr, int i, int i2, char[] cArr, int i3, boolean z) {
        if (cArr.length < (i2 * 2) + i3) {
            w511.q();
            return;
        }
        char[] cArr2 = z ? hex : HEX;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + 1;
            byte b = bArr[i4 + i];
            cArr[i3] = cArr2[(b & 240) >>> 4];
            i3 += 2;
            cArr[i5] = cArr2[b & PKIBody._CCP];
        }
    }

    public static String toHex(byte[] bArr, boolean z) {
        int length = bArr.length;
        char[] cArr = new char[length << 1];
        toHex(bArr, 0, length, cArr, 0, z);
        return new String(cArr);
    }

    public static String toHex(byte[] bArr) {
        return toHex(bArr, false);
    }
}
