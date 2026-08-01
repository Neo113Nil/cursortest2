package m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.icefishing.icefishingbigwin.C5275R;

/* renamed from: m.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4669C extends RatingBar {

    /* renamed from: n, reason: collision with root package name */
    public final C4667A f38993n;

    public C4669C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5275R.attr.ratingBarStyle);
        N0.a(getContext(), this);
        C4667A c4667a = new C4667A(this);
        this.f38993n = c4667a;
        c4667a.b(attributeSet, C5275R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i6) {
        super.onMeasure(i, i6);
        Bitmap bitmap = (Bitmap) this.f38993n.f38960c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
