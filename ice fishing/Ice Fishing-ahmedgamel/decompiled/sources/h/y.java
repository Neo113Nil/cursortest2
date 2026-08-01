package h;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import k.C4617d;

/* loaded from: classes.dex */
public final class y extends ContentFrameLayout {

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C4533A f37926B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A, C4617d c4617d) {
        super(c4617d, null);
        this.f37926B = layoutInflaterFactory2C4533A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f37926B.v(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x9 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            if (x9 < -5 || y7 < -5 || x9 > getWidth() + 5 || y7 > getHeight() + 5) {
                LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A = this.f37926B;
                layoutInflaterFactory2C4533A.t(layoutInflaterFactory2C4533A.B(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(com.bumptech.glide.g.e(getContext(), i));
    }
}
