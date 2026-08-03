package e2;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1990g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f1991h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, int i10) {
        super(1);
        this.f1990g = i10;
        this.f1991h = str;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        int i10 = this.f1990g;
        ac.o oVar = ac.o.f277a;
        String str = this.f1991h;
        switch (i10) {
            case 0:
                vc.c[] cVarArr = u.f2053a;
                ((j) obj).d(s.f2025a, i7.b.z(str));
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                j jVar = (j) obj;
                vc.c[] cVarArr2 = u.f2053a;
                jVar.d(s.f2025a, i7.b.z(str));
                u.a(jVar, 5);
                break;
            default:
                j jVar2 = (j) obj;
                vc.c[] cVarArr3 = u.f2053a;
                jVar2.d(s.f2025a, i7.b.z(str));
                u.a(jVar2, 5);
                break;
        }
        return oVar;
    }
}
