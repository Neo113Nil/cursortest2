package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.IceFishing.LiveIceFishing.C5248R;

/* renamed from: m.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4683E extends SeekBar {

    /* renamed from: n, reason: collision with root package name */
    public final C4684F f39062n;

    public C4683E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5248R.attr.seekBarStyle);
        N0.a(getContext(), this);
        C4684F c4684f = new C4684F(this);
        this.f39062n = c4684f;
        c4684f.b(attributeSet, C5248R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C4684F c4684f = this.f39062n;
        Drawable drawable = c4684f.f39064f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C4683E c4683e = c4684f.f39063e;
        if (drawable.setState(c4683e.getDrawableState())) {
            c4683e.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f39062n.f39064f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f39062n.g(canvas);
    }
}
