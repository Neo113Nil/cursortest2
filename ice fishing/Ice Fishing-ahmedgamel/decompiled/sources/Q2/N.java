package Q2;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.LD;
import i3.AbstractC4592b;
import j3.AbstractBinderC4615d;
import j3.C4612a;
import j3.C4619h;
import java.util.Set;
import m.c1;

/* loaded from: classes.dex */
public final class N extends AbstractBinderC4615d implements P2.i, P2.j {

    /* renamed from: A, reason: collision with root package name */
    public static final T2.b f2519A = AbstractC4592b.f38181a;

    /* renamed from: n, reason: collision with root package name */
    public final Context f2520n;

    /* renamed from: u, reason: collision with root package name */
    public final c3.e f2521u;

    /* renamed from: v, reason: collision with root package name */
    public final T2.b f2522v = f2519A;

    /* renamed from: w, reason: collision with root package name */
    public final Set f2523w;

    /* renamed from: x, reason: collision with root package name */
    public final c1 f2524x;

    /* renamed from: y, reason: collision with root package name */
    public C4612a f2525y;

    /* renamed from: z, reason: collision with root package name */
    public E f2526z;

    public N(Context context, c3.e eVar, c1 c1Var) {
        this.f2520n = context;
        this.f2521u = eVar;
        this.f2524x = c1Var;
        this.f2523w = (Set) c1Var.f39192n;
    }

    @Override // j3.InterfaceC4616e
    public final void M1(C4619h c4619h) {
        this.f2521u.post(new LD(this, c4619h, 20, false));
    }

    @Override // P2.i
    public final void onConnected(Bundle bundle) {
        this.f2525y.B(this);
    }

    @Override // P2.j
    public final void onConnectionFailed(O2.b bVar) {
        this.f2526z.b(bVar);
    }

    @Override // P2.i
    public final void onConnectionSuspended(int i) {
        this.f2525y.g();
    }
}
