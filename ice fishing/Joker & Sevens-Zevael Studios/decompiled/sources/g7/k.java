package g7;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k implements l, e, d, b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2544g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f2545h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f2546i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2547j;

    public k(Executor executor, b bVar) {
        this.f2544g = 0;
        this.f2546i = new Object();
        this.f2545h = executor;
        this.f2547j = bVar;
    }

    @Override // g7.l
    public final void a(o oVar) {
        switch (this.f2544g) {
            case 0:
                if (oVar.f2555d) {
                    synchronized (this.f2546i) {
                    }
                    this.f2545h.execute(new b4.g(2, this));
                    return;
                }
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                synchronized (this.f2546i) {
                }
                this.f2545h.execute(new dd.i(5, this, oVar));
                return;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                if (oVar.i() || oVar.f2555d) {
                    return;
                }
                synchronized (this.f2546i) {
                }
                this.f2545h.execute(new dd.i(6, this, oVar));
                return;
            case 3:
                if (oVar.i()) {
                    synchronized (this.f2546i) {
                    }
                    this.f2545h.execute(new dd.i(7, this, oVar));
                    return;
                }
                return;
            default:
                this.f2545h.execute(new dd.i(8, this, oVar));
                return;
        }
    }

    @Override // g7.b
    public void b() {
        ((o) this.f2547j).m();
    }

    @Override // g7.e
    public void d(Object obj) {
        ((o) this.f2547j).l(obj);
    }

    @Override // g7.d
    public void j(Exception exc) {
        ((o) this.f2547j).k(exc);
    }

    public k(Executor executor, c cVar) {
        this.f2544g = 1;
        this.f2546i = new Object();
        this.f2545h = executor;
        this.f2547j = cVar;
    }

    public k(Executor executor, d dVar) {
        this.f2544g = 2;
        this.f2546i = new Object();
        this.f2545h = executor;
        this.f2547j = dVar;
    }

    public k(Executor executor, e eVar) {
        this.f2544g = 3;
        this.f2546i = new Object();
        this.f2545h = executor;
        this.f2547j = eVar;
    }

    public k(Executor executor, g gVar, o oVar) {
        this.f2544g = 4;
        this.f2545h = executor;
        this.f2546i = gVar;
        this.f2547j = oVar;
    }
}
