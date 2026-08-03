package b0;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import m0.e2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements e2, Runnable, Choreographer.FrameCallback {

    /* renamed from: m, reason: collision with root package name */
    public static long f798m;

    /* renamed from: g, reason: collision with root package name */
    public final View f799g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f801i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f803k;

    /* renamed from: l, reason: collision with root package name */
    public long f804l;

    /* renamed from: h, reason: collision with root package name */
    public final o0.e f800h = new o0.e(new u0[16]);

    /* renamed from: j, reason: collision with root package name */
    public final Choreographer f802j = Choreographer.getInstance();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r5 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(View view) {
        float f10;
        this.f799g = view;
        if (f798m == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f10 = display.getRefreshRate();
            }
            f10 = 60.0f;
            f798m = (long) (1000000000 / f10);
        }
    }

    @Override // m0.e2
    public final void c() {
        this.f803k = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        if (this.f803k) {
            this.f804l = j3;
            this.f799g.post(this);
        }
    }

    @Override // m0.e2
    public final void h() {
        this.f803k = false;
        this.f799g.removeCallbacks(this);
        this.f802j.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0.e eVar = this.f800h;
        if (eVar.f5136i == 0 || !this.f801i || !this.f803k || this.f799g.getWindowVisibility() != 0) {
            this.f801i = false;
            return;
        }
        a aVar = new a(this.f804l + f798m);
        boolean z10 = false;
        while (eVar.f5136i != 0 && !z10) {
            if (aVar.a() <= 0 || ((u0) eVar.f5134g[0]).b(aVar)) {
                z10 = true;
            } else {
                eVar.k(0);
            }
        }
        if (z10) {
            this.f802j.postFrameCallback(this);
        } else {
            this.f801i = false;
        }
    }

    @Override // m0.e2
    public final void e() {
    }
}
