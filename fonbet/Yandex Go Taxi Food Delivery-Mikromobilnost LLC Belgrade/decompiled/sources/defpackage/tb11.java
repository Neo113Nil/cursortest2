package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes12.dex */
public final class tb11 implements ig5 {
    public static final rb11 Companion = new rb11();
    public static final i3y[] d;
    public final List a;
    public final vm50 b;
    public final vm50 c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{a.b(lazyThreadSafetyMode, new z411(14)), a.b(lazyThreadSafetyMode, new z411(16)), a.b(lazyThreadSafetyMode, new z411(18))};
    }

    public /* synthetic */ tb11(int i, List list, vm50 vm50Var, vm50 vm50Var2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, pb11.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = vm50Var;
        this.c = vm50Var2;
    }
}
