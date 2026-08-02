package defpackage;

import com.yandex.go.payments.cards.nfc.enums.CountryCodeEnum;
import com.yandex.go.payments.cards.nfc.enums.CurrencyEnum;
import com.yandex.go.payments.cards.nfc.enums.TransactionTypeEnum;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes2.dex */
public abstract class vxn {
    public static final SecureRandom a = new SecureRandom();

    public static byte[] a(o6x0 o6x0Var) {
        byte[] bArr;
        int i = o6x0Var.b;
        byte[] bArr2 = new byte[i];
        s6x0 s6x0Var = o6x0Var.a;
        if (s6x0Var.equals(txn.r)) {
            byte[] bArr3 = new pgy0().a;
            byte f = ddb1.f(bArr3[0], 5);
            bArr3[0] = f;
            bArr3[0] = ddb1.f(f, 3);
            bArr = Arrays.copyOf(bArr3, bArr3.length);
        } else if (s6x0Var.equals(txn.l)) {
            bArr = ddb1.b(b(i * 2, String.valueOf(CountryCodeEnum.FR.getNumeric()), "0"));
        } else if (s6x0Var.equals(txn.j)) {
            bArr = ddb1.b(b(i * 2, String.valueOf(CurrencyEnum.EUR.getNumeric()), "0"));
        } else if (s6x0Var.equals(txn.h)) {
            bArr = ddb1.b(new SimpleDateFormat("yyMMdd", Locale.getDefault()).format(new Date()));
        } else if (s6x0Var.equals(txn.i)) {
            bArr = new byte[]{(byte) TransactionTypeEnum.PURCHASE.getValue()};
        } else if (s6x0Var.equals(txn.k)) {
            bArr = ddb1.b("00");
        } else if (s6x0Var.equals(txn.n)) {
            bArr = new byte[]{34};
        } else if (s6x0Var.equals(txn.m)) {
            bArr = new byte[]{-32, -96, 0};
        } else if (s6x0Var.equals(txn.q)) {
            bArr = new byte[]{-114, 0, -80, Alerts.alert_internal_error, 5};
        } else if (s6x0Var.equals(txn.u)) {
            bArr = ddb1.b("7345123215904501");
        } else {
            if (s6x0Var.equals(txn.o)) {
                a.nextBytes(bArr2);
            }
            bArr = null;
        }
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
        }
        return bArr2;
    }

    public static String b(int i, String str, String str2) {
        String str3;
        if (str2 == null || str2.length() == 0) {
            str2 = " ";
        }
        int length = str2.length();
        int length2 = i - str.length();
        if (length2 > 0) {
            if (length != 1 || length2 > 8192) {
                if (length2 == length) {
                    return str2.concat(str);
                }
                if (length2 < length) {
                    return str2.substring(0, length2).concat(str);
                }
                char[] cArr = new char[length2];
                char[] charArray = str2.toCharArray();
                for (int i2 = 0; i2 < length2; i2++) {
                    cArr[i2] = charArray[i2 % length];
                }
                return new String(cArr).concat(str);
            }
            char charAt = str2.charAt(0);
            int length3 = i - str.length();
            if (length3 > 0) {
                if (length3 > 8192) {
                    return b(i, str, String.valueOf(charAt));
                }
                if (length3 <= 0) {
                    str3 = "";
                } else {
                    char[] cArr2 = new char[length3];
                    for (int i3 = length3 - 1; -1 < i3; i3--) {
                        cArr2[i3] = charAt;
                    }
                    str3 = new String(cArr2);
                }
                return str3.concat(str);
            }
        }
        return str;
    }
}
