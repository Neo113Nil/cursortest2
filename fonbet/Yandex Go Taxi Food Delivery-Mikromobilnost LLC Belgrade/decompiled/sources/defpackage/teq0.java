package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.Iterator;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes14.dex */
public final class teq0 {
    public final c4r0 a;
    public final c8r b;
    public final ck31 c;

    public teq0(c4r0 c4r0Var, c8r c8rVar, ck31 ck31Var) {
        this.a = c4r0Var;
        this.b = c8rVar;
        this.c = ck31Var;
    }

    public final void a(SelectionOrigin selectionOrigin, String str) {
        Object obj;
        Iterator it = ((k) this.c).j().a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((za31) obj).a.a, str)) {
                    break;
                }
            }
        }
        za31 za31Var = (za31) obj;
        mi31 mi31Var = za31Var != null ? za31Var.c : null;
        if (mi31Var == null) {
            mi31Var = c8r.b(this.b, null, str, null, 4);
        }
        if (mi31Var != null) {
            this.a.a(new gnx0(new fnx0(mi31Var, selectionOrigin), true));
        }
    }
}
