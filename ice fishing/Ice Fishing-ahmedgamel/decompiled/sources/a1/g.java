package a1;

import E3.u;
import X0.G;
import com.google.android.gms.internal.ads.C2991bm;

/* loaded from: classes.dex */
public final class g extends C2991bm {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C2991bm f4261w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C2991bm c2991bm) {
        super(29);
        this.f4261w = c2991bm;
    }

    @Override // com.google.android.gms.internal.ads.C2991bm
    public final Object Q(u uVar) {
        Float f3 = (Float) ((G) this.f4261w.f29324v);
        if (f3 == null) {
            return null;
        }
        return Float.valueOf(f3.floatValue() * 2.55f);
    }
}
