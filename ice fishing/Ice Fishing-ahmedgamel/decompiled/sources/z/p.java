package z;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class p extends View {

    /* renamed from: n, reason: collision with root package name */
    public boolean f42211n;

    public p(Context context) {
        super(context);
        this.f42211n = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i6) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z3) {
        this.f42211n = z3;
    }

    public void setGuidelineBegin(int i) {
        e eVar = (e) getLayoutParams();
        if (this.f42211n && eVar.f42045a == i) {
            return;
        }
        eVar.f42045a = i;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i) {
        e eVar = (e) getLayoutParams();
        if (this.f42211n && eVar.f42047b == i) {
            return;
        }
        eVar.f42047b = i;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f3) {
        e eVar = (e) getLayoutParams();
        if (this.f42211n && eVar.f42049c == f3) {
            return;
        }
        eVar.f42049c = f3;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
