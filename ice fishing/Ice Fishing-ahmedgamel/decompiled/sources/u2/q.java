package u2;

import C2.C0280m;
import com.google.android.gms.internal.ads.AbstractC3171f5;
import com.google.android.gms.internal.ads.C3064d5;
import com.google.android.gms.internal.ads.C3467kg;
import com.google.android.gms.internal.ads.SK;
import java.util.Map;
import t0.C4986A;

/* loaded from: classes.dex */
public final class q extends AbstractC3171f5 {

    /* renamed from: F, reason: collision with root package name */
    public final C3467kg f41308F;

    /* renamed from: G, reason: collision with root package name */
    public final v2.f f41309G;

    public q(String str, C3467kg c3467kg) {
        super(0, str, new C4986A(c3467kg));
        this.f41308F = c3467kg;
        v2.f fVar = new v2.f();
        this.f41309G = fVar;
        if (v2.f.c()) {
            fVar.e("onNetworkRequest", new S0.i(str, "GET", null, null, 8));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3171f5
    public final com.bumptech.glide.manager.o h(C3064d5 c3064d5) {
        return new com.bumptech.glide.manager.o(c3064d5, SK.h(c3064d5));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3171f5
    public final void i(Object obj) {
        byte[] bArr;
        C3064d5 c3064d5 = (C3064d5) obj;
        Map map = c3064d5.f29709c;
        v2.f fVar = this.f41309G;
        fVar.getClass();
        if (v2.f.c()) {
            int i = c3064d5.f29707a;
            fVar.e("onNetworkResponse", new G1.a(i, map, 19));
            if (i < 200 || i >= 300) {
                fVar.e("onNetworkRequestError", new C0280m(null));
            }
        }
        if (v2.f.c() && (bArr = c3064d5.f29708b) != null) {
            fVar.e("onNetworkResponseBody", new C4986A(bArr));
        }
        this.f41308F.b(c3064d5);
    }
}
