package defpackage;

import io.flutter.plugins.videoplayer.PlatformVideoFormat;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class z8f {
    public final String a;
    public final PlatformVideoFormat b;
    public final Map c;
    public final String d;

    public z8f(String str, PlatformVideoFormat platformVideoFormat, Map map, String str2) {
        this.a = str;
        this.b = platformVideoFormat;
        this.c = map;
        this.d = str2;
    }

    public final List a() {
        return scc.g(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z8f)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return zkb1.b(a(), ((z8f) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "CreationOptions(uri=" + this.a + ", formatHint=" + this.b + ", httpHeaders=" + this.c + ", userAgent=" + this.d + Extension.C_BRAKE;
    }
}
