package m5;

import ac.o;
import m0.r;
import m0.z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f4872g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f4873h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k5.a f4874i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u0.d f4875j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4876k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4877l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, k5.a aVar, u0.d dVar, int i10, int i11) {
        super(2);
        this.f4872g = cVar;
        this.f4873h = str;
        this.f4874i = aVar;
        this.f4875j = dVar;
        this.f4876k = i10;
        this.f4877l = i11;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f4872g.e(this.f4873h, this.f4874i, this.f4875j, (r) obj, z.y(this.f4876k | 1), this.f4877l);
        return o.f277a;
    }
}
