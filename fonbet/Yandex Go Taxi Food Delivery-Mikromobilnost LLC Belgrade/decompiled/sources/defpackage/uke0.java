package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class uke0 implements hle0 {
    public static final tke0 Companion = new tke0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(14))};
    public final hle0 a;

    public /* synthetic */ uke0(int i, hle0 hle0Var) {
        if (1 == (i & 1)) {
            this.a = hle0Var;
        } else {
            qje.Z(i, 1, ske0.a.getDescriptor());
            throw null;
        }
    }

    public final hle0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uke0) && jl40.l(this.a, ((uke0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Not(predicate=" + this.a + ')';
    }

    public uke0(hle0 hle0Var) {
        this.a = hle0Var;
    }
}
