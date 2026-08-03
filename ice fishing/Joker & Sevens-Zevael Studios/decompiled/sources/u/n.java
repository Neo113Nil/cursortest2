package u;

import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6621g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6622h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i10, ArrayList arrayList) {
        super(1);
        this.f6621g = i10;
        this.f6622h = arrayList;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f6621g) {
            case 0:
                v1.i0 i0Var = (v1.i0) obj;
                ArrayList arrayList = this.f6622h;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    v1.i0.g(i0Var, (v1.j0) arrayList.get(i10), 0, 0);
                }
                break;
            default:
                v1.i0 i0Var2 = (v1.i0) obj;
                ArrayList arrayList2 = this.f6622h;
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    v1.i0.j(i0Var2, (v1.j0) arrayList2.get(i11), 0, 0);
                }
                break;
        }
        return ac.o.f277a;
    }
}
