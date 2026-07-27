package Y2;

import M2.h;
import a.AbstractC0415a;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import h3.n;

/* loaded from: classes2.dex */
public final class g extends h implements H2.a {

    /* renamed from: D, reason: collision with root package name */
    public static final M2.e f3968D = new M2.e("AppSet.API", new Q2.b(1), new M2.d());

    /* renamed from: B, reason: collision with root package name */
    public final Context f3969B;

    /* renamed from: C, reason: collision with root package name */
    public final L2.f f3970C;

    public g(Context context, L2.f fVar) {
        super(context, f3968D, M2.b.f1880a, M2.g.f1885b);
        this.f3969B = context;
        this.f3970C = fVar;
    }

    @Override // H2.a
    public final n a() {
        if (this.f3970C.c(this.f3969B, 212800000) != 0) {
            return AbstractC0415a.q(new M2.f(new Status(17, null, null, null)));
        }
        D3.f fVar = new D3.f();
        fVar.f699e = new L2.d[]{H2.d.f1212a};
        fVar.f698d = new C3.e(this);
        fVar.f696b = false;
        fVar.f697c = 27601;
        return c(0, new D3.f(fVar, (L2.d[]) fVar.f699e, fVar.f696b, fVar.f697c));
    }
}
