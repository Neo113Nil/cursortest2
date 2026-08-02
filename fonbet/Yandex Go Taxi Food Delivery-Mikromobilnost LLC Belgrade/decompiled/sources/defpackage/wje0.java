package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class wje0 implements hle0 {
    public static final vje0 Companion = new vje0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(7))};
    public final String a;
    public final cje0 b;

    public /* synthetic */ wje0(int i, String str, cje0 cje0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, uje0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = cje0Var;
    }

    public final String a() {
        return this.a;
    }

    public final cje0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wje0)) {
            return false;
        }
        wje0 wje0Var = (wje0) obj;
        return jl40.l(this.a, wje0Var.a) && jl40.l(this.b, wje0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Contains(argName=" + this.a + ", value=" + this.b + ')';
    }

    public wje0(String str, cje0 cje0Var) {
        this.a = str;
        this.b = cje0Var;
    }
}
