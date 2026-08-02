package defpackage;

import androidx.compose.foundation.lazy.b;

/* loaded from: classes10.dex */
public final class q6y extends v5y {
    public final o6y b;
    public final t5y c;
    public final long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ t5y f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ it1 i;
    public final /* synthetic */ to5 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;
    public final /* synthetic */ b n;

    public q6y(long j, boolean z, o6y o6yVar, t5y t5yVar, int i, int i2, it1 it1Var, to5 to5Var, int i3, int i4, long j2, b bVar) {
        this.e = z;
        this.f = t5yVar;
        this.g = i;
        this.h = i2;
        this.i = it1Var;
        this.j = to5Var;
        this.k = i3;
        this.l = i4;
        this.m = j2;
        this.n = bVar;
        this.b = o6yVar;
        this.c = t5yVar;
        this.d = p8e.b(0, z ? n8e.i(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : n8e.h(j), 5);
    }

    @Override // defpackage.v5y
    public final u5y a(int i, int i2, long j, int i3) {
        return c(i, j);
    }

    public final t6y c(int i, long j) {
        o6y o6yVar = this.b;
        Object c = o6yVar.c(i);
        Object c2 = o6yVar.b.c(i);
        return new t6y(i, b(this.c, i, j), this.e, this.i, this.j, this.f.b.getLayoutDirection(), this.k, this.l, i == this.g + (-1) ? 0 : this.h, this.m, c, c2, this.n.o, j);
    }
}
