package kotlin.text;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class CatchingFishIntentMVPDagger {
    public final WeakReference CatchingFishParcelableFAB;

    public CatchingFishIntentMVPDagger(View view) {
        this.CatchingFishParcelableFAB = new WeakReference(view);
    }

    public final void CatchingFishCoroutine(long j) {
        View view = (View) this.CatchingFishParcelableFAB.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void CatchingFishDaggerWebsocket(float f) {
        View view = (View) this.CatchingFishParcelableFAB.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public final void CatchingFishParcelableFAB(float f) {
        View view = (View) this.CatchingFishParcelableFAB.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void CatchingFishReduxKtor(CatchingFishCoroutineJUnit catchingFishCoroutineJUnit) {
        View view = (View) this.CatchingFishParcelableFAB.get();
        if (view != null) {
            if (catchingFishCoroutineJUnit != null) {
                view.animate().setListener(new CatchingFishStateLiveData(catchingFishCoroutineJUnit, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void CatchingFishSnackbar() {
        View view = (View) this.CatchingFishParcelableFAB.get();
        if (view != null) {
            view.animate().cancel();
        }
    }
}
