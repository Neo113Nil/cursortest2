package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class v6s {
    public final r0 a;
    public final gci0 b;

    public v6s() {
        r0 c = bvf0.c(b.f());
        this.a = c;
        this.b = e.d(c);
    }

    public final void a(String str, c3s c3sVar) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
        } while (!r0Var.k(value, b.o((Map) value, new Pair(str, c3sVar))));
    }

    public final void b(String str) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
        } while (!r0Var.k(value, b.j(str, (Map) value)));
    }
}
