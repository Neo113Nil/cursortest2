package defpackage;

import java.util.List;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public abstract class tfe {
    public static final Regex a = new Regex("\\d+([,.]\\d+)?");

    public static final String a(String str, wls wlsVar, tls tlsVar) {
        List W;
        if (str == null || str.length() == 0) {
            return "";
        }
        w610 b = a.b(str);
        Integer num = null;
        if (b != null) {
            W = evu0.W(b.a.group(), new String[]{",", Extension.DOT_CHAR}, (r2 & 4) != 0 ? 0 : 2);
            if (!W.isEmpty() && W.size() <= 2 && W.size() == 1) {
                num = bvu0.l(10, (String) W.get(0));
            }
        }
        return num != null ? (String) wlsVar.invoke(num, str) : (String) tlsVar.invoke(str);
    }
}
