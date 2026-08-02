package yads;

import defpackage.gb81;

/* loaded from: classes7.dex */
public final class x3 extends jk3 {
    public static final /* synthetic */ int a = 0;
    public final d4 c;

    public x3(d4 d4Var) {
        super((gb81) null);
        this.c = d4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return x3.class.equals(obj != null ? obj.getClass() : null) && this.c == ((x3) obj).c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public x3(d4 d4Var, gb81 gb81Var) {
        super(gb81Var);
        this.c = d4Var;
    }
}
