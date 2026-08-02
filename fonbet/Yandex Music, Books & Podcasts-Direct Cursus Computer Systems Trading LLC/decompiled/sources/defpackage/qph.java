package defpackage;

import android.view.animation.Animation;
import androidx.mediarouter.app.OverlayListView;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class qph implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ aqh b;

    public /* synthetic */ qph(aqh aqhVar, int i) {
        this.a = i;
        this.b = aqhVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                this.b.i(true);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                break;
            default:
                aqh aqhVar = this.b;
                OverlayListView overlayListView = aqhVar.E;
                Iterator it = overlayListView.a.iterator();
                while (it.hasNext()) {
                    fzj fzjVar = (fzj) it.next();
                    if (!fzjVar.j) {
                        fzjVar.i = overlayListView.getDrawingTime();
                        fzjVar.j = true;
                    }
                }
                aqhVar.E.postDelayed(aqhVar.U0, aqhVar.N0);
                break;
        }
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
