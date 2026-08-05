package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class qav1gMqP extends SeekBar {
    public final a NCTxEWno;

    public qav1gMqP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        ic0.qoPGr6Ce(this, getContext());
        a aVar = new a(this);
        this.NCTxEWno = aVar;
        aVar.lwWCatUu(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.NCTxEWno;
        qav1gMqP qav1gmqp = aVar.P7K7Inc8;
        Drawable drawable = aVar.b2ZJblxo;
        if (drawable != null && drawable.isStateful() && drawable.setState(qav1gmqp.getDrawableState())) {
            qav1gmqp.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.NCTxEWno.b2ZJblxo;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.NCTxEWno.FXJmAAN1(canvas);
    }
}
