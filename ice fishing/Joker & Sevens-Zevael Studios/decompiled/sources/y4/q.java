package y4;

import android.content.Context;
import java.util.UUID;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z4.j f8769g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ UUID f8770h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o4.g f8771i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f8772j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r f8773k;

    public q(r rVar, z4.j jVar, UUID uuid, o4.g gVar, Context context) {
        this.f8773k = rVar;
        this.f8769g = jVar;
        this.f8770h = uuid;
        this.f8771i = gVar;
        this.f8772j = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f8769g.f9129g instanceof z4.a)) {
                String uuid = this.f8770h.toString();
                x4.p k3 = this.f8773k.f8776c.k(uuid);
                if (k3 == null || a4.d.a(k3.f8323b)) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((p4.e) this.f8773k.f8775b).g(uuid, this.f8771i);
                this.f8772j.startService(w4.b.a(this.f8772j, ud.g.h(k3), this.f8771i));
            }
            this.f8769g.i(null);
        } catch (Throwable th) {
            this.f8769g.j(th);
        }
    }
}
