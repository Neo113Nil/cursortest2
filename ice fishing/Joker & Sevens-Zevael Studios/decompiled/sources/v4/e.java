package v4;

import android.content.Context;
import bc.m;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final a5.c f7214a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f7215b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7216c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f7217d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7218e;

    public e(Context context, a5.c cVar) {
        this.f7214a = cVar;
        Context applicationContext = context.getApplicationContext();
        pc.j.d(applicationContext, "context.applicationContext");
        this.f7215b = applicationContext;
        this.f7216c = new Object();
        this.f7217d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(u4.b bVar) {
        pc.j.e(bVar, "listener");
        synchronized (this.f7216c) {
            if (this.f7217d.remove(bVar) && this.f7217d.isEmpty()) {
                e();
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f7216c) {
            Object obj2 = this.f7218e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f7218e = obj;
                ((a5.b) this.f7214a.f263i).execute(new a1.d(12, m.e0(this.f7217d), this));
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
