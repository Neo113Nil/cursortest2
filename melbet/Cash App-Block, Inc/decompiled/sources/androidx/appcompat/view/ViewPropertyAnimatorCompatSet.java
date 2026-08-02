package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ViewPropertyAnimatorCompatSet {
    public Interpolator mInterpolator;
    public boolean mIsStarted;
    public ViewPropertyAnimatorListener mListener;
    public long mDuration = -1;
    public final ToolbarWidgetWrapper.AnonymousClass2 mProxyListener = new ToolbarWidgetWrapper.AnonymousClass2(this);
    public final ArrayList mAnimators = new ArrayList();

    public final void cancel() {
        if (this.mIsStarted) {
            Iterator it = this.mAnimators.iterator();
            while (it.hasNext()) {
                ((ViewPropertyAnimatorCompat) it.next()).cancel();
            }
            this.mIsStarted = false;
        }
    }

    public final void start() {
        View view;
        if (this.mIsStarted) {
            return;
        }
        Iterator it = this.mAnimators.iterator();
        while (it.hasNext()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) it.next();
            long j = this.mDuration;
            if (j >= 0) {
                viewPropertyAnimatorCompat.setDuration(j);
            }
            Interpolator interpolator = this.mInterpolator;
            if (interpolator != null && (view = (View) viewPropertyAnimatorCompat.mView.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.mListener != null) {
                viewPropertyAnimatorCompat.setListener(this.mProxyListener);
            }
            View view2 = (View) viewPropertyAnimatorCompat.mView.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.mIsStarted = true;
    }
}
