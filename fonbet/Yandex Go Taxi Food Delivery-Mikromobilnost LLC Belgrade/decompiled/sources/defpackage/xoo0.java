package defpackage;

import android.hardware.SensorManager;

/* loaded from: classes13.dex */
public final class xoo0 implements v7p {
    public final /* synthetic */ int a;
    public final n7g b;
    public final xvf0 c;

    public /* synthetic */ xoo0(n7g n7gVar, j7g j7gVar, int i) {
        this.a = i;
        this.b = n7gVar;
        this.c = j7gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        n7g n7gVar = this.b;
        switch (i) {
            case 0:
                return new krl0((SensorManager) n7gVar.get(), (tse) xvf0Var.get());
            default:
                return new cjm0((SensorManager) n7gVar.get(), (tse) xvf0Var.get());
        }
    }
}
