package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class p6x extends r3x implements Serializable {
    public static final p6x b;
    public static final p6x c;
    public final transient i6x a;

    static {
        e6x e6xVar = i6x.b;
        b = new p6x(p7x.e);
        Object[] objArr = {o7x.c};
        for (int i = 0; i < 1; i++) {
            if (objArr[i] == null) {
                jj4.j(k5r.i(i, "at index "));
                return;
            }
        }
        c = new p6x(i6x.u(1, objArr));
    }

    public p6x(i6x i6xVar) {
        this.a = i6xVar;
    }

    @Override // defpackage.r3x
    public final /* bridge */ /* synthetic */ u6x a() {
        i6x i6xVar = this.a;
        return i6xVar.isEmpty() ? v7x.i : new w7x(i6xVar, m7x.c);
    }
}
