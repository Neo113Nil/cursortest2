package defpackage;

import com.yandex.go.preorder.navigation.c;

/* loaded from: classes13.dex */
public final class yqe0 implements gx30 {
    public final /* synthetic */ c a;
    public final /* synthetic */ k9s0 b;

    public yqe0(c cVar, k9s0 k9s0Var) {
        this.a = cVar;
        this.b = k9s0Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        bov0 bov0Var = this.b.e;
        c cVar = this.a;
        if (cVar.a0(bov0Var, null)) {
            return;
        }
        cVar.U();
    }

    @Override // defpackage.gx30
    public final void b(String str) {
        c.Q(this.a, str, this.b, "transport");
    }

    @Override // defpackage.gx30
    public final void e() {
        this.a.S(this.b);
    }
}
