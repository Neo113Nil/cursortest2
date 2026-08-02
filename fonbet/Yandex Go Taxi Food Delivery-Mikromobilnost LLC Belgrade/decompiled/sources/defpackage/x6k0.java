package defpackage;

import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;

/* loaded from: classes14.dex */
public final class x6k0 extends c7k0 {
    public final /* synthetic */ y6k0 a;

    public x6k0(y6k0 y6k0Var) {
        this.a = y6k0Var;
    }

    @Override // defpackage.c7k0
    public final void B() {
        y6k0 y6k0Var = this.a;
        y6k0Var.z((m950) y6k0Var.R.get(), new mo30(20, this));
    }

    @Override // defpackage.oiv0
    public final void close() {
        this.a.M.a();
    }

    @Override // defpackage.oiv0
    public final void f(String str) {
        ((mg21) ((lg21) this.a.O.get())).a(str);
    }

    @Override // defpackage.oiv0
    public final void j() {
        this.a.N.b(SourcePicker.B_FROM_SUMMARY, ModalViewOrigin.SUMMARY, true);
    }

    @Override // defpackage.oiv0
    public final void k(String str) {
        ((a60) this.a.G).c(str, v770.c);
    }

    @Override // defpackage.oiv0
    public final void r() {
        this.a.N.c(SourcePicker.A_FROM_SUMMARY, ModalViewOrigin.SUMMARY);
    }
}
