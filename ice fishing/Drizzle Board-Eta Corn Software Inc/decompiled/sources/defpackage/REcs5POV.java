package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class REcs5POV extends ContentFrameLayout {
    public final /* synthetic */ SJ7tYVsF eVhOlqcC;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public REcs5POV(SJ7tYVsF sJ7tYVsF, f9 f9Var) {
        super(f9Var);
        this.eVhOlqcC = sJ7tYVsF;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.eVhOlqcC.Ey6iv0m0(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                SJ7tYVsF sJ7tYVsF = this.eVhOlqcC;
                sJ7tYVsF.amk52bBQ(sJ7tYVsF.WYNAV5pd(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(ra.Ey6iv0m0(getContext(), i));
    }
}
