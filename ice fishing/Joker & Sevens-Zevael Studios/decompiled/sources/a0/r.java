package a0;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import f1.j0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import m0.d1;
import m0.w2;
import u.g0;
import u.o0;
import v1.i0;
import x.x0;
import x.z0;
import x1.y1;
import x1.z1;
import yc.b1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f99g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f100h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f101i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f102j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(d1.r rVar, d1.i iVar, oc.c cVar) {
        super(1);
        this.f99g = 2;
        this.f100h = rVar;
        this.f101i = iVar;
        this.f102j = (pc.k) cVar;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [oc.c, pc.k] */
    @Override // oc.c
    public final Object invoke(Object obj) {
        boolean booleanValue;
        switch (this.f99g) {
            case 0:
                i0 i0Var = (i0) obj;
                ArrayList arrayList = (ArrayList) this.f100h;
                t tVar = (t) this.f101i;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    t tVar2 = (t) arrayList.get(i10);
                    if (tVar2 != tVar) {
                        tVar2.b(i0Var);
                    }
                }
                if (tVar != null) {
                    tVar.b(i0Var);
                }
                ((d1) this.f102j).getValue();
                return ac.o.f277a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                z1 z1Var = (z1) obj;
                b1.e eVar = (b1.e) z1Var;
                if (!((b1.a) ((y1.r) x1.f.w((b1.e) this.f101i)).m52getDragAndDropManager()).f939b.contains(eVar) || !i7.b.j(eVar, bc.a0.q((f8.c) this.f102j))) {
                    return y1.f8218g;
                }
                ((pc.s) this.f100h).f5683g = z1Var;
                return y1.f8220i;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                d1.r rVar = (d1.r) obj;
                if (pc.j.a(rVar, (d1.r) this.f100h)) {
                    booleanValue = false;
                } else {
                    if (pc.j.a(rVar, ((d1.i) this.f101i).f1578c)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    booleanValue = ((Boolean) ((pc.k) this.f102j).invoke(rVar)).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
            case 3:
                return new h5.a((w0.q) this.f100h, this.f101i, (u.m) this.f102j, 1);
            case 4:
                f1.e0 e0Var = (f1.e0) obj;
                w2 w2Var = (w2) this.f101i;
                w2 w2Var2 = (w2) this.f100h;
                e0Var.a(w2Var2 != null ? ((Number) w2Var2.getValue()).floatValue() : 1.0f);
                e0Var.g(w2Var != null ? ((Number) w2Var.getValue()).floatValue() : 1.0f);
                e0Var.h(w2Var != null ? ((Number) w2Var.getValue()).floatValue() : 1.0f);
                w2 w2Var3 = (w2) this.f102j;
                e0Var.n(w2Var3 != null ? ((j0) w2Var3.getValue()).f2268a : j0.f2266b);
                return ac.o.f277a;
            case 5:
                g0 g0Var = (g0) this.f102j;
                int ordinal = ((u.v) obj).ordinal();
                j0 j0Var = null;
                if (ordinal == 0) {
                    o0 o0Var = g0Var.f6601a;
                } else if (ordinal == 1) {
                    j0Var = (j0) this.f100h;
                } else {
                    if (ordinal != 2) {
                        throw new ac.d();
                    }
                    o0 o0Var2 = g0Var.f6601a;
                }
                return new j0(j0Var != null ? j0Var.f2268a : j0.f2266b);
            case 6:
                float floatValue = ((Number) obj).floatValue();
                x.i iVar = (x.i) this.f100h;
                float f10 = iVar.f7809w ? 1.0f : -1.0f;
                z0 z0Var = iVar.f7808v;
                x0 x0Var = (x0) this.f102j;
                long d10 = z0Var.d(z0Var.g(f10 * floatValue));
                z0 z0Var2 = x0Var.f7935a;
                float f11 = z0Var.f(z0Var.d(z0.a(z0Var2, z0Var2.f7958h, d10, 1))) * f10;
                if (Math.abs(f11) < Math.abs(floatValue)) {
                    b1 b1Var = (b1) this.f101i;
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + f11 + " < " + floatValue + ')');
                    cancellationException.initCause(null);
                    b1Var.a(cancellationException);
                }
                return ac.o.f277a;
            case 7:
                v1.j0 j0Var2 = (v1.j0) this.f102j;
                i0 i0Var2 = (i0) obj;
                z.a0 a0Var = (z.a0) this.f100h;
                long j3 = ((s2.i) a0Var.f8934u.invoke((x1.o0) this.f101i)).f6389a;
                if (a0Var.f8935v) {
                    i0.j(i0Var2, j0Var2, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                } else {
                    i0.k(i0Var2, j0Var2, (int) (j3 >> 32), (int) (j3 & 4294967295L), null, 12);
                }
                return ac.o.f277a;
            case 8:
                v1.j0 j0Var3 = (v1.j0) this.f101i;
                i0 i0Var3 = (i0) obj;
                x1.o0 o0Var3 = (x1.o0) this.f102j;
                z.b0 b0Var = (z.b0) this.f100h;
                if (b0Var.f8941y) {
                    i0.i(i0Var3, j0Var3, o0Var3.D(b0Var.f8937u), o0Var3.D(b0Var.f8938v));
                } else {
                    i0.g(i0Var3, j0Var3, o0Var3.D(b0Var.f8937u), o0Var3.D(b0Var.f8938v));
                }
                return ac.o.f277a;
            default:
                v1.j0 j0Var4 = (v1.j0) this.f100h;
                x1.o0 o0Var4 = (x1.o0) this.f101i;
                z.d0 d0Var = (z.d0) this.f102j;
                i0.g((i0) obj, j0Var4, o0Var4.D(d0Var.f8948u.a(o0Var4.getLayoutDirection())), o0Var4.D(d0Var.f8948u.f8945b));
                return ac.o.f277a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj, Object obj2, Object obj3, int i10) {
        super(1);
        this.f99g = i10;
        this.f100h = obj;
        this.f101i = obj2;
        this.f102j = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ArrayList arrayList, t tVar, boolean z10, d1 d1Var) {
        super(1);
        this.f99g = 0;
        this.f100h = arrayList;
        this.f101i = tVar;
        this.f102j = d1Var;
    }
}
