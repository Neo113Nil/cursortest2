package defpackage;

import androidx.fragment.app.o;

/* loaded from: classes.dex */
public final class etc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ etc(o oVar, int i) {
        this.a = i;
        this.b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.startPostponedEnterTransition();
                break;
            default:
                this.b.callStartTransitionListener(false);
                break;
        }
    }
}
