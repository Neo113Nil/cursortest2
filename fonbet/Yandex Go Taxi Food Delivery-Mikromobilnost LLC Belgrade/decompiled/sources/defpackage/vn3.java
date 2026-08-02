package defpackage;

import com.yandex.go.lifecycle.processor.b;
import java.util.Set;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.am.m;

/* loaded from: classes9.dex */
public final class vn3 implements v7p {
    public final /* synthetic */ int a = 0;
    public final xvf0 b;
    public final y2r0 c;
    public final xvf0 d;
    public final xvf0 e;

    public vn3(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, y2r0 y2r0Var) {
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.c = y2r0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        y2r0 y2r0Var = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new m((k) xvf0Var3.get(), (tt2) xvf0Var2.get(), (hit) xvf0Var.get(), i5m.a(y2r0Var));
            default:
                return new b((Set) xvf0Var3.get(), i5m.a(y2r0Var), (tt2) xvf0Var2.get(), (tse) xvf0Var.get());
        }
    }

    public vn3(y2r0 y2r0Var, y2r0 y2r0Var2, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.b = y2r0Var;
        this.c = y2r0Var2;
        this.d = xvf0Var;
        this.e = xvf0Var2;
    }
}
