package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes10.dex */
public final class v3u0 {
    public final LinkedHashSet a = new LinkedHashSet();
    public final LinkedHashSet b = new LinkedHashSet();

    public final k20 a(Object obj) {
        this.a.add(obj);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((p3u0) it.next()).a.f();
        }
        return new k20(6, this, obj);
    }
}
