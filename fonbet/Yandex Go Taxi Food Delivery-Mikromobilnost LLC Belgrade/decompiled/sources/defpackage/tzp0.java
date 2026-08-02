package defpackage;

import flex.engine.section.model.ReusePolicy;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes9.dex */
public final class tzp0 {
    public static final szp0 Companion = new szp0();
    public static final i3y[] c;
    public final pyp0 a;
    public final ReusePolicy b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new wrp0(7)), a.b(lazyThreadSafetyMode, new wrp0(8))};
    }

    public /* synthetic */ tzp0(int i, pyp0 pyp0Var, ReusePolicy reusePolicy) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, rzp0.a.getDescriptor());
            throw null;
        }
        this.a = pyp0Var;
        this.b = reusePolicy;
    }

    public tzp0(pyp0 pyp0Var, ReusePolicy reusePolicy) {
        this.a = pyp0Var;
        this.b = reusePolicy;
    }
}
