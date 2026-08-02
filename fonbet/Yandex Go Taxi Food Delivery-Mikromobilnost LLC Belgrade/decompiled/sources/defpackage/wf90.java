package defpackage;

import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class wf90 {
    public final List a;
    public final List b;

    public wf90(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(a.X(this.a, Extension.FIX_SPACE, null, null, null, 62));
        sb.append('(');
        return b64.p(sb, a.X(this.b, ";", null, null, null, 62), ')');
    }
}
