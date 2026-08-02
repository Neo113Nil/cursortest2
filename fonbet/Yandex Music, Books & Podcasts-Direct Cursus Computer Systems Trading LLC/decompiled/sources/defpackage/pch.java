package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes3.dex */
public final class pch implements OnBackAnimationCallback {
    public final /* synthetic */ nch a;
    public final /* synthetic */ qch b;

    public pch(qch qchVar, nch nchVar) {
        this.b = qchVar;
        this.a = nchVar;
    }

    public final void onBackCancelled() {
        if (this.b.a != null) {
            this.a.cancelBackProgress();
        }
    }

    public final void onBackInvoked() {
        this.a.handleBackInvoked();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.updateBackProgress(new ri2(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.startBackProgress(new ri2(backEvent));
        }
    }
}
