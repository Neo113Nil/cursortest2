package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes12.dex */
public final class r511 implements ig5 {
    public static final p511 Companion = new p511();
    public static final i3y[] d;
    public final String a;
    public final vm50 b;
    public final vm50 c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, a.b(lazyThreadSafetyMode, new z411(7)), a.b(lazyThreadSafetyMode, new z411(9))};
    }

    public /* synthetic */ r511(int i, String str, vm50 vm50Var, vm50 vm50Var2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, n511.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = vm50Var;
        this.c = vm50Var2;
    }
}
