package o6;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l0 extends e7.d implements n6.f, n6.g {

    /* renamed from: k, reason: collision with root package name */
    public static final d7.b f5296k = d7.c.f1718a;

    /* renamed from: d, reason: collision with root package name */
    public final Context f5297d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f5298e;

    /* renamed from: f, reason: collision with root package name */
    public final d7.b f5299f = f5296k;

    /* renamed from: g, reason: collision with root package name */
    public final Set f5300g;

    /* renamed from: h, reason: collision with root package name */
    public final p6.d f5301h;

    /* renamed from: i, reason: collision with root package name */
    public e7.a f5302i;

    /* renamed from: j, reason: collision with root package name */
    public d0 f5303j;

    public l0(Context context, a7.c cVar, p6.d dVar) {
        this.f5297d = context;
        this.f5298e = cVar;
        this.f5301h = dVar;
        this.f5300g = (Set) dVar.f5557c;
    }

    @Override // e7.e
    public final void a(e7.h hVar) {
        this.f5298e.post(new dd.i(17, this, hVar));
    }

    @Override // n6.f
    public final void onConnected(Bundle bundle) {
        this.f5302i.y(this);
    }

    @Override // n6.g
    public final void onConnectionFailed(m6.b bVar) {
        this.f5303j.b(bVar);
    }

    @Override // n6.f
    public final void onConnectionSuspended(int i10) {
        d0 d0Var = this.f5303j;
        b0 b0Var = (b0) d0Var.f5274f.f5264j.get(d0Var.f5270b);
        if (b0Var != null) {
            if (b0Var.f5240l) {
                b0Var.m(new m6.b(17));
            } else {
                b0Var.onConnectionSuspended(i10);
            }
        }
    }
}
