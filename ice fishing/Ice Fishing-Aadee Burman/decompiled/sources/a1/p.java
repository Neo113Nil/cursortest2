package a1;

import E3.u;
import X0.G;
import android.graphics.PointF;
import com.google.android.gms.internal.ads.C2991bm;

/* loaded from: classes.dex */
public final class p extends C2991bm {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f4286w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C2991bm f4287x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c1.b f4288y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u uVar, C2991bm c2991bm, c1.b bVar) {
        super(29);
        this.f4286w = uVar;
        this.f4287x = c2991bm;
        this.f4288y = bVar;
    }

    @Override // com.google.android.gms.internal.ads.C2991bm
    public final Object Q(u uVar) {
        float f3 = uVar.f827a;
        float f9 = uVar.f828b;
        String str = ((c1.b) uVar.f832f).f5497a;
        String str2 = ((c1.b) uVar.f833g).f5497a;
        float f10 = uVar.f829c;
        float f11 = uVar.f830d;
        float f12 = uVar.f831e;
        u uVar2 = this.f4286w;
        uVar2.f827a = f3;
        uVar2.f828b = f9;
        uVar2.f832f = str;
        uVar2.f833g = str2;
        uVar2.f829c = f10;
        uVar2.f830d = f11;
        uVar2.f831e = f12;
        String str3 = (String) ((G) this.f4287x.f29324v);
        c1.b bVar = (c1.b) (uVar.f830d == 1.0f ? uVar.f833g : uVar.f832f);
        String str4 = bVar.f5498b;
        float f13 = bVar.f5499c;
        int i = bVar.f5500d;
        int i6 = bVar.f5501e;
        float f14 = bVar.f5502f;
        float f15 = bVar.f5503g;
        int i9 = bVar.f5504h;
        int i10 = bVar.i;
        float f16 = bVar.f5505j;
        boolean z3 = bVar.f5506k;
        PointF pointF = bVar.f5507l;
        PointF pointF2 = bVar.f5508m;
        c1.b bVar2 = this.f4288y;
        bVar2.f5497a = str3;
        bVar2.f5498b = str4;
        bVar2.f5499c = f13;
        bVar2.f5500d = i;
        bVar2.f5501e = i6;
        bVar2.f5502f = f14;
        bVar2.f5503g = f15;
        bVar2.f5504h = i9;
        bVar2.i = i10;
        bVar2.f5505j = f16;
        bVar2.f5506k = z3;
        bVar2.f5507l = pointF;
        bVar2.f5508m = pointF2;
        return bVar2;
    }
}
