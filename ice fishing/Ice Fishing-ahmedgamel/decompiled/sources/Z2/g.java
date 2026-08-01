package Z2;

import N2.h;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import j3.m;

/* loaded from: classes2.dex */
public final class g extends h implements I2.a {

    /* renamed from: D, reason: collision with root package name */
    public static final N2.e f4175D = new N2.e("AppSet.API", new R2.b(1), new N2.d());

    /* renamed from: B, reason: collision with root package name */
    public final Context f4176B;

    /* renamed from: C, reason: collision with root package name */
    public final M2.f f4177C;

    public g(Context context, M2.f fVar) {
        super(context, f4175D, N2.b.f1935a, N2.g.f1940b);
        this.f4176B = context;
        this.f4177C = fVar;
    }

    @Override // I2.a
    public final m b() {
        if (this.f4177C.c(this.f4176B, 212800000) != 0) {
            return S0.f.h(new N2.f(new Status(17, null, null, null)));
        }
        F3.e eVar = new F3.e();
        eVar.f963e = new M2.d[]{I2.d.f1291a};
        eVar.f962d = new a4.e();
        eVar.f960b = false;
        eVar.f961c = 27601;
        return c(0, new F3.e(eVar, (M2.d[]) eVar.f963e, eVar.f960b, eVar.f961c));
    }
}
