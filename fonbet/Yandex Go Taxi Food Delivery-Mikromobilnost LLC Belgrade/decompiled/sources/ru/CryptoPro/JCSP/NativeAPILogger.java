package ru.CryptoPro.JCSP;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes4.dex */
public abstract class NativeAPILogger {
    private static Object a(Object obj) {
        StringBuilder sb;
        String hexString;
        String hexString2;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (bArr.length > 16) {
                byte[] copyOf = Arrays.copyOf(bArr, 8);
                sb = new StringBuilder();
                hexString2 = Array.toHexString(copyOf);
                sb.append(hexString2);
                sb.append("...");
            } else {
                sb = new StringBuilder();
                sb.append(bArr.length <= 1 ? HexString.STR_0x : "");
                hexString = Array.toHexString(bArr);
                sb.append(hexString);
            }
        } else {
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                if (iArr.length > 4) {
                    int[] copyOf2 = Arrays.copyOf(iArr, 4);
                    sb = new StringBuilder();
                    hexString2 = Array.toHexString(copyOf2);
                    sb.append(hexString2);
                    sb.append("...");
                } else {
                    sb = new StringBuilder();
                    sb.append(iArr.length <= 1 ? HexString.STR_0x : "");
                    hexString = Array.toHexString(iArr);
                }
            } else if (obj instanceof Integer) {
                sb = new StringBuilder(HexString.STR_0x);
                hexString = Integer.toHexString(((Integer) obj).intValue());
            } else {
                if (!(obj instanceof Long)) {
                    return obj;
                }
                sb = new StringBuilder(HexString.STR_0x);
                hexString = Long.toHexString(((Long) obj).longValue());
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static String a(String str, Object[] objArr, boolean z, long j, int i, String... strArr) {
        String str2;
        StringBuilder sb = new StringBuilder(Extension.O_BRAKE);
        int i2 = 0;
        for (Object obj : objArr) {
            sb.append(a(obj));
            if (i2 < objArr.length - 1) {
                sb.append(Extension.FIX_SPACE);
            }
            i2++;
        }
        sb.append(Extension.C_BRAKE);
        if (strArr != null && strArr.length > 0) {
            sb.append(" [");
            for (String str3 : strArr) {
                sb.append(str3);
            }
            sb.append("]");
        }
        if (z) {
            sb.append(" failed with error => 0x");
            str2 = Integer.toHexString(i);
        } else if (j != 0) {
            sb.append(" => 0x");
            str2 = Long.toHexString(j);
        } else {
            str2 = "...";
        }
        sb.append(str2);
        return sb.toString();
    }
}
