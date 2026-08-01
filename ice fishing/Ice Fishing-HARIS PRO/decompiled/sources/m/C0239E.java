package m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.lumenpath.harispro.hrnavigator.R;

/* renamed from: m.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239E extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0237C f3803a;

    public C0239E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        Q0.a(this, getContext());
        C0237C c0237c = new C0237C(this);
        this.f3803a = c0237c;
        c0237c.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f3803a.f3796c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
