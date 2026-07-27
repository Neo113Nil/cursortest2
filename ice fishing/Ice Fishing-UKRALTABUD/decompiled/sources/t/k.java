package t;

import android.os.Handler;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public d f2979f;

    /* renamed from: g, reason: collision with root package name */
    public e f2980g;

    /* renamed from: h, reason: collision with root package name */
    public Handler f2981h;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            obj = this.f2979f.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f2981h.post(new P0.i(this.f2980g, obj, 4, false));
    }
}
