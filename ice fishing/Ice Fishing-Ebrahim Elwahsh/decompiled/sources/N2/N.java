package N2;

import B2.RunnableC0272f;
import android.content.Context;
import android.os.Bundle;
import e3.AbstractC4471b;
import f3.AbstractBinderC4504c;
import f3.C4502a;
import f3.C4508g;
import java.util.Set;
import m.c1;

/* loaded from: classes.dex */
public final class N extends AbstractBinderC4504c implements M2.i, M2.j {

    /* renamed from: A, reason: collision with root package name */
    public static final Q2.b f2018A = AbstractC4471b.f37326a;

    /* renamed from: n, reason: collision with root package name */
    public final Context f2019n;

    /* renamed from: u, reason: collision with root package name */
    public final Z2.e f2020u;

    /* renamed from: v, reason: collision with root package name */
    public final Q2.b f2021v = f2018A;

    /* renamed from: w, reason: collision with root package name */
    public final Set f2022w;

    /* renamed from: x, reason: collision with root package name */
    public final c1 f2023x;

    /* renamed from: y, reason: collision with root package name */
    public C4502a f2024y;

    /* renamed from: z, reason: collision with root package name */
    public E f2025z;

    public N(Context context, Z2.e eVar, c1 c1Var) {
        this.f2019n = context;
        this.f2020u = eVar;
        this.f2023x = c1Var;
        this.f2022w = (Set) c1Var.f39394n;
    }

    @Override // f3.InterfaceC4505d
    public final void i2(C4508g c4508g) {
        this.f2020u.post(new RunnableC0272f(this, c4508g, 15, false));
    }

    @Override // M2.i
    public final void onConnected(Bundle bundle) {
        this.f2024y.B(this);
    }

    @Override // M2.j
    public final void onConnectionFailed(L2.b bVar) {
        this.f2025z.b(bVar);
    }

    @Override // M2.i
    public final void onConnectionSuspended(int i) {
        this.f2024y.h();
    }
}
