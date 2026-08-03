package j0;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends pc.k implements oc.c {

    /* renamed from: h, reason: collision with root package name */
    public static final e f3314h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f3315i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f3316j;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3317g;

    static {
        int i10 = 1;
        f3314h = new e(i10, 0);
        f3315i = new e(i10, 1);
        f3316j = new e(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11) {
        super(i10);
        this.f3317g = i11;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        int i10 = this.f3317g;
        ac.o oVar = ac.o.f277a;
        switch (i10) {
            case 0:
                e2.u.a((e2.j) obj, 0);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                break;
            default:
                vc.c[] cVarArr = e2.u.f2053a;
                e2.v vVar = e2.s.f2036l;
                vc.c cVar = e2.u.f2053a[5];
                vVar.a((e2.j) obj, Boolean.TRUE);
                break;
        }
        return oVar;
    }
}
