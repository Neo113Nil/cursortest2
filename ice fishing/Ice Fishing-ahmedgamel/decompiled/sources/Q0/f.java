package Q0;

import F.n;
import Q2.A;
import android.content.Context;
import java.util.LinkedHashSet;
import v7.AbstractC5119j;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final b3.e f2466a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2467b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2468c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f2469d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2470e;

    public f(Context context, b3.e eVar) {
        this.f2466a = eVar;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.h.d(applicationContext, "context.applicationContext");
        this.f2467b = applicationContext;
        this.f2468c = new Object();
        this.f2469d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(P0.b listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        synchronized (this.f2468c) {
            if (this.f2469d.remove(listener) && this.f2469d.isEmpty()) {
                e();
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f2468c) {
            Object obj2 = this.f2470e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f2470e = obj;
                ((A) this.f2466a.f5559w).execute(new n(4, AbstractC5119j.J(this.f2469d), this));
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
