package defpackage;

import java.util.HashMap;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class qe {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final n0 d;
    public final eci0 e;

    public qe() {
        n0 c = ffx.c(0, 16, null, 5);
        this.d = c;
        this.e = e.c(c);
    }

    public final pz40 a(String str) {
        HashMap hashMap = this.a;
        Object obj = hashMap.get(str);
        if (obj == null) {
            obj = bvf0.c(null);
            hashMap.put(str, obj);
        }
        return (pz40) obj;
    }

    public final void b(String str, we weVar) {
        ((r0) a(str)).l(weVar);
    }
}
