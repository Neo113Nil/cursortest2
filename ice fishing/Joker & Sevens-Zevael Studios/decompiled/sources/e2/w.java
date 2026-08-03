package e2;

import java.util.Comparator;
import x1.g0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2057a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f2058b;

    public w(w wVar) {
        this.f2058b = wVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2057a) {
            case 0:
                int compare = this.f2058b.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return g0.U.compare(((n) obj).f1995c, ((n) obj2).f1995c);
            default:
                int compare2 = ((w) this.f2058b).compare(obj, obj2);
                return compare2 != 0 ? compare2 : a.a.p(Integer.valueOf(((n) obj).f1999g), Integer.valueOf(((n) obj2).f1999g));
        }
    }

    public w(Comparator comparator) {
        this.f2058b = comparator;
    }
}
