package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.lumenpath.harispro.hrnavigator.R;

/* renamed from: m.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241G extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final H f3829a;

    public C0241G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        Q0.a(this, getContext());
        H h2 = new H(this);
        this.f3829a = h2;
        h2.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        H h2 = this.f3829a;
        Drawable drawable = h2.f3830f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0241G c0241g = h2.e;
        if (drawable.setState(c0241g.getDrawableState())) {
            c0241g.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3829a.f3830f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3829a.g(canvas);
    }
}
