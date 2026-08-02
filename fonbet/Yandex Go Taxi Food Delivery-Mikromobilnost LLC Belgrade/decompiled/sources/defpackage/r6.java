package defpackage;

import androidx.recyclerview.widget.x0;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class r6 extends m70 {
    @Override // defpackage.m70
    public final boolean a(int i, Object obj) {
        List list = (List) obj;
        return h(list.get(i), i, list);
    }

    @Override // defpackage.m70
    public final void b(Object obj, int i, x0 x0Var, List list) {
        i(((List) obj).get(i), x0Var, list);
    }

    public abstract boolean h(Object obj, int i, List list);

    public abstract void i(Object obj, x0 x0Var, List list);
}
