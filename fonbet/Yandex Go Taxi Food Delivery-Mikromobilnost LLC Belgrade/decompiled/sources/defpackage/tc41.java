package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class tc41 implements b38, f38 {
    public e8h a;
    public final LinkedHashSet b = new LinkedHashSet();
    public final r0 c;
    public final gci0 w;

    public tc41() {
        r0 c = bvf0.c(EmptySet.a);
        this.c = c;
        this.w = e.d(c);
    }

    @Override // defpackage.b38
    public final tpr a() {
        return this.w;
    }

    public final synchronized syj0 b(uc41 uc41Var, u28 u28Var) {
        e8h e8hVar = this.a;
        if (e8hVar != null) {
            return uc41Var.z(e8hVar, u28Var);
        }
        xwf0 xwf0Var = new xwf0();
        this.b.add(new vra0(u28Var, uc41Var, xwf0Var));
        return new lyj0(xwf0Var);
    }

    @Override // defpackage.f38
    public final void c(e38 e38Var) {
        r0 r0Var;
        Object value;
        LinkedHashSet f;
        do {
            r0Var = this.c;
            value = r0Var.getValue();
            Set set = (Set) value;
            if (e38Var instanceof c38) {
                f = v4r0.i(set, ((c38) e38Var).a);
            } else {
                if (!(e38Var instanceof d38)) {
                    w511.b();
                    return;
                }
                f = v4r0.f(set, ((d38) e38Var).a);
            }
        } while (!r0Var.k(value, f));
    }
}
