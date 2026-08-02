package defpackage;

import ru.yandex.taxi.widget.recycler.PositionLayoutManager;

/* loaded from: classes6.dex */
public final /* synthetic */ class zde0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PositionLayoutManager b;
    public final /* synthetic */ yzs0 c;

    public /* synthetic */ zde0(PositionLayoutManager positionLayoutManager, yzs0 yzs0Var, int i) {
        this.a = i;
        this.b = positionLayoutManager;
        this.c = yzs0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        yzs0 yzs0Var = this.c;
        PositionLayoutManager positionLayoutManager = this.b;
        switch (i) {
            case 0:
                if (yzs0Var.a != -1) {
                    positionLayoutManager.v(yzs0Var);
                    break;
                }
                break;
            default:
                if (yzs0Var.a == -1) {
                    positionLayoutManager.getClass();
                    break;
                } else {
                    positionLayoutManager.v(yzs0Var);
                    break;
                }
        }
    }
}
