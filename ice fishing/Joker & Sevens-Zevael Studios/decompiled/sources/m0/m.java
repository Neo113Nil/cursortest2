package m0;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4649g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4650h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4651i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4652j;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i10) {
        this.f4649g = i10;
        this.f4650h = obj;
        this.f4651i = obj2;
        this.f4652j = obj3;
    }

    @Override // oc.a
    public final Object invoke() {
        switch (this.f4649g) {
            case 0:
                r rVar = (r) this.f4650h;
                n0.a aVar = (n0.a) this.f4651i;
                i2 i2Var = (i2) this.f4652j;
                n0.b bVar = rVar.M;
                n0.a aVar2 = bVar.f4981b;
                try {
                    bVar.f4981b = aVar;
                    i2 i2Var2 = rVar.G;
                    int[] iArr = rVar.f4735o;
                    s.u uVar = rVar.f4742v;
                    rVar.f4735o = null;
                    rVar.f4742v = null;
                    try {
                        rVar.G = i2Var;
                        boolean z10 = bVar.f4984e;
                        try {
                            bVar.f4984e = false;
                            throw null;
                        } catch (Throwable th) {
                            bVar.f4984e = z10;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        rVar.G = i2Var2;
                        rVar.f4735o = iArr;
                        rVar.f4742v = uVar;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    bVar.f4981b = aVar2;
                    throw th3;
                }
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                a aVar3 = (a) this.f4650h;
                m2 m2Var = (m2) this.f4651i;
                n0.j0 j0Var = (n0.j0) this.f4652j;
                if (aVar3 != null) {
                    m2Var.a(m2Var.c(aVar3) - m2Var.f4677t);
                }
                List h10 = u2.b.h(m2Var, null, m2Var.f4677t, null);
                x0.a aVar4 = (x0.a) bc.m.Y(h10);
                Integer num = aVar4 != null ? aVar4.f7961a : null;
                List c3 = j0Var.c(num);
                if (num != null && !c3.isEmpty()) {
                    x0.a aVar5 = (x0.a) bc.m.T(c3);
                    List S = bc.m.S(c3);
                    aVar5.getClass();
                    c3 = bc.m.a0(i7.b.z(new x0.a(null, num)), S);
                }
                return bc.m.a0(h10, c3);
            default:
                yc.y yVar = (yc.y) this.f4650h;
                oc.a aVar6 = (oc.a) this.f4651i;
                yc.a0.q(yVar, null, new rd.t((v.c) this.f4652j, null, 1), 3);
                aVar6.invoke();
                return ac.o.f277a;
        }
    }

    public /* synthetic */ m(r rVar, n0.a aVar, i2 i2Var, c1 c1Var) {
        this.f4649g = 0;
        this.f4650h = rVar;
        this.f4651i = aVar;
        this.f4652j = i2Var;
    }
}
