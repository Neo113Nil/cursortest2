package defpackage;

import android.os.Build;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class tj21 {
    public final rs2 a;
    public final uj21 b;

    public tj21(rs2 rs2Var, uj21 uj21Var) {
        this.a = rs2Var;
        this.b = uj21Var;
    }

    public final String a() {
        this.b.getClass();
        return b();
    }

    public final String b() {
        String p = g8e.p(Build.MANUFACTURER, Extension.SEMICOLON_SPACE, Build.MODEL);
        this.a.getClass();
        return tje.d0(String.format("%s/%s.%s Android/%s (%s)", Arrays.copyOf(new Object[]{"yandex-taxi", "5.89.0", "128354", Build.VERSION.RELEASE, p}, 5)));
    }
}
