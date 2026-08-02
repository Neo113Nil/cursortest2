package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class rly0 {
    public static final rly0 b = new rly0(0);
    public static final rly0 c = new rly0(1);
    public static final rly0 d = new rly0(2);
    public final int a;

    public rly0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rly0) {
            return this.a == ((rly0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return b64.p(new StringBuilder("TextDecoration["), rty.a(62, null, Extension.FIX_SPACE, arrayList), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
