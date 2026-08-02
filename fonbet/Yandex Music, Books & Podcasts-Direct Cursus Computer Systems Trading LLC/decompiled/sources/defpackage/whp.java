package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import kotlin.text.a;
import ru.kinopoisk.network.cookiejar.SerializableCookie;
import ru.kinopoisk.sdk.easylogin.internal.C1131m2;
import ru.kinopoisk.sdk.easylogin.internal.C1145n2;
import ru.kinopoisk.sdk.easylogin.internal.M7;

/* loaded from: classes5.dex */
public final class whp {
    public static ek6 a(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new C1131m2("Input length is not even");
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            Integer b = a.b(str.charAt(i));
            if (b == null) {
                throw new C1131m2("Invalid input at " + i + ": \"" + str.charAt(i) + "\"");
            }
            int intValue = b.intValue();
            int i2 = i + 1;
            Integer b2 = a.b(str.charAt(i2));
            if (b2 == null) {
                throw new C1131m2("Invalid input at " + i2 + ": \"" + str.charAt(i2) + "\"");
            }
            bArr[i / 2] = (byte) ((intValue << 4) + b2.intValue());
        }
        try {
            Object readObject = new M7(new ByteArrayInputStream(bArr)).readObject();
            readObject.getClass();
            ek6 cookie = ((SerializableCookie) readObject).getCookie();
            if (cookie != null) {
                return cookie;
            }
            throw new C1131m2("Unexpected null");
        } catch (Exception e) {
            throw new C1131m2(e);
        }
    }

    public static String b(ek6 ek6Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(new SerializableCookie(ek6Var, null));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            StringBuilder sb = new StringBuilder(byteArray.length * 2);
            for (byte b : byteArray) {
                int i = b & 255;
                if (i < 16) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (Exception e) {
            throw new C1145n2(e);
        }
    }
}
