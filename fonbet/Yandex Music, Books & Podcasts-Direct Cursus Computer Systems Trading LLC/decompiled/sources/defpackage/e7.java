package defpackage;

import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.a;

/* loaded from: classes5.dex */
public final class e7 extends a implements RandomAccess {
    public final a b;
    public final int c;
    public final int d;

    public e7(a aVar, int i, int i2) {
        this.b = aVar;
        this.c = i;
        b7 b7Var = a.a;
        int f = aVar.f();
        b7Var.getClass();
        b7.d(i, i2, f);
        this.d = i2 - i;
    }

    @Override // defpackage.w5
    public final int f() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a.a.getClass();
        b7.b(i, this.d);
        return this.b.get(this.c + i);
    }

    @Override // kotlin.collections.a, java.util.List
    public final List subList(int i, int i2) {
        a.a.getClass();
        b7.d(i, i2, this.d);
        int i3 = this.c;
        return new e7(this.b, i + i3, i3 + i2);
    }
}
