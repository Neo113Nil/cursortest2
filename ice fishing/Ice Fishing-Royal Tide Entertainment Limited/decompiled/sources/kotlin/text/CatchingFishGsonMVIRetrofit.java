package kotlin.text;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishGsonMVIRetrofit {
    public Interpolator CatchingFishCoroutine;
    public boolean CatchingFishDaggerWebsocket;
    public CatchingFishCoroutineJUnit CatchingFishReduxKtor;
    public long CatchingFishSnackbar = -1;
    public final CatchingFishWidgetAndroidX CatchingFishWorkManager = new CatchingFishWidgetAndroidX(this);
    public final ArrayList CatchingFishParcelableFAB = new ArrayList();

    public final void CatchingFishParcelableFAB() {
        if (this.CatchingFishDaggerWebsocket) {
            ArrayList arrayList = this.CatchingFishParcelableFAB;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((CatchingFishIntentMVPDagger) obj).CatchingFishSnackbar();
            }
            this.CatchingFishDaggerWebsocket = false;
        }
    }

    public final void CatchingFishSnackbar() {
        View view;
        if (this.CatchingFishDaggerWebsocket) {
            return;
        }
        ArrayList arrayList = this.CatchingFishParcelableFAB;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            CatchingFishIntentMVPDagger catchingFishIntentMVPDagger = (CatchingFishIntentMVPDagger) obj;
            long j = this.CatchingFishSnackbar;
            if (j >= 0) {
                catchingFishIntentMVPDagger.CatchingFishCoroutine(j);
            }
            Interpolator interpolator = this.CatchingFishCoroutine;
            if (interpolator != null && (view = (View) catchingFishIntentMVPDagger.CatchingFishParcelableFAB.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.CatchingFishReduxKtor != null) {
                catchingFishIntentMVPDagger.CatchingFishReduxKtor(this.CatchingFishWorkManager);
            }
            View view2 = (View) catchingFishIntentMVPDagger.CatchingFishParcelableFAB.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.CatchingFishDaggerWebsocket = true;
    }
}
