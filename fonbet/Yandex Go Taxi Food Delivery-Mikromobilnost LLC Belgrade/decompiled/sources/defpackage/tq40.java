package defpackage;

import ru.yandex.taxi.preorder.source.ModalViewOrigin;

/* loaded from: classes6.dex */
public final class tq40 implements pq40 {
    public final /* synthetic */ uq40 a;

    public tq40(uq40 uq40Var) {
        this.a = uq40Var;
    }

    @Override // defpackage.pq40
    public final void C2(ModalViewOrigin modalViewOrigin) {
        uq40.a(this.a, modalViewOrigin);
    }

    @Override // defpackage.pq40
    public final void R9(jr40 jr40Var, wq40 wq40Var, boolean z) {
        this.a.e(jr40Var, wq40Var, z);
    }

    @Override // defpackage.pq40
    public final boolean i9(ModalViewOrigin modalViewOrigin) {
        uq40 uq40Var = this.a;
        f600 f600Var = uq40Var.c;
        if (f600Var.d() || f600Var.c()) {
            return false;
        }
        uq40.a(uq40Var, modalViewOrigin);
        return true;
    }
}
