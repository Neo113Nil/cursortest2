package e2;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Comparator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final e f1950b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f1951c = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f1952d = new e(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1953a;

    public /* synthetic */ e(int i10) {
        this.f1953a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1953a) {
            case 0:
                e1.c h10 = ((n) obj).h();
                e1.c h11 = ((n) obj2).h();
                int compare = Float.compare(h10.f1931a, h11.f1931a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(h10.f1932b, h11.f1932b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(h10.f1934d, h11.f1934d);
                return compare3 != 0 ? compare3 : Float.compare(h10.f1933c, h11.f1933c);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                e1.c h12 = ((n) obj).h();
                e1.c h13 = ((n) obj2).h();
                int compare4 = Float.compare(h13.f1933c, h12.f1933c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(h12.f1932b, h13.f1932b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(h12.f1934d, h13.f1934d);
                return compare6 != 0 ? compare6 : Float.compare(h13.f1931a, h12.f1931a);
            default:
                ac.i iVar = (ac.i) obj;
                ac.i iVar2 = (ac.i) obj2;
                int compare7 = Float.compare(((e1.c) iVar.f270g).f1932b, ((e1.c) iVar2.f270g).f1932b);
                return compare7 != 0 ? compare7 : Float.compare(((e1.c) iVar.f270g).f1934d, ((e1.c) iVar2.f270g).f1934d);
        }
    }
}
