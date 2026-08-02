package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.t86;

/* loaded from: classes.dex */
public class Guideline extends View {
    public boolean a;

    public Guideline(Context context) {
        super(context);
        this.a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.a = z;
    }

    public void setGuidelineBegin(int i) {
        t86 t86Var = (t86) getLayoutParams();
        if (this.a && t86Var.a == i) {
            return;
        }
        t86Var.a = i;
        setLayoutParams(t86Var);
    }

    public void setGuidelineEnd(int i) {
        t86 t86Var = (t86) getLayoutParams();
        if (this.a && t86Var.b == i) {
            return;
        }
        t86Var.b = i;
        setLayoutParams(t86Var);
    }

    public void setGuidelinePercent(float f) {
        t86 t86Var = (t86) getLayoutParams();
        if (this.a && t86Var.c == f) {
            return;
        }
        t86Var.c = f;
        setLayoutParams(t86Var);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.a = true;
        super.setVisibility(8);
    }
}
