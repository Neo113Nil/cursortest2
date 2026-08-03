package d1;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.Serializable;
import v1.i0;
import v1.j0;
import x1.o0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1615g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1616h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1617i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1618j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Serializable f1619k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1620l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(r rVar, r rVar2, Object obj, int i10, a0.r rVar3, int i11) {
        super(1);
        this.f1615g = i11;
        this.f1616h = rVar;
        this.f1617i = rVar2;
        this.f1620l = obj;
        this.f1618j = i10;
        this.f1619k = rVar3;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f1615g) {
            case 0:
                v1.d dVar = (v1.d) obj;
                r rVar = (r) this.f1616h;
                r rVar2 = (r) this.f1617i;
                if (rVar != ((i) ((y1.r) x1.f.w(rVar2)).getFocusOwner()).f1583h) {
                    return Boolean.TRUE;
                }
                boolean A = e.A(rVar2, (r) this.f1620l, this.f1618j, (a0.r) this.f1619k);
                Boolean valueOf = Boolean.valueOf(A);
                if (A || !dVar.a()) {
                    return valueOf;
                }
                return null;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                v1.d dVar2 = (v1.d) obj;
                r rVar3 = (r) this.f1616h;
                r rVar4 = (r) this.f1617i;
                if (rVar3 != ((i) ((y1.r) x1.f.w(rVar4)).getFocusOwner()).f1583h) {
                    return Boolean.TRUE;
                }
                boolean z10 = e.z(this.f1618j, (a0.r) this.f1619k, rVar4, (e1.c) this.f1620l);
                Boolean valueOf2 = Boolean.valueOf(z10);
                if (z10 || !dVar2.a()) {
                    return valueOf2;
                }
                return null;
            default:
                i0 i0Var = (i0) obj;
                j0[] j0VarArr = (j0[]) this.f1616h;
                z.r rVar5 = (z.r) this.f1617i;
                o0 o0Var = (o0) this.f1620l;
                int[] iArr = (int[]) this.f1619k;
                int length = j0VarArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    j0 j0Var = j0VarArr[i10];
                    pc.j.b(j0Var);
                    j0Var.g();
                    i0.g(i0Var, j0Var, rVar5.f9027b.a(0, this.f1618j - j0Var.f7085g, o0Var.getLayoutDirection()), iArr[i11]);
                    i10++;
                    i11++;
                }
                return ac.o.f277a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(j0[] j0VarArr, z.r rVar, int i10, o0 o0Var, int[] iArr) {
        super(1);
        this.f1615g = 2;
        this.f1616h = j0VarArr;
        this.f1617i = rVar;
        this.f1618j = i10;
        this.f1620l = o0Var;
        this.f1619k = iArr;
    }
}
