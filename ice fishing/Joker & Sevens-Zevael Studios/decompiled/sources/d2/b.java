package d2;

import ac.o;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends pc.k implements oc.c {

    /* renamed from: h, reason: collision with root package name */
    public static final b f1628h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f1629i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f1630j;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1631g;

    static {
        int i10 = 1;
        f1628h = new b(i10, 0);
        f1629i = new b(i10, 1);
        f1630j = new b(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f1631g = i11;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f1631g) {
            case 0:
                ((Number) obj).longValue();
                return o.f277a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return Integer.valueOf(((k) obj).f1651b);
            default:
                s2.j jVar = ((k) obj).f1652c;
                return Integer.valueOf(jVar.f6394d - jVar.f6392b);
        }
    }
}
