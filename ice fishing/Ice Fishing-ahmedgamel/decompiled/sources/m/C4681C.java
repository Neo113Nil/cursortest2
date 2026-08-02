package m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.IceFishing.LiveIceFishing.C5248R;

/* renamed from: m.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4681C extends RatingBar {

    /* renamed from: n, reason: collision with root package name */
    public final C4679A f39061n;

    public C4681C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5248R.attr.ratingBarStyle);
        N0.a(getContext(), this);
        C4679A c4679a = new C4679A(this);
        this.f39061n = c4679a;
        c4679a.b(attributeSet, C5248R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        Bitmap bitmap = (Bitmap) this.f39061n.f39028c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
