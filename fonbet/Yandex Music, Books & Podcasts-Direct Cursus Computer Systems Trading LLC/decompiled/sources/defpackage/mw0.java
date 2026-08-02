package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class mw0 extends j5 {
    @Override // defpackage.nw0
    public final void c(int i, int i2, int i3) {
        ArrayList w = w();
        int i4 = i > i2 ? i2 : i2 - i3;
        if (i3 != 1) {
            List subList = w.subList(i, i3 + i);
            ArrayList y0 = CollectionsKt.y0(subList);
            subList.clear();
            w.addAll(i4, y0);
            return;
        }
        if (i == i2 + 1 || i == i2 - 1) {
            w.set(i, w.set(i2, w.get(i)));
        } else {
            w.add(i4, w.remove(i));
        }
    }

    @Override // defpackage.nw0
    public final void d(int i, int i2) {
        ArrayList w = w();
        if (i2 == 1) {
            w.remove(i);
        } else {
            w.subList(i, i2 + i).clear();
        }
    }

    @Override // defpackage.nw0
    public final void e(int i, Object obj) {
        c3b c3bVar = (c3b) obj;
        Object obj2 = this.b;
        obj2.getClass();
        int i2 = ((n3b) obj2).a;
        if (i2 > 0) {
            if (c3bVar instanceof n3b) {
                ((n3b) c3bVar).a = i2 - 1;
            }
            w().add(i, c3bVar);
            return;
        }
        Object obj3 = this.a;
        obj3.getClass();
        throw new IllegalArgumentException(("Too many embedded views for the current surface. The maximum depth is: " + ((n3b) obj3).a).toString());
    }

    @Override // defpackage.nw0
    public final /* bridge */ /* synthetic */ void h(int i, Object obj) {
    }

    @Override // defpackage.j5
    public final void r() {
        Object obj = this.a;
        obj.getClass();
        ((n3b) obj).b.clear();
    }

    public final ArrayList w() {
        c3b c3bVar = (c3b) this.b;
        if (c3bVar instanceof n3b) {
            return ((n3b) c3bVar).b;
        }
        xq0.q("Current node cannot accept children");
        return null;
    }
}
