package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes5.dex */
public final class y8a0 {
    public static final x8a0 Companion = new x8a0();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new t7a0(3)), null};
    public final List a;
    public final d4a0 b;

    public /* synthetic */ y8a0(int i, List list, d4a0 d4a0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, w8a0.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = d4a0Var;
    }

    public y8a0(List list, d4a0 d4a0Var) {
        this.a = list;
        this.b = d4a0Var;
    }
}
