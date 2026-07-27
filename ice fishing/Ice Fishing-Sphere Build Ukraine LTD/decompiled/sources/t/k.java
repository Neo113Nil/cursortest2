package t;

import android.os.Handler;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public d f2984e;

    /* renamed from: f, reason: collision with root package name */
    public e f2985f;

    /* renamed from: g, reason: collision with root package name */
    public Handler f2986g;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            obj = this.f2984e.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f2986g.post(new Q0.i(this.f2985f, obj, 4, false));
    }
}
