package defpackage;

import ru.yandex.taxi.preorder.source.domain.s;

/* loaded from: classes6.dex */
public final /* synthetic */ class qq40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uq40 b;

    public /* synthetic */ qq40(uq40 uq40Var, int i) {
        this.a = i;
        this.b = uq40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        uq40 uq40Var = this.b;
        switch (i) {
            case 0:
                uq40Var.D.d();
                break;
            case 1:
                uq40Var.h.c();
                break;
            case 2:
                uq40Var.h.c();
                break;
            default:
                ((s) uq40Var.i).c();
                break;
        }
    }
}
