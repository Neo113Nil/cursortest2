package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class npj implements OnBackAnimationCallback {
    public final /* synthetic */ lpj a;
    public final /* synthetic */ lpj b;
    public final /* synthetic */ mpj c;
    public final /* synthetic */ mpj d;

    public npj(lpj lpjVar, lpj lpjVar2, mpj mpjVar, mpj mpjVar2) {
        this.a = lpjVar;
        this.b = lpjVar2;
        this.c = mpjVar;
        this.d = mpjVar2;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.invoke(new ri2(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.invoke(new ri2(backEvent));
    }
}
