package c7;

import java.util.ArrayList;
import java.util.Iterator;
import l6.C4694a;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5741a;

    public s(ArrayList arrayList) {
        this.f5741a = arrayList;
    }

    public final void a(double d2, b6.c cVar, C4694a c4694a) {
        Iterator it = this.f5741a.iterator();
        while (it.hasNext()) {
            ((s) it.next()).a(d2, cVar, c4694a);
        }
    }

    public final void b(long j9, b6.c cVar, C4694a c4694a) {
        Iterator it = this.f5741a.iterator();
        while (it.hasNext()) {
            ((s) it.next()).b(j9, cVar, c4694a);
        }
    }
}
