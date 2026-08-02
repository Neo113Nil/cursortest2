package defpackage;

import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.f;

/* loaded from: classes14.dex */
public final /* synthetic */ class yo70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ o2y0 c;

    public /* synthetic */ yo70(o2y0 o2y0Var, f fVar) {
        this.a = 0;
        this.c = o2y0Var;
        this.b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        o2y0 o2y0Var = this.c;
        f fVar = this.b;
        switch (i) {
            case 0:
                if (o2y0Var.b().I()) {
                    fVar.p0(o2y0Var);
                    break;
                }
                break;
            case 1:
                fVar.a0(o2y0Var);
                break;
            case 2:
                DriveState driveState = DriveState.CANCELLED;
                fVar.d0(o2y0Var).c(new bgc(12), new th40(5, o2y0Var, fVar, driveState));
                break;
            case 3:
                fVar.p0(o2y0Var);
                break;
            default:
                fVar.p0(o2y0Var);
                break;
        }
    }

    public /* synthetic */ yo70(f fVar, o2y0 o2y0Var, int i) {
        this.a = i;
        this.b = fVar;
        this.c = o2y0Var;
    }
}
