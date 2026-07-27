package Q0;

import F.n;
import O2.B;
import android.content.Context;
import java.util.LinkedHashSet;
import v7.AbstractC5129j;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final Z2.e f2631a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2632b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2633c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f2634d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2635e;

    public f(Context context, Z2.e eVar) {
        this.f2631a = eVar;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.h.d(applicationContext, "context.applicationContext");
        this.f2632b = applicationContext;
        this.f2633c = new Object();
        this.f2634d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(P0.b listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        synchronized (this.f2633c) {
            if (this.f2634d.remove(listener) && this.f2634d.isEmpty()) {
                e();
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f2633c) {
            Object obj2 = this.f2635e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f2635e = obj;
                ((B) this.f2631a.f4172w).execute(new n(4, AbstractC5129j.L(this.f2634d), this));
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
