package defpackage;

import java.util.List;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class xde extends a {
    public final m8 b;
    public final int c;
    public final int d;

    public xde(m8 m8Var, int i, int i2) {
        this.b = m8Var;
        this.c = i;
        asq.x(i, i2, m8Var.size());
        this.d = i2 - i;
    }

    @Override // defpackage.w5
    public final int f() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        asq.v(i, this.d);
        return this.b.get(this.c + i);
    }

    @Override // kotlin.collections.a, java.util.List
    public final List subList(int i, int i2) {
        asq.x(i, i2, this.d);
        int i3 = this.c;
        return new xde(this.b, i + i3, i3 + i2);
    }
}
