package defpackage;

import com.yandex.go.quark.dynamic.c;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class rl1 {
    public final r0 a;
    public final gci0 b;

    public rl1() {
        r0 c = bvf0.c(null);
        this.a = c;
        this.b = e.d(c);
    }

    public final void a(rdb rdbVar) {
        r0 r0Var;
        Object value;
        rdb rdbVar2;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
            rdbVar2 = (rdb) value;
        } while (!r0Var.k(value, rdbVar));
        if (rdbVar2 == rdbVar || rdbVar2 == null) {
            return;
        }
        ((c) rdbVar2).a();
    }
}
