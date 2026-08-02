package defpackage;

import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class v751 {
    public final List a;

    public v751(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !v751.class.equals(obj.getClass())) {
            return false;
        }
        return this.a.equals(((v751) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a.X(this.a, Extension.FIX_SPACE, "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
