package i6;

import android.util.Log;
import x.e0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements g7.d {

    /* renamed from: g, reason: collision with root package name */
    public long f3209g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f3210h;

    public /* synthetic */ c(d dVar, long j3) {
        this.f3210h = dVar;
        this.f3209g = j3;
    }

    @Override // g7.d
    public void j(Exception exc) {
        m6.b bVar;
        d dVar = (d) this.f3210h;
        long j3 = this.f3209g;
        Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
        if ((exc instanceof n6.d) && (bVar = ((n6.d) exc).f5074g.f1424j) != null && bVar.f4903h == 24) {
            dVar.f3215b.set(j3);
        }
    }

    public c(e0 e0Var) {
        this.f3210h = e0Var;
        this.f3209g = 0L;
    }
}
