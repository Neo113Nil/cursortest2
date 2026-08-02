package z;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class p extends View {

    /* renamed from: n, reason: collision with root package name */
    public boolean f42182n;

    public p(Context context) {
        super(context);
        this.f42182n = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z6) {
        this.f42182n = z6;
    }

    public void setGuidelineBegin(int i) {
        e eVar = (e) getLayoutParams();
        if (this.f42182n && eVar.f42016a == i) {
            return;
        }
        eVar.f42016a = i;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i) {
        e eVar = (e) getLayoutParams();
        if (this.f42182n && eVar.f42018b == i) {
            return;
        }
        eVar.f42018b = i;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f2) {
        e eVar = (e) getLayoutParams();
        if (this.f42182n && eVar.f42020c == f2) {
            return;
        }
        eVar.f42020c = f2;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
