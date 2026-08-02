package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes4.dex */
public abstract class m3w {
    public static final ArrayList a;
    public static final jyr b;

    static {
        long h = c3x.h(4283387727L);
        Pair pair = new Pair(Integer.valueOf(c3x.U(h)), Float.valueOf(0.0f));
        Integer valueOf = Integer.valueOf(c3x.U(ixf.G(h)));
        Float valueOf2 = Float.valueOf(40.0f);
        a = fgq.u(pair, new Pair(valueOf, valueOf2), new Pair(Integer.valueOf(c3x.U(h)), valueOf2));
        b = btf.b(new nxv(8));
    }

    public static final List a(List list, hq5 hq5Var) {
        return asq.I((Configuration) ((oq5) hq5Var).j(AndroidCompositionLocals_androidKt.a)) ? (List) b.getValue() : list == null ? a : list;
    }
}
