package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;

/* loaded from: classes5.dex */
public final class zc1 implements v7p {
    public final /* synthetic */ int a;
    public final mzf b;
    public final xvf0 c;

    public /* synthetic */ zc1(mzf mzfVar, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = mzfVar;
        this.c = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        mzf mzfVar = this.b;
        switch (i) {
            case 0:
                return new yc1((e) mzfVar.get(), (jc1) xvf0Var.get());
            default:
                return new jye((e) mzfVar.get(), (fye) xvf0Var.get());
        }
    }
}
