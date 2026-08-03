package d;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f1539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f1540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f1541c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f1542d;

    public u(r rVar, r rVar2, s sVar, s sVar2) {
        this.f1539a = rVar;
        this.f1540b = rVar2;
        this.f1541c = sVar;
        this.f1542d = sVar2;
    }

    public final void onBackCancelled() {
        this.f1542d.invoke();
    }

    public final void onBackInvoked() {
        this.f1541c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        pc.j.e(backEvent, "backEvent");
        this.f1540b.invoke(new c(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        pc.j.e(backEvent, "backEvent");
        this.f1539a.invoke(new c(backEvent));
    }
}
