package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes10.dex */
public final class w5u implements u9e0 {
    public final jt1 a;
    public final mv60 b;
    public long c = 0;

    public w5u(jt1 jt1Var, mv60 mv60Var) {
        this.a = jt1Var;
        this.b = mv60Var;
    }

    @Override // defpackage.u9e0
    public final long a(f6w f6wVar, long j, LayoutDirection layoutDirection, long j2) {
        long a = this.b.a();
        if ((9223372034707292159L & a) == 9205357640488583168L) {
            a = this.c;
        }
        this.c = a;
        return z5w.c(z5w.c(f6wVar.c(), wwg.V(a)), this.a.a(j2, 0L, layoutDirection));
    }
}
