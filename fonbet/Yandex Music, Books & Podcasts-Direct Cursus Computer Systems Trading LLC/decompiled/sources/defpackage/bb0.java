package defpackage;

import com.yandex.music.core.ui.compose.draggable.a;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class bb0 implements ab0 {
    public final u10 a;
    public final oa0 b;
    public final act c;
    public final uf7 d;

    public bb0(jx7 jx7Var) {
        jx7Var.getClass();
        this.a = new u10(23);
        this.b = new oa0(jx7Var, 2);
        this.c = weo.S(0, 0, null, 7);
        this.d = ghh.s(2);
    }

    @Override // defpackage.ab0
    public final apo a(Function1 function1) {
        function1.getClass();
        act actVar = this.c;
        actVar.getClass();
        uf7 uf7Var = this.d;
        uf7Var.getClass();
        j3 j3Var = new j3(8);
        r90 r90Var = new r90(this.a, this.b, actVar, uf7Var, function1, 0);
        apo apoVar = bpo.a;
        return new apo(0, new j3(11), new v5(6, new apo(0, j3Var, r90Var)));
    }

    @Override // defpackage.ab0
    public final ya0 e(Function1 function1) {
        d44 d44Var = d44.b;
        function1.getClass();
        return new za0(a.a(d44Var, this.a, this.b, this.c, this.d, function1));
    }
}
