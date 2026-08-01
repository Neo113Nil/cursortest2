package androidx.lifecycle;

import D.RunnableC0282a;
import android.os.Handler;
import g1.C4523c;

/* loaded from: classes.dex */
public final class G implements InterfaceC0503v {

    /* renamed from: B, reason: collision with root package name */
    public static final G f5103B = new G();

    /* renamed from: n, reason: collision with root package name */
    public int f5105n;

    /* renamed from: u, reason: collision with root package name */
    public int f5106u;

    /* renamed from: x, reason: collision with root package name */
    public Handler f5109x;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5107v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5108w = true;

    /* renamed from: y, reason: collision with root package name */
    public final C0505x f5110y = new C0505x(this);

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0282a f5111z = new RunnableC0282a(13, this);

    /* renamed from: A, reason: collision with root package name */
    public final C4523c f5104A = new C4523c(14, this);

    public final void a() {
        int i = this.f5106u + 1;
        this.f5106u = i;
        if (i == 1) {
            if (this.f5107v) {
                this.f5110y.e(EnumC0496n.ON_RESUME);
                this.f5107v = false;
            } else {
                Handler handler = this.f5109x;
                kotlin.jvm.internal.h.b(handler);
                handler.removeCallbacks(this.f5111z);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0503v
    public final AbstractC0498p getLifecycle() {
        return this.f5110y;
    }
}
