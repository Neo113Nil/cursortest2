package defpackage;

import java.util.HashSet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public abstract class xc81 {
    public static final HashSet a = new HashSet();
    public static String b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (xc81.class) {
            if (a.add(str)) {
                b += Extension.FIX_SPACE + str;
            }
        }
    }
}
