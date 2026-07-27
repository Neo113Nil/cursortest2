package kotlin.text;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class CatchingFishMVICardView {
    public int CatchingFishCoroutine;
    public Interpolator CatchingFishDaggerWebsocket;
    public int CatchingFishParcelableFAB;
    public int CatchingFishReduxKtor;
    public int CatchingFishSnackbar;
    public boolean CatchingFishWorkManager;

    public final void CatchingFishParcelableFAB(RecyclerView recyclerView) {
        int i = this.CatchingFishReduxKtor;
        if (i >= 0) {
            this.CatchingFishReduxKtor = -1;
            recyclerView.CatchingFishHandler(i);
            this.CatchingFishWorkManager = false;
        } else if (this.CatchingFishWorkManager) {
            Interpolator interpolator = this.CatchingFishDaggerWebsocket;
            if (interpolator != null && this.CatchingFishCoroutine < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.CatchingFishCoroutine;
            if (i2 < 1) {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            recyclerView.CatchingFishMoshiDaggerHilt.CatchingFishSnackbar(this.CatchingFishParcelableFAB, this.CatchingFishSnackbar, i2, interpolator);
            this.CatchingFishWorkManager = false;
        }
    }
}
