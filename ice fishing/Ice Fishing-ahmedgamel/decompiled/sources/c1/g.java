package c1;

import G3.u;
import Z0.G;
import com.google.android.gms.internal.ads.LP;

/* loaded from: classes.dex */
public final class g extends LP {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ LP f5656w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LP lp) {
        super(3);
        this.f5656w = lp;
    }

    @Override // com.google.android.gms.internal.ads.LP
    public final Object c(u uVar) {
        Float f2 = (Float) ((G) this.f5656w.f26917v);
        if (f2 == null) {
            return null;
        }
        return Float.valueOf(f2.floatValue() * 2.55f);
    }
}
