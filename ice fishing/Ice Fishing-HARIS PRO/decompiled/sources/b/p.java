package b;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class p implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1.l f2309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1.l f2310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1.a f2311c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1.a f2312d;

    public p(C1.l lVar, C1.l lVar2, C1.a aVar, C1.a aVar2) {
        this.f2309a = lVar;
        this.f2310b = lVar2;
        this.f2311c = aVar;
        this.f2312d = aVar2;
    }

    public final void onBackCancelled() {
        this.f2312d.c();
    }

    public final void onBackInvoked() {
        this.f2311c.c();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        D1.i.e(backEvent, "backEvent");
        this.f2310b.g(new C0106b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        D1.i.e(backEvent, "backEvent");
        this.f2309a.g(new C0106b(backEvent));
    }
}
