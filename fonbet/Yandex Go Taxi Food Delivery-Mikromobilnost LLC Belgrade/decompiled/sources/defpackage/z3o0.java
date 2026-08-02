package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import ru.yandex.taxi.banners.model.h;

/* loaded from: classes13.dex */
public final class z3o0 implements cwn0 {
    public final iu4 a;
    public final w030 b;
    public final qa0 c = new qa0(24, this);

    public z3o0(iu4 iu4Var, w030 w030Var) {
        this.a = iu4Var;
        this.b = w030Var;
    }

    @Override // defpackage.cwn0
    public final void b() {
        h b = this.a.b();
        CopyOnWriteArrayList copyOnWriteArrayList = b.p;
        qa0 qa0Var = this.c;
        copyOnWriteArrayList.add(qa0Var);
        String str = b.t;
        if (str != null) {
            qa0Var.accept(str);
        }
    }

    @Override // defpackage.cwn0
    public final void onDismiss() {
        h b = this.a.b();
        b.p.remove(this.c);
    }
}
