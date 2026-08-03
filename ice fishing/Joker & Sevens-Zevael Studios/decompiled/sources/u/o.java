package u;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o implements v1.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final s f6624a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6625b;

    public o(s sVar) {
        this.f6624a = sVar;
    }

    @Override // v1.e0
    public final v1.f0 a(x1.o0 o0Var, List list, long j3) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((v1.d0) list.get(i10)).e(j3));
        }
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i11 = ((v1.j0) obj).f7085g;
            int K = bc.n.K(arrayList);
            if (1 <= K) {
                int i12 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i12);
                    int i13 = ((v1.j0) obj3).f7085g;
                    if (i11 < i13) {
                        obj = obj3;
                        i11 = i13;
                    }
                    if (i12 == K) {
                        break;
                    }
                    i12++;
                }
            }
        }
        v1.j0 j0Var = (v1.j0) obj;
        int i14 = j0Var != null ? j0Var.f7085g : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i15 = ((v1.j0) obj2).f7086h;
            int K2 = bc.n.K(arrayList);
            if (1 <= K2) {
                int i16 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i16);
                    int i17 = ((v1.j0) obj4).f7086h;
                    if (i15 < i17) {
                        obj2 = obj4;
                        i15 = i17;
                    }
                    if (i16 == K2) {
                        break;
                    }
                    i16++;
                }
            }
        }
        v1.j0 j0Var2 = (v1.j0) obj2;
        int i18 = j0Var2 != null ? j0Var2.f7086h : 0;
        boolean t3 = o0Var.t();
        s sVar = this.f6624a;
        if (t3) {
            this.f6625b = true;
            sVar.f6639b.setValue(new s2.k(i7.b.e(i14, i18)));
        } else if (!this.f6625b) {
            sVar.f6639b.setValue(new s2.k(i7.b.e(i14, i18)));
        }
        return o0Var.H(i14, i18, bc.w.f1068g, new n(0, arrayList));
    }
}
