package z;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class p extends View {

    /* renamed from: n, reason: collision with root package name */
    public boolean f42093n;

    public p(Context context) {
        super(context);
        this.f42093n = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z8) {
        this.f42093n = z8;
    }

    public void setGuidelineBegin(int i) {
        e eVar = (e) getLayoutParams();
        if (this.f42093n && eVar.f41927a == i) {
            return;
        }
        eVar.f41927a = i;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i) {
        e eVar = (e) getLayoutParams();
        if (this.f42093n && eVar.f41929b == i) {
            return;
        }
        eVar.f41929b = i;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f6) {
        e eVar = (e) getLayoutParams();
        if (this.f42093n && eVar.f41931c == f6) {
            return;
        }
        eVar.f41931c = f6;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
