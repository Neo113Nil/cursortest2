package b3;

import P2.h;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import l3.m;

/* loaded from: classes2.dex */
public final class g extends h implements K2.a {

    /* renamed from: D, reason: collision with root package name */
    public static final P2.e f5562D = new P2.e("AppSet.API", new T2.b(1), new P2.d());

    /* renamed from: B, reason: collision with root package name */
    public final Context f5563B;

    /* renamed from: C, reason: collision with root package name */
    public final O2.f f5564C;

    public g(Context context, O2.f fVar) {
        super(context, f5562D, P2.b.f2379a, P2.g.f2384b);
        this.f5563B = context;
        this.f5564C = fVar;
    }

    @Override // K2.a
    public final m j() {
        if (this.f5564C.c(this.f5563B, 212800000) != 0) {
            return com.bumptech.glide.d.q(new P2.f(new Status(17, null, null, null)));
        }
        H3.e eVar = new H3.e();
        eVar.f1248e = new O2.d[]{K2.d.f1684a};
        eVar.f1247d = new c4.e();
        eVar.f1245b = false;
        eVar.f1246c = 27601;
        return b(0, new H3.e(eVar, (O2.d[]) eVar.f1248e, eVar.f1245b, eVar.f1246c));
    }
}
