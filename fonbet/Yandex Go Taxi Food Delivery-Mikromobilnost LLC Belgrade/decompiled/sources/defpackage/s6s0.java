package defpackage;

import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class s6s0 implements dw {
    public final f8v0 a;
    public final mfw0 b;
    public final u7r c;
    public final ogw0 w;
    public final lg21 x;
    public final swp0 y;
    public final String z;

    public s6s0(f8v0 f8v0Var, mfw0 mfw0Var, u7r u7rVar, ogw0 ogw0Var, lg21 lg21Var, swp0 swp0Var) {
        this.a = f8v0Var;
        this.b = mfw0Var;
        this.c = u7rVar;
        this.w = ogw0Var;
        this.x = lg21Var;
        this.y = swp0Var;
        this.z = swp0Var.a();
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        x5o x5oVar;
        if (!this.y.b || (x5oVar = this.a.j) == null) {
            this.b.a++;
            n6uVar.d.a(new kxl(new ywl(new dzp0(new czp0(false, new bzp0(null)), EmptyList.a, null, null, null, null), pfw0.INSTANCE, cnr0.b, new uwl(null, null, r6s0.INSTANCE, null, null, null), null, null)));
            return;
        }
        boolean equals = x5oVar.equals(ngd0.y);
        String str = this.z;
        u7r u7rVar = this.c;
        if (equals) {
            this.w.c.E.a("search screen fallback to taxi main");
            u7rVar.a(str, null);
        } else {
            if (!(x5oVar instanceof w5o)) {
                w511.b();
                return;
            }
            w5o w5oVar = (w5o) x5oVar;
            ((mg21) this.x).c(w5oVar.a());
            u7rVar.a(str, w5oVar.a());
        }
    }
}
