package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class zl extends View {
    public boolean NCTxEWno;

    public zl(Context context) {
        super(context);
        this.NCTxEWno = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.NCTxEWno = z;
    }

    public void setGuidelineBegin(int i) {
        i8 i8Var = (i8) getLayoutParams();
        if (this.NCTxEWno && i8Var.qoPGr6Ce == i) {
            return;
        }
        i8Var.qoPGr6Ce = i;
        setLayoutParams(i8Var);
    }

    public void setGuidelineEnd(int i) {
        i8 i8Var = (i8) getLayoutParams();
        if (this.NCTxEWno && i8Var.NCTxEWno == i) {
            return;
        }
        i8Var.NCTxEWno = i;
        setLayoutParams(i8Var);
    }

    public void setGuidelinePercent(float f) {
        i8 i8Var = (i8) getLayoutParams();
        if (this.NCTxEWno && i8Var.MdtA4re8 == f) {
            return;
        }
        i8Var.MdtA4re8 = f;
        setLayoutParams(i8Var);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
