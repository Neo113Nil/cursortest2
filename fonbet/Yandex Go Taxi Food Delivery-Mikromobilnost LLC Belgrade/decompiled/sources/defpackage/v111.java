package defpackage;

import android.util.Base64;
import com.google.android.datatransport.Priority;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public abstract class v111 {

    public static abstract class a {
    }

    public static a94 a() {
        a94 a94Var = new a94();
        a94Var.b(Priority.DEFAULT);
        return a94Var;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract Priority d();

    public final v111 e(Priority priority) {
        a94 a2 = a();
        String b = b();
        if (b == null) {
            ny61.t("Null backendName");
            return null;
        }
        a2.a = b;
        a2.b(priority);
        a2.b = c();
        return a2.a();
    }

    public final String toString() {
        String b = b();
        Priority d = d();
        String encodeToString = c() == null ? "" : Base64.encodeToString(c(), 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(b);
        sb.append(Extension.FIX_SPACE);
        sb.append(d);
        sb.append(Extension.FIX_SPACE);
        return oyr.t(sb, encodeToString, Extension.C_BRAKE);
    }
}
