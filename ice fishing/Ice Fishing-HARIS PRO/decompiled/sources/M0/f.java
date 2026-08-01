package M0;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import b.C0106b;

/* loaded from: classes.dex */
public final class f implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f614b;

    public f(g gVar, b bVar) {
        this.f614b = gVar;
        this.f613a = bVar;
    }

    public final void onBackCancelled() {
        if (this.f614b.f612a != null) {
            this.f613a.d();
        }
    }

    public final void onBackInvoked() {
        this.f613a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f614b.f612a != null) {
            this.f613a.b(new C0106b(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f614b.f612a != null) {
            this.f613a.c(new C0106b(backEvent));
        }
    }
}
