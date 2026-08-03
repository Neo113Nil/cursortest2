package p5;

import ac.o;
import com.onesignal.inAppMessages.internal.display.impl.a;
import m0.r;
import m0.z;
import pc.k;
import v.e1;
import v.x;
import y0.n;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5529g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oc.c f5530h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u0.d f5531i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5532j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f5533k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5534l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5535m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Object obj, oc.c cVar, String str, oc.c cVar2, u0.d dVar, int i10) {
        super(2);
        this.f5533k = obj;
        this.f5534l = (k) cVar;
        this.f5535m = str;
        this.f5530h = cVar2;
        this.f5531i = dVar;
        this.f5532j = i10;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [oc.c, pc.k] */
    /* JADX WARN: Type inference failed for: r3v3, types: [oc.c, pc.k] */
    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5529g) {
            case 0:
                ((Number) obj2).intValue();
                m5.c cVar = (m5.c) this.f5533k;
                x xVar = (x) this.f5534l;
                y0.f fVar = (y0.f) this.f5535m;
                i7.b.c(cVar, xVar, fVar, this.f5530h, this.f5531i, (r) obj, z.y(this.f5532j | 1));
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((Number) obj2).intValue();
                ?? r12 = (k) this.f5534l;
                String str = (String) this.f5535m;
                x4.f.b(this.f5533k, r12, str, this.f5530h, this.f5531i, (r) obj, z.y(this.f5532j | 1));
                break;
            default:
                ((Number) obj2).intValue();
                e1 e1Var = (e1) this.f5533k;
                n nVar = (n) this.f5534l;
                ?? r32 = (k) this.f5535m;
                x4.f.c(e1Var, nVar, r32, this.f5530h, this.f5531i, (r) obj, z.y(this.f5532j | 1));
                break;
        }
        return o.f277a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m5.c cVar, x xVar, y0.f fVar, oc.c cVar2, u0.d dVar, int i10) {
        super(2);
        this.f5533k = cVar;
        this.f5534l = xVar;
        this.f5535m = fVar;
        this.f5530h = cVar2;
        this.f5531i = dVar;
        this.f5532j = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(e1 e1Var, n nVar, oc.c cVar, oc.c cVar2, u0.d dVar, int i10) {
        super(2);
        this.f5533k = e1Var;
        this.f5534l = nVar;
        this.f5535m = (k) cVar;
        this.f5530h = cVar2;
        this.f5531i = dVar;
        this.f5532j = i10;
    }
}
