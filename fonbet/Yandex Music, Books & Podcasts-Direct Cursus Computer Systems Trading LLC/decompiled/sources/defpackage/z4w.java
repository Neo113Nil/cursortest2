package defpackage;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class z4w {
    public final ueo a;
    public final m3u b = new m3u(5);

    public z4w(ueo ueoVar) {
        this.a = ueoVar;
    }

    public final void a(String str, Set set) {
        str.getClass();
        set.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            up6.F(this.a, false, true, new itv(12, this, new y4w((String) it.next(), str)));
        }
    }
}
