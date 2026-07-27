package g7;

import java.util.ArrayList;
import java.util.Iterator;
import p6.C4840a;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f37686a;

    public s(ArrayList arrayList) {
        this.f37686a = arrayList;
    }

    public final void a(double d2, f6.c cVar, C4840a c4840a) {
        Iterator it = this.f37686a.iterator();
        while (it.hasNext()) {
            ((s) it.next()).a(d2, cVar, c4840a);
        }
    }

    public final void b(long j6, f6.c cVar, C4840a c4840a) {
        Iterator it = this.f37686a.iterator();
        while (it.hasNext()) {
            ((s) it.next()).b(j6, cVar, c4840a);
        }
    }
}
