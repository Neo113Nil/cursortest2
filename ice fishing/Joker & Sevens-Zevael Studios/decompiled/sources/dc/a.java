package dc;

import java.util.Comparator;
import oc.c;
import oc.e;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1838b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f1837a = i10;
        this.f1838b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1837a) {
            case 0:
                for (c cVar : (c[]) this.f1838b) {
                    int p8 = a.a.p((Comparable) cVar.invoke(obj), (Comparable) cVar.invoke(obj2));
                    if (p8 != 0) {
                        return p8;
                    }
                }
                return 0;
            default:
                return ((Number) ((e) this.f1838b).invoke(obj, obj2)).intValue();
        }
    }
}
