package defpackage;

import com.yandex.go.tariffcard.ui.model.VisibilityChangeOrigin;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class ytx {
    public final r0 a;
    public final gci0 b;

    public ytx() {
        r0 c = bvf0.c(new xtx(null, -1, VisibilityChangeOrigin.SYSTEM));
        this.a = c;
        this.b = e.d(c);
    }

    public final void a(String str, int i, VisibilityChangeOrigin visibilityChangeOrigin) {
        r0 r0Var;
        Object value;
        xtx xtxVar;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
            xtx xtxVar2 = (xtx) value;
            if (jl40.l(str, xtxVar2.a)) {
                xtxVar = new xtx(xtxVar2.a, Math.max(i, xtxVar2.b), visibilityChangeOrigin);
            } else {
                xtxVar = new xtx(str, i, visibilityChangeOrigin);
            }
        } while (!r0Var.k(value, xtxVar));
    }
}
