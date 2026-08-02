package defpackage;

import android.util.Base64;
import java.nio.charset.Charset;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import kotlin.a;
import ru.CryptoPro.JCSP.JCSP;

/* loaded from: classes4.dex */
public abstract class yzn {
    public static final i3y a = a.a(new fgn(21));

    public static String a(String str) {
        Cipher cipher = Cipher.getInstance(JCSP.AES_NAME);
        cipher.init(1, (SecretKey) a.getValue());
        Charset charset = uza.a;
        return new String(Base64.encode(cipher.doFinal(str.getBytes(charset)), 2), charset);
    }
}
