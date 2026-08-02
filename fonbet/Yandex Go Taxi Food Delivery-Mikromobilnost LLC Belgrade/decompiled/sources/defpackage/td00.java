package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes10.dex */
public final class td00 implements u9e0 {
    public final z3e a;
    public k6w b;
    public LayoutDirection c;
    public k6w w;
    public z5w x;

    public td00(z3e z3eVar) {
        this.a = z3eVar;
    }

    @Override // defpackage.u9e0
    public final long a(f6w f6wVar, long j, LayoutDirection layoutDirection, long j2) {
        z5w z5wVar = this.x;
        if (z5wVar != null) {
            k6w k6wVar = this.b;
            if ((k6wVar == null ? false : k6w.a(k6wVar.a, j)) && this.c == layoutDirection) {
                k6w k6wVar2 = this.w;
                if (k6wVar2 != null ? k6w.a(k6wVar2.a, j2) : false) {
                    return z5wVar.a;
                }
            }
        }
        long a = this.a.a(f6wVar, j, layoutDirection, j2);
        this.b = new k6w(j);
        this.c = layoutDirection;
        this.w = new k6w(j2);
        this.x = new z5w(a);
        return a;
    }
}
