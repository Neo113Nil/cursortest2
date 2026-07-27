package m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.icefishing.icefishingliveapp.C5284R;

/* renamed from: m.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4716C extends RatingBar {

    /* renamed from: n, reason: collision with root package name */
    public final C4714A f39260n;

    public C4716C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5284R.attr.ratingBarStyle);
        N0.a(getContext(), this);
        C4714A c4714a = new C4714A(this);
        this.f39260n = c4714a;
        c4714a.b(attributeSet, C5284R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        Bitmap bitmap = (Bitmap) this.f39260n.f39227c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
