package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.icefishinggame.icefishinggamemultigames.C5275R;

/* renamed from: m.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4671E extends SeekBar {

    /* renamed from: n, reason: collision with root package name */
    public final C4672F f38994n;

    public C4671E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5275R.attr.seekBarStyle);
        N0.a(getContext(), this);
        C4672F c4672f = new C4672F(this);
        this.f38994n = c4672f;
        c4672f.b(attributeSet, C5275R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C4672F c4672f = this.f38994n;
        Drawable drawable = c4672f.f38996f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C4671E c4671e = c4672f.f38995e;
        if (drawable.setState(c4671e.getDrawableState())) {
            c4671e.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f38994n.f38996f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f38994n.g(canvas);
    }
}
