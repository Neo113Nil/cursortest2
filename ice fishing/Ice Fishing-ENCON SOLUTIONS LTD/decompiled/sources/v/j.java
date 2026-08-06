package v;

import android.os.Handler;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public c f8505a;

    /* renamed from: b, reason: collision with root package name */
    public d f8506b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f8507c;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            obj = this.f8505a.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f8507c.post(new D0.f(this.f8506b, obj, 9, false));
    }
}
