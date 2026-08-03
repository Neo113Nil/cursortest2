package s3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import v.n;
import v.o;
import v.y;
import v.z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k implements o {

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f6435g;

    public k() {
        this.f6435g = new ArrayList();
        new HashMap();
        new HashMap();
    }

    public List a() {
        ArrayList arrayList;
        if (this.f6435g.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f6435g) {
            arrayList = new ArrayList(this.f6435g);
        }
        return arrayList;
    }

    @Override // v.o
    public y get(int i10) {
        return (z) this.f6435g.get(i10);
    }

    public k(float f10, float f11, n nVar) {
        uc.d q10 = uc.e.q(0, nVar.b());
        ArrayList arrayList = new ArrayList(bc.o.O(q10));
        Iterator it = q10.iterator();
        while (true) {
            uc.c cVar = (uc.c) it;
            if (cVar.f6740i) {
                arrayList.add(new z(f10, f11, nVar.a(cVar.nextInt())));
            } else {
                this.f6435g = arrayList;
                return;
            }
        }
    }
}
