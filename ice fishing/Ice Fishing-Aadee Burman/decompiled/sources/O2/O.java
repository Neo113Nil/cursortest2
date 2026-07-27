package O2;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.LD;
import g3.AbstractC4529b;
import h3.AbstractBinderC4567d;
import h3.C4564a;
import h3.C4571h;
import java.util.Set;
import m.b1;

/* loaded from: classes.dex */
public final class O extends AbstractBinderC4567d implements N2.i, N2.j {

    /* renamed from: A, reason: collision with root package name */
    public static final R2.b f2201A = AbstractC4529b.f37654a;

    /* renamed from: n, reason: collision with root package name */
    public final Context f2202n;

    /* renamed from: u, reason: collision with root package name */
    public final a3.e f2203u;

    /* renamed from: v, reason: collision with root package name */
    public final R2.b f2204v = f2201A;

    /* renamed from: w, reason: collision with root package name */
    public final Set f2205w;

    /* renamed from: x, reason: collision with root package name */
    public final b1 f2206x;

    /* renamed from: y, reason: collision with root package name */
    public C4564a f2207y;

    /* renamed from: z, reason: collision with root package name */
    public F f2208z;

    public O(Context context, a3.e eVar, b1 b1Var) {
        this.f2202n = context;
        this.f2203u = eVar;
        this.f2206x = b1Var;
        this.f2205w = (Set) b1Var.f39121n;
    }

    @Override // N2.i
    public final void onConnected(Bundle bundle) {
        this.f2207y.B(this);
    }

    @Override // N2.j
    public final void onConnectionFailed(M2.b bVar) {
        this.f2208z.b(bVar);
    }

    @Override // N2.i
    public final void onConnectionSuspended(int i) {
        this.f2207y.h();
    }

    @Override // h3.InterfaceC4568e
    public final void w3(C4571h c4571h) {
        this.f2203u.post(new LD(this, c4571h, 20, false));
    }
}
