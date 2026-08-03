package a0;

import b0.q0;
import b0.r0;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import f1.g0;
import java.util.NoSuchElementException;
import m0.i0;
import s.k0;
import x1.f1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l extends pc.k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f59g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f60h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f61i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f62j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(c0.f fVar, f1 f1Var, oc.a aVar) {
        super(0);
        this.f59g = 1;
        this.f60h = fVar;
        this.f61i = f1Var;
        this.f62j = (pc.k) aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        if (r0.A == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        r1 = r0.s0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (r0.t0(r1, r0.B) != true) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r5 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        r0.A = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        ((x.n1) r10.f61i).f7859e = x.i.r0(r0, (x.d) r10.f62j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
    
        return r4;
     */
    /* JADX WARN: Type inference failed for: r2v3, types: [oc.a, pc.k] */
    @Override // oc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        switch (this.f59g) {
            case 0:
                f fVar = (f) ((i0) this.f60h).getValue();
                b0 b0Var = (b0) this.f61i;
                uc.d dVar = (uc.d) ((b0.y) b0Var.f19d.f139e).getValue();
                q0 q0Var = new q0();
                q0 q0Var2 = fVar.f44a;
                int i10 = dVar.f6735g;
                if (i10 < 0) {
                    throw new IllegalStateException("negative nearestRange.first");
                }
                int min = Math.min(dVar.f6736h, q0Var2.f873a - 1);
                if (min < i10) {
                    s.z zVar = k0.f6300a;
                    pc.j.c(zVar, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
                    q0Var.f874b = zVar;
                    q0Var.f875c = new Object[0];
                    q0Var.f873a = 0;
                } else {
                    int i11 = (min - i10) + 1;
                    q0Var.f875c = new Object[i11];
                    q0Var.f873a = i10;
                    s.z zVar2 = new s.z(i11);
                    r0 r0Var = new r0(i10, min, zVar2, q0Var);
                    o0.e eVar = (o0.e) q0Var2.f874b;
                    q0Var2.c(i10);
                    q0Var2.c(min);
                    if (min < i10) {
                        throw new IllegalArgumentException(("toIndex (" + min + ") should be not smaller than fromIndex (" + i10 + ')').toString());
                    }
                    int e10 = a.a.e(i10, eVar);
                    int i12 = ((b0.h) eVar.f5134g[e10]).f825a;
                    while (i12 <= min) {
                        b0.h hVar = (b0.h) eVar.f5134g[e10];
                        r0Var.invoke(hVar);
                        i12 += hVar.f826b;
                        e10++;
                    }
                    q0Var.f874b = zVar2;
                }
                return new i(b0Var, fVar, (c) this.f62j, q0Var);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                c0.f fVar2 = (c0.f) this.f60h;
                e1.c r02 = c0.f.r0(fVar2, (f1) this.f61i, (pc.k) this.f62j);
                if (r02 == null) {
                    return null;
                }
                x.i iVar = fVar2.f1192u;
                if (s2.k.a(iVar.B, 0L)) {
                    throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return r02.e(iVar.v0(r02, iVar.B) ^ (-9223372034707292160L));
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                pc.s sVar = (pc.s) this.f60h;
                g0 g0Var = ((w.i) this.f61i).f7437v;
                x1.i0 i0Var = (x1.i0) this.f62j;
                sVar.f5683g = g0Var.a(i0Var.f8081g.d(), i0Var.getLayoutDirection(), i0Var);
                return ac.o.f277a;
            case 3:
                x.i iVar2 = (x.i) this.f60h;
                b0.j jVar = iVar2.f7810x;
                while (true) {
                    o0.e eVar2 = jVar.f839a;
                    int i13 = eVar2.f5136i;
                    ac.o oVar = ac.o.f277a;
                    boolean z10 = true;
                    if (i13 == 0) {
                        break;
                    } else {
                        if (i13 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        e1.c cVar = (e1.c) ((x.h) eVar2.f5134g[i13 - 1]).f7796a.invoke();
                        if (!(cVar == null ? true : iVar2.t0(cVar, iVar2.B))) {
                            break;
                        } else {
                            ((x.h) eVar2.k(eVar2.f5136i - 1)).f7797b.resumeWith(oVar);
                        }
                    }
                }
            default:
                y1.a aVar = (y1.a) this.f60h;
                aVar.removeOnAttachStateChangeListener((f1.e) this.f61i);
                x7.f fVar3 = (x7.f) this.f62j;
                pc.j.e(fVar3, "listener");
                bc.a0.p(aVar).f5045a.remove(fVar3);
                return ac.o.f277a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i10) {
        super(0);
        this.f59g = i10;
        this.f60h = obj;
        this.f61i = obj2;
        this.f62j = obj3;
    }
}
