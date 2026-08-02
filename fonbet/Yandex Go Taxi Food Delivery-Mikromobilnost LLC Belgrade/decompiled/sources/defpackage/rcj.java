package defpackage;

import android.content.Context;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Map;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public abstract class rcj {
    public static Context a;
    public static final i3y b = a.a(new xyi(4));
    public static final i3y c = a.a(new xyi(5));

    public static void a(String str) {
        try {
            i3y i3yVar = c;
            ((BufferedWriter) i3yVar.getValue()).append((CharSequence) yzn.a(str));
            ((BufferedWriter) i3yVar.getValue()).newLine();
        } catch (IOException unused) {
            jst.e.getClass();
        }
    }

    public static void b(String str, String str2) {
        if (((cne0) b.getValue()).f("FIELD_DIAGNOSTIC_MODE_ENABLED")) {
            a(str + Extension.COLON_SPACE + str2);
        }
    }

    public static void c(String str, Map map) {
        if (((cne0) b.getValue()).f("FIELD_DIAGNOSTIC_MODE_ENABLED") && map != null) {
            for (Map.Entry entry : map.entrySet()) {
                a(str + " " + entry.getKey() + Extension.COLON_SPACE + entry.getValue());
            }
        }
    }
}
