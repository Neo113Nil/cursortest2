package t2;

import B2.C0280n;
import com.google.android.gms.internal.ads.AbstractC3074d5;
import com.google.android.gms.internal.ads.AbstractC3217fl;
import com.google.android.gms.internal.ads.C2965b5;
import com.google.android.gms.internal.ads.C3320hg;
import java.util.Map;

/* loaded from: classes.dex */
public final class r extends AbstractC3074d5 {

    /* renamed from: F, reason: collision with root package name */
    public final C3320hg f40931F;

    /* renamed from: G, reason: collision with root package name */
    public final u2.f f40932G;

    public r(String str, C3320hg c3320hg) {
        super(0, str, new h8.d(8, c3320hg));
        this.f40931F = c3320hg;
        u2.f fVar = new u2.f();
        this.f40932G = fVar;
        if (u2.f.c()) {
            fVar.e("onNetworkRequest", new f4.p(str, "GET", null, null, 7));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3074d5
    public final com.bumptech.glide.manager.n h(C2965b5 c2965b5) {
        return new com.bumptech.glide.manager.n(c2965b5, AbstractC3217fl.g(c2965b5));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3074d5
    public final void i(Object obj) {
        byte[] bArr;
        C2965b5 c2965b5 = (C2965b5) obj;
        Map map = c2965b5.f29403c;
        u2.f fVar = this.f40932G;
        fVar.getClass();
        if (u2.f.c()) {
            int i = c2965b5.f29401a;
            fVar.e("onNetworkResponse", new G1.a(i, map, 19));
            if (i < 200 || i >= 300) {
                fVar.e("onNetworkRequestError", new C0280n(null, 2));
            }
        }
        if (u2.f.c() && (bArr = c2965b5.f29402b) != null) {
            fVar.e("onNetworkResponseBody", new h8.d(10, bArr));
        }
        this.f40931F.a(c2965b5);
    }
}
