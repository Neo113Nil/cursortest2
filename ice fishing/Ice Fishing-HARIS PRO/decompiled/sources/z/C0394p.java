package z;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* renamed from: z.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0394p extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4964a;

    public C0394p(Context context) {
        super(context);
        this.f4964a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z2) {
        this.f4964a = z2;
    }

    public void setGuidelineBegin(int i) {
        C0383e c0383e = (C0383e) getLayoutParams();
        if (this.f4964a && c0383e.f4809a == i) {
            return;
        }
        c0383e.f4809a = i;
        setLayoutParams(c0383e);
    }

    public void setGuidelineEnd(int i) {
        C0383e c0383e = (C0383e) getLayoutParams();
        if (this.f4964a && c0383e.f4811b == i) {
            return;
        }
        c0383e.f4811b = i;
        setLayoutParams(c0383e);
    }

    public void setGuidelinePercent(float f2) {
        C0383e c0383e = (C0383e) getLayoutParams();
        if (this.f4964a && c0383e.f4813c == f2) {
            return;
        }
        c0383e.f4813c = f2;
        setLayoutParams(c0383e);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
