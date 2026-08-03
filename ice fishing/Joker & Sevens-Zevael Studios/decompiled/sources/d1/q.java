package d1;

import x1.u1;
import yc.z0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class q extends pc.h implements oc.c {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1608o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i10, Object obj, Class cls, String str, String str2, int i11, int i12, int i13) {
        super(i10, obj, cls, str, str2, i11, i12);
        this.f1608o = i13;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f1608o) {
            case 0:
                ((t) this.f5665h).getClass();
                x1.l lVar = ((r) obj).f8443g;
                u1 u1Var = lVar instanceof u1 ? (u1) lVar : null;
                if (u1Var != null) {
                    x1.f.o(u1Var);
                }
                break;
            default:
                ((z0) this.f5665h).d((Throwable) obj);
                break;
        }
        return ac.o.f277a;
    }
}
