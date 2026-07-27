package kotlin.text;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class CatchingFishReduxMockkRealm implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public ViewTreeObserver CatchingFishDaggerWebsocket;
    public final View CatchingFishReduxKtor;
    public final Runnable CatchingFishWorkManager;

    public CatchingFishReduxMockkRealm(View view, Runnable runnable) {
        this.CatchingFishReduxKtor = view;
        this.CatchingFishDaggerWebsocket = view.getViewTreeObserver();
        this.CatchingFishWorkManager = runnable;
    }

    public static void CatchingFishParcelableFAB(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        CatchingFishReduxMockkRealm catchingFishReduxMockkRealm = new CatchingFishReduxMockkRealm(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(catchingFishReduxMockkRealm);
        view.addOnAttachStateChangeListener(catchingFishReduxMockkRealm);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.CatchingFishDaggerWebsocket.isAlive();
        View view = this.CatchingFishReduxKtor;
        if (isAlive) {
            this.CatchingFishDaggerWebsocket.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.CatchingFishWorkManager.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.CatchingFishDaggerWebsocket = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.CatchingFishDaggerWebsocket.isAlive();
        View view2 = this.CatchingFishReduxKtor;
        if (isAlive) {
            this.CatchingFishDaggerWebsocket.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
