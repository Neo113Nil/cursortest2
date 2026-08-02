package w2;

import E2.C0316m;
import com.google.android.gms.internal.ads.AbstractC3194f5;
import com.google.android.gms.internal.ads.C3087d5;
import com.google.android.gms.internal.ads.C3490kg;
import com.google.android.gms.internal.ads.SK;
import java.util.Map;
import l.C4659e;

/* loaded from: classes.dex */
public final class q extends AbstractC3194f5 {

    /* renamed from: F, reason: collision with root package name */
    public final C3490kg f41698F;

    /* renamed from: G, reason: collision with root package name */
    public final x2.f f41699G;

    public q(String str, C3490kg c3490kg) {
        super(0, str, new C4659e(9, c3490kg));
        this.f41698F = c3490kg;
        x2.f fVar = new x2.f();
        this.f41699G = fVar;
        if (x2.f.c()) {
            fVar.e("onNetworkRequest", new S0.i(str, "GET", null, null, 8));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3194f5
    public final com.bumptech.glide.manager.n h(C3087d5 c3087d5) {
        return new com.bumptech.glide.manager.n(c3087d5, SK.h(c3087d5));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3194f5
    public final void i(Object obj) {
        byte[] bArr;
        C3087d5 c3087d5 = (C3087d5) obj;
        Map map = c3087d5.f30481c;
        x2.f fVar = this.f41699G;
        fVar.getClass();
        if (x2.f.c()) {
            int i = c3087d5.f30479a;
            fVar.e("onNetworkResponse", new I1.a(i, map, 19));
            if (i < 200 || i >= 300) {
                fVar.e("onNetworkRequestError", new C0316m(null, 3));
            }
        }
        if (x2.f.c() && (bArr = c3087d5.f30480b) != null) {
            fVar.e("onNetworkResponseBody", new C4659e(10, bArr));
        }
        this.f41698F.b(c3087d5);
    }
}
