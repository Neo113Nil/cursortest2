package defpackage;

import com.yandex.plus.core.benchmark.Benchmark$State;
import com.yandex.plus.core.benchmark.b;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class yx4 implements rl5 {
    public final Class a;

    public yx4(Class cls) {
        this.a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Class] */
    @Override // defpackage.rl5
    public final void b(ll5 ll5Var, Map map) {
        pl5 pl5Var;
        b bVar = (b) ll5Var;
        if (((Benchmark$State) bVar.d.a.get()) == Benchmark$State.STOPPED) {
            Iterator it = bVar.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    pl5Var = 0;
                    break;
                } else {
                    pl5Var = it.next();
                    if (this.a.isInstance(pl5Var)) {
                        break;
                    }
                }
            }
            pl5 pl5Var2 = pl5Var instanceof pl5 ? pl5Var : null;
            if (pl5Var2 != null) {
                c(ll5Var, pl5Var2, map);
            }
        }
    }

    public abstract void c(ll5 ll5Var, pl5 pl5Var, Map map);
}
