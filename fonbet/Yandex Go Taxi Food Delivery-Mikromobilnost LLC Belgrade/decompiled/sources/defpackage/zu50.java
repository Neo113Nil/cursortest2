package defpackage;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class zu50 {
    public static final zu50 b = new wu50().b();
    public final Map a;

    public zu50(Map map) {
        this.a = map;
    }

    public final String a(String str) {
        List list = (List) this.a.get(str.toLowerCase(Locale.ROOT));
        if (list != null) {
            return (String) a.b0(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zu50) && this.a.equals(((zu50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("NetworkHeaders(data=", Extension.C_BRAKE, this.a);
    }
}
