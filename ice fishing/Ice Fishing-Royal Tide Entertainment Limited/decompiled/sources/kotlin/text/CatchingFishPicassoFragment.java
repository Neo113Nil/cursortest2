package kotlin.text;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public final class CatchingFishPicassoFragment extends CatchingFishDaggerBiometric {
    public final /* synthetic */ SwipeDismissBehavior CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope = -1;
    public int CatchingFishWorkManager;

    public CatchingFishPicassoFragment(SwipeDismissBehavior swipeDismissBehavior) {
        this.CatchingFishViewModelFAB = swipeDismissBehavior;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004e, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.CatchingFishWorkManager) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // kotlin.text.CatchingFishDaggerBiometric
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishEspressoMockk(View view, float f, float f2) {
        int i;
        this.CatchingFishViewModelScope = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.CatchingFishViewModelFAB;
        if (f != 0.0f) {
            boolean z2 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.CatchingFishReduxKtor;
            if (i2 != 2) {
                i = i2 == 0 ? this.CatchingFishWorkManager : this.CatchingFishWorkManager;
            }
            if (f >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.CatchingFishWorkManager;
                if (left >= i3) {
                    i = i3 + width;
                    z = true;
                }
            }
            i = this.CatchingFishWorkManager - width;
            z = true;
        }
        if (swipeDismissBehavior.CatchingFishParcelableFAB.CatchingFishUnitTesting(i, view.getTop())) {
            view.postOnAnimation(new CatchingFishGsonRealmMoshi(swipeDismissBehavior, view, z));
        }
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final void CatchingFishJobScheduler(View view, int i) {
        this.CatchingFishViewModelScope = i;
        this.CatchingFishWorkManager = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.CatchingFishViewModelFAB;
            swipeDismissBehavior.CatchingFishCoroutine = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.CatchingFishCoroutine = false;
        }
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final boolean CatchingFishParcelable(View view, int i) {
        int i2 = this.CatchingFishViewModelScope;
        return (i2 == -1 || i2 == i) && this.CatchingFishViewModelFAB.CatchingFishNavigation(view);
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final void CatchingFishSensorManager(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.CatchingFishViewModelFAB;
        float f = width * swipeDismissBehavior.CatchingFishDaggerWebsocket;
        float width2 = view.getWidth() * swipeDismissBehavior.CatchingFishWorkManager;
        float abs = Math.abs(i - this.CatchingFishWorkManager);
        if (abs <= f) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f) / (width2 - f))), 1.0f));
        }
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final int CatchingFishSpannableWidget(View view) {
        return view.getWidth();
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final int CatchingFishViewModelScope(View view, int i) {
        return view.getTop();
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final int CatchingFishWorkManager(View view, int i) {
        int width;
        int width2;
        int width3;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.CatchingFishViewModelFAB.CatchingFishReduxKtor;
        if (i2 == 0) {
            if (z) {
                width = this.CatchingFishWorkManager - view.getWidth();
                width2 = this.CatchingFishWorkManager;
            } else {
                width = this.CatchingFishWorkManager;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.CatchingFishWorkManager - view.getWidth();
            width2 = view.getWidth() + this.CatchingFishWorkManager;
        } else if (z) {
            width = this.CatchingFishWorkManager;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.CatchingFishWorkManager - view.getWidth();
            width2 = this.CatchingFishWorkManager;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final void CatchingFishPayPalService(int i) {
    }
}
