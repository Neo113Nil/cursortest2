package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class sr0 extends SeekBar {
    public final tr0 a;

    public sr0(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        gfs.a(getContext(), this);
        tr0 tr0Var = new tr0(this);
        this.a = tr0Var;
        tr0Var.y(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        tr0 tr0Var = this.a;
        sr0 sr0Var = tr0Var.h;
        Drawable drawable = tr0Var.i;
        if (drawable != null && drawable.isStateful() && drawable.setState(sr0Var.getDrawableState())) {
            sr0Var.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.K(canvas);
    }

    public sr0(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public sr0(@NonNull Context context) {
        this(context, null);
    }
}
