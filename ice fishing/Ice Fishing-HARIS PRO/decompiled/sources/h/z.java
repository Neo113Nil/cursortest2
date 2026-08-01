package h;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import k.C0179c;

/* loaded from: classes.dex */
public final class z extends ContentFrameLayout {
    public final /* synthetic */ LayoutInflaterFactory2C0159B i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B, C0179c c0179c) {
        super(c0179c, null);
        this.i = layoutInflaterFactory2C0159B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.i.t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (x2 < -5 || y2 < -5 || x2 > getWidth() + 5 || y2 > getHeight() + 5) {
                LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = this.i;
                layoutInflaterFactory2C0159B.q(layoutInflaterFactory2C0159B.y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(h0.f.n(getContext(), i));
    }
}
